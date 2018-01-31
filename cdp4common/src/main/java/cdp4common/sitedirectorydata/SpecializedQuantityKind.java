/* --------------------------------------------------------------------------------------------------------------------
 * AbstractSpecializedQuantityKind.java
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
import org.ehcache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

/**
 * specialization of QuantityKind that represents a kind of quantity that
 * is a specialization of another kind of quantity
 * Example: The kinds of quantity "distance", "width", "depth", "radius"
 * and "wavelength" can all be specified as specializations of the "length"
 * SimpleQuantityKind.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
@ToString
@EqualsAndHashCode
public  class SpecializedQuantityKind extends QuantityKind implements Cloneable {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    @Getter
    private final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_SUPERCLASS;

    /**
     * Initializes a new instance of the {@link SpecializedQuantityKind} class.
     */
    public SpecializedQuantityKind() {
    }

    /**
     * Initializes a new instance of the {@link SpecializedQuantityKind} class.
     * @param iid The unique identifier.
     * @param cache The {@link Cache} where the current thing is stored.
     * The {@link Pair} of {@link UUID} is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its {@link Iteration} container if applicable or null.
     * @param iDalUri The {@link URI} of this thing
     */
    public SpecializedQuantityKind(UUID iid, Cache<Pair<UUID, UUID>, Thing> cache, URI iDalUri) {
    }

    /**
     * Property general.
     * reference to the general QuantityKind that this SpecializedQuantityKind is a specialization of
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private QuantityKind general;

    /**
     * Gets the general.
     * reference to the general QuantityKind that this SpecializedQuantityKind is a specialization of
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public QuantityKind getGeneral(){
         return this.general;
    }

    /**
     * Sets the general.
     * reference to the general QuantityKind that this SpecializedQuantityKind is a specialization of
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setGeneral(QuantityKind general){
        this.general = general;
    }

    /**
     * Creates and returns a copy of this {@link SpecializedQuantityKind} for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link SpecializedQuantityKind}.
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) {
        SpecializedQuantityKind clone;
        try {
            clone = (SpecializedQuantityKind)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new IllegalAccessError("Somehow SpecializedQuantityKind cannot be cloned.");
        }

        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.getAlias(), clone));
        clone.setCategory(new ArrayList<Category>(this.getCategory()));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.getDefinition(), clone));
        clone.setExcludedDomain(new ArrayList<DomainOfExpertise>(this.getExcludedDomain()));
        clone.setExcludedPerson(new ArrayList<Person>(this.getExcludedPerson()));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.getHyperLink(), clone));
        clone.setPossibleScale(new ArrayList<MeasurementScale>(this.getPossibleScale()));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.getAlias().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.getDefinition().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.getHyperLink().stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.resetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this {@link SpecializedQuantityKind} for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained {@link Thing}s should be cloned or not.
     *
     * @return A cloned instance of {@link SpecializedQuantityKind}.
     */
    @Override
    public SpecializedQuantityKind clone(boolean cloneContainedThings) {
        this.setChangeKind(ChangeKind.UPDATE);

        return (SpecializedQuantityKind)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>SpecializedQuantityKind}.
     *
     * @return A list of potential errors.
     */
    protected List<String> validatePojoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getGeneral() == null || this.getGeneral().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property general is null.");
            this.setGeneral(SentinelThingProvider.getSentinel<QuantityKind>());
            this.sentinelResetMap.put("general", new ActionImpl(() -> this.setGeneral(null)));
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current {@link SpecializedQuantityKind} from its {@link cdp4common.dto.Thing} counter-part
     *
     * @param dtoThing The source {@link cdp4common.dto.Thing}
     */
    @Override
    public void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.SpecializedQuantityKind dto = (cdp4common.dto.SpecializedQuantityKind)dtoThing;

        this.getAlias().resolveList(dto.getAlias(), dto.getIterationContainerId(), this.getCache());
        this.getCategory().resolveList(dto.getCategory(), dto.getIterationContainerId(), this.getCache());
        this.setDefaultScale(this.getCache().get<MeasurementScale>(dto.getDefaultScale(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<MeasurementScale>());
        this.getDefinition().resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedDomain().resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.getCache());
        this.getExcludedPerson().resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.getCache());
        this.setGeneral(this.getCache().get<QuantityKind>(dto.getGeneral(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<QuantityKind>());
        this.getHyperLink().resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.getCache());
        this.setDeprecated(dto.getDeprecated());
        this.setModifiedOn(dto.getModifiedOn());
        this.setName(dto.getName());
        this.getPossibleScale().resolveList(dto.getPossibleScale(), dto.getIterationContainerId(), this.getCache());
        this.setQuantityDimensionSymbol(dto.getQuantityDimensionSymbol());
        this.setRevisionNumber(dto.getRevisionNumber());
        this.setShortName(dto.getShortName());
        this.setSymbol(dto.getSymbol());

        this.resolveExtraProperties();
    }

    /**
     * Generates a {@link cdp4common.dto.Thing} from the current {@link SpecializedQuantityKind}
     *
     * @return Generated {@link cdp4common.dto.Thing}
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.SpecializedQuantityKind dto = new cdp4common.dto.SpecializedQuantityKind(this.getIid(), this.getRevisionNumber());

        dto.getAlias().add(this.getAlias().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getCategory().add(this.getCategory().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setDefaultScale(this.getDefaultScale() != null ? this.getDefaultScale().getIid() : new UUID(0L, 0L));
        dto.getDefinition().add(this.getDefinition().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.getExcludedDomain().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.getExcludedPerson().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setGeneral(this.getGeneral() != null ? this.getGeneral().getIid() : new UUID(0L, 0L));
        dto.getHyperLink().add(this.getHyperLink().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setDeprecated(this.getDeprecated());
        dto.setModifiedOn(this.getModifiedOn());
        dto.setName(this.getName());
        dto.getPossibleScale().add(this.getPossibleScale().stream().map(x -> x.getIid()).collect(Collectors.toList()));
        dto.setQuantityDimensionSymbol(this.getQuantityDimensionSymbol());
        dto.setRevisionNumber(this.getRevisionNumber());
        dto.setShortName(this.getShortName());
        dto.setSymbol(this.getSymbol());

        dto.setIterationContainerId(this.getCacheId().getRight());
        dto.registerSourceThing(this);
        this.buildDtoPartialRoutes(dto);

        return dto;
    }
}
