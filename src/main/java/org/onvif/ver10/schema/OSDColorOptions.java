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
 * Describe the option of the color and its transparency.
 * 
 * <p>
 * Java-Klasse f�r OSDColorOptions complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="OSDColorOptions">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Color" type="{http://www.onvif.org/ver10/schema}ColorOptions" minOccurs="0"/>
 *         <element name="Transparent" type="{http://www.onvif.org/ver10/schema}IntRange" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}OSDColorOptionsExtension" minOccurs="0"/>
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
@XmlType(name = "OSDColorOptions", propOrder = { "color", "transparent", "extension" })
public class OSDColorOptions {

    /**
     *
     */
    @XmlElement(name = "Color")
	protected ColorOptions color;

    /**
     *
     */
    @XmlElement(name = "Transparent")
	protected IntRange transparent;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected OSDColorOptionsExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der color-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ColorOptions }
	 * 
	 */
	public ColorOptions getColor() {
		return color;
	}

	/**
	 * Legt den Wert der color-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link ColorOptions }
	 * 
	 */
	public void setColor(ColorOptions value) {
		this.color = value;
	}

	/**
	 * Ruft den Wert der transparent-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IntRange }
	 * 
	 */
	public IntRange getTransparent() {
		return transparent;
	}

	/**
	 * Legt den Wert der transparent-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link IntRange }
	 * 
	 */
	public void setTransparent(IntRange value) {
		this.transparent = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link OSDColorOptionsExtension }
	 * 
	 */
	public OSDColorOptionsExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link OSDColorOptionsExtension }
	 * 
	 */
	public void setExtension(OSDColorOptionsExtension value) {
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
