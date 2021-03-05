//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generiert: 2014.02.19 um 02:35:56 PM CET 
//

package org.onvif.ver10.media.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.OSDConfigurationOptions;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
   <complexType>
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="OSDOptions" type="{http://www.onvif.org/ver10/schema}OSDConfigurationOptions"/>
           <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "osdOptions", "any" })
@XmlRootElement(name = "GetOSDOptionsResponse")
public class GetOSDOptionsResponse {

    /**
     *
     */
    @XmlElement(name = "OSDOptions", required = true)
	protected OSDConfigurationOptions osdOptions;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<Object> any;

	/**
	 * Ruft den Wert der osdOptions-Eigenschaft ab.
	 * 
	 * @return possible object is {@link OSDConfigurationOptions }
	 * 
	 */
	public OSDConfigurationOptions getOSDOptions() {
		return osdOptions;
	}

	/**
	 * Legt den Wert der osdOptions-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link OSDConfigurationOptions }
	 * 
	 */
	public void setOSDOptions(OSDConfigurationOptions value) {
		this.osdOptions = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getAny().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Object } {@link Element }
	 * 
	 * 
     * @return 
	 */
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

}
