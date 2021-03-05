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
 * <p>Java-Klasse für LensDescription complex type.
 * 
 * <p>The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * &lt;complexType name="LensDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Offset" type="{http://www.onvif.org/ver10/schema}LensOffset"/>
 *         &lt;element name="Projection" type="{http://www.onvif.org/ver10/schema}LensProjection" maxOccurs="unbounded"/>
 *         &lt;element name="XFactor" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FocalLength" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LensDescription", propOrder = {
    "offset",
    "projection",
    "xFactor",
    "any"
})
public class LensDescription {

    /**
     *
     */
    @XmlElement(name = "Offset", required = true)
    protected LensOffset offset;

    /**
     *
     */
    @XmlElement(name = "Projection", required = true)
    protected List<LensProjection> projection;

    /**
     *
     */
    @XmlElement(name = "XFactor")
    protected float xFactor;

    /**
     *
     */
    @XmlAnyElement(lax = true)
    protected List<java.lang.Object> any;

    /**
     *
     */
    @XmlAttribute(name = "FocalLength")
    protected Float focalLength;
    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Ruft den Wert der offset-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LensOffset }
     *     
     */
    public LensOffset getOffset() {
        return offset;
    }

    /**
     * Legt den Wert der offset-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LensOffset }
     *     
     */
    public void setOffset(LensOffset value) {
        this.offset = value;
    }

    /**
     * Gets the value of the projection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>{@code
     *    getProjection().add(newItem);
     * }</pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LensProjection }
     * 
     * 
     * @return 
     */
    public List<LensProjection> getProjection() {
        if (projection == null) {
            projection = new ArrayList<>();
        }
        return this.projection;
    }

    /**
     * Ruft den Wert der xFactor-Eigenschaft ab.
     * 
     * @return 
     */
    public float getXFactor() {
        return xFactor;
    }

    /**
     * Legt den Wert der xFactor-Eigenschaft fest.
     * 
     * @param value
     */
    public void setXFactor(float value) {
        this.xFactor = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>{@code
     *    getAny().add(newItem);
     * }</pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link java.lang.Object }
     * 
     * 
     * @return 
     */
    public List<java.lang.Object> getAny() {
        if (any == null) {
            any = new ArrayList<>();
        }
        return this.any;
    }

    /**
     * Ruft den Wert der focalLength-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFocalLength() {
        return focalLength;
    }

    /**
     * Legt den Wert der focalLength-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFocalLength(Float value) {
        this.focalLength = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
