/*
 * DalMetaData.java
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
package cdp4dal.composition;

/**
 * The purpose of the {@link DalMetaData} interface is to define a Name property to be used in
 * conjunction with a custom {@link DalExportAttribute}. This interface also carries the type of Dal
 * it is used with.
 */
public interface DalMetaData extends NameMetaData {

  /**
   * Gets the type of the object
   */
  DalType getDalType();

  /**
   * Gets the maximum CDP Model version that is supported
   */
  String getCdpVersion();
}