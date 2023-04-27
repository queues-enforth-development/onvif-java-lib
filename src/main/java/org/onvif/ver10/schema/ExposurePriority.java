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
 * Java-Klasse f�r ExposurePriority.
 * 
 * 
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * 
 * <pre>{@code
 * <simpleType name="ExposurePriority">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="LowNoise"/>
 *     <enumeration value="FrameRate"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ExposurePriority")
@XmlEnum
public enum ExposurePriority {

    /**
     *
     */
    @XmlEnumValue("LowNoise")
	LOW_NOISE("LowNoise"),

    /**
     *
     */
    @XmlEnumValue("FrameRate")
	FRAME_RATE("FrameRate");
	private final String value;

	ExposurePriority(String v) {
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
    public static ExposurePriority fromValue(String v) {
		for (ExposurePriority c : ExposurePriority.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
