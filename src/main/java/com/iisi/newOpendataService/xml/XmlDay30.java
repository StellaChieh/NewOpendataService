//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.10.04 於 11:16:26 AM CST 
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
 *                                                 &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                                                 &lt;element name="coordinateReferenceSystem">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="EPSGCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="coordinateFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                                       &lt;element name="weatherElements">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="weatherElement" maxOccurs="unbounded">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                           &lt;element name="specialValues">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="specialValue" maxOccurs="unbounded">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                                                           &lt;element name="statisticalPeriod" maxOccurs="unbounded">
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
 *                                                 &lt;element name="weatherElement">
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
 *                                                           &lt;element name="stationObsTimes">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="stationObsTime" maxOccurs="unbounded">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="dataTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                               &lt;element name="weatherElements">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="stationPressure" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                         &lt;element name="relativeHumidity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                         &lt;element name="windSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                         &lt;element name="windDirectionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                         &lt;element name="precipitation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                         &lt;element name="sunshineDuration" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                                                           &lt;element name="stationObsStatistics">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="temperature">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="daily" maxOccurs="unbounded">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                                                         &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                                         &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
public class XmlDay30 {

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
    protected XmlDay30.Resources resources;

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
     *     {@link XmlDay30.Resources }
     *     
     */
    public XmlDay30.Resources getResources() {
        return resources;
    }

    /**
     * 設定 resources 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlDay30.Resources }
     *     
     */
    public void setResources(XmlDay30.Resources value) {
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
     *                                       &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                                       &lt;element name="coordinateReferenceSystem">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="EPSGCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="coordinateFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                             &lt;element name="weatherElements">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="weatherElement" maxOccurs="unbounded">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                                 &lt;element name="specialValues">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="specialValue" maxOccurs="unbounded">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                                                 &lt;element name="statisticalPeriod" maxOccurs="unbounded">
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
     *                                       &lt;element name="weatherElement">
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
     *                                                 &lt;element name="stationObsTimes">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="stationObsTime" maxOccurs="unbounded">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="dataTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                     &lt;element name="weatherElements">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="stationPressure" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                               &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                               &lt;element name="relativeHumidity" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                               &lt;element name="windSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                               &lt;element name="windDirectionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                               &lt;element name="precipitation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                               &lt;element name="sunshineDuration" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
     *                                                 &lt;element name="stationObsStatistics">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="temperature">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="daily" maxOccurs="unbounded">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                                                               &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                                               &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        protected XmlDay30.Resources.Resource resource;

        /**
         * 取得 resource 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link XmlDay30.Resources.Resource }
         *     
         */
        public XmlDay30.Resources.Resource getResource() {
            return resource;
        }

        /**
         * 設定 resource 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link XmlDay30.Resources.Resource }
         *     
         */
        public void setResource(XmlDay30.Resources.Resource value) {
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
         *                             &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *                             &lt;element name="coordinateReferenceSystem">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="EPSGCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="coordinateFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *                   &lt;element name="weatherElements">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="weatherElement" maxOccurs="unbounded">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                                       &lt;element name="specialValues">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="specialValue" maxOccurs="unbounded">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *                                       &lt;element name="statisticalPeriod" maxOccurs="unbounded">
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
         *                             &lt;element name="weatherElement">
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
         *                                       &lt;element name="stationObsTimes">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="stationObsTime" maxOccurs="unbounded">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="dataTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                           &lt;element name="weatherElements">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="stationPressure" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                     &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                     &lt;element name="relativeHumidity" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                     &lt;element name="windSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                     &lt;element name="windDirectionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                     &lt;element name="precipitation" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                     &lt;element name="sunshineDuration" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
         *                                       &lt;element name="stationObsStatistics">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="temperature">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="daily" maxOccurs="unbounded">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                                                                     &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                                     &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected XmlDay30.Resources.Resource.Metadata metadata;
            @XmlElement(required = true)
            protected XmlDay30.Resources.Resource.Data data;

            /**
             * 取得 metadata 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link XmlDay30.Resources.Resource.Metadata }
             *     
             */
            public XmlDay30.Resources.Resource.Metadata getMetadata() {
                return metadata;
            }

            /**
             * 設定 metadata 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link XmlDay30.Resources.Resource.Metadata }
             *     
             */
            public void setMetadata(XmlDay30.Resources.Resource.Metadata value) {
                this.metadata = value;
            }

            /**
             * 取得 data 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link XmlDay30.Resources.Resource.Data }
             *     
             */
            public XmlDay30.Resources.Resource.Data getData() {
                return data;
            }

            /**
             * 設定 data 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link XmlDay30.Resources.Resource.Data }
             *     
             */
            public void setData(XmlDay30.Resources.Resource.Data value) {
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
             *                             &lt;element name="stationObsTimes">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="stationObsTime" maxOccurs="unbounded">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="dataTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                 &lt;element name="weatherElements">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="stationPressure" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                           &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                           &lt;element name="relativeHumidity" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                           &lt;element name="windSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                           &lt;element name="windDirectionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                           &lt;element name="precipitation" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                           &lt;element name="sunshineDuration" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
             *                             &lt;element name="stationObsStatistics">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="temperature">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="daily" maxOccurs="unbounded">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                                                           &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                                           &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                protected XmlDay30.Resources.Resource.Data.SurfaceObs surfaceObs;

                /**
                 * 取得 surfaceObs 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlDay30.Resources.Resource.Data.SurfaceObs }
                 *     
                 */
                public XmlDay30.Resources.Resource.Data.SurfaceObs getSurfaceObs() {
                    return surfaceObs;
                }

                /**
                 * 設定 surfaceObs 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlDay30.Resources.Resource.Data.SurfaceObs }
                 *     
                 */
                public void setSurfaceObs(XmlDay30.Resources.Resource.Data.SurfaceObs value) {
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
                 *                   &lt;element name="stationObsTimes">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="stationObsTime" maxOccurs="unbounded">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="dataTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                       &lt;element name="weatherElements">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="stationPressure" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                 &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                 &lt;element name="relativeHumidity" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                 &lt;element name="windSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                 &lt;element name="windDirectionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                 &lt;element name="precipitation" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                 &lt;element name="sunshineDuration" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                 *                   &lt;element name="stationObsStatistics">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="temperature">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="daily" maxOccurs="unbounded">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *                                                 &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                                                 &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    protected List<XmlDay30.Resources.Resource.Data.SurfaceObs.Location> location;

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
                     * {@link XmlDay30.Resources.Resource.Data.SurfaceObs.Location }
                     * 
                     * 
                     */
                    public List<XmlDay30.Resources.Resource.Data.SurfaceObs.Location> getLocation() {
                        if (location == null) {
                            location = new ArrayList<XmlDay30.Resources.Resource.Data.SurfaceObs.Location>();
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
                     *         &lt;element name="stationObsTimes">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="stationObsTime" maxOccurs="unbounded">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="dataTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                             &lt;element name="weatherElements">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="stationPressure" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                       &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                       &lt;element name="relativeHumidity" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                       &lt;element name="windSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                       &lt;element name="windDirectionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                       &lt;element name="precipitation" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                       &lt;element name="sunshineDuration" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                     *         &lt;element name="stationObsStatistics">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="temperature">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="daily" maxOccurs="unbounded">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
                     *                                       &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                                       &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                        "stationObsTimes",
                        "stationObsStatistics"
                    })
                    public static class Location {

                        @XmlElement(required = true)
                        protected XmlDay30.Resources.Resource.Data.SurfaceObs.Location.Station station;
                        @XmlElement(required = true)
                        protected XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes stationObsTimes;
                        @XmlElement(required = true)
                        protected XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics stationObsStatistics;

                        /**
                         * 取得 station 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XmlDay30.Resources.Resource.Data.SurfaceObs.Location.Station }
                         *     
                         */
                        public XmlDay30.Resources.Resource.Data.SurfaceObs.Location.Station getStation() {
                            return station;
                        }

                        /**
                         * 設定 station 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XmlDay30.Resources.Resource.Data.SurfaceObs.Location.Station }
                         *     
                         */
                        public void setStation(XmlDay30.Resources.Resource.Data.SurfaceObs.Location.Station value) {
                            this.station = value;
                        }

                        /**
                         * 取得 stationObsTimes 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes }
                         *     
                         */
                        public XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes getStationObsTimes() {
                            return stationObsTimes;
                        }

                        /**
                         * 設定 stationObsTimes 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes }
                         *     
                         */
                        public void setStationObsTimes(XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes value) {
                            this.stationObsTimes = value;
                        }

                        /**
                         * 取得 stationObsStatistics 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics }
                         *     
                         */
                        public XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics getStationObsStatistics() {
                            return stationObsStatistics;
                        }

                        /**
                         * 設定 stationObsStatistics 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics }
                         *     
                         */
                        public void setStationObsStatistics(XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics value) {
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
                         *         &lt;element name="temperature">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="daily" maxOccurs="unbounded">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
                         *                             &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                             &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                            "temperature"
                        })
                        public static class StationObsStatistics {

                            @XmlElement(required = true)
                            protected XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature temperature;

                            /**
                             * 取得 temperature 特性的值.
                             * 
                             * @return
                             *     possible object is
                             *     {@link XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature }
                             *     
                             */
                            public XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature getTemperature() {
                                return temperature;
                            }

                            /**
                             * 設定 temperature 特性的值.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature }
                             *     
                             */
                            public void setTemperature(XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature value) {
                                this.temperature = value;
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
                             *         &lt;element name="daily" maxOccurs="unbounded">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
                             *                   &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                   &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                                "daily"
                            })
                            public static class Temperature {

                                @XmlElement(required = true)
                                protected List<XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature.Daily> daily;

                                /**
                                 * Gets the value of the daily property.
                                 * 
                                 * <p>
                                 * This accessor method returns a reference to the live list,
                                 * not a snapshot. Therefore any modification you make to the
                                 * returned list will be present inside the JAXB object.
                                 * This is why there is not a <CODE>set</CODE> method for the daily property.
                                 * 
                                 * <p>
                                 * For example, to add a new item, do as follows:
                                 * <pre>
                                 *    getDaily().add(newItem);
                                 * </pre>
                                 * 
                                 * 
                                 * <p>
                                 * Objects of the following type(s) are allowed in the list
                                 * {@link XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature.Daily }
                                 * 
                                 * 
                                 */
                                public List<XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature.Daily> getDaily() {
                                    if (daily == null) {
                                        daily = new ArrayList<XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsStatistics.Temperature.Daily>();
                                    }
                                    return this.daily;
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
                                 *         &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
                                 *         &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *         &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                                    "dataDate",
                                    "maximum",
                                    "minimum",
                                    "mean"
                                })
                                public static class Daily {

                                    @XmlElement(required = true)
                                    @XmlSchemaType(name = "date")
                                    protected XMLGregorianCalendar dataDate;
                                    @XmlElement(required = true)
                                    protected String maximum;
                                    @XmlElement(required = true)
                                    protected String minimum;
                                    @XmlElement(required = true)
                                    protected String mean;

                                    /**
                                     * 取得 dataDate 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link XMLGregorianCalendar }
                                     *     
                                     */
                                    public XMLGregorianCalendar getDataDate() {
                                        return dataDate;
                                    }

                                    /**
                                     * 設定 dataDate 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link XMLGregorianCalendar }
                                     *     
                                     */
                                    public void setDataDate(XMLGregorianCalendar value) {
                                        this.dataDate = value;
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
                         *         &lt;element name="stationObsTime" maxOccurs="unbounded">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="dataTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                   &lt;element name="weatherElements">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="stationPressure" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                             &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                             &lt;element name="relativeHumidity" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                             &lt;element name="windSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                             &lt;element name="windDirectionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                             &lt;element name="precipitation" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *                             &lt;element name="sunshineDuration" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                            "stationObsTime"
                        })
                        public static class StationObsTimes {

                            @XmlElement(required = true)
                            protected List<XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes.StationObsTime> stationObsTime;

                            /**
                             * Gets the value of the stationObsTime property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the stationObsTime property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getStationObsTime().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes.StationObsTime }
                             * 
                             * 
                             */
                            public List<XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes.StationObsTime> getStationObsTime() {
                                if (stationObsTime == null) {
                                    stationObsTime = new ArrayList<XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes.StationObsTime>();
                                }
                                return this.stationObsTime;
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
                             *         &lt;element name="dataTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *         &lt;element name="weatherElements">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="stationPressure" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                   &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                   &lt;element name="relativeHumidity" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                   &lt;element name="windSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                   &lt;element name="windDirectionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                   &lt;element name="precipitation" type="{http://www.w3.org/2001/XMLSchema}string"/>
                             *                   &lt;element name="sunshineDuration" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                                "dataTime",
                                "weatherElements"
                            })
                            public static class StationObsTime {

                                @XmlElement(required = true)
                                protected String dataTime;
                                @XmlElement(required = true)
                                protected XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes.StationObsTime.WeatherElements weatherElements;

                                /**
                                 * 取得 dataTime 特性的值.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getDataTime() {
                                    return dataTime;
                                }

                                /**
                                 * 設定 dataTime 特性的值.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setDataTime(String value) {
                                    this.dataTime = value;
                                }

                                /**
                                 * 取得 weatherElements 特性的值.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes.StationObsTime.WeatherElements }
                                 *     
                                 */
                                public XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes.StationObsTime.WeatherElements getWeatherElements() {
                                    return weatherElements;
                                }

                                /**
                                 * 設定 weatherElements 特性的值.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes.StationObsTime.WeatherElements }
                                 *     
                                 */
                                public void setWeatherElements(XmlDay30.Resources.Resource.Data.SurfaceObs.Location.StationObsTimes.StationObsTime.WeatherElements value) {
                                    this.weatherElements = value;
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
                                 *         &lt;element name="stationPressure" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *         &lt;element name="temperature" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *         &lt;element name="relativeHumidity" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *         &lt;element name="windSpeed" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *         &lt;element name="windDirectionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *         &lt;element name="precipitation" type="{http://www.w3.org/2001/XMLSchema}string"/>
                                 *         &lt;element name="sunshineDuration" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                                    "windSpeed",
                                    "windDirectionDescription",
                                    "precipitation",
                                    "sunshineDuration"
                                })
                                public static class WeatherElements {

                                    @XmlElement(required = true)
                                    protected String stationPressure;
                                    @XmlElement(required = true)
                                    protected String temperature;
                                    @XmlElement(required = true)
                                    protected String relativeHumidity;
                                    @XmlElement(required = true)
                                    protected String windSpeed;
                                    @XmlElement(required = true)
                                    protected String windDirectionDescription;
                                    @XmlElement(required = true)
                                    protected String precipitation;
                                    @XmlElement(required = true)
                                    protected String sunshineDuration;

                                    /**
                                     * 取得 stationPressure 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getStationPressure() {
                                        return stationPressure;
                                    }

                                    /**
                                     * 設定 stationPressure 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setStationPressure(String value) {
                                        this.stationPressure = value;
                                    }

                                    /**
                                     * 取得 temperature 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getTemperature() {
                                        return temperature;
                                    }

                                    /**
                                     * 設定 temperature 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setTemperature(String value) {
                                        this.temperature = value;
                                    }

                                    /**
                                     * 取得 relativeHumidity 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getRelativeHumidity() {
                                        return relativeHumidity;
                                    }

                                    /**
                                     * 設定 relativeHumidity 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setRelativeHumidity(String value) {
                                        this.relativeHumidity = value;
                                    }

                                    /**
                                     * 取得 windSpeed 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getWindSpeed() {
                                        return windSpeed;
                                    }

                                    /**
                                     * 設定 windSpeed 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setWindSpeed(String value) {
                                        this.windSpeed = value;
                                    }

                                    /**
                                     * 取得 windDirectionDescription 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getWindDirectionDescription() {
                                        return windDirectionDescription;
                                    }

                                    /**
                                     * 設定 windDirectionDescription 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setWindDirectionDescription(String value) {
                                        this.windDirectionDescription = value;
                                    }

                                    /**
                                     * 取得 precipitation 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getPrecipitation() {
                                        return precipitation;
                                    }

                                    /**
                                     * 設定 precipitation 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setPrecipitation(String value) {
                                        this.precipitation = value;
                                    }

                                    /**
                                     * 取得 sunshineDuration 特性的值.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link String }
                                     *     
                                     */
                                    public String getSunshineDuration() {
                                        return sunshineDuration;
                                    }

                                    /**
                                     * 設定 sunshineDuration 特性的值.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link String }
                                     *     
                                     */
                                    public void setSunshineDuration(String value) {
                                        this.sunshineDuration = value;
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
             *                   &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
             *                   &lt;element name="coordinateReferenceSystem">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="EPSGCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="coordinateFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
             *         &lt;element name="weatherElements">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="weatherElement" maxOccurs="unbounded">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                             &lt;element name="specialValues">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="specialValue" maxOccurs="unbounded">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
             *                             &lt;element name="statisticalPeriod" maxOccurs="unbounded">
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
             *                   &lt;element name="weatherElement">
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
                "weatherElements",
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
                protected XmlDay30.Resources.Resource.Metadata.Sources sources;
                @XmlElement(required = true)
                protected XmlDay30.Resources.Resource.Metadata.Temporal temporal;
                @XmlElement(required = true)
                protected XmlDay30.Resources.Resource.Metadata.Spatial spatial;
                @XmlElement(required = true)
                protected XmlDay30.Resources.Resource.Metadata.WeatherElements weatherElements;
                @XmlElement(required = true)
                protected XmlDay30.Resources.Resource.Metadata.Statistics statistics;

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
                 *     {@link XmlDay30.Resources.Resource.Metadata.Sources }
                 *     
                 */
                public XmlDay30.Resources.Resource.Metadata.Sources getSources() {
                    return sources;
                }

                /**
                 * 設定 sources 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlDay30.Resources.Resource.Metadata.Sources }
                 *     
                 */
                public void setSources(XmlDay30.Resources.Resource.Metadata.Sources value) {
                    this.sources = value;
                }

                /**
                 * 取得 temporal 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlDay30.Resources.Resource.Metadata.Temporal }
                 *     
                 */
                public XmlDay30.Resources.Resource.Metadata.Temporal getTemporal() {
                    return temporal;
                }

                /**
                 * 設定 temporal 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlDay30.Resources.Resource.Metadata.Temporal }
                 *     
                 */
                public void setTemporal(XmlDay30.Resources.Resource.Metadata.Temporal value) {
                    this.temporal = value;
                }

                /**
                 * 取得 spatial 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlDay30.Resources.Resource.Metadata.Spatial }
                 *     
                 */
                public XmlDay30.Resources.Resource.Metadata.Spatial getSpatial() {
                    return spatial;
                }

                /**
                 * 設定 spatial 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlDay30.Resources.Resource.Metadata.Spatial }
                 *     
                 */
                public void setSpatial(XmlDay30.Resources.Resource.Metadata.Spatial value) {
                    this.spatial = value;
                }

                /**
                 * 取得 weatherElements 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlDay30.Resources.Resource.Metadata.WeatherElements }
                 *     
                 */
                public XmlDay30.Resources.Resource.Metadata.WeatherElements getWeatherElements() {
                    return weatherElements;
                }

                /**
                 * 設定 weatherElements 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlDay30.Resources.Resource.Metadata.WeatherElements }
                 *     
                 */
                public void setWeatherElements(XmlDay30.Resources.Resource.Metadata.WeatherElements value) {
                    this.weatherElements = value;
                }

                /**
                 * 取得 statistics 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlDay30.Resources.Resource.Metadata.Statistics }
                 *     
                 */
                public XmlDay30.Resources.Resource.Metadata.Statistics getStatistics() {
                    return statistics;
                }

                /**
                 * 設定 statistics 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlDay30.Resources.Resource.Metadata.Statistics }
                 *     
                 */
                public void setStatistics(XmlDay30.Resources.Resource.Metadata.Statistics value) {
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
                    protected List<XmlDay30.Resources.Resource.Metadata.Sources.Source> source;

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
                     * {@link XmlDay30.Resources.Resource.Metadata.Sources.Source }
                     * 
                     * 
                     */
                    public List<XmlDay30.Resources.Resource.Metadata.Sources.Source> getSource() {
                        if (source == null) {
                            source = new ArrayList<XmlDay30.Resources.Resource.Metadata.Sources.Source>();
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
                 *         &lt;element name="coordinateReferenceSystem">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="EPSGCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="coordinateFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "description",
                    "coordinateReferenceSystem"
                })
                public static class Spatial {

                    @XmlElement(required = true)
                    protected String description;
                    @XmlElement(required = true)
                    protected XmlDay30.Resources.Resource.Metadata.Spatial.CoordinateReferenceSystem coordinateReferenceSystem;

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
                     * 取得 coordinateReferenceSystem 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XmlDay30.Resources.Resource.Metadata.Spatial.CoordinateReferenceSystem }
                     *     
                     */
                    public XmlDay30.Resources.Resource.Metadata.Spatial.CoordinateReferenceSystem getCoordinateReferenceSystem() {
                        return coordinateReferenceSystem;
                    }

                    /**
                     * 設定 coordinateReferenceSystem 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XmlDay30.Resources.Resource.Metadata.Spatial.CoordinateReferenceSystem }
                     *     
                     */
                    public void setCoordinateReferenceSystem(XmlDay30.Resources.Resource.Metadata.Spatial.CoordinateReferenceSystem value) {
                        this.coordinateReferenceSystem = value;
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
                     *         &lt;element name="EPSGCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="datum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="coordinateFormat" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                        "epsgCode",
                        "name",
                        "datum",
                        "coordinateFormat"
                    })
                    public static class CoordinateReferenceSystem {

                        @XmlElement(name = "EPSGCode", required = true)
                        protected String epsgCode;
                        @XmlElement(required = true)
                        protected String name;
                        @XmlElement(required = true)
                        protected String datum;
                        @XmlElement(required = true)
                        protected String coordinateFormat;

                        /**
                         * 取得 epsgCode 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEPSGCode() {
                            return epsgCode;
                        }

                        /**
                         * 設定 epsgCode 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEPSGCode(String value) {
                            this.epsgCode = value;
                        }

                        /**
                         * 取得 name 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getName() {
                            return name;
                        }

                        /**
                         * 設定 name 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setName(String value) {
                            this.name = value;
                        }

                        /**
                         * 取得 datum 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDatum() {
                            return datum;
                        }

                        /**
                         * 設定 datum 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDatum(String value) {
                            this.datum = value;
                        }

                        /**
                         * 取得 coordinateFormat 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCoordinateFormat() {
                            return coordinateFormat;
                        }

                        /**
                         * 設定 coordinateFormat 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCoordinateFormat(String value) {
                            this.coordinateFormat = value;
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
                 *         &lt;element name="statisticalPeriods">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="statisticalPeriod" maxOccurs="unbounded">
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
                 *         &lt;element name="weatherElement">
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
                    protected XmlDay30.Resources.Resource.Metadata.Statistics.StatisticalPeriods statisticalPeriods;
                    @XmlElement(required = true)
                    protected XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement weatherElement;

                    /**
                     * 取得 statisticalPeriods 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XmlDay30.Resources.Resource.Metadata.Statistics.StatisticalPeriods }
                     *     
                     */
                    public XmlDay30.Resources.Resource.Metadata.Statistics.StatisticalPeriods getStatisticalPeriods() {
                        return statisticalPeriods;
                    }

                    /**
                     * 設定 statisticalPeriods 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XmlDay30.Resources.Resource.Metadata.Statistics.StatisticalPeriods }
                     *     
                     */
                    public void setStatisticalPeriods(XmlDay30.Resources.Resource.Metadata.Statistics.StatisticalPeriods value) {
                        this.statisticalPeriods = value;
                    }

                    /**
                     * 取得 weatherElement 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement }
                     *     
                     */
                    public XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement getWeatherElement() {
                        return weatherElement;
                    }

                    /**
                     * 設定 weatherElement 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement }
                     *     
                     */
                    public void setWeatherElement(XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement value) {
                        this.weatherElement = value;
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
                     *         &lt;element name="statisticalPeriod" maxOccurs="unbounded">
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
                        protected List<XmlDay30.Resources.Resource.Metadata.Statistics.StatisticalPeriods.StatisticalPeriod> statisticalPeriod;

                        /**
                         * Gets the value of the statisticalPeriod property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the statisticalPeriod property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getStatisticalPeriod().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link XmlDay30.Resources.Resource.Metadata.Statistics.StatisticalPeriods.StatisticalPeriod }
                         * 
                         * 
                         */
                        public List<XmlDay30.Resources.Resource.Metadata.Statistics.StatisticalPeriods.StatisticalPeriod> getStatisticalPeriod() {
                            if (statisticalPeriod == null) {
                                statisticalPeriod = new ArrayList<XmlDay30.Resources.Resource.Metadata.Statistics.StatisticalPeriods.StatisticalPeriod>();
                            }
                            return this.statisticalPeriod;
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
                        protected XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods statisticalMethods;

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
                         *     {@link XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods }
                         *     
                         */
                        public XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods getStatisticalMethods() {
                            return statisticalMethods;
                        }

                        /**
                         * 設定 statisticalMethods 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods }
                         *     
                         */
                        public void setStatisticalMethods(XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods value) {
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
                            protected List<XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods.StatisticalMethod> statisticalMethod;

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
                             * {@link XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods.StatisticalMethod }
                             * 
                             * 
                             */
                            public List<XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods.StatisticalMethod> getStatisticalMethod() {
                                if (statisticalMethod == null) {
                                    statisticalMethod = new ArrayList<XmlDay30.Resources.Resource.Metadata.Statistics.WeatherElement.StatisticalMethods.StatisticalMethod>();
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
                 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="endTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "startTime",
                    "endTime"
                })
                public static class Temporal {

                    @XmlElement(required = true)
                    protected String startTime;
                    @XmlElement(required = true)
                    protected String endTime;

                    /**
                     * 取得 startTime 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStartTime() {
                        return startTime;
                    }

                    /**
                     * 設定 startTime 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStartTime(String value) {
                        this.startTime = value;
                    }

                    /**
                     * 取得 endTime 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEndTime() {
                        return endTime;
                    }

                    /**
                     * 設定 endTime 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEndTime(String value) {
                        this.endTime = value;
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
                 *         &lt;element name="weatherElement" maxOccurs="unbounded">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *                   &lt;element name="specialValues">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="specialValue" maxOccurs="unbounded">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "weatherElement"
                })
                public static class WeatherElements {

                    @XmlElement(required = true)
                    protected List<XmlDay30.Resources.Resource.Metadata.WeatherElements.WeatherElement> weatherElement;

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
                     * {@link XmlDay30.Resources.Resource.Metadata.WeatherElements.WeatherElement }
                     * 
                     * 
                     */
                    public List<XmlDay30.Resources.Resource.Metadata.WeatherElements.WeatherElement> getWeatherElement() {
                        if (weatherElement == null) {
                            weatherElement = new ArrayList<XmlDay30.Resources.Resource.Metadata.WeatherElements.WeatherElement>();
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
                     *         &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                     *         &lt;element name="specialValues">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="specialValue" maxOccurs="unbounded">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                        "format",
                        "specialValues"
                    })
                    public static class WeatherElement {

                        @XmlElement(required = true)
                        protected String tagName;
                        @XmlElement(required = true)
                        protected String description;
                        protected String units;
                        protected String format;
                        @XmlElement(required = true)
                        protected XmlDay30.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues specialValues;

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
                         * 取得 format 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getFormat() {
                            return format;
                        }

                        /**
                         * 設定 format 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setFormat(String value) {
                            this.format = value;
                        }

                        /**
                         * 取得 specialValues 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XmlDay30.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues }
                         *     
                         */
                        public XmlDay30.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues getSpecialValues() {
                            return specialValues;
                        }

                        /**
                         * 設定 specialValues 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XmlDay30.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues }
                         *     
                         */
                        public void setSpecialValues(XmlDay30.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues value) {
                            this.specialValues = value;
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
                         *         &lt;element name="specialValue" maxOccurs="unbounded">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                            "specialValue"
                        })
                        public static class SpecialValues {

                            @XmlElement(required = true)
                            protected List<XmlDay30.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues.SpecialValue> specialValue;

                            /**
                             * Gets the value of the specialValue property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the specialValue property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getSpecialValue().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link XmlDay30.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues.SpecialValue }
                             * 
                             * 
                             */
                            public List<XmlDay30.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues.SpecialValue> getSpecialValue() {
                                if (specialValue == null) {
                                    specialValue = new ArrayList<XmlDay30.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues.SpecialValue>();
                                }
                                return this.specialValue;
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
                             *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                                "value",
                                "description"
                            })
                            public static class SpecialValue {

                                @XmlElement(required = true)
                                protected String value;
                                @XmlElement(required = true)
                                protected String description;

                                /**
                                 * 取得 value 特性的值.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link String }
                                 *     
                                 */
                                public String getValue() {
                                    return value;
                                }

                                /**
                                 * 設定 value 特性的值.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link String }
                                 *     
                                 */
                                public void setValue(String value) {
                                    this.value = value;
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

            }

        }

    }

}
