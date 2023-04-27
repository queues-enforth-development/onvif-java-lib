//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is compiled. 
// Generiert: 2016.02.05 um 06:25:30 PM CET 
//

package org.onvif.ver20.media.wsdl;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java-Klasse für ConfigurationEnumeration.
 * 
 * <p>The following schema fragment indicates the expected content contained in this class.
 * <p>
 * <pre>{@code
 * &lt;simpleType name="ConfigurationEnumeration">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="VideoSource"/>
 *     &lt;enumeration value="VideoEncoder"/>
 *     &lt;enumeration value="AudioSource"/>
 *     &lt;enumeration value="AudioEncoder"/>
 *     &lt;enumeration value="AudioOutput"/>
 *     &lt;enumeration value="AudioDecoder"/>
 *     &lt;enumeration value="Metadata"/>
 *     &lt;enumeration value="Analytics"/>
 *     &lt;enumeration value="PTZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "ConfigurationEnumeration")
@XmlEnum
public enum ConfigurationEnumeration {

    /**
     *
     */
    @XmlEnumValue("All")
    ALL("All"),

    /**
     *
     */
    @XmlEnumValue("VideoSource")
    VIDEO_SOURCE("VideoSource"),

    /**
     *
     */
    @XmlEnumValue("VideoEncoder")
    VIDEO_ENCODER("VideoEncoder"),

    /**
     *
     */
    @XmlEnumValue("AudioSource")
    AUDIO_SOURCE("AudioSource"),

    /**
     *
     */
    @XmlEnumValue("AudioEncoder")
    AUDIO_ENCODER("AudioEncoder"),

    /**
     *
     */
    @XmlEnumValue("AudioOutput")
    AUDIO_OUTPUT("AudioOutput"),

    /**
     *
     */
    @XmlEnumValue("AudioDecoder")
    AUDIO_DECODER("AudioDecoder"),

    /**
     *
     */
    @XmlEnumValue("Metadata")
    METADATA("Metadata"),

    /**
     *
     */
    @XmlEnumValue("Analytics")
    ANALYTICS("Analytics"),

    /**
     *
     */
    PTZ("PTZ");
    private final String value;

    ConfigurationEnumeration(String v) {
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
    public static ConfigurationEnumeration fromValue(String v) {
        for (ConfigurationEnumeration c: ConfigurationEnumeration.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
