//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.07.19 於 02:53:30 PM CST 
//


package com.iisi.newOpendataService.xml;

import javax.xml.bind.annotation.XmlRegistry;

import org.springframework.stereotype.Service;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.iisi.cmt.opendata.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
@Service
public class XmlStationObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.iisi.cmt.opendata.xml
     * 
     */
    public XmlStationObjectFactory() {
    }

    /**
     * Create an instance of {@link XmlStation }
     * 
     */
    public XmlStation createCwbdata() {
        return new XmlStation();
    }

    /**
     * Create an instance of {@link XmlStation.Resources }
     * 
     */
    public XmlStation.Resources createCwbdataResources() {
        return new XmlStation.Resources();
    }

    /**
     * Create an instance of {@link XmlStation.Resources.Resource }
     * 
     */
    public XmlStation.Resources.Resource createCwbdataResourcesResource() {
        return new XmlStation.Resources.Resource();
    }

    /**
     * Create an instance of {@link XmlStation.Resources.Resource.Data }
     * 
     */
    public XmlStation.Resources.Resource.Data createCwbdataResourcesResourceData() {
        return new XmlStation.Resources.Resource.Data();
    }

    /**
     * Create an instance of {@link XmlStation.Resources.Resource.Data.StationsStatus }
     * 
     */
    public XmlStation.Resources.Resource.Data.StationsStatus createCwbdataResourcesResourceDataStationsStatus() {
        return new XmlStation.Resources.Resource.Data.StationsStatus();
    }

    /**
     * Create an instance of {@link XmlStation.Resources.Resource.Metadata }
     * 
     */
    public XmlStation.Resources.Resource.Metadata createCwbdataResourcesResourceMetadata() {
        return new XmlStation.Resources.Resource.Metadata();
    }

    /**
     * Create an instance of {@link XmlStation.Resources.Resource.Metadata.Fields }
     * 
     */
    public XmlStation.Resources.Resource.Metadata.Fields createCwbdataResourcesResourceMetadataFields() {
        return new XmlStation.Resources.Resource.Metadata.Fields();
    }

    /**
     * Create an instance of {@link XmlStation.Resources.Resource.Metadata.Spatial }
     * 
     */
    public XmlStation.Resources.Resource.Metadata.Spatial createCwbdataResourcesResourceMetadataSpatial() {
        return new XmlStation.Resources.Resource.Metadata.Spatial();
    }

    /**
     * Create an instance of {@link XmlStation.Resources.Resource.Data.StationsStatus.Station }
     * 
     */
    public XmlStation.Resources.Resource.Data.StationsStatus.Station createCwbdataResourcesResourceDataStationsStatusStation() {
        return new XmlStation.Resources.Resource.Data.StationsStatus.Station();
    }

    /**
     * Create an instance of {@link XmlStation.Resources.Resource.Metadata.Temporal }
     * 
     */
    public XmlStation.Resources.Resource.Metadata.Temporal createCwbdataResourcesResourceMetadataTemporal() {
        return new XmlStation.Resources.Resource.Metadata.Temporal();
    }

    /**
     * Create an instance of {@link XmlStation.Resources.Resource.Metadata.Fields.Field }
     * 
     */
    public XmlStation.Resources.Resource.Metadata.Fields.Field createCwbdataResourcesResourceMetadataFieldsField() {
        return new XmlStation.Resources.Resource.Metadata.Fields.Field();
    }

    /**
     * Create an instance of {@link XmlStation.Resources.Resource.Metadata.Spatial.CoordinateReferenceSystem }
     * 
     */
    public XmlStation.Resources.Resource.Metadata.Spatial.CoordinateReferenceSystem createCwbdataResourcesResourceMetadataSpatialCoordinateReferenceSystem() {
        return new XmlStation.Resources.Resource.Metadata.Spatial.CoordinateReferenceSystem();
    }

}
