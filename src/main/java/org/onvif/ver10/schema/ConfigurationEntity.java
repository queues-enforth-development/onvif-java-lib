//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Base type defining the common properties of a configuration.
 * 
 * 
 * Java-Klasse f�r ConfigurationEntity complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="ConfigurationEntity">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="Name" type="{http://www.onvif.org/ver10/schema}Name"/>
 *         <element name="UseCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
         </sequence>
 *       <attribute name="token" use="required" type="{http://www.onvif.org/ver10/schema}ReferenceToken" />
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationEntity", propOrder = { "name", "useCount" })
@XmlSeeAlso({ AudioSourceConfiguration.class, PTZConfiguration.class, VideoSourceConfiguration.class, AudioEncoderConfiguration.class,
		VideoEncoderConfiguration.class, AudioDecoderConfiguration.class, VideoAnalyticsConfiguration.class, AudioOutputConfiguration.class,
		MetadataConfiguration.class, AnalyticsEngineInput.class, AnalyticsEngineControl.class, AnalyticsEngine.class, VideoOutputConfiguration.class })
public class ConfigurationEntity {

    /**
     *
     */
    @XmlElement(name = "Name", required = true)
	protected String name;

    /**
     *
     */
    @XmlElement(name = "UseCount")
	protected int useCount;

    /**
     *
     */
    @XmlAttribute(name = "token", required = true)
	protected String token;

	/**
	 * Ruft den Wert der name-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Legt den Wert der name-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Ruft den Wert der useCount-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public int getUseCount() {
		return useCount;
	}

	/**
	 * Legt den Wert der useCount-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setUseCount(int value) {
		this.useCount = value;
	}

	/**
	 * Ruft den Wert der token-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getToken() {
		return token;
	}

	/**
	 * Legt den Wert der token-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setToken(String value) {
		this.token = value;
	}

}
