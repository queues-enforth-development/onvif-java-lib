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
 * Java-Klasse f�r VideoEncoding.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * <p>
 * 
 * <pre>{@code
 * <simpleType name="VideoEncoding">
     <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="JPEG"/>
 *     <enumeration value="MPEG4"/>
 *     <enumeration value="H264"/>
     </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "VideoEncoding")
@XmlEnum
public enum VideoEncoding {

    /**
     *
     */
    JPEG("JPEG"),

    /**
     *
     */
    @XmlEnumValue("MPEG4")
	MPEG_4("MPEG4"),

    /**
     *
     */
    @XmlEnumValue("H264")
	H_264("H264");
	private final String value;

	VideoEncoding(String v) {
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
    public static VideoEncoding fromValue(String v) {
		for (VideoEncoding c : VideoEncoding.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
