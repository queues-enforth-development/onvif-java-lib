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
import org.onvif.ver10.schema.MediaUri;

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
 *         <element name="MediaUri" type="{http://www.onvif.org/ver10/schema}MediaUri"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "mediaUri" })
@XmlRootElement(name = "GetSnapshotUriResponse")
public class GetSnapshotUriResponse {

    /**
     *
     */
    @XmlElement(name = "MediaUri", required = true)
	protected MediaUri mediaUri;

	/**
	 * Ruft den Wert der mediaUri-Eigenschaft ab.
	 * 
	 * @return possible object is {@link MediaUri }
	 * 
	 */
	public MediaUri getMediaUri() {
		return mediaUri;
	}

	/**
	 * Legt den Wert der mediaUri-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link MediaUri }
	 * 
	 */
	public void setMediaUri(MediaUri value) {
		this.mediaUri = value;
	}

}
