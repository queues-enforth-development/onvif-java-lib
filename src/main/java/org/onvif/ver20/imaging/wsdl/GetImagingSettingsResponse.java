//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is compiled. 
// Generiert: 2014.04.25 um 04:22:13 PM CEST 
//

package org.onvif.ver20.imaging.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.ImagingSettings20;

/**
 * Java-Class for anonymous complex type.
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ImagingSettings" type="{http://www.onvif.org/ver10/schema}ImagingSettings20"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "imagingSettings"
})
@XmlRootElement(name = "GetImagingSettingsResponse")
public class GetImagingSettingsResponse {

    /**
     *
     */
    @XmlElement(name = "ImagingSettings", required = true)
    protected ImagingSettings20 imagingSettings;

    /**
     * Ruft den Wert der imagingSettings-Eigenschaft ab.
     * 
     * @return -
     *     possible object is
     *     {@link ImagingSettings20 }
     *     
     */
    public ImagingSettings20 getImagingSettings() {
        return imagingSettings;
    }

    /**
     * Legt den Wert der imagingSettings-Eigenschaft fest.
     * 
     * @param value -
     *     allowed object is
     *     {@link ImagingSettings20 }
     *     
     */
    public void setImagingSettings(ImagingSettings20 value) {
        this.imagingSettings = value;
    }

}
