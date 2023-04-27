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
 * <p>
 * Java-Klasse f�r FocusStatus20 complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="FocusStatus20">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Position" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         <element name="MoveStatus" type="{http://www.onvif.org/ver10/schema}MoveStatus"/>
 *         <element name="Error" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}FocusStatus20Extension" minOccurs="0"/>
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
@XmlType(name = "FocusStatus20", propOrder = { "position", "moveStatus", "error", "extension" })
public class FocusStatus20 {

    /**
     *
     */
    @XmlElement(name = "Position")
	protected float position;

    /**
     *
     */
    @XmlElement(name = "MoveStatus", required = true)
	protected MoveStatus moveStatus;

    /**
     *
     */
    @XmlElement(name = "Error")
	protected String error;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected FocusStatus20Extension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der position-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public float getPosition() {
		return position;
	}

	/**
	 * Legt den Wert der position-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setPosition(float value) {
		this.position = value;
	}

	/**
	 * Ruft den Wert der moveStatus-Eigenschaft ab.
	 * 
	 * @return possible object is {@link MoveStatus }
	 * 
	 */
	public MoveStatus getMoveStatus() {
		return moveStatus;
	}

	/**
	 * Legt den Wert der moveStatus-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link MoveStatus }
	 * 
	 */
	public void setMoveStatus(MoveStatus value) {
		this.moveStatus = value;
	}

	/**
	 * Ruft den Wert der error-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getError() {
		return error;
	}

	/**
	 * Legt den Wert der error-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setError(String value) {
		this.error = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link FocusStatus20Extension }
	 * 
	 */
	public FocusStatus20Extension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link FocusStatus20Extension }
	 * 
	 */
	public void setExtension(FocusStatus20Extension value) {
		this.extension = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * <p>
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
