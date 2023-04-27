//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.oasis_open.docs.wsn.t_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java-Klasse f�r TopicType complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="TopicType">
     <complexContent>
 *     <extension base="{http://docs.oasis-open.org/wsn/t-1}ExtensibleDocumented">
         <sequence>
 *         <element name="MessagePattern" type="{http://docs.oasis-open.org/wsn/t-1}QueryExpressionType" minOccurs="0"/>
 *         <element name="Topic" type="{http://docs.oasis-open.org/wsn/t-1}TopicType" maxOccurs="unbounded" minOccurs="0"/>
           <any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
         </sequence>
 *       <attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       <attribute name="messageTypes">
 *         <simpleType>
 *           <list itemType="{http://www.w3.org/2001/XMLSchema}QName" />
 *         </simpleType>
 *       </attribute>
 *       <attribute name="final" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         <anyAttribute processContents='lax' namespace='##other'/>
 *     </extension>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TopicType", propOrder = { "messagePattern", "topic", "any" })
@XmlSeeAlso({ org.oasis_open.docs.wsn.t_1.TopicNamespaceType.Topic.class })
public class TopicType extends ExtensibleDocumented {

    /**
     *
     */
    @XmlElement(name = "MessagePattern")
	protected QueryExpressionType messagePattern;

    /**
     *
     */
    @XmlElement(name = "Topic")
	protected List<TopicType> topic;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<Object> any;

    /**
     *
     */
    @XmlAttribute(name = "name", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "NCName")
	protected String name;

    /**
     *
     */
    @XmlAttribute(name = "messageTypes")
	protected List<QName> messageTypes;

    /**
     *
     */
    @XmlAttribute(name = "final")
	protected Boolean _final;

	/**
	 * Ruft den Wert der messagePattern-Eigenschaft ab.
	 * 
	 * @return possible object is {@link QueryExpressionType }
	 * 
	 */
	public QueryExpressionType getMessagePattern() {
		return messagePattern;
	}

	/**
	 * Legt den Wert der messagePattern-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link QueryExpressionType }
	 * 
	 */
	public void setMessagePattern(QueryExpressionType value) {
		this.messagePattern = value;
	}

	/**
	 * Gets the value of the topic property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the topic property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getTopic().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link TopicType }
	 * 
	 * 
     * @return 
	 */
	public List<TopicType> getTopic() {
		if (topic == null) {
			topic = new ArrayList<>();
		}
		return this.topic;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getAny().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Object }
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

	/**
	 * Ruft den Wert der name-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Legt den Wert der name-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the messageTypes property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the messageTypes property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getMessageTypes().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link QName }
	 * 
	 * 
     * @return 
	 */
	public List<QName> getMessageTypes() {
		if (messageTypes == null) {
			messageTypes = new ArrayList<>();
		}
		return this.messageTypes;
	}

	/**
	 * Ruft den Wert der final-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public boolean isFinal() {
		if (_final == null) {
			return false;
		}
		else {
			return _final;
		}
	}

	/**
	 * Legt den Wert der final-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setFinal(Boolean value) {
		this._final = value;
	}

}
