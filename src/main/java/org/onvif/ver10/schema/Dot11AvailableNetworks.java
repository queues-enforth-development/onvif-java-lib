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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;

/**
 * 
 * Java-Klasse f�r Dot11AvailableNetworks complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="Dot11AvailableNetworks">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="SSID" type="{http://www.onvif.org/ver10/schema}Dot11SSIDType"/>
 *         <element name="BSSID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AuthAndMangementSuite" type="{http://www.onvif.org/ver10/schema}Dot11AuthAndMangementSuite" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PairCipher" type="{http://www.onvif.org/ver10/schema}Dot11Cipher" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="GroupCipher" type="{http://www.onvif.org/ver10/schema}Dot11Cipher" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SignalStrength" type="{http://www.onvif.org/ver10/schema}Dot11SignalStrength" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}Dot11AvailableNetworksExtension" minOccurs="0"/>
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
@XmlType(name = "Dot11AvailableNetworks", propOrder = { "ssid", "bssid", "authAndMangementSuite", "pairCipher", "groupCipher", "signalStrength", "extension" })
public class Dot11AvailableNetworks {

    /**
     *
     */
    @XmlElement(name = "SSID", required = true, type = String.class)
	@XmlJavaTypeAdapter(HexBinaryAdapter.class)
	protected byte[] ssid;

    /**
     *
     */
    @XmlElement(name = "BSSID")
	protected String bssid;

    /**
     *
     */
    @XmlElement(name = "AuthAndMangementSuite")
	protected List<Dot11AuthAndMangementSuite> authAndMangementSuite;

    /**
     *
     */
    @XmlElement(name = "PairCipher")
	protected List<Dot11Cipher> pairCipher;

    /**
     *
     */
    @XmlElement(name = "GroupCipher")
	protected List<Dot11Cipher> groupCipher;

    /**
     *
     */
    @XmlElement(name = "SignalStrength")
	protected Dot11SignalStrength signalStrength;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected Dot11AvailableNetworksExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der ssid-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public byte[] getSSID() {
		return ssid;
	}

	/**
	 * Legt den Wert der ssid-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSSID(byte[] value) {
		this.ssid = value;
	}

	/**
	 * Ruft den Wert der bssid-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBSSID() {
		return bssid;
	}

	/**
	 * Legt den Wert der bssid-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBSSID(String value) {
		this.bssid = value;
	}

	/**
	 * Gets the value of the authAndMangementSuite property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the authAndMangementSuite property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getAuthAndMangementSuite().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link Dot11AuthAndMangementSuite }
	 * 
	 * 
     * @return  -
	 */
	public List<Dot11AuthAndMangementSuite> getAuthAndMangementSuite() {
		if (authAndMangementSuite == null) {
			authAndMangementSuite = new ArrayList<>();
		}
		return this.authAndMangementSuite;
	}

	/**
	 * Gets the value of the pairCipher property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the pairCipher property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getPairCipher().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link Dot11Cipher }
	 * 
	 * 
     * @return  -
	 */
	public List<Dot11Cipher> getPairCipher() {
		if (pairCipher == null) {
			pairCipher = new ArrayList<>();
		}
		return this.pairCipher;
	}

	/**
	 * Gets the value of the groupCipher property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the groupCipher property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getGroupCipher().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link Dot11Cipher }
	 * 
	 * 
     * @return  -
	 */
	public List<Dot11Cipher> getGroupCipher() {
		if (groupCipher == null) {
			groupCipher = new ArrayList<>();
		}
		return this.groupCipher;
	}

	/**
	 * Ruft den Wert der signalStrength-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Dot11SignalStrength }
	 * 
	 */
	public Dot11SignalStrength getSignalStrength() {
		return signalStrength;
	}

	/**
	 * Legt den Wert der signalStrength-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Dot11SignalStrength }
	 * 
	 */
	public void setSignalStrength(Dot11SignalStrength value) {
		this.signalStrength = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Dot11AvailableNetworksExtension }
	 * 
	 */
	public Dot11AvailableNetworksExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Dot11AvailableNetworksExtension }
	 * 
	 */
	public void setExtension(Dot11AvailableNetworksExtension value) {
		this.extension = value;
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
