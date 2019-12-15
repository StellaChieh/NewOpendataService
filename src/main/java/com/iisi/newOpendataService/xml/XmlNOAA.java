//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2019.10.03 於 11:18:38 AM CST 
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
 *                                       &lt;element name="resourceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="resourceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="sources">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="source">
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
 *                                                 &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
 *                                                 &lt;element name="weatherElement" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="statisticalMethods" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="statisticalMethod" maxOccurs="unbounded" minOccurs="0">
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
 *                                                           &lt;element name="specialValues">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="specialValue" maxOccurs="unbounded" minOccurs="0">
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
 *                                       &lt;element name="surfaceObsDailyStatistics">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                 &lt;element name="location" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="precipitation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="temperature">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                                     &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
public class XmlNOAA {

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
    protected XmlNOAA.Resources resources;

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
     *     {@link XmlNOAA.Resources }
     *     
     */
    public XmlNOAA.Resources getResources() {
        return resources;
    }

    /**
     * 設定 resources 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlNOAA.Resources }
     *     
     */
    public void setResources(XmlNOAA.Resources value) {
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
     *                             &lt;element name="resourceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="resourceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="sources">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="source">
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
     *                                       &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
     *                                       &lt;element name="weatherElement" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="statisticalMethods" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="statisticalMethod" maxOccurs="unbounded" minOccurs="0">
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
     *                                                 &lt;element name="specialValues">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="specialValue" maxOccurs="unbounded" minOccurs="0">
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
     *                             &lt;element name="surfaceObsDailyStatistics">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                       &lt;element name="location" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="precipitation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="temperature">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                           &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        protected XmlNOAA.Resources.Resource resource;

        /**
         * 取得 resource 特性的值.
         * 
         * @return
         *     possible object is
         *     {@link XmlNOAA.Resources.Resource }
         *     
         */
        public XmlNOAA.Resources.Resource getResource() {
            return resource;
        }

        /**
         * 設定 resource 特性的值.
         * 
         * @param value
         *     allowed object is
         *     {@link XmlNOAA.Resources.Resource }
         *     
         */
        public void setResource(XmlNOAA.Resources.Resource value) {
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
         *                   &lt;element name="resourceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="resourceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="sources">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="source">
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
         *                             &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
         *                             &lt;element name="weatherElement" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="statisticalMethods" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="statisticalMethod" maxOccurs="unbounded" minOccurs="0">
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
         *                                       &lt;element name="specialValues">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="specialValue" maxOccurs="unbounded" minOccurs="0">
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
         *                   &lt;element name="surfaceObsDailyStatistics">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                             &lt;element name="location" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="precipitation" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="temperature">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                                 &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            protected XmlNOAA.Resources.Resource.Metadata metadata;
            @XmlElement(required = true)
            protected XmlNOAA.Resources.Resource.Data data;

            /**
             * 取得 metadata 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link XmlNOAA.Resources.Resource.Metadata }
             *     
             */
            public XmlNOAA.Resources.Resource.Metadata getMetadata() {
                return metadata;
            }

            /**
             * 設定 metadata 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link XmlNOAA.Resources.Resource.Metadata }
             *     
             */
            public void setMetadata(XmlNOAA.Resources.Resource.Metadata value) {
                this.metadata = value;
            }

            /**
             * 取得 data 特性的值.
             * 
             * @return
             *     possible object is
             *     {@link XmlNOAA.Resources.Resource.Data }
             *     
             */
            public XmlNOAA.Resources.Resource.Data getData() {
                return data;
            }

            /**
             * 設定 data 特性的值.
             * 
             * @param value
             *     allowed object is
             *     {@link XmlNOAA.Resources.Resource.Data }
             *     
             */
            public void setData(XmlNOAA.Resources.Resource.Data value) {
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
             *         &lt;element name="surfaceObsDailyStatistics">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                   &lt;element name="location" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="precipitation" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="temperature">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                                       &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "surfaceObsDailyStatistics"
            })
            public static class Data {

                @XmlElement(required = true)
                protected XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics surfaceObsDailyStatistics;

                /**
                 * 取得 surfaceObsDailyStatistics 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics }
                 *     
                 */
                public XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics getSurfaceObsDailyStatistics() {
                    return surfaceObsDailyStatistics;
                }

                /**
                 * 設定 surfaceObsDailyStatistics 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics }
                 *     
                 */
                public void setSurfaceObsDailyStatistics(XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics value) {
                    this.surfaceObsDailyStatistics = value;
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
                 *         &lt;element name="location" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="precipitation" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="temperature">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                             &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                    "dataDate",
                    "location"
                })
                public static class SurfaceObsDailyStatistics {

                    @XmlElement(required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dataDate;
                    protected List<XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics.Location> location;

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
                     * {@link XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics.Location }
                     * 
                     * 
                     */
                    public List<XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics.Location> getLocation() {
                        if (location == null) {
                            location = new ArrayList<XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics.Location>();
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
                     *         &lt;element name="stationID" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="precipitation" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="temperature">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *                   &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                        "stationID",
                        "precipitation",
                        "temperature"
                    })
                    public static class Location {

                        @XmlElement(required = true)
                        protected String stationID;
                        @XmlElement(required = true)
                        protected String precipitation;
                        @XmlElement(required = true)
                        protected XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics.Location.Temperature temperature;

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
                         * 取得 temperature 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics.Location.Temperature }
                         *     
                         */
                        public XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics.Location.Temperature getTemperature() {
                            return temperature;
                        }

                        /**
                         * 設定 temperature 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics.Location.Temperature }
                         *     
                         */
                        public void setTemperature(XmlNOAA.Resources.Resource.Data.SurfaceObsDailyStatistics.Location.Temperature value) {
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
                         *         &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string"/>
                         *         &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                            "maximum",
                            "minimum"
                        })
                        public static class Temperature {

                            @XmlElement(required = true)
                            protected String maximum;
                            @XmlElement(required = true)
                            protected String minimum;

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
             *         &lt;element name="resourceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="resourceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="sources">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="source">
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
             *                   &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
             *                   &lt;element name="weatherElement" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="statisticalMethods" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="statisticalMethod" maxOccurs="unbounded" minOccurs="0">
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
             *                             &lt;element name="specialValues">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="specialValue" maxOccurs="unbounded" minOccurs="0">
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
                "resourceName",
                "resourceDescription",
                "language",
                "sources",
                "temporal",
                "weatherElements"
            })
            public static class Metadata {

                @XmlElement(required = true)
                protected String resourceName;
                @XmlElement(required = true)
                protected String resourceDescription;
                @XmlElement(required = true)
                protected String language;
                @XmlElement(required = true)
                protected XmlNOAA.Resources.Resource.Metadata.Sources sources;
                @XmlElement(required = true)
                protected XmlNOAA.Resources.Resource.Metadata.Temporal temporal;
                @XmlElement(required = true)
                protected XmlNOAA.Resources.Resource.Metadata.WeatherElements weatherElements;

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
                 * 取得 sources 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlNOAA.Resources.Resource.Metadata.Sources }
                 *     
                 */
                public XmlNOAA.Resources.Resource.Metadata.Sources getSources() {
                    return sources;
                }

                /**
                 * 設定 sources 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlNOAA.Resources.Resource.Metadata.Sources }
                 *     
                 */
                public void setSources(XmlNOAA.Resources.Resource.Metadata.Sources value) {
                    this.sources = value;
                }

                /**
                 * 取得 temporal 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlNOAA.Resources.Resource.Metadata.Temporal }
                 *     
                 */
                public XmlNOAA.Resources.Resource.Metadata.Temporal getTemporal() {
                    return temporal;
                }

                /**
                 * 設定 temporal 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlNOAA.Resources.Resource.Metadata.Temporal }
                 *     
                 */
                public void setTemporal(XmlNOAA.Resources.Resource.Metadata.Temporal value) {
                    this.temporal = value;
                }

                /**
                 * 取得 weatherElements 特性的值.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XmlNOAA.Resources.Resource.Metadata.WeatherElements }
                 *     
                 */
                public XmlNOAA.Resources.Resource.Metadata.WeatherElements getWeatherElements() {
                    return weatherElements;
                }

                /**
                 * 設定 weatherElements 特性的值.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XmlNOAA.Resources.Resource.Metadata.WeatherElements }
                 *     
                 */
                public void setWeatherElements(XmlNOAA.Resources.Resource.Metadata.WeatherElements value) {
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
                 *         &lt;element name="source">
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
                    protected XmlNOAA.Resources.Resource.Metadata.Sources.Source source;

                    /**
                     * 取得 source 特性的值.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XmlNOAA.Resources.Resource.Metadata.Sources.Source }
                     *     
                     */
                    public XmlNOAA.Resources.Resource.Metadata.Sources.Source getSource() {
                        return source;
                    }

                    /**
                     * 設定 source 特性的值.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XmlNOAA.Resources.Resource.Metadata.Sources.Source }
                     *     
                     */
                    public void setSource(XmlNOAA.Resources.Resource.Metadata.Sources.Source value) {
                        this.source = value;
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
                 *         &lt;element name="dataDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
                    "dataDate"
                })
                public static class Temporal {

                    @XmlElement(required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dataDate;

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
                 *         &lt;element name="weatherElement" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="tagName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="statisticalMethods" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="statisticalMethod" maxOccurs="unbounded" minOccurs="0">
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
                 *                   &lt;element name="specialValues">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="specialValue" maxOccurs="unbounded" minOccurs="0">
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

                    protected List<XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement> weatherElement;

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
                     * {@link XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement }
                     * 
                     * 
                     */
                    public List<XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement> getWeatherElement() {
                        if (weatherElement == null) {
                            weatherElement = new ArrayList<XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement>();
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
                     *         &lt;element name="units" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="statisticalMethods" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="statisticalMethod" maxOccurs="unbounded" minOccurs="0">
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
                     *         &lt;element name="specialValues">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="specialValue" maxOccurs="unbounded" minOccurs="0">
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
                        "statisticalMethods",
                        "specialValues"
                    })
                    public static class WeatherElement {

                        @XmlElement(required = true)
                        protected String tagName;
                        @XmlElement(required = true)
                        protected String description;
                        @XmlElement(required = true)
                        protected String units;
                        protected XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.StatisticalMethods statisticalMethods;
                        @XmlElement(required = true)
                        protected XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues specialValues;

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
                         *     {@link XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.StatisticalMethods }
                         *     
                         */
                        public XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.StatisticalMethods getStatisticalMethods() {
                            return statisticalMethods;
                        }

                        /**
                         * 設定 statisticalMethods 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.StatisticalMethods }
                         *     
                         */
                        public void setStatisticalMethods(XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.StatisticalMethods value) {
                            this.statisticalMethods = value;
                        }

                        /**
                         * 取得 specialValues 特性的值.
                         * 
                         * @return
                         *     possible object is
                         *     {@link XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues }
                         *     
                         */
                        public XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues getSpecialValues() {
                            return specialValues;
                        }

                        /**
                         * 設定 specialValues 特性的值.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues }
                         *     
                         */
                        public void setSpecialValues(XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues value) {
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
                         *         &lt;element name="specialValue" maxOccurs="unbounded" minOccurs="0">
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

                            protected List<XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues.SpecialValue> specialValue;

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
                             * {@link XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues.SpecialValue }
                             * 
                             * 
                             */
                            public List<XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues.SpecialValue> getSpecialValue() {
                                if (specialValue == null) {
                                    specialValue = new ArrayList<XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.SpecialValues.SpecialValue>();
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
                         *         &lt;element name="statisticalMethod" maxOccurs="unbounded" minOccurs="0">
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

                            protected List<XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.StatisticalMethods.StatisticalMethod> statisticalMethod;

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
                             * {@link XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.StatisticalMethods.StatisticalMethod }
                             * 
                             * 
                             */
                            public List<XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.StatisticalMethods.StatisticalMethod> getStatisticalMethod() {
                                if (statisticalMethod == null) {
                                    statisticalMethod = new ArrayList<XmlNOAA.Resources.Resource.Metadata.WeatherElements.WeatherElement.StatisticalMethods.StatisticalMethod>();
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

            }

        }

    }

}
