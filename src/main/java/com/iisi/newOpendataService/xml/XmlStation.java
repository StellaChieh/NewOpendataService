//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.07.19 於 02:53:30 PM CST 
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
 *         &lt;element name="dataItemName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sent" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msgType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="publisherOID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
 *                                       &lt;element name="temporal">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
 *                                       &lt;element name="fields">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="field" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                                       &lt;element name="stationsStatus">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="station" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="stationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="stationNameEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="stationAltitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="countyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="stationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="originalStationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="newStationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "dataItemName",
    "sender",
    "sent",
    "status",
    "scope",
    "msgType",
    "publisherOID",
    "note",
    "resources"
})
@XmlRootElement(name = "cwbdata")
public class XmlStation {

    @XmlElement(required = true)
    protected String identifier;
    @XmlElement(required = true)
    protected String datasetID;
    @XmlElement(required = true)
    protected String datasetName;
    @XmlElement(required = true)
    protected String dataItemID;
    @XmlElement(required = true)
    protected String dataItemName;
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
    protected String note;
    @XmlElement(required = true)
    protected XmlStation.Resources resources;

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
     * 取得 dataItemName 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataItemName() {
        return dataItemName;
    }

    /**
     * 設定 dataItemName 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataItemName(String value) {
        this.dataItemName = value;
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
     * 取得 note 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * 設定 note 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * 取得 resources 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link XmlStation.Resources }
     *     
     */
    public XmlStation.Resources getResources() {
        return resources;
    }

    /**
     * 設定 resources 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlStation.Resources }
     *     
     */
    public void setResources(XmlStation.Resources value) {
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
     *                             &lt;element name="temporal">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
     *                             &lt;element name="fields">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="field" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *                             &lt;element name="stationsStatus">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="station" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="stationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="stationNameEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="stationAltitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="countyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="stationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="originalStationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="newStationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        protected XmlStation.Resources.Resource resource;

        /**
         * 取得 resource 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link XmlStation.Resources.Resource }
         *     
         */
        public XmlStation.Resources.Resource getResource() {
            return resource;
        }

        /**
         * 設定 resource 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link XmlStation.Resources.Resource }
         *     
         */
        public void setResource(XmlStation.Resources.Resource value) {
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
         *                   &lt;element name="temporal">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
         *                   &lt;element name="fields">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="field" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
         *                   &lt;element name="stationsStatus">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="station" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="stationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="stationNameEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="stationAltitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="countyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="stationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="originalStationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="newStationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected XmlStation.Resources.Resource.Metadata metadata;
            @XmlElement(required = true)
            protected XmlStation.Resources.Resource.Data data;

            /**
             * 取得 metadata 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link XmlStation.Resources.Resource.Metadata }
             *     
             */
            public XmlStation.Resources.Resource.Metadata getMetadata() {
                return metadata;
            }

            /**
             * 設定 metadata 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link XmlStation.Resources.Resource.Metadata }
             *     
             */
            public void setMetadata(XmlStation.Resources.Resource.Metadata value) {
                this.metadata = value;
            }

            /**
             * 取得 data 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link XmlStation.Resources.Resource.Data }
             *     
             */
            public XmlStation.Resources.Resource.Data getData() {
                return data;
            }

            /**
             * 設定 data 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link XmlStation.Resources.Resource.Data }
             *     
             */
            public void setData(XmlStation.Resources.Resource.Data value) {
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
             *         &lt;element name="stationsStatus">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="station" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="stationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="stationNameEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="stationAltitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="countyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="stationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="originalStationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="newStationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "stationsStatus"
            })
            public static class Data {

                @XmlElement(required = true)
                protected XmlStation.Resources.Resource.Data.StationsStatus stationsStatus;

                /**
                 * 取得 stationsStatus 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlStation.Resources.Resource.Data.StationsStatus }
                 *     
                 */
                public XmlStation.Resources.Resource.Data.StationsStatus getStationsStatus() {
                    return stationsStatus;
                }

                /**
                 * 設定 stationsStatus 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlStation.Resources.Resource.Data.StationsStatus }
                 *     
                 */
                public void setStationsStatus(XmlStation.Resources.Resource.Data.StationsStatus value) {
                    this.stationsStatus = value;
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
                 *         &lt;element name="station" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="stationName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="stationNameEN" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="stationAltitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="countyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="stationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="originalStationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="newStationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "station"
                })
                public static class StationsStatus {

                    protected List<XmlStation.Resources.Resource.Data.StationsStatus.Station> station;

                    /**
                     * Gets the value of the station property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the station property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getStation().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link XmlStation.Resources.Resource.Data.StationsStatus.Station }
                     * 
                     * 
                     */
                    public List<XmlStation.Resources.Resource.Data.StationsStatus.Station> getStation() {
                        if (station == null) {
                            station = new ArrayList<XmlStation.Resources.Resource.Data.StationsStatus.Station>();
                        }
                        return this.station;
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
                     *         &lt;element name="stationAltitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="countyName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="stationAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="originalStationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="newStationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                        "stationAltitude",
                        "longitude",
                        "latitude",
                        "countyName",
                        "stationAddress",
                        "startDate",
                        "endDate",
                        "status",
                        "note",
                        "originalStationID",
                        "newStationID"
                    })
                    public static class Station {

                        @XmlElement(required = true)
                        protected String stationID;
                        @XmlElement(required = true)
                        protected String stationName;
                        @XmlElement(required = true)
                        protected String stationNameEN;
                        @XmlElement(required = true)
                        protected String stationAltitude;
                        @XmlElement(required = true)
                        protected String longitude;
                        @XmlElement(required = true)
                        protected String latitude;
                        @XmlElement(required = true)
                        protected String countyName;
                        @XmlElement(required = true)
                        protected String stationAddress;
                        @XmlElement(required = true)
                        protected String startDate;
                        @XmlElement(required = true)
                        protected String endDate;
                        @XmlElement(required = true)
                        protected String status;
                        @XmlElement(required = true)
                        protected String note;
                        @XmlElement(required = true)
                        protected String originalStationID;
                        @XmlElement(required = true)
                        protected String newStationID;

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
                         * 取得 stationAltitude 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getStationAltitude() {
                            return stationAltitude;
                        }

                        /**
                         * 設定 stationAltitude 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setStationAltitude(String value) {
                            this.stationAltitude = value;
                        }

                        /**
                         * 取得 longitude 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getLongitude() {
                            return longitude;
                        }

                        /**
                         * 設定 longitude 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setLongitude(String value) {
                            this.longitude = value;
                        }

                        /**
                         * 取得 latitude 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getLatitude() {
                            return latitude;
                        }

                        /**
                         * 設定 latitude 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setLatitude(String value) {
                            this.latitude = value;
                        }

                        /**
                         * 取得 countyName 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCountyName() {
                            return countyName;
                        }

                        /**
                         * 設定 countyName 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCountyName(String value) {
                            this.countyName = value;
                        }

                        /**
                         * 取得 stationAddress 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getStationAddress() {
                            return stationAddress;
                        }

                        /**
                         * 設定 stationAddress 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setStationAddress(String value) {
                            this.stationAddress = value;
                        }

                        /**
                         * 取得 startDate 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getStartDate() {
                            return startDate;
                        }

                        /**
                         * 設定 startDate 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setStartDate(String value) {
                            this.startDate = value;
                        }

                        /**
                         * 取得 endDate 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getEndDate() {
                            return endDate;
                        }

                        /**
                         * 設定 endDate 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setEndDate(String value) {
                            this.endDate = value;
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
                         * 取得 note 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNote() {
                            return note;
                        }

                        /**
                         * 設定 note 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNote(String value) {
                            this.note = value;
                        }

                        /**
                         * 取得 originalStationID 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getOriginalStationID() {
                            return originalStationID;
                        }

                        /**
                         * 設定 originalStationID 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setOriginalStationID(String value) {
                            this.originalStationID = value;
                        }

                        /**
                         * 取得 newStationID 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getNewStationID() {
                            return newStationID;
                        }

                        /**
                         * 設定 newStationID 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setNewStationID(String value) {
                            this.newStationID = value;
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
             *         &lt;element name="temporal">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
             *         &lt;element name="fields">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="field" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "temporal",
                "spatial",
                "fields"
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
                protected XmlStation.Resources.Resource.Metadata.Temporal temporal;
                @XmlElement(required = true)
                protected XmlStation.Resources.Resource.Metadata.Spatial spatial;
                @XmlElement(required = true)
                protected XmlStation.Resources.Resource.Metadata.Fields fields;

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
                 * 取得 temporal 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlStation.Resources.Resource.Metadata.Temporal }
                 *     
                 */
                public XmlStation.Resources.Resource.Metadata.Temporal getTemporal() {
                    return temporal;
                }

                /**
                 * 設定 temporal 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlStation.Resources.Resource.Metadata.Temporal }
                 *     
                 */
                public void setTemporal(XmlStation.Resources.Resource.Metadata.Temporal value) {
                    this.temporal = value;
                }

                /**
                 * 取得 spatial 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlStation.Resources.Resource.Metadata.Spatial }
                 *     
                 */
                public XmlStation.Resources.Resource.Metadata.Spatial getSpatial() {
                    return spatial;
                }

                /**
                 * 設定 spatial 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlStation.Resources.Resource.Metadata.Spatial }
                 *     
                 */
                public void setSpatial(XmlStation.Resources.Resource.Metadata.Spatial value) {
                    this.spatial = value;
                }

                /**
                 * 取得 fields 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlStation.Resources.Resource.Metadata.Fields }
                 *     
                 */
                public XmlStation.Resources.Resource.Metadata.Fields getFields() {
                    return fields;
                }

                /**
                 * 設定 fields 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlStation.Resources.Resource.Metadata.Fields }
                 *     
                 */
                public void setFields(XmlStation.Resources.Resource.Metadata.Fields value) {
                    this.fields = value;
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
                 *         &lt;element name="field" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "field"
                })
                public static class Fields {

                    protected List<XmlStation.Resources.Resource.Metadata.Fields.Field> field;

                    /**
                     * Gets the value of the field property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the field property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getField().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link XmlStation.Resources.Resource.Metadata.Fields.Field }
                     * 
                     * 
                     */
                    public List<XmlStation.Resources.Resource.Metadata.Fields.Field> getField() {
                        if (field == null) {
                            field = new ArrayList<XmlStation.Resources.Resource.Metadata.Fields.Field>();
                        }
                        return this.field;
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
                        "units"
                    })
                    public static class Field {

                        @XmlElement(required = true)
                        protected String tagName;
                        @XmlElement(required = true)
                        protected String description;
                        protected String units;

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
                    protected XmlStation.Resources.Resource.Metadata.Spatial.CoordinateReferenceSystem coordinateReferenceSystem;

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
                     *     {@link XmlStation.Resources.Resource.Metadata.Spatial.CoordinateReferenceSystem }
                     *     
                     */
                    public XmlStation.Resources.Resource.Metadata.Spatial.CoordinateReferenceSystem getCoordinateReferenceSystem() {
                        return coordinateReferenceSystem;
                    }

                    /**
                     * 設定 coordinateReferenceSystem 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XmlStation.Resources.Resource.Metadata.Spatial.CoordinateReferenceSystem }
                     *     
                     */
                    public void setCoordinateReferenceSystem(XmlStation.Resources.Resource.Metadata.Spatial.CoordinateReferenceSystem value) {
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
                 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                    "updateDate"
                })
                public static class Temporal {

                    @XmlElement(required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar updateDate;

                    /**
                     * 取得 updateDate 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getUpdateDate() {
                        return updateDate;
                    }

                    /**
                     * 設定 updateDate 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setUpdateDate(XMLGregorianCalendar value) {
                        this.updateDate = value;
                    }

                }

            }

        }

    }

}
