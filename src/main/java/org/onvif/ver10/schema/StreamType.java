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
 * <p>
 * Java-Klasse f�r StreamType.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * <p>
 * 
 * <pre>{@code
 * <simpleType name="StreamType">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="RTP-Unicast"/>
 *     <enumeration value="RTP-Multicast"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "StreamType")
@XmlEnum
public enum StreamType {

    /**
     *
     */
    @XmlEnumValue("RTP-Unicast")
	RTP_UNICAST("RTP-Unicast"),

    /**
     *
     */
    @XmlEnumValue("RTP-Multicast")
	RTP_MULTICAST("RTP-Multicast");
	private final String value;

	StreamType(String v) {
		value = v;
	}

    /**
     *
     * @return
     */
    public String value() {
		return value;
	}

    /**
     *
     * @param v -
     * @return
     */
    public static StreamType fromValue(String v) {
		for (StreamType c : StreamType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
