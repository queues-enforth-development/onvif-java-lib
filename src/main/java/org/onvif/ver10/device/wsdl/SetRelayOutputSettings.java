//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.device.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.RelayOutputSettings;

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
 *         <element name="RelayOutputToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="Properties" type="{http://www.onvif.org/ver10/schema}RelayOutputSettings"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "relayOutputToken", "properties" })
@XmlRootElement(name = "SetRelayOutputSettings")
public class SetRelayOutputSettings {

    /**
     *
     */
    @XmlElement(name = "RelayOutputToken", required = true)
	protected String relayOutputToken;

    /**
     *
     */
    @XmlElement(name = "Properties", required = true)
	protected RelayOutputSettings properties;

	/**
	 * Ruft den Wert der relayOutputToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRelayOutputToken() {
		return relayOutputToken;
	}

	/**
	 * Legt den Wert der relayOutputToken-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRelayOutputToken(String value) {
		this.relayOutputToken = value;
	}

	/**
	 * Ruft den Wert der properties-Eigenschaft ab.
	 * 
	 * @return possible object is {@link RelayOutputSettings }
	 * 
	 */
	public RelayOutputSettings getProperties() {
		return properties;
	}

	/**
	 * Legt den Wert der properties-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link RelayOutputSettings }
	 * 
	 */
	public void setProperties(RelayOutputSettings value) {
		this.properties = value;
	}

}
