//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is compiled. 
// Generiert: 2016.02.05 um 06:25:30 PM CET 
//

package org.onvif.ver20.media.wsdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * Java-Klasse f�r ProfileCapabilities complex type.
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * &lt;complexType name="ProfileCapabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MaximumNumberOfProfiles" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ConfigurationsSupported" type="{http://www.onvif.org/ver10/schema}StringAttrList" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileCapabilities", propOrder = {
    "any"
})
public class ProfileCapabilities {

    /**
     *
     */
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     *
     */
    @XmlAttribute(name = "MaximumNumberOfProfiles")
    protected Integer maximumNumberOfProfiles;

    /**
     *
     */
    @XmlAttribute(name = "ConfigurationsSupported")
    protected List<String> configurationsSupported;
    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

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

    /**
     * Ruft den Wert der maximumNumberOfProfiles-Eigenschaft ab.
     * 
     * @return -
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumNumberOfProfiles() {
        return maximumNumberOfProfiles;
    }

    /**
     * Legt den Wert der maximumNumberOfProfiles-Eigenschaft fest.
     * 
     * @param value -
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumNumberOfProfiles(Integer value) {
        this.maximumNumberOfProfiles = value;
    }

    /**
     * Gets the value of the configurationsSupported property.
     * 
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configurationsSupported property.
     * 
     * 
     * For example, to add a new item, do as follows:
     * <pre>{@code
     *    getConfigurationsSupported().add(newItem);
     * }</pre>
     * 
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return  -
     */
    public List<String> getConfigurationsSupported() {
        if (configurationsSupported == null) {
            configurationsSupported = new ArrayList<>();
        }
        return this.configurationsSupported;
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
