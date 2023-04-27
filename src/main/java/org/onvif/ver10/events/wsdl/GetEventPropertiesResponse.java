//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is compiled. 
// Generiert: 2016.03.16 um 01:52:47 PM CET 
//

package org.onvif.ver10.events.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.wsn.t_1.TopicSetType;

/**
 * <p>Java-Class for anonymous complex type.
 * 
 * <p>The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TopicNamespaceLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://docs.oasis-open.org/wsn/b-2}FixedTopicSet"/>
 *         &lt;element ref="{http://docs.oasis-open.org/wsn/t-1}TopicSet"/>
 *         &lt;element ref="{http://docs.oasis-open.org/wsn/b-2}TopicExpressionDialect" maxOccurs="unbounded"/>
 *         &lt;element name="MessageContentFilterDialect" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *         &lt;element name="ProducerPropertiesFilterDialect" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MessageContentSchemaLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "topicNamespaceLocation",
    "fixedTopicSet",
    "topicSet",
    "topicExpressionDialect",
    "messageContentFilterDialect",
    "producerPropertiesFilterDialect",
    "messageContentSchemaLocation",
    "any"
})
@XmlRootElement(name = "GetEventPropertiesResponse")
public class GetEventPropertiesResponse {

    /**
     *
     */
    @XmlElement(name = "TopicNamespaceLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> topicNamespaceLocation;

    /**
     *
     */
    @XmlElement(name = "FixedTopicSet", namespace = "http://docs.oasis-open.org/wsn/b-2", defaultValue = "true")
    protected boolean fixedTopicSet;

    /**
     *
     */
    @XmlElement(name = "TopicSet", namespace = "http://docs.oasis-open.org/wsn/t-1", required = true)
    protected TopicSetType topicSet;

    /**
     *
     */
    @XmlElement(name = "TopicExpressionDialect", namespace = "http://docs.oasis-open.org/wsn/b-2", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> topicExpressionDialect;

    /**
     *
     */
    @XmlElement(name = "MessageContentFilterDialect", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> messageContentFilterDialect;

    /**
     *
     */
    @XmlElement(name = "ProducerPropertiesFilterDialect")
    @XmlSchemaType(name = "anyURI")
    protected List<String> producerPropertiesFilterDialect;

    /**
     *
     */
    @XmlElement(name = "MessageContentSchemaLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected List<String> messageContentSchemaLocation;

    /**
     *
     */
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the topicNamespaceLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topicNamespaceLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>{@code
     *    getTopicNamespaceLocation().add(newItem);
     * }</pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return 
     */
    public List<String> getTopicNamespaceLocation() {
        if (topicNamespaceLocation == null) {
            topicNamespaceLocation = new ArrayList<>();
        }
        return this.topicNamespaceLocation;
    }

    /**
     * True when topicset is fixed for all times.
     * 
     * @return 
     */
    public boolean isFixedTopicSet() {
        return fixedTopicSet;
    }

    /**
     * Legt den Wert der fixedTopicSet-Eigenschaft fest.
     * 
     * @param value -
     */
    public void setFixedTopicSet(boolean value) {
        this.fixedTopicSet = value;
    }

    /**
     * Set of topics supported.
     * 
     * @return
     *     possible object is
     *     {@link TopicSetType }
     *     
     */
    public TopicSetType getTopicSet() {
        return topicSet;
    }

    /**
     * Legt den Wert der topicSet-Eigenschaft fest.
     * 
     * @param value -
     *     allowed object is
     *     {@link TopicSetType }
     *     
     */
    public void setTopicSet(TopicSetType value) {
        this.topicSet = value;
    }

    /**
     * 
     * 							Defines the XPath expression syntax supported for matching topic expressions. 
     * <pre>{@code
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;br xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
     * }</pre>
     * 
     * 							The following TopicExpressionDialects are mandatory for an ONVIF compliant device :
     * 							
     * <pre>{@code
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ul xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:tev="http://www.onvif.org/ver10/events/wsdl" xmlns:wsa="http://www.w3.org/2005/08/addressing" xmlns:wsaw="http://www.w3.org/2006/05/addressing/wsdl" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:wsntw="http://docs.oasis-open.org/wsn/bw-2" xmlns:wsrf-rw="http://docs.oasis-open.org/wsrf/rw-2" xmlns:wstop="http://docs.oasis-open.org/wsn/t-1" xmlns:xs="http://www.w3.org/2001/XMLSchema" type="disc"&gt;&lt;li&gt;http://docs.oasis-open.org/wsn/t-1/TopicExpression/Concrete&lt;/li&gt;&lt;li&gt;http://www.onvif.org/ver10/tev/topicExpression/ConcreteSet.&lt;/li&gt;&lt;/ul&gt;
     * }</pre>
     * Gets the value of the topicExpressionDialect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topicExpressionDialect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>{@code
     *    getTopicExpressionDialect().add(newItem);
     * }</pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return 
     */
    public List<String> getTopicExpressionDialect() {
        if (topicExpressionDialect == null) {
            topicExpressionDialect = new ArrayList<>();
        }
        return this.topicExpressionDialect;
    }

    /**
     * Gets the value of the messageContentFilterDialect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageContentFilterDialect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>{@code
     *    getMessageContentFilterDialect().add(newItem);
     * }</pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return 
     */
    public List<String> getMessageContentFilterDialect() {
        if (messageContentFilterDialect == null) {
            messageContentFilterDialect = new ArrayList<>();
        }
        return this.messageContentFilterDialect;
    }

    /**
     * Gets the value of the producerPropertiesFilterDialect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producerPropertiesFilterDialect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>{@code
     *    getProducerPropertiesFilterDialect().add(newItem);
     * }</pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return 
     */
    public List<String> getProducerPropertiesFilterDialect() {
        if (producerPropertiesFilterDialect == null) {
            producerPropertiesFilterDialect = new ArrayList<>();
        }
        return this.producerPropertiesFilterDialect;
    }

    /**
     * Gets the value of the messageContentSchemaLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageContentSchemaLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>{@code
     *    getMessageContentSchemaLocation().add(newItem);
     * }</pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return 
     */
    public List<String> getMessageContentSchemaLocation() {
        if (messageContentSchemaLocation == null) {
            messageContentSchemaLocation = new ArrayList<>();
        }
        return this.messageContentSchemaLocation;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>{@code
     *    getAny().add(newItem);
     * }</pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     * @return 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

}
