/*
 * QueryAttributes.java
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

package cdp4dal.dal.protocol;

/**
 * The QueryAttributes interface.
 */
public interface QueryAttributes {

  /**
   * Converts all values of this {@link QueryAttributes} class to a uri attributes String.
   *
   * @return The {@link String} in the form ?param1=value1 separated by an ampersand.
   */
  String toString();

  /**
   * Joins the attributes into a single String.
   *
   * @return The {@link String} with all the attributes separated by a ampersand.
   */
  String joinAttributes();

  /**
   * Gets the revision number.
   *
   * @return A revision number from this {@link QueryAttributes}.
   */
  Integer getRevisionNumber();

  /**
   * Sets the revision number.
   *
   * @param revisionNumber A revision number to set as a parameter.
   */
  Integer setRevisionNumber(Integer revisionNumber);
}
