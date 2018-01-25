/* --------------------------------------------------------------------------------------------------------------------
 * AbstractParameter.java
 * Copyright (c) 2018 RHEA System S.A.
 *
 * This is an auto-generated POJO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.engineeringmodeldata;

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

/**
 * representation of a parameter that defines a characteristic or property of an ElementDefinition
 * Note 1: The concurrent engineering process is centered around a multi-disciplinary parametric definition of the system of interest. Parameters (with values) assigned to ElementDefinitions, ElementUsages and possibly NestedElements are the essential mechanism by which each DomainOfExpertise characterises, quantifies, communicates and shares their part of a design solution with all other domains of expertise (DomainOfExpertise).
 * Note 2: The associated ParameterType (through the parameterType property) provides name, shortName, and optionally alias, definition and hyperLink for this Parameter.
 */
@Container(clazz = ElementDefinition.class, propertyName = "parameter")
public abstract class AbstractParameter extends AbstractParameterOrOverrideBase  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.N_O_N_E;

    /**
     * Initializes a new instance of the <code>Parameter<code/> class.
     *
     * @see Parameter
     */
    public AbstractParameter() {
        this.valueSet = new ContainerList<ParameterValueSet>(this);
    }

    /**
     * Initializes a new instance of the <code>Parameter<code/> class.
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
     * @see Parameter
     */
    public AbstractParameter(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.valueSet = new ContainerList<ParameterValueSet>(this);
    }

    /**
     * Value indicating whether allowDifferentOwnerOfOverride.
     * assertion whether a ParameterOverride associated with this Parameter may have a different owner DomainOfExpertise or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean allowDifferentOwnerOfOverride;

    /**
     * Value indicating whether expectsOverride.
     * assertion whether a ParameterOverride is expected for this Parameter in ElementUsages of the ElementDefinition that contains this Parameter
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean expectsOverride;

    /**
     * Property requestedBy.
     * optional reference to the DomainOfExpertise that has requested this Parameter
     * Note: This property is used to signify that a Parameter has not been created (i.e. added to an ElementDefinition) by the owner DomainOfExpertise by is requested by a different DomainOfExpertise. When the value is unset (i.e. set to null) it signifies that the Parameter has been accepted by the owner DomainOfExpertise.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private DomainOfExpertise requestedBy;

    /**
     * List of contained ParameterValueSet.
     * representation of the switch and values of this Parameter
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ParameterValueSet> valueSet;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>Parameter<code/>.
     *
     * @see Iterable
     * @see Parameter
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a value indicating whether allowDifferentOwnerOfOverride.
     * assertion whether a ParameterOverride associated with this Parameter may have a different owner DomainOfExpertise or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getAllowDifferentOwnerOfOverride(){
         return this.allowDifferentOwnerOfOverride;
    }

    /**
     * Gets a value indicating whether expectsOverride.
     * assertion whether a ParameterOverride is expected for this Parameter in ElementUsages of the ElementDefinition that contains this Parameter
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getExpectsOverride(){
         return this.expectsOverride;
    }

    /**
     * Gets the requestedBy.
     * optional reference to the DomainOfExpertise that has requested this Parameter
     * Note: This property is used to signify that a Parameter has not been created (i.e. added to an ElementDefinition) by the owner DomainOfExpertise by is requested by a different DomainOfExpertise. When the value is unset (i.e. set to null) it signifies that the Parameter has been accepted by the owner DomainOfExpertise.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public DomainOfExpertise getRequestedBy(){
         return this.requestedBy;
    }

    /**
     * Gets a list of contained ParameterValueSet.
     * representation of the switch and values of this Parameter
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ParameterValueSet> getValueSet(){
         return this.valueSet;
    }

    /**
     *Sets a value indicating whether allowDifferentOwnerOfOverride.
     * assertion whether a ParameterOverride associated with this Parameter may have a different owner DomainOfExpertise or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setAllowDifferentOwnerOfOverride(boolean allowDifferentOwnerOfOverride){
        this.allowDifferentOwnerOfOverride = allowDifferentOwnerOfOverride;
    }

    /**
     *Sets a value indicating whether expectsOverride.
     * assertion whether a ParameterOverride is expected for this Parameter in ElementUsages of the ElementDefinition that contains this Parameter
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setExpectsOverride(boolean expectsOverride){
        this.expectsOverride = expectsOverride;
    }

    /**
     * Sets the requestedBy.
     * optional reference to the DomainOfExpertise that has requested this Parameter
     * Note: This property is used to signify that a Parameter has not been created (i.e. added to an ElementDefinition) by the owner DomainOfExpertise by is requested by a different DomainOfExpertise. When the value is unset (i.e. set to null) it signifies that the Parameter has been accepted by the owner DomainOfExpertise.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setRequestedBy(DomainOfExpertise requestedBy){
        this.requestedBy = requestedBy;
    }

    /**
     * Sets a list of contained ParameterValueSet.
     * representation of the switch and values of this Parameter
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setValueSet(ContainerList<ParameterValueSet> valueSet){
        this.valueSet = valueSet;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>Parameter<code/>.
     *
     * @see Iterable
     * @see Parameter
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.valueSet);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>Parameter<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Parameter<code/>.
     *
     * @see Parameter
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        Parameter clone = (Parameter)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setParameterSubscription(cloneContainedThings ? new ContainerList<ParameterSubscription>(clone) : new ContainerList<ParameterSubscription>(this.parameterSubscription, clone));
        clone.setValueSet(cloneContainedThings ? new ContainerList<ParameterValueSet>(clone) : new ContainerList<ParameterValueSet>(this.valueSet, clone));

        if (cloneContainedThings) {
            clone.getParameterSubscription().addAll(this.parameterSubscription.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getValueSet().addAll(this.valueSet.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>Parameter<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Parameter<code/>.
     * 
     * @see Parameter
     */
    @Override
    public Parameter clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Parameter)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>Parameter<code/>.
     *
     * @return A list of potential errors.
     *
     * @see Parameter
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int valueSetCount = this.valueSet.size();
        if (valueSetCount < 1) {
            errorList.add("The number of elements in the property valueSet is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>Parameter<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see Parameter
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Parameter dto = (cdp4common.dto.Parameter)dtoThing;

        this.allowDifferentOwnerOfOverride = dto.getAllowDifferentOwnerOfOverride();
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.expectsOverride = dto.getExpectsOverride();
        this.group = (dto.getGroup() != null) ? this.cache.get<ParameterGroup>(dto.getGroup.getValue(), dto.getIterationContainerId()) : null;
        this.isOptionDependent = dto.getIsOptionDependent();
        this.modifiedOn = dto.getModifiedOn();
        this.owner = this.cache.get<DomainOfExpertise>(dto.getOwner(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>();
        this.parameterSubscription.resolveList(dto.getParameterSubscription(), dto.getIterationContainerId(), this.cache);
        this.parameterType = this.cache.get<ParameterType>(dto.getParameterType(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<ParameterType>();
        this.requestedBy = (dto.getRequestedBy() != null) ? this.cache.get<DomainOfExpertise>(dto.getRequestedBy.getValue(), dto.getIterationContainerId()) : null;
        this.revisionNumber = dto.getRevisionNumber();
        this.scale = (dto.getScale() != null) ? this.cache.get<MeasurementScale>(dto.getScale.getValue(), dto.getIterationContainerId()) : null;
        this.stateDependence = (dto.getStateDependence() != null) ? this.cache.get<ActualFiniteStateList>(dto.getStateDependence.getValue(), dto.getIterationContainerId()) : null;
        this.valueSet.resolveList(dto.getValueSet(), dto.getIterationContainerId(), this.cache);

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>Parameter<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see Parameter
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Parameter dto = new cdp4common.dto.Parameter(this.iid, this.revisionNumber);

        dto.setAllowDifferentOwnerOfOverride(this.allowDifferentOwnerOfOverride);
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setExpectsOverride(this.expectsOverride);
        dto.setGroup(this.group != null ? (UUID)this.group.getIid() : null);
        dto.setIsOptionDependent(this.isOptionDependent);
        dto.setModifiedOn(this.modifiedOn);
        dto.setOwner(this.owner != null ? this.owner.getIid() : new UUID(0L, 0L));
        dto.getParameterSubscription().add(this.parameterSubscription.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setParameterType(this.parameterType != null ? this.parameterType.getIid() : new UUID(0L, 0L));
        dto.setRequestedBy(this.requestedBy != null ? (UUID)this.requestedBy.getIid() : null);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setScale(this.scale != null ? (UUID)this.scale.getIid() : null);
        dto.setStateDependence(this.stateDependence != null ? (UUID)this.stateDependence.getIid() : null);
        dto.getValueSet().add(this.valueSet.stream().map(x -> x.Iid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
