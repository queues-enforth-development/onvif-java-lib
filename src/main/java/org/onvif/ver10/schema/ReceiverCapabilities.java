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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * <p>
 * Java-Klasse f�r ReceiverCapabilities complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="ReceiverCapabilities">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="XAddr" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         <element name="RTP_Multicast" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="RTP_TCP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="RTP_RTSP_TCP" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="SupportedReceivers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="MaximumRTSPURILength" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "ReceiverCapabilities", propOrder = { "xAddr", "rtpMulticast", "rtptcp", "rtprtsptcp", "supportedReceivers", "maximumRTSPURILength", "any" })
public class ReceiverCapabilities {

    /**
     *
     */
    @XmlElement(name = "XAddr", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String xAddr;

    /**
     *
     */
    @XmlElement(name = "RTP_Multicast")
	protected boolean rtpMulticast;

    /**
     *
     */
    @XmlElement(name = "RTP_TCP")
	protected boolean rtptcp;

    /**
     *
     */
    @XmlElement(name = "RTP_RTSP_TCP")
	protected boolean rtprtsptcp;

    /**
     *
     */
    @XmlElement(name = "SupportedReceivers")
	protected int supportedReceivers;

    /**
     *
     */
    @XmlElement(name = "MaximumRTSPURILength")
	protected int maximumRTSPURILength;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der xAddr-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getXAddr() {
		return xAddr;
	}

	/**
	 * Legt den Wert der xAddr-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setXAddr(String value) {
		this.xAddr = value;
	}

	/**
	 * Ruft den Wert der rtpMulticast-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isRTPMulticast() {
		return rtpMulticast;
	}

	/**
	 * Legt den Wert der rtpMulticast-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setRTPMulticast(boolean value) {
		this.rtpMulticast = value;
	}

	/**
	 * Ruft den Wert der rtptcp-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isRTPTCP() {
		return rtptcp;
	}

	/**
	 * Legt den Wert der rtptcp-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setRTPTCP(boolean value) {
		this.rtptcp = value;
	}

	/**
	 * Ruft den Wert der rtprtsptcp-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isRTPRTSPTCP() {
		return rtprtsptcp;
	}

	/**
	 * Legt den Wert der rtprtsptcp-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setRTPRTSPTCP(boolean value) {
		this.rtprtsptcp = value;
	}

	/**
	 * Ruft den Wert der supportedReceivers-Eigenschaft ab.
	 * 
     * @return 
	 */
	public int getSupportedReceivers() {
		return supportedReceivers;
	}

	/**
	 * Legt den Wert der supportedReceivers-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setSupportedReceivers(int value) {
		this.supportedReceivers = value;
	}

	/**
	 * Ruft den Wert der maximumRTSPURILength-Eigenschaft ab.
	 * 
     * @return 
	 */
	public int getMaximumRTSPURILength() {
		return maximumRTSPURILength;
	}

	/**
	 * Legt den Wert der maximumRTSPURILength-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setMaximumRTSPURILength(int value) {
		this.maximumRTSPURILength = value;
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
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link java.lang.Object }
	 * 
	 * 
     * @return 
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
	 * <p>
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
