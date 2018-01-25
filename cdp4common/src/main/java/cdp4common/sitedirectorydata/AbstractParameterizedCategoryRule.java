/* --------------------------------------------------------------------------------------------------------------------
 * AbstractParameterizedCategoryRule.java
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
 * Rule that asserts that one or more parameters of a given ParameterType should be defined for CategorizableThings that are a member of the associated Category
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "rule")
public abstract class AbstractParameterizedCategoryRule extends AbstractRule  {
    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final PersonAccessRightKind defaultPersonAccess = PersonAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Representation of the default value for the accessRight property of a PersonPermission for the affected class
     */
    public final ParticipantAccessRightKind defaultParticipantAccess = ParticipantAccessRightKind.S_A_M_E__A_S__S_U_P_E_R_C_L_A_S_S;

    /**
     * Initializes a new instance of the <code>ParameterizedCategoryRule<code/> class.
     *
     * @see ParameterizedCategoryRule
     */
    public AbstractParameterizedCategoryRule() {
        this.parameterType = new List<ParameterType>();
    }

    /**
     * Initializes a new instance of the <code>ParameterizedCategoryRule<code/> class.
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
     * @see ParameterizedCategoryRule
     */
    public AbstractParameterizedCategoryRule(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        this.parameterType = new List<ParameterType>();
    }

    /**
     * Property category.
     * reference to the Category to which this ParameterizableCategoryRule applies
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private Category category;

    /**
     * List of ParameterType.
     * collection of references to ParameterTypes this ParameterizableCategoryRule defines as mandatory
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    private List<ParameterType> parameterType;

    /**
     * Gets the category.
     * reference to the Category to which this ParameterizableCategoryRule applies
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public Category getCategory(){
         return this.category;
    }

    /**
     * Gets a list of ParameterType.
     * collection of references to ParameterTypes this ParameterizableCategoryRule defines as mandatory
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    public List<ParameterType> getParameterType(){
         return this.parameterType;
    }

    /**
     * Sets the category.
     * reference to the Category to which this ParameterizableCategoryRule applies
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setCategory(Category category){
        this.category = category;
    }

    /**
     * Sets a list of ParameterType.
     * collection of references to ParameterTypes this ParameterizableCategoryRule defines as mandatory
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
     public void setParameterType(List<ParameterType> parameterType){
        this.parameterType = parameterType;
    }

    /**
     * Creates and returns a copy of this <code>ParameterizedCategoryRule<code/> for edit purpose.
     *
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ParameterizedCategoryRule<code/>.
     *
     * @see ParameterizedCategoryRule
     * @see Thing
     */
    @Override
    protected Thing genericClone(boolean cloneContainedThings) throws CloneNotSupportedException {
        ParameterizedCategoryRule clone = (ParameterizedCategoryRule)this.clone();
        clone.setAlias(cloneContainedThings ? new ContainerList<Alias>(clone) : new ContainerList<Alias>(this.alias, clone));
        clone.setDefinition(cloneContainedThings ? new ContainerList<Definition>(clone) : new ContainerList<Definition>(this.definition, clone));
        clone.setExcludedDomain(new List<DomainOfExpertise>(this.excludedDomain));
        clone.setExcludedPerson(new List<Person>(this.excludedPerson));
        clone.setHyperLink(cloneContainedThings ? new ContainerList<HyperLink>(clone) : new ContainerList<HyperLink>(this.hyperLink, clone));
        clone.setParameterType(new List<ParameterType>(this.parameterType));

        if (cloneContainedThings) {
            clone.getAlias().addAll(this.alias.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getDefinition().addAll(this.definition.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
            clone.getHyperLink().addAll(this.hyperLink.stream().map(x -> x.Clone(true)).collect(Collectors.toList());
        }

        clone.setOriginal(this);
        clone.ResetCacheId();

        return clone;
    }

    /**
     * Creates and returns a copy of this <code>ParameterizedCategoryRule<code/> for edit purpose.
     * @param cloneContainedThings A value that indicates whether the contained <code>Thing<code/>s should be cloned or not.
     *
     * @return A cloned instance of <code>ParameterizedCategoryRule<code/>.
     * 
     * @see ParameterizedCategoryRule
     */
    @Override
    public ParameterizedCategoryRule clone(boolean cloneContainedThings) throws CloneNotSupportedException {
        this.setChangeKind(ChangeKind.UPDATE);

        return (ParameterizedCategoryRule)this.genericClone(cloneContainedThings);
    }

    /**
     * Validates the cardinalities of the properties of this <clone>ParameterizedCategoryRule<code/>.
     *
     * @return A list of potential errors.
     *
     * @see ParameterizedCategoryRule
     */
    protected Iterable<String> validatePocoCardinality() {
        List<String> errorList = new ArrayList<String>(super.validatePojoCardinality());

        if (this.category == null || this.category.getIid().equals(new UUID(0L, 0L))) {
            errorList.add("The property category is null.");
            this.category = SentinelThingProvider.getSentinel<Category>();
            this.sentinelResetMap["category"] = () -> this.category = null;
        }

        int parameterTypeCount = this.parameterType.size();
        if (parameterTypeCount < 1) {
            errorList.add("The number of elements in the property parameterType is wrong. It should be at least 1.");
        }

        return errorList;
    }

    /**
     * Resolve the properties of the current <code>ParameterizedCategoryRule<code/> from its <code>cdp4common.dto.Thing<code/> counter-part
     *
     * @param dtoThing The source <code>cdp4common.dto.Thing<code/>
     *
     * @see ParameterizedCategoryRule
     * @see cdp4common.dto.Thing
     */
    @Override
    void resolveProperties(cdp4common.dto.Thing dtoThing) {
        if (dtoThing == null) {
            throw new IllegalArgumentException("dtoThing");
        }

        cdp4common.dto.ParameterizedCategoryRule dto = (cdp4common.dto.ParameterizedCategoryRule)dtoThing;

        this.alias.resolveList(dto.getAlias(), dto.getIterationContainerId(), this.cache);
        this.category = this.cache.get<Category>(dto.getCategory(), dto.getIterationContainerId()) ?? SentinelThingProvider.getSentinel<Category>();
        this.definition.resolveList(dto.getDefinition(), dto.getIterationContainerId(), this.cache);
        this.excludedDomain.resolveList(dto.getExcludedDomain(), dto.getIterationContainerId(), this.cache);
        this.excludedPerson.resolveList(dto.getExcludedPerson(), dto.getIterationContainerId(), this.cache);
        this.hyperLink.resolveList(dto.getHyperLink(), dto.getIterationContainerId(), this.cache);
        this.isDeprecated = dto.getIsDeprecated();
        this.modifiedOn = dto.getModifiedOn();
        this.name = dto.getName();
        this.parameterType.resolveList(dto.getParameterType(), dto.getIterationContainerId(), this.cache);
        this.revisionNumber = dto.getRevisionNumber();
        this.shortName = dto.getShortName();

        this.resolveExtraProperties();
    }

    /**
     * Generates a <code>cdp4common.dto.Thing<code/> from the current <code>ParameterizedCategoryRule<code/>
     *
     * @return Generated <code>cdp4common.dto.Thing<code/>
     *
     * @see cdp4common.dto.Thing
     * @see ParameterizedCategoryRule
     */
    @Override
    public cdp4common.dto.Thing toDto() {
        cdp4common.dto.ParameterizedCategoryRule dto = new cdp4common.dto.ParameterizedCategoryRule(this.iid, this.revisionNumber);

        dto.getAlias().add(this.alias.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setCategory(this.category != null ? this.category.getIid() : new UUID(0L, 0L));
        dto.getDefinition().add(this.definition.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedDomain().add(this.excludedDomain.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getExcludedPerson().add(this.excludedPerson.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.getHyperLink().add(this.hyperLink.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setIsDeprecated(this.isDeprecated);
        dto.setModifiedOn(this.modifiedOn);
        dto.setName(this.name);
        dto.getParameterType().add(this.parameterType.stream().map(x -> x.Iid).collect(Collectors.toList()));
        dto.setRevisionNumber(this.revisionNumber);
        dto.setShortName(this.shortName);

        dto.setIterationContainerId(this.CacheId.Item2);
        dto.RegisterSourceThing(this);
        this.BuildDtoPartialRoutes(dto);

        return dto;
    }
}
