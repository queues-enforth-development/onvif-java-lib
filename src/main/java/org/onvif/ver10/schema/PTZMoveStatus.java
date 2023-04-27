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
 * <p>
 * Java-Klasse f�r PTZMoveStatus complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="PTZMoveStatus">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="PanTilt" type="{http://www.onvif.org/ver10/schema}MoveStatus" minOccurs="0"/>
 *         <element name="Zoom" type="{http://www.onvif.org/ver10/schema}MoveStatus" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZMoveStatus", propOrder = { "panTilt", "zoom" })
public class PTZMoveStatus {

    /**
     *
     */
    @XmlElement(name = "PanTilt")
	protected MoveStatus panTilt;

    /**
     *
     */
    @XmlElement(name = "Zoom")
	protected MoveStatus zoom;

	/**
	 * Ruft den Wert der panTilt-Eigenschaft ab.
	 * 
	 * @return possible object is {@link MoveStatus }
	 * 
	 */
	public MoveStatus getPanTilt() {
		return panTilt;
	}

	/**
	 * Legt den Wert der panTilt-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link MoveStatus }
	 * 
	 */
	public void setPanTilt(MoveStatus value) {
		this.panTilt = value;
	}

	/**
	 * Ruft den Wert der zoom-Eigenschaft ab.
	 * 
	 * @return possible object is {@link MoveStatus }
	 * 
	 */
	public MoveStatus getZoom() {
		return zoom;
	}

	/**
	 * Legt den Wert der zoom-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link MoveStatus }
	 * 
	 */
	public void setZoom(MoveStatus value) {
		this.zoom = value;
	}

}
