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
 * Java-Klasse f�r VideoAnalyticsStream complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="VideoAnalyticsStream">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded" minOccurs="0">
 *         <element name="Frame" type="{http://www.onvif.org/ver10/schema}Frame"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}VideoAnalyticsStreamExtension"/>
 *       </choice>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VideoAnalyticsStream", propOrder = { "frameOrExtension" })
public class VideoAnalyticsStream {

    /**
     *
     */
    @XmlElements({ @XmlElement(name = "Frame", type = Frame.class), @XmlElement(name = "Extension", type = VideoAnalyticsStreamExtension.class) })
	protected List<java.lang.Object> frameOrExtension;

	/**
	 * Gets the value of the frameOrExtension property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the frameOrExtension property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getFrameOrExtension().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Frame } {@link VideoAnalyticsStreamExtension }
	 * 
	 * 
     * @return 
	 */
	public List<java.lang.Object> getFrameOrExtension() {
		if (frameOrExtension == null) {
			frameOrExtension = new ArrayList<>();
		}
		return this.frameOrExtension;
	}

}
