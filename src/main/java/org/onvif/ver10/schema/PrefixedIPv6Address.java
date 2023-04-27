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
 * Java-Klasse f�r PrefixedIPv6Address complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="PrefixedIPv6Address">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Address" type="{http://www.onvif.org/ver10/schema}IPv6Address"/>
 *         <element name="PrefixLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrefixedIPv6Address", propOrder = { "address", "prefixLength" })
public class PrefixedIPv6Address {

    /**
     *
     */
    @XmlElement(name = "Address", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String address;

    /**
     *
     */
    @XmlElement(name = "PrefixLength")
	protected int prefixLength;

	/**
	 * Ruft den Wert der address-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Legt den Wert der address-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAddress(String value) {
		this.address = value;
	}

	/**
	 * Ruft den Wert der prefixLength-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getPrefixLength() {
		return prefixLength;
	}

	/**
	 * Legt den Wert der prefixLength-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setPrefixLength(int value) {
		this.prefixLength = value;
	}

}
