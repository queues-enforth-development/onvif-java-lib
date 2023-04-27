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
 * Java-Klasse f�r IPv6DHCPConfiguration.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * <p>
 * 
 * <pre>{@code
 * <simpleType name="IPv6DHCPConfiguration">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Auto"/>
 *     <enumeration value="Stateful"/>
 *     <enumeration value="Stateless"/>
 *     <enumeration value="Off"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "IPv6DHCPConfiguration")
@XmlEnum
public enum IPv6DHCPConfiguration {

    /**
     *
     */
    @XmlEnumValue("Auto")
	AUTO("Auto"),

    /**
     *
     */
    @XmlEnumValue("Stateful")
	STATEFUL("Stateful"),

    /**
     *
     */
    @XmlEnumValue("Stateless")
	STATELESS("Stateless"),

    /**
     *
     */
    @XmlEnumValue("Off")
	OFF("Off");
	private final String value;

	IPv6DHCPConfiguration(String v) {
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
    public static IPv6DHCPConfiguration fromValue(String v) {
		for (IPv6DHCPConfiguration c : IPv6DHCPConfiguration.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
