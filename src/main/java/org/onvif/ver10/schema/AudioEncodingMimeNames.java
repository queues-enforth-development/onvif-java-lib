//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is compiled. 
// Generiert: 2016.02.05 um 06:25:30 PM CET 
//


package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für AudioEncodingMimeNames.
 * 
 * <p>The following schema fragment indicates the expected content contained in this class.
 * <p>
 * <pre>{@code
 * &lt;simpleType name="AudioEncodingMimeNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PCMU"/>
 *     &lt;enumeration value="G726"/>
 *     &lt;enumeration value="MP4A-LATM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "AudioEncodingMimeNames")
@XmlEnum
public enum AudioEncodingMimeNames {

    /**
     *
     */
    PCMU("PCMU"),

    /**
     *
     */
    @XmlEnumValue("G726")
    G_726("G726"),

    /**
     *
     */
    @XmlEnumValue("MP4A-LATM")
    MP_4_A_LATM("MP4A-LATM");
    private final String value;

    AudioEncodingMimeNames(String v) {
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
    public static AudioEncodingMimeNames fromValue(String v) {
        for (AudioEncodingMimeNames c: AudioEncodingMimeNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
