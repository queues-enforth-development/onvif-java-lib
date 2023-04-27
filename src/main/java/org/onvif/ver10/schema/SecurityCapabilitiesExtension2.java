//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r SecurityCapabilitiesExtension2 complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityCapabilitiesExtension2">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Dot1X" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="SupportedEAPMethod" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RemoteUserHandling" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
           <any processContents='lax' namespace='http://www.onvif.org/ver10/schema' maxOccurs="unbounded" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCapabilitiesExtension2", propOrder = { "dot1X", "supportedEAPMethod", "remoteUserHandling", "any" })
public class SecurityCapabilitiesExtension2 {

    /**
     *
     */
    @XmlElement(name = "Dot1X")
	protected boolean dot1X;

    /**
     *
     */
    @XmlElement(name = "SupportedEAPMethod", type = Integer.class)
	protected List<Integer> supportedEAPMethod;

    /**
     *
     */
    @XmlElement(name = "RemoteUserHandling")
	protected boolean remoteUserHandling;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;

	/**
	 * Ruft den Wert der dot1X-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isDot1X() {
		return dot1X;
	}

	/**
	 * Legt den Wert der dot1X-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setDot1X(boolean value) {
		this.dot1X = value;
	}

	/**
	 * Gets the value of the supportedEAPMethod property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the supportedEAPMethod property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getSupportedEAPMethod().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Integer }
	 * 
	 * 
     * @return 
	 */
	public List<Integer> getSupportedEAPMethod() {
		if (supportedEAPMethod == null) {
			supportedEAPMethod = new ArrayList<>();
		}
		return this.supportedEAPMethod;
	}

	/**
	 * Ruft den Wert der remoteUserHandling-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isRemoteUserHandling() {
		return remoteUserHandling;
	}

	/**
	 * Legt den Wert der remoteUserHandling-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setRemoteUserHandling(boolean value) {
		this.remoteUserHandling = value;
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
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link java.lang.Object }
	 * 
	 * 
     * @return 
	 */
	public List<java.lang.Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

}
