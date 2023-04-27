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
 * Java-Klasse f�r IPType.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * 
 * <pre>{@code
 * <simpleType name="IPType">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="IPv4"/>
 *     <enumeration value="IPv6"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IPType")
@XmlEnum
public enum IPType {

    /**
     *
     */
    @XmlEnumValue("IPv4")
	I_PV_4("IPv4"),

    /**
     *
     */
    @XmlEnumValue("IPv6")
	I_PV_6("IPv6");
	private final String value;

	IPType(String v) {
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
    public static IPType fromValue(String v) {
		for (IPType c : IPType.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
