//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r PTZStream complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="PTZStream">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded" minOccurs="0">
 *         <element name="PTZStatus" type="{http://www.onvif.org/ver10/schema}PTZStatus"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}PTZStreamExtension"/>
 *       </choice>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTZStream", propOrder = { "ptzStatusOrExtension" })
public class PTZStream {

    /**
     *
     */
    @XmlElements({ @XmlElement(name = "PTZStatus", type = PTZStatus.class), @XmlElement(name = "Extension", type = PTZStreamExtension.class) })
	protected List<java.lang.Object> ptzStatusOrExtension;

	/**
	 * Gets the value of the ptzStatusOrExtension property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the ptzStatusOrExtension property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getPTZStatusOrExtension().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link PTZStatus } {@link PTZStreamExtension }
	 * 
	 * 
     * @return 
	 */
	public List<java.lang.Object> getPTZStatusOrExtension() {
		if (ptzStatusOrExtension == null) {
			ptzStatusOrExtension = new ArrayList<>();
		}
		return this.ptzStatusOrExtension;
	}

}
