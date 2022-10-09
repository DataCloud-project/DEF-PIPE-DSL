/**
 */
package se.kth.datacloud.dsl.Triggers.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage;

import se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl;

import se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersPackage;

import se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl;

import se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariablesPackage;

import se.kth.datacloud.dsl.EnvironmentVariables.impl.EnvironmentVariablesPackageImpl;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage;

import se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl;

import se.kth.datacloud.dsl.ResourceProviders.ResourceProvidersPackage;

import se.kth.datacloud.dsl.ResourceProviders.impl.ResourceProvidersPackageImpl;

import se.kth.datacloud.dsl.Triggers.CronScheduleTrigger;
import se.kth.datacloud.dsl.Triggers.ExternalEventTrigger;
import se.kth.datacloud.dsl.Triggers.IntervalScheduleTrigger;
import se.kth.datacloud.dsl.Triggers.OneTimeTrigger;
import se.kth.datacloud.dsl.Triggers.PollDatabaseTrigger;
import se.kth.datacloud.dsl.Triggers.PollMessageQueueTrigger;
import se.kth.datacloud.dsl.Triggers.PollWebServiceTrigger;
import se.kth.datacloud.dsl.Triggers.PollingTrigger;
import se.kth.datacloud.dsl.Triggers.ScheduleTrigger;
import se.kth.datacloud.dsl.Triggers.Trigger;
import se.kth.datacloud.dsl.Triggers.TriggersFactory;
import se.kth.datacloud.dsl.Triggers.TriggersPackage;

import se.kth.datacloud.dsl.dsl.DslPackage;

import se.kth.datacloud.dsl.dsl.impl.DslPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TriggersPackageImpl extends EPackageImpl implements TriggersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scheduleTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass externalEventTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneTimeTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cronScheduleTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalScheduleTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pollingTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pollDatabaseTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pollMessageQueueTriggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pollWebServiceTriggerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TriggersPackageImpl() {
		super(eNS_URI, TriggersFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TriggersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TriggersPackage init() {
		if (isInited) return (TriggersPackage)EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTriggersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TriggersPackageImpl theTriggersPackage = registeredTriggersPackage instanceof TriggersPackageImpl ? (TriggersPackageImpl)registeredTriggersPackage : new TriggersPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI);
		DslPackageImpl theDslPackage = (DslPackageImpl)(registeredPackage instanceof DslPackageImpl ? registeredPackage : DslPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnvironmentVariablesPackage.eNS_URI);
		EnvironmentVariablesPackageImpl theEnvironmentVariablesPackage = (EnvironmentVariablesPackageImpl)(registeredPackage instanceof EnvironmentVariablesPackageImpl ? registeredPackage : EnvironmentVariablesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ControlParametersPackage.eNS_URI);
		ControlParametersPackageImpl theControlParametersPackage = (ControlParametersPackageImpl)(registeredPackage instanceof ControlParametersPackageImpl ? registeredPackage : ControlParametersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExecutionRequirementsPackage.eNS_URI);
		ExecutionRequirementsPackageImpl theExecutionRequirementsPackage = (ExecutionRequirementsPackageImpl)(registeredPackage instanceof ExecutionRequirementsPackageImpl ? registeredPackage : ExecutionRequirementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourceProvidersPackage.eNS_URI);
		ResourceProvidersPackageImpl theResourceProvidersPackage = (ResourceProvidersPackageImpl)(registeredPackage instanceof ResourceProvidersPackageImpl ? registeredPackage : ResourceProvidersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataSourceParametersPackage.eNS_URI);
		DataSourceParametersPackageImpl theDataSourceParametersPackage = (DataSourceParametersPackageImpl)(registeredPackage instanceof DataSourceParametersPackageImpl ? registeredPackage : DataSourceParametersPackage.eINSTANCE);

		// Create package meta-data objects
		theTriggersPackage.createPackageContents();
		theDslPackage.createPackageContents();
		theEnvironmentVariablesPackage.createPackageContents();
		theControlParametersPackage.createPackageContents();
		theExecutionRequirementsPackage.createPackageContents();
		theResourceProvidersPackage.createPackageContents();
		theDataSourceParametersPackage.createPackageContents();

		// Initialize created meta-data
		theTriggersPackage.initializePackageContents();
		theDslPackage.initializePackageContents();
		theEnvironmentVariablesPackage.initializePackageContents();
		theControlParametersPackage.initializePackageContents();
		theExecutionRequirementsPackage.initializePackageContents();
		theResourceProvidersPackage.initializePackageContents();
		theDataSourceParametersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTriggersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TriggersPackage.eNS_URI, theTriggersPackage);
		return theTriggersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScheduleTrigger() {
		return scheduleTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScheduleTrigger_StartTime() {
		return (EAttribute)scheduleTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExternalEventTrigger() {
		return externalEventTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneTimeTrigger() {
		return oneTimeTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOneTimeTrigger_StartTime() {
		return (EAttribute)oneTimeTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCronScheduleTrigger() {
		return cronScheduleTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCronScheduleTrigger_CronExpression() {
		return (EAttribute)cronScheduleTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervalScheduleTrigger() {
		return intervalScheduleTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntervalScheduleTrigger_Frequency() {
		return (EAttribute)intervalScheduleTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntervalScheduleTrigger_Interval() {
		return (EAttribute)intervalScheduleTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPollingTrigger() {
		return pollingTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollingTrigger_NumberOfRetries() {
		return (EAttribute)pollingTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollingTrigger_Interval() {
		return (EAttribute)pollingTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPollingTrigger_Condition() {
		return (EReference)pollingTriggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPollDatabaseTrigger() {
		return pollDatabaseTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollDatabaseTrigger_QueryScript() {
		return (EAttribute)pollDatabaseTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPollDatabaseTrigger_Credentials() {
		return (EReference)pollDatabaseTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPollMessageQueueTrigger() {
		return pollMessageQueueTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPollMessageQueueTrigger_ConsumerQueueName() {
		return (EAttribute)pollMessageQueueTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPollMessageQueueTrigger_Credentials() {
		return (EReference)pollMessageQueueTriggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPollWebServiceTrigger() {
		return pollWebServiceTriggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPollWebServiceTrigger_Credentials() {
		return (EReference)pollWebServiceTriggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggersFactory getTriggersFactory() {
		return (TriggersFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		scheduleTriggerEClass = createEClass(SCHEDULE_TRIGGER);
		createEAttribute(scheduleTriggerEClass, SCHEDULE_TRIGGER__START_TIME);

		triggerEClass = createEClass(TRIGGER);

		externalEventTriggerEClass = createEClass(EXTERNAL_EVENT_TRIGGER);

		oneTimeTriggerEClass = createEClass(ONE_TIME_TRIGGER);
		createEAttribute(oneTimeTriggerEClass, ONE_TIME_TRIGGER__START_TIME);

		cronScheduleTriggerEClass = createEClass(CRON_SCHEDULE_TRIGGER);
		createEAttribute(cronScheduleTriggerEClass, CRON_SCHEDULE_TRIGGER__CRON_EXPRESSION);

		intervalScheduleTriggerEClass = createEClass(INTERVAL_SCHEDULE_TRIGGER);
		createEAttribute(intervalScheduleTriggerEClass, INTERVAL_SCHEDULE_TRIGGER__FREQUENCY);
		createEAttribute(intervalScheduleTriggerEClass, INTERVAL_SCHEDULE_TRIGGER__INTERVAL);

		pollingTriggerEClass = createEClass(POLLING_TRIGGER);
		createEAttribute(pollingTriggerEClass, POLLING_TRIGGER__NUMBER_OF_RETRIES);
		createEAttribute(pollingTriggerEClass, POLLING_TRIGGER__INTERVAL);
		createEReference(pollingTriggerEClass, POLLING_TRIGGER__CONDITION);

		pollDatabaseTriggerEClass = createEClass(POLL_DATABASE_TRIGGER);
		createEAttribute(pollDatabaseTriggerEClass, POLL_DATABASE_TRIGGER__QUERY_SCRIPT);
		createEReference(pollDatabaseTriggerEClass, POLL_DATABASE_TRIGGER__CREDENTIALS);

		pollMessageQueueTriggerEClass = createEClass(POLL_MESSAGE_QUEUE_TRIGGER);
		createEAttribute(pollMessageQueueTriggerEClass, POLL_MESSAGE_QUEUE_TRIGGER__CONSUMER_QUEUE_NAME);
		createEReference(pollMessageQueueTriggerEClass, POLL_MESSAGE_QUEUE_TRIGGER__CREDENTIALS);

		pollWebServiceTriggerEClass = createEClass(POLL_WEB_SERVICE_TRIGGER);
		createEReference(pollWebServiceTriggerEClass, POLL_WEB_SERVICE_TRIGGER__CREDENTIALS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		DslPackage theDslPackage = (DslPackage)EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI);
		ControlParametersPackage theControlParametersPackage = (ControlParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ControlParametersPackage.eNS_URI);
		DataSourceParametersPackage theDataSourceParametersPackage = (DataSourceParametersPackage)EPackage.Registry.INSTANCE.getEPackage(DataSourceParametersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		scheduleTriggerEClass.getESuperTypes().add(this.getTrigger());
		externalEventTriggerEClass.getESuperTypes().add(this.getTrigger());
		oneTimeTriggerEClass.getESuperTypes().add(this.getTrigger());
		cronScheduleTriggerEClass.getESuperTypes().add(this.getScheduleTrigger());
		intervalScheduleTriggerEClass.getESuperTypes().add(this.getScheduleTrigger());
		pollingTriggerEClass.getESuperTypes().add(this.getTrigger());
		pollDatabaseTriggerEClass.getESuperTypes().add(this.getPollingTrigger());
		pollMessageQueueTriggerEClass.getESuperTypes().add(this.getPollingTrigger());
		pollWebServiceTriggerEClass.getESuperTypes().add(this.getPollingTrigger());

		// Initialize classes, features, and operations; add parameters
		initEClass(scheduleTriggerEClass, ScheduleTrigger.class, "ScheduleTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getScheduleTrigger_StartTime(), ecorePackage.getEString(), "startTime", null, 0, 1, ScheduleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(externalEventTriggerEClass, ExternalEventTrigger.class, "ExternalEventTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(oneTimeTriggerEClass, OneTimeTrigger.class, "OneTimeTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOneTimeTrigger_StartTime(), ecorePackage.getEString(), "startTime", null, 0, 1, OneTimeTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cronScheduleTriggerEClass, CronScheduleTrigger.class, "CronScheduleTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCronScheduleTrigger_CronExpression(), ecorePackage.getEString(), "cronExpression", null, 0, 1, CronScheduleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(intervalScheduleTriggerEClass, IntervalScheduleTrigger.class, "IntervalScheduleTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntervalScheduleTrigger_Frequency(), theDslPackage.getTimeUnits(), "frequency", null, 0, 1, IntervalScheduleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIntervalScheduleTrigger_Interval(), ecorePackage.getEInt(), "interval", null, 0, 1, IntervalScheduleTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pollingTriggerEClass, PollingTrigger.class, "PollingTrigger", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPollingTrigger_NumberOfRetries(), ecorePackage.getEInt(), "numberOfRetries", null, 0, 1, PollingTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPollingTrigger_Interval(), ecorePackage.getEInt(), "interval", null, 0, 1, PollingTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPollingTrigger_Condition(), theControlParametersPackage.getAbstractCondition(), null, "condition", null, 0, 1, PollingTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pollDatabaseTriggerEClass, PollDatabaseTrigger.class, "PollDatabaseTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPollDatabaseTrigger_QueryScript(), ecorePackage.getEString(), "queryScript", null, 0, 1, PollDatabaseTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPollDatabaseTrigger_Credentials(), theDataSourceParametersPackage.getDatabaseCredentials(), null, "credentials", null, 0, 1, PollDatabaseTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pollMessageQueueTriggerEClass, PollMessageQueueTrigger.class, "PollMessageQueueTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPollMessageQueueTrigger_ConsumerQueueName(), ecorePackage.getEString(), "consumerQueueName", null, 0, 1, PollMessageQueueTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPollMessageQueueTrigger_Credentials(), theDataSourceParametersPackage.getMessageQueueCredentials(), null, "credentials", null, 0, 1, PollMessageQueueTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pollWebServiceTriggerEClass, PollWebServiceTrigger.class, "PollWebServiceTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPollWebServiceTrigger_Credentials(), theDataSourceParametersPackage.getWebApiCredentials(), null, "credentials", null, 0, 1, PollWebServiceTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TriggersPackageImpl
