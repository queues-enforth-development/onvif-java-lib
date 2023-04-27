//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is compiled. 
// Generiert: 2016.02.05 um 06:25:30 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für MetadataConfigurationOptionsExtension complex type.
 * 
 * <p>The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * &lt;complexType name="MetadataConfigurationOptionsExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompressionType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Extension" type="{http://www.onvif.org/ver10/schema}MetadataConfigurationOptionsExtension2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataConfigurationOptionsExtension", propOrder = {
    "compressionType",
    "extension"
})
public class MetadataConfigurationOptionsExtension {

    /**
     *
     */
    @XmlElement(name = "CompressionType")
    protected List<String> compressionType;

    /**
     *
     */
    @XmlElement(name = "Extension")
    protected MetadataConfigurationOptionsExtension2 extension;

    /**
     * Gets the value of the compressionType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compressionType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>{@code
     *    getCompressionType().add(newItem);
     * }</pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return 
     */
    public List<String> getCompressionType() {
        if (compressionType == null) {
            compressionType = new ArrayList<>();
        }
        return this.compressionType;
    }

    /**
     * Ruft den Wert der extension-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MetadataConfigurationOptionsExtension2 }
     *     
     */
    public MetadataConfigurationOptionsExtension2 getExtension() {
        return extension;
    }

    /**
     * Legt den Wert der extension-Eigenschaft fest.
     * 
     * @param value -
     *     allowed object is
     *     {@link MetadataConfigurationOptionsExtension2 }
     *     
     */
    public void setExtension(MetadataConfigurationOptionsExtension2 value) {
        this.extension = value;
    }

}
