/* --------------------------------------------------------------------------------------------------------------------
 * AbstractReferenceDataLibrary.java
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
 * named library that holds a set of (predefined) reference data that can be loaded at runtime and used in an EngineeringModel
 * Note 1: An EngineeringModel may use one or more reference data libraries. Typically there would be 3 levels as follows:
 * Note 2: One or more ReferenceDataLibraries hold the <i>system of quantities</i> that is defined in <a href="http://www.bipm.org/en/publications/guides/vim.html">VIM</a> as a "set of quantities together with a set of non-contradictory equations relating those quantities" and the system of units defined in <a href="http://www.bipm.org/en/publications/guides/vim.html">VIM</a> as "set of base units and derived units, together with their multiples and submultiples, defined in accordance with given rules, for a given system of quantities". E-TM-10-25 uses as a basis the International System of Quantities (ISQ) and the International System of Units as defined in ISO/IEC 80000. In addition measurement scales are explicitly defined, so that a fully self-described system is captured. Where needed this is extended with non-SI quantities, scales and units with explicit conversion relationships.
 * Note 3: Instances contained by a ReferenceDataLibrary
 * may not be deleted because that would potentially invalidate such libraries for earlier EngineeringModels or other ReferenceDataLibraries that reference them. Such instances may only be deprecated, see DeprecatableThing.
 */
@ToString
@EqualsAndHashCode
public  abstract class ReferenceDataLibrary extends DefinedThing implements ParticipantAffectedAccessThing {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.NOT_APPLICABLE;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.NOT_APPLICABLE;

    /**
     * Initializes a new instance of the <code>ReferenceDataLibrary<code/> class.
     *
     * @see ReferenceDataLibrary
     */
    protected ReferenceDataLibrary() {
        this.baseQuantityKind = new OrderedItemList<QuantityKind>(this);
        this.baseUnit = new ArrayList<MeasurementUnit>();
        this.constant = new ContainerList<Constant>(this);
        this.definedCategory = new ContainerList<Category>(this);
        this.fileType = new ContainerList<FileType>(this);
        this.glossary = new ContainerList<Glossary>(this);
        this.parameterType = new ContainerList<ParameterType>(this);
        this.referenceSource = new ContainerList<ReferenceSource>(this);
        this.rule = new ContainerList<Rule>(this);
        this.scale = new ContainerList<MeasurementScale>(this);
        this.unit = new ContainerList<MeasurementUnit>(this);
        this.unitPrefix = new ContainerList<UnitPrefix>(this);
    }

    /**
     * Initializes a new instance of the <code>ReferenceDataLibrary<code/> class.
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
     * @see ReferenceDataLibrary
     */
    protected ReferenceDataLibrary(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.baseQuantityKind = new OrderedItemList<QuantityKind>(this);
        this.baseUnit = new ArrayList<MeasurementUnit>();
        this.constant = new ContainerList<Constant>(this);
        this.definedCategory = new ContainerList<Category>(this);
        this.fileType = new ContainerList<FileType>(this);
        this.glossary = new ContainerList<Glossary>(this);
        this.parameterType = new ContainerList<ParameterType>(this);
        this.referenceSource = new ContainerList<ReferenceSource>(this);
        this.rule = new ContainerList<Rule>(this);
        this.scale = new ContainerList<MeasurementScale>(this);
        this.unit = new ContainerList<MeasurementUnit>(this);
        this.unitPrefix = new ContainerList<UnitPrefix>(this);
    }

    /**
     * List of ordered QuantityKind.
     * collection of references to the QuantityKinds that are selected as a basis of the system of quantities defined in this ReferenceDataLibrary
     * Note 1: This is a subset of the complete set of QuantityKinds. The base quantities define the basis for the quantity dimension of a kind of quantity.
     * Note 2: If a QuantityKind is in this collection and thus a base QuantityKind, then this base QuantityKind is considered to be primary kind of quantity for the MeasurementUnit of the <i>defaultScale</i> MeasurementScale.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    private OrderedItemList<QuantityKind> baseQuantityKind;

    /**
     * List of MeasurementUnit.
     * specification of the base MeasurementUnits for the system of units
     * defined in this ReferenceDataLibrary
     * Note: A "base unit" is defined in [VIM] as a "measurement unit that is
     * adopted by convention for a base quantity", i.e. it is the (preferred)
     * unit in which base quantities of the associated system of quantities are
     * expressed.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ArrayList<MeasurementUnit> baseUnit;

    /**
     * List of contained Constant.
     * contained collection of Constants
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Constant> constant;

    /**
     * List of contained Category.
     * collection of defined, i.e. known, Categories
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Category> definedCategory;

    /**
     * List of contained FileType.
     * collection of defined, i.e. known, FileTypes
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<FileType> fileType;

    /**
     * List of contained Glossary.
     * contained collection of Glossaries
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Glossary> glossary;

    /**
     * List of contained ParameterType.
     * contained collection of ParameterTypes
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ParameterType> parameterType;

    /**
     * List of contained ReferenceSource.
     * contained collection of ReferenceSources
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<ReferenceSource> referenceSource;

    /**
     * Property requiredRdl.
     * optional reference to the required next higher level ReferenceDataLibrary
     * Note: This property allows chaining an ordered list of ReferenceDataLibraries for use within an EngineeringModel. Its implementation shall have a similar effect as an "import" or "include" statement in a programming language. There shall not be any circular references in the list. This property is empty for the top level ReferenceDataLibrary.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private SiteReferenceDataLibrary requiredRdl;

    /**
     * List of contained Rule.
     * collection of defined, i.e. known, Rules
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<Rule> rule;

    /**
     * List of contained MeasurementScale.
     * contained collection of MeasurementScales
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<MeasurementScale> scale;

    /**
     * List of contained MeasurementUnit.
     * contained collection of MeasurementUnits
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<MeasurementUnit> unit;

    /**
     * List of contained UnitPrefix.
     * collection of zero or more UnitPrefix instances that define the prefixes for multiples and submultiples of (metric) MeasurementUnits
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private ContainerList<UnitPrefix> unitPrefix;

    /**
     * <code>IEnumerable{IEnumerable}<code/> that references the composite properties of the current <code>ReferenceDataLibrary<code/>.
     *
     * @see Iterable
     * @see ReferenceDataLibrary
     */
    public Iterable<Iterable> containerLists;

    /**
     * Gets a list of ordered QuantityKind.
     * collection of references to the QuantityKinds that are selected as a basis of the system of quantities defined in this ReferenceDataLibrary
     * Note 1: This is a subset of the complete set of QuantityKinds. The base quantities define the basis for the quantity dimension of a kind of quantity.
     * Note 2: If a QuantityKind is in this collection and thus a base QuantityKind, then this base QuantityKind is considered to be primary kind of quantity for the MeasurementUnit of the <i>defaultScale</i> MeasurementScale.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    public OrderedItemList<QuantityKind> getBaseQuantityKind(){
         return this.baseQuantityKind;
    }

    /**
     * Gets a list of MeasurementUnit.
     * specification of the base MeasurementUnits for the system of units
     * defined in this ReferenceDataLibrary
     * Note: A "base unit" is defined in [VIM] as a "measurement unit that is
     * adopted by convention for a base quantity", i.e. it is the (preferred)
     * unit in which base quantities of the associated system of quantities are
     * expressed.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ArrayList<MeasurementUnit> getBaseUnit(){
         return this.baseUnit;
    }

    /**
     * Gets a list of contained Constant.
     * contained collection of Constants
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Constant> getConstant(){
         return this.constant;
    }

    /**
     * Gets a list of contained Category.
     * collection of defined, i.e. known, Categories
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Category> getDefinedCategory(){
         return this.definedCategory;
    }

    /**
     * Gets a list of contained FileType.
     * collection of defined, i.e. known, FileTypes
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<FileType> getFileType(){
         return this.fileType;
    }

    /**
     * Gets a list of contained Glossary.
     * contained collection of Glossaries
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Glossary> getGlossary(){
         return this.glossary;
    }

    /**
     * Gets a list of contained ParameterType.
     * contained collection of ParameterTypes
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ParameterType> getParameterType(){
         return this.parameterType;
    }

    /**
     * Gets a list of contained ReferenceSource.
     * contained collection of ReferenceSources
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<ReferenceSource> getReferenceSource(){
         return this.referenceSource;
    }

    /**
     * Gets the requiredRdl.
     * optional reference to the required next higher level ReferenceDataLibrary
     * Note: This property allows chaining an ordered list of ReferenceDataLibraries for use within an EngineeringModel. Its implementation shall have a similar effect as an "import" or "include" statement in a programming language. There shall not be any circular references in the list. This property is empty for the top level ReferenceDataLibrary.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public SiteReferenceDataLibrary getRequiredRdl(){
         return this.requiredRdl;
    }

    /**
     * Gets a list of contained Rule.
     * collection of defined, i.e. known, Rules
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<Rule> getRule(){
         return this.rule;
    }

    /**
     * Gets a list of contained MeasurementScale.
     * contained collection of MeasurementScales
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<MeasurementScale> getScale(){
         return this.scale;
    }

    /**
     * Gets a list of contained MeasurementUnit.
     * contained collection of MeasurementUnits
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<MeasurementUnit> getUnit(){
         return this.unit;
    }

    /**
     * Gets a list of contained UnitPrefix.
     * collection of zero or more UnitPrefix instances that define the prefixes for multiples and submultiples of (metric) MeasurementUnits
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public ContainerList<UnitPrefix> getUnitPrefix(){
         return this.unitPrefix;
    }

    /**
     * Sets a list of ordered QuantityKind.
     * collection of references to the QuantityKinds that are selected as a basis of the system of quantities defined in this ReferenceDataLibrary
     * Note 1: This is a subset of the complete set of QuantityKinds. The base quantities define the basis for the quantity dimension of a kind of quantity.
     * Note 2: If a QuantityKind is in this collection and thus a base QuantityKind, then this base QuantityKind is considered to be primary kind of quantity for the MeasurementUnit of the <i>defaultScale</i> MeasurementScale.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
     public void setBaseQuantityKind(OrderedItemList<QuantityKind> baseQuantityKind){
        this.baseQuantityKind = baseQuantityKind;
    }

    /**
     * Sets a list of MeasurementUnit.
     * specification of the base MeasurementUnits for the system of units
     * defined in this ReferenceDataLibrary
     * Note: A "base unit" is defined in [VIM] as a "measurement unit that is
     * adopted by convention for a base quantity", i.e. it is the (preferred)
     * unit in which base quantities of the associated system of quantities are
     * expressed.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setBaseUnit(ArrayList<MeasurementUnit> baseUnit){
        this.baseUnit = baseUnit;
    }

    /**
     * Sets a list of contained Constant.
     * contained collection of Constants
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setConstant(ContainerList<Constant> constant){
        this.constant = constant;
    }

    /**
     * Sets a list of contained Category.
     * collection of defined, i.e. known, Categories
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setDefinedCategory(ContainerList<Category> definedCategory){
        this.definedCategory = definedCategory;
    }

    /**
     * Sets a list of contained FileType.
     * collection of defined, i.e. known, FileTypes
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setFileType(ContainerList<FileType> fileType){
        this.fileType = fileType;
    }

    /**
     * Sets a list of contained Glossary.
     * contained collection of Glossaries
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setGlossary(ContainerList<Glossary> glossary){
        this.glossary = glossary;
    }

    /**
     * Sets a list of contained ParameterType.
     * contained collection of ParameterTypes
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setParameterType(ContainerList<ParameterType> parameterType){
        this.parameterType = parameterType;
    }

    /**
     * Sets a list of contained ReferenceSource.
     * contained collection of ReferenceSources
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setReferenceSource(ContainerList<ReferenceSource> referenceSource){
        this.referenceSource = referenceSource;
    }

    /**
     * Sets the requiredRdl.
     * optional reference to the required next higher level ReferenceDataLibrary
     * Note: This property allows chaining an ordered list of ReferenceDataLibraries for use within an EngineeringModel. Its implementation shall have a similar effect as an "import" or "include" statement in a programming language. There shall not be any circular references in the list. This property is empty for the top level ReferenceDataLibrary.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setRequiredRdl(SiteReferenceDataLibrary requiredRdl){
        this.requiredRdl = requiredRdl;
    }

    /**
     * Sets a list of contained Rule.
     * collection of defined, i.e. known, Rules
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setRule(ContainerList<Rule> rule){
        this.rule = rule;
    }

    /**
     * Sets a list of contained MeasurementScale.
     * contained collection of MeasurementScales
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setScale(ContainerList<MeasurementScale> scale){
        this.scale = scale;
    }

    /**
     * Sets a list of contained MeasurementUnit.
     * contained collection of MeasurementUnits
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setUnit(ContainerList<MeasurementUnit> unit){
        this.unit = unit;
    }

    /**
     * Sets a list of contained UnitPrefix.
     * collection of zero or more UnitPrefix instances that define the prefixes for multiples and submultiples of (metric) MeasurementUnits
     */
    @UmlInformation(aggregation = AggregationKind.COMPOSITE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     protected void setUnitPrefix(ContainerList<UnitPrefix> unitPrefix){
        this.unitPrefix = unitPrefix;
    }

    /**
     * Gets an <code>Iterable<Iterable><code/> that references the composite properties of the current <code>ReferenceDataLibrary<code/>.
     *
     * @see Iterable
     * @see ReferenceDataLibrary
     */
    @Override
    public Iterable<Iterable> getContainerLists {
        List<Iterable> containers = new ArrayList<Iterable>(super.getContainerLists());
        containers.Add(this.constant);
        containers.Add(this.definedCategory);
        containers.Add(this.fileType);
        containers.Add(this.glossary);
        containers.Add(this.parameterType);
        containers.Add(this.referenceSource);
        containers.Add(this.rule);
        containers.Add(this.scale);
        containers.Add(this.unit);
        containers.Add(this.unitPrefix);
        return containers;
    }

    /**
     * Creates and returns a copy of this <code>ReferenceDataLibrary<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ReferenceDataLibrary<code/>.
     * 
     * @see ReferenceDataLibrary
     */
    @Override
    public ReferenceDataLibrary clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ReferenceDataLibrary)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ReferenceDataLibrary<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ReferenceDataLibrary
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        return errorList;
    }
}