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
import org.onvif.ver10.schema.BinaryData;

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
 *         <element name="PolicyFile" type="{http://www.onvif.org/ver10/schema}BinaryData"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "policyFile" })
@XmlRootElement(name = "SetAccessPolicy")
public class SetAccessPolicy {

    /**
     *
     */
    @XmlElement(name = "PolicyFile", required = true)
	protected BinaryData policyFile;

	/**
	 * Ruft den Wert der policyFile-Eigenschaft ab.
	 * 
	 * @return possible object is {@link BinaryData }
	 * 
	 */
	public BinaryData getPolicyFile() {
		return policyFile;
	}

	/**
	 * Legt den Wert der policyFile-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link BinaryData }
	 * 
	 */
	public void setPolicyFile(BinaryData value) {
		this.policyFile = value;
	}

}
