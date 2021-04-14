//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.oasis_open.docs.wsn.b_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.wsn.t_1.TopicSetType;

/**
 * <p>
 * Java-Class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
   <complexType>
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}TopicExpression" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}FixedTopicSet" minOccurs="0"/>
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}TopicExpressionDialect" maxOccurs="unbounded" minOccurs="0"/>
 *         <element ref="{http://docs.oasis-open.org/wsn/t-1}TopicSet" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "topicExpression", "fixedTopicSet", "topicExpressionDialect", "topicSet" })
@XmlRootElement(name = "NotificationProducerRP")
public class NotificationProducerRP {

    /**
     *
     */
    @XmlElement(name = "TopicExpression")
	protected List<TopicExpressionType> topicExpression;

    /**
     *
     */
    @XmlElement(name = "FixedTopicSet", defaultValue = "true")
	protected Boolean fixedTopicSet;

    /**
     *
     */
    @XmlElement(name = "TopicExpressionDialect")
	@XmlSchemaType(name = "anyURI")
	protected List<String> topicExpressionDialect;

    /**
     *
     */
    @XmlElement(name = "TopicSet", namespace = "http://docs.oasis-open.org/wsn/t-1")
	protected TopicSetType topicSet;

	/**
	 * Gets the value of the topicExpression property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the topicExpression property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getTopicExpression().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link TopicExpressionType }
	 * 
	 * 
     * @return 
	 */
	public List<TopicExpressionType> getTopicExpression() {
		if (topicExpression == null) {
			topicExpression = new ArrayList<>();
		}
		return this.topicExpression;
	}

	/**
	 * Ruft den Wert der fixedTopicSet-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isFixedTopicSet() {
		return fixedTopicSet;
	}

	/**
	 * Legt den Wert der fixedTopicSet-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setFixedTopicSet(Boolean value) {
		this.fixedTopicSet = value;
	}

	/**
	 * Gets the value of the topicExpressionDialect property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the topicExpressionDialect property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getTopicExpressionDialect().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link String }
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
	 * Ruft den Wert der topicSet-Eigenschaft ab.
	 * 
	 * @return possible object is {@link TopicSetType }
	 * 
	 */
	public TopicSetType getTopicSet() {
		return topicSet;
	}

	/**
	 * Legt den Wert der topicSet-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link TopicSetType }
	 * 
	 */
	public void setTopicSet(TopicSetType value) {
		this.topicSet = value;
	}

}
