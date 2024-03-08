/*
 * QueryAttributesImpl.java
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

package cdp4dal.dal.ecss1025annexc;

import cdp4dal.dal.DalQueryAttributes;
import cdp4dal.dal.QueryAttributes;
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
 * The ECSS 1025 Annex C request query attributes. Appended to the query if required.
 */
@Getter
@Setter
@FieldNameConstants(innerTypeName = "FieldNames", level = AccessLevel.PACKAGE)
public class QueryAttributesImpl extends DalQueryAttributes {

  /**
   * Converts all values of this {@link QueryAttributes} class to a uri attributes String.
   *
   * @return The {@link String} in the form ?param1=value1 separated by an ampersand.
   */
  @Override
  public String toString() {
    String attributeString = this.joinAttributes();
    return Strings.isNullOrEmpty(attributeString) ? "" : String.format("?%s", attributeString);
  }

  /**
   * Joins the attributes into a single String
   *
   * @return The {@link String} with all the attributes separated by a ampersand.
   */
  @Override
  public String joinAttributes() {
    List<String> attributeList = new ArrayList<>();

    if (this.getExtent() != null) {
      attributeList.add(String.format("extent=%s", this.getExtent()));
    }

    if (this.getIncludeReferenceData() != null) {
      attributeList.add(String.format("includeReferenceData=%s", this.getIncludeReferenceData()));
    }

    if (this.getIncludeAllContainers() != null) {
      attributeList.add(String.format("includeAllContainers=%s", this.getIncludeAllContainers()));
    }

    if (this.getIncludeFileData() != null) {
      attributeList.add(String.format("includeFileData=%s", this.getIncludeFileData()));
    }

    // include the base attribute list
    String baseJoinedAttributes = super.joinAttributes();
    if (!Strings.isNullOrEmpty(baseJoinedAttributes)) {
      attributeList.add(baseJoinedAttributes);
    }

    if (attributeList.size() == 0) {
      return "";
    }

    return String.join("&", attributeList);
  }
}
