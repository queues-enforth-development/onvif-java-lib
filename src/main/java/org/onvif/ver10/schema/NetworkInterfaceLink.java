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
 * Java-Klasse f�r NetworkInterfaceLink complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="NetworkInterfaceLink">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="AdminSettings" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceConnectionSetting"/>
 *         <element name="OperSettings" type="{http://www.onvif.org/ver10/schema}NetworkInterfaceConnectionSetting"/>
 *         <element name="InterfaceType" type="{http://www.onvif.org/ver10/schema}IANA-IfTypes"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkInterfaceLink", propOrder = { "adminSettings", "operSettings", "interfaceType" })
public class NetworkInterfaceLink {

    /**
     *
     */
    @XmlElement(name = "AdminSettings", required = true)
	protected NetworkInterfaceConnectionSetting adminSettings;

    /**
     *
     */
    @XmlElement(name = "OperSettings", required = true)
	protected NetworkInterfaceConnectionSetting operSettings;

    /**
     *
     */
    @XmlElement(name = "InterfaceType")
	protected int interfaceType;

	/**
	 * Ruft den Wert der adminSettings-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NetworkInterfaceConnectionSetting }
	 * 
	 */
	public NetworkInterfaceConnectionSetting getAdminSettings() {
		return adminSettings;
	}

	/**
	 * Legt den Wert der adminSettings-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link NetworkInterfaceConnectionSetting }
	 * 
	 */
	public void setAdminSettings(NetworkInterfaceConnectionSetting value) {
		this.adminSettings = value;
	}

	/**
	 * Ruft den Wert der operSettings-Eigenschaft ab.
	 * 
	 * @return possible object is {@link NetworkInterfaceConnectionSetting }
	 * 
	 */
	public NetworkInterfaceConnectionSetting getOperSettings() {
		return operSettings;
	}

	/**
	 * Legt den Wert der operSettings-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link NetworkInterfaceConnectionSetting }
	 * 
	 */
	public void setOperSettings(NetworkInterfaceConnectionSetting value) {
		this.operSettings = value;
	}

	/**
	 * Ruft den Wert der interfaceType-Eigenschaft ab.
	 * 
     * @return 
	 */
	public int getInterfaceType() {
		return interfaceType;
	}

	/**
	 * Legt den Wert der interfaceType-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setInterfaceType(int value) {
		this.interfaceType = value;
	}

}
