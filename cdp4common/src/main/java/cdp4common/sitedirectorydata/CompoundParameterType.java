/* --------------------------------------------------------------------------------------------------------------------
 * AbstractCompoundParameterType.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.helpers.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import cdp4common.types.*;
import org.apache.commons.lang3.tuple.Pair;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representation of a non-scalar compound parameter type that is composed of one or more other (component) ParameterTypes
 * Note 1: The purpose of this parameter type is to allow manipulation of a set of related (usually scalar) parameters as one compound parameter for those cases where all component parameter values need to be considered together. The CompoundParameterType allows modelling parameter types similar to structured datatypes in programming languages and to vectors, matrices and tensors in mathematics and physics.
 * Note 2: The default owner DomainOfExpertises of any associated ParameterTypeComponents are ignored, only the defaultOwner of this CompoundParameterType is taken into account.
 * Example 1: An "event_occurrence" parameter type can be defined by a CompoundParameterType with a "type" and a "timestamp" component. The "type" component would be an EnumerationParameterType that enumerates a number of known event names and the "timestamp" component would be a DateTimeParameterType.
 * Example 2: A 3D Cartesian coordinate position can be defined by a CompoundParameterType (or actually an ArrayParameterType) with "x", "y" and "z" components that would each be QuantityKinds with a quantityKind "position" and a scale "mm" (for "millimetre").
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
@ToString
@EqualsAndHashCode
public  class CompoundParameterType extends ParameterType  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the <code>CompoundParameterType<code/> class.
     *
     * @see CompoundParameterType
     */
    public CompoundParameterType() {
        this.component = new OrderedItemList<ParameterTypeComponent>(this, true);
    }

    /**
     * Initializes a new instance of the <code>CompoundParameterType<code/> class.
     * @param iid The unique identifier.
     * @param cache The <code>ConcurrentHashMap<K,V></code> where the current thing is stored.
     * The <code>Pair<L,R><code/> of <code>UUID<code/> is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its <code>Iteration<code/> container if applicable or null.
     * @param iDalUri The <code>URI</code> of this thing
     *
     * @see ConcurrentHashMap
     * @see URI
     * @see UUID
     * @see Pair
     * @see Iteration
     * @see CompoundParameterType
     */
    public CompoundParameterType(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.component = new OrderedItemList<ParameterTypeComponent>(this, true);
    }

    /**
     * List of ordered contained ParameterTypeComponent.
     * representation of an individual component of this CompoundParameterType
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<ParameterTypeComponent> component;

    /**
     * Value indicating whether isFinalized.
     * assertion whether this CompoundParameterType is finalized
     * Note: Finalized means that the definition of the <i>component</i> collection of this CompoundParameterType is final and therefore may not be changed anymore. Finalization is necessary because the number of values in properties of any associated ParameterValueSets, ParameterOverrideValueSets and ParameterSubscriptionValueSets depend on the number and type of components.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isFinalized;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>CompoundParameterType<code/>.
     *
     * @see Iterable
     * @see CompoundParameterType
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of ordered contained ParameterTypeComponent.
     * representation of an individual component of this CompoundParameterType
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public OrderedItemList<ParameterTypeComponent> getComponent(){
         return this.component;
    }

    /**
     * Gets a value indicating whether isFinalized.
     * assertion whether this CompoundParameterType is finalized
     * Note: Finalized means that the definition of the <i>component</i> collection of this CompoundParameterType is final and therefore may not be changed anymore. Finalization is necessary because the number of values in properties of any associated ParameterValueSets, ParameterOverrideValueSets and ParameterSubscriptionValueSets depend on the number and type of components.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getFinalized(){
         return this.isFinalized;
    }

    /**
     * Sets a list of ordered contained ParameterTypeComponent.
     * representation of an individual component of this CompoundParameterType
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     protected void setComponent(OrderedItemList<ParameterTypeComponent> component){
        this.component = component;
    }

    /**
     *Sets a value indicating whether isFinalized.
     * assertion whether this CompoundParameterType is finalized
     * Note: Finalized means that the definition of the <i>component</i> collection of this CompoundParameterType is final and therefore may not be changed anymore. Finalization is necessary because the number of values in properties of any associated ParameterValueSets, ParameterOverrideValueSets and ParameterSubscriptionValueSets depend on the number and type of components.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setFinalized(boolean isFinalized){
        this.isFinalized = isFinalized;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>CompoundParameterType<code/>.
     *
     * @see Iterable
     * @see CompoundParameterType
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.component);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>CompoundParameterType<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>CompoundParameterType<code/>.
     *
     * @see CompoundParameterType
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        CompoundParameterType clone = (CompoundParameterType)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
        clone.setCategory(new List<Category>(this.getCategory()));
        clone.setComponent(cloneContainedThings ? new OrderedItemList<ParameterTypeComponent>(clone, true) : new OrderedItemList<ParameterTypeComponent>(this.getComponent(), clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getComponent().addAll(this.getComponent().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>CompoundParameterType<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>CompoundParameterType<code/>.
     * 
     * @see CompoundParameterType
     */
    @Override
    public CompoundParameterType clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (CompoundParameterType)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>CompoundParameterType<code/>.
     *
     * @return A list of potential errors.
     *
     * @see CompoundParameterType
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int componentCount = this.getComponent().size();
        if (componentCount < 1) {
            errorList.add("The number of elements in the property component is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>CompoundParameterType<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see CompoundParameterType
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.CompoundParameterType dto = (cdp4common.dto.CompoundParameterType)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.category.resolveList(dto.getCategory(), dto.getIterationContainerId(), this.getCache());
        this.component.resolveList(dto.getComponent(), dto.getIterationContainerId(), this.getCache());
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setIsDeprecated(dto.getIsDeprecated());
        this.setIsFinalized(dto.getIsFinalized());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.setSymbol(dto.getSymbol());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>CompoundParameterType<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see CompoundParameterType
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.CompoundParameterType dto = new cdp4common.dto.CompoundParameterType(this.getIid(), this.getRevisionNumber());

        dto.getAlias().add(this.getAlias().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getCategory().add(this.getCategory().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getComponent().add(this.getComponent().toDtoOrderedItemList());
        dto.getDefinition().add(this.getDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getHyperLink().add(this.getHyperLink().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setIsDeprecated(this.getIsDeprecated());
        dto.setIsFinalized(this.getIsFinalized());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.setSymbol(this.getSymbol());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}