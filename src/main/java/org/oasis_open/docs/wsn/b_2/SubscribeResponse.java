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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         <element name="SubscriptionReference" type="{http://www.w3.org/2005/08/addressing}EndpointReferenceType"/>
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}CurrentTime" minOccurs="0"/>
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}TerminationTime" minOccurs="0"/>
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
@XmlType(name = "", propOrder = { "subscriptionReference", "currentTime", "terminationTime", "any" })
@XmlRootElement(name = "SubscribeResponse")
public class SubscribeResponse {

    /**
     *
     */
    @XmlElement(name = "SubscriptionReference", required = true)
	protected EndpointReferenceType subscriptionReference;

    /**
     *
     */
    @XmlElement(name = "CurrentTime")
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar currentTime;

    /**
     *
     */
    @XmlElement(name = "TerminationTime", nillable = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar terminationTime;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<Object> any;

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
	 * @param value -
	 *            allowed object is {@link EndpointReferenceType }
	 * 
	 */
	public void setSubscriptionReference(EndpointReferenceType value) {
		this.subscriptionReference = value;
	}

	/**
	 * Ruft den Wert der currentTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCurrentTime() {
		return currentTime;
	}

	/**
	 * Legt den Wert der currentTime-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCurrentTime(XMLGregorianCalendar value) {
		this.currentTime = value;
	}

	/**
	 * Ruft den Wert der terminationTime-Eigenschaft ab.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getTerminationTime() {
		return terminationTime;
	}

	/**
	 * Legt den Wert der terminationTime-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setTerminationTime(XMLGregorianCalendar value) {
		this.terminationTime = value;
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
     * @return  -
	 */
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

}
