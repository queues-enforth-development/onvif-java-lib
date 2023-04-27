//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generiert: 2014.02.19 um 02:35:56 PM CET 
//

package org.onvif.ver10.media.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.AudioSourceConfigurationOptions;

/**
 * 
 * Java-Class for anonymous complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
   <complexType>
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Options" type="{http://www.onvif.org/ver10/schema}AudioSourceConfigurationOptions"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "options" })
@XmlRootElement(name = "GetAudioSourceConfigurationOptionsResponse")
public class GetAudioSourceConfigurationOptionsResponse {

    /**
     *
     */
    @XmlElement(name = "Options", required = true)
	protected AudioSourceConfigurationOptions options;

	/**
	 * Ruft den Wert der options-Eigenschaft ab.
	 * 
	 * @return possible object is {@link AudioSourceConfigurationOptions }
	 * 
	 */
	public AudioSourceConfigurationOptions getOptions() {
		return options;
	}

	/**
	 * Legt den Wert der options-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link AudioSourceConfigurationOptions }
	 * 
	 */
	public void setOptions(AudioSourceConfigurationOptions value) {
		this.options = value;
	}

}
