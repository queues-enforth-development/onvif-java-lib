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
 * Java-Klasse f�r H264Configuration complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="H264Configuration">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="GovLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="H264Profile" type="{http://www.onvif.org/ver10/schema}H264Profile"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "H264Configuration", propOrder = { "govLength", "h264Profile" })
public class H264Configuration {

    /**
     *
     */
    @XmlElement(name = "GovLength")
	protected int govLength;

    /**
     *
     */
    @XmlElement(name = "H264Profile", required = true)
	protected H264Profile h264Profile;

	/**
	 * Ruft den Wert der govLength-Eigenschaft ab.
	 * 
     * @return 
	 */
	public int getGovLength() {
		return govLength;
	}

	/**
	 * Legt den Wert der govLength-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setGovLength(int value) {
		this.govLength = value;
	}

	/**
	 * Ruft den Wert der h264Profile-Eigenschaft ab.
	 * 
	 * @return possible object is {@link H264Profile }
	 * 
	 */
	public H264Profile getH264Profile() {
		return h264Profile;
	}

	/**
	 * Legt den Wert der h264Profile-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link H264Profile }
	 * 
	 */
	public void setH264Profile(H264Profile value) {
		this.h264Profile = value;
	}

}
