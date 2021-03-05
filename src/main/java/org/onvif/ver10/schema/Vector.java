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
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r Vector complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="Vector">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="x" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       <attribute name="y" type="{http://www.w3.org/2001/XMLSchema}float" />
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vector")
public class Vector {

    /**
     *
     */
    @XmlAttribute(name = "x")
	protected Float x;

    /**
     *
     */
    @XmlAttribute(name = "y")
	protected Float y;

	/**
	 * Ruft den Wert der x-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getX() {
		return x;
	}

	/**
	 * Legt den Wert der x-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setX(Float value) {
		this.x = value;
	}

	/**
	 * Ruft den Wert der y-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Float }
	 * 
	 */
	public Float getY() {
		return y;
	}

	/**
	 * Legt den Wert der y-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link Float }
	 * 
	 */
	public void setY(Float value) {
		this.y = value;
	}

}
