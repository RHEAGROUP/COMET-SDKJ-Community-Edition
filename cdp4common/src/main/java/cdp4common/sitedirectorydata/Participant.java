/* --------------------------------------------------------------------------------------------------------------------
 * AbstractParticipant.java
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
 * representation of a participant in the team working in a concurrent engineering activity on an EngineeringModel
 */
@Container(clazz = EngineeringModelSetup.class, propertyName = "participant")
@ToString
@EqualsAndHashCode
public  class Participant extends Thing implements ParticipantAffectedAccessThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NONE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the <code>Participant<code/> class.
     *
     * @see Participant
     */
    public Participant() {
        this.domain = new ArrayList<DomainOfExpertise>();
    }

    /**
     * Initializes a new instance of the <code>Participant<code/> class.
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
     * @see Participant
     */
    public Participant(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.domain = new ArrayList<DomainOfExpertise>();
    }

    /**
     * List of DomainOfExpertise.
     * references to the domains of expertise (set of DomainOfExpertise) that this Participant may represent
     * Note: At any moment in a session in an E-TM-10-25 compliant environment a Participant is actively representing one DomainOfExpertise only, see the <i>selectedDomain</i> property. If more than one DomainOfExpertise is specified, he or she may select any of those DomainOfExpertises to switch to, at any time during the session.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ArrayList<DomainOfExpertise> domain;

    /**
     * Value indicating whether isActive.
     * assertion whether this Participant is active in the current
     * EngineeringModel
     * Note: This allows to set Participants that already started as member of a
     * concurrent engineering team in an inactive role. Once created a
     * Participant cannot be deleted without precautions because this may render
     * earlier created data incomplete.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isActive;

    /**
     * Property person.
     * reference to the Person that is this Participant
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Person person;

    /**
     * Property role.
     * reference to the ParticipantRole assigned to this Participant
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ParticipantRole role;

    /**
     * Property selectedDomain.
     * active DomainOfExpertise selected by this Participant
     * Note: The selectedDomain must be one from the set of DomainOfExpertise specified in the <i>domain</i> property of this Participant.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private DomainOfExpertise selectedDomain;

    /**
     * Gets a list of DomainOfExpertise.
     * references to the domains of expertise (set of DomainOfExpertise) that this Participant may represent
     * Note: At any moment in a session in an E-TM-10-25 compliant environment a Participant is actively representing one DomainOfExpertise only, see the <i>selectedDomain</i> property. If more than one DomainOfExpertise is specified, he or she may select any of those DomainOfExpertises to switch to, at any time during the session.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ArrayList<DomainOfExpertise> getDomain(){
         return this.domain;
    }

    /**
     * Gets a value indicating whether isActive.
     * assertion whether this Participant is active in the current
     * EngineeringModel
     * Note: This allows to set Participants that already started as member of a
     * concurrent engineering team in an inactive role. Once created a
     * Participant cannot be deleted without precautions because this may render
     * earlier created data incomplete.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getActive(){
         return this.isActive;
    }

    /**
     * Gets the person.
     * reference to the Person that is this Participant
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Person getPerson(){
         return this.person;
    }

    /**
     * Gets the role.
     * reference to the ParticipantRole assigned to this Participant
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ParticipantRole getRole(){
         return this.role;
    }

    /**
     * Gets the selectedDomain.
     * active DomainOfExpertise selected by this Participant
     * Note: The selectedDomain must be one from the set of DomainOfExpertise specified in the <i>domain</i> property of this Participant.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public DomainOfExpertise getSelectedDomain(){
         return this.selectedDomain;
    }

    /**
     * Sets a list of DomainOfExpertise.
     * references to the domains of expertise (set of DomainOfExpertise) that this Participant may represent
     * Note: At any moment in a session in an E-TM-10-25 compliant environment a Participant is actively representing one DomainOfExpertise only, see the <i>selectedDomain</i> property. If more than one DomainOfExpertise is specified, he or she may select any of those DomainOfExpertises to switch to, at any time during the session.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDomain(ArrayList<DomainOfExpertise> domain){
        this.domain = domain;
    }

    /**
     *Sets a value indicating whether isActive.
     * assertion whether this Participant is active in the current
     * EngineeringModel
     * Note: This allows to set Participants that already started as member of a
     * concurrent engineering team in an inactive role. Once created a
     * Participant cannot be deleted without precautions because this may render
     * earlier created data incomplete.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setActive(boolean isActive){
        this.isActive = isActive;
    }

    /**
     * Sets the person.
     * reference to the Person that is this Participant
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setPerson(Person person){
        this.person = person;
    }

    /**
     * Sets the role.
     * reference to the ParticipantRole assigned to this Participant
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setRole(ParticipantRole role){
        this.role = role;
    }

    /**
     * Sets the selectedDomain.
     * active DomainOfExpertise selected by this Participant
     * Note: The selectedDomain must be one from the set of DomainOfExpertise specified in the <i>domain</i> property of this Participant.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setSelectedDomain(DomainOfExpertise selectedDomain){
        this.selectedDomain = selectedDomain;
    }

    /**
     * Creates and returns a copy of this <code>Participant<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Participant<code/>.
     *
     * @see Participant
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        Participant clone = (Participant)this.clone();
        clone.setDomain(new List<DomainOfExpertise>(this.getDomain()));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>Participant<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>Participant<code/>.
     * 
     * @see Participant
     */
    @Override
    public Participant clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (Participant)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>Participant<code/>.
     *
     * @return A list of potential errors.
     *
     * @see Participant
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        int domainCount = this.getDomain().size();
        if (domainCount < 1) {
            errorList.add("The number of elements in the property domain is wrong. It should be at least 1.");
        }

        if (this.getPerson() == null || this.getPerson().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property person is null.");
            this.setPerson(SentinelThingProvider.getSentinel<Person>());
            this.sentinelResetMap["person"] = () -> this.setPerson(null);
        }

        if (this.getRole() == null || this.getRole().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property role is null.");
            this.setRole(SentinelThingProvider.getSentinel<ParticipantRole>());
            this.sentinelResetMap["role"] = () -> this.setRole(null);
        }

        if (this.getSelectedDomain() == null || this.getSelectedDomain().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property selectedDomain is null.");
            this.setSelectedDomain(SentinelThingProvider.getSentinel<DomainOfExpertise>());
            this.sentinelResetMap["selectedDomain"] = () -> this.setSelectedDomain(null);
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>Participant<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see Participant
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.Participant dto = (cdp4common.dto.Participant)dtoThing;

        this.domain.resolveList(dto.getDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setIsActive(dto.getIsActive());
        this.setModifiedOn(dto.getModifiedOn());
        this.setPerson(this.cache.get<Person>(dto.getPerson(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Person>());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setRole(this.cache.get<ParticipantRole>(dto.getRole(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<ParticipantRole>());
        this.setSelectedDomain(this.cache.get<DomainOfExpertise>(dto.getSelectedDomain(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<DomainOfExpertise>());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>Participant<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see Participant
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.Participant dto = new cdp4common.dto.Participant(this.getIid(), this.getRevisionNumber());

        dto.getDomain().add(this.getDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setIsActive(this.getIsActive());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setPerson(this.getPerson() != null ? this.getPerson().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setRole(this.getRole() != null ? this.getRole().getIid() : new UUID(0L, 0L));
        dto.setSelectedDomain(this.getSelectedDomain() != null ? this.getSelectedDomain().getIid() : new UUID(0L, 0L));

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}