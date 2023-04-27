//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is compiled. 
// Generiert: 2014.04.25 um 04:22:13 PM CEST 
//

package org.onvif.ver20.imaging.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.onvif.ver20.imaging.wsdl package. 
 * An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver20/imaging/wsdl", "Capabilities");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver20.imaging.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOptions }
     * 
     * @return  -
     */
    public GetOptions createGetOptions() {
        return new GetOptions();
    }

    /**
     * Create an instance of {@link MoveResponse }
     * 
     * @return  -
     */
    public MoveResponse createMoveResponse() {
        return new MoveResponse();
    }

    /**
     * Create an instance of {@link GetImagingSettings }
     * 
     * @return  -
     */
    public GetImagingSettings createGetImagingSettings() {
        return new GetImagingSettings();
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     * @return  -
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link GetOptionsResponse }
     * 
     * @return  -
     */
    public GetOptionsResponse createGetOptionsResponse() {
        return new GetOptionsResponse();
    }

    /**
     * Create an instance of {@link GetServiceCapabilitiesResponse }
     * 
     * @return  -
     */
    public GetServiceCapabilitiesResponse createGetServiceCapabilitiesResponse() {
        return new GetServiceCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link Capabilities }
     * 
     * @return  -
     */
    public Capabilities createCapabilities() {
        return new Capabilities();
    }

    /**
     * Create an instance of {@link Stop }
     * 
     * @return  -
     */
    public Stop createStop() {
        return new Stop();
    }

    /**
     * Create an instance of {@link SetImagingSettingsResponse }
     * 
     * @return  -
     */
    public SetImagingSettingsResponse createSetImagingSettingsResponse() {
        return new SetImagingSettingsResponse();
    }

    /**
     * Create an instance of {@link StopResponse }
     * 
     * @return  -
     */
    public StopResponse createStopResponse() {
        return new StopResponse();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     * @return  -
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link GetServiceCapabilities }
     * 
     * @return  -
     */
    public GetServiceCapabilities createGetServiceCapabilities() {
        return new GetServiceCapabilities();
    }

    /**
     * Create an instance of {@link Move }
     * 
     * @return  -
     */
    public Move createMove() {
        return new Move();
    }

    /**
     * Create an instance of {@link GetImagingSettingsResponse }
     * 
     * @return  -
     */
    public GetImagingSettingsResponse createGetImagingSettingsResponse() {
        return new GetImagingSettingsResponse();
    }

    /**
     * Create an instance of {@link SetImagingSettings }
     * 
     * @return  -
     */
    public SetImagingSettings createSetImagingSettings() {
        return new SetImagingSettings();
    }

    /**
     * Create an instance of {@link GetMoveOptions }
     * 
     * @return  -
     */
    public GetMoveOptions createGetMoveOptions() {
        return new GetMoveOptions();
    }

    /**
     * Create an instance of {@link GetMoveOptionsResponse }
     * 
     * @return  -
     */
    public GetMoveOptionsResponse createGetMoveOptionsResponse() {
        return new GetMoveOptionsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}}
     * 
     * @param value -
     * @return  -
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/imaging/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
        return new JAXBElement<>(_Capabilities_QNAME, Capabilities.class, null, value);
    }

}
