/**
 */
package se.kth.datacloud.dsl.Triggers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.Triggers.TriggersFactory
 * @model kind="package"
 * @generated
 */
public interface TriggersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Triggers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://datacloud.kth.se/dcdsl/Triggers";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Triggers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TriggersPackage eINSTANCE = se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.Triggers.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.Triggers.impl.TriggerImpl
	 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 1;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.Triggers.impl.ScheduleTriggerImpl <em>Schedule Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.Triggers.impl.ScheduleTriggerImpl
	 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getScheduleTrigger()
	 * @generated
	 */
	int SCHEDULE_TRIGGER = 0;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER__START_TIME = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Schedule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Schedule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULE_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.Triggers.impl.ExternalEventTriggerImpl <em>External Event Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.Triggers.impl.ExternalEventTriggerImpl
	 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getExternalEventTrigger()
	 * @generated
	 */
	int EXTERNAL_EVENT_TRIGGER = 2;

	/**
	 * The number of structural features of the '<em>External Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>External Event Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_EVENT_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.Triggers.impl.OneTimeTriggerImpl <em>One Time Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.Triggers.impl.OneTimeTriggerImpl
	 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getOneTimeTrigger()
	 * @generated
	 */
	int ONE_TIME_TRIGGER = 3;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TIME_TRIGGER__START_TIME = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>One Time Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TIME_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>One Time Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_TIME_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.Triggers.impl.CronScheduleTriggerImpl <em>Cron Schedule Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.Triggers.impl.CronScheduleTriggerImpl
	 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getCronScheduleTrigger()
	 * @generated
	 */
	int CRON_SCHEDULE_TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_TRIGGER__START_TIME = SCHEDULE_TRIGGER__START_TIME;

	/**
	 * The feature id for the '<em><b>Cron Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_TRIGGER__CRON_EXPRESSION = SCHEDULE_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cron Schedule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_TRIGGER_FEATURE_COUNT = SCHEDULE_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cron Schedule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRON_SCHEDULE_TRIGGER_OPERATION_COUNT = SCHEDULE_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.Triggers.impl.IntervalScheduleTriggerImpl <em>Interval Schedule Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.Triggers.impl.IntervalScheduleTriggerImpl
	 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getIntervalScheduleTrigger()
	 * @generated
	 */
	int INTERVAL_SCHEDULE_TRIGGER = 5;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCHEDULE_TRIGGER__START_TIME = SCHEDULE_TRIGGER__START_TIME;

	/**
	 * The feature id for the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCHEDULE_TRIGGER__FREQUENCY = SCHEDULE_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCHEDULE_TRIGGER__INTERVAL = SCHEDULE_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Interval Schedule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCHEDULE_TRIGGER_FEATURE_COUNT = SCHEDULE_TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Interval Schedule Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERVAL_SCHEDULE_TRIGGER_OPERATION_COUNT = SCHEDULE_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.Triggers.impl.PollingTriggerImpl <em>Polling Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.Triggers.impl.PollingTriggerImpl
	 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getPollingTrigger()
	 * @generated
	 */
	int POLLING_TRIGGER = 6;

	/**
	 * The feature id for the '<em><b>Number Of Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLLING_TRIGGER__NUMBER_OF_RETRIES = TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLLING_TRIGGER__INTERVAL = TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLLING_TRIGGER__CONDITION = TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Polling Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLLING_TRIGGER_FEATURE_COUNT = TRIGGER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Polling Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLLING_TRIGGER_OPERATION_COUNT = TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.Triggers.impl.PollDatabaseTriggerImpl <em>Poll Database Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.Triggers.impl.PollDatabaseTriggerImpl
	 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getPollDatabaseTrigger()
	 * @generated
	 */
	int POLL_DATABASE_TRIGGER = 7;

	/**
	 * The feature id for the '<em><b>Number Of Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_DATABASE_TRIGGER__NUMBER_OF_RETRIES = POLLING_TRIGGER__NUMBER_OF_RETRIES;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_DATABASE_TRIGGER__INTERVAL = POLLING_TRIGGER__INTERVAL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_DATABASE_TRIGGER__CONDITION = POLLING_TRIGGER__CONDITION;

	/**
	 * The feature id for the '<em><b>Query Script</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_DATABASE_TRIGGER__QUERY_SCRIPT = POLLING_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_DATABASE_TRIGGER__CREDENTIALS = POLLING_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Poll Database Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_DATABASE_TRIGGER_FEATURE_COUNT = POLLING_TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Poll Database Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_DATABASE_TRIGGER_OPERATION_COUNT = POLLING_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.Triggers.impl.PollMessageQueueTriggerImpl <em>Poll Message Queue Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.Triggers.impl.PollMessageQueueTriggerImpl
	 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getPollMessageQueueTrigger()
	 * @generated
	 */
	int POLL_MESSAGE_QUEUE_TRIGGER = 8;

	/**
	 * The feature id for the '<em><b>Number Of Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_MESSAGE_QUEUE_TRIGGER__NUMBER_OF_RETRIES = POLLING_TRIGGER__NUMBER_OF_RETRIES;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_MESSAGE_QUEUE_TRIGGER__INTERVAL = POLLING_TRIGGER__INTERVAL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_MESSAGE_QUEUE_TRIGGER__CONDITION = POLLING_TRIGGER__CONDITION;

	/**
	 * The feature id for the '<em><b>Consumer Queue Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_MESSAGE_QUEUE_TRIGGER__CONSUMER_QUEUE_NAME = POLLING_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_MESSAGE_QUEUE_TRIGGER__CREDENTIALS = POLLING_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Poll Message Queue Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_MESSAGE_QUEUE_TRIGGER_FEATURE_COUNT = POLLING_TRIGGER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Poll Message Queue Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_MESSAGE_QUEUE_TRIGGER_OPERATION_COUNT = POLLING_TRIGGER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.Triggers.impl.PollWebServiceTriggerImpl <em>Poll Web Service Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.Triggers.impl.PollWebServiceTriggerImpl
	 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getPollWebServiceTrigger()
	 * @generated
	 */
	int POLL_WEB_SERVICE_TRIGGER = 9;

	/**
	 * The feature id for the '<em><b>Number Of Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_WEB_SERVICE_TRIGGER__NUMBER_OF_RETRIES = POLLING_TRIGGER__NUMBER_OF_RETRIES;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_WEB_SERVICE_TRIGGER__INTERVAL = POLLING_TRIGGER__INTERVAL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_WEB_SERVICE_TRIGGER__CONDITION = POLLING_TRIGGER__CONDITION;

	/**
	 * The feature id for the '<em><b>Credentials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_WEB_SERVICE_TRIGGER__CREDENTIALS = POLLING_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Poll Web Service Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_WEB_SERVICE_TRIGGER_FEATURE_COUNT = POLLING_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Poll Web Service Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLL_WEB_SERVICE_TRIGGER_OPERATION_COUNT = POLLING_TRIGGER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.Triggers.ScheduleTrigger <em>Schedule Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schedule Trigger</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.ScheduleTrigger
	 * @generated
	 */
	EClass getScheduleTrigger();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.Triggers.ScheduleTrigger#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.ScheduleTrigger#getStartTime()
	 * @see #getScheduleTrigger()
	 * @generated
	 */
	EAttribute getScheduleTrigger_StartTime();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.Triggers.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.Triggers.ExternalEventTrigger <em>External Event Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Event Trigger</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.ExternalEventTrigger
	 * @generated
	 */
	EClass getExternalEventTrigger();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.Triggers.OneTimeTrigger <em>One Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Time Trigger</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.OneTimeTrigger
	 * @generated
	 */
	EClass getOneTimeTrigger();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.Triggers.OneTimeTrigger#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.OneTimeTrigger#getStartTime()
	 * @see #getOneTimeTrigger()
	 * @generated
	 */
	EAttribute getOneTimeTrigger_StartTime();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.Triggers.CronScheduleTrigger <em>Cron Schedule Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cron Schedule Trigger</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.CronScheduleTrigger
	 * @generated
	 */
	EClass getCronScheduleTrigger();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.Triggers.CronScheduleTrigger#getCronExpression <em>Cron Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cron Expression</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.CronScheduleTrigger#getCronExpression()
	 * @see #getCronScheduleTrigger()
	 * @generated
	 */
	EAttribute getCronScheduleTrigger_CronExpression();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.Triggers.IntervalScheduleTrigger <em>Interval Schedule Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interval Schedule Trigger</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.IntervalScheduleTrigger
	 * @generated
	 */
	EClass getIntervalScheduleTrigger();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.Triggers.IntervalScheduleTrigger#getFrequency <em>Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frequency</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.IntervalScheduleTrigger#getFrequency()
	 * @see #getIntervalScheduleTrigger()
	 * @generated
	 */
	EAttribute getIntervalScheduleTrigger_Frequency();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.Triggers.IntervalScheduleTrigger#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.IntervalScheduleTrigger#getInterval()
	 * @see #getIntervalScheduleTrigger()
	 * @generated
	 */
	EAttribute getIntervalScheduleTrigger_Interval();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.Triggers.PollingTrigger <em>Polling Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polling Trigger</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.PollingTrigger
	 * @generated
	 */
	EClass getPollingTrigger();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.Triggers.PollingTrigger#getNumberOfRetries <em>Number Of Retries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Retries</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.PollingTrigger#getNumberOfRetries()
	 * @see #getPollingTrigger()
	 * @generated
	 */
	EAttribute getPollingTrigger_NumberOfRetries();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.Triggers.PollingTrigger#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.PollingTrigger#getInterval()
	 * @see #getPollingTrigger()
	 * @generated
	 */
	EAttribute getPollingTrigger_Interval();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.Triggers.PollingTrigger#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.PollingTrigger#getCondition()
	 * @see #getPollingTrigger()
	 * @generated
	 */
	EReference getPollingTrigger_Condition();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.Triggers.PollDatabaseTrigger <em>Poll Database Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poll Database Trigger</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.PollDatabaseTrigger
	 * @generated
	 */
	EClass getPollDatabaseTrigger();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.Triggers.PollDatabaseTrigger#getQueryScript <em>Query Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Script</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.PollDatabaseTrigger#getQueryScript()
	 * @see #getPollDatabaseTrigger()
	 * @generated
	 */
	EAttribute getPollDatabaseTrigger_QueryScript();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.Triggers.PollDatabaseTrigger#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credentials</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.PollDatabaseTrigger#getCredentials()
	 * @see #getPollDatabaseTrigger()
	 * @generated
	 */
	EReference getPollDatabaseTrigger_Credentials();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.Triggers.PollMessageQueueTrigger <em>Poll Message Queue Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poll Message Queue Trigger</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.PollMessageQueueTrigger
	 * @generated
	 */
	EClass getPollMessageQueueTrigger();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.Triggers.PollMessageQueueTrigger#getConsumerQueueName <em>Consumer Queue Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consumer Queue Name</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.PollMessageQueueTrigger#getConsumerQueueName()
	 * @see #getPollMessageQueueTrigger()
	 * @generated
	 */
	EAttribute getPollMessageQueueTrigger_ConsumerQueueName();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.Triggers.PollMessageQueueTrigger#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credentials</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.PollMessageQueueTrigger#getCredentials()
	 * @see #getPollMessageQueueTrigger()
	 * @generated
	 */
	EReference getPollMessageQueueTrigger_Credentials();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.Triggers.PollWebServiceTrigger <em>Poll Web Service Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Poll Web Service Trigger</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.PollWebServiceTrigger
	 * @generated
	 */
	EClass getPollWebServiceTrigger();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.Triggers.PollWebServiceTrigger#getCredentials <em>Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Credentials</em>'.
	 * @see se.kth.datacloud.dsl.Triggers.PollWebServiceTrigger#getCredentials()
	 * @see #getPollWebServiceTrigger()
	 * @generated
	 */
	EReference getPollWebServiceTrigger_Credentials();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TriggersFactory getTriggersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.Triggers.impl.ScheduleTriggerImpl <em>Schedule Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.Triggers.impl.ScheduleTriggerImpl
		 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getScheduleTrigger()
		 * @generated
		 */
		EClass SCHEDULE_TRIGGER = eINSTANCE.getScheduleTrigger();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULE_TRIGGER__START_TIME = eINSTANCE.getScheduleTrigger_StartTime();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.Triggers.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.Triggers.impl.TriggerImpl
		 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.Triggers.impl.ExternalEventTriggerImpl <em>External Event Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.Triggers.impl.ExternalEventTriggerImpl
		 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getExternalEventTrigger()
		 * @generated
		 */
		EClass EXTERNAL_EVENT_TRIGGER = eINSTANCE.getExternalEventTrigger();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.Triggers.impl.OneTimeTriggerImpl <em>One Time Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.Triggers.impl.OneTimeTriggerImpl
		 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getOneTimeTrigger()
		 * @generated
		 */
		EClass ONE_TIME_TRIGGER = eINSTANCE.getOneTimeTrigger();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ONE_TIME_TRIGGER__START_TIME = eINSTANCE.getOneTimeTrigger_StartTime();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.Triggers.impl.CronScheduleTriggerImpl <em>Cron Schedule Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.Triggers.impl.CronScheduleTriggerImpl
		 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getCronScheduleTrigger()
		 * @generated
		 */
		EClass CRON_SCHEDULE_TRIGGER = eINSTANCE.getCronScheduleTrigger();

		/**
		 * The meta object literal for the '<em><b>Cron Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRON_SCHEDULE_TRIGGER__CRON_EXPRESSION = eINSTANCE.getCronScheduleTrigger_CronExpression();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.Triggers.impl.IntervalScheduleTriggerImpl <em>Interval Schedule Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.Triggers.impl.IntervalScheduleTriggerImpl
		 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getIntervalScheduleTrigger()
		 * @generated
		 */
		EClass INTERVAL_SCHEDULE_TRIGGER = eINSTANCE.getIntervalScheduleTrigger();

		/**
		 * The meta object literal for the '<em><b>Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL_SCHEDULE_TRIGGER__FREQUENCY = eINSTANCE.getIntervalScheduleTrigger_Frequency();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERVAL_SCHEDULE_TRIGGER__INTERVAL = eINSTANCE.getIntervalScheduleTrigger_Interval();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.Triggers.impl.PollingTriggerImpl <em>Polling Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.Triggers.impl.PollingTriggerImpl
		 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getPollingTrigger()
		 * @generated
		 */
		EClass POLLING_TRIGGER = eINSTANCE.getPollingTrigger();

		/**
		 * The meta object literal for the '<em><b>Number Of Retries</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLLING_TRIGGER__NUMBER_OF_RETRIES = eINSTANCE.getPollingTrigger_NumberOfRetries();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLLING_TRIGGER__INTERVAL = eINSTANCE.getPollingTrigger_Interval();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLLING_TRIGGER__CONDITION = eINSTANCE.getPollingTrigger_Condition();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.Triggers.impl.PollDatabaseTriggerImpl <em>Poll Database Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.Triggers.impl.PollDatabaseTriggerImpl
		 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getPollDatabaseTrigger()
		 * @generated
		 */
		EClass POLL_DATABASE_TRIGGER = eINSTANCE.getPollDatabaseTrigger();

		/**
		 * The meta object literal for the '<em><b>Query Script</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL_DATABASE_TRIGGER__QUERY_SCRIPT = eINSTANCE.getPollDatabaseTrigger_QueryScript();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL_DATABASE_TRIGGER__CREDENTIALS = eINSTANCE.getPollDatabaseTrigger_Credentials();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.Triggers.impl.PollMessageQueueTriggerImpl <em>Poll Message Queue Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.Triggers.impl.PollMessageQueueTriggerImpl
		 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getPollMessageQueueTrigger()
		 * @generated
		 */
		EClass POLL_MESSAGE_QUEUE_TRIGGER = eINSTANCE.getPollMessageQueueTrigger();

		/**
		 * The meta object literal for the '<em><b>Consumer Queue Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLL_MESSAGE_QUEUE_TRIGGER__CONSUMER_QUEUE_NAME = eINSTANCE.getPollMessageQueueTrigger_ConsumerQueueName();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL_MESSAGE_QUEUE_TRIGGER__CREDENTIALS = eINSTANCE.getPollMessageQueueTrigger_Credentials();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.Triggers.impl.PollWebServiceTriggerImpl <em>Poll Web Service Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.Triggers.impl.PollWebServiceTriggerImpl
		 * @see se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl#getPollWebServiceTrigger()
		 * @generated
		 */
		EClass POLL_WEB_SERVICE_TRIGGER = eINSTANCE.getPollWebServiceTrigger();

		/**
		 * The meta object literal for the '<em><b>Credentials</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLL_WEB_SERVICE_TRIGGER__CREDENTIALS = eINSTANCE.getPollWebServiceTrigger_Credentials();

	}

} //TriggersPackage
