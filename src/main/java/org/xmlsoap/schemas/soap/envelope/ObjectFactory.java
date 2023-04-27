//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.xmlsoap.schemas.soap.envelope;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the org.xmlsoap.schemas.soap.envelope package.
 * 
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema
 * derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this
 * class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _Body_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Body");
	private final static QName _Envelope_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Envelope");
	private final static QName _Fault_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Fault");
	private final static QName _Header_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Header");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.xmlsoap.schemas.soap.envelope
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Body }
	 * 
     * @return  -
	 */
	public Body createBody() {
		return new Body();
	}

	/**
	 * Create an instance of {@link Header }
	 * 
     * @return  -
	 */
	public Header createHeader() {
		return new Header();
	}

	/**
	 * Create an instance of {@link Envelope }
	 * 
     * @return  -
	 */
	public Envelope createEnvelope() {
		return new Envelope();
	}

	/**
	 * Create an instance of {@link Fault }
	 * 
     * @return  -
	 */
	public Fault createFault() {
		return new Fault();
	}

	/**
	 * Create an instance of {@link Detail }
	 * 
     * @return  -
	 */
	public Detail createDetail() {
		return new Detail();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Body }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Body")
	public JAXBElement<Body> createBody(Body value) {
		return new JAXBElement<>(_Body_QNAME, Body.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Envelope }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Envelope")
	public JAXBElement<Envelope> createEnvelope(Envelope value) {
		return new JAXBElement<>(_Envelope_QNAME, Envelope.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Fault }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Fault")
	public JAXBElement<Fault> createFault(Fault value) {
		return new JAXBElement<>(_Fault_QNAME, Fault.class, null, value);
	}

    /**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Header }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Header")
	public JAXBElement<Header> createHeader(Header value) {
		return new JAXBElement<>(_Header_QNAME, Header.class, null, value);
	}

}
