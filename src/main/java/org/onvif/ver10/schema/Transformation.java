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
 * Java-Klasse f�r Transformation complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="Transformation">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Translate" type="{http://www.onvif.org/ver10/schema}Vector" minOccurs="0"/>
 *         <element name="Scale" type="{http://www.onvif.org/ver10/schema}Vector" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}TransformationExtension" minOccurs="0"/>
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
@XmlType(name = "Transformation", propOrder = { "translate", "scale", "extension" })
public class Transformation {

    /**
     *
     */
    @XmlElement(name = "Translate")
	protected Vector translate;

    /**
     *
     */
    @XmlElement(name = "Scale")
	protected Vector scale;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected TransformationExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der translate-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Vector }
	 * 
	 */
	public Vector getTranslate() {
		return translate;
	}

	/**
	 * Legt den Wert der translate-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Vector }
	 * 
	 */
	public void setTranslate(Vector value) {
		this.translate = value;
	}

	/**
	 * Ruft den Wert der scale-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Vector }
	 * 
	 */
	public Vector getScale() {
		return scale;
	}

	/**
	 * Legt den Wert der scale-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Vector }
	 * 
	 */
	public void setScale(Vector value) {
		this.scale = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link TransformationExtension }
	 * 
	 */
	public TransformationExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link TransformationExtension }
	 * 
	 */
	public void setExtension(TransformationExtension value) {
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
