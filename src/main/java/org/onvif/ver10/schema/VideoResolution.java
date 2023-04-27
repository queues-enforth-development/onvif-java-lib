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

/**
 * 
 * Java-Klasse f�r VideoResolution complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="VideoResolution">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="Height" type="{http://www.w3.org/2001/XMLSchema}int"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoResolution", propOrder = { "width", "height" })
public class VideoResolution {

    /**
     *
     */
    @XmlElement(name = "Width")
	protected int width;

    /**
     *
     */
    @XmlElement(name = "Height")
	protected int height;

	/**
	 * Ruft den Wert der width-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * Legt den Wert der width-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setWidth(int value) {
		this.width = value;
	}

	/**
	 * Ruft den Wert der height-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * Legt den Wert der height-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setHeight(int value) {
		this.height = value;
	}

}
