/* --------------------------------------------------------------------------------------------------------------------
 * LogEntryChangelogItem.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * The CDP4-SDKJ Community Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * This is an auto-generated DTO Class. Any manual changes to this file before a special comment
 *
 * // HAND-WRITTEN CODE GOES BELOW.
 * // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.
 *
 * will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.dto;

import java.util.*;
import java.util.stream.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
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

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A Data Transfer Object representation of the {@link LogEntryChangelogItem} class.
 */
@CDPVersion(version = "1.2.0")
@Container(clazz = LogEntry.class, propertyName = "logEntryChangelogItem")
@ToString
public class LogEntryChangelogItem extends Thing implements Cloneable {
    /**
     * Initializes a new instance of the {@link LogEntryChangelogItem} class.
     */
    public LogEntryChangelogItem() {
        this.affectedReferenceIid = new ArrayList<UUID>();
    }

    /**
     * Initializes a new instance of the {@link LogEntryChangelogItem} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public LogEntryChangelogItem(UUID iid, int rev) {
        super(iid, rev);
        this.affectedReferenceIid = new ArrayList<UUID>();
    }

    /**
     * The unique identifier of the referenced affectedItemIid.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID affectedItemIid;

    /**
     * The list of unique identifiers of the referenced affectedReferenceIid instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<UUID> affectedReferenceIid;

    /**
     * The changeDescription.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String changeDescription;

    /**
     * The changelogKind.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private LogEntryChangelogItemKind changelogKind;

    /**
     * Gets the route for the current {@link LogEntryChangelogItem}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.commondata.LogEntryChangelogItem} from a {@link LogEntryChangelogItem}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.commondata.LogEntryChangelogItem}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.commondata.LogEntryChangelogItem(this.getIid(), cache, uri);
    }
}