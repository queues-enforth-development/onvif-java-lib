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
 * Java-Klasse f�r Dot11SignalStrength.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * 
 * <pre>{@code
 * <simpleType name="Dot11SignalStrength">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="None"/>
 *     <enumeration value="Very Bad"/>
 *     <enumeration value="Bad"/>
 *     <enumeration value="Good"/>
 *     <enumeration value="Very Good"/>
 *     <enumeration value="Extended"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Dot11SignalStrength")
@XmlEnum
public enum Dot11SignalStrength {

    /**
     *
     */
    @XmlEnumValue("None")
	NONE("None"),

    /**
     *
     */
    @XmlEnumValue("Very Bad")
	VERY_BAD("Very Bad"),

    /**
     *
     */
    @XmlEnumValue("Bad")
	BAD("Bad"),

    /**
     *
     */
    @XmlEnumValue("Good")
	GOOD("Good"),

    /**
     *
     */
    @XmlEnumValue("Very Good")
	VERY_GOOD("Very Good"),

    /**
     *
     */
    @XmlEnumValue("Extended")
	EXTENDED("Extended");
	private final String value;

	Dot11SignalStrength(String v) {
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
    public static Dot11SignalStrength fromValue(String v) {
		for (Dot11SignalStrength c : Dot11SignalStrength.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
