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
import org.onvif.ver10.schema.FocusMove;

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
 *         &lt;element name="VideoSourceToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         &lt;element name="Focus" type="{http://www.onvif.org/ver10/schema}FocusMove"/>
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
    "videoSourceToken",
    "focus"
})
@XmlRootElement(name = "Move")
public class Move {

    /**
     *
     */
    @XmlElement(name = "VideoSourceToken", required = true)
    protected String videoSourceToken;

    /**
     *
     */
    @XmlElement(name = "Focus", required = true)
    protected FocusMove focus;

    /**
     * Ruft den Wert der videoSourceToken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideoSourceToken() {
        return videoSourceToken;
    }

    /**
     * Legt den Wert der videoSourceToken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideoSourceToken(String value) {
        this.videoSourceToken = value;
    }

    /**
     * Ruft den Wert der focus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FocusMove }
     *     
     */
    public FocusMove getFocus() {
        return focus;
    }

    /**
     * Legt den Wert der focus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FocusMove }
     *     
     */
    public void setFocus(FocusMove value) {
        this.focus = value;
    }

}
