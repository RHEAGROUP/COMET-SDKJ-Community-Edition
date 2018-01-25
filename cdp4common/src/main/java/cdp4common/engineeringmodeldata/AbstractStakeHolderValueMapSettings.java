/* --------------------------------------------------------------------------------------------------------------------
 * AbstractStakeHolderValueMapSettings.java
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
 * The settings of a StakeholderValueMap that capture the BinaryRelationshipRules that are used to create links between the Goals, ValueGroup, StakeholderValues and Requirements
 */
@CDPVersion(version = "1.1.0")
@Container(clazz = StakeHolderValueMap.class, propertyName = "settings")
public abstract class AbstractStakeHolderValueMapSettings extends AbstractThing  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.N_O_T__A_P_P_L_I_C_A_B_L_E;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__C_O_N_T_A_I_N_E_R;

    /**
     * Initializes a new instance of the <code>StakeHolderValueMapSettings<code/> class.
     *
     * @see StakeHolderValueMapSettings
     */
    public AbstractStakeHolderValueMapSettings() {
    }

    /**
     * Initializes a new instance of the <code>StakeHolderValueMapSettings<code/> class.
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
     * @see StakeHolderValueMapSettings
     */
    public AbstractStakeHolderValueMapSettings(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property goalToValueGroupRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private BinaryRelationshipRule goalToValueGroupRelationship;

    /**
     * Property stakeholderValueToRequirementRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private BinaryRelationshipRule stakeholderValueToRequirementRelationship;

    /**
     * Property valueGroupToStakeholderValueRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private BinaryRelationshipRule valueGroupToStakeholderValueRelationship;

    /**
     * Gets the goalToValueGroupRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public BinaryRelationshipRule getGoalToValueGroupRelationship(){
         return this.goalToValueGroupRelationship;
    }

    /**
     * Gets the stakeholderValueToRequirementRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public BinaryRelationshipRule getStakeholderValueToRequirementRelationship(){
         return this.stakeholderValueToRequirementRelationship;
    }

    /**
     * Gets the valueGroupToStakeholderValueRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public BinaryRelationshipRule getValueGroupToStakeholderValueRelationship(){
         return this.valueGroupToStakeholderValueRelationship;
    }

    /**
     * Sets the goalToValueGroupRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setGoalToValueGroupRelationship(BinaryRelationshipRule goalToValueGroupRelationship){
        this.goalToValueGroupRelationship = goalToValueGroupRelationship;
    }

    /**
     * Sets the stakeholderValueToRequirementRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setStakeholderValueToRequirementRelationship(BinaryRelationshipRule stakeholderValueToRequirementRelationship){
        this.stakeholderValueToRequirementRelationship = stakeholderValueToRequirementRelationship;
    }

    /**
     * Sets the valueGroupToStakeholderValueRelationship.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setValueGroupToStakeholderValueRelationship(BinaryRelationshipRule valueGroupToStakeholderValueRelationship){
        this.valueGroupToStakeholderValueRelationship = valueGroupToStakeholderValueRelationship;
    }

    /**
     * Creates and returns a copy of this <code>StakeHolderValueMapSettings<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>StakeHolderValueMapSettings<code/>.
     *
     * @see StakeHolderValueMapSettings
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        StakeHolderValueMapSettings clone = (StakeHolderValueMapSettings)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>StakeHolderValueMapSettings<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>StakeHolderValueMapSettings<code/>.
     * 
     * @see StakeHolderValueMapSettings
     */
    @Override
    public StakeHolderValueMapSettings clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (StakeHolderValueMapSettings)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>StakeHolderValueMapSettings<code/>.
     *
     * @return A list of potential errors.
     *
     * @see StakeHolderValueMapSettings
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>StakeHolderValueMapSettings<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see StakeHolderValueMapSettings
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.StakeHolderValueMapSettings dto = (cdp4common.dto.StakeHolderValueMapSettings)dtoThing;

        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.goalToValueGroupRelationship = (dto.getGoalToValueGroupRelationship() != null) ? this.cache.get<BinaryRelationshipRule>(dto.getGoalToValueGroupRelationship.getValue(), dto.getIterationContainerId()) : null;
        this.modifiedOn = dto.getModifiedOn();
        this.revisionNumber = dto.getRevisionNumber();
        this.stakeholderValueToRequirementRelationship = (dto.getStakeholderValueToRequirementRelationship() != null) ? this.cache.get<BinaryRelationshipRule>(dto.getStakeholderValueToRequirementRelationship.getValue(), dto.getIterationContainerId()) : null;
        this.valueGroupToStakeholderValueRelationship = (dto.getValueGroupToStakeholderValueRelationship() != null) ? this.cache.get<BinaryRelationshipRule>(dto.getValueGroupToStakeholderValueRelationship.getValue(), dto.getIterationContainerId()) : null;

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>StakeHolderValueMapSettings<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see StakeHolderValueMapSettings
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.StakeHolderValueMapSettings dto = new cdp4common.dto.StakeHolderValueMapSettings(this.iid, this.revisionNumber);

        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setGoalToValueGroupRelationship(this.goalToValueGroupRelationship != null ? (UUID)this.goalToValueGroupRelationship.getIid() : null);
        dto.setModifiedOn(this.modifiedOn);
        dto.setRevisionNumber(this.revisionNumber);
        dto.setStakeholderValueToRequirementRelationship(this.stakeholderValueToRequirementRelationship != null ? (UUID)this.stakeholderValueToRequirementRelationship.getIid() : null);
        dto.setValueGroupToStakeholderValueRelationship(this.valueGroupToStakeholderValueRelationship != null ? (UUID)this.valueGroupToStakeholderValueRelationship.getIid() : null);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
