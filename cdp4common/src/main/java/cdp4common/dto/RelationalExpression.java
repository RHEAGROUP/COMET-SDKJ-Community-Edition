/* --------------------------------------------------------------------------------------------------------------------
 * RelationalExpression.java
 * Copyright (c) 2019 RHEA System S.A.
 *
 * This is an auto-generated DTO Class. Any manual changes to this file will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.dto;

import java.util.*;
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
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MoreCollectors;
import com.google.common.cache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlTransient;

/**
 * A Data Transfer Object representation of the {@link "RelationalExpression"} class.
 */
@Container(clazz = ParametricConstraint.class, propertyName = "expression")
@ToString
@EqualsAndHashCode(callSuper = true)
public class RelationalExpression extends BooleanExpression implements Cloneable {
    /**
     * Initializes a new instance of the {@link "RelationalExpression"} class.
     */
    public RelationalExpression() {
        this.value = new ValueArray<String>(String.class);
    }

    /**
     * Initializes a new instance of the {@link "RelationalExpression"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public RelationalExpression(UUID iid, int rev) {
        super(iid, rev);
        this.value = new ValueArray<String>(String.class);
    }

    /**
     * The unique identifier of the referenced parameterType.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID parameterType;

    /**
     * The relationalOperator.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private RelationalOperatorKind relationalOperator;

    /**
     * The unique identifier of the referenced scale.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID scale;

    /**
     * The list of ordered String.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ValueArray<String> value;

    /**
     * Gets the route for the current {@link RelationalExpression}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.RelationalExpression} from a {@link RelationalExpression}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.RelationalExpression}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.RelationalExpression(this.getIid(), cache, uri);
    }
}
