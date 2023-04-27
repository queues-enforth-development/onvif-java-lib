//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * Java-Klasse f�r Color complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="Color">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="X" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="Y" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="Z" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="Colorspace" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Color")
public class Color {

    /**
     *
     */
    @XmlAttribute(name = "X", required = true)
	protected float x;

    /**
     *
     */
    @XmlAttribute(name = "Y", required = true)
	protected float y;

    /**
     *
     */
    @XmlAttribute(name = "Z", required = true)
	protected float z;

    /**
     *
     */
    @XmlAttribute(name = "Colorspace")
	@XmlSchemaType(name = "anyURI")
	protected String colorspace;

	/**
	 * Ruft den Wert der x-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public float getX() {
		return x;
	}

	/**
	 * Legt den Wert der x-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setX(float value) {
		this.x = value;
	}

	/**
	 * Ruft den Wert der y-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public float getY() {
		return y;
	}

	/**
	 * Legt den Wert der y-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setY(float value) {
		this.y = value;
	}

	/**
	 * Ruft den Wert der z-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public float getZ() {
		return z;
	}

	/**
	 * Legt den Wert der z-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setZ(float value) {
		this.z = value;
	}

	/**
	 * Ruft den Wert der colorspace-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getColorspace() {
		return colorspace;
	}

	/**
	 * Legt den Wert der colorspace-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setColorspace(String value) {
		this.colorspace = value;
	}

}
