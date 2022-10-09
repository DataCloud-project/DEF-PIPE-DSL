/**
 */
package se.kth.datacloud.dsl.dsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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

import se.kth.datacloud.dsl.Triggers.TriggersPackage;

import se.kth.datacloud.dsl.Triggers.impl.TriggersPackageImpl;

import se.kth.datacloud.dsl.dsl.AbstractStep;
import se.kth.datacloud.dsl.dsl.CommunicationMedium;
import se.kth.datacloud.dsl.dsl.CommunicationMediumTypes;
import se.kth.datacloud.dsl.dsl.ComparisonOperatorType;
import se.kth.datacloud.dsl.dsl.CompositeStep;
import se.kth.datacloud.dsl.dsl.ContainerImplementation;
import se.kth.datacloud.dsl.dsl.DataProcesssing;
import se.kth.datacloud.dsl.dsl.DataSink;
import se.kth.datacloud.dsl.dsl.DataSource;
import se.kth.datacloud.dsl.dsl.DeploymentLayers;
import se.kth.datacloud.dsl.dsl.DslFactory;
import se.kth.datacloud.dsl.dsl.DslPackage;
import se.kth.datacloud.dsl.dsl.LogicalOperatorType;
import se.kth.datacloud.dsl.dsl.Parameter;
import se.kth.datacloud.dsl.dsl.ParameterGroup;
import se.kth.datacloud.dsl.dsl.Pipeline;
import se.kth.datacloud.dsl.dsl.StepImplementation;
import se.kth.datacloud.dsl.dsl.StepTemplate;
import se.kth.datacloud.dsl.dsl.TimeUnits;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslPackageImpl extends EPackageImpl implements DslPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pipelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationMediumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataProcesssingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationMediumTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timeUnitsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deploymentLayersEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOperatorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum comparisonOperatorTypeEEnum = null;

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
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DslPackageImpl() {
		super(eNS_URI, DslFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DslPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DslPackage init() {
		if (isInited) return (DslPackage)EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDslPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DslPackageImpl theDslPackage = registeredDslPackage instanceof DslPackageImpl ? (DslPackageImpl)registeredDslPackage : new DslPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnvironmentVariablesPackage.eNS_URI);
		EnvironmentVariablesPackageImpl theEnvironmentVariablesPackage = (EnvironmentVariablesPackageImpl)(registeredPackage instanceof EnvironmentVariablesPackageImpl ? registeredPackage : EnvironmentVariablesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
		TriggersPackageImpl theTriggersPackage = (TriggersPackageImpl)(registeredPackage instanceof TriggersPackageImpl ? registeredPackage : TriggersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ControlParametersPackage.eNS_URI);
		ControlParametersPackageImpl theControlParametersPackage = (ControlParametersPackageImpl)(registeredPackage instanceof ControlParametersPackageImpl ? registeredPackage : ControlParametersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExecutionRequirementsPackage.eNS_URI);
		ExecutionRequirementsPackageImpl theExecutionRequirementsPackage = (ExecutionRequirementsPackageImpl)(registeredPackage instanceof ExecutionRequirementsPackageImpl ? registeredPackage : ExecutionRequirementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourceProvidersPackage.eNS_URI);
		ResourceProvidersPackageImpl theResourceProvidersPackage = (ResourceProvidersPackageImpl)(registeredPackage instanceof ResourceProvidersPackageImpl ? registeredPackage : ResourceProvidersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataSourceParametersPackage.eNS_URI);
		DataSourceParametersPackageImpl theDataSourceParametersPackage = (DataSourceParametersPackageImpl)(registeredPackage instanceof DataSourceParametersPackageImpl ? registeredPackage : DataSourceParametersPackage.eINSTANCE);

		// Create package meta-data objects
		theDslPackage.createPackageContents();
		theEnvironmentVariablesPackage.createPackageContents();
		theTriggersPackage.createPackageContents();
		theControlParametersPackage.createPackageContents();
		theExecutionRequirementsPackage.createPackageContents();
		theResourceProvidersPackage.createPackageContents();
		theDataSourceParametersPackage.createPackageContents();

		// Initialize created meta-data
		theDslPackage.initializePackageContents();
		theEnvironmentVariablesPackage.initializePackageContents();
		theTriggersPackage.initializePackageContents();
		theControlParametersPackage.initializePackageContents();
		theExecutionRequirementsPackage.initializePackageContents();
		theResourceProvidersPackage.initializePackageContents();
		theDataSourceParametersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDslPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DslPackage.eNS_URI, theDslPackage);
		return theDslPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPipeline() {
		return pipelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPipeline_Name() {
		return (EAttribute)pipelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipeline_Steps() {
		return (EReference)pipelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipeline_CommunicationMedium() {
		return (EReference)pipelineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPipeline_EnvironmentVariables() {
		return (EReference)pipelineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractStep() {
		return abstractStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractStep_Name() {
		return (EAttribute)abstractStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStep_Triggers() {
		return (EReference)abstractStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStep_Previous() {
		return (EReference)abstractStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStep_ControlParemeter() {
		return (EReference)abstractStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStep_ExecutionRequirementSet() {
		return (EReference)abstractStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStep_ResourceProvider() {
		return (EReference)abstractStepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStep_EnvironmentVariables() {
		return (EReference)abstractStepEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractStep_Implementation() {
		return (EReference)abstractStepEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationMedium() {
		return communicationMediumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationMedium_Type() {
		return (EAttribute)communicationMediumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepImplementation() {
		return stepImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerImplementation() {
		return containerImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerImplementation_ImageName() {
		return (EAttribute)containerImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeStep() {
		return compositeStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeStep_Steps() {
		return (EReference)compositeStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStepTemplate() {
		return stepTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterGroup() {
		return parameterGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterGroup_Parameter() {
		return (EReference)parameterGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterGroup_ParameterOperator() {
		return (EAttribute)parameterGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataProcesssing() {
		return dataProcesssingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSource() {
		return dataSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSource_DataSource() {
		return (EReference)dataSourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSink() {
		return dataSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSink_DataTarget() {
		return (EReference)dataSinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommunicationMediumTypes() {
		return communicationMediumTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimeUnits() {
		return timeUnitsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeploymentLayers() {
		return deploymentLayersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalOperatorType() {
		return logicalOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComparisonOperatorType() {
		return comparisonOperatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslFactory getDslFactory() {
		return (DslFactory)getEFactoryInstance();
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
		pipelineEClass = createEClass(PIPELINE);
		createEAttribute(pipelineEClass, PIPELINE__NAME);
		createEReference(pipelineEClass, PIPELINE__STEPS);
		createEReference(pipelineEClass, PIPELINE__COMMUNICATION_MEDIUM);
		createEReference(pipelineEClass, PIPELINE__ENVIRONMENT_VARIABLES);

		abstractStepEClass = createEClass(ABSTRACT_STEP);
		createEAttribute(abstractStepEClass, ABSTRACT_STEP__NAME);
		createEReference(abstractStepEClass, ABSTRACT_STEP__TRIGGERS);
		createEReference(abstractStepEClass, ABSTRACT_STEP__PREVIOUS);
		createEReference(abstractStepEClass, ABSTRACT_STEP__CONTROL_PAREMETER);
		createEReference(abstractStepEClass, ABSTRACT_STEP__EXECUTION_REQUIREMENT_SET);
		createEReference(abstractStepEClass, ABSTRACT_STEP__RESOURCE_PROVIDER);
		createEReference(abstractStepEClass, ABSTRACT_STEP__ENVIRONMENT_VARIABLES);
		createEReference(abstractStepEClass, ABSTRACT_STEP__IMPLEMENTATION);

		communicationMediumEClass = createEClass(COMMUNICATION_MEDIUM);
		createEAttribute(communicationMediumEClass, COMMUNICATION_MEDIUM__TYPE);

		stepImplementationEClass = createEClass(STEP_IMPLEMENTATION);

		containerImplementationEClass = createEClass(CONTAINER_IMPLEMENTATION);
		createEAttribute(containerImplementationEClass, CONTAINER_IMPLEMENTATION__IMAGE_NAME);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);

		compositeStepEClass = createEClass(COMPOSITE_STEP);
		createEReference(compositeStepEClass, COMPOSITE_STEP__STEPS);

		stepTemplateEClass = createEClass(STEP_TEMPLATE);

		parameterGroupEClass = createEClass(PARAMETER_GROUP);
		createEReference(parameterGroupEClass, PARAMETER_GROUP__PARAMETER);
		createEAttribute(parameterGroupEClass, PARAMETER_GROUP__PARAMETER_OPERATOR);

		dataProcesssingEClass = createEClass(DATA_PROCESSSING);

		dataSourceEClass = createEClass(DATA_SOURCE);
		createEReference(dataSourceEClass, DATA_SOURCE__DATA_SOURCE);

		dataSinkEClass = createEClass(DATA_SINK);
		createEReference(dataSinkEClass, DATA_SINK__DATA_TARGET);

		// Create enums
		communicationMediumTypesEEnum = createEEnum(COMMUNICATION_MEDIUM_TYPES);
		timeUnitsEEnum = createEEnum(TIME_UNITS);
		deploymentLayersEEnum = createEEnum(DEPLOYMENT_LAYERS);
		logicalOperatorTypeEEnum = createEEnum(LOGICAL_OPERATOR_TYPE);
		comparisonOperatorTypeEEnum = createEEnum(COMPARISON_OPERATOR_TYPE);
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
		EnvironmentVariablesPackage theEnvironmentVariablesPackage = (EnvironmentVariablesPackage)EPackage.Registry.INSTANCE.getEPackage(EnvironmentVariablesPackage.eNS_URI);
		TriggersPackage theTriggersPackage = (TriggersPackage)EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
		ControlParametersPackage theControlParametersPackage = (ControlParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ControlParametersPackage.eNS_URI);
		ExecutionRequirementsPackage theExecutionRequirementsPackage = (ExecutionRequirementsPackage)EPackage.Registry.INSTANCE.getEPackage(ExecutionRequirementsPackage.eNS_URI);
		ResourceProvidersPackage theResourceProvidersPackage = (ResourceProvidersPackage)EPackage.Registry.INSTANCE.getEPackage(ResourceProvidersPackage.eNS_URI);
		DataSourceParametersPackage theDataSourceParametersPackage = (DataSourceParametersPackage)EPackage.Registry.INSTANCE.getEPackage(DataSourceParametersPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		containerImplementationEClass.getESuperTypes().add(this.getStepImplementation());
		compositeStepEClass.getESuperTypes().add(this.getAbstractStep());
		stepTemplateEClass.getESuperTypes().add(this.getAbstractStep());
		dataProcesssingEClass.getESuperTypes().add(this.getStepTemplate());
		dataSourceEClass.getESuperTypes().add(this.getStepTemplate());
		dataSinkEClass.getESuperTypes().add(this.getStepTemplate());

		// Initialize classes, features, and operations; add parameters
		initEClass(pipelineEClass, Pipeline.class, "Pipeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPipeline_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_Steps(), this.getAbstractStep(), null, "steps", null, 1, -1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_CommunicationMedium(), this.getCommunicationMedium(), null, "communicationMedium", null, 0, 1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPipeline_EnvironmentVariables(), theEnvironmentVariablesPackage.getEnvironmentVariable(), null, "environmentVariables", null, 0, -1, Pipeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractStepEClass, AbstractStep.class, "AbstractStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractStep_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStep_Triggers(), theTriggersPackage.getTrigger(), null, "triggers", null, 0, -1, AbstractStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStep_Previous(), this.getAbstractStep(), null, "previous", null, 0, -1, AbstractStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStep_ControlParemeter(), theControlParametersPackage.getControlParemeter(), null, "controlParemeter", null, 1, 1, AbstractStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStep_ExecutionRequirementSet(), theExecutionRequirementsPackage.getExecutionRequirementSet(), null, "executionRequirementSet", null, 0, 1, AbstractStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStep_ResourceProvider(), theResourceProvidersPackage.getResourceProvider(), null, "resourceProvider", null, 1, -1, AbstractStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStep_EnvironmentVariables(), theEnvironmentVariablesPackage.getEnvironmentVariable(), null, "environmentVariables", null, 0, -1, AbstractStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractStep_Implementation(), this.getStepImplementation(), null, "implementation", null, 0, 1, AbstractStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationMediumEClass, CommunicationMedium.class, "CommunicationMedium", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationMedium_Type(), this.getCommunicationMediumTypes(), "type", null, 0, 1, CommunicationMedium.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepImplementationEClass, StepImplementation.class, "StepImplementation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerImplementationEClass, ContainerImplementation.class, "ContainerImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerImplementation_ImageName(), ecorePackage.getEString(), "imageName", null, 0, 1, ContainerImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeStepEClass, CompositeStep.class, "CompositeStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeStep_Steps(), this.getAbstractStep(), null, "steps", null, 1, -1, CompositeStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stepTemplateEClass, StepTemplate.class, "StepTemplate", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterGroupEClass, ParameterGroup.class, "ParameterGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterGroup_Parameter(), this.getParameter(), null, "parameter", null, 0, -1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterGroup_ParameterOperator(), this.getLogicalOperatorType(), "parameterOperator", "AND", 0, 1, ParameterGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataProcesssingEClass, DataProcesssing.class, "DataProcesssing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataSourceEClass, DataSource.class, "DataSource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSource_DataSource(), theDataSourceParametersPackage.getInputDataSource(), null, "dataSource", null, 0, 1, DataSource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataSinkEClass, DataSink.class, "DataSink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSink_DataTarget(), theDataSourceParametersPackage.getInputDataSource(), null, "dataTarget", null, 0, 1, DataSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(communicationMediumTypesEEnum, CommunicationMediumTypes.class, "CommunicationMediumTypes");
		addEEnumLiteral(communicationMediumTypesEEnum, CommunicationMediumTypes.MESSAGE_QUEUE);
		addEEnumLiteral(communicationMediumTypesEEnum, CommunicationMediumTypes.DISTRIBUTED_FILE_SYSTEM);
		addEEnumLiteral(communicationMediumTypesEEnum, CommunicationMediumTypes.WEB_SERVICE);

		initEEnum(timeUnitsEEnum, TimeUnits.class, "TimeUnits");
		addEEnumLiteral(timeUnitsEEnum, TimeUnits.SECOND);
		addEEnumLiteral(timeUnitsEEnum, TimeUnits.MINUTE);
		addEEnumLiteral(timeUnitsEEnum, TimeUnits.HOUR);
		addEEnumLiteral(timeUnitsEEnum, TimeUnits.DAY);
		addEEnumLiteral(timeUnitsEEnum, TimeUnits.WEEK);
		addEEnumLiteral(timeUnitsEEnum, TimeUnits.MONTH);

		initEEnum(deploymentLayersEEnum, DeploymentLayers.class, "DeploymentLayers");
		addEEnumLiteral(deploymentLayersEEnum, DeploymentLayers.EDGE);
		addEEnumLiteral(deploymentLayersEEnum, DeploymentLayers.FOG);
		addEEnumLiteral(deploymentLayersEEnum, DeploymentLayers.CLOUD);

		initEEnum(logicalOperatorTypeEEnum, LogicalOperatorType.class, "LogicalOperatorType");
		addEEnumLiteral(logicalOperatorTypeEEnum, LogicalOperatorType.AND);
		addEEnumLiteral(logicalOperatorTypeEEnum, LogicalOperatorType.XOR);
		addEEnumLiteral(logicalOperatorTypeEEnum, LogicalOperatorType.OR);

		initEEnum(comparisonOperatorTypeEEnum, ComparisonOperatorType.class, "ComparisonOperatorType");
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.EQUAL);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.LESS_THAN);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.GREATER_THAN);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.NOT_EQUAL);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.EQUAL_LESS_THAN);
		addEEnumLiteral(comparisonOperatorTypeEEnum, ComparisonOperatorType.EQUAL_GREATER_THAN);

		// Create resource
		createResource(eNS_URI);
	}

} //DslPackageImpl
