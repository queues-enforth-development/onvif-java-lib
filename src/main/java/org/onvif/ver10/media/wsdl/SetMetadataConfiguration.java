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
import org.onvif.ver10.schema.MetadataConfiguration;

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
 *         <element name="Configuration" type="{http://www.onvif.org/ver10/schema}MetadataConfiguration"/>
 *         <element name="ForcePersistence" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "configuration", "forcePersistence" })
@XmlRootElement(name = "SetMetadataConfiguration")
public class SetMetadataConfiguration {

    /**
     *
     */
    @XmlElement(name = "Configuration", required = true)
	protected MetadataConfiguration configuration;

    /**
     *
     */
    @XmlElement(name = "ForcePersistence")
	protected boolean forcePersistence;

	/**
	 * Ruft den Wert der configuration-Eigenschaft ab.
	 * 
	 * @return possible object is {@link MetadataConfiguration }
	 * 
	 */
	public MetadataConfiguration getConfiguration() {
		return configuration;
	}

	/**
	 * Legt den Wert der configuration-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link MetadataConfiguration }
	 * 
	 */
	public void setConfiguration(MetadataConfiguration value) {
		this.configuration = value;
	}

	/**
	 * Ruft den Wert der forcePersistence-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isForcePersistence() {
		return forcePersistence;
	}

	/**
	 * Legt den Wert der forcePersistence-Eigenschaft fest.
	 * 
     * @param value
	 */
	public void setForcePersistence(boolean value) {
		this.forcePersistence = value;
	}

}
