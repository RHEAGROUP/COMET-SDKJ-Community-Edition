/* --------------------------------------------------------------------------------------------------------------------
 * AbstractQuantityKind.java
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
 * representation of a numerical ScalarParameterType
 * Note 1: QuantityKind represents the VIM concept of "kind of quantity" that is defined as "aspect common to mutually comparable quantities".
 * Note 2: In this data model a quantity is represented by a Parameter (or an associated ParameterOverride or ParameterSubscription), a Constant or a SimpleParameterValue. It is typed by a QuantityKind and has a numerical value as well as a reference to a MeasurementScale. See the definitions of the mentioned concepts for the details on how value and measurement scale are instantiated. Example: Length, mass, time, speed, diameter, electrical current, thermodynamic temperature and Rockwell hardness are all examples of QuantityKind.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "parameterType")
public abstract class AbstractQuantityKind extends AbstractScalarParameterType  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>QuantityKind<code/> class.
     *
     * @see QuantityKind
     */
    protected AbstractQuantityKind() {
        this.possibleScale = new List<MeasurementScale>();
    }

    /**
     * Initializes a new instance of the <code>QuantityKind<code/> class.
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
     * @see QuantityKind
     */
    protected AbstractQuantityKind(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.possibleScale = new List<MeasurementScale>();
    }

    /**
     * List of MeasurementScale.
     * derived collection of all possible MeasurementScales on which values for this QuantityKind can be expressed
     * Note: For a SimpleQuantityKind and a DerivedQuantityKind <i>allPossibleScale</i> contains the same MeasurementScales as <i>possibleScale</i>. For a SpecializedQuantityKind <i>allPossibleScale</i> contains the set of all <i>possibleScale</i> of the specific SpecializedQuantityKind and all of its <i>general</i> QuantityKind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private List<MeasurementScale> allPossibleScale;
 
    /**
     * Property defaultScale.
     * definition of the default MeasurementScale for this QuantityKind
     * Note: The <i>defaultScale</i> must be a MeasurementScale in the collection <i>allPossibleScale</i> for this QuantityKind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private MeasurementScale defaultScale;

    /**
     * List of MeasurementScale.
     * collection of MeasurementScales on which values for this QuantityKind can be expressed
     * Note: For a SpecializedQuantityKind there may be zero possible scales, because it inherits the possible scales from its <i>general</i> QuantityKind. See also the <i>allPossibleScale</i> property.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private List<MeasurementScale> possibleScale;

    /**
     * List of ordered String.
     * derived list of exponents that together with the actual base QuantityKinds define the physical dimension of this QuantityKind
     * Note 1: The <a href="http://www.bipm.org/en/publications/guides/vim.html">International Vocabulary of Metrology (VIM)</a> defines "quantity dimension" as "expression of the dependence of a quantity on the base quantities of a system of quantities as a product of powers of factors corresponding to the base quantities, omitting any numerical factor."
     * Note 2: There must be as many exponents as there as <i>baseQuantityKind</i> QuantityKinds in the dataset. The exponents are given in the same order as the ordered collection of <i>baseQuantityKind</i> QuantityKinds, enumerated starting from the top <i>requiredRdl</i> down to the ReferenceDataLibrary that contains this QuantityKind. Typically only the top SiteReferenceDataLibrary will have a non-empty <i>baseQuantityKind</i> collection.
     * Note 3: The physical dimension of any QuantityKind can be derived through the algorithm that is defined in Section C.5.2.20 of <a href="http://www.omgsysml.org">SysML v1.2</a>. The actual physical dimension for a given QuantityKind depends on the choice of base QuantityKinds specified in the relevant (set of) ReferenceDataLibrary (or SystemOfQuantities in SysML).
     * Example: In the International System of Quantities (ISQ) the quantity dimension of "force" is denoted by
     * dim F = L.M.T<sup>-2</sup>,
     * where "F" is the symbol for "force," and "L," "M," and "T" are the symbols for the ISQ base quantities "length", "mass", and "time" respectively.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    private OrderedItemList<String> quantityDimensionExponent;
 
    /**
     * Property quantityDimensionExpression.
     * derived symbolic expression of the physical dimension of this QuantityKind
     * Note: This is the human readable version of product of powers formed by the <i>quantityDimensionSymbol</i> of each of the base QuantityKind and the corresponding <i>quantityDimensionExponent</i>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    private String quantityDimensionExpression;
 
    /**
     * Property quantityDimensionSymbol.
     * definition of the symbol used to represent the physical dimension of a QuantityKind that is a <i>baseQuantityKind</i> as registered in the containing ReferenceDataLibrary
     * Note: These base quantity kind symbols are used in the derivation of the <i>quantityDimensionExpression</i> property for all QuantityKinds.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private String quantityDimensionSymbol;

    /**
     * Gets a list of MeasurementScale.
     * derived collection of all possible MeasurementScales on which values for this QuantityKind can be expressed
     * Note: For a SimpleQuantityKind and a DerivedQuantityKind <i>allPossibleScale</i> contains the same MeasurementScales as <i>possibleScale</i>. For a SpecializedQuantityKind <i>allPossibleScale</i> contains the set of all <i>possibleScale</i> of the specific SpecializedQuantityKind and all of its <i>general</i> QuantityKind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public List<MeasurementScale> getAllPossibleScale(){
        return this.GetDerivedAllPossibleScale();
    }

    /**
     * Gets the defaultScale.
     * definition of the default MeasurementScale for this QuantityKind
     * Note: The <i>defaultScale</i> must be a MeasurementScale in the collection <i>allPossibleScale</i> for this QuantityKind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public MeasurementScale getDefaultScale(){
         return this.defaultScale;
    }

    /**
     * Gets a list of MeasurementScale.
     * collection of MeasurementScales on which values for this QuantityKind can be expressed
     * Note: For a SpecializedQuantityKind there may be zero possible scales, because it inherits the possible scales from its <i>general</i> QuantityKind. See also the <i>allPossibleScale</i> property.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public List<MeasurementScale> getPossibleScale(){
         return this.possibleScale;
    }

    /**
     * Gets a list of ordered String.
     * derived list of exponents that together with the actual base QuantityKinds define the physical dimension of this QuantityKind
     * Note 1: The <a href="http://www.bipm.org/en/publications/guides/vim.html">International Vocabulary of Metrology (VIM)</a> defines "quantity dimension" as "expression of the dependence of a quantity on the base quantities of a system of quantities as a product of powers of factors corresponding to the base quantities, omitting any numerical factor."
     * Note 2: There must be as many exponents as there as <i>baseQuantityKind</i> QuantityKinds in the dataset. The exponents are given in the same order as the ordered collection of <i>baseQuantityKind</i> QuantityKinds, enumerated starting from the top <i>requiredRdl</i> down to the ReferenceDataLibrary that contains this QuantityKind. Typically only the top SiteReferenceDataLibrary will have a non-empty <i>baseQuantityKind</i> collection.
     * Note 3: The physical dimension of any QuantityKind can be derived through the algorithm that is defined in Section C.5.2.20 of <a href="http://www.omgsysml.org">SysML v1.2</a>. The actual physical dimension for a given QuantityKind depends on the choice of base QuantityKinds specified in the relevant (set of) ReferenceDataLibrary (or SystemOfQuantities in SysML).
     * Example: In the International System of Quantities (ISQ) the quantity dimension of "force" is denoted by
     * dim F = L.M.T<sup>-2</sup>,
     * where "F" is the symbol for "force," and "L," "M," and "T" are the symbols for the ISQ base quantities "length", "mass", and "time" respectively.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    
    public OrderedItemList<String> getQuantityDimensionExponent(){
        return this.GetDerivedQuantityDimensionExponent();
    }

    /**
     * Gets the quantityDimensionExpression.
     * derived symbolic expression of the physical dimension of this QuantityKind
     * Note: This is the human readable version of product of powers formed by the <i>quantityDimensionSymbol</i> of each of the base QuantityKind and the corresponding <i>quantityDimensionExponent</i>.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public String getQuantityDimensionExpression(){
        return this.GetDerivedQuantityDimensionExpression();
    }

    /**
     * Gets the quantityDimensionSymbol.
     * definition of the symbol used to represent the physical dimension of a QuantityKind that is a <i>baseQuantityKind</i> as registered in the containing ReferenceDataLibrary
     * Note: These base quantity kind symbols are used in the derivation of the <i>quantityDimensionExpression</i> property for all QuantityKinds.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public String getQuantityDimensionSymbol(){
         return this.quantityDimensionSymbol;
    }

    /**
     * Sets a list of MeasurementScale.
     * derived collection of all possible MeasurementScales on which values for this QuantityKind can be expressed
     * Note: For a SimpleQuantityKind and a DerivedQuantityKind <i>allPossibleScale</i> contains the same MeasurementScales as <i>possibleScale</i>. For a SpecializedQuantityKind <i>allPossibleScale</i> contains the set of all <i>possibleScale</i> of the specific SpecializedQuantityKind and all of its <i>general</i> QuantityKind.
     *
     * @throws IllegalStateException The allPossibleScale property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setAllPossibleScale(List<MeasurementScale> allPossibleScale){
        throw new IllegalStateException("Forbidden Set value for the derived property QuantityKind.allPossibleScale");
    }

    /**
     * Sets the defaultScale.
     * definition of the default MeasurementScale for this QuantityKind
     * Note: The <i>defaultScale</i> must be a MeasurementScale in the collection <i>allPossibleScale</i> for this QuantityKind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setDefaultScale(MeasurementScale defaultScale){
        this.defaultScale = defaultScale;
    }

    /**
     * Sets a list of MeasurementScale.
     * collection of MeasurementScales on which values for this QuantityKind can be expressed
     * Note: For a SpecializedQuantityKind there may be zero possible scales, because it inherits the possible scales from its <i>general</i> QuantityKind. See also the <i>allPossibleScale</i> property.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setPossibleScale(List<MeasurementScale> possibleScale){
        this.possibleScale = possibleScale;
    }

    /**
     * Sets a list of ordered String.
     * derived list of exponents that together with the actual base QuantityKinds define the physical dimension of this QuantityKind
     * Note 1: The <a href="http://www.bipm.org/en/publications/guides/vim.html">International Vocabulary of Metrology (VIM)</a> defines "quantity dimension" as "expression of the dependence of a quantity on the base quantities of a system of quantities as a product of powers of factors corresponding to the base quantities, omitting any numerical factor."
     * Note 2: There must be as many exponents as there as <i>baseQuantityKind</i> QuantityKinds in the dataset. The exponents are given in the same order as the ordered collection of <i>baseQuantityKind</i> QuantityKinds, enumerated starting from the top <i>requiredRdl</i> down to the ReferenceDataLibrary that contains this QuantityKind. Typically only the top SiteReferenceDataLibrary will have a non-empty <i>baseQuantityKind</i> collection.
     * Note 3: The physical dimension of any QuantityKind can be derived through the algorithm that is defined in Section C.5.2.20 of <a href="http://www.omgsysml.org">SysML v1.2</a>. The actual physical dimension for a given QuantityKind depends on the choice of base QuantityKinds specified in the relevant (set of) ReferenceDataLibrary (or SystemOfQuantities in SysML).
     * Example: In the International System of Quantities (ISQ) the quantity dimension of "force" is denoted by
     * dim F = L.M.T<sup>-2</sup>,
     * where "F" is the symbol for "force," and "L," "M," and "T" are the symbols for the ISQ base quantities "length", "mass", and "time" respectively.
     *
     * @throws IllegalStateException The quantityDimensionExponent property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = true, isNullable = false, isPersistent = false)
    
    public void setQuantityDimensionExponent(OrderedItemList<String> quantityDimensionExponent){
        throw new IllegalStateException("Forbidden Set value for the derived property QuantityKind.quantityDimensionExponent");
    }

    /**
     * Sets the quantityDimensionExpression.
     * derived symbolic expression of the physical dimension of this QuantityKind
     * Note: This is the human readable version of product of powers formed by the <i>quantityDimensionSymbol</i> of each of the base QuantityKind and the corresponding <i>quantityDimensionExponent</i>.
     *
     * @throws IllegalStateException The quantityDimensionExpression property is a derived property; when the setter is invoked an IllegalStateException will be thrown.
     *
     * @see IllegalStateException
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = true, isOrdered = false, isNullable = false, isPersistent = false)
    
    public void setQuantityDimensionExpression(String quantityDimensionExpression){
        throw new IllegalStateException("Forbidden Set value for the derived property QuantityKind.quantityDimensionExpression");
    }

    /**
     * Sets the quantityDimensionSymbol.
     * definition of the symbol used to represent the physical dimension of a QuantityKind that is a <i>baseQuantityKind</i> as registered in the containing ReferenceDataLibrary
     * Note: These base quantity kind symbols are used in the derivation of the <i>quantityDimensionExpression</i> property for all QuantityKinds.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setQuantityDimensionSymbol(String quantityDimensionSymbol){
        this.quantityDimensionSymbol = quantityDimensionSymbol;
    }

    /**
     * Creates and returns a copy of this <code>QuantityKind<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>QuantityKind<code/>.
     * 
     * @see QuantityKind
     */
    @Override
    public QuantityKind clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (QuantityKind)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>QuantityKind<code/>.
     *
     * @return A list of potential errors.
     *
     * @see QuantityKind
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.defaultScale == null || this.defaultScale.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property defaultScale is null.");
            this.defaultScale = SentinelThingProvider.getSentinel<MeasurementScale>();
            this.sentinelResetMap["defaultScale"] = () -> this.defaultScale = null;
        }

        return errorList;
    }
}
