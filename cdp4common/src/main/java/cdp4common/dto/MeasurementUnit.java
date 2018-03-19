/* --------------------------------------------------------------------------------------------------------------------
 * MeasurementUnit.java
 * Copyright (c) 2018 RHEA System S.A.
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
import org.apache.commons.lang3.tuple.Pair;
import com.google.common.cache.Cache;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.xml.bind.annotation.XmlTransient;

/**
 * A Data Transfer Object representation of the {@link "MeasurementUnit"} class.
 */
@Container(clazz = ReferenceDataLibrary.class, propertyName = "unit")
@ToString
@EqualsAndHashCode(callSuper = true)
public abstract class MeasurementUnit extends DefinedThing implements Cloneable, DeprecatableThing {
    /**
     * Initializes a new instance of the {@link "MeasurementUnit"} class.
     */
    protected MeasurementUnit()
    {
    }

    /**
     * Initializes a new instance of the {@link "MeasurementUnit"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    protected MeasurementUnit(UUID iid, int rev) {
        super(iid, rev);
    }

    /**
     * Value indicating whether isDeprecated.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private boolean isDeprecated;

    /**
     * Gets the route for the current {@link MeasurementUnit}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }
}