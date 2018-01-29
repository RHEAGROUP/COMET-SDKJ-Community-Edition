/* --------------------------------------------------------------------------------------------------------------------
 * AbstractRuleViolation.java
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
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * representing of information concerning the violation of a built-in or user-defined rule
 */
@Container(clazz = RuleVerification.class, propertyName = "violation")
@ToString
@EqualsAndHashCode
public  class RuleViolation extends Thing  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the <code>RuleViolation<code/> class.
     *
     * @see RuleViolation
     */
    public RuleViolation() {
        this.violatingThing = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the <code>RuleViolation<code/> class.
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
     * @see RuleViolation
     */
    public RuleViolation(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.violatingThing = new ArrayList<UUID>();
    }

    /**
     * Property description.
     * textual explanation of the violation of the rule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String description;

    /**
     * List of UUID.
     * optional weak references to Things in the EngineeringModel that are associated with the violation of the rule verified in the containing RuleVerification
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ArrayList<UUID> violatingThing;

    /**
     * Gets the description.
     * textual explanation of the violation of the rule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getDescription(){
         return this.description;
    }

    /**
     * Gets a list of UUID.
     * optional weak references to Things in the EngineeringModel that are associated with the violation of the rule verified in the containing RuleVerification
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ArrayList<UUID> getViolatingThing(){
         return this.violatingThing;
    }

    /**
     * Sets the description.
     * textual explanation of the violation of the rule
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDescription(String description){
        this.description = description;
    }

    /**
     * Sets a list of UUID.
     * optional weak references to Things in the EngineeringModel that are associated with the violation of the rule verified in the containing RuleVerification
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setViolatingThing(ArrayList<UUID> violatingThing){
        this.violatingThing = violatingThing;
    }

    /**
     * Creates and returns a copy of this <code>RuleViolation<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>RuleViolation<code/>.
     *
     * @see RuleViolation
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        RuleViolation clone = (RuleViolation)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setViolatingThing(new List<UUID>(this.getViolatingThing()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>RuleViolation<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>RuleViolation<code/>.
     * 
     * @see RuleViolation
     */
    @Override
    public RuleViolation clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (RuleViolation)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>RuleViolation<code/>.
     *
     * @return A list of potential errors.
     *
     * @see RuleViolation
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getDescription().trim().isEmpty()) {
            errorList.add("The property description is null or empty.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>RuleViolation<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see RuleViolation
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.RuleViolation dto = (cdp4common.dto.RuleViolation)dtoThing;

        this.setDescription(dto.getDescription());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.violatingThing.clearAndAddRange(dto.getViolatingThing());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>RuleViolation<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see RuleViolation
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.RuleViolation dto = new cdp4common.dto.RuleViolation(this.getIid(), this.getRevisionNumber());

        dto.setDescription(this.getDescription());
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.getViolatingThing().add(this.getViolatingThing());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}