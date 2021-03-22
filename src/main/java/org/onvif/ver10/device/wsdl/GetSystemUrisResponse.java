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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.SystemLogUriList;
import org.w3c.dom.Element;

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
 *         <element name="SystemLogUris" type="{http://www.onvif.org/ver10/schema}SystemLogUriList" minOccurs="0"/>
 *         <element name="SupportInfoUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="SystemBackupUri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         <element name="Extension" minOccurs="0">
 *           <complexType>
               <complexContent>
                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                   <sequence>
                     <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
                   </sequence>
                 </restriction>
               </complexContent>
 *           </complexType>
 *         </element>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "systemLogUris", "supportInfoUri", "systemBackupUri", "extension" })
@XmlRootElement(name = "GetSystemUrisResponse")
public class GetSystemUrisResponse {

    /**
     *
     */
    @XmlElement(name = "SystemLogUris")
	protected SystemLogUriList systemLogUris;

    /**
     *
     */
    @XmlElement(name = "SupportInfoUri")
	@XmlSchemaType(name = "anyURI")
	protected String supportInfoUri;

    /**
     *
     */
    @XmlElement(name = "SystemBackupUri")
	@XmlSchemaType(name = "anyURI")
	protected String systemBackupUri;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected GetSystemUrisResponse.Extension extension;

	/**
	 * Ruft den Wert der systemLogUris-Eigenschaft ab.
	 * 
	 * @return possible object is {@link SystemLogUriList }
	 * 
	 */
	public SystemLogUriList getSystemLogUris() {
		return systemLogUris;
	}

	/**
	 * Legt den Wert der systemLogUris-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link SystemLogUriList }
	 * 
	 */
	public void setSystemLogUris(SystemLogUriList value) {
		this.systemLogUris = value;
	}

	/**
	 * Ruft den Wert der supportInfoUri-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSupportInfoUri() {
		return supportInfoUri;
	}

	/**
	 * Legt den Wert der supportInfoUri-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSupportInfoUri(String value) {
		this.supportInfoUri = value;
	}

	/**
	 * Ruft den Wert der systemBackupUri-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSystemBackupUri() {
		return systemBackupUri;
	}

	/**
	 * Legt den Wert der systemBackupUri-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSystemBackupUri(String value) {
		this.systemBackupUri = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link GetSystemUrisResponse.Extension }
	 * 
	 */
	public GetSystemUrisResponse.Extension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link GetSystemUrisResponse.Extension }
	 * 
	 */
	public void setExtension(GetSystemUrisResponse.Extension value) {
		this.extension = value;
	}

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
	           <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
	         </sequence>
	       </restriction>
	     </complexContent>
	   </complexType>
	 * }</pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "any" })
	public static class Extension {

        /**
         *
         */
        @XmlAnyElement(lax = true)
		protected List<Object> any;

		/**
		 * Gets the value of the any property.
		 * 
		 * <p>
		 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB
		 * object. This is why there is not a <CODE>set</CODE> method for the any property.
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
		 * Objects of the following type(s) are allowed in the list {@link Element } {@link Object }
		 * 
		 * 
         * @return 
		 */
		public List<Object> getAny() {
			if (any == null) {
				any = new ArrayList<>();
			}
			return this.any;
		}

	}

}
