//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 * The TZ format is specified by POSIX, please refer to POSIX 1003.1 section 8.3
 * 
 * <pre>{@code
 * <?xml version="1.0" encoding="UTF-8"?&gt;<br xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * }</pre>
 * 
 * Example: Europe, Paris TZ=CET-1CEST,M3.5.0/2,M10.5.0/3
 * 
 * <pre>{@code
 * <?xml version="1.0" encoding="UTF-8"?&gt;<br xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * }</pre>
 * 
 * CET = designation for standard time when daylight saving is not in force
 * 
 * <pre>{@code
 * <?xml version="1.0" encoding="UTF-8"?&gt;<br xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * }</pre>
 * 
 * -1 = offset in hours = negative so 1 hour east of Greenwich meridian
 * 
 * <pre>{@code
 * <?xml version="1.0" encoding="UTF-8"?&gt;<br xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * }</pre>
 * 
 * CEST = designation when daylight saving is in force ("Central European Summer Time")
 * 
 * <pre>{@code
 * <?xml version="1.0" encoding="UTF-8"?&gt;<br xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * }</pre>
 * 
 * , = no offset number between code and comma, so default to one hour ahead for daylight saving
 * 
 * <pre>{@code
 * <?xml version="1.0" encoding="UTF-8"?&gt;<br xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * }</pre>
 * 
 * M3.5.0 = when daylight saving starts = the last Sunday in March (the "5th" week means the last in the month)
 * 
 * <pre>{@code
 * <?xml version="1.0" encoding="UTF-8"?&gt;<br xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * }</pre>
 * 
 * /2, = the local time when the switch occurs = 2 a.m. in this case
 * 
 * <pre>{@code
 * <?xml version="1.0" encoding="UTF-8"?&gt;<br xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * }</pre>
 * 
 * M10.5.0 = when daylight saving ends = the last Sunday in October.
 * 
 * <pre>{@code
 * <?xml version="1.0" encoding="UTF-8"?&gt;<br xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * }</pre>
 * 
 * /3, = the local time when the switch occurs = 3 a.m. in this case
 * 
 * <pre>{@code
 * <?xml version="1.0" encoding="UTF-8"?&gt;<br xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:tt="http://www.onvif.org/ver10/schema" xmlns:wsnt="http://docs.oasis-open.org/wsn/b-2" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xop="http://www.w3.org/2004/08/xop/include" xmlns:xs="http://www.w3.org/2001/XMLSchema"/&gt;
 * }</pre>
 * 
 * 
 * <p>
 * Java-Klasse f�r TimeZone complex type.
 * 
 * <p>
 * The following schema fragment indicates the expected content contained in this class.
 * 
 * <pre>{@code
 * <complexType name="TimeZone">
     <complexContent>
       <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         <sequence>
 *         <element name="TZ" type="{http://www.w3.org/2001/XMLSchema}token"/>
         </sequence>
       </restriction>
     </complexContent>
   </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeZone", propOrder = { "tz" })
public class TimeZone {

    /**
     *
     */
    @XmlElement(name = "TZ", required = true)
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	@XmlSchemaType(name = "token")
	protected String tz;

	/**
	 * Ruft den Wert der tz-Eigenschaft ab.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTZ() {
		return tz;
	}

	/**
	 * Legt den Wert der tz-Eigenschaft fest.
	 * 
	 * @param value -
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTZ(String value) {
		this.tz = value;
	}

}
