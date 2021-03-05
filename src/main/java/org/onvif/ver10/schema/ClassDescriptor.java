//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java-Klasse f�r ClassDescriptor complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="ClassDescriptor">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="ClassCandidate" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
               <complexContent>
                 <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                   <sequence>
 *                   <element name="Type" type="{http://www.onvif.org/ver10/schema}ClassType"/>
 *                   <element name="Likelihood" type="{http://www.w3.org/2001/XMLSchema}float"/>
                   </sequence>
                 </restriction>
               </complexContent>
 *           </complexType>
 *         </element>
 *         <element name="Extension" type="{http://www.onvif.org/ver10/schema}ClassDescriptorExtension" minOccurs="0"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassDescriptor", propOrder = { "classCandidate", "extension" })
public class ClassDescriptor {

    /**
     *
     */
    @XmlElement(name = "ClassCandidate")
	protected List<ClassDescriptor.ClassCandidate> classCandidate;

    /**
     *
     */
    @XmlElement(name = "Extension")
	protected ClassDescriptorExtension extension;

	/**
	 * Gets the value of the classCandidate property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the classCandidate property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>{@code
	 * getClassCandidate().add(newItem);
	 * }</pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link ClassDescriptor.ClassCandidate }
	 * 
	 * 
     * @return 
	 */
	public List<ClassDescriptor.ClassCandidate> getClassCandidate() {
		if (classCandidate == null) {
			classCandidate = new ArrayList<>();
		}
		return this.classCandidate;
	}

	/**
	 * Ruft den Wert der extension-Eigenschaft ab.
	 * 
	 * @return possible object is {@link ClassDescriptorExtension }
	 * 
	 */
	public ClassDescriptorExtension getExtension() {
		return extension;
	}

	/**
	 * Legt den Wert der extension-Eigenschaft fest.
	 * 
	 * @param value
	 *            allowed object is {@link ClassDescriptorExtension }
	 * 
	 */
	public void setExtension(ClassDescriptorExtension value) {
		this.extension = value;
	}

	/**
	 * <p>
	 * Java-Class for anonymous complex type.
	 * 
	 * <p>
	 * The following schema fragment indicates the expected content contained in this class.
	 * 
	 * <pre>{@code
	   <complexType>
	     <complexContent>
	       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
	         <sequence>
	 *         <element name="Type" type="{http://www.onvif.org/ver10/schema}ClassType"/>
	 *         <element name="Likelihood" type="{http://www.w3.org/2001/XMLSchema}float"/>
	         </sequence>
	       </restriction>
	     </complexContent>
	   </complexType>
	 * }</pre>
	 * 
	 * 
	 */
	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "type", "likelihood" })
	public static class ClassCandidate {

        /**
         *
         */
        @XmlElement(name = "Type", required = true)
		protected ClassType type;

        /**
         *
         */
        @XmlElement(name = "Likelihood")
		protected float likelihood;

		/**
		 * Ruft den Wert der type-Eigenschaft ab.
		 * 
		 * @return possible object is {@link ClassType }
		 * 
		 */
		public ClassType getType() {
			return type;
		}

		/**
		 * Legt den Wert der type-Eigenschaft fest.
		 * 
		 * @param value
		 *            allowed object is {@link ClassType }
		 * 
		 */
		public void setType(ClassType value) {
			this.type = value;
		}

		/**
		 * Ruft den Wert der likelihood-Eigenschaft ab.
		 * 
         * @return 
		 */
		public float getLikelihood() {
			return likelihood;
		}

		/**
		 * Legt den Wert der likelihood-Eigenschaft fest.
		 * 
         * @param value
		 */
		public void setLikelihood(float value) {
			this.likelihood = value;
		}

	}

}
