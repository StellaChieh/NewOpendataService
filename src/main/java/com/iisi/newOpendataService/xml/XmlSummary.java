//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2018.10.23 於 10:35:02 AM CST 
//


package com.iisi.newOpendataService.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datasetID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="datasetName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataItemID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sent" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msgType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="publisherOID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resources">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="resource">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="metadata">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="resourceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="resourceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="resourceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="homepage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="sources">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="source" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="temporal">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="spatial">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="statistics">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="statisticalPeriods">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="statisticalPeriod">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="periodTagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="weatherElement" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="statisticalMethods">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="statisticalMethod" maxOccurs="unbounded">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="methodTagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                               &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="data">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="surfaceObs">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="location" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="station">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="stationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="stationNameEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="stationAttribute" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="stationObsStatistics">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="stationPressure">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                               &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                               &lt;element name="monthly" maxOccurs="unbounded">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                                         &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="temperature">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                               &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                               &lt;element name="monthly" maxOccurs="unbounded">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                                         &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                         &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                         &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                         &lt;element name="maxGE30Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                         &lt;element name="meanGE25Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                         &lt;element name="minLE10Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="relativeHumidity">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                               &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                               &lt;element name="monthly" maxOccurs="unbounded">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                                         &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="cloudCover">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                               &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                               &lt;element name="monthly" maxOccurs="unbounded">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                                         &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="sunshineDuration">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                               &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                               &lt;element name="monthly" maxOccurs="unbounded">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                                         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="precipitation">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                               &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                               &lt;element name="monthly" maxOccurs="unbounded">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                                         &lt;element name="accumulation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                         &lt;element name="GE01Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="windSpeed">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                               &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                               &lt;element name="monthly" maxOccurs="unbounded">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                                                                                         &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "identifier",
    "datasetID",
    "datasetName",
    "dataItemID",
    "sender",
    "sent",
    "status",
    "scope",
    "msgType",
    "publisherOID",
    "resources"
})
@XmlRootElement(name = "cwbdata")
public class XmlSummary {

    @XmlElement(required = true)
    protected String identifier;
    @XmlElement(required = true)
    protected String datasetID;
    @XmlElement(required = true)
    protected String datasetName;
    @XmlElement(required = true)
    protected String dataItemID;
    @XmlElement(required = true)
    protected String sender;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sent;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String scope;
    @XmlElement(required = true)
    protected String msgType;
    @XmlElement(required = true)
    protected String publisherOID;
    @XmlElement(required = true)
    protected XmlSummary.Resources resources;

    /**
     * 取得 identifier 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * 設定 identifier 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * 取得 datasetID 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetID() {
        return datasetID;
    }

    /**
     * 設定 datasetID 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetID(String value) {
        this.datasetID = value;
    }

    /**
     * 取得 datasetName 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatasetName() {
        return datasetName;
    }

    /**
     * 設定 datasetName 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatasetName(String value) {
        this.datasetName = value;
    }

    /**
     * 取得 dataItemID 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataItemID() {
        return dataItemID;
    }

    /**
     * 設定 dataItemID 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataItemID(String value) {
        this.dataItemID = value;
    }

    /**
     * 取得 sender 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSender() {
        return sender;
    }

    /**
     * 設定 sender 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSender(String value) {
        this.sender = value;
    }

    /**
     * 取得 sent 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSent() {
        return sent;
    }

    /**
     * 設定 sent 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSent(XMLGregorianCalendar value) {
        this.sent = value;
    }

    /**
     * 取得 status 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 取得 scope 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * 設定 scope 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * 取得 msgType 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * 設定 msgType 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgType(String value) {
        this.msgType = value;
    }

    /**
     * 取得 publisherOID 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherOID() {
        return publisherOID;
    }

    /**
     * 設定 publisherOID 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherOID(String value) {
        this.publisherOID = value;
    }

    /**
     * 取得 resources 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link XmlSummary.Resources }
     *     
     */
    public XmlSummary.Resources getResources() {
        return resources;
    }

    /**
     * 設定 resources 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlSummary.Resources }
     *     
     */
    public void setResources(XmlSummary.Resources value) {
        this.resources = value;
    }


    /**
     * <p>anonymous complex type 的 Java 類別.
     * 
     * <p>下列綱要片段會指定此類別中包含的預期內容.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="resource">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="metadata">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="resourceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="resourceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="resourceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="homepage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="sources">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="source" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="temporal">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="spatial">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="statistics">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="statisticalPeriods">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="statisticalPeriod">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="periodTagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="weatherElement" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="statisticalMethods">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="statisticalMethod" maxOccurs="unbounded">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="methodTagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                     &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="data">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="surfaceObs">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="location" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="station">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="stationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="stationNameEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="stationAttribute" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="stationObsStatistics">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="stationPressure">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                     &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                     &lt;element name="monthly" maxOccurs="unbounded">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                               &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="temperature">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                     &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                     &lt;element name="monthly" maxOccurs="unbounded">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                               &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                               &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                               &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                               &lt;element name="maxGE30Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                               &lt;element name="meanGE25Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                               &lt;element name="minLE10Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="relativeHumidity">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                     &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                     &lt;element name="monthly" maxOccurs="unbounded">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                               &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="cloudCover">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                     &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                     &lt;element name="monthly" maxOccurs="unbounded">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                               &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="sunshineDuration">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                     &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                     &lt;element name="monthly" maxOccurs="unbounded">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                               &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="precipitation">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                     &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                     &lt;element name="monthly" maxOccurs="unbounded">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                               &lt;element name="accumulation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                               &lt;element name="GE01Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="windSpeed">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                     &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                     &lt;element name="monthly" maxOccurs="unbounded">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                                                                               &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resource"
    })
    public static class Resources {

        @XmlElement(required = true)
        protected XmlSummary.Resources.Resource resource;

        /**
         * 取得 resource 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link XmlSummary.Resources.Resource }
         *     
         */
        public XmlSummary.Resources.Resource getResource() {
            return resource;
        }

        /**
         * 設定 resource 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link XmlSummary.Resources.Resource }
         *     
         */
        public void setResource(XmlSummary.Resources.Resource value) {
            this.resource = value;
        }


        /**
         * <p>anonymous complex type 的 Java 類別.
         * 
         * <p>下列綱要片段會指定此類別中包含的預期內容.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="metadata">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="resourceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="resourceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="resourceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="homepage" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="sources">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="source" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="temporal">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="spatial">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="statistics">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="statisticalPeriods">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="statisticalPeriod">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="periodTagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="weatherElement" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="statisticalMethods">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="statisticalMethod" maxOccurs="unbounded">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="methodTagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                           &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="data">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="surfaceObs">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="location" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="station">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="stationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="stationNameEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="stationAttribute" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="stationObsStatistics">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="stationPressure">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                           &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                           &lt;element name="monthly" maxOccurs="unbounded">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                                     &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                   &lt;/sequence>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="temperature">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                           &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                           &lt;element name="monthly" maxOccurs="unbounded">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                                     &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                     &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                     &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                     &lt;element name="maxGE30Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                     &lt;element name="meanGE25Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                     &lt;element name="minLE10Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                   &lt;/sequence>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="relativeHumidity">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                           &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                           &lt;element name="monthly" maxOccurs="unbounded">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                                     &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                   &lt;/sequence>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="cloudCover">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                           &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                           &lt;element name="monthly" maxOccurs="unbounded">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                                     &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                   &lt;/sequence>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="sunshineDuration">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                           &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                           &lt;element name="monthly" maxOccurs="unbounded">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                                     &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                   &lt;/sequence>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="precipitation">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                           &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                           &lt;element name="monthly" maxOccurs="unbounded">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                                     &lt;element name="accumulation" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                     &lt;element name="GE01Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                   &lt;/sequence>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="windSpeed">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                           &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                           &lt;element name="monthly" maxOccurs="unbounded">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *                                                                     &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                   &lt;/sequence>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "metadata",
            "data"
        })
        public static class Resource {

            @XmlElement(required = true)
            protected XmlSummary.Resources.Resource.Metadata metadata;
            @XmlElement(required = true)
            protected XmlSummary.Resources.Resource.Data data;

            /**
             * 取得 metadata 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link XmlSummary.Resources.Resource.Metadata }
             *     
             */
            public XmlSummary.Resources.Resource.Metadata getMetadata() {
                return metadata;
            }

            /**
             * 設定 metadata 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link XmlSummary.Resources.Resource.Metadata }
             *     
             */
            public void setMetadata(XmlSummary.Resources.Resource.Metadata value) {
                this.metadata = value;
            }

            /**
             * 取得 data 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link XmlSummary.Resources.Resource.Data }
             *     
             */
            public XmlSummary.Resources.Resource.Data getData() {
                return data;
            }

            /**
             * 設定 data 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link XmlSummary.Resources.Resource.Data }
             *     
             */
            public void setData(XmlSummary.Resources.Resource.Data value) {
                this.data = value;
            }


            /**
             * <p>anonymous complex type 的 Java 類別.
             * 
             * <p>下列綱要片段會指定此類別中包含的預期內容.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="surfaceObs">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="location" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="station">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="stationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="stationNameEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="stationAttribute" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="stationObsStatistics">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="stationPressure">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                 &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                 &lt;element name="monthly" maxOccurs="unbounded">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                           &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                         &lt;/sequence>
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="temperature">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                 &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                 &lt;element name="monthly" maxOccurs="unbounded">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                           &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                           &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                           &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                           &lt;element name="maxGE30Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                           &lt;element name="meanGE25Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                           &lt;element name="minLE10Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                         &lt;/sequence>
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="relativeHumidity">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                 &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                 &lt;element name="monthly" maxOccurs="unbounded">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                           &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                         &lt;/sequence>
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="cloudCover">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                 &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                 &lt;element name="monthly" maxOccurs="unbounded">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                           &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                         &lt;/sequence>
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="sunshineDuration">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                 &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                 &lt;element name="monthly" maxOccurs="unbounded">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                           &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                         &lt;/sequence>
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="precipitation">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                 &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                 &lt;element name="monthly" maxOccurs="unbounded">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                           &lt;element name="accumulation" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                           &lt;element name="GE01Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                         &lt;/sequence>
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="windSpeed">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                 &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                 &lt;element name="monthly" maxOccurs="unbounded">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
             *                                                           &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                         &lt;/sequence>
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "surfaceObs"
            })
            public static class Data {

                @XmlElement(required = true)
                protected XmlSummary.Resources.Resource.Data.SurfaceObs surfaceObs;

                /**
                 * 取得 surfaceObs 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs }
                 *     
                 */
                public XmlSummary.Resources.Resource.Data.SurfaceObs getSurfaceObs() {
                    return surfaceObs;
                }

                /**
                 * 設定 surfaceObs 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs }
                 *     
                 */
                public void setSurfaceObs(XmlSummary.Resources.Resource.Data.SurfaceObs value) {
                    this.surfaceObs = value;
                }


                /**
                 * <p>anonymous complex type 的 Java 類別.
                 * 
                 * <p>下列綱要片段會指定此類別中包含的預期內容.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="location" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="station">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="stationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="stationNameEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="stationAttribute" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="stationObsStatistics">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="stationPressure">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                       &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                       &lt;element name="monthly" maxOccurs="unbounded">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                                 &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                               &lt;/sequence>
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="temperature">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                       &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                       &lt;element name="monthly" maxOccurs="unbounded">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                                 &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                 &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                 &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                 &lt;element name="maxGE30Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                 &lt;element name="meanGE25Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                 &lt;element name="minLE10Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                               &lt;/sequence>
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="relativeHumidity">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                       &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                       &lt;element name="monthly" maxOccurs="unbounded">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                                 &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                               &lt;/sequence>
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="cloudCover">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                       &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                       &lt;element name="monthly" maxOccurs="unbounded">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                                 &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                               &lt;/sequence>
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="sunshineDuration">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                       &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                       &lt;element name="monthly" maxOccurs="unbounded">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                                 &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                               &lt;/sequence>
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="precipitation">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                       &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                       &lt;element name="monthly" maxOccurs="unbounded">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                                 &lt;element name="accumulation" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                 &lt;element name="GE01Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                               &lt;/sequence>
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="windSpeed">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                       &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                       &lt;element name="monthly" maxOccurs="unbounded">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                 *                                                 &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                               &lt;/sequence>
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "location"
                })
                public static class SurfaceObs {

                    @XmlElement(required = true)
                    protected List<XmlSummary.Resources.Resource.Data.SurfaceObs.Location> location;

                    /**
                     * Gets the value of the location property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the location property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLocation().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location }
                     * 
                     * 
                     */
                    public List<XmlSummary.Resources.Resource.Data.SurfaceObs.Location> getLocation() {
                        if (location == null) {
                            location = new ArrayList<XmlSummary.Resources.Resource.Data.SurfaceObs.Location>();
                        }
                        return this.location;
                    }


                    /**
                     * <p>anonymous complex type 的 Java 類別.
                     * 
                     * <p>下列綱要片段會指定此類別中包含的預期內容.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="station">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="stationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="stationNameEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="stationAttribute" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="stationObsStatistics">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="stationPressure">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                             &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                             &lt;element name="monthly" maxOccurs="unbounded">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                                       &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                     &lt;/sequence>
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="temperature">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                             &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                             &lt;element name="monthly" maxOccurs="unbounded">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                                       &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                       &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                       &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                       &lt;element name="maxGE30Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                       &lt;element name="meanGE25Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                       &lt;element name="minLE10Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                     &lt;/sequence>
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="relativeHumidity">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                             &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                             &lt;element name="monthly" maxOccurs="unbounded">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                                       &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                     &lt;/sequence>
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="cloudCover">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                             &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                             &lt;element name="monthly" maxOccurs="unbounded">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                                       &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                     &lt;/sequence>
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="sunshineDuration">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                             &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                             &lt;element name="monthly" maxOccurs="unbounded">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                                       &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                     &lt;/sequence>
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="precipitation">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                             &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                             &lt;element name="monthly" maxOccurs="unbounded">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                                       &lt;element name="accumulation" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                       &lt;element name="GE01Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                     &lt;/sequence>
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="windSpeed">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                             &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                             &lt;element name="monthly" maxOccurs="unbounded">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                     *                                       &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                     &lt;/sequence>
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "station",
                        "stationObsStatistics"
                    })
                    public static class Location {

                        @XmlElement(required = true)
                        protected XmlSummary.Resources.Resource.Data.SurfaceObs.Location.Station station;
                        @XmlElement(required = true)
                        protected XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics stationObsStatistics;

                        /**
                         * 取得 station 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.Station }
                         *     
                         */
                        public XmlSummary.Resources.Resource.Data.SurfaceObs.Location.Station getStation() {
                            return station;
                        }

                        /**
                         * 設定 station 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.Station }
                         *     
                         */
                        public void setStation(XmlSummary.Resources.Resource.Data.SurfaceObs.Location.Station value) {
                            this.station = value;
                        }

                        /**
                         * 取得 stationObsStatistics 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics }
                         *     
                         */
                        public XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics getStationObsStatistics() {
                            return stationObsStatistics;
                        }

                        /**
                         * 設定 stationObsStatistics 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics }
                         *     
                         */
                        public void setStationObsStatistics(XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics value) {
                            this.stationObsStatistics = value;
                        }


                        /**
                         * <p>anonymous complex type 的 Java 類別.
                         * 
                         * <p>下列綱要片段會指定此類別中包含的預期內容.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="stationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="stationNameEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="stationAttribute" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "stationID",
                            "stationName",
                            "stationNameEN",
                            "stationAttribute"
                        })
                        public static class Station {

                            @XmlElement(required = true)
                            protected String stationID;
                            @XmlElement(required = true)
                            protected String stationName;
                            @XmlElement(required = true)
                            protected String stationNameEN;
                            @XmlElement(required = true)
                            protected String stationAttribute;

                            /**
                             * 取得 stationID 特性的值.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getStationID() {
                                return stationID;
                            }

                            /**
                             * 設定 stationID 特性的值.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setStationID(String value) {
                                this.stationID = value;
                            }

                            /**
                             * 取得 stationName 特性的值.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getStationName() {
                                return stationName;
                            }

                            /**
                             * 設定 stationName 特性的值.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setStationName(String value) {
                                this.stationName = value;
                            }

                            /**
                             * 取得 stationNameEN 特性的值.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getStationNameEN() {
                                return stationNameEN;
                            }

                            /**
                             * 設定 stationNameEN 特性的值.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setStationNameEN(String value) {
                                this.stationNameEN = value;
                            }

                            /**
                             * 取得 stationAttribute 特性的值.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getStationAttribute() {
                                return stationAttribute;
                            }

                            /**
                             * 設定 stationAttribute 特性的值.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setStationAttribute(String value) {
                                this.stationAttribute = value;
                            }

                        }


                        /**
                         * <p>anonymous complex type 的 Java 類別.
                         * 
                         * <p>下列綱要片段會指定此類別中包含的預期內容.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="stationPressure">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                   &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                   &lt;element name="monthly" maxOccurs="unbounded">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                             &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                           &lt;/sequence>
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="temperature">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                   &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                   &lt;element name="monthly" maxOccurs="unbounded">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                             &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                             &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                             &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                             &lt;element name="maxGE30Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                             &lt;element name="meanGE25Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                             &lt;element name="minLE10Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                           &lt;/sequence>
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="relativeHumidity">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                   &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                   &lt;element name="monthly" maxOccurs="unbounded">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                             &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                           &lt;/sequence>
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="cloudCover">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                   &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                   &lt;element name="monthly" maxOccurs="unbounded">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                             &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                           &lt;/sequence>
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="sunshineDuration">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                   &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                   &lt;element name="monthly" maxOccurs="unbounded">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                             &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                           &lt;/sequence>
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="precipitation">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                   &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                   &lt;element name="monthly" maxOccurs="unbounded">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                             &lt;element name="accumulation" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                             &lt;element name="GE01Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                           &lt;/sequence>
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="windSpeed">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                   &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                   &lt;element name="monthly" maxOccurs="unbounded">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                         *                             &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                           &lt;/sequence>
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "stationPressure",
                            "temperature",
                            "relativeHumidity",
                            "cloudCover",
                            "sunshineDuration",
                            "precipitation",
                            "windSpeed"
                        })
                        public static class StationObsStatistics {

                            @XmlElement(required = true)
                            protected XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.StationPressure stationPressure;
                            @XmlElement(required = true)
                            protected XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature temperature;
                            @XmlElement(required = true)
                            protected XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.RelativeHumidity relativeHumidity;
                            @XmlElement(required = true)
                            protected XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.CloudCover cloudCover;
                            @XmlElement(required = true)
                            protected XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.SunshineDuration sunshineDuration;
                            @XmlElement(required = true)
                            protected XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Precipitation precipitation;
                            @XmlElement(required = true)
                            protected XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.WindSpeed windSpeed;

                            /**
                             * 取得 stationPressure 特性的值.
                             * 
                             * @return
                             *     possible object is
                             *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.StationPressure }
                             *     
                             */
                            public XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.StationPressure getStationPressure() {
                                return stationPressure;
                            }

                            /**
                             * 設定 stationPressure 特性的值.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.StationPressure }
                             *     
                             */
                            public void setStationPressure(XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.StationPressure value) {
                                this.stationPressure = value;
                            }

                            /**
                             * 取得 temperature 特性的值.
                             * 
                             * @return
                             *     possible object is
                             *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature }
                             *     
                             */
                            public XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature getTemperature() {
                                return temperature;
                            }

                            /**
                             * 設定 temperature 特性的值.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature }
                             *     
                             */
                            public void setTemperature(XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature value) {
                                this.temperature = value;
                            }

                            /**
                             * 取得 relativeHumidity 特性的值.
                             * 
                             * @return
                             *     possible object is
                             *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.RelativeHumidity }
                             *     
                             */
                            public XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.RelativeHumidity getRelativeHumidity() {
                                return relativeHumidity;
                            }

                            /**
                             * 設定 relativeHumidity 特性的值.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.RelativeHumidity }
                             *     
                             */
                            public void setRelativeHumidity(XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.RelativeHumidity value) {
                                this.relativeHumidity = value;
                            }

                            /**
                             * 取得 cloudCover 特性的值.
                             * 
                             * @return
                             *     possible object is
                             *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.CloudCover }
                             *     
                             */
                            public XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.CloudCover getCloudCover() {
                                return cloudCover;
                            }

                            /**
                             * 設定 cloudCover 特性的值.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.CloudCover }
                             *     
                             */
                            public void setCloudCover(XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.CloudCover value) {
                                this.cloudCover = value;
                            }

                            /**
                             * 取得 sunshineDuration 特性的值.
                             * 
                             * @return
                             *     possible object is
                             *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.SunshineDuration }
                             *     
                             */
                            public XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.SunshineDuration getSunshineDuration() {
                                return sunshineDuration;
                            }

                            /**
                             * 設定 sunshineDuration 特性的值.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.SunshineDuration }
                             *     
                             */
                            public void setSunshineDuration(XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.SunshineDuration value) {
                                this.sunshineDuration = value;
                            }

                            /**
                             * 取得 precipitation 特性的值.
                             * 
                             * @return
                             *     possible object is
                             *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Precipitation }
                             *     
                             */
                            public XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Precipitation getPrecipitation() {
                                return precipitation;
                            }

                            /**
                             * 設定 precipitation 特性的值.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Precipitation }
                             *     
                             */
                            public void setPrecipitation(XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Precipitation value) {
                                this.precipitation = value;
                            }

                            /**
                             * 取得 windSpeed 特性的值.
                             * 
                             * @return
                             *     possible object is
                             *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.WindSpeed }
                             *     
                             */
                            public XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.WindSpeed getWindSpeed() {
                                return windSpeed;
                            }

                            /**
                             * 設定 windSpeed 特性的值.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.WindSpeed }
                             *     
                             */
                            public void setWindSpeed(XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.WindSpeed value) {
                                this.windSpeed = value;
                            }


                            /**
                             * <p>anonymous complex type 的 Java 類別.
                             * 
                             * <p>下列綱要片段會指定此類別中包含的預期內容.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *         &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *         &lt;element name="monthly" maxOccurs="unbounded">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *                   &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                 &lt;/sequence>
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "startYear",
                                "endYear",
                                "monthly"
                            })
                            public static class CloudCover {

                                protected int startYear;
                                protected int endYear;
                                @XmlElement(required = true)
                                protected List<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.CloudCover.Monthly> monthly;

                                /**
                                 * 取得 startYear 特性的值.
                                 * 
                                 */
                                public int getStartYear() {
                                    return startYear;
                                }

                                /**
                                 * 設定 startYear 特性的值.
                                 * 
                                 */
                                public void setStartYear(int value) {
                                    this.startYear = value;
                                }

                                /**
                                 * 取得 endYear 特性的值.
                                 * 
                                 */
                                public int getEndYear() {
                                    return endYear;
                                }

                                /**
                                 * 設定 endYear 特性的值.
                                 * 
                                 */
                                public void setEndYear(int value) {
                                    this.endYear = value;
                                }

                                /**
                                 * Gets the value of the monthly property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the monthly property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getMonthly().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.CloudCover.Monthly }
                                 * 
                                 * 
                                 */
                                public List<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.CloudCover.Monthly> getMonthly() {
                                    if (monthly == null) {
                                        monthly = new ArrayList<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.CloudCover.Monthly>();
                                    }
                                    return this.monthly;
                                }


                                /**
                                 * <p>anonymous complex type 的 Java 類別.
                                 * 
                                 * <p>下列綱要片段會指定此類別中包含的預期內容.
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;complexContent>
                                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *       &lt;sequence>
                                 *         &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                                 *         &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *       &lt;/sequence>
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "dataMonth",
                                    "mean"
                                })
                                public static class Monthly {

                                    protected int dataMonth;
                                    @XmlElement(required = true)
                                    protected String mean;

                                    /**
                                     * 取得 dataMonth 特性的值.
                                     * 
                                     */
                                    public int getDataMonth() {
                                        return dataMonth;
                                    }

                                    /**
                                     * 設定 dataMonth 特性的值.
                                     * 
                                     */
                                    public void setDataMonth(int value) {
                                        this.dataMonth = value;
                                    }

                                    /**
                                     * 取得 mean 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getMean() {
                                        return mean;
                                    }

                                    /**
                                     * 設定 mean 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setMean(String value) {
                                        this.mean = value;
                                    }

                                }

                            }


                            /**
                             * <p>anonymous complex type 的 Java 類別.
                             * 
                             * <p>下列綱要片段會指定此類別中包含的預期內容.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *         &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *         &lt;element name="monthly" maxOccurs="unbounded">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *                   &lt;element name="accumulation" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                   &lt;element name="GE01Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                 &lt;/sequence>
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "startYear",
                                "endYear",
                                "monthly"
                            })
                            public static class Precipitation {

                                protected int startYear;
                                protected int endYear;
                                @XmlElement(required = true)
                                protected List<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Precipitation.Monthly> monthly;

                                /**
                                 * 取得 startYear 特性的值.
                                 * 
                                 */
                                public int getStartYear() {
                                    return startYear;
                                }

                                /**
                                 * 設定 startYear 特性的值.
                                 * 
                                 */
                                public void setStartYear(int value) {
                                    this.startYear = value;
                                }

                                /**
                                 * 取得 endYear 特性的值.
                                 * 
                                 */
                                public int getEndYear() {
                                    return endYear;
                                }

                                /**
                                 * 設定 endYear 特性的值.
                                 * 
                                 */
                                public void setEndYear(int value) {
                                    this.endYear = value;
                                }

                                /**
                                 * Gets the value of the monthly property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the monthly property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getMonthly().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Precipitation.Monthly }
                                 * 
                                 * 
                                 */
                                public List<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Precipitation.Monthly> getMonthly() {
                                    if (monthly == null) {
                                        monthly = new ArrayList<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Precipitation.Monthly>();
                                    }
                                    return this.monthly;
                                }


                                /**
                                 * <p>anonymous complex type 的 Java 類別.
                                 * 
                                 * <p>下列綱要片段會指定此類別中包含的預期內容.
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;complexContent>
                                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *       &lt;sequence>
                                 *         &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                                 *         &lt;element name="accumulation" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *         &lt;element name="GE01Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *       &lt;/sequence>
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "dataMonth",
                                    "accumulation",
                                    "ge01Days"
                                })
                                public static class Monthly {

                                    protected int dataMonth;
                                    @XmlElement(required = true)
                                    protected String accumulation;
                                    @XmlElement(name = "GE01Days", required = true)
                                    protected String ge01Days;

                                    /**
                                     * 取得 dataMonth 特性的值.
                                     * 
                                     */
                                    public int getDataMonth() {
                                        return dataMonth;
                                    }

                                    /**
                                     * 設定 dataMonth 特性的值.
                                     * 
                                     */
                                    public void setDataMonth(int value) {
                                        this.dataMonth = value;
                                    }

                                    /**
                                     * 取得 accumulation 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getAccumulation() {
                                        return accumulation;
                                    }

                                    /**
                                     * 設定 accumulation 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setAccumulation(String value) {
                                        this.accumulation = value;
                                    }

                                    /**
                                     * 取得 ge01Days 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getGE01Days() {
                                        return ge01Days;
                                    }

                                    /**
                                     * 設定 ge01Days 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setGE01Days(String value) {
                                        this.ge01Days = value;
                                    }

                                }

                            }


                            /**
                             * <p>anonymous complex type 的 Java 類別.
                             * 
                             * <p>下列綱要片段會指定此類別中包含的預期內容.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *         &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *         &lt;element name="monthly" maxOccurs="unbounded">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *                   &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                 &lt;/sequence>
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "startYear",
                                "endYear",
                                "monthly"
                            })
                            public static class RelativeHumidity {

                                protected int startYear;
                                protected int endYear;
                                @XmlElement(required = true)
                                protected List<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.RelativeHumidity.Monthly> monthly;

                                /**
                                 * 取得 startYear 特性的值.
                                 * 
                                 */
                                public int getStartYear() {
                                    return startYear;
                                }

                                /**
                                 * 設定 startYear 特性的值.
                                 * 
                                 */
                                public void setStartYear(int value) {
                                    this.startYear = value;
                                }

                                /**
                                 * 取得 endYear 特性的值.
                                 * 
                                 */
                                public int getEndYear() {
                                    return endYear;
                                }

                                /**
                                 * 設定 endYear 特性的值.
                                 * 
                                 */
                                public void setEndYear(int value) {
                                    this.endYear = value;
                                }

                                /**
                                 * Gets the value of the monthly property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the monthly property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getMonthly().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.RelativeHumidity.Monthly }
                                 * 
                                 * 
                                 */
                                public List<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.RelativeHumidity.Monthly> getMonthly() {
                                    if (monthly == null) {
                                        monthly = new ArrayList<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.RelativeHumidity.Monthly>();
                                    }
                                    return this.monthly;
                                }


                                /**
                                 * <p>anonymous complex type 的 Java 類別.
                                 * 
                                 * <p>下列綱要片段會指定此類別中包含的預期內容.
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;complexContent>
                                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *       &lt;sequence>
                                 *         &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                                 *         &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *       &lt;/sequence>
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "dataMonth",
                                    "mean"
                                })
                                public static class Monthly {

                                    protected int dataMonth;
                                    @XmlElement(required = true)
                                    protected String mean;

                                    /**
                                     * 取得 dataMonth 特性的值.
                                     * 
                                     */
                                    public int getDataMonth() {
                                        return dataMonth;
                                    }

                                    /**
                                     * 設定 dataMonth 特性的值.
                                     * 
                                     */
                                    public void setDataMonth(int value) {
                                        this.dataMonth = value;
                                    }

                                    /**
                                     * 取得 mean 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getMean() {
                                        return mean;
                                    }

                                    /**
                                     * 設定 mean 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setMean(String value) {
                                        this.mean = value;
                                    }

                                }

                            }


                            /**
                             * <p>anonymous complex type 的 Java 類別.
                             * 
                             * <p>下列綱要片段會指定此類別中包含的預期內容.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *         &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *         &lt;element name="monthly" maxOccurs="unbounded">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *                   &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                 &lt;/sequence>
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "startYear",
                                "endYear",
                                "monthly"
                            })
                            public static class StationPressure {

                                protected int startYear;
                                protected int endYear;
                                @XmlElement(required = true)
                                protected List<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.StationPressure.Monthly> monthly;

                                /**
                                 * 取得 startYear 特性的值.
                                 * 
                                 */
                                public int getStartYear() {
                                    return startYear;
                                }

                                /**
                                 * 設定 startYear 特性的值.
                                 * 
                                 */
                                public void setStartYear(int value) {
                                    this.startYear = value;
                                }

                                /**
                                 * 取得 endYear 特性的值.
                                 * 
                                 */
                                public int getEndYear() {
                                    return endYear;
                                }

                                /**
                                 * 設定 endYear 特性的值.
                                 * 
                                 */
                                public void setEndYear(int value) {
                                    this.endYear = value;
                                }

                                /**
                                 * Gets the value of the monthly property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the monthly property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getMonthly().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.StationPressure.Monthly }
                                 * 
                                 * 
                                 */
                                public List<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.StationPressure.Monthly> getMonthly() {
                                    if (monthly == null) {
                                        monthly = new ArrayList<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.StationPressure.Monthly>();
                                    }
                                    return this.monthly;
                                }


                                /**
                                 * <p>anonymous complex type 的 Java 類別.
                                 * 
                                 * <p>下列綱要片段會指定此類別中包含的預期內容.
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;complexContent>
                                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *       &lt;sequence>
                                 *         &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                                 *         &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *       &lt;/sequence>
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "dataMonth",
                                    "mean"
                                })
                                public static class Monthly {

                                    protected int dataMonth;
                                    @XmlElement(required = true)
                                    protected String mean;

                                    /**
                                     * 取得 dataMonth 特性的值.
                                     * 
                                     */
                                    public int getDataMonth() {
                                        return dataMonth;
                                    }

                                    /**
                                     * 設定 dataMonth 特性的值.
                                     * 
                                     */
                                    public void setDataMonth(int value) {
                                        this.dataMonth = value;
                                    }

                                    /**
                                     * 取得 mean 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getMean() {
                                        return mean;
                                    }

                                    /**
                                     * 設定 mean 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setMean(String value) {
                                        this.mean = value;
                                    }

                                }

                            }


                            /**
                             * <p>anonymous complex type 的 Java 類別.
                             * 
                             * <p>下列綱要片段會指定此類別中包含的預期內容.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *         &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *         &lt;element name="monthly" maxOccurs="unbounded">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *                   &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                 &lt;/sequence>
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "startYear",
                                "endYear",
                                "monthly"
                            })
                            public static class SunshineDuration {

                                protected int startYear;
                                protected int endYear;
                                @XmlElement(required = true)
                                protected List<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.SunshineDuration.Monthly> monthly;

                                /**
                                 * 取得 startYear 特性的值.
                                 * 
                                 */
                                public int getStartYear() {
                                    return startYear;
                                }

                                /**
                                 * 設定 startYear 特性的值.
                                 * 
                                 */
                                public void setStartYear(int value) {
                                    this.startYear = value;
                                }

                                /**
                                 * 取得 endYear 特性的值.
                                 * 
                                 */
                                public int getEndYear() {
                                    return endYear;
                                }

                                /**
                                 * 設定 endYear 特性的值.
                                 * 
                                 */
                                public void setEndYear(int value) {
                                    this.endYear = value;
                                }

                                /**
                                 * Gets the value of the monthly property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the monthly property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getMonthly().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.SunshineDuration.Monthly }
                                 * 
                                 * 
                                 */
                                public List<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.SunshineDuration.Monthly> getMonthly() {
                                    if (monthly == null) {
                                        monthly = new ArrayList<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.SunshineDuration.Monthly>();
                                    }
                                    return this.monthly;
                                }


                                /**
                                 * <p>anonymous complex type 的 Java 類別.
                                 * 
                                 * <p>下列綱要片段會指定此類別中包含的預期內容.
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;complexContent>
                                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *       &lt;sequence>
                                 *         &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                                 *         &lt;element name="total" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *       &lt;/sequence>
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "dataMonth",
                                    "total"
                                })
                                public static class Monthly {

                                    protected int dataMonth;
                                    @XmlElement(required = true)
                                    protected String total;

                                    /**
                                     * 取得 dataMonth 特性的值.
                                     * 
                                     */
                                    public int getDataMonth() {
                                        return dataMonth;
                                    }

                                    /**
                                     * 設定 dataMonth 特性的值.
                                     * 
                                     */
                                    public void setDataMonth(int value) {
                                        this.dataMonth = value;
                                    }

                                    /**
                                     * 取得 total 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getTotal() {
                                        return total;
                                    }

                                    /**
                                     * 設定 total 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setTotal(String value) {
                                        this.total = value;
                                    }

                                }

                            }


                            /**
                             * <p>anonymous complex type 的 Java 類別.
                             * 
                             * <p>下列綱要片段會指定此類別中包含的預期內容.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *         &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *         &lt;element name="monthly" maxOccurs="unbounded">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *                   &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                   &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                   &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                   &lt;element name="maxGE30Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                   &lt;element name="meanGE25Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                   &lt;element name="minLE10Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                 &lt;/sequence>
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "startYear",
                                "endYear",
                                "monthly"
                            })
                            public static class Temperature {

                                protected int startYear;
                                protected int endYear;
                                @XmlElement(required = true)
                                protected List<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature.Monthly> monthly;

                                /**
                                 * 取得 startYear 特性的值.
                                 * 
                                 */
                                public int getStartYear() {
                                    return startYear;
                                }

                                /**
                                 * 設定 startYear 特性的值.
                                 * 
                                 */
                                public void setStartYear(int value) {
                                    this.startYear = value;
                                }

                                /**
                                 * 取得 endYear 特性的值.
                                 * 
                                 */
                                public int getEndYear() {
                                    return endYear;
                                }

                                /**
                                 * 設定 endYear 特性的值.
                                 * 
                                 */
                                public void setEndYear(int value) {
                                    this.endYear = value;
                                }

                                /**
                                 * Gets the value of the monthly property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the monthly property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getMonthly().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature.Monthly }
                                 * 
                                 * 
                                 */
                                public List<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature.Monthly> getMonthly() {
                                    if (monthly == null) {
                                        monthly = new ArrayList<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature.Monthly>();
                                    }
                                    return this.monthly;
                                }


                                /**
                                 * <p>anonymous complex type 的 Java 類別.
                                 * 
                                 * <p>下列綱要片段會指定此類別中包含的預期內容.
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;complexContent>
                                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *       &lt;sequence>
                                 *         &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                                 *         &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *         &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *         &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *         &lt;element name="maxGE30Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *         &lt;element name="meanGE25Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *         &lt;element name="minLE10Days" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *       &lt;/sequence>
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "dataMonth",
                                    "mean",
                                    "maximum",
                                    "minimum",
                                    "maxGE30Days",
                                    "meanGE25Days",
                                    "minLE10Days"
                                })
                                public static class Monthly {

                                    protected int dataMonth;
                                    @XmlElement(required = true)
                                    protected String mean;
                                    @XmlElement(required = true)
                                    protected String maximum;
                                    @XmlElement(required = true)
                                    protected String minimum;
                                    @XmlElement(required = true)
                                    protected String maxGE30Days;
                                    @XmlElement(required = true)
                                    protected String meanGE25Days;
                                    @XmlElement(required = true)
                                    protected String minLE10Days;

                                    /**
                                     * 取得 dataMonth 特性的值.
                                     * 
                                     */
                                    public int getDataMonth() {
                                        return dataMonth;
                                    }

                                    /**
                                     * 設定 dataMonth 特性的值.
                                     * 
                                     */
                                    public void setDataMonth(int value) {
                                        this.dataMonth = value;
                                    }

                                    /**
                                     * 取得 mean 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getMean() {
                                        return mean;
                                    }

                                    /**
                                     * 設定 mean 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setMean(String value) {
                                        this.mean = value;
                                    }

                                    /**
                                     * 取得 maximum 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getMaximum() {
                                        return maximum;
                                    }

                                    /**
                                     * 設定 maximum 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setMaximum(String value) {
                                        this.maximum = value;
                                    }

                                    /**
                                     * 取得 minimum 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getMinimum() {
                                        return minimum;
                                    }

                                    /**
                                     * 設定 minimum 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setMinimum(String value) {
                                        this.minimum = value;
                                    }

                                    /**
                                     * 取得 maxGE30Days 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getMaxGE30Days() {
                                        return maxGE30Days;
                                    }

                                    /**
                                     * 設定 maxGE30Days 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setMaxGE30Days(String value) {
                                        this.maxGE30Days = value;
                                    }

                                    /**
                                     * 取得 meanGE25Days 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getMeanGE25Days() {
                                        return meanGE25Days;
                                    }

                                    /**
                                     * 設定 meanGE25Days 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setMeanGE25Days(String value) {
                                        this.meanGE25Days = value;
                                    }

                                    /**
                                     * 取得 minLE10Days 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getMinLE10Days() {
                                        return minLE10Days;
                                    }

                                    /**
                                     * 設定 minLE10Days 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setMinLE10Days(String value) {
                                        this.minLE10Days = value;
                                    }

                                }

                            }


                            /**
                             * <p>anonymous complex type 的 Java 類別.
                             * 
                             * <p>下列綱要片段會指定此類別中包含的預期內容.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="startYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *         &lt;element name="endYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *         &lt;element name="monthly" maxOccurs="unbounded">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                             *                   &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                 &lt;/sequence>
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "startYear",
                                "endYear",
                                "monthly"
                            })
                            public static class WindSpeed {

                                protected int startYear;
                                protected int endYear;
                                @XmlElement(required = true)
                                protected List<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.WindSpeed.Monthly> monthly;

                                /**
                                 * 取得 startYear 特性的值.
                                 * 
                                 */
                                public int getStartYear() {
                                    return startYear;
                                }

                                /**
                                 * 設定 startYear 特性的值.
                                 * 
                                 */
                                public void setStartYear(int value) {
                                    this.startYear = value;
                                }

                                /**
                                 * 取得 endYear 特性的值.
                                 * 
                                 */
                                public int getEndYear() {
                                    return endYear;
                                }

                                /**
                                 * 設定 endYear 特性的值.
                                 * 
                                 */
                                public void setEndYear(int value) {
                                    this.endYear = value;
                                }

                                /**
                                 * Gets the value of the monthly property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the monthly property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getMonthly().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.WindSpeed.Monthly }
                                 * 
                                 * 
                                 */
                                public List<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.WindSpeed.Monthly> getMonthly() {
                                    if (monthly == null) {
                                        monthly = new ArrayList<XmlSummary.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.WindSpeed.Monthly>();
                                    }
                                    return this.monthly;
                                }


                                /**
                                 * <p>anonymous complex type 的 Java 類別.
                                 * 
                                 * <p>下列綱要片段會指定此類別中包含的預期內容.
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;complexContent>
                                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *       &lt;sequence>
                                 *         &lt;element name="dataMonth" type="{http://www.w3.org/2001/XMLSchema}int"/>
                                 *         &lt;element name="mean" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *       &lt;/sequence>
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "dataMonth",
                                    "mean"
                                })
                                public static class Monthly {

                                    protected int dataMonth;
                                    @XmlElement(required = true)
                                    protected String mean;

                                    /**
                                     * 取得 dataMonth 特性的值.
                                     * 
                                     */
                                    public int getDataMonth() {
                                        return dataMonth;
                                    }

                                    /**
                                     * 設定 dataMonth 特性的值.
                                     * 
                                     */
                                    public void setDataMonth(int value) {
                                        this.dataMonth = value;
                                    }

                                    /**
                                     * 取得 mean 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getMean() {
                                        return mean;
                                    }

                                    /**
                                     * 設定 mean 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setMean(String value) {
                                        this.mean = value;
                                    }

                                }

                            }

                        }

                    }

                }

            }


            /**
             * <p>anonymous complex type 的 Java 類別.
             * 
             * <p>下列綱要片段會指定此類別中包含的預期內容.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="resourceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="resourceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="resourceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="homepage" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="sources">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="source" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="temporal">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="spatial">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="statistics">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="statisticalPeriods">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="statisticalPeriod">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="periodTagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="weatherElement" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="statisticalMethods">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="statisticalMethod" maxOccurs="unbounded">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="methodTagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                 &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "resourceID",
                "resourceName",
                "resourceDescription",
                "language",
                "homepage",
                "sources",
                "temporal",
                "spatial",
                "statistics"
            })
            public static class Metadata {

                @XmlElement(required = true)
                protected String resourceID;
                @XmlElement(required = true)
                protected String resourceName;
                @XmlElement(required = true)
                protected String resourceDescription;
                @XmlElement(required = true)
                protected String language;
                @XmlElement(required = true)
                protected String homepage;
                @XmlElement(required = true)
                protected XmlSummary.Resources.Resource.Metadata.Sources sources;
                @XmlElement(required = true)
                protected XmlSummary.Resources.Resource.Metadata.Temporal temporal;
                @XmlElement(required = true)
                protected XmlSummary.Resources.Resource.Metadata.Spatial spatial;
                @XmlElement(required = true)
                protected XmlSummary.Resources.Resource.Metadata.Statistics statistics;

                /**
                 * 取得 resourceID 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getResourceID() {
                    return resourceID;
                }

                /**
                 * 設定 resourceID 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setResourceID(String value) {
                    this.resourceID = value;
                }

                /**
                 * 取得 resourceName 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getResourceName() {
                    return resourceName;
                }

                /**
                 * 設定 resourceName 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setResourceName(String value) {
                    this.resourceName = value;
                }

                /**
                 * 取得 resourceDescription 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getResourceDescription() {
                    return resourceDescription;
                }

                /**
                 * 設定 resourceDescription 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setResourceDescription(String value) {
                    this.resourceDescription = value;
                }

                /**
                 * 取得 language 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLanguage() {
                    return language;
                }

                /**
                 * 設定 language 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLanguage(String value) {
                    this.language = value;
                }

                /**
                 * 取得 homepage 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getHomepage() {
                    return homepage;
                }

                /**
                 * 設定 homepage 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setHomepage(String value) {
                    this.homepage = value;
                }

                /**
                 * 取得 sources 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlSummary.Resources.Resource.Metadata.Sources }
                 *     
                 */
                public XmlSummary.Resources.Resource.Metadata.Sources getSources() {
                    return sources;
                }

                /**
                 * 設定 sources 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlSummary.Resources.Resource.Metadata.Sources }
                 *     
                 */
                public void setSources(XmlSummary.Resources.Resource.Metadata.Sources value) {
                    this.sources = value;
                }

                /**
                 * 取得 temporal 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlSummary.Resources.Resource.Metadata.Temporal }
                 *     
                 */
                public XmlSummary.Resources.Resource.Metadata.Temporal getTemporal() {
                    return temporal;
                }

                /**
                 * 設定 temporal 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlSummary.Resources.Resource.Metadata.Temporal }
                 *     
                 */
                public void setTemporal(XmlSummary.Resources.Resource.Metadata.Temporal value) {
                    this.temporal = value;
                }

                /**
                 * 取得 spatial 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlSummary.Resources.Resource.Metadata.Spatial }
                 *     
                 */
                public XmlSummary.Resources.Resource.Metadata.Spatial getSpatial() {
                    return spatial;
                }

                /**
                 * 設定 spatial 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlSummary.Resources.Resource.Metadata.Spatial }
                 *     
                 */
                public void setSpatial(XmlSummary.Resources.Resource.Metadata.Spatial value) {
                    this.spatial = value;
                }

                /**
                 * 取得 statistics 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlSummary.Resources.Resource.Metadata.Statistics }
                 *     
                 */
                public XmlSummary.Resources.Resource.Metadata.Statistics getStatistics() {
                    return statistics;
                }

                /**
                 * 設定 statistics 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlSummary.Resources.Resource.Metadata.Statistics }
                 *     
                 */
                public void setStatistics(XmlSummary.Resources.Resource.Metadata.Statistics value) {
                    this.statistics = value;
                }


                /**
                 * <p>anonymous complex type 的 Java 類別.
                 * 
                 * <p>下列綱要片段會指定此類別中包含的預期內容.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="source" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "source"
                })
                public static class Sources {

                    @XmlElement(required = true)
                    protected List<XmlSummary.Resources.Resource.Metadata.Sources.Source> source;

                    /**
                     * Gets the value of the source property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the source property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSource().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link XmlSummary.Resources.Resource.Metadata.Sources.Source }
                     * 
                     * 
                     */
                    public List<XmlSummary.Resources.Resource.Metadata.Sources.Source> getSource() {
                        if (source == null) {
                            source = new ArrayList<XmlSummary.Resources.Resource.Metadata.Sources.Source>();
                        }
                        return this.source;
                    }


                    /**
                     * <p>anonymous complex type 的 Java 類別.
                     * 
                     * <p>下列綱要片段會指定此類別中包含的預期內容.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "title",
                        "path"
                    })
                    public static class Source {

                        @XmlElement(required = true)
                        protected String title;
                        @XmlElement(required = true)
                        protected String path;

                        /**
                         * 取得 title 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTitle() {
                            return title;
                        }

                        /**
                         * 設定 title 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTitle(String value) {
                            this.title = value;
                        }

                        /**
                         * 取得 path 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getPath() {
                            return path;
                        }

                        /**
                         * 設定 path 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setPath(String value) {
                            this.path = value;
                        }

                    }

                }


                /**
                 * <p>anonymous complex type 的 Java 類別.
                 * 
                 * <p>下列綱要片段會指定此類別中包含的預期內容.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "description"
                })
                public static class Spatial {

                    @XmlElement(required = true)
                    protected String description;

                    /**
                     * 取得 description 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescription() {
                        return description;
                    }

                    /**
                     * 設定 description 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescription(String value) {
                        this.description = value;
                    }

                }


                /**
                 * <p>anonymous complex type 的 Java 類別.
                 * 
                 * <p>下列綱要片段會指定此類別中包含的預期內容.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="statisticalPeriods">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="statisticalPeriod">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="periodTagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="weatherElement" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="statisticalMethods">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="statisticalMethod" maxOccurs="unbounded">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="methodTagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "statisticalPeriods",
                    "weatherElement"
                })
                public static class Statistics {

                    @XmlElement(required = true)
                    protected XmlSummary.Resources.Resource.Metadata.Statistics.StatisticalPeriods statisticalPeriods;
                    @XmlElement(required = true)
                    protected List<XmlSummary.Resources.Resource.Metadata.Statistics.WeatherElement> weatherElement;

                    /**
                     * 取得 statisticalPeriods 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XmlSummary.Resources.Resource.Metadata.Statistics.StatisticalPeriods }
                     *     
                     */
                    public XmlSummary.Resources.Resource.Metadata.Statistics.StatisticalPeriods getStatisticalPeriods() {
                        return statisticalPeriods;
                    }

                    /**
                     * 設定 statisticalPeriods 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XmlSummary.Resources.Resource.Metadata.Statistics.StatisticalPeriods }
                     *     
                     */
                    public void setStatisticalPeriods(XmlSummary.Resources.Resource.Metadata.Statistics.StatisticalPeriods value) {
                        this.statisticalPeriods = value;
                    }

                    /**
                     * Gets the value of the weatherElement property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the weatherElement property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getWeatherElement().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link XmlSummary.Resources.Resource.Metadata.Statistics.WeatherElement }
                     * 
                     * 
                     */
                    public List<XmlSummary.Resources.Resource.Metadata.Statistics.WeatherElement> getWeatherElement() {
                        if (weatherElement == null) {
                            weatherElement = new ArrayList<XmlSummary.Resources.Resource.Metadata.Statistics.WeatherElement>();
                        }
                        return this.weatherElement;
                    }


                    /**
                     * <p>anonymous complex type 的 Java 類別.
                     * 
                     * <p>下列綱要片段會指定此類別中包含的預期內容.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="statisticalPeriod">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="periodTagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "statisticalPeriod"
                    })
                    public static class StatisticalPeriods {

                        @XmlElement(required = true)
                        protected XmlSummary.Resources.Resource.Metadata.Statistics.StatisticalPeriods.StatisticalPeriod statisticalPeriod;

                        /**
                         * 取得 statisticalPeriod 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XmlSummary.Resources.Resource.Metadata.Statistics.StatisticalPeriods.StatisticalPeriod }
                         *     
                         */
                        public XmlSummary.Resources.Resource.Metadata.Statistics.StatisticalPeriods.StatisticalPeriod getStatisticalPeriod() {
                            return statisticalPeriod;
                        }

                        /**
                         * 設定 statisticalPeriod 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XmlSummary.Resources.Resource.Metadata.Statistics.StatisticalPeriods.StatisticalPeriod }
                         *     
                         */
                        public void setStatisticalPeriod(XmlSummary.Resources.Resource.Metadata.Statistics.StatisticalPeriods.StatisticalPeriod value) {
                            this.statisticalPeriod = value;
                        }


                        /**
                         * <p>anonymous complex type 的 Java 類別.
                         * 
                         * <p>下列綱要片段會指定此類別中包含的預期內容.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="periodTagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "periodTagName",
                            "description"
                        })
                        public static class StatisticalPeriod {

                            @XmlElement(required = true)
                            protected String periodTagName;
                            @XmlElement(required = true)
                            protected String description;

                            /**
                             * 取得 periodTagName 特性的值.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getPeriodTagName() {
                                return periodTagName;
                            }

                            /**
                             * 設定 periodTagName 特性的值.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setPeriodTagName(String value) {
                                this.periodTagName = value;
                            }

                            /**
                             * 取得 description 特性的值.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getDescription() {
                                return description;
                            }

                            /**
                             * 設定 description 特性的值.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setDescription(String value) {
                                this.description = value;
                            }

                        }

                    }


                    /**
                     * <p>anonymous complex type 的 Java 類別.
                     * 
                     * <p>下列綱要片段會指定此類別中包含的預期內容.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="statisticalMethods">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="statisticalMethod" maxOccurs="unbounded">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="methodTagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "tagName",
                        "description",
                        "units",
                        "statisticalMethods"
                    })
                    public static class WeatherElement {

                        @XmlElement(required = true)
                        protected String tagName;
                        @XmlElement(required = true)
                        protected String description;
                        @XmlElement(required = true)
                        protected String units;
                        @XmlElement(required = true)
                        protected XmlSummary.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods statisticalMethods;

                        /**
                         * 取得 tagName 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getTagName() {
                            return tagName;
                        }

                        /**
                         * 設定 tagName 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setTagName(String value) {
                            this.tagName = value;
                        }

                        /**
                         * 取得 description 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDescription() {
                            return description;
                        }

                        /**
                         * 設定 description 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDescription(String value) {
                            this.description = value;
                        }

                        /**
                         * 取得 units 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getUnits() {
                            return units;
                        }

                        /**
                         * 設定 units 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setUnits(String value) {
                            this.units = value;
                        }

                        /**
                         * 取得 statisticalMethods 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XmlSummary.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods }
                         *     
                         */
                        public XmlSummary.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods getStatisticalMethods() {
                            return statisticalMethods;
                        }

                        /**
                         * 設定 statisticalMethods 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XmlSummary.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods }
                         *     
                         */
                        public void setStatisticalMethods(XmlSummary.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods value) {
                            this.statisticalMethods = value;
                        }


                        /**
                         * <p>anonymous complex type 的 Java 類別.
                         * 
                         * <p>下列綱要片段會指定此類別中包含的預期內容.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="statisticalMethod" maxOccurs="unbounded">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="methodTagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "statisticalMethod"
                        })
                        public static class StatisticalMethods {

                            @XmlElement(required = true)
                            protected List<XmlSummary.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods.StatisticalMethod> statisticalMethod;

                            /**
                             * Gets the value of the statisticalMethod property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the statisticalMethod property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getStatisticalMethod().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link XmlSummary.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods.StatisticalMethod }
                             * 
                             * 
                             */
                            public List<XmlSummary.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods.StatisticalMethod> getStatisticalMethod() {
                                if (statisticalMethod == null) {
                                    statisticalMethod = new ArrayList<XmlSummary.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods.StatisticalMethod>();
                                }
                                return this.statisticalMethod;
                            }


                            /**
                             * <p>anonymous complex type 的 Java 類別.
                             * 
                             * <p>下列綱要片段會指定此類別中包含的預期內容.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="methodTagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "methodTagName",
                                "description"
                            })
                            public static class StatisticalMethod {

                                @XmlElement(required = true)
                                protected String methodTagName;
                                @XmlElement(required = true)
                                protected String description;

                                /**
                                 * 取得 methodTagName 特性的值.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getMethodTagName() {
                                    return methodTagName;
                                }

                                /**
                                 * 設定 methodTagName 特性的值.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setMethodTagName(String value) {
                                    this.methodTagName = value;
                                }

                                /**
                                 * 取得 description 特性的值.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getDescription() {
                                    return description;
                                }

                                /**
                                 * 設定 description 特性的值.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setDescription(String value) {
                                    this.description = value;
                                }

                            }

                        }

                    }

                }


                /**
                 * <p>anonymous complex type 的 Java 類別.
                 * 
                 * <p>下列綱要片段會指定此類別中包含的預期內容.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "description"
                })
                public static class Temporal {

                    @XmlElement(required = true)
                    protected String description;

                    /**
                     * 取得 description 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescription() {
                        return description;
                    }

                    /**
                     * 設定 description 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescription(String value) {
                        this.description = value;
                    }

                }

            }

        }

    }

}
