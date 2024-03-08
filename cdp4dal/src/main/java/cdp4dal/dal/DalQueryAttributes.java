/*
 * DalQueryAttributes.java
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
 */

package cdp4dal.dal;

import cdp4dal.dal.ecss1025annexc.ExtentQueryAttribute;
import com.google.common.base.Strings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;

/**
 * The base query attributes.
 */
@Getter
@Setter
@FieldNameConstants(innerTypeName = "FieldNames")
public class DalQueryAttributes implements QueryAttributes {

  /**
   * Gets or sets the {@link ExtentQueryAttribute} of the query.
   */
  protected ExtentQueryAttribute extent;

  /**
   * Gets or sets whether to query the include reference data.
   */
  protected Boolean includeReferenceData;

  /**
   * Gets or sets whether to include all containers.
   */
  protected Boolean includeAllContainers;

  /**
   * Gets or sets whether to include the file data.
   */
  protected Boolean includeFileData;

  /**
   * Gets or sets the revision number.
   */
  protected Integer revisionNumber;

  /**
   * Gets a dictionary of all attributes and attributes name
   *
   * @return A {@linkplain Map} of {@linkplain String} attribute name {@linkplain String} value
   */
  @Override
  public Map<String, String> toUriParameters() {
     Map parameters = new HashMap();

     if (this.getRevisionNumber() != null) {
        parameters.put(FieldNames.revisionNumber, String.valueOf(this.getRevisionNumber().intValue()));
     }

     if (this.getExtent() != null) {
       parameters.put(FieldNames.extent, this.getExtent().name());
     }

     if (this.getIncludeReferenceData() != null) {
       parameters.put(FieldNames.includeReferenceData, String.valueOf(this.getIncludeReferenceData().booleanValue()));
     }

     if (this.getIncludeAllContainers() != null) {
       parameters.put(FieldNames.includeAllContainers, String.valueOf(this.getIncludeAllContainers().booleanValue()));
     }

     if (this.getIncludeFileData() != null) {
       parameters.put(FieldNames.includeFileData, String.valueOf(this.getIncludeFileData().booleanValue()));
     }

    return parameters;
  }

  /**
   * Converts all values of this {@link DalQueryAttributes} class to a uri attributes String.
   *
   * @return The {@link String} in the form ?param1=value1 separated by an ampersand.
   */
  @Override
  public String toString() {
    String attributeString = this.joinAttributes();
    return Strings.isNullOrEmpty(attributeString) ? "" : String.format("?%s", attributeString);
  }

  /**
   * Joins the attributes into a single String.
   *
   * @return The {@link String} with all the attributes separated by a ampersand.
   */
  @Override
  public String joinAttributes() {
    List<String> attributeList = new ArrayList<>();

    if (this.getRevisionNumber() != null) {
      attributeList.add(String.format("revisionNumber=%s", this.getRevisionNumber()));
    }

    if (attributeList.size() == 0) {
      return "";
    }

    return String.join("&", attributeList);
  }
}
