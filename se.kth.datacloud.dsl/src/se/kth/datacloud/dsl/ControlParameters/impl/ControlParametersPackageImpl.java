/**
 */
package se.kth.datacloud.dsl.ControlParameters.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import se.kth.datacloud.dsl.ControlParameters.AbstractCondition;
import se.kth.datacloud.dsl.ControlParameters.CompositeCondition;
import se.kth.datacloud.dsl.ControlParameters.Condition;
import se.kth.datacloud.dsl.ControlParameters.ConditionSet;
import se.kth.datacloud.dsl.ControlParameters.ConditionStepPair;
import se.kth.datacloud.dsl.ControlParameters.ControlParametersFactory;
import se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage;
import se.kth.datacloud.dsl.ControlParameters.ControlParemeter;
import se.kth.datacloud.dsl.ControlParameters.ForLoop;
import se.kth.datacloud.dsl.ControlParameters.Loop;
import se.kth.datacloud.dsl.ControlParameters.OperatorType;
import se.kth.datacloud.dsl.ControlParameters.PostCondition;
import se.kth.datacloud.dsl.ControlParameters.PreCondition;
import se.kth.datacloud.dsl.ControlParameters.WhileLooop;

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

import se.kth.datacloud.dsl.dsl.DslPackage;

import se.kth.datacloud.dsl.dsl.impl.DslPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlParametersPackageImpl extends EPackageImpl implements ControlParametersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass preConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionStepPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileLooopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlParemeterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorTypeEEnum = null;

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
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ControlParametersPackageImpl() {
		super(eNS_URI, ControlParametersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ControlParametersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ControlParametersPackage init() {
		if (isInited) return (ControlParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ControlParametersPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredControlParametersPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ControlParametersPackageImpl theControlParametersPackage = registeredControlParametersPackage instanceof ControlParametersPackageImpl ? (ControlParametersPackageImpl)registeredControlParametersPackage : new ControlParametersPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DslPackage.eNS_URI);
		DslPackageImpl theDslPackage = (DslPackageImpl)(registeredPackage instanceof DslPackageImpl ? registeredPackage : DslPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(EnvironmentVariablesPackage.eNS_URI);
		EnvironmentVariablesPackageImpl theEnvironmentVariablesPackage = (EnvironmentVariablesPackageImpl)(registeredPackage instanceof EnvironmentVariablesPackageImpl ? registeredPackage : EnvironmentVariablesPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TriggersPackage.eNS_URI);
		TriggersPackageImpl theTriggersPackage = (TriggersPackageImpl)(registeredPackage instanceof TriggersPackageImpl ? registeredPackage : TriggersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ExecutionRequirementsPackage.eNS_URI);
		ExecutionRequirementsPackageImpl theExecutionRequirementsPackage = (ExecutionRequirementsPackageImpl)(registeredPackage instanceof ExecutionRequirementsPackageImpl ? registeredPackage : ExecutionRequirementsPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourceProvidersPackage.eNS_URI);
		ResourceProvidersPackageImpl theResourceProvidersPackage = (ResourceProvidersPackageImpl)(registeredPackage instanceof ResourceProvidersPackageImpl ? registeredPackage : ResourceProvidersPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataSourceParametersPackage.eNS_URI);
		DataSourceParametersPackageImpl theDataSourceParametersPackage = (DataSourceParametersPackageImpl)(registeredPackage instanceof DataSourceParametersPackageImpl ? registeredPackage : DataSourceParametersPackage.eINSTANCE);

		// Create package meta-data objects
		theControlParametersPackage.createPackageContents();
		theDslPackage.createPackageContents();
		theEnvironmentVariablesPackage.createPackageContents();
		theTriggersPackage.createPackageContents();
		theExecutionRequirementsPackage.createPackageContents();
		theResourceProvidersPackage.createPackageContents();
		theDataSourceParametersPackage.createPackageContents();

		// Initialize created meta-data
		theControlParametersPackage.initializePackageContents();
		theDslPackage.initializePackageContents();
		theEnvironmentVariablesPackage.initializePackageContents();
		theTriggersPackage.initializePackageContents();
		theExecutionRequirementsPackage.initializePackageContents();
		theResourceProvidersPackage.initializePackageContents();
		theDataSourceParametersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theControlParametersPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ControlParametersPackage.eNS_URI, theControlParametersPackage);
		return theControlParametersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_ComparatorOperator() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Source() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Target() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_SourceProcessingScriptName() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeCondition() {
		return compositeConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeCondition_Conditions() {
		return (EReference)compositeConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeCondition_Operator() {
		return (EAttribute)compositeConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPreCondition() {
		return preConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPreCondition_ConditionStepList() {
		return (EReference)preConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPreCondition_Type() {
		return (EAttribute)preConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostCondition() {
		return postConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPostCondition_ConditionStepList() {
		return (EReference)postConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionStepPair() {
		return conditionStepPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionStepPair_Condition() {
		return (EReference)conditionStepPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionStepPair_Step() {
		return (EReference)conditionStepPairEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhileLooop() {
		return whileLooopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhileLooop_AtLeastOnce() {
		return (EAttribute)whileLooopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhileLooop_Condition() {
		return (EReference)whileLooopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForLoop() {
		return forLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForLoop_From() {
		return (EAttribute)forLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForLoop_To() {
		return (EAttribute)forLoopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForLoop_StepSize() {
		return (EAttribute)forLoopEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForLoop_Operator() {
		return (EAttribute)forLoopEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoop() {
		return loopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionSet() {
		return conditionSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionSet_Pre() {
		return (EReference)conditionSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionSet_Post() {
		return (EReference)conditionSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlParemeter() {
		return controlParemeterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlParemeter_Loop() {
		return (EReference)controlParemeterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControlParemeter_Condition() {
		return (EReference)controlParemeterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCondition() {
		return abstractConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOperatorType() {
		return operatorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlParametersFactory getControlParametersFactory() {
		return (ControlParametersFactory)getEFactoryInstance();
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
		conditionEClass = createEClass(CONDITION);
		createEAttribute(conditionEClass, CONDITION__COMPARATOR_OPERATOR);
		createEAttribute(conditionEClass, CONDITION__SOURCE);
		createEAttribute(conditionEClass, CONDITION__TARGET);
		createEAttribute(conditionEClass, CONDITION__SOURCE_PROCESSING_SCRIPT_NAME);

		compositeConditionEClass = createEClass(COMPOSITE_CONDITION);
		createEReference(compositeConditionEClass, COMPOSITE_CONDITION__CONDITIONS);
		createEAttribute(compositeConditionEClass, COMPOSITE_CONDITION__OPERATOR);

		preConditionEClass = createEClass(PRE_CONDITION);
		createEReference(preConditionEClass, PRE_CONDITION__CONDITION_STEP_LIST);
		createEAttribute(preConditionEClass, PRE_CONDITION__TYPE);

		postConditionEClass = createEClass(POST_CONDITION);
		createEReference(postConditionEClass, POST_CONDITION__CONDITION_STEP_LIST);

		conditionStepPairEClass = createEClass(CONDITION_STEP_PAIR);
		createEReference(conditionStepPairEClass, CONDITION_STEP_PAIR__CONDITION);
		createEReference(conditionStepPairEClass, CONDITION_STEP_PAIR__STEP);

		whileLooopEClass = createEClass(WHILE_LOOOP);
		createEAttribute(whileLooopEClass, WHILE_LOOOP__AT_LEAST_ONCE);
		createEReference(whileLooopEClass, WHILE_LOOOP__CONDITION);

		forLoopEClass = createEClass(FOR_LOOP);
		createEAttribute(forLoopEClass, FOR_LOOP__FROM);
		createEAttribute(forLoopEClass, FOR_LOOP__TO);
		createEAttribute(forLoopEClass, FOR_LOOP__STEP_SIZE);
		createEAttribute(forLoopEClass, FOR_LOOP__OPERATOR);

		loopEClass = createEClass(LOOP);

		conditionSetEClass = createEClass(CONDITION_SET);
		createEReference(conditionSetEClass, CONDITION_SET__PRE);
		createEReference(conditionSetEClass, CONDITION_SET__POST);

		controlParemeterEClass = createEClass(CONTROL_PAREMETER);
		createEReference(controlParemeterEClass, CONTROL_PAREMETER__LOOP);
		createEReference(controlParemeterEClass, CONTROL_PAREMETER__CONDITION);

		abstractConditionEClass = createEClass(ABSTRACT_CONDITION);

		// Create enums
		operatorTypeEEnum = createEEnum(OPERATOR_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		conditionEClass.getESuperTypes().add(this.getAbstractCondition());
		compositeConditionEClass.getESuperTypes().add(this.getAbstractCondition());
		whileLooopEClass.getESuperTypes().add(this.getLoop());
		forLoopEClass.getESuperTypes().add(this.getLoop());

		// Initialize classes, features, and operations; add parameters
		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCondition_ComparatorOperator(), theDslPackage.getComparisonOperatorType(), "comparatorOperator", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_Source(), ecorePackage.getEString(), "source", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_Target(), ecorePackage.getEString(), "target", "", 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_SourceProcessingScriptName(), ecorePackage.getEString(), "sourceProcessingScriptName", "None", 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeConditionEClass, CompositeCondition.class, "CompositeCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeCondition_Conditions(), this.getAbstractCondition(), null, "conditions", null, 0, -1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeCondition_Operator(), theDslPackage.getLogicalOperatorType(), "operator", null, 0, 1, CompositeCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(preConditionEClass, PreCondition.class, "PreCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPreCondition_ConditionStepList(), this.getConditionStepPair(), null, "conditionStepList", null, 1, -1, PreCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPreCondition_Type(), theDslPackage.getLogicalOperatorType(), "type", null, 0, 1, PreCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postConditionEClass, PostCondition.class, "PostCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPostCondition_ConditionStepList(), this.getConditionStepPair(), null, "conditionStepList", null, 1, -1, PostCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionStepPairEClass, ConditionStepPair.class, "ConditionStepPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionStepPair_Condition(), this.getAbstractCondition(), null, "condition", null, 0, 1, ConditionStepPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionStepPair_Step(), theDslPackage.getAbstractStep(), null, "step", null, 0, 1, ConditionStepPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whileLooopEClass, WhileLooop.class, "WhileLooop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhileLooop_AtLeastOnce(), ecorePackage.getEBoolean(), "atLeastOnce", "false", 0, 1, WhileLooop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhileLooop_Condition(), this.getAbstractCondition(), null, "condition", null, 0, 1, WhileLooop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forLoopEClass, ForLoop.class, "ForLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getForLoop_From(), ecorePackage.getEDouble(), "from", "0", 0, 1, ForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForLoop_To(), ecorePackage.getEDouble(), "to", "0", 0, 1, ForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForLoop_StepSize(), ecorePackage.getEInt(), "stepSize", "1", 0, 1, ForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getForLoop_Operator(), this.getOperatorType(), "operator", "INCREMENT", 0, 1, ForLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loopEClass, Loop.class, "Loop", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionSetEClass, ConditionSet.class, "ConditionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionSet_Pre(), this.getPreCondition(), null, "pre", null, 0, 1, ConditionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionSet_Post(), this.getPostCondition(), null, "post", null, 0, 1, ConditionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlParemeterEClass, ControlParemeter.class, "ControlParemeter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlParemeter_Loop(), this.getLoop(), null, "loop", null, 0, 1, ControlParemeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlParemeter_Condition(), this.getConditionSet(), null, "condition", null, 0, 1, ControlParemeter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractConditionEClass, AbstractCondition.class, "AbstractCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(operatorTypeEEnum, OperatorType.class, "OperatorType");
		addEEnumLiteral(operatorTypeEEnum, OperatorType.INCREMENT);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.DECREMENT);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.DIVISION);
		addEEnumLiteral(operatorTypeEEnum, OperatorType.MULTIPLY);

		// Create resource
		createResource(eNS_URI);
	}

} //ControlParametersPackageImpl
