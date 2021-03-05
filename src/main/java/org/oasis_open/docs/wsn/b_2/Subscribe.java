//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.oasis_open.docs.wsn.b_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3._2005._08.addressing.EndpointReferenceType;
import org.w3c.dom.Element;

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
 *         <element name="ConsumerReference" type="{http://www.w3.org/2005/08/addressing}EndpointReferenceType"/>
 *         <element name="Filter" type="{http://docs.oasis-open.org/wsn/b-2}FilterType" minOccurs="0"/>
 *         <element name="InitialTerminationTime" type="{http://docs.oasis-open.org/wsn/b-2}AbsoluteOrRelativeTimeType" minOccurs="0"/>
 *         <element name="SubscriptionPolicy" minOccurs="0">
 *           <complexType>
               <complexContent>
                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                   <sequence>
                     <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
                   </sequence>
                 </restriction>
               </complexContent>
 *           </complexType>
 *         </element>
           <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "consumerReference", "filter", "initialTerminationTime", "subscriptionPolicy", "any" })
@XmlRootElement(name = "Subscribe")
public class Subscribe {

    /**
     *
     */
    @XmlElement(name = "ConsumerReference", required = true)
	protected EndpointReferenceType consumerReference;

    /**
     *
     */
    @XmlElement(name = "Filter")
	protected FilterType filter;

    /**
     *
     */
    @XmlElementRef(name = "InitialTerminationTime", namespace = "http://docs.oasis-open.org/wsn/b-2", type = JAXBElement.class, required = false)
	protected JAXBElement<String> initialTerminationTime;

    /**
     *
     */
    @XmlElement(name = "SubscriptionPolicy")
	protected Subscribe.SubscriptionPolicy subscriptionPolicy;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<Object> any;

	/**
	 * Ruft den Wert der consumerReference-Eigenschaft ab.
	 * 
	 * @return possible object is {@link EndpointReferenceType }
	 * 
	 */
	public EndpointReferenceType getConsumerReference() {
		return consumerReference;
	}

	/**
	 * Legt den Wert der consumerReference-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link EndpointReferenceType }
	 * 
	 */
	public void setConsumerReference(EndpointReferenceType value) {
		this.consumerReference = value;
	}

	/**
	 * Ruft den Wert der filter-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FilterType }
	 * 
	 */
	public FilterType getFilter() {
		return filter;
	}

	/**
	 * Legt den Wert der filter-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link FilterType }
	 * 
	 */
	public void setFilter(FilterType value) {
		this.filter = value;
	}

	/**
	 * Ruft den Wert der initialTerminationTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	public JAXBElement<String> getInitialTerminationTime() {
		return initialTerminationTime;
	}

	/**
	 * Legt den Wert der initialTerminationTime-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
	 */
	public void setInitialTerminationTime(JAXBElement<String> value) {
		this.initialTerminationTime = value;
	}

	/**
	 * Ruft den Wert der subscriptionPolicy-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Subscribe.SubscriptionPolicy }
	 * 
	 */
	public Subscribe.SubscriptionPolicy getSubscriptionPolicy() {
		return subscriptionPolicy;
	}

	/**
	 * Legt den Wert der subscriptionPolicy-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Subscribe.SubscriptionPolicy }
	 * 
	 */
	public void setSubscriptionPolicy(Subscribe.SubscriptionPolicy value) {
		this.subscriptionPolicy = value;
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
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link Object }
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
	           <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
	public static class SubscriptionPolicy {

        /**
         *
         */
        @XmlAnyElement(lax = true)
		protected List<Object> any;

		/**
		 * Gets the value of the any property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB
		 * object. This is why there is not a <CODE>set</CODE> method for the any property.
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
		 * Objects of the following type(s) are allowed in the list {@link Element } {@link Object }
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

}
