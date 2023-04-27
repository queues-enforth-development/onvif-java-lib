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
 * <p>
 * Java-Klasse f�r PTZPositionFilter complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="PTZPositionFilter">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="MinPosition" type="{http://www.onvif.org/ver10/schema}PTZVector"/>
 *         <element name="MaxPosition" type="{http://www.onvif.org/ver10/schema}PTZVector"/>
 *         <element name="EnterOrExit" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
           <any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PTZPositionFilter", propOrder = { "minPosition", "maxPosition", "enterOrExit", "any" })
public class PTZPositionFilter {

    /**
     *
     */
    @XmlElement(name = "MinPosition", required = true)
	protected PTZVector minPosition;

    /**
     *
     */
    @XmlElement(name = "MaxPosition", required = true)
	protected PTZVector maxPosition;

    /**
     *
     */
    @XmlElement(name = "EnterOrExit")
	protected boolean enterOrExit;

    /**
     *
     */
    @XmlAnyElement(lax = true)
	protected List<java.lang.Object> any;
	@XmlAnyAttribute
	private final Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Ruft den Wert der minPosition-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZVector }
	 * 
	 */
	public PTZVector getMinPosition() {
		return minPosition;
	}

	/**
	 * Legt den Wert der minPosition-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link PTZVector }
	 * 
	 */
	public void setMinPosition(PTZVector value) {
		this.minPosition = value;
	}

	/**
	 * Ruft den Wert der maxPosition-Eigenschaft ab.
	 * 
	 * @return possible object is {@link PTZVector }
	 * 
	 */
	public PTZVector getMaxPosition() {
		return maxPosition;
	}

	/**
	 * Legt den Wert der maxPosition-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link PTZVector }
	 * 
	 */
	public void setMaxPosition(PTZVector value) {
		this.maxPosition = value;
	}

	/**
	 * Ruft den Wert der enterOrExit-Eigenschaft ab.
	 * 
     * @return 
	 */
	public boolean isEnterOrExit() {
		return enterOrExit;
	}

	/**
	 * Legt den Wert der enterOrExit-Eigenschaft fest.
	 * 
     * @param value -
	 */
	public void setEnterOrExit(boolean value) {
		this.enterOrExit = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the any property.
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
	 * Objects of the following type(s) are allowed in the list {@link Element } {@link java.lang.Object }
	 * 
	 * 
     * @return 
	 */
	public List<java.lang.Object> getAny() {
		if (any == null) {
			any = new ArrayList<>();
		}
		return this.any;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property on this class.
	 * 
	 * <p>
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
