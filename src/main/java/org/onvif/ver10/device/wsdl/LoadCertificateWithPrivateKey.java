//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.device.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.CertificateWithPrivateKey;

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
 *         <element name="CertificateWithPrivateKey" type="{http://www.onvif.org/ver10/schema}CertificateWithPrivateKey" maxOccurs="unbounded"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "certificateWithPrivateKey" })
@XmlRootElement(name = "LoadCertificateWithPrivateKey")
public class LoadCertificateWithPrivateKey {

    /**
     *
     */
    @XmlElement(name = "CertificateWithPrivateKey", required = true)
	protected List<CertificateWithPrivateKey> certificateWithPrivateKey;

	/**
	 * Gets the value of the certificateWithPrivateKey property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the certificateWithPrivateKey property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getCertificateWithPrivateKey().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link CertificateWithPrivateKey }
	 * 
	 * 
     * @return  -
	 */
	public List<CertificateWithPrivateKey> getCertificateWithPrivateKey() {
		if (certificateWithPrivateKey == null) {
			certificateWithPrivateKey = new ArrayList<>();
		}
		return this.certificateWithPrivateKey;
	}

}
