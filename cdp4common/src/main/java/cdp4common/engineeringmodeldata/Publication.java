/* --------------------------------------------------------------------------------------------------------------------
 * AbstractPublication.java
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
 * representation of a saved state within an Iteration where all <i>computed</i> values of the ParameterValueSets of a selected set of Parameters and ParameterOverrides are published to (i.e. copied to) the <i>published</i> values
 * Note: The purpose of publishing Publications is to isolate all Participants that hold a ParameterSubscription on a particular Parameter or ParameterOverride from continuous (and potential disruptive) changes to the <i>computed</i> values of those ParameterSubscriptions. The <i>computed</i> values in the ParameterSubscriptionValueSets of ParameterSubscriptions are updated to the latest <i>actualValue</i> in the ParameterValueSets of the corresponding Parameter or ParameterOverride only at the point in time when a Publication takes place. This mechanism allows the owners, i.e. Participant(s) representing the owner DomainOfExpertise, of Parameters and ParameterOverrides to freely experiment with their parameter values without disrupting the other Participants.
 */
@Container(clazz = Iteration.class, propertyName = "publication")
@ToString
@EqualsAndHashCode
public  class Publication extends Thing implements TimeStampedThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NONE;

    /**
     * Initializes a new instance of the <code>Publication<code/> class.
     *
     * @see Publication
     */
    public Publication() {
        this.domain = new ArrayList<DomainOfExpertise>();
        this.publishedParameter = new ArrayList<ParameterOrOverrideBase>();
    }

    /**
     * Initializes a new instance of the <code>Publication<code/> class.
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
     * @see Publication
     */
    public Publication(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.domain = new ArrayList<DomainOfExpertise>();
        this.publishedParameter = new ArrayList<ParameterOrOverrideBase>();
    }

    /**
     * Property createdOn.
     * Note 1: This implies that any value shall comply with the following (informative) ISO 8601 format "yyyy-mm-ddThh:mm:ss.sssZ".
     * Note 2: All persistent date-and-time-stamps in this model shall be stored in UTC. When local calendar dates and clock times in a specific timezone are needed they shall be converted on the fly from and to UTC by client applications.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private LocalDateTime createdOn;

    /**
     * List of DomainOfExpertise.
     * references to the domain(s) of expertise that are the owner(s) of one or more <i>publishedParameter</i>
     * Note: When a client is sending data to the server, the presence of a DomainOfExpertise in the set signifies a request to publish all Parameters and ParameterOverrides owned by that DomainOfExpertise. Upon receipt of the result of the actual publication transaction from the server, <i>domain</i> will contain the set of actual DomainOfExpertise that had at least one ParameterValueSet of an owned Parameter or ParameterOverride published.
     * Note 2: The server will process the union of Parameters and ParameterOverrides as requested through the <i>domain </i>and <i>publishedParameter</i> properties.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ArrayList<DomainOfExpertise> domain;

    /**
     * List of ParameterOrOverrideBase.
     * references to the Parameters and ParameterOverrides published in this Publication
     * Note 1: When a client is sending data to the server, the presence of a Parameter or ParameterOverride in the set signifies a request to publish that Parameter or ParameterOverride. Upon receipt of the result of the actual publication transaction from the server, <i>publishedParameter</i> will contain the set of actual Parameters and ParameterOverrides that had at least one ParameterValueSet published.
     * Note 2: The server will process the union of Parameters and ParameterOverrides as requested through the <i>domain </i>and <i>publishedParameter</i> properties.
     * Note 3: The server will only publish Parameters and ParameterOverrides that have at least one ParameterValueSet where the <i>actualValue</i> differs from the <i>published</i> value.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ArrayList<ParameterOrOverrideBase> publishedParameter;

    /**
     * Gets the createdOn.
     * Note 1: This implies that any value shall comply with the following (informative) ISO 8601 format "yyyy-mm-ddThh:mm:ss.sssZ".
     * Note 2: All persistent date-and-time-stamps in this model shall be stored in UTC. When local calendar dates and clock times in a specific timezone are needed they shall be converted on the fly from and to UTC by client applications.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public LocalDateTime getCreatedOn(){
         return this.createdOn;
    }

    /**
     * Gets a list of DomainOfExpertise.
     * references to the domain(s) of expertise that are the owner(s) of one or more <i>publishedParameter</i>
     * Note: When a client is sending data to the server, the presence of a DomainOfExpertise in the set signifies a request to publish all Parameters and ParameterOverrides owned by that DomainOfExpertise. Upon receipt of the result of the actual publication transaction from the server, <i>domain</i> will contain the set of actual DomainOfExpertise that had at least one ParameterValueSet of an owned Parameter or ParameterOverride published.
     * Note 2: The server will process the union of Parameters and ParameterOverrides as requested through the <i>domain </i>and <i>publishedParameter</i> properties.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ArrayList<DomainOfExpertise> getDomain(){
         return this.domain;
    }

    /**
     * Gets a list of ParameterOrOverrideBase.
     * references to the Parameters and ParameterOverrides published in this Publication
     * Note 1: When a client is sending data to the server, the presence of a Parameter or ParameterOverride in the set signifies a request to publish that Parameter or ParameterOverride. Upon receipt of the result of the actual publication transaction from the server, <i>publishedParameter</i> will contain the set of actual Parameters and ParameterOverrides that had at least one ParameterValueSet published.
     * Note 2: The server will process the union of Parameters and ParameterOverrides as requested through the <i>domain </i>and <i>publishedParameter</i> properties.
     * Note 3: The server will only publish Parameters and ParameterOverrides that have at least one ParameterValueSet where the <i>actualValue</i> differs from the <i>published</i> value.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ArrayList<ParameterOrOverrideBase> getPublishedParameter(){
         return this.publishedParameter;
    }

    /**
     * Sets the createdOn.
     * Note 1: This implies that any value shall comply with the following (informative) ISO 8601 format "yyyy-mm-ddThh:mm:ss.sssZ".
     * Note 2: All persistent date-and-time-stamps in this model shall be stored in UTC. When local calendar dates and clock times in a specific timezone are needed they shall be converted on the fly from and to UTC by client applications.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setCreatedOn(LocalDateTime createdOn){
        this.createdOn = createdOn;
    }

    /**
     * Sets a list of DomainOfExpertise.
     * references to the domain(s) of expertise that are the owner(s) of one or more <i>publishedParameter</i>
     * Note: When a client is sending data to the server, the presence of a DomainOfExpertise in the set signifies a request to publish all Parameters and ParameterOverrides owned by that DomainOfExpertise. Upon receipt of the result of the actual publication transaction from the server, <i>domain</i> will contain the set of actual DomainOfExpertise that had at least one ParameterValueSet of an owned Parameter or ParameterOverride published.
     * Note 2: The server will process the union of Parameters and ParameterOverrides as requested through the <i>domain </i>and <i>publishedParameter</i> properties.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDomain(ArrayList<DomainOfExpertise> domain){
        this.domain = domain;
    }

    /**
     * Sets a list of ParameterOrOverrideBase.
     * references to the Parameters and ParameterOverrides published in this Publication
     * Note 1: When a client is sending data to the server, the presence of a Parameter or ParameterOverride in the set signifies a request to publish that Parameter or ParameterOverride. Upon receipt of the result of the actual publication transaction from the server, <i>publishedParameter</i> will contain the set of actual Parameters and ParameterOverrides that had at least one ParameterValueSet published.
     * Note 2: The server will process the union of Parameters and ParameterOverrides as requested through the <i>domain </i>and <i>publishedParameter</i> properties.
     * Note 3: The server will only publish Parameters and ParameterOverrides that have at least one ParameterValueSet where the <i>actualValue</i> differs from the <i>published</i> value.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setPublishedParameter(ArrayList<ParameterOrOverrideBase> publishedParameter){
        this.publishedParameter = publishedParameter;
    }

    /**
     * Creates and returns a copy of this <code>Publication<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Publication<code/>.
     *
     * @see Publication
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        Publication clone = (Publication)this.clone();
        clone.setDomain(new List<DomainOfExpertise>(this.getDomain()));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));
        clone.setPublishedParameter(new List<ParameterOrOverrideBase>(this.getPublishedParameter()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>Publication<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Publication<code/>.
     * 
     * @see Publication
     */
    @Override
    public Publication clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Publication)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>Publication<code/>.
     *
     * @return A list of potential errors.
     *
     * @see Publication
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>Publication<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see Publication
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Publication dto = (cdp4common.dto.Publication)dtoThing;

        this.setCreatedOn(dto.getCreatedOn());
        this.domain.resolveList(dto.getDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setModifiedOn(dto.getModifiedOn());
        this.publishedParameter.resolveList(dto.getPublishedParameter(), dto.getIterationContainerId(), this.getCache());
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>Publication<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see Publication
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Publication dto = new cdp4common.dto.Publication(this.getIid(), this.getRevisionNumber());

        dto.setCreatedOn(this.getCreatedOn());
        dto.getDomain().add(this.getDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setModifiedOn(this.getModifiedOn());
        dto.getPublishedParameter().add(this.getPublishedParameter().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}