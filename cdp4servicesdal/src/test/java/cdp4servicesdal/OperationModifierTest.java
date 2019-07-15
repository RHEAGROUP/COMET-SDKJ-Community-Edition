/*
 * OperationModifierTest.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package cdp4servicesdal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import cdp4common.engineeringmodeldata.ActualFiniteState;
import cdp4common.engineeringmodeldata.ActualFiniteStateKind;
import cdp4common.engineeringmodeldata.ActualFiniteStateList;
import cdp4common.engineeringmodeldata.EngineeringModel;
import cdp4common.engineeringmodeldata.Iteration;
import cdp4common.engineeringmodeldata.PossibleFiniteState;
import cdp4common.engineeringmodeldata.PossibleFiniteStateList;
import cdp4common.types.CacheKey;
import cdp4dal.Assembler;
import cdp4dal.Session;
import cdp4dal.operations.Operation;
import cdp4dal.operations.OperationContainer;
import cdp4dal.operations.OperationKind;
import cdp4dal.operations.TransactionContextResolver;
import java.net.URI;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OperationModifierTest {

  private URI uri = URI.create("https://cdp4services-.rheagroup.com");
  private Session session;
  private Assembler assembler;

  @BeforeEach
  void setup() {
    this.session = mock(Session.class);
    this.assembler = new Assembler(this.uri);
    when(this.session.getAssembler()).thenReturn(this.assembler);
  }

  @Test
  void verifyThatNoOperationAdded() {
    var domain1 = new cdp4common.sitedirectorydata.DomainOfExpertise(UUID.randomUUID(),
        this.assembler.getCache(),
        this.uri);
    var domain2 = new cdp4common.sitedirectorydata.DomainOfExpertise(UUID.randomUUID(),
        this.assembler.getCache(),
        this.uri);
    var model = new cdp4common.engineeringmodeldata.EngineeringModel(UUID.randomUUID(),
        this.assembler.getCache(), this.uri);
    var iteration = new cdp4common.engineeringmodeldata.Iteration(UUID.randomUUID(),
        this.assembler.getCache(), this.uri);
    var elementDef = new cdp4common.engineeringmodeldata.ElementDefinition(UUID.randomUUID(),
        this.assembler.getCache(),
        this.uri);
    elementDef.setOwner(domain1);
    var defForUsage = new cdp4common.engineeringmodeldata.ElementDefinition(UUID.randomUUID(),
        this.assembler.getCache(),
        this.uri);
    defForUsage.setOwner(domain1);
    var usage = new cdp4common.engineeringmodeldata.ElementUsage(UUID.randomUUID(),
        this.assembler.getCache(), this.uri);
    usage.setElementDefinition(defForUsage);
    var parameter = new cdp4common.engineeringmodeldata.Parameter(UUID.randomUUID(),
        this.assembler.getCache(), this.uri);
    parameter.setOwner(domain1);
    var parameterSubscription = new cdp4common.engineeringmodeldata.ParameterSubscription(
        UUID.randomUUID(),
        this.assembler.getCache(), this.uri);
    parameterSubscription.setOwner(domain2);
    parameter.getParameterSubscription().add(parameterSubscription);

    var parameterOverride = new cdp4common.engineeringmodeldata.ParameterOverride(UUID.randomUUID(),
        this.assembler.getCache(), this.uri);
    parameterOverride.setOwner(domain1);
    parameterOverride.setParameter(parameter);
    usage.getParameterOverride().add(parameterOverride);

    model.getIteration().add(iteration);
    iteration.getElement().add(elementDef);
    iteration.getElement().add(defForUsage);
    elementDef.getContainedElement().add(usage);
    defForUsage.getParameter().add(parameter);

    var transactionContext = TransactionContextResolver.resolveContext(iteration);
    var context = transactionContext.getContextRoute();

    var operationContainer = new OperationContainer(context, model.getRevisionNumber());
    operationContainer
        .addOperation(new Operation(null, parameterOverride.toDto(), OperationKind.CREATE));

    var modifier = new OperationModifier(this.session);
    modifier.modifyOperationContainer(operationContainer);

    assertEquals(1, operationContainer.getOperations().size());
  }

  @Test
  void verifyThatActualFiniteStateKindIsUpdatedOnNewDefault() {
    var model = new EngineeringModel(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    var iteration = new Iteration(UUID.randomUUID(), this.assembler.getCache(), this.uri);

    var possibleList1 = new PossibleFiniteStateList(UUID.randomUUID(), this.assembler.getCache(),
        this.uri);
    var possibleList2 = new PossibleFiniteStateList(UUID.randomUUID(), this.assembler.getCache(),
        this.uri);
    var possibleList3 = new PossibleFiniteStateList(UUID.randomUUID(), this.assembler.getCache(),
        this.uri);

    var ps11 = new PossibleFiniteState(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    var ps12 = new PossibleFiniteState(UUID.randomUUID(), this.assembler.getCache(), this.uri);

    var ps21 = new PossibleFiniteState(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    var ps22 = new PossibleFiniteState(UUID.randomUUID(), this.assembler.getCache(), this.uri);

    var ps31 = new PossibleFiniteState(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    var ps32 = new PossibleFiniteState(UUID.randomUUID(), this.assembler.getCache(), this.uri);

    possibleList1.getPossibleState().add(ps11);
    possibleList1.getPossibleState().add(ps12);
    possibleList2.getPossibleState().add(ps21);
    possibleList2.getPossibleState().add(ps22);
    possibleList3.getPossibleState().add(ps31);
    possibleList3.getPossibleState().add(ps32);

    var actualList1 = new ActualFiniteStateList(UUID.randomUUID(), this.assembler.getCache(),
        this.uri);
    var actualList2 = new ActualFiniteStateList(UUID.randomUUID(), this.assembler.getCache(),
        this.uri);

    actualList1.getPossibleFiniteStateList().add(possibleList1);
    actualList1.getPossibleFiniteStateList().add(possibleList2);
    var as11 = new ActualFiniteState(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    as11.getPossibleState().add(ps11);
    as11.getPossibleState().add(ps21);
    var as12 = new ActualFiniteState(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    as12.getPossibleState().add(ps11);
    as12.getPossibleState().add(ps22);
    var as13 = new ActualFiniteState(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    as13.getPossibleState().add(ps12);
    as13.getPossibleState().add(ps21);
    var as14 = new ActualFiniteState(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    as14.getPossibleState().add(ps12);
    as14.getPossibleState().add(ps22);

    actualList1.getActualState().add(as11);
    actualList1.getActualState().add(as12);
    actualList1.getActualState().add(as13);
    actualList1.getActualState().add(as14);

    actualList2.getPossibleFiniteStateList().add(possibleList2);
    actualList2.getPossibleFiniteStateList().add(possibleList3);
    var as21 = new ActualFiniteState(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    as21.getPossibleState().add(ps21);
    as21.getPossibleState().add(ps31);
    var as22 = new ActualFiniteState(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    as22.getPossibleState().add(ps21);
    as22.getPossibleState().add(ps32);
    var as23 = new ActualFiniteState(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    as23.getPossibleState().add(ps22);
    as23.getPossibleState().add(ps31);
    var as24 = new ActualFiniteState(UUID.randomUUID(), this.assembler.getCache(), this.uri);
    as24.getPossibleState().add(ps22);
    as24.getPossibleState().add(ps32);

    actualList2.getActualState().add(as21);
    actualList2.getActualState().add(as22);
    actualList2.getActualState().add(as23);
    actualList2.getActualState().add(as24);

    model.getIteration().add(iteration);
    iteration.getPossibleFiniteStateList().add(possibleList1);
    iteration.getPossibleFiniteStateList().add(possibleList2);
    iteration.getPossibleFiniteStateList().add(possibleList3);
    iteration.getActualFiniteStateList().add(actualList1);
    iteration.getActualFiniteStateList().add(actualList2);

    this.assembler.getCache().put(new CacheKey(model.getIid(), null), model);
    this.assembler.getCache().put(new CacheKey(iteration.getIid(), null), iteration);
    this.assembler.getCache()
        .put(new CacheKey(possibleList1.getIid(), iteration.getIid()), possibleList1);
    this.assembler.getCache()
        .put(new CacheKey(possibleList2.getIid(), iteration.getIid()), possibleList2);
    this.assembler.getCache()
        .put(new CacheKey(possibleList3.getIid(), iteration.getIid()), possibleList3);
    this.assembler.getCache().put(new CacheKey(ps11.getIid(), iteration.getIid()), ps11);
    this.assembler.getCache().put(new CacheKey(ps12.getIid(), iteration.getIid()), ps12);
    this.assembler.getCache().put(new CacheKey(ps21.getIid(), iteration.getIid()), ps21);
    this.assembler.getCache().put(new CacheKey(ps22.getIid(), iteration.getIid()), ps22);
    this.assembler.getCache().put(new CacheKey(ps31.getIid(), iteration.getIid()), ps31);
    this.assembler.getCache().put(new CacheKey(ps32.getIid(), iteration.getIid()), ps32);
    this.assembler.getCache()
        .put(new CacheKey(actualList1.getIid(), iteration.getIid()), actualList1);
    this.assembler.getCache()
        .put(new CacheKey(actualList2.getIid(), iteration.getIid()), actualList2);
    this.assembler.getCache().put(new CacheKey(as11.getIid(), iteration.getIid()), as11);
    this.assembler.getCache().put(new CacheKey(as12.getIid(), iteration.getIid()), as12);
    this.assembler.getCache().put(new CacheKey(as13.getIid(), iteration.getIid()), as13);
    this.assembler.getCache().put(new CacheKey(as14.getIid(), iteration.getIid()), as14);
    this.assembler.getCache().put(new CacheKey(as21.getIid(), iteration.getIid()), as21);
    this.assembler.getCache().put(new CacheKey(as22.getIid(), iteration.getIid()), as22);
    this.assembler.getCache().put(new CacheKey(as23.getIid(), iteration.getIid()), as23);
    this.assembler.getCache().put(new CacheKey(as24.getIid(), iteration.getIid()), as24);

    possibleList1.setDefaultState(ps11);
    as11.setKind(ActualFiniteStateKind.FORBIDDEN);

    var transactionContext = TransactionContextResolver.resolveContext(iteration);
    var context = transactionContext.getContextRoute();

    var operationContainer = new OperationContainer(context, model.getRevisionNumber());

    var original = possibleList2.toDto();
    var modify = (cdp4common.dto.PossibleFiniteStateList) possibleList2.toDto();
    modify.setDefaultState(ps21.getIid());

    operationContainer.addOperation(new Operation(original, modify, OperationKind.UPDATE));

    assertEquals(1, operationContainer.getOperations().size());

    var modifier = new OperationModifier(this.session);
    modifier.modifyOperationContainer(operationContainer);

    assertEquals(2, operationContainer.getOperations().size());
    var addedOperation = operationContainer.getOperations()
        .get(operationContainer.getOperations().size() - 1);
    var originalActualState = (cdp4common.dto.ActualFiniteState) addedOperation.getOriginalThing();
    var modifiedActualState = (cdp4common.dto.ActualFiniteState) addedOperation.getModifiedThing();

    assertEquals(as11.getIid(), originalActualState.getIid());
    assertEquals(ActualFiniteStateKind.MANDATORY, modifiedActualState.getKind());
    assertEquals(ActualFiniteStateKind.FORBIDDEN, originalActualState.getKind());
  }
}
