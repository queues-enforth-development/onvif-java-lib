//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>
 * Java-Klasse f�r NetworkInterfaceInfo complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="NetworkInterfaceInfo">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="HwAddress" type="{http://www.onvif.org/ver10/schema}HwAddress"/>
 *         <element name="MTU" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterfaceInfo", propOrder = { "name", "hwAddress", "mtu" })
public class NetworkInterfaceInfo {

    /**
     *
     */
    @XmlElement(name = "Name")
	protected String name;

    /**
     *
     */
    @XmlElement(name = "HwAddress", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String hwAddress;

    /**
     *
     */
    @XmlElement(name = "MTU")
	protected Integer mtu;

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
	 * Ruft den Wert der hwAddress-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHwAddress() {
		return hwAddress;
	}

	/**
	 * Legt den Wert der hwAddress-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHwAddress(String value) {
		this.hwAddress = value;
	}

	/**
	 * Ruft den Wert der mtu-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getMTU() {
		return mtu;
	}

	/**
	 * Legt den Wert der mtu-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setMTU(Integer value) {
		this.mtu = value;
	}

}
