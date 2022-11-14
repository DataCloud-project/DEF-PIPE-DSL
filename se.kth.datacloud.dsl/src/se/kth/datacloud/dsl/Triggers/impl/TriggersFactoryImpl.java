/**
 */
package se.kth.datacloud.dsl.Triggers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.kth.datacloud.dsl.Triggers.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TriggersFactoryImpl extends EFactoryImpl implements TriggersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TriggersFactory init() {
		try {
			TriggersFactory theTriggersFactory = (TriggersFactory)EPackage.Registry.INSTANCE.getEFactory(TriggersPackage.eNS_URI);
			if (theTriggersFactory != null) {
				return theTriggersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TriggersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TriggersPackage.SCHEDULE_TRIGGER: return createScheduleTrigger();
			case TriggersPackage.EXTERNAL_EVENT_TRIGGER: return createExternalEventTrigger();
			case TriggersPackage.ONE_TIME_TRIGGER: return createOneTimeTrigger();
			case TriggersPackage.CRON_SCHEDULE_TRIGGER: return createCronScheduleTrigger();
			case TriggersPackage.INTERVAL_SCHEDULE_TRIGGER: return createIntervalScheduleTrigger();
			case TriggersPackage.POLL_DATABASE_TRIGGER: return createPollDatabaseTrigger();
			case TriggersPackage.POLL_MESSAGE_QUEUE_TRIGGER: return createPollMessageQueueTrigger();
			case TriggersPackage.POLL_WEB_SERVICE_TRIGGER: return createPollWebServiceTrigger();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleTrigger createScheduleTrigger() {
		ScheduleTriggerImpl scheduleTrigger = new ScheduleTriggerImpl();
		return scheduleTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalEventTrigger createExternalEventTrigger() {
		ExternalEventTriggerImpl externalEventTrigger = new ExternalEventTriggerImpl();
		return externalEventTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneTimeTrigger createOneTimeTrigger() {
		OneTimeTriggerImpl oneTimeTrigger = new OneTimeTriggerImpl();
		return oneTimeTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CronScheduleTrigger createCronScheduleTrigger() {
		CronScheduleTriggerImpl cronScheduleTrigger = new CronScheduleTriggerImpl();
		return cronScheduleTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalScheduleTrigger createIntervalScheduleTrigger() {
		IntervalScheduleTriggerImpl intervalScheduleTrigger = new IntervalScheduleTriggerImpl();
		return intervalScheduleTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollDatabaseTrigger createPollDatabaseTrigger() {
		PollDatabaseTriggerImpl pollDatabaseTrigger = new PollDatabaseTriggerImpl();
		return pollDatabaseTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollMessageQueueTrigger createPollMessageQueueTrigger() {
		PollMessageQueueTriggerImpl pollMessageQueueTrigger = new PollMessageQueueTriggerImpl();
		return pollMessageQueueTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollWebServiceTrigger createPollWebServiceTrigger() {
		PollWebServiceTriggerImpl pollWebServiceTrigger = new PollWebServiceTriggerImpl();
		return pollWebServiceTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggersPackage getTriggersPackage() {
		return (TriggersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TriggersPackage getPackage() {
		return TriggersPackage.eINSTANCE;
	}

} //TriggersFactoryImpl
