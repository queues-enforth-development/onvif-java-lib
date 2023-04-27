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
import org.oasis_open.docs.wsn.b_2.NotificationMessageHolderType;

/**
 * 
 * Java-Klasse f�r EventStream complex type.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="EventStream">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice maxOccurs="unbounded" minOccurs="0">
 *         <element ref="{http://docs.oasis-open.org/wsn/b-2}NotificationMessage"/>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}EventStreamExtension"/>
 *       </choice>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventStream", propOrder = { "notificationMessageOrExtension" })
public class EventStream {

    /**
     *
     */
    @XmlElements({ @XmlElement(name = "NotificationMessage", namespace = "http://docs.oasis-open.org/wsn/b-2", type = NotificationMessageHolderType.class),
			@XmlElement(name = "Extension", type = EventStreamExtension.class) })
	protected List<java.lang.Object> notificationMessageOrExtension;

	/**
	 * Gets the value of the notificationMessageOrExtension property.
	 * 
	 * 
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the notificationMessageOrExtension property.
	 * 
	 * 
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getNotificationMessageOrExtension().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * 
	 * Objects of the following type(s) are allowed in the list {@link NotificationMessageHolderType } {@link EventStreamExtension }
	 * 
	 * 
     * @return  -
	 */
	public List<java.lang.Object> getNotificationMessageOrExtension() {
		if (notificationMessageOrExtension == null) {
			notificationMessageOrExtension = new ArrayList<>();
		}
		return this.notificationMessageOrExtension;
	}

}
