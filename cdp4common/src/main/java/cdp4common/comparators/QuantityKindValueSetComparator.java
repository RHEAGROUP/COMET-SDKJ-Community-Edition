/*
 * QuantityKindValueSetComparator.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené, Alexander van Delft
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

package cdp4common.comparators;

import cdp4common.types.ValueArray;

import java.util.Comparator;

/**
 * Default comparer to be used when comparing {@link ValueArray<String>}s of the QuantityKind type.
 */
public class QuantityKindValueSetComparator implements Comparator<ValueArray<String>> {

    /**
     * Compares two objects and returns a value indicating whether one is less than, equal to, or greater than the other.
     *
     * @param x The first object to compare.
     * @param y The second object to compare.
     * @return A signed integer that indicates the relative values of {@code x} and {@code y}, as shown in the following table.
     * Value
     * Meaning
     * Less than zero
     * {@code x} is less than {@code y}.
     * Zero
     * {@code x} equals {@code y}.
     * Greater than zero
     * {@code x} is greater than {@code y}.
     */
    public int compare(ValueArray<String> x, ValueArray<String> y) {
        var valueX = this.getValue(x);
        var valueY = this.getValue(y);

        return Double.compare(valueX, valueY);
    }

    /**
     * Gets value
     *
     * @param value to get double representation from
     * @return retrieved value
     */
    private double getValue(ValueArray<String> value) {
        try {
            return Double.parseDouble(value.get(0).replace(",", "."));
        } catch (Exception ex) {
            return 0D;
        }
    }
}
