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
 * Java-Klasse f�r AudioEncoding.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * <p>
 * 
 * <pre>{@code
 * <simpleType name="AudioEncoding">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="G711"/>
 *     <enumeration value="G726"/>
 *     <enumeration value="AAC"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AudioEncoding")
@XmlEnum
public enum AudioEncoding {

    /**
     *
     */
    @XmlEnumValue("G711")
	G_711("G711"),

    /**
     *
     */
    @XmlEnumValue("G726")
	G_726("G726"),

    /**
     *
     */
    AAC("AAC");
	private final String value;

	AudioEncoding(String v) {
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
    public static AudioEncoding fromValue(String v) {
		for (AudioEncoding c : AudioEncoding.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
