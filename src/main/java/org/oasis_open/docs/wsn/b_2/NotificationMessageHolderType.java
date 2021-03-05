//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.oasis_open.docs.wsn.b_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2005._08.addressing.EndpointReferenceType;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r NotificationMessageHolderType complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="NotificationMessageHolderType">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}SubscriptionReference" minOccurs="0"/>
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}Topic" minOccurs="0"/>
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}ProducerReference" minOccurs="0"/>
 *         <element name="Message">
 *           <complexType>
               <complexContent>
                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                   <sequence>
                     <any processContents='lax'/>
                   </sequence>
                 </restriction>
               </complexContent>
 *           </complexType>
 *         </element>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationMessageHolderType", propOrder = { "subscriptionReference", "topic", "producerReference", "message" })
public class NotificationMessageHolderType {

    /**
     *
     */
    @XmlElement(name = "SubscriptionReference")
	protected EndpointReferenceType subscriptionReference;

    /**
     *
     */
    @XmlElement(name = "Topic")
	protected TopicExpressionType topic;

    /**
     *
     */
    @XmlElement(name = "ProducerReference")
	protected EndpointReferenceType producerReference;

    /**
     *
     */
    @XmlElement(name = "Message", required = true)
	protected NotificationMessageHolderType.Message message;

	/**
	 * Ruft den Wert der subscriptionReference-Eigenschaft ab.
	 * 
	 * @return possible object is {@link EndpointReferenceType }
	 * 
	 */
	public EndpointReferenceType getSubscriptionReference() {
		return subscriptionReference;
	}

	/**
	 * Legt den Wert der subscriptionReference-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link EndpointReferenceType }
	 * 
	 */
	public void setSubscriptionReference(EndpointReferenceType value) {
		this.subscriptionReference = value;
	}

	/**
	 * Ruft den Wert der topic-Eigenschaft ab.
	 * 
	 * @return possible object is {@link TopicExpressionType }
	 * 
	 */
	public TopicExpressionType getTopic() {
		return topic;
	}

	/**
	 * Legt den Wert der topic-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link TopicExpressionType }
	 * 
	 */
	public void setTopic(TopicExpressionType value) {
		this.topic = value;
	}

	/**
	 * Ruft den Wert der producerReference-Eigenschaft ab.
	 * 
	 * @return possible object is {@link EndpointReferenceType }
	 * 
	 */
	public EndpointReferenceType getProducerReference() {
		return producerReference;
	}

	/**
	 * Legt den Wert der producerReference-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link EndpointReferenceType }
	 * 
	 */
	public void setProducerReference(EndpointReferenceType value) {
		this.producerReference = value;
	}

	/**
	 * Ruft den Wert der message-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NotificationMessageHolderType.Message }
	 * 
	 */
	public NotificationMessageHolderType.Message getMessage() {
		return message;
	}

	/**
	 * Legt den Wert der message-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link NotificationMessageHolderType.Message }
	 * 
	 */
	public void setMessage(NotificationMessageHolderType.Message value) {
		this.message = value;
	}

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
	           <any processContents='lax'/>
	         </sequence>
	       </restriction>
	     </complexContent>
	   </complexType>
	 * }</pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "any" })
	public static class Message {

        /**
         *
         */
        @XmlAnyElement(lax = true)
		protected Object any;

		/**
		 * Ruft den Wert der any-Eigenschaft ab.
		 * 
		 * @return possible object is {@link Element } {@link Object }
		 * 
		 */
		public Object getAny() {
			return any;
		}

		/**
		 * Legt den Wert der any-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link Element } {@link Object }
		 * 
		 */
		public void setAny(Object value) {
			this.any = value;
		}

	}

}
