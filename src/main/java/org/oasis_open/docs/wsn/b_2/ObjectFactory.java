//
// This file was generated with the JavaTM Architecture for XML Binding (JAXB) Reference Implementation, v2.2.5-2 
// Seehref="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Changes to this file are lost when the source schema is recompiled. 
// Generated: 02/04/2014 at 12:22:03 PM CET 
//

package org.oasis_open.docs.wsn.b_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.w3._2005._08.addressing.EndpointReferenceType;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the org.oasis_open.docs.wsn.b_2 package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content. The Java representation of XML content can consist of schema
 * derived interfaces and classes representing the binding of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in this
 * class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _TerminationTime_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "TerminationTime");
	private final static QName _NotifyMessageNotSupportedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "NotifyMessageNotSupportedFault");
	private final static QName _ConsumerReference_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "ConsumerReference");
	private final static QName _UnsupportedPolicyRequestFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnsupportedPolicyRequestFault");
	private final static QName _SubscriptionPolicy_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "SubscriptionPolicy");
	private final static QName _NotificationMessage_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "NotificationMessage");
	private final static QName _UnacceptableInitialTerminationTimeFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2",
			"UnacceptableInitialTerminationTimeFault");
	private final static QName _InvalidTopicExpressionFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "InvalidTopicExpressionFault");
	private final static QName _TopicExpressionDialect_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "TopicExpressionDialect");
	private final static QName _Filter_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "Filter");
	private final static QName _UnableToCreatePullPointFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnableToCreatePullPointFault");
	private final static QName _CreationTime_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "CreationTime");
	private final static QName _ResumeFailedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "ResumeFailedFault");
	private final static QName _InvalidProducerPropertiesExpressionFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2",
			"InvalidProducerPropertiesExpressionFault");
	private final static QName _UnableToGetMessagesFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnableToGetMessagesFault");
	private final static QName _MessageContent_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "MessageContent");
	private final static QName _TopicExpressionDialectUnknownFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "TopicExpressionDialectUnknownFault");
	private final static QName _UnableToDestroySubscriptionFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnableToDestroySubscriptionFault");
	private final static QName _UnrecognizedPolicyRequestFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnrecognizedPolicyRequestFault");
	private final static QName _SubscribeCreationFailedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "SubscribeCreationFailedFault");
	private final static QName _ProducerReference_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "ProducerReference");
	private final static QName _NoCurrentMessageOnTopicFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "NoCurrentMessageOnTopicFault");
	private final static QName _MultipleTopicsSpecifiedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "MultipleTopicsSpecifiedFault");
	private final static QName _UnacceptableTerminationTimeFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnacceptableTerminationTimeFault");
	private final static QName _CurrentTime_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "CurrentTime");
	private final static QName _TopicExpression_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "TopicExpression");
	private final static QName _ProducerProperties_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "ProducerProperties");
	private final static QName _TopicNotSupportedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "TopicNotSupportedFault");
	private final static QName _InvalidFilterFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "InvalidFilterFault");
	private final static QName _FixedTopicSet_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "FixedTopicSet");
	private final static QName _Topic_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "Topic");
	private final static QName _UnableToDestroyPullPointFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "UnableToDestroyPullPointFault");
	private final static QName _InvalidMessageContentExpressionFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2",
			"InvalidMessageContentExpressionFault");
	private final static QName _PauseFailedFault_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "PauseFailedFault");
	private final static QName _SubscriptionReference_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "SubscriptionReference");
	private final static QName _SubscribeInitialTerminationTime_QNAME = new QName("http://docs.oasis-open.org/wsn/b-2", "InitialTerminationTime");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.wsn.b_2
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Subscribe }
	 * 
     * @return  -
	 */
	public Subscribe createSubscribe() {
		return new Subscribe();
	}

	/**
	 * Create an instance of {@link NotificationMessageHolderType }
	 * 
     * @return  -
	 */
	public NotificationMessageHolderType createNotificationMessageHolderType() {
		return new NotificationMessageHolderType();
	}

	/**
	 * Create an instance of {@link TopicExpressionDialectUnknownFaultType }
	 * 
     * @return  -
	 */
	public TopicExpressionDialectUnknownFaultType createTopicExpressionDialectUnknownFaultType() {
		return new TopicExpressionDialectUnknownFaultType();
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
	 * Create an instance of {@link UnableToGetMessagesFaultType }
	 * 
     * @return  -
	 */
	public UnableToGetMessagesFaultType createUnableToGetMessagesFaultType() {
		return new UnableToGetMessagesFaultType();
	}

	/**
	 * Create an instance of {@link ResumeSubscription }
	 * 
     * @return  -
	 */
	public ResumeSubscription createResumeSubscription() {
		return new ResumeSubscription();
	}

	/**
	 * Create an instance of {@link ResumeFailedFaultType }
	 * 
     * @return  -
	 */
	public ResumeFailedFaultType createResumeFailedFaultType() {
		return new ResumeFailedFaultType();
	}

	/**
	 * Create an instance of {@link InvalidProducerPropertiesExpressionFaultType }
	 * 
     * @return  -
	 */
	public InvalidProducerPropertiesExpressionFaultType createInvalidProducerPropertiesExpressionFaultType() {
		return new InvalidProducerPropertiesExpressionFaultType();
	}

	/**
	 * Create an instance of {@link DestroyPullPointResponse }
	 * 
     * @return  -
	 */
	public DestroyPullPointResponse createDestroyPullPointResponse() {
		return new DestroyPullPointResponse();
	}

	/**
	 * Create an instance of {@link PauseSubscriptionResponse }
	 * 
     * @return  -
	 */
	public PauseSubscriptionResponse createPauseSubscriptionResponse() {
		return new PauseSubscriptionResponse();
	}

	/**
	 * Create an instance of {@link ResumeSubscriptionResponse }
	 * 
     * @return  -
	 */
	public ResumeSubscriptionResponse createResumeSubscriptionResponse() {
		return new ResumeSubscriptionResponse();
	}

	/**
	 * Create an instance of {@link SubscribeCreationFailedFaultType }
	 * 
     * @return  -
	 */
	public SubscribeCreationFailedFaultType createSubscribeCreationFailedFaultType() {
		return new SubscribeCreationFailedFaultType();
	}

	/**
	 * Create an instance of {@link RenewResponse }
	 * 
     * @return  -
	 */
	public RenewResponse createRenewResponse() {
		return new RenewResponse();
	}

	/**
	 * Create an instance of {@link UnableToDestroySubscriptionFaultType }
	 * 
     * @return  -
	 */
	public UnableToDestroySubscriptionFaultType createUnableToDestroySubscriptionFaultType() {
		return new UnableToDestroySubscriptionFaultType();
	}

	/**
	 * Create an instance of {@link UnrecognizedPolicyRequestFaultType }
	 * 
     * @return  -
	 */
	public UnrecognizedPolicyRequestFaultType createUnrecognizedPolicyRequestFaultType() {
		return new UnrecognizedPolicyRequestFaultType();
	}

	/**
	 * Create an instance of {@link FilterType }
	 * 
     * @return  -
	 */
	public FilterType createFilterType() {
		return new FilterType();
	}

	/**
	 * Create an instance of {@link Subscribe.SubscriptionPolicy }
	 * 
     * @return  -
	 */
	public Subscribe.SubscriptionPolicy createSubscribeSubscriptionPolicy() {
		return new Subscribe.SubscriptionPolicy();
	}

	/**
	 * Create an instance of {@link NotificationProducerRP }
	 * 
     * @return  -
	 */
	public NotificationProducerRP createNotificationProducerRP() {
		return new NotificationProducerRP();
	}

	/**
	 * Create an instance of {@link TopicExpressionType }
	 * 
     * @return  -
	 */
	public TopicExpressionType createTopicExpressionType() {
		return new TopicExpressionType();
	}

	/**
	 * Create an instance of {@link GetMessages }
	 * 
     * @return  -
	 */
	public GetMessages createGetMessages() {
		return new GetMessages();
	}

	/**
	 * Create an instance of {@link Renew }
	 * 
     * @return  -
	 */
	public Renew createRenew() {
		return new Renew();
	}

	/**
	 * Create an instance of {@link UseRaw }
	 * 
     * @return  -
	 */
	public UseRaw createUseRaw() {
		return new UseRaw();
	}

	/**
	 * Create an instance of {@link CreatePullPoint }
	 * 
     * @return  -
	 */
	public CreatePullPoint createCreatePullPoint() {
		return new CreatePullPoint();
	}

	/**
	 * Create an instance of {@link NotifyMessageNotSupportedFaultType }
	 * 
     * @return  -
	 */
	public NotifyMessageNotSupportedFaultType createNotifyMessageNotSupportedFaultType() {
		return new NotifyMessageNotSupportedFaultType();
	}

	/**
	 * Create an instance of {@link GetMessagesResponse }
	 * 
     * @return  -
	 */
	public GetMessagesResponse createGetMessagesResponse() {
		return new GetMessagesResponse();
	}

	/**
	 * Create an instance of {@link SubscribeResponse }
	 * 
     * @return  -
	 */
	public SubscribeResponse createSubscribeResponse() {
		return new SubscribeResponse();
	}

	/**
	 * Create an instance of {@link CreatePullPointResponse }
	 * 
     * @return  -
	 */
	public CreatePullPointResponse createCreatePullPointResponse() {
		return new CreatePullPointResponse();
	}

	/**
	 * Create an instance of {@link UnableToCreatePullPointFaultType }
	 * 
     * @return  -
	 */
	public UnableToCreatePullPointFaultType createUnableToCreatePullPointFaultType() {
		return new UnableToCreatePullPointFaultType();
	}

	/**
	 * Create an instance of {@link UnacceptableInitialTerminationTimeFaultType }
	 * 
     * @return  -
	 */
	public UnacceptableInitialTerminationTimeFaultType createUnacceptableInitialTerminationTimeFaultType() {
		return new UnacceptableInitialTerminationTimeFaultType();
	}

	/**
	 * Create an instance of {@link InvalidTopicExpressionFaultType }
	 * 
     * @return  -
	 */
	public InvalidTopicExpressionFaultType createInvalidTopicExpressionFaultType() {
		return new InvalidTopicExpressionFaultType();
	}

	/**
	 * Create an instance of {@link UnsupportedPolicyRequestFaultType }
	 * 
     * @return  -
	 */
	public UnsupportedPolicyRequestFaultType createUnsupportedPolicyRequestFaultType() {
		return new UnsupportedPolicyRequestFaultType();
	}

	/**
	 * Create an instance of {@link SubscriptionManagerRP }
	 * 
     * @return  -
	 */
	public SubscriptionManagerRP createSubscriptionManagerRP() {
		return new SubscriptionManagerRP();
	}

	/**
	 * Create an instance of {@link SubscriptionPolicyType }
	 * 
     * @return  -
	 */
	public SubscriptionPolicyType createSubscriptionPolicyType() {
		return new SubscriptionPolicyType();
	}

	/**
	 * Create an instance of {@link Notify }
	 * 
     * @return  -
	 */
	public Notify createNotify() {
		return new Notify();
	}

	/**
	 * Create an instance of {@link DestroyPullPoint }
	 * 
     * @return  -
	 */
	public DestroyPullPoint createDestroyPullPoint() {
		return new DestroyPullPoint();
	}

	/**
	 * Create an instance of {@link UnsubscribeResponse }
	 * 
     * @return  -
	 */
	public UnsubscribeResponse createUnsubscribeResponse() {
		return new UnsubscribeResponse();
	}

	/**
	 * Create an instance of {@link GetCurrentMessageResponse }
	 * 
     * @return  -
	 */
	public GetCurrentMessageResponse createGetCurrentMessageResponse() {
		return new GetCurrentMessageResponse();
	}

	/**
	 * Create an instance of {@link PauseFailedFaultType }
	 * 
     * @return  -
	 */
	public PauseFailedFaultType createPauseFailedFaultType() {
		return new PauseFailedFaultType();
	}

	/**
	 * Create an instance of {@link GetCurrentMessage }
	 * 
     * @return  -
	 */
	public GetCurrentMessage createGetCurrentMessage() {
		return new GetCurrentMessage();
	}

	/**
	 * Create an instance of {@link InvalidMessageContentExpressionFaultType }
	 * 
     * @return  -
	 */
	public InvalidMessageContentExpressionFaultType createInvalidMessageContentExpressionFaultType() {
		return new InvalidMessageContentExpressionFaultType();
	}

	/**
	 * Create an instance of {@link UnableToDestroyPullPointFaultType }
	 * 
     * @return  -
	 */
	public UnableToDestroyPullPointFaultType createUnableToDestroyPullPointFaultType() {
		return new UnableToDestroyPullPointFaultType();
	}

	/**
	 * Create an instance of {@link MultipleTopicsSpecifiedFaultType }
	 * 
     * @return  -
	 */
	public MultipleTopicsSpecifiedFaultType createMultipleTopicsSpecifiedFaultType() {
		return new MultipleTopicsSpecifiedFaultType();
	}

	/**
	 * Create an instance of {@link NoCurrentMessageOnTopicFaultType }
	 * 
     * @return  -
	 */
	public NoCurrentMessageOnTopicFaultType createNoCurrentMessageOnTopicFaultType() {
		return new NoCurrentMessageOnTopicFaultType();
	}

	/**
	 * Create an instance of {@link InvalidFilterFaultType }
	 * 
     * @return  -
	 */
	public InvalidFilterFaultType createInvalidFilterFaultType() {
		return new InvalidFilterFaultType();
	}

	/**
	 * Create an instance of {@link TopicNotSupportedFaultType }
	 * 
     * @return  -
	 */
	public TopicNotSupportedFaultType createTopicNotSupportedFaultType() {
		return new TopicNotSupportedFaultType();
	}

	/**
	 * Create an instance of {@link PauseSubscription }
	 * 
     * @return  -
	 */
	public PauseSubscription createPauseSubscription() {
		return new PauseSubscription();
	}

	/**
	 * Create an instance of {@link Unsubscribe }
	 * 
     * @return  -
	 */
	public Unsubscribe createUnsubscribe() {
		return new Unsubscribe();
	}

	/**
	 * Create an instance of {@link UnacceptableTerminationTimeFaultType }
	 * 
     * @return  -
	 */
	public UnacceptableTerminationTimeFaultType createUnacceptableTerminationTimeFaultType() {
		return new UnacceptableTerminationTimeFaultType();
	}

	/**
	 * Create an instance of {@link NotificationMessageHolderType.Message }
	 * 
     * @return  -
	 */
	public NotificationMessageHolderType.Message createNotificationMessageHolderTypeMessage() {
		return new NotificationMessageHolderType.Message();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TerminationTime")
	public JAXBElement<XMLGregorianCalendar> createTerminationTime(XMLGregorianCalendar value) {
		return new JAXBElement<>(_TerminationTime_QNAME, XMLGregorianCalendar.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link NotifyMessageNotSupportedFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "NotifyMessageNotSupportedFault")
	public JAXBElement<NotifyMessageNotSupportedFaultType> createNotifyMessageNotSupportedFault(NotifyMessageNotSupportedFaultType value) {
		return new JAXBElement<>(_NotifyMessageNotSupportedFault_QNAME, NotifyMessageNotSupportedFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "ConsumerReference")
	public JAXBElement<EndpointReferenceType> createConsumerReference(EndpointReferenceType value) {
		return new JAXBElement<>(_ConsumerReference_QNAME, EndpointReferenceType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UnsupportedPolicyRequestFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnsupportedPolicyRequestFault")
	public JAXBElement<UnsupportedPolicyRequestFaultType> createUnsupportedPolicyRequestFault(UnsupportedPolicyRequestFaultType value) {
		return new JAXBElement<>(_UnsupportedPolicyRequestFault_QNAME, UnsupportedPolicyRequestFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SubscriptionPolicyType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "SubscriptionPolicy")
	public JAXBElement<SubscriptionPolicyType> createSubscriptionPolicy(SubscriptionPolicyType value) {
		return new JAXBElement<>(_SubscriptionPolicy_QNAME, SubscriptionPolicyType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link NotificationMessageHolderType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "NotificationMessage")
	public JAXBElement<NotificationMessageHolderType> createNotificationMessage(NotificationMessageHolderType value) {
		return new JAXBElement<>(_NotificationMessage_QNAME, NotificationMessageHolderType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UnacceptableInitialTerminationTimeFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnacceptableInitialTerminationTimeFault")
	public JAXBElement<UnacceptableInitialTerminationTimeFaultType> createUnacceptableInitialTerminationTimeFault(
			UnacceptableInitialTerminationTimeFaultType value) {
		return new JAXBElement<>(_UnacceptableInitialTerminationTimeFault_QNAME,
				UnacceptableInitialTerminationTimeFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InvalidTopicExpressionFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InvalidTopicExpressionFault")
	public JAXBElement<InvalidTopicExpressionFaultType> createInvalidTopicExpressionFault(InvalidTopicExpressionFaultType value) {
		return new JAXBElement<>(_InvalidTopicExpressionFault_QNAME, InvalidTopicExpressionFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TopicExpressionDialect")
	public JAXBElement<String> createTopicExpressionDialect(String value) {
		return new JAXBElement<>(_TopicExpressionDialect_QNAME, String.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link FilterType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "Filter")
	public JAXBElement<FilterType> createFilter(FilterType value) {
		return new JAXBElement<>(_Filter_QNAME, FilterType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UnableToCreatePullPointFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnableToCreatePullPointFault")
	public JAXBElement<UnableToCreatePullPointFaultType> createUnableToCreatePullPointFault(UnableToCreatePullPointFaultType value) {
		return new JAXBElement<>(_UnableToCreatePullPointFault_QNAME, UnableToCreatePullPointFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "CreationTime")
	public JAXBElement<XMLGregorianCalendar> createCreationTime(XMLGregorianCalendar value) {
		return new JAXBElement<>(_CreationTime_QNAME, XMLGregorianCalendar.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ResumeFailedFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "ResumeFailedFault")
	public JAXBElement<ResumeFailedFaultType> createResumeFailedFault(ResumeFailedFaultType value) {
		return new JAXBElement<>(_ResumeFailedFault_QNAME, ResumeFailedFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InvalidProducerPropertiesExpressionFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InvalidProducerPropertiesExpressionFault")
	public JAXBElement<InvalidProducerPropertiesExpressionFaultType> createInvalidProducerPropertiesExpressionFault(
			InvalidProducerPropertiesExpressionFaultType value) {
		return new JAXBElement<>(_InvalidProducerPropertiesExpressionFault_QNAME,
				InvalidProducerPropertiesExpressionFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UnableToGetMessagesFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnableToGetMessagesFault")
	public JAXBElement<UnableToGetMessagesFaultType> createUnableToGetMessagesFault(UnableToGetMessagesFaultType value) {
		return new JAXBElement<>(_UnableToGetMessagesFault_QNAME, UnableToGetMessagesFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link QueryExpressionType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "MessageContent")
	public JAXBElement<QueryExpressionType> createMessageContent(QueryExpressionType value) {
		return new JAXBElement<>(_MessageContent_QNAME, QueryExpressionType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TopicExpressionDialectUnknownFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TopicExpressionDialectUnknownFault")
	public JAXBElement<TopicExpressionDialectUnknownFaultType> createTopicExpressionDialectUnknownFault(TopicExpressionDialectUnknownFaultType value) {
		return new JAXBElement<>(_TopicExpressionDialectUnknownFault_QNAME, TopicExpressionDialectUnknownFaultType.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UnableToDestroySubscriptionFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnableToDestroySubscriptionFault")
	public JAXBElement<UnableToDestroySubscriptionFaultType> createUnableToDestroySubscriptionFault(UnableToDestroySubscriptionFaultType value) {
		return new JAXBElement<>(_UnableToDestroySubscriptionFault_QNAME, UnableToDestroySubscriptionFaultType.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UnrecognizedPolicyRequestFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnrecognizedPolicyRequestFault")
	public JAXBElement<UnrecognizedPolicyRequestFaultType> createUnrecognizedPolicyRequestFault(UnrecognizedPolicyRequestFaultType value) {
		return new JAXBElement<>(_UnrecognizedPolicyRequestFault_QNAME, UnrecognizedPolicyRequestFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeCreationFailedFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "SubscribeCreationFailedFault")
	public JAXBElement<SubscribeCreationFailedFaultType> createSubscribeCreationFailedFault(SubscribeCreationFailedFaultType value) {
		return new JAXBElement<>(_SubscribeCreationFailedFault_QNAME, SubscribeCreationFailedFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "ProducerReference")
	public JAXBElement<EndpointReferenceType> createProducerReference(EndpointReferenceType value) {
		return new JAXBElement<>(_ProducerReference_QNAME, EndpointReferenceType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link NoCurrentMessageOnTopicFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "NoCurrentMessageOnTopicFault")
	public JAXBElement<NoCurrentMessageOnTopicFaultType> createNoCurrentMessageOnTopicFault(NoCurrentMessageOnTopicFaultType value) {
		return new JAXBElement<>(_NoCurrentMessageOnTopicFault_QNAME, NoCurrentMessageOnTopicFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link MultipleTopicsSpecifiedFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "MultipleTopicsSpecifiedFault")
	public JAXBElement<MultipleTopicsSpecifiedFaultType> createMultipleTopicsSpecifiedFault(MultipleTopicsSpecifiedFaultType value) {
		return new JAXBElement<>(_MultipleTopicsSpecifiedFault_QNAME, MultipleTopicsSpecifiedFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UnacceptableTerminationTimeFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnacceptableTerminationTimeFault")
	public JAXBElement<UnacceptableTerminationTimeFaultType> createUnacceptableTerminationTimeFault(UnacceptableTerminationTimeFaultType value) {
		return new JAXBElement<>(_UnacceptableTerminationTimeFault_QNAME, UnacceptableTerminationTimeFaultType.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "CurrentTime")
	public JAXBElement<XMLGregorianCalendar> createCurrentTime(XMLGregorianCalendar value) {
		return new JAXBElement<>(_CurrentTime_QNAME, XMLGregorianCalendar.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TopicExpressionType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TopicExpression")
	public JAXBElement<TopicExpressionType> createTopicExpression(TopicExpressionType value) {
		return new JAXBElement<>(_TopicExpression_QNAME, TopicExpressionType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link QueryExpressionType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "ProducerProperties")
	public JAXBElement<QueryExpressionType> createProducerProperties(QueryExpressionType value) {
		return new JAXBElement<>(_ProducerProperties_QNAME, QueryExpressionType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TopicNotSupportedFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "TopicNotSupportedFault")
	public JAXBElement<TopicNotSupportedFaultType> createTopicNotSupportedFault(TopicNotSupportedFaultType value) {
		return new JAXBElement<>(_TopicNotSupportedFault_QNAME, TopicNotSupportedFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InvalidFilterFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InvalidFilterFault")
	public JAXBElement<InvalidFilterFaultType> createInvalidFilterFault(InvalidFilterFaultType value) {
		return new JAXBElement<>(_InvalidFilterFault_QNAME, InvalidFilterFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "FixedTopicSet", defaultValue = "true")
	public JAXBElement<Boolean> createFixedTopicSet(Boolean value) {
		return new JAXBElement<>(_FixedTopicSet_QNAME, Boolean.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TopicExpressionType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "Topic")
	public JAXBElement<TopicExpressionType> createTopic(TopicExpressionType value) {
		return new JAXBElement<>(_Topic_QNAME, TopicExpressionType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UnableToDestroyPullPointFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "UnableToDestroyPullPointFault")
	public JAXBElement<UnableToDestroyPullPointFaultType> createUnableToDestroyPullPointFault(UnableToDestroyPullPointFaultType value) {
		return new JAXBElement<>(_UnableToDestroyPullPointFault_QNAME, UnableToDestroyPullPointFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InvalidMessageContentExpressionFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InvalidMessageContentExpressionFault")
	public JAXBElement<InvalidMessageContentExpressionFaultType> createInvalidMessageContentExpressionFault(InvalidMessageContentExpressionFaultType value) {
		return new JAXBElement<>(_InvalidMessageContentExpressionFault_QNAME,
				InvalidMessageContentExpressionFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link PauseFailedFaultType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "PauseFailedFault")
	public JAXBElement<PauseFailedFaultType> createPauseFailedFault(PauseFailedFaultType value) {
		return new JAXBElement<>(_PauseFailedFault_QNAME, PauseFailedFaultType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EndpointReferenceType }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "SubscriptionReference")
	public JAXBElement<EndpointReferenceType> createSubscriptionReference(EndpointReferenceType value) {
		return new JAXBElement<>(_SubscriptionReference_QNAME, EndpointReferenceType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
	 * 
     * @param value -
     * @return  -
	 */
	@XmlElementDecl(namespace = "http://docs.oasis-open.org/wsn/b-2", name = "InitialTerminationTime", scope = Subscribe.class)
	public JAXBElement<String> createSubscribeInitialTerminationTime(String value) {
		return new JAXBElement<>(_SubscribeInitialTerminationTime_QNAME, String.class, Subscribe.class, value);
	}

}
