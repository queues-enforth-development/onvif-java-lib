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
import org.onvif.ver10.schema.StreamSetup;

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
 *         <element name="StreamSetup" type="{http://www.onvif.org/ver10/schema}StreamSetup"/>
 *         <element name="ProfileToken" type="{http://www.onvif.org/ver10/schema}ReferenceToken"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "streamSetup", "profileToken" })
@XmlRootElement(name = "GetStreamUri")
public class GetStreamUri {

    /**
     *
     */
    @XmlElement(name = "StreamSetup", required = true)
	protected StreamSetup streamSetup;

    /**
     *
     */
    @XmlElement(name = "ProfileToken", required = true)
	protected String profileToken;

	/**
	 * Ruft den Wert der streamSetup-Eigenschaft ab.
	 * 
	 * @return possible object is {@link StreamSetup }
	 * 
	 */
	public StreamSetup getStreamSetup() {
		return streamSetup;
	}

	/**
	 * Legt den Wert der streamSetup-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link StreamSetup }
	 * 
	 */
	public void setStreamSetup(StreamSetup value) {
		this.streamSetup = value;
	}

	/**
	 * Ruft den Wert der profileToken-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getProfileToken() {
		return profileToken;
	}

	/**
	 * Legt den Wert der profileToken-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setProfileToken(String value) {
		this.profileToken = value;
	}

}
