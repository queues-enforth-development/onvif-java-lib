//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is compiled. 
// Generiert: 2016.02.05 um 06:25:30 PM CET 
//


package org.onvif.ver20.media.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.AudioDecoderConfiguration;


/**
 * <p>Java-Class for anonymous complex type.
 * 
 * <p>The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Configuration" type="{http://www.onvif.org/ver10/schema}AudioDecoderConfiguration"/>
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
    "configuration"
})
@XmlRootElement(name = "SetAudioDecoderConfiguration")
public class SetAudioDecoderConfiguration {

    /**
     *
     */
    @XmlElement(name = "Configuration", required = true)
    protected AudioDecoderConfiguration configuration;

    /**
     * Ruft den Wert der configuration-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AudioDecoderConfiguration }
     *     
     */
    public AudioDecoderConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Legt den Wert der configuration-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AudioDecoderConfiguration }
     *     
     */
    public void setConfiguration(AudioDecoderConfiguration value) {
        this.configuration = value;
    }

}
