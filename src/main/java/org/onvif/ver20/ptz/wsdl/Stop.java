//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generiert: 2014.02.17 um 11:33:29 AM CET 
//

package org.onvif.ver20.ptz.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * Java-Class for anonymous complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
   <complexType>
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="ProfileToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="PanTilt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Zoom" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "profileToken", "panTilt", "zoom" })
@XmlRootElement(name = "Stop")
public class Stop {

    /**
     *
     */
    @XmlElement(name = "ProfileToken", required = true)
	protected String profileToken;

    /**
     *
     */
    @XmlElement(name = "PanTilt")
	protected Boolean panTilt;

    /**
     *
     */
    @XmlElement(name = "Zoom")
	protected Boolean zoom;

	/**
	 * Ruft den Wert der profileToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProfileToken() {
		return profileToken;
	}

	/**
	 * Legt den Wert der profileToken-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProfileToken(String value) {
		this.profileToken = value;
	}

	/**
	 * Ruft den Wert der panTilt-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isPanTilt() {
		return panTilt;
	}

	/**
	 * Legt den Wert der panTilt-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setPanTilt(Boolean value) {
		this.panTilt = value;
	}

	/**
	 * Ruft den Wert der zoom-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isZoom() {
		return zoom;
	}

	/**
	 * Legt den Wert der zoom-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setZoom(Boolean value) {
		this.zoom = value;
	}

}
