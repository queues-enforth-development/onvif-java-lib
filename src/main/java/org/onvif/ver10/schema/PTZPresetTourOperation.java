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
 * Java-Klasse f�r PTZPresetTourOperation.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * <p>
 * 
 * <pre>{@code
 * <simpleType name="PTZPresetTourOperation">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Start"/>
 *     <enumeration value="Stop"/>
 *     <enumeration value="Pause"/>
 *     <enumeration value="Extended"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "PTZPresetTourOperation")
@XmlEnum
public enum PTZPresetTourOperation {

    /**
     *
     */
    @XmlEnumValue("Start")
	START("Start"),

    /**
     *
     */
    @XmlEnumValue("Stop")
	STOP("Stop"),

    /**
     *
     */
    @XmlEnumValue("Pause")
	PAUSE("Pause"),

    /**
     *
     */
    @XmlEnumValue("Extended")
	EXTENDED("Extended");
	private final String value;

	PTZPresetTourOperation(String v) {
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
    public static PTZPresetTourOperation fromValue(String v) {
		for (PTZPresetTourOperation c : PTZPresetTourOperation.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
