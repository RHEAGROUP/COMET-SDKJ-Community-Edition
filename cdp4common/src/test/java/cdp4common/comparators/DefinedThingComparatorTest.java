/*
 * DefinedThingComparatorTest.java
 *
 * Copyright (c) 2015-2019 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené
 *
 * This file is part of CDP4-SDKJ Community Edition
 *
 * The CDP4-SDKJ Community Edition is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
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

import cdp4common.engineeringmodeldata.Requirement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DefinedThingComparatorTest {
    @Test
    void testComparator() {
        var type1 = new Requirement();
        type1.setName("a");
        var type2 = new Requirement();
        type2.setName("c");

        var comparator = new DefinedThingComparator();

        assertEquals(-2, comparator.compare(type1, type2));
        assertEquals(2, comparator.compare(type2, type1));
        assertEquals(0, comparator.compare(type2, type2));
    }
}
