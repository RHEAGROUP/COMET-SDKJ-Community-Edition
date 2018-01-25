/* --------------------------------------------------------------------------------------------------------------------
 * MappingToReferenceScale.java
 * Copyright (c) 2018 RHEA System S.A.
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4common.sitedirectorydata;

import java.util.*;
import java.util.concurrent.*;
import java.net.URI;
import cdp4common.*;
import cdp4common.commondata.*;
import cdp4common.diagramdata.*;
import cdp4common.engineeringmodeldata.*;
import cdp4common.reportingdata.*;
import cdp4common.sitedirectorydata.*;
import org.apache.commons.lang3.tuple.Pair;

/**
 * representation of a mapping of a value on a dependent MeasurementScale to a value on a reference MeasurementScale that represents the same quantity
 * Note 1: One or more of these mappings would be defined for a dependent MeasurementScale (the scale being mapped) with respect to a reference MeasurementScale (the scale being mapped to) in order to enable quantity value conversion.
 * Note 2: For conversion between measurement scales other than OrdinalScales, i.e. scales with a meaningful MeasurementUnit that defines intervals of one on that scale, a single MappingToReferenceScale implicitly defines the offset by which measurement values need to be transformed when converting from the dependent to the reference scale or vice versa.
 * Note 3: For conversion to or from an OrdinalScale, a complete set of MappingToReferenceScale instances would need to be defined, one for each value on the OrdinalScale, since for an OrdinalScale the intervals between the scale values do not have particular significance, and therefore the mapping cannot be represented by a simple (linear or logarithmic) transformation function.
 * Example: The mapping between the thermodynamic temperature RatioScale in kelvin (the reference scale) and the Celsius temperature IntervalScale in degree Celsius (the dependent scale) is defined by a MappingToReferenceScale with <i>referenceScaleValue.value</i> = 0.0 [K] and <i>dependentScaleValue.value</i> = -273.15 [°C].
 */
@Container(clazz = MeasurementScale.class, propertyName = "mappingToReferenceScale")
public class MappingToReferenceScale extends AbstractMappingToReferenceScale {
    /**
     * Initializes a new instance of the <code>MappingToReferenceScale<code/> class.
     *
     * @see MappingToReferenceScale
     */
    public MappingToReferenceScale() {
        super();
    }

    /**
     * Initializes a new instance of the <code>MappingToReferenceScale<code/> class.
     * @param iid The unique identifier.
     * @param cache The <code>ConcurrentHashMap<K,V></code> where the current thing is stored.
     * The <code>Pair<L,R><code/> of <code>UUID<code/> is the key used to store this thing.
     * The key is a combination of this thing's identifier and the identifier of its <code>Iteration<code/> container if applicable or null.
     * @param iDalUri The <code>URI</code> of this thing
     *
     * @see ConcurrentHashMap
     * @see URI
     * @see UUID
     * @see Pair
     * @see Iteration
     * @see MappingToReferenceScale
     */
    public MappingToReferenceScale(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
