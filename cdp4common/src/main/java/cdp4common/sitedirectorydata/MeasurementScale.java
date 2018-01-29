/* --------------------------------------------------------------------------------------------------------------------
 * AbstractMeasurementScale.java
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
 * representation of a measurement scale to express quantity values for a numerical Parameter, i.e. a Parameter that is typed by a QuantityKind
 * Note 1: MeasurementScale represents the VIM concept of "quantity-value scale" that is defined as "ordered set of quantity values of quantities of a given kind of quantity used in ranking, according to magnitude, quantities of that kind".
 * Note 2: A MeasurementScale defines how to interpret the numerical value of a quantity or parameter. In this data model a distinction is made between a measurement scale and a measurement unit. A measurement unit is a reference quantity that defines how to interpret an interval of one on a measurement scale. A measurement scale defines in addition the kind of scale, and where necessary more characteristics to provide all information needed for mapping quantity values between different scales, as specified in the specializations of this class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "scale")
@ToString
@EqualsAndHashCode
public  abstract class MeasurementScale extends DefinedThing implements DeprecatableThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the <code>MeasurementScale<code/> class.
     *
     * @see MeasurementScale
     */
    protected MeasurementScale() {
        this.mappingToReferenceScale = new ContainerList<MappingToReferenceScale>(this);
        this.valueDefinition = new ContainerList<ScaleValueDefinition>(this);
    }

    /**
     * Initializes a new instance of the <code>MeasurementScale<code/> class.
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
     * @see MeasurementScale
     */
    protected MeasurementScale(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.mappingToReferenceScale = new ContainerList<MappingToReferenceScale>(this);
        this.valueDefinition = new ContainerList<ScaleValueDefinition>(this);
    }

    /**
     * Value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isDeprecated;

    /**
     * Value indicating whether isMaximumInclusive.
     * Note: In other words this enables to define a closed or open upper end of the permissible value interval.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isMaximumInclusive;

    /**
     * Value indicating whether isMinimumInclusive.
     * assertion whether the minimum permissible value is included or not
     * Note: In other words this enables to define a closed or open lower end of the permissible value interval.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isMinimumInclusive;

    /**
     * List of contained MappingToReferenceScale.
     * reference to coincident quantity values on different but compatible MeasurementScales
     * Note: This property would be defined for a dependent MeasurementScale with respect to a reference MeasurementScale in order to enable parameter value conversion from one scale to another. The MappingToReferenceScale defines the offset by which measurement values need to be shifted when converting values between OrdinalScales or IntervalScales.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<MappingToReferenceScale> mappingToReferenceScale;

    /**
     * Property maximumPermissibleValue.
     * optional definition of the maximum permissible value for quantities expressed on this MeasurementScale
     * Note 1: If <i>isMaximumInclusive</i> is true, this implies that values expressed on this MeasurementScale must be less than or equal to <i>maximumPermissibleValue,</i> else if <i>isMaximumInclusive</i> is false, values must be less than <i>maximumPermissibleValue.</i>
     * Note 2: The properties <i>maximumPermissibleValue </i>and <i>isMaximumInclusive</i> can be mapped onto the pair of XML Schema facets <a href="http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive">maxInclusive</a> and <a href="http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive">maxExclusive</a>.
     * Note 3: If no <i>maximumPermissibleValue</i> is given, the maximum permissible quantity value is positive infinity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String maximumPermissibleValue;

    /**
     * Property minimumPermissibleValue.
     * optional definition of the minimum permissible quantity value expressed on this MeasurementScale
     * Note 1: If <i>isMinimumInclusive</i> is true, this implies that values expressed on this MeasurementScale must be greater than or equal to <i>minimumPermissibleValue,</i> else if <i>isMinimumInclusive</i> is false, values must be greater than <i>minimumPermissibleValue.</i>
     * Note 2: The properties <i>minimumPermissibleValue </i>and <i>isMinimumInclusive</i> can be mapped onto the pair of XML Schema facets <a href="http://www.w3.org/TR/xmlschema-2/#rf-minInclusive">minInclusive</a> and <a href="http://www.w3.org/TR/xmlschema-2/#rf-minExclusive">minExclusive</a>.
     * Note 3: If no <i>minimumPermissibleValue</i> is given, the minimum permissible quantity value is negative infinity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String minimumPermissibleValue;

    /**
     * Property negativeValueConnotation.
     * optional connotation, i.e. special significance, of negative values for this MeasurementScale
     * Example: See <i>positiveValueConnotation</i>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String negativeValueConnotation;

    /**
     * Property numberSet.
     * assertion that specifies the mathematical number set for values of this
     * QuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private NumberSetKind numberSet;

    /**
     * Property positiveValueConnotation.
     * optional connotation, i.e. special significance, of positive values for this MeasurementScale
     * Example: Suppose "latitude" (of a planet) is expressed on a RatioScale with the "degree" measurement unit. Then positive values by definition indicate a latitude on the northern hemisphere, and negative values indicate a latitude on the southern hemisphere. Therefore the positiveValueConnotation would be "North" and the negativeValueConnotation would be "South".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String positiveValueConnotation;

    /**
     * Property unit.
     * reference to the measurement unit applicable to this MeasurementScale
     * Note: The measurement unit defines the meaning of an interval of one on this MeasurementScale.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private MeasurementUnit unit;

    /**
     * List of contained ScaleValueDefinition.
     * collection of particular values that are part of the definition of this MeasurementScale
     * Example 1: On the thermodynamic temperature scale in kelvin, 0 kelvin is defined as the absolute zero temperature point and 273.15 kelvin is defined as the thermodynamic temperature of water at its triple point.
     * Example 2: On the Beaufort wind force scale each of the numbers 1 to 12 has an associated specific textual definition, see OrdinalScale for the example.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ScaleValueDefinition> valueDefinition;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>MeasurementScale<code/>.
     *
     * @see Iterable
     * @see MeasurementScale
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getDeprecated(){
         return this.isDeprecated;
    }

    /**
     * Gets a value indicating whether isMaximumInclusive.
     * Note: In other words this enables to define a closed or open upper end of the permissible value interval.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getMaximumInclusive(){
         return this.isMaximumInclusive;
    }

    /**
     * Gets a value indicating whether isMinimumInclusive.
     * assertion whether the minimum permissible value is included or not
     * Note: In other words this enables to define a closed or open lower end of the permissible value interval.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getMinimumInclusive(){
         return this.isMinimumInclusive;
    }

    /**
     * Gets a list of contained MappingToReferenceScale.
     * reference to coincident quantity values on different but compatible MeasurementScales
     * Note: This property would be defined for a dependent MeasurementScale with respect to a reference MeasurementScale in order to enable parameter value conversion from one scale to another. The MappingToReferenceScale defines the offset by which measurement values need to be shifted when converting values between OrdinalScales or IntervalScales.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<MappingToReferenceScale> getMappingToReferenceScale(){
         return this.mappingToReferenceScale;
    }

    /**
     * Gets the maximumPermissibleValue.
     * optional definition of the maximum permissible value for quantities expressed on this MeasurementScale
     * Note 1: If <i>isMaximumInclusive</i> is true, this implies that values expressed on this MeasurementScale must be less than or equal to <i>maximumPermissibleValue,</i> else if <i>isMaximumInclusive</i> is false, values must be less than <i>maximumPermissibleValue.</i>
     * Note 2: The properties <i>maximumPermissibleValue </i>and <i>isMaximumInclusive</i> can be mapped onto the pair of XML Schema facets <a href="http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive">maxInclusive</a> and <a href="http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive">maxExclusive</a>.
     * Note 3: If no <i>maximumPermissibleValue</i> is given, the maximum permissible quantity value is positive infinity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getMaximumPermissibleValue(){
         return this.maximumPermissibleValue;
    }

    /**
     * Gets the minimumPermissibleValue.
     * optional definition of the minimum permissible quantity value expressed on this MeasurementScale
     * Note 1: If <i>isMinimumInclusive</i> is true, this implies that values expressed on this MeasurementScale must be greater than or equal to <i>minimumPermissibleValue,</i> else if <i>isMinimumInclusive</i> is false, values must be greater than <i>minimumPermissibleValue.</i>
     * Note 2: The properties <i>minimumPermissibleValue </i>and <i>isMinimumInclusive</i> can be mapped onto the pair of XML Schema facets <a href="http://www.w3.org/TR/xmlschema-2/#rf-minInclusive">minInclusive</a> and <a href="http://www.w3.org/TR/xmlschema-2/#rf-minExclusive">minExclusive</a>.
     * Note 3: If no <i>minimumPermissibleValue</i> is given, the minimum permissible quantity value is negative infinity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getMinimumPermissibleValue(){
         return this.minimumPermissibleValue;
    }

    /**
     * Gets the negativeValueConnotation.
     * optional connotation, i.e. special significance, of negative values for this MeasurementScale
     * Example: See <i>positiveValueConnotation</i>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getNegativeValueConnotation(){
         return this.negativeValueConnotation;
    }

    /**
     * Gets the numberSet.
     * assertion that specifies the mathematical number set for values of this
     * QuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public NumberSetKind getNumberSet(){
         return this.numberSet;
    }

    /**
     * Gets the positiveValueConnotation.
     * optional connotation, i.e. special significance, of positive values for this MeasurementScale
     * Example: Suppose "latitude" (of a planet) is expressed on a RatioScale with the "degree" measurement unit. Then positive values by definition indicate a latitude on the northern hemisphere, and negative values indicate a latitude on the southern hemisphere. Therefore the positiveValueConnotation would be "North" and the negativeValueConnotation would be "South".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getPositiveValueConnotation(){
         return this.positiveValueConnotation;
    }

    /**
     * Gets the unit.
     * reference to the measurement unit applicable to this MeasurementScale
     * Note: The measurement unit defines the meaning of an interval of one on this MeasurementScale.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public MeasurementUnit getUnit(){
         return this.unit;
    }

    /**
     * Gets a list of contained ScaleValueDefinition.
     * collection of particular values that are part of the definition of this MeasurementScale
     * Example 1: On the thermodynamic temperature scale in kelvin, 0 kelvin is defined as the absolute zero temperature point and 273.15 kelvin is defined as the thermodynamic temperature of water at its triple point.
     * Example 2: On the Beaufort wind force scale each of the numbers 1 to 12 has an associated specific textual definition, see OrdinalScale for the example.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ScaleValueDefinition> getValueDefinition(){
         return this.valueDefinition;
    }

    /**
     *Sets a value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDeprecated(boolean isDeprecated){
        this.isDeprecated = isDeprecated;
    }

    /**
     *Sets a value indicating whether isMaximumInclusive.
     * Note: In other words this enables to define a closed or open upper end of the permissible value interval.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setMaximumInclusive(boolean isMaximumInclusive){
        this.isMaximumInclusive = isMaximumInclusive;
    }

    /**
     *Sets a value indicating whether isMinimumInclusive.
     * assertion whether the minimum permissible value is included or not
     * Note: In other words this enables to define a closed or open lower end of the permissible value interval.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setMinimumInclusive(boolean isMinimumInclusive){
        this.isMinimumInclusive = isMinimumInclusive;
    }

    /**
     * Sets a list of contained MappingToReferenceScale.
     * reference to coincident quantity values on different but compatible MeasurementScales
     * Note: This property would be defined for a dependent MeasurementScale with respect to a reference MeasurementScale in order to enable parameter value conversion from one scale to another. The MappingToReferenceScale defines the offset by which measurement values need to be shifted when converting values between OrdinalScales or IntervalScales.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setMappingToReferenceScale(ContainerList<MappingToReferenceScale> mappingToReferenceScale){
        this.mappingToReferenceScale = mappingToReferenceScale;
    }

    /**
     * Sets the maximumPermissibleValue.
     * optional definition of the maximum permissible value for quantities expressed on this MeasurementScale
     * Note 1: If <i>isMaximumInclusive</i> is true, this implies that values expressed on this MeasurementScale must be less than or equal to <i>maximumPermissibleValue,</i> else if <i>isMaximumInclusive</i> is false, values must be less than <i>maximumPermissibleValue.</i>
     * Note 2: The properties <i>maximumPermissibleValue </i>and <i>isMaximumInclusive</i> can be mapped onto the pair of XML Schema facets <a href="http://www.w3.org/TR/xmlschema-2/#rf-maxInclusive">maxInclusive</a> and <a href="http://www.w3.org/TR/xmlschema-2/#rf-maxExclusive">maxExclusive</a>.
     * Note 3: If no <i>maximumPermissibleValue</i> is given, the maximum permissible quantity value is positive infinity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setMaximumPermissibleValue(String maximumPermissibleValue){
        this.maximumPermissibleValue = maximumPermissibleValue;
    }

    /**
     * Sets the minimumPermissibleValue.
     * optional definition of the minimum permissible quantity value expressed on this MeasurementScale
     * Note 1: If <i>isMinimumInclusive</i> is true, this implies that values expressed on this MeasurementScale must be greater than or equal to <i>minimumPermissibleValue,</i> else if <i>isMinimumInclusive</i> is false, values must be greater than <i>minimumPermissibleValue.</i>
     * Note 2: The properties <i>minimumPermissibleValue </i>and <i>isMinimumInclusive</i> can be mapped onto the pair of XML Schema facets <a href="http://www.w3.org/TR/xmlschema-2/#rf-minInclusive">minInclusive</a> and <a href="http://www.w3.org/TR/xmlschema-2/#rf-minExclusive">minExclusive</a>.
     * Note 3: If no <i>minimumPermissibleValue</i> is given, the minimum permissible quantity value is negative infinity.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setMinimumPermissibleValue(String minimumPermissibleValue){
        this.minimumPermissibleValue = minimumPermissibleValue;
    }

    /**
     * Sets the negativeValueConnotation.
     * optional connotation, i.e. special significance, of negative values for this MeasurementScale
     * Example: See <i>positiveValueConnotation</i>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setNegativeValueConnotation(String negativeValueConnotation){
        this.negativeValueConnotation = negativeValueConnotation;
    }

    /**
     * Sets the numberSet.
     * assertion that specifies the mathematical number set for values of this
     * QuantityKind
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setNumberSet(NumberSetKind numberSet){
        this.numberSet = numberSet;
    }

    /**
     * Sets the positiveValueConnotation.
     * optional connotation, i.e. special significance, of positive values for this MeasurementScale
     * Example: Suppose "latitude" (of a planet) is expressed on a RatioScale with the "degree" measurement unit. Then positive values by definition indicate a latitude on the northern hemisphere, and negative values indicate a latitude on the southern hemisphere. Therefore the positiveValueConnotation would be "North" and the negativeValueConnotation would be "South".
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setPositiveValueConnotation(String positiveValueConnotation){
        this.positiveValueConnotation = positiveValueConnotation;
    }

    /**
     * Sets the unit.
     * reference to the measurement unit applicable to this MeasurementScale
     * Note: The measurement unit defines the meaning of an interval of one on this MeasurementScale.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setUnit(MeasurementUnit unit){
        this.unit = unit;
    }

    /**
     * Sets a list of contained ScaleValueDefinition.
     * collection of particular values that are part of the definition of this MeasurementScale
     * Example 1: On the thermodynamic temperature scale in kelvin, 0 kelvin is defined as the absolute zero temperature point and 273.15 kelvin is defined as the thermodynamic temperature of water at its triple point.
     * Example 2: On the Beaufort wind force scale each of the numbers 1 to 12 has an associated specific textual definition, see OrdinalScale for the example.
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setValueDefinition(ContainerList<ScaleValueDefinition> valueDefinition){
        this.valueDefinition = valueDefinition;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>MeasurementScale<code/>.
     *
     * @see Iterable
     * @see MeasurementScale
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.mappingToReferenceScale);
        containers.Add(this.valueDefinition);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>MeasurementScale<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>MeasurementScale<code/>.
     * 
     * @see MeasurementScale
     */
    @Override
    public MeasurementScale clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (MeasurementScale)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>MeasurementScale<code/>.
     *
     * @return A list of potential errors.
     *
     * @see MeasurementScale
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getUnit() == null || this.getUnit().getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property unit is null.");
            this.setUnit(SentinelThingProvider.getSentinel<MeasurementUnit>());
            this.sentinelResetMap["unit"] = () -> this.setUnit(null);
        }

        return errorList;
    }
}