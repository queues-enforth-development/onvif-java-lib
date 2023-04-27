//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is compiled. 
// Generiert: 2016.02.05 um 06:25:30 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * Java-Klasse für VideoRateControl2 complex type.
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * &lt;complexType name="VideoRateControl2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FrameRateLimit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="BitrateLimit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ConstantBitRate" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoRateControl2", propOrder = {
    "frameRateLimit",
    "bitrateLimit",
    "any"
})
public class VideoRateControl2 {

    /**
     *
     */
    @XmlElement(name = "FrameRateLimit")
    protected float frameRateLimit;

    /**
     *
     */
    @XmlElement(name = "BitrateLimit")
    protected int bitrateLimit;

    /**
     *
     */
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    /**
     *
     */
    @XmlAttribute(name = "ConstantBitRate")
    protected Boolean constantBitRate;
    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Ruft den Wert der frameRateLimit-Eigenschaft ab.
     * 
     * @return  -
     */
    public float getFrameRateLimit() {
        return frameRateLimit;
    }

    /**
     * Legt den Wert der frameRateLimit-Eigenschaft fest.
     * 
     * @param value -
     */
    public void setFrameRateLimit(float value) {
        this.frameRateLimit = value;
    }

    /**
     * Ruft den Wert der bitrateLimit-Eigenschaft ab.
     * 
     * @return  -
     */
    public int getBitrateLimit() {
        return bitrateLimit;
    }

    /**
     * Legt den Wert der bitrateLimit-Eigenschaft fest.
     * 
     * @param value -
     */
    public void setBitrateLimit(int value) {
        this.bitrateLimit = value;
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
     * {@link Element }
     * {@link java.lang.Object }
     * 
     * 
     * @return  -
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * Ruft den Wert der constantBitRate-Eigenschaft ab.
     * 
     * @return -
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConstantBitRate() {
        return constantBitRate;
    }

    /**
     * Legt den Wert der constantBitRate-Eigenschaft fest.
     * 
     * @param value -
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConstantBitRate(Boolean value) {
        this.constantBitRate = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * 
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return -
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
