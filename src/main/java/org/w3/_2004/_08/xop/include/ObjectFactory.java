//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.w3._2004._08.xop.include;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the org.w3._2004._08.xop.include package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema
 * derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this
 * class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _Include_QNAME = new QName("http://www.w3.org/2004/08/xop/include", "Include");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.w3._2004._08.xop.include
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Include }
	 * 
     * @return  -
	 */
	public Include createInclude() {
		return new Include();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Include }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://www.w3.org/2004/08/xop/include", name = "Include")
	public JAXBElement<Include> createInclude(Include value) {
		return new JAXBElement<>(_Include_QNAME, Include.class, null, value);
	}

}
