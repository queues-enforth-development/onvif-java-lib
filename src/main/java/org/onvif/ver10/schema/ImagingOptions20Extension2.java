//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r ImagingOptions20Extension2 complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="ImagingOptions20Extension2">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="IrCutFilterAutoAdjustment" type="{http://www.onvif.org/ver10/schema}IrCutFilterAutoAdjustmentOptions" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ImagingOptions20Extension3" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingOptions20Extension2", propOrder = { "irCutFilterAutoAdjustment", "extension" })
public class ImagingOptions20Extension2 {

    /**
     *
     */
    @XmlElement(name = "IrCutFilterAutoAdjustment")
	protected IrCutFilterAutoAdjustmentOptions irCutFilterAutoAdjustment;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected ImagingOptions20Extension3 extension;

	/**
	 * Ruft den Wert der irCutFilterAutoAdjustment-Eigenschaft ab.
	 * 
	 * @return possible object is {@link IrCutFilterAutoAdjustmentOptions }
	 * 
	 */
	public IrCutFilterAutoAdjustmentOptions getIrCutFilterAutoAdjustment() {
		return irCutFilterAutoAdjustment;
	}

	/**
	 * Legt den Wert der irCutFilterAutoAdjustment-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link IrCutFilterAutoAdjustmentOptions }
	 * 
	 */
	public void setIrCutFilterAutoAdjustment(IrCutFilterAutoAdjustmentOptions value) {
		this.irCutFilterAutoAdjustment = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ImagingOptions20Extension3 }
	 * 
	 */
	public ImagingOptions20Extension3 getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link ImagingOptions20Extension3 }
	 * 
	 */
	public void setExtension(ImagingOptions20Extension3 value) {
		this.extension = value;
	}

}
