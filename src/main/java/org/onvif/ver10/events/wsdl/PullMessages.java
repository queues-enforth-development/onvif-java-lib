//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is compiled. 
// Generiert: 2016.03.16 um 01:52:47 PM CET 
//

package org.onvif.ver10.events.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;

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
 *         &lt;element name="Timeout" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         &lt;element name="MessageLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
    "timeout",
    "messageLimit",
    "any"
})
@XmlRootElement(name = "PullMessages")
public class PullMessages {

    /**
     *
     */
    @XmlElement(name = "Timeout", required = true)
    protected Duration timeout;

    /**
     *
     */
    @XmlElement(name = "MessageLimit")
    protected int messageLimit;

    /**
     *
     */
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Ruft den Wert der timeout-Eigenschaft ab.
     * 
     * @return -
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeout() {
        return timeout;
    }

    /**
     * Legt den Wert der timeout-Eigenschaft fest.
     * 
     * @param value -
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeout(Duration value) {
        this.timeout = value;
    }

    /**
     * Ruft den Wert der messageLimit-Eigenschaft ab.
     * 
     * @return  -
     */
    public int getMessageLimit() {
        return messageLimit;
    }

    /**
     * Legt den Wert der messageLimit-Eigenschaft fest.
     * 
     * @param value -
     */
    public void setMessageLimit(int value) {
        this.messageLimit = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * 
     * For example, to add a new item, do as follows:
     * <pre>{@code
     *    getAny().add(newItem);
     * }</pre>
     * 
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     * @return  -
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

}
