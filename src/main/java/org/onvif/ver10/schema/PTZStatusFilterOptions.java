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
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
import org.w3c.dom.Element;

/**
 * 
 * Java-Klasse f�r PTZStatusFilterOptions complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="PTZStatusFilterOptions">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="PanTiltStatusSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="ZoomStatusSupported" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
           <any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PanTiltPositionSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="ZoomPositionSupported" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZStatusFilterOptionsExtension" minOccurs="0"/>
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
@XmlType(name = "PTZStatusFilterOptions", propOrder = { "panTiltStatusSupported", "zoomStatusSupported", "any", "panTiltPositionSupported",
		"zoomPositionSupported", "extension" })
public class PTZStatusFilterOptions {

    /**
     *
     */
    @XmlElement(name = "PanTiltStatusSupported")
	protected boolean panTiltStatusSupported;

    /**
     *
     */
    @XmlElement(name = "ZoomStatusSupported")
	protected boolean zoomStatusSupported;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;

    /**
     *
     */
    @XmlElement(name = "PanTiltPositionSupported")
	protected Boolean panTiltPositionSupported;

    /**
     *
     */
    @XmlElement(name = "ZoomPositionSupported")
	protected Boolean zoomPositionSupported;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected PTZStatusFilterOptionsExtension extension;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der panTiltStatusSupported-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public boolean isPanTiltStatusSupported() {
		return panTiltStatusSupported;
	}

	/**
	 * Legt den Wert der panTiltStatusSupported-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setPanTiltStatusSupported(boolean value) {
		this.panTiltStatusSupported = value;
	}

	/**
	 * Ruft den Wert der zoomStatusSupported-Eigenschaft ab.
	 * 
     * @return  -
	 */
	public boolean isZoomStatusSupported() {
		return zoomStatusSupported;
	}

	/**
	 * Legt den Wert der zoomStatusSupported-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setZoomStatusSupported(boolean value) {
		this.zoomStatusSupported = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the any property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getAny().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link java.lang.Object }
	 * 
	 * 
     * @return  -
	 */
	public List<java.lang.Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

	/**
	 * Ruft den Wert der panTiltPositionSupported-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isPanTiltPositionSupported() {
		return panTiltPositionSupported;
	}

	/**
	 * Legt den Wert der panTiltPositionSupported-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setPanTiltPositionSupported(Boolean value) {
		this.panTiltPositionSupported = value;
	}

	/**
	 * Ruft den Wert der zoomPositionSupported-Eigenschaft ab.
	 * 
	 * @return possible object is {@link Boolean }
	 * 
	 */
	public Boolean isZoomPositionSupported() {
		return zoomPositionSupported;
	}

	/**
	 * Legt den Wert der zoomPositionSupported-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link Boolean }
	 * 
	 */
	public void setZoomPositionSupported(Boolean value) {
		this.zoomPositionSupported = value;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZStatusFilterOptionsExtension }
	 * 
	 */
	public PTZStatusFilterOptionsExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link PTZStatusFilterOptionsExtension }
	 * 
	 */
	public void setExtension(PTZStatusFilterOptionsExtension value) {
		this.extension = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * 
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
