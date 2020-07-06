/* --------------------------------------------------------------------------------------------------------------------
 * LogarithmicScale.java
 *
 * Copyright (c) 2015-2020 RHEA System S.A.
 *
 * Author: Alex Vorobiev, Yevhen Ikonnykov, Sam Gerené, Kamil Wojnowski
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
 * This is an auto-generated EMF Converter Class. Any manual changes to this file before a special comment
 *
 * // HAND-WRITTEN CODE GOES BELOW.
 * // DO NOT ADD ANYTHING ABOVE THIS COMMENT, BECAUSE IT WILL BE LOST DURING NEXT CODE GENERATION.
 *
 * will be overwritten!
 * --------------------------------------------------------------------------------------------------------------------
 */

package cdp4emfconnector;

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
import lombok.EqualsAndHashCode;

public class LogarithmicScale {

    public static CDP4.SiteDirectoryData.LogarithmicScale toEmf(cdp4common.sitedirectorydata.LogarithmicScale thing) {       
        
        
        CDP4.SiteDirectoryData.LogarithmicScale emf =  CDP4.SiteDirectoryData.impl.SiteDirectoryDataFactoryImpl.eINSTANCE.createLogarithmicScale();      
       
        emf.setIid(thing.getIid().toString()); 
        
        emf.getAlias().addAll(thing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toEmf(item)).collect(Collectors.toList()));
        
        emf.getDefinition().addAll(thing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedDomain().addAll(thing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toEmf(item)).collect(Collectors.toList()));
        
        emf.getExcludedPerson().addAll(thing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toEmf(item)).collect(Collectors.toList()));
        
        emf.setExponent(thing.getExponent());
        
        emf.setFactor(thing.getFactor());
        
        emf.getHyperLink().addAll(thing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toEmf(item)).collect(Collectors.toList()));
        
        emf.setIsDeprecated(thing.isDeprecated());
        
        emf.setIsMaximumInclusive(thing.isMaximumInclusive());
        
        emf.setIsMinimumInclusive(thing.isMinimumInclusive());
        
        if (thing.getLogarithmBase() != null) {emf.setLogarithmBase(CDP4.SiteDirectoryData.LogarithmBaseKind.valueOf(thing.getLogarithmBase().toString()));}                          
        
        emf.getMappingToReferenceScale().addAll(thing.getMappingToReferenceScale().stream().map(item -> cdp4emfconnector.MappingToReferenceScale.toEmf(item)).collect(Collectors.toList()));
        
        emf.setMaximumPermissibleValue(thing.getMaximumPermissibleValue());
        
        emf.setMinimumPermissibleValue(thing.getMinimumPermissibleValue());
        
        emf.setModifiedOn(thing.getModifiedOn());
        
        emf.setName(thing.getName());
        
        emf.setNegativeValueConnotation(thing.getNegativeValueConnotation());
        
        if (thing.getNumberSet() != null) {emf.setNumberSet(CDP4.SiteDirectoryData.NumberSetKind.valueOf(thing.getNumberSet().toString()));}                          
        
        emf.setPositiveValueConnotation(thing.getPositiveValueConnotation());
        
        emf.setReferenceQuantityKind(thing.getReferenceQuantityKind() != null ? cdp4emfconnector.QuantityKind.toEmf(thing.getReferenceQuantityKind()) : null);        
        
        emf.setReferenceQuantityValue(thing.getReferenceQuantityValue().stream().map(item -> cdp4emfconnector.ScaleReferenceQuantityValue.toEmf(item)).collect(Collectors.toList()).get(0));
        
        emf.setRevisionNumber(thing.getRevisionNumber());
        
        emf.setShortName(thing.getShortName());
        
        emf.setUnit(thing.getUnit() != null ? cdp4emfconnector.MeasurementUnit.toEmf(thing.getUnit()) : null);        
        
        emf.getValueDefinition().addAll(thing.getValueDefinition().stream().map(item -> cdp4emfconnector.ScaleValueDefinition.toEmf(item)).collect(Collectors.toList()));
        
        return emf;
        
    }

    public static  cdp4common.sitedirectorydata.LogarithmicScale toPojo(CDP4.SiteDirectoryData.LogarithmicScale emfThing) {
        
        
        cdp4common.sitedirectorydata.LogarithmicScale pojo = new cdp4common.sitedirectorydata.LogarithmicScale();
        
        pojo.setIid(UUID.fromString(emfThing.getIid())); 
        
        pojo.getAlias().addAll(emfThing.getAlias().stream().map(item -> cdp4emfconnector.Alias.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getDefinition().addAll(emfThing.getDefinition().stream().map(item -> cdp4emfconnector.Definition.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedDomain().addAll(emfThing.getExcludedDomain().stream().map(item -> cdp4emfconnector.DomainOfExpertise.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.getExcludedPerson().addAll(emfThing.getExcludedPerson().stream().map(item -> cdp4emfconnector.Person.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setExponent(emfThing.getExponent());
        
        pojo.setFactor(emfThing.getFactor());
        
        pojo.getHyperLink().addAll(emfThing.getHyperLink().stream().map(item -> cdp4emfconnector.HyperLink.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setDeprecated(emfThing.getIsDeprecated());
        
        pojo.setMaximumInclusive(emfThing.getIsMaximumInclusive());
        
        pojo.setMinimumInclusive(emfThing.getIsMinimumInclusive());
        
        if (emfThing.getLogarithmBase() != null) {pojo.setLogarithmBase(cdp4common.sitedirectorydata.LogarithmBaseKind.valueOf(emfThing.getLogarithmBase().toString()));}  
        
        pojo.getMappingToReferenceScale().addAll(emfThing.getMappingToReferenceScale().stream().map(item -> cdp4emfconnector.MappingToReferenceScale.toPojo(item)).collect(Collectors.toList()));              
        
        pojo.setMaximumPermissibleValue(emfThing.getMaximumPermissibleValue());
        
        pojo.setMinimumPermissibleValue(emfThing.getMinimumPermissibleValue());
        
        pojo.setModifiedOn(emfThing.getModifiedOn());
        
        pojo.setName(emfThing.getName());
        
        pojo.setNegativeValueConnotation(emfThing.getNegativeValueConnotation());
        
        if (emfThing.getNumberSet() != null) {pojo.setNumberSet(cdp4common.sitedirectorydata.NumberSetKind.valueOf(emfThing.getNumberSet().toString()));}  
        
        pojo.setPositiveValueConnotation(emfThing.getPositiveValueConnotation());
        
        pojo.setReferenceQuantityKind(emfThing.getReferenceQuantityKind() != null ? cdp4emfconnector.QuantityKind.toPojo(emfThing.getReferenceQuantityKind()) : null);        
        
        pojo.getReferenceQuantityValue().add(cdp4emfconnector.ScaleReferenceQuantityValue.toPojo(emfThing.getReferenceQuantityValue()));   
        
        pojo.setRevisionNumber(emfThing.getRevisionNumber());
        
        pojo.setShortName(emfThing.getShortName());
        
        pojo.setUnit(emfThing.getUnit() != null ? cdp4emfconnector.MeasurementUnit.toPojo(emfThing.getUnit()) : null);        
        
        pojo.getValueDefinition().addAll(emfThing.getValueDefinition().stream().map(item -> cdp4emfconnector.ScaleValueDefinition.toPojo(item)).collect(Collectors.toList()));              
        
        return pojo;
    	
     }

        
    public static cdp4common.sitedirectorydata.LogarithmicScale instiatePojo(CDP4.SiteDirectoryData.LogarithmicScale thing, Cache<CacheKey, cdp4common.commondata.Thing> cache, URI uri) {
        return new cdp4common.sitedirectorydata.LogarithmicScale(UUID.fromString(thing.getIid()), cache, uri);}
}