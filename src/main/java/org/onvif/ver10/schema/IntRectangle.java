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
 * Rectangle defined by lower left corner position and size. Units are pixel.
 * 
 * <p>
 * Java-Klasse f�r IntRectangle complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="IntRectangle">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <attribute name="x" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="y" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       <attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntRectangle")
public class IntRectangle {

    /**
     *
     */
    @XmlAttribute(name = "x", required = true)
	protected int x;

    /**
     *
     */
    @XmlAttribute(name = "y", required = true)
	protected int y;

    /**
     *
     */
    @XmlAttribute(name = "width", required = true)
	protected int width;

    /**
     *
     */
    @XmlAttribute(name = "height", required = true)
	protected int height;

	/**
	 * Ruft den Wert der x-Eigenschaft ab.
	 * 
     * @return 
	 */
	public int getX() {
		return x;
	}

	/**
	 * Legt den Wert der x-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setX(int value) {
		this.x = value;
	}

	/**
	 * Ruft den Wert der y-Eigenschaft ab.
	 * 
     * @return 
	 */
	public int getY() {
		return y;
	}

	/**
	 * Legt den Wert der y-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setY(int value) {
		this.y = value;
	}

	/**
	 * Ruft den Wert der width-Eigenschaft ab.
	 * 
     * @return 
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Legt den Wert der width-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setWidth(int value) {
		this.width = value;
	}

	/**
	 * Ruft den Wert der height-Eigenschaft ab.
	 * 
     * @return 
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Legt den Wert der height-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setHeight(int value) {
		this.height = value;
	}

}
