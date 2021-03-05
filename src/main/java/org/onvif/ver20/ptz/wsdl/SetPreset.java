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
 * <p>
 * Java-Class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
   <complexType>
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="ProfileToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="PresetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PresetToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "profileToken", "presetName", "presetToken" })
@XmlRootElement(name = "SetPreset")
public class SetPreset {

    /**
     *
     */
    @XmlElement(name = "ProfileToken", required = true)
	protected String profileToken;

    /**
     *
     */
    @XmlElement(name = "PresetName")
	protected String presetName;

    /**
     *
     */
    @XmlElement(name = "PresetToken")
	protected String presetToken;

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
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProfileToken(String value) {
		this.profileToken = value;
	}

	/**
	 * Ruft den Wert der presetName-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPresetName() {
		return presetName;
	}

	/**
	 * Legt den Wert der presetName-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPresetName(String value) {
		this.presetName = value;
	}

	/**
	 * Ruft den Wert der presetToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPresetToken() {
		return presetToken;
	}

	/**
	 * Legt den Wert der presetToken-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPresetToken(String value) {
		this.presetToken = value;
	}

}
