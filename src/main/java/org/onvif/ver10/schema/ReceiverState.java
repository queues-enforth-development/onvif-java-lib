//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * Java-Klasse f�r ReceiverState.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * 
 * <pre>{@code
 * <simpleType name="ReceiverState">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NotConnected"/>
 *     <enumeration value="Connecting"/>
 *     <enumeration value="Connected"/>
 *     <enumeration value="Unknown"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ReceiverState")
@XmlEnum
public enum ReceiverState {

	/**
	 * The receiver is not connected.
	 * 
	 */
	@XmlEnumValue("NotConnected")
	NOT_CONNECTED("NotConnected"),

	/**
	 * The receiver is attempting to connect.
	 * 
	 */
	@XmlEnumValue("Connecting")
	CONNECTING("Connecting"),

	/**
	 * The receiver is connected.
	 * 
	 */
	@XmlEnumValue("Connected")
	CONNECTED("Connected"),

	/**
	 * This case should never happen.
	 * 
	 */
	@XmlEnumValue("Unknown")
	UNKNOWN("Unknown");
	private final String value;

	ReceiverState(String v) {
		value = v;
	}

    /**
     *
     * @return -
     */
    public String value() {
		return value;
	}

    /**
     *
     * @param v -
     * @return -
     */
    public static ReceiverState fromValue(String v) {
		for (ReceiverState c : ReceiverState.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
