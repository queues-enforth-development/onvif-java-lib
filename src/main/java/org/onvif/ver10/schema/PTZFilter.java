//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * 
 * Java-Klasse f�r PTZFilter complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="PTZFilter">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="Position" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         </sequence>
         <anyAttribute processContents='lax'/>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZFilter", propOrder = { "status", "position" })
public class PTZFilter {

    /**
     *
     */
    @XmlElement(name = "Status")
	protected boolean status;

    /**
     *
     */
    @XmlElement(name = "Position")
	protected boolean position;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der status-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * Legt den Wert der status-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setStatus(boolean value) {
		this.status = value;
	}

	/**
	 * Ruft den Wert der position-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public boolean isPosition() {
		return position;
	}

	/**
	 * Legt den Wert der position-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setPosition(boolean value) {
		this.position = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * 
	 * the map is keyed by the name of the attribute and the value is the string value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}
