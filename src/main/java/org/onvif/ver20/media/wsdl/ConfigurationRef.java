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
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für ConfigurationRef complex type.
 * 
 * <p>The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * &lt;complexType name="ConfigurationRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Token" type="{http://www.onvif.org/ver10/schema}ReferenceToken" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationRef", propOrder = {
    "type",
    "token"
})
public class ConfigurationRef {

    /**
     *
     */
    @XmlElement(name = "Type", required = true)
    protected String type;

    /**
     *
     */
    @XmlElement(name = "Token")
    protected String token;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der token-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Legt den Wert der token-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
