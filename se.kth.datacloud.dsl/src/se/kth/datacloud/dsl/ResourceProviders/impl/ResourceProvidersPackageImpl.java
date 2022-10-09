/**
 */
package se.kth.datacloud.dsl.ResourceProviders.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage;

import se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl;

import se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersPackage;

import se.kth.datacloud.dsl.DataSourceParameters.impl.DataSourceParametersPackageImpl;

import se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariablesPackage;

import se.kth.datacloud.dsl.EnvironmentVariables.impl.EnvironmentVariablesPackageImpl;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage;

import se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl;

import se.kth.datacloud.dsl.ResourceProviders.CloudProvider;
import se.kth.datacloud.dsl.ResourceProviders.EdgeProvider;
import se.kth.datacloud.dsl.ResourceProviders.FogProvider;
import se.kth.datacloud.dsl.ResourceProviders.ResourceProvider;
import se.kth.datacloud.dsl.ResourceProviders.ResourceProvidersFactory;
import se.kth.datacloud.dsl.ResourceProviders.ResourceProvidersPackage;

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
public class ResourceProvidersPackageImpl extends EPackageImpl implements ResourceProvidersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fogProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass edgeProviderEClass = null;

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
	 * @see se.kth.datacloud.dsl.ResourceProviders.ResourceProvidersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ResourceProvidersPackageImpl() {
		super(eNS_URI, ResourceProvidersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ResourceProvidersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ResourceProvidersPackage init() {
		if (isInited) return (ResourceProvidersPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceProvidersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredResourceProvidersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ResourceProvidersPackageImpl theResourceProvidersPackage = registeredResourceProvidersPackage instanceof ResourceProvidersPackageImpl ? (ResourceProvidersPackageImpl)registeredResourceProvidersPackage : new ResourceProvidersPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataSourceParametersPackage.eNS_URI);
		DataSourceParametersPackageImpl theDataSourceParametersPackage = (DataSourceParametersPackageImpl)(registeredPackage instanceof DataSourceParametersPackageImpl ? registeredPackage : DataSourceParametersPackage.eINSTANCE);

		// Create package meta-data objects
		theResourceProvidersPackage.createPackageContents();
		theDslPackage.createPackageContents();
		theEnvironmentVariablesPackage.createPackageContents();
		theTriggersPackage.createPackageContents();
		theControlParametersPackage.createPackageContents();
		theExecutionRequirementsPackage.createPackageContents();
		theDataSourceParametersPackage.createPackageContents();

		// Initialize created meta-data
		theResourceProvidersPackage.initializePackageContents();
		theDslPackage.initializePackageContents();
		theEnvironmentVariablesPackage.initializePackageContents();
		theTriggersPackage.initializePackageContents();
		theControlParametersPackage.initializePackageContents();
		theExecutionRequirementsPackage.initializePackageContents();
		theDataSourceParametersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theResourceProvidersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ResourceProvidersPackage.eNS_URI, theResourceProvidersPackage);
		return theResourceProvidersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceProvider() {
		return resourceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceProvider_ProviderName() {
		return (EAttribute)resourceProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceProvider_Location() {
		return (EAttribute)resourceProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudProvider() {
		return cloudProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFogProvider() {
		return fogProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEdgeProvider() {
		return edgeProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceProvidersFactory getResourceProvidersFactory() {
		return (ResourceProvidersFactory)getEFactoryInstance();
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
		resourceProviderEClass = createEClass(RESOURCE_PROVIDER);
		createEAttribute(resourceProviderEClass, RESOURCE_PROVIDER__PROVIDER_NAME);
		createEAttribute(resourceProviderEClass, RESOURCE_PROVIDER__LOCATION);

		cloudProviderEClass = createEClass(CLOUD_PROVIDER);

		fogProviderEClass = createEClass(FOG_PROVIDER);

		edgeProviderEClass = createEClass(EDGE_PROVIDER);
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
		cloudProviderEClass.getESuperTypes().add(this.getResourceProvider());
		fogProviderEClass.getESuperTypes().add(this.getResourceProvider());
		edgeProviderEClass.getESuperTypes().add(this.getResourceProvider());

		// Initialize classes, features, and operations; add parameters
		initEClass(resourceProviderEClass, ResourceProvider.class, "ResourceProvider", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResourceProvider_ProviderName(), ecorePackage.getEString(), "providerName", null, 0, 1, ResourceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResourceProvider_Location(), ecorePackage.getEString(), "location", null, 0, 1, ResourceProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudProviderEClass, CloudProvider.class, "CloudProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fogProviderEClass, FogProvider.class, "FogProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeProviderEClass, EdgeProvider.class, "EdgeProvider", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ResourceProvidersPackageImpl
