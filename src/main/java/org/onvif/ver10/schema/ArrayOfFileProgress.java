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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * Java-Klasse f�r ArrayOfFileProgress complex type.
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * &lt;complexType name="ArrayOfFileProgress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileProgress" type="{http://www.onvif.org/ver10/schema}FileProgress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}ArrayOfFileProgressExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFileProgress", propOrder = {
    "fileProgress",
    "extension"
})
public class ArrayOfFileProgress {

    /**
     *
     */
    @XmlElement(name = "FileProgress")
    protected List<FileProgress> fileProgress;

    /**
     *
     */
    @XmlElement(name = "Extension")
    protected ArrayOfFileProgressExtension extension;
    @XmlAnyAttribute
    private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the fileProgress property.
     * 
     * 
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileProgress property.
     * 
     * 
     * For example, to add a new item, do as follows:
     * <pre>{@code
     *    getFileProgress().add(newItem);
     * }</pre>
     * 
     * 
     * 
     * Objects of the following type(s) are allowed in the list
     * {@link FileProgress }
     * 
     * 
     * @return  -
     */
    public List<FileProgress> getFileProgress() {
        if (fileProgress == null) {
            fileProgress = new ArrayList<>();
        }
        return this.fileProgress;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     * 
     * @return -
     *     possible object is
     *     {@link ArrayOfFileProgressExtension }
     *     
     */
    public ArrayOfFileProgressExtension getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     * 
     * @param value -
     *     allowed object is
     *     {@link ArrayOfFileProgressExtension }
     *     
     */
    public void setExtension(ArrayOfFileProgressExtension value) {
        this.extension = value;
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
