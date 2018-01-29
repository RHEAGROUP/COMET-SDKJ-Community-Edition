/* --------------------------------------------------------------------------------------------------------------------
 * AbstractQuantityKindFactor.java
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
 * representation of a QuantityKind and an exponent that together define one factor in a product of powers of QuantityKinds
 */
@Container(clazz = DerivedQuantityKind.class, propertyName = "quantityKindFactor")
@ToString
@EqualsAndHashCode
public  class QuantityKindFactor extends Thing  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the <code>QuantityKindFactor<code/> class.
     *
     * @see QuantityKindFactor
     */
    public QuantityKindFactor() {
    }

    /**
     * Initializes a new instance of the <code>QuantityKindFactor<code/> class.
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
     * @see QuantityKindFactor
     */
    public QuantityKindFactor(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
    }

    /**
     * Property exponent.
     * definition of the relevant exponent
     * Note: The exponent does not need to be an integer number. There exist cases where fractional exponents are needed.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String exponent;

    /**
     * Property quantityKind.
     * reference to the relevant QuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private QuantityKind quantityKind;

    /**
     * Gets the exponent.
     * definition of the relevant exponent
     * Note: The exponent does not need to be an integer number. There exist cases where fractional exponents are needed.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getExponent(){
         return this.exponent;
    }

    /**
     * Gets the quantityKind.
     * reference to the relevant QuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public QuantityKind getQuantityKind(){
         return this.quantityKind;
    }

    /**
     * Sets the exponent.
     * definition of the relevant exponent
     * Note: The exponent does not need to be an integer number. There exist cases where fractional exponents are needed.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setExponent(String exponent){
        this.exponent = exponent;
    }

    /**
     * Sets the quantityKind.
     * reference to the relevant QuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setQuantityKind(QuantityKind quantityKind){
        this.quantityKind = quantityKind;
    }

    /**
     * Creates and returns a copy of this <code>QuantityKindFactor<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>QuantityKindFactor<code/>.
     *
     * @see QuantityKindFactor
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        QuantityKindFactor clone = (QuantityKindFactor)this.clone();
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new List<Person>(this.getExcludedPerson()));

        if (cloneContainedThings) {
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>QuantityKindFactor<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>QuantityKindFactor<code/>.
     * 
     * @see QuantityKindFactor
     */
    @Override
    public QuantityKindFactor clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (QuantityKindFactor)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>QuantityKindFactor<code/>.
     *
     * @return A list of potential errors.
     *
     * @see QuantityKindFactor
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getExponent().trim().isEmpty()) {
            errorList.add("The property exponent is null or empty.");
        }

        if (this.getQuantityKind() == null || this.getQuantityKind().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property quantityKind is null.");
            this.setQuantityKind(SentinelThingProvider.getSentinel<QuantityKind>());
            this.sentinelResetMap["quantityKind"] = () -> this.setQuantityKind(null);
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>QuantityKindFactor<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see QuantityKindFactor
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.QuantityKindFactor dto = (cdp4common.dto.QuantityKindFactor)dtoThing;

        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setExponent(dto.getExponent());
        this.setModifiedOn(dto.getModifiedOn());
        this.setQuantityKind(this.cache.get<QuantityKind>(dto.getQuantityKind(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<QuantityKind>());
        this.setRevisionNumber(dto.getRevisionNumber());

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>QuantityKindFactor<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see QuantityKindFactor
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.QuantityKindFactor dto = new cdp4common.dto.QuantityKindFactor(this.getIid(), this.getRevisionNumber());

        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setExponent(this.getExponent());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setQuantityKind(this.getQuantityKind() != null ? this.getQuantityKind().getIid() : new UUID(0L, 0L));
        dto.setRevisionNumber(this.getRevisionNumber());

        dto.setIterationContainerId(this.getCacheId().getItem2());
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}