//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * 
 * Java-Klasse f�r Dot11Capabilities complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="Dot11Capabilities">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="TKIP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ScanAvailableNetworks" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="MultipleConfiguration" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="AdHocStationMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="WEP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
           <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
         </sequence>
         <anyAttribute processContents='lax'/>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dot11Capabilities", propOrder = { "tkip", "scanAvailableNetworks", "multipleConfiguration", "adHocStationMode", "wep", "any" })
public class Dot11Capabilities {

    /**
     *
     */
    @XmlElement(name = "TKIP")
	protected boolean tkip;

    /**
     *
     */
    @XmlElement(name = "ScanAvailableNetworks")
	protected boolean scanAvailableNetworks;

    /**
     *
     */
    @XmlElement(name = "MultipleConfiguration")
	protected boolean multipleConfiguration;

    /**
     *
     */
    @XmlElement(name = "AdHocStationMode")
	protected boolean adHocStationMode;

    /**
     *
     */
    @XmlElement(name = "WEP")
	protected boolean wep;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der tkip-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public boolean isTKIP() {
		return tkip;
	}

	/**
	 * Legt den Wert der tkip-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setTKIP(boolean value) {
		this.tkip = value;
	}

	/**
	 * Ruft den Wert der scanAvailableNetworks-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public boolean isScanAvailableNetworks() {
		return scanAvailableNetworks;
	}

	/**
	 * Legt den Wert der scanAvailableNetworks-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setScanAvailableNetworks(boolean value) {
		this.scanAvailableNetworks = value;
	}

	/**
	 * Ruft den Wert der multipleConfiguration-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public boolean isMultipleConfiguration() {
		return multipleConfiguration;
	}

	/**
	 * Legt den Wert der multipleConfiguration-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setMultipleConfiguration(boolean value) {
		this.multipleConfiguration = value;
	}

	/**
	 * Ruft den Wert der adHocStationMode-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public boolean isAdHocStationMode() {
		return adHocStationMode;
	}

	/**
	 * Legt den Wert der adHocStationMode-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setAdHocStationMode(boolean value) {
		this.adHocStationMode = value;
	}

	/**
	 * Ruft den Wert der wep-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public boolean isWEP() {
		return wep;
	}

	/**
	 * Legt den Wert der wep-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setWEP(boolean value) {
		this.wep = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the any property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getAny().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link java.lang.Object }
	 * 
	 * 
     * @return  -
	 */
	public List<java.lang.Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * 
	 * the map is keyed by the name of the attribute and the value is the string value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}
