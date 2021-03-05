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
 *         &lt;element name="ConfigurationToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
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
    "configurationToken"
})
@XmlRootElement(name = "GetOSDOptions")
public class GetOSDOptions {

    /**
     *
     */
    @XmlElement(name = "ConfigurationToken", required = true)
    protected String configurationToken;

    /**
     * Ruft den Wert der configurationToken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationToken() {
        return configurationToken;
    }

    /**
     * Legt den Wert der configurationToken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationToken(String value) {
        this.configurationToken = value;
    }

}
