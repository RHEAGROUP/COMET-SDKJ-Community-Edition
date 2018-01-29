/* --------------------------------------------------------------------------------------------------------------------
 * AbstractParameterType.java
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
 * abstract superclass that represents the common characteristics of any parameter type
 * Note: There are two properties to hold a short identifier to designate a ParameterType: <i>shortName</i> and <i>symbol</i>. The <i>shortName</i> must be case-insensitive unique within its containing ReferenceDataLibrary. This is necessary in order to support case-insensitive unique names in derived parameter names for use in modeling environments that only have case-insensitive variable names such as MS Excel. The <i>symbol</i> must be case-sensitive unique within its containing ReferenceDataLibrary. The <i>symbol</i> is meant to hold the official symbolic name of a ParameterType as defined for example in an ISO standard.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
@ToString
@EqualsAndHashCode
public  abstract class ParameterType extends DefinedThing implements CategorizableThing, DeprecatableThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.SAME_AS_CONTAINER;

    /**
     * Initializes a new instance of the <code>ParameterType<code/> class.
     *
     * @see ParameterType
     */
    protected ParameterType() {
        this.category = new ArrayList<Category>();
    }

    /**
     * Initializes a new instance of the <code>ParameterType<code/> class.
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
     * @see ParameterType
     */
    protected ParameterType(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.category = new ArrayList<Category>();
    }

    /**
     * List of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ArrayList<Category> category;

    /**
     * Value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private boolean isDeprecated;

    /**
     * Property numberOfValues.
     * number of individual values in each of the parameter value properties of a ParameterValueSet, a ParameterSubscriptionValueSet or a SimpleParameterValue for this ParameterType
     * Note: For a ScalarParameterType this will be one, while for a CompoundParameterType this will amount to the (possibly recursive) summation of the <i>numberOfValues</i> in the ParameterTypes of all <i>component</i> ParameterTypeComponents.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private int numberOfValues;
 
    /**
     * Property symbol.
     * short symbolic name of this ParameterType
     * Note: Where applicable this property shall be used to hold the symbol that is defined through a standard (e.g. from ISO) or by convention.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String symbol;

    /**
     * Gets a list of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ArrayList<Category> getCategory(){
         return this.category;
    }

    /**
     * Gets a value indicating whether isDeprecated.
     * assertion whether a DeprecatableThing is deprecated or not
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public boolean getDeprecated(){
         return this.isDeprecated;
    }

    /**
     * Gets the numberOfValues.
     * number of individual values in each of the parameter value properties of a ParameterValueSet, a ParameterSubscriptionValueSet or a SimpleParameterValue for this ParameterType
     * Note: For a ScalarParameterType this will be one, while for a CompoundParameterType this will amount to the (possibly recursive) summation of the <i>numberOfValues</i> in the ParameterTypes of all <i>component</i> ParameterTypeComponents.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public int getNumberOfValues(){
        return this.GetDerivedNumberOfValues();
    }

    /**
     * Gets the symbol.
     * short symbolic name of this ParameterType
     * Note: Where applicable this property shall be used to hold the symbol that is defined through a standard (e.g. from ISO) or by convention.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getSymbol(){
         return this.symbol;
    }

    /**
     * Sets a list of Category.
     * reference to zero or more Categories of which this CategorizableThing is a member
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setCategory(ArrayList<Category> category){
        this.category = category;
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
     * Sets the numberOfValues.
     * number of individual values in each of the parameter value properties of a ParameterValueSet, a ParameterSubscriptionValueSet or a SimpleParameterValue for this ParameterType
     * Note: For a ScalarParameterType this will be one, while for a CompoundParameterType this will amount to the (possibly recursive) summation of the <i>numberOfValues</i> in the ParameterTypes of all <i>component</i> ParameterTypeComponents.
     *
     * @throws IllegalStateException The numberOfValues property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setNumberOfValues(int numberOfValues){
        throw new IllegalStateException("Forbidden Set value for the derived property ParameterType.numberOfValues");
    }

    /**
     * Sets the symbol.
     * short symbolic name of this ParameterType
     * Note: Where applicable this property shall be used to hold the symbol that is defined through a standard (e.g. from ISO) or by convention.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setSymbol(String symbol){
        this.symbol = symbol;
    }

    /**
     * Creates and returns a copy of this <code>ParameterType<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ParameterType<code/>.
     * 
     * @see ParameterType
     */
    @Override
    public ParameterType clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterType)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ParameterType<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ParameterType
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.getSymbol().trim().isEmpty()) {
            errorList.add("The property symbol is null or empty.");
        }

        return errorList;
    }
}