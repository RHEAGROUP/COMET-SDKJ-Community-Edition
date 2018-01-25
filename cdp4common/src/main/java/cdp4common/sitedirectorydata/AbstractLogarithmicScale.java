/* --------------------------------------------------------------------------------------------------------------------
 * AbstractLogarithmicScale.java
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

/**
 * representation of a logarithmic MeasurementScale
 * Note: The logarithmic ratio quantity value <i>v</i> is computed as follows: <i>v</i> = <i>f</i> · log<sub>base</sub>( (<i>x</i> / <i>x<sub>ref</sub></i> )<i><sup>a</sup></i> ), where <i>f</i> is a multiplication factor, <i>base</i> is the base of the log function, <i>x</i> is the actual quantity, <i>x<sub>ref</sub></i> is a reference quantity, and <i>a</i> is an exponent.
 * Example 1: The base 10 logarithmic measurement scale for "sound pressure level" in "decibel", with <i>factor</i> is "10", <i>exponent</i> is "2", <i>referenceQuantityKind</i> is "sound pressure" and <i>referenceQuantityValue</i>.value is "20" on the "µPa" RatioScale. Source: ISO 80000-08.
 * Example 2: The natural logarithmic measurement scale for "electric field strength" in "neper".
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "scale")
public abstract class AbstractLogarithmicScale extends AbstractMeasurementScale  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>LogarithmicScale<code/> class.
     *
     * @see LogarithmicScale
     */
    public AbstractLogarithmicScale() {
        this.referenceQuantityValue = new ContainerList<ScaleReferenceQuantityValue>(this);
    }

    /**
     * Initializes a new instance of the <code>LogarithmicScale<code/> class.
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
     * @see LogarithmicScale
     */
    public AbstractLogarithmicScale(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.referenceQuantityValue = new ContainerList<ScaleReferenceQuantityValue>(this);
    }

    /**
     * Property exponent.
     * exponent used in the definition formula for the quantity value for this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String exponent;

    /**
     * Property factor.
     * factor used in the definition formula for the quantity value for this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String factor;

    /**
     * Property logarithmBase.
     * base of the logarithmic function used on this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private LogarithmBaseKind logarithmBase;

    /**
     * Property referenceQuantityKind.
     * reference to the applicable QuantityKind for the quotient of quantities in the definition formula of this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private QuantityKind referenceQuantityKind;

    /**
     * List of contained ScaleReferenceQuantityValue.
     * optional value for the reference quantity in the definition formula for this LogarithmicScale
     * Note: A logarithmic scale may define a fixed reference quantity. See also <a href="http://www.nist.gov/pml/pubs/sp811/index.cfm">NIST SP811</a> for many more details.
     * Example: The base 10 logarithmic scale for "sound pressure level" in decibel is defined with respect to a reference sound pressure <i>p<sub>0</sub></i> = 20 µPa. The sound pressure level value on such a scale for a corresponding sound pressure <i>p</i> would then be 10·log<sub>10</sub>((<i>p</i>/<i>p<sub>0</sub></i>)<sup>2</sup>) dB.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ScaleReferenceQuantityValue> referenceQuantityValue;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>LogarithmicScale<code/>.
     *
     * @see Iterable
     * @see LogarithmicScale
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets the exponent.
     * exponent used in the definition formula for the quantity value for this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getExponent(){
         return this.exponent;
    }

    /**
     * Gets the factor.
     * factor used in the definition formula for the quantity value for this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getFactor(){
         return this.factor;
    }

    /**
     * Gets the logarithmBase.
     * base of the logarithmic function used on this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public LogarithmBaseKind getLogarithmBase(){
         return this.logarithmBase;
    }

    /**
     * Gets the referenceQuantityKind.
     * reference to the applicable QuantityKind for the quotient of quantities in the definition formula of this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public QuantityKind getReferenceQuantityKind(){
         return this.referenceQuantityKind;
    }

    /**
     * Gets a list of contained ScaleReferenceQuantityValue.
     * optional value for the reference quantity in the definition formula for this LogarithmicScale
     * Note: A logarithmic scale may define a fixed reference quantity. See also <a href="http://www.nist.gov/pml/pubs/sp811/index.cfm">NIST SP811</a> for many more details.
     * Example: The base 10 logarithmic scale for "sound pressure level" in decibel is defined with respect to a reference sound pressure <i>p<sub>0</sub></i> = 20 µPa. The sound pressure level value on such a scale for a corresponding sound pressure <i>p</i> would then be 10·log<sub>10</sub>((<i>p</i>/<i>p<sub>0</sub></i>)<sup>2</sup>) dB.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ScaleReferenceQuantityValue> getReferenceQuantityValue(){
         return this.referenceQuantityValue;
    }

    /**
     * Sets the exponent.
     * exponent used in the definition formula for the quantity value for this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setExponent(String exponent){
        this.exponent = exponent;
    }

    /**
     * Sets the factor.
     * factor used in the definition formula for the quantity value for this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setFactor(String factor){
        this.factor = factor;
    }

    /**
     * Sets the logarithmBase.
     * base of the logarithmic function used on this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setLogarithmBase(LogarithmBaseKind logarithmBase){
        this.logarithmBase = logarithmBase;
    }

    /**
     * Sets the referenceQuantityKind.
     * reference to the applicable QuantityKind for the quotient of quantities in the definition formula of this LogarithmicScale
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setReferenceQuantityKind(QuantityKind referenceQuantityKind){
        this.referenceQuantityKind = referenceQuantityKind;
    }

    /**
     * Sets a list of contained ScaleReferenceQuantityValue.
     * optional value for the reference quantity in the definition formula for this LogarithmicScale
     * Note: A logarithmic scale may define a fixed reference quantity. See also <a href="http://www.nist.gov/pml/pubs/sp811/index.cfm">NIST SP811</a> for many more details.
     * Example: The base 10 logarithmic scale for "sound pressure level" in decibel is defined with respect to a reference sound pressure <i>p<sub>0</sub></i> = 20 µPa. The sound pressure level value on such a scale for a corresponding sound pressure <i>p</i> would then be 10·log<sub>10</sub>((<i>p</i>/<i>p<sub>0</sub></i>)<sup>2</sup>) dB.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setReferenceQuantityValue(ContainerList<ScaleReferenceQuantityValue> referenceQuantityValue){
        this.referenceQuantityValue = referenceQuantityValue;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>LogarithmicScale<code/>.
     *
     * @see Iterable
     * @see LogarithmicScale
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.referenceQuantityValue);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>LogarithmicScale<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>LogarithmicScale<code/>.
     *
     * @see LogarithmicScale
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        LogarithmicScale clone = (LogarithmicScale)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));
        clone.setMappingToReferenceScale(cloneContainedThings ? new ContainerList<MappingToReferenceScale>(clone) : new ContainerList<MappingToReferenceScale>(this.mappingToReferenceScale, clone));
        clone.setReferenceQuantityValue(cloneContainedThings ? new ContainerList<ScaleReferenceQuantityValue>(clone) : new ContainerList<ScaleReferenceQuantityValue>(this.referenceQuantityValue, clone));
        clone.setValueDefinition(cloneContainedThings ? new ContainerList<ScaleValueDefinition>(clone) : new ContainerList<ScaleValueDefinition>(this.valueDefinition, clone));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.alias.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.definition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.hyperLink.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getMappingToReferenceScale().addAll(this.mappingToReferenceScale.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getReferenceQuantityValue().addAll(this.referenceQuantityValue.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getValueDefinition().addAll(this.valueDefinition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>LogarithmicScale<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>LogarithmicScale<code/>.
     * 
     * @see LogarithmicScale
     */
    @Override
    public LogarithmicScale clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (LogarithmicScale)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>LogarithmicScale<code/>.
     *
     * @return A list of potential errors.
     *
     * @see LogarithmicScale
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.exponent.trim().isEmpty()) {
            errorList.add("The property exponent is null or empty.");
        }

        if (this.factor.trim().isEmpty()) {
            errorList.add("The property factor is null or empty.");
        }

        if (this.referenceQuantityKind == null || this.referenceQuantityKind.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property referenceQuantityKind is null.");
            this.referenceQuantityKind = SentinelThingProvider.getSentinel<QuantityKind>();
            this.sentinelResetMap["referenceQuantityKind"] = () -> this.referenceQuantityKind = null;
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>LogarithmicScale<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see LogarithmicScale
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.LogarithmicScale dto = (cdp4common.dto.LogarithmicScale)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.exponent = dto.getExponent();
        this.factor = dto.getFactor();
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.isDeprecated = dto.getIsDeprecated();
        this.isMaximumInclusive = dto.getIsMaximumInclusive();
        this.isMinimumInclusive = dto.getIsMinimumInclusive();
        this.logarithmBase = dto.getLogarithmBase();
        this.mappingToReferenceScale.resolveList(dto.getMappingToReferenceScale(), dto.getIterationContainerId(), this.cache);
        this.maximumPermissibleValue = dto.getMaximumPermissibleValue();
        this.minimumPermissibleValue = dto.getMinimumPermissibleValue();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.negativeValueConnotation = dto.getNegativeValueConnotation();
        this.numberSet = dto.getNumberSet();
        this.positiveValueConnotation = dto.getPositiveValueConnotation();
        this.referenceQuantityKind = this.cache.get<QuantityKind>(dto.getReferenceQuantityKind(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<QuantityKind>();
        this.referenceQuantityValue.resolveList(dto.getReferenceQuantityValue(), dto.getIterationContainerId(), this.cache);
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();
        this.unit = this.cache.get<MeasurementUnit>(dto.getUnit(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<MeasurementUnit>();
        this.valueDefinition.resolveList(dto.getValueDefinition(), dto.getIterationContainerId(), this.cache);

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>LogarithmicScale<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see LogarithmicScale
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.LogarithmicScale dto = new cdp4common.dto.LogarithmicScale(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setExponent(this.exponent);
        dto.setFactor(this.factor);
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setIsDeprecated(this.isDeprecated);
        dto.setIsMaximumInclusive(this.isMaximumInclusive);
        dto.setIsMinimumInclusive(this.isMinimumInclusive);
        dto.setLogarithmBase(this.logarithmBase);
        dto.getMappingToReferenceScale().add(this.mappingToReferenceScale.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setMaximumPermissibleValue(this.maximumPermissibleValue);
        dto.setMinimumPermissibleValue(this.minimumPermissibleValue);
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.setNegativeValueConnotation(this.negativeValueConnotation);
        dto.setNumberSet(this.numberSet);
        dto.setPositiveValueConnotation(this.positiveValueConnotation);
        dto.setReferenceQuantityKind(this.referenceQuantityKind != null ? this.referenceQuantityKind.getIid() : new UUID(0L, 0L));
        dto.getReferenceQuantityValue().add(this.referenceQuantityValue.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);
        dto.setUnit(this.unit != null ? this.unit.getIid() : new UUID(0L, 0L));
        dto.getValueDefinition().add(this.valueDefinition.stream().map(x -> x.Iid).collect(Collectors.toList()));

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
