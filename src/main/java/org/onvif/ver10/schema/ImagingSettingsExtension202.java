//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r ImagingSettingsExtension202 complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="ImagingSettingsExtension202">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="IrCutFilterAutoAdjustment" type="{http://www.onvif.org/ver10/schema}IrCutFilterAutoAdjustment" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingSettingsExtension203" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingSettingsExtension202", propOrder = { "irCutFilterAutoAdjustment", "extension" })
public class ImagingSettingsExtension202 {

    /**
     *
     */
    @XmlElement(name = "IrCutFilterAutoAdjustment")
	protected List<IrCutFilterAutoAdjustment> irCutFilterAutoAdjustment;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected ImagingSettingsExtension203 extension;

	/**
	 * Gets the value of the irCutFilterAutoAdjustment property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the irCutFilterAutoAdjustment property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getIrCutFilterAutoAdjustment().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link IrCutFilterAutoAdjustment }
	 * 
	 * 
     * @return 
	 */
	public List<IrCutFilterAutoAdjustment> getIrCutFilterAutoAdjustment() {
		if (irCutFilterAutoAdjustment == null) {
			irCutFilterAutoAdjustment = new ArrayList<>();
		}
		return this.irCutFilterAutoAdjustment;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ImagingSettingsExtension203 }
	 * 
	 */
	public ImagingSettingsExtension203 getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ImagingSettingsExtension203 }
	 * 
	 */
	public void setExtension(ImagingSettingsExtension203 value) {
		this.extension = value;
	}

}
