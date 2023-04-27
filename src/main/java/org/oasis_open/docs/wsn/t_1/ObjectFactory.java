//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.oasis_open.docs.wsn.t_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the org.oasis_open.docs.wsn.t_1 package.
 * 
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema
 * derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this
 * class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _TopicSet_QNAME = new QName("http://docs.oasis-open.org/wsn/t-1", "TopicSet");
	private final static QName _TopicNamespace_QNAME = new QName("http://docs.oasis-open.org/wsn/t-1", "TopicNamespace");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.wsn.t_1
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link TopicNamespaceType }
	 * 
     * @return  -
	 */
	public TopicNamespaceType createTopicNamespaceType() {
		return new TopicNamespaceType();
	}

	/**
	 * Create an instance of {@link TopicSetType }
	 * 
     * @return  -
	 */
	public TopicSetType createTopicSetType() {
		return new TopicSetType();
	}

	/**
	 * Create an instance of {@link Documentation }
	 * 
     * @return  -
	 */
	public Documentation createDocumentation() {
		return new Documentation();
	}

	/**
	 * Create an instance of {@link TopicType }
	 * 
     * @return  -
	 */
	public TopicType createTopicType() {
		return new TopicType();
	}

	/**
	 * Create an instance of {@link QueryExpressionType }
	 * 
     * @return  -
	 */
	public QueryExpressionType createQueryExpressionType() {
		return new QueryExpressionType();
	}

	/**
	 * Create an instance of {@link TopicNamespaceType.Topic }
	 * 
     * @return  -
	 */
	public TopicNamespaceType.Topic createTopicNamespaceTypeTopic() {
		return new TopicNamespaceType.Topic();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TopicSetType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/t-1", name = "TopicSet")
	public JAXBElement<TopicSetType> createTopicSet(TopicSetType value) {
		return new JAXBElement<>(_TopicSet_QNAME, TopicSetType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TopicNamespaceType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/t-1", name = "TopicNamespace")
	public JAXBElement<TopicNamespaceType> createTopicNamespace(TopicNamespaceType value) {
		return new JAXBElement<>(_TopicNamespace_QNAME, TopicNamespaceType.class, null, value);
	}

}
