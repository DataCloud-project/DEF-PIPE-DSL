/**
 */
package se.kth.datacloud.dsl.DataSourceParameters.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage;

import se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl;

import se.kth.datacloud.dsl.DataSourceParameters.BlockStorage;
import se.kth.datacloud.dsl.DataSourceParameters.BlockStorageCredentials;
import se.kth.datacloud.dsl.DataSourceParameters.DataSourceCredentials;
import se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersFactory;
import se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersPackage;
import se.kth.datacloud.dsl.DataSourceParameters.Database;
import se.kth.datacloud.dsl.DataSourceParameters.DatabaseCredentials;
import se.kth.datacloud.dsl.DataSourceParameters.InputDataSource;
import se.kth.datacloud.dsl.DataSourceParameters.MessageQueue;
import se.kth.datacloud.dsl.DataSourceParameters.MessageQueueCredentials;
import se.kth.datacloud.dsl.DataSourceParameters.ParameterValueTypes;
import se.kth.datacloud.dsl.DataSourceParameters.WebApi;
import se.kth.datacloud.dsl.DataSourceParameters.WebApiCredentials;

import se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariablesPackage;

import se.kth.datacloud.dsl.EnvironmentVariables.impl.EnvironmentVariablesPackageImpl;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage;

import se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl;

import se.kth.datacloud.dsl.ResourceProviders.ResourceProvidersPackage;

import se.kth.datacloud.dsl.ResourceProviders.impl.ResourceProvidersPackageImpl;

import se.kth.datacloud.dsl.Triggers.TriggersPackage;

import se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl;

import se.kth.datacloud.dsl.dsl.DslPackage;

import se.kth.datacloud.dsl.dsl.impl.DslPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSourceParametersPackageImpl extends EPackageImpl implements DataSourceParametersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputDataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterValueTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceCredentialsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockStorageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageQueueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webApiCredentialsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageQueueCredentialsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseCredentialsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockStorageCredentialsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ftpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sftpEClass = null;

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
	 * @see se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DataSourceParametersPackageImpl() {
		super(eNS_URI, DataSourceParametersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DataSourceParametersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DataSourceParametersPackage init() {
		if (isInited) return (DataSourceParametersPackage)EPackage.Registry.INSTANCE.getEPackage(DataSourceParametersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataSourceParametersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataSourceParametersPackageImpl theDataSourceParametersPackage = registeredDataSourceParametersPackage instanceof DataSourceParametersPackageImpl ? (DataSourceParametersPackageImpl)registeredDataSourceParametersPackage : new DataSourceParametersPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI);
		DslPackageImpl theDslPackage = (DslPackageImpl)(registeredPackage instanceof DslPackageImpl ? registeredPackage : DslPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnvironmentVariablesPackage.eNS_URI);
		EnvironmentVariablesPackageImpl theEnvironmentVariablesPackage = (EnvironmentVariablesPackageImpl)(registeredPackage instanceof EnvironmentVariablesPackageImpl ? registeredPackage : EnvironmentVariablesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
		TriggersPackageImpl theTriggersPackage = (TriggersPackageImpl)(registeredPackage instanceof TriggersPackageImpl ? registeredPackage : TriggersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ControlParametersPackage.eNS_URI);
		ControlParametersPackageImpl theControlParametersPackage = (ControlParametersPackageImpl)(registeredPackage instanceof ControlParametersPackageImpl ? registeredPackage : ControlParametersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExecutionRequirementsPackage.eNS_URI);
		ExecutionRequirementsPackageImpl theExecutionRequirementsPackage = (ExecutionRequirementsPackageImpl)(registeredPackage instanceof ExecutionRequirementsPackageImpl ? registeredPackage : ExecutionRequirementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourceProvidersPackage.eNS_URI);
		ResourceProvidersPackageImpl theResourceProvidersPackage = (ResourceProvidersPackageImpl)(registeredPackage instanceof ResourceProvidersPackageImpl ? registeredPackage : ResourceProvidersPackage.eINSTANCE);

		// Create package meta-data objects
		theDataSourceParametersPackage.createPackageContents();
		theDslPackage.createPackageContents();
		theEnvironmentVariablesPackage.createPackageContents();
		theTriggersPackage.createPackageContents();
		theControlParametersPackage.createPackageContents();
		theExecutionRequirementsPackage.createPackageContents();
		theResourceProvidersPackage.createPackageContents();

		// Initialize created meta-data
		theDataSourceParametersPackage.initializePackageContents();
		theDslPackage.initializePackageContents();
		theEnvironmentVariablesPackage.initializePackageContents();
		theTriggersPackage.initializePackageContents();
		theControlParametersPackage.initializePackageContents();
		theExecutionRequirementsPackage.initializePackageContents();
		theResourceProvidersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDataSourceParametersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DataSourceParametersPackage.eNS_URI, theDataSourceParametersPackage);
		return theDataSourceParametersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputDataSource() {
		return inputDataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputDataSource_Value() {
		return (EReference)inputDataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputDataSource_Datasourcecredentials() {
		return (EReference)inputDataSourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputDataSource_Name() {
		return (EAttribute)inputDataSourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterValueTypes() {
		return parameterValueTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSourceCredentials() {
		return dataSourceCredentialsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockStorage() {
		return blockStorageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageQueue() {
		return messageQueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebApi() {
		return webApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebApiCredentials() {
		return webApiCredentialsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebApiCredentials_Name() {
		return (EAttribute)webApiCredentialsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageQueueCredentials() {
		return messageQueueCredentialsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabaseCredentials() {
		return databaseCredentialsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlockStorageCredentials() {
		return blockStorageCredentialsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFTP() {
		return ftpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSFTP() {
		return sftpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceParametersFactory getDataSourceParametersFactory() {
		return (DataSourceParametersFactory)getEFactoryInstance();
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
		inputDataSourceEClass = createEClass(INPUT_DATA_SOURCE);
		createEReference(inputDataSourceEClass, INPUT_DATA_SOURCE__VALUE);
		createEReference(inputDataSourceEClass, INPUT_DATA_SOURCE__DATASOURCECREDENTIALS);
		createEAttribute(inputDataSourceEClass, INPUT_DATA_SOURCE__NAME);

		parameterValueTypesEClass = createEClass(PARAMETER_VALUE_TYPES);

		dataSourceCredentialsEClass = createEClass(DATA_SOURCE_CREDENTIALS);

		blockStorageEClass = createEClass(BLOCK_STORAGE);

		databaseEClass = createEClass(DATABASE);

		messageQueueEClass = createEClass(MESSAGE_QUEUE);

		webApiEClass = createEClass(WEB_API);

		webApiCredentialsEClass = createEClass(WEB_API_CREDENTIALS);
		createEAttribute(webApiCredentialsEClass, WEB_API_CREDENTIALS__NAME);

		messageQueueCredentialsEClass = createEClass(MESSAGE_QUEUE_CREDENTIALS);

		databaseCredentialsEClass = createEClass(DATABASE_CREDENTIALS);

		blockStorageCredentialsEClass = createEClass(BLOCK_STORAGE_CREDENTIALS);

		ftpEClass = createEClass(FTP);

		sftpEClass = createEClass(SFTP);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		blockStorageEClass.getESuperTypes().add(this.getInputDataSource());
		databaseEClass.getESuperTypes().add(this.getInputDataSource());
		messageQueueEClass.getESuperTypes().add(this.getInputDataSource());
		webApiEClass.getESuperTypes().add(this.getInputDataSource());
		webApiCredentialsEClass.getESuperTypes().add(this.getDataSourceCredentials());
		messageQueueCredentialsEClass.getESuperTypes().add(this.getDataSourceCredentials());
		databaseCredentialsEClass.getESuperTypes().add(this.getDataSourceCredentials());
		blockStorageCredentialsEClass.getESuperTypes().add(this.getDataSourceCredentials());
		ftpEClass.getESuperTypes().add(this.getInputDataSource());
		sftpEClass.getESuperTypes().add(this.getFTP());

		// Initialize classes, features, and operations; add parameters
		initEClass(inputDataSourceEClass, InputDataSource.class, "InputDataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputDataSource_Value(), this.getParameterValueTypes(), null, "value", null, 0, 1, InputDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputDataSource_Datasourcecredentials(), this.getDataSourceCredentials(), null, "datasourcecredentials", null, 1, 1, InputDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInputDataSource_Name(), ecorePackage.getEString(), "name", null, 0, 1, InputDataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterValueTypesEClass, ParameterValueTypes.class, "ParameterValueTypes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataSourceCredentialsEClass, DataSourceCredentials.class, "DataSourceCredentials", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockStorageEClass, BlockStorage.class, "BlockStorage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databaseEClass, Database.class, "Database", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageQueueEClass, MessageQueue.class, "MessageQueue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(webApiEClass, WebApi.class, "WebApi", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(webApiCredentialsEClass, WebApiCredentials.class, "WebApiCredentials", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebApiCredentials_Name(), ecorePackage.getEString(), "name", null, 0, 1, WebApiCredentials.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageQueueCredentialsEClass, MessageQueueCredentials.class, "MessageQueueCredentials", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(databaseCredentialsEClass, DatabaseCredentials.class, "DatabaseCredentials", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blockStorageCredentialsEClass, BlockStorageCredentials.class, "BlockStorageCredentials", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ftpEClass, se.kth.datacloud.dsl.DataSourceParameters.FTP.class, "FTP", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sftpEClass, se.kth.datacloud.dsl.DataSourceParameters.SFTP.class, "SFTP", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DataSourceParametersPackageImpl
