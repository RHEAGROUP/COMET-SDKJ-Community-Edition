/* --------------------------------------------------------------------------------------------------------------------
 * FileRevision.java
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

import cdp4common.AggregationKind;
import cdp4common.Container;
import cdp4common.DataMember;
import cdp4common.UmlInformation;
import cdp4common.types.CacheKey;
import cdp4common.types.OrderedItem;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.cache.Cache;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * A Data Transfer Object representation of the {@link "FileRevision"} class.
 */
@Container(clazz = File.class, propertyName = "fileRevision")
@ToString
public class FileRevision extends Thing implements Cloneable, NamedThing, TimeStampedThing {
    /**
     * Initializes a new instance of the {@link "FileRevision"} class.
     */
    public FileRevision() {
        this.fileType = new ArrayList<OrderedItem>();
    }

    /**
     * Initializes a new instance of the {@link "FileRevision"} class.
     *
     * @param iid The unique identifier.
     * @param rev The revision number.
     */
    public FileRevision(UUID iid, int rev) {
        super(iid, rev);
        this.fileType = new ArrayList<OrderedItem>();
    }

    /**
     * The unique identifier of the referenced containingFolder.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = true, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID containingFolder;

    /**
     * The contentHash.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String contentHash;

    /**
     * The createdOn.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private LocalDateTime createdOn;

    /**
     * The unique identifier of the referenced creator.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private UUID creator;

    /**
     * The list of ordered unique identifiers of the referenced fileType instances.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = true, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private ArrayList<OrderedItem> fileType;

    /**
     * The name.
     */
    @UmlInformation(aggregation = AggregationKind.NONE, isDerived = false, isOrdered = false, isNullable = false, isPersistent = true)
    @DataMember
    @Getter
    @Setter
    private String name;

    /**
     * Gets the path.
     * @throws UnsupportedOperationException The path property is a derived property; when the getter is invoked an UnsupportedOperationException will be thrown.
     */
    @JsonIgnore
    public String getPath() {
        throw new UnsupportedOperationException("Forbidden Get value for the derived property FileRevision.path");
    }

    /**
     * Sets the path.
     * @throws UnsupportedOperationException The path property is a derived property; when the setter is invoked an UnsupportedOperationException will be thrown.
     */
    @JsonIgnore
    public void setPath(String path) {
        throw new UnsupportedOperationException("Forbidden Set value for the derived property FileRevision.path");
    }

    /**
     * Gets the route for the current {@link FileRevision}.
     */
    @Override
    public String getRoute() {
        return this.computedRoute();
    }

    /**
     * Instantiate a {@link cdp4common.engineeringmodeldata.FileRevision} from a {@link FileRevision}
     *
     * @param cache The cache that stores all the {@link cdp4common.commondata.Thing}
     * @param uri The {@link URI} of the {@link cdp4common.engineeringmodeldata.FileRevision}.
     * @return A new {@link cdp4common.commondata.Thing}
     */
    @Override
    public cdp4common.commondata.Thing instantiatePojo(Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.engineeringmodeldata.FileRevision(this.getIid(), cache, uri);
    }
}
