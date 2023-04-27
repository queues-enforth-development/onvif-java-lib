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
 * Java class for PTZSpeed ??complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="PTZSpeed">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="PanTilt" type="{http://www.onvif.org/ver10/schema}Vector2D" minOccurs="0"/>
 *         <element name="Zoom" type="{http://www.onvif.org/ver10/schema}Vector1D" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZSpeed", propOrder = { "panTilt", "zoom" })
public class PTZSpeed {

    /**
     *
     */
    @XmlElement(name = "PanTilt")
	protected Vector2D panTilt;

    /**
     *
     */
    @XmlElement(name = "Zoom")
	protected Vector1D zoom;

	/**
	 * Gets the value of the panTilt property.
	 * 
	 * @return possible object is {@link Vector2D }
	 * 
	 */
	public Vector2D getPanTilt() {
		return panTilt;
	}

	/**
	 * Sets the value of the panTilt property.
	 * 
	 * @param value -
	 *            allowed object is {@link Vector2D }
	 * 
	 */
	public void setPanTilt(Vector2D value) {
		this.panTilt = value;
	}

	/**
	 * Gets the value of the zoom property.
	 * 
	 * @return possible object is {@link Vector1D }
	 * 
	 */
	public Vector1D getZoom() {
		return zoom;
	}

	/**
	 * Sets the value of the zoom property.
	 * 
	 * @param value -
	 *            allowed object is {@link Vector1D }
	 * 
	 */
	public void setZoom(Vector1D value) {
		this.zoom = value;
	}

}
