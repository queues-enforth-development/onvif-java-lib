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
import org.onvif.ver10.schema.NetworkInterfaceSetConfiguration;

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
 *         <element name="InterfaceToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
 *         <element name="NetworkInterface" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceSetConfiguration"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "interfaceToken", "networkInterface" })
@XmlRootElement(name = "SetNetworkInterfaces")
public class SetNetworkInterfaces {

    /**
     *
     */
    @XmlElement(name = "InterfaceToken", required = true)
	protected String interfaceToken;

    /**
     *
     */
    @XmlElement(name = "NetworkInterface", required = true)
	protected NetworkInterfaceSetConfiguration networkInterface;

	/**
	 * Ruft den Wert der interfaceToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getInterfaceToken() {
		return interfaceToken;
	}

	/**
	 * Legt den Wert der interfaceToken-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setInterfaceToken(String value) {
		this.interfaceToken = value;
	}

	/**
	 * Ruft den Wert der networkInterface-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NetworkInterfaceSetConfiguration }
	 * 
	 */
	public NetworkInterfaceSetConfiguration getNetworkInterface() {
		return networkInterface;
	}

	/**
	 * Legt den Wert der networkInterface-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link NetworkInterfaceSetConfiguration }
	 * 
	 */
	public void setNetworkInterface(NetworkInterfaceSetConfiguration value) {
		this.networkInterface = value;
	}

}
