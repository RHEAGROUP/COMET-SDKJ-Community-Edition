/* --------------------------------------------------------------------------------------------------------------------
 * ScaleValueDefinition.java
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
 * representation of a particular definitional scale value of a MeasurementScale
 * Note: The measurement scale and unit that apply to this <i>value</i> are defined by the MeasurementScale that contains this ScaleValueDefinition.
 */
@Container(clazz = MeasurementScale.class, propertyName = "valueDefinition")
public class ScaleValueDefinition extends AbstractScaleValueDefinition {
    /**
     * Initializes a new instance of the <code>ScaleValueDefinition<code/> class.
     *
     * @see ScaleValueDefinition
     */
    public ScaleValueDefinition() {
        super();
    }

    /**
     * Initializes a new instance of the <code>ScaleValueDefinition<code/> class.
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
     * @see ScaleValueDefinition
     */
    public ScaleValueDefinition(UUID iid, ConcurrentHashMap<Pair<UUID, UUID>, Lazy<Thing>> cache, URI iDalUri) {
        super(iid, cache, iDalUri);
    }
}
