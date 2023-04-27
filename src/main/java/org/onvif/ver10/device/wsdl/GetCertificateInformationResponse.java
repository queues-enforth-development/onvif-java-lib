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
import org.onvif.ver10.schema.CertificateInformation;

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
 *         <element name="CertificateInformation" type="{http://www.onvif.org/ver10/schema}CertificateInformation"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "certificateInformation" })
@XmlRootElement(name = "GetCertificateInformationResponse")
public class GetCertificateInformationResponse {

    /**
     *
     */
    @XmlElement(name = "CertificateInformation", required = true)
	protected CertificateInformation certificateInformation;

	/**
	 * Ruft den Wert der certificateInformation-Eigenschaft ab.
	 * 
	 * @return possible object is {@link CertificateInformation }
	 * 
	 */
	public CertificateInformation getCertificateInformation() {
		return certificateInformation;
	}

	/**
	 * Legt den Wert der certificateInformation-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link CertificateInformation }
	 * 
	 */
	public void setCertificateInformation(CertificateInformation value) {
		this.certificateInformation = value;
	}

}
