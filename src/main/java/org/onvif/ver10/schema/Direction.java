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
 * Java-Klasse f�r Direction.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * <p>
 * 
 * <pre>{@code
 * <simpleType name="Direction">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Left"/>
 *     <enumeration value="Right"/>
 *     <enumeration value="Any"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Direction")
@XmlEnum
public enum Direction {

    /**
     *
     */
    @XmlEnumValue("Left")
	LEFT("Left"),

    /**
     *
     */
    @XmlEnumValue("Right")
	RIGHT("Right"),

    /**
     *
     */
    @XmlEnumValue("Any")
	ANY("Any");
	private final String value;

	Direction(String v) {
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
     * @param v
     * @return
     */
    public static Direction fromValue(String v) {
		for (Direction c : Direction.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
