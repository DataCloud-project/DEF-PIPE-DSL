/**
 */
package se.kth.datacloud.dsl.ControlParameters;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersFactory
 * @model kind="package"
 * @generated
 */
public interface ControlParametersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ControlParameters";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://datacloud.kth.se/dcdsl/ControlParameters";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ControlParameters";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlParametersPackage eINSTANCE = se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.AbstractConditionImpl <em>Abstract Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.AbstractConditionImpl
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getAbstractCondition()
	 * @generated
	 */
	int ABSTRACT_CONDITION = 10;

	/**
	 * The number of structural features of the '<em>Abstract Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONDITION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.ConditionImpl
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Comparator Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__COMPARATOR_OPERATOR = ABSTRACT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SOURCE = ABSTRACT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TARGET = ABSTRACT_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Processing Script Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__SOURCE_PROCESSING_SCRIPT_NAME = ABSTRACT_CONDITION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = ABSTRACT_CONDITION_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = ABSTRACT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.CompositeConditionImpl
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getCompositeCondition()
	 * @generated
	 */
	int COMPOSITE_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__CONDITIONS = ABSTRACT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__OPERATOR = ABSTRACT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_FEATURE_COUNT = ABSTRACT_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_OPERATION_COUNT = ABSTRACT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.PreConditionImpl <em>Pre Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.PreConditionImpl
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getPreCondition()
	 * @generated
	 */
	int PRE_CONDITION = 2;

	/**
	 * The feature id for the '<em><b>Condition Step List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__CONDITION_STEP_LIST = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Pre Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pre Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.PostConditionImpl <em>Post Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.PostConditionImpl
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getPostCondition()
	 * @generated
	 */
	int POST_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Condition Step List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION__CONDITION_STEP_LIST = 0;

	/**
	 * The number of structural features of the '<em>Post Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Post Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POST_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.ConditionStepPairImpl <em>Condition Step Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.ConditionStepPairImpl
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getConditionStepPair()
	 * @generated
	 */
	int CONDITION_STEP_PAIR = 4;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_STEP_PAIR__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Step</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_STEP_PAIR__STEP = 1;

	/**
	 * The number of structural features of the '<em>Condition Step Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_STEP_PAIR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition Step Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_STEP_PAIR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.LoopImpl
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 7;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.WhileLooopImpl <em>While Looop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.WhileLooopImpl
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getWhileLooop()
	 * @generated
	 */
	int WHILE_LOOOP = 5;

	/**
	 * The feature id for the '<em><b>At Least Once</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOOP__AT_LEAST_ONCE = LOOP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOOP__CONDITION = LOOP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>While Looop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOOP_FEATURE_COUNT = LOOP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>While Looop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHILE_LOOOP_OPERATION_COUNT = LOOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.ForLoopImpl <em>For Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.ForLoopImpl
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getForLoop()
	 * @generated
	 */
	int FOR_LOOP = 6;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__FROM = LOOP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__TO = LOOP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Step Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__STEP_SIZE = LOOP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP__OPERATOR = LOOP_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>For Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_FEATURE_COUNT = LOOP_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>For Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOR_LOOP_OPERATION_COUNT = LOOP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.ConditionSetImpl <em>Condition Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.ConditionSetImpl
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getConditionSet()
	 * @generated
	 */
	int CONDITION_SET = 8;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_SET__PRE = 0;

	/**
	 * The feature id for the '<em><b>Post</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_SET__POST = 1;

	/**
	 * The number of structural features of the '<em>Condition Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.ControlParemeterImpl <em>Control Paremeter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParemeterImpl
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getControlParemeter()
	 * @generated
	 */
	int CONTROL_PAREMETER = 9;

	/**
	 * The feature id for the '<em><b>Loop</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PAREMETER__LOOP = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PAREMETER__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Control Paremeter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PAREMETER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Control Paremeter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_PAREMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ControlParameters.OperatorType <em>Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ControlParameters.OperatorType
	 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getOperatorType()
	 * @generated
	 */
	int OPERATOR_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ControlParameters.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ControlParameters.Condition#getComparatorOperator <em>Comparator Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparator Operator</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.Condition#getComparatorOperator()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_ComparatorOperator();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ControlParameters.Condition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.Condition#getSource()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Source();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ControlParameters.Condition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.Condition#getTarget()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Target();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ControlParameters.Condition#getSourceProcessingScriptName <em>Source Processing Script Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Processing Script Name</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.Condition#getSourceProcessingScriptName()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_SourceProcessingScriptName();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ControlParameters.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Condition</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.CompositeCondition
	 * @generated
	 */
	EClass getCompositeCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link se.kth.datacloud.dsl.ControlParameters.CompositeCondition#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.CompositeCondition#getConditions()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EReference getCompositeCondition_Conditions();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ControlParameters.CompositeCondition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.CompositeCondition#getOperator()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EAttribute getCompositeCondition_Operator();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ControlParameters.PreCondition <em>Pre Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Condition</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.PreCondition
	 * @generated
	 */
	EClass getPreCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link se.kth.datacloud.dsl.ControlParameters.PreCondition#getConditionStepList <em>Condition Step List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition Step List</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.PreCondition#getConditionStepList()
	 * @see #getPreCondition()
	 * @generated
	 */
	EReference getPreCondition_ConditionStepList();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ControlParameters.PreCondition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.PreCondition#getType()
	 * @see #getPreCondition()
	 * @generated
	 */
	EAttribute getPreCondition_Type();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ControlParameters.PostCondition <em>Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Post Condition</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.PostCondition
	 * @generated
	 */
	EClass getPostCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link se.kth.datacloud.dsl.ControlParameters.PostCondition#getConditionStepList <em>Condition Step List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition Step List</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.PostCondition#getConditionStepList()
	 * @see #getPostCondition()
	 * @generated
	 */
	EReference getPostCondition_ConditionStepList();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ControlParameters.ConditionStepPair <em>Condition Step Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Step Pair</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.ConditionStepPair
	 * @generated
	 */
	EClass getConditionStepPair();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.ControlParameters.ConditionStepPair#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.ConditionStepPair#getCondition()
	 * @see #getConditionStepPair()
	 * @generated
	 */
	EReference getConditionStepPair_Condition();

	/**
	 * Returns the meta object for the reference '{@link se.kth.datacloud.dsl.ControlParameters.ConditionStepPair#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Step</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.ConditionStepPair#getStep()
	 * @see #getConditionStepPair()
	 * @generated
	 */
	EReference getConditionStepPair_Step();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ControlParameters.WhileLooop <em>While Looop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>While Looop</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.WhileLooop
	 * @generated
	 */
	EClass getWhileLooop();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ControlParameters.WhileLooop#isAtLeastOnce <em>At Least Once</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>At Least Once</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.WhileLooop#isAtLeastOnce()
	 * @see #getWhileLooop()
	 * @generated
	 */
	EAttribute getWhileLooop_AtLeastOnce();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.ControlParameters.WhileLooop#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.WhileLooop#getCondition()
	 * @see #getWhileLooop()
	 * @generated
	 */
	EReference getWhileLooop_Condition();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ControlParameters.ForLoop <em>For Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>For Loop</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.ForLoop
	 * @generated
	 */
	EClass getForLoop();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ControlParameters.ForLoop#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.ForLoop#getFrom()
	 * @see #getForLoop()
	 * @generated
	 */
	EAttribute getForLoop_From();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ControlParameters.ForLoop#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.ForLoop#getTo()
	 * @see #getForLoop()
	 * @generated
	 */
	EAttribute getForLoop_To();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ControlParameters.ForLoop#getStepSize <em>Step Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step Size</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.ForLoop#getStepSize()
	 * @see #getForLoop()
	 * @generated
	 */
	EAttribute getForLoop_StepSize();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ControlParameters.ForLoop#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.ForLoop#getOperator()
	 * @see #getForLoop()
	 * @generated
	 */
	EAttribute getForLoop_Operator();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ControlParameters.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ControlParameters.ConditionSet <em>Condition Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Set</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.ConditionSet
	 * @generated
	 */
	EClass getConditionSet();

	/**
	 * Returns the meta object for the reference '{@link se.kth.datacloud.dsl.ControlParameters.ConditionSet#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pre</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.ConditionSet#getPre()
	 * @see #getConditionSet()
	 * @generated
	 */
	EReference getConditionSet_Pre();

	/**
	 * Returns the meta object for the reference '{@link se.kth.datacloud.dsl.ControlParameters.ConditionSet#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Post</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.ConditionSet#getPost()
	 * @see #getConditionSet()
	 * @generated
	 */
	EReference getConditionSet_Post();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ControlParameters.ControlParemeter <em>Control Paremeter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Paremeter</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParemeter
	 * @generated
	 */
	EClass getControlParemeter();

	/**
	 * Returns the meta object for the reference '{@link se.kth.datacloud.dsl.ControlParameters.ControlParemeter#getLoop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Loop</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParemeter#getLoop()
	 * @see #getControlParemeter()
	 * @generated
	 */
	EReference getControlParemeter_Loop();

	/**
	 * Returns the meta object for the reference '{@link se.kth.datacloud.dsl.ControlParameters.ControlParemeter#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParemeter#getCondition()
	 * @see #getControlParemeter()
	 * @generated
	 */
	EReference getControlParemeter_Condition();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ControlParameters.AbstractCondition <em>Abstract Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Condition</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.AbstractCondition
	 * @generated
	 */
	EClass getAbstractCondition();

	/**
	 * Returns the meta object for enum '{@link se.kth.datacloud.dsl.ControlParameters.OperatorType <em>Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Type</em>'.
	 * @see se.kth.datacloud.dsl.ControlParameters.OperatorType
	 * @generated
	 */
	EEnum getOperatorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ControlParametersFactory getControlParametersFactory();

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
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.ConditionImpl
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Comparator Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__COMPARATOR_OPERATOR = eINSTANCE.getCondition_ComparatorOperator();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__SOURCE = eINSTANCE.getCondition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__TARGET = eINSTANCE.getCondition_Target();

		/**
		 * The meta object literal for the '<em><b>Source Processing Script Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__SOURCE_PROCESSING_SCRIPT_NAME = eINSTANCE.getCondition_SourceProcessingScriptName();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.CompositeConditionImpl
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getCompositeCondition()
		 * @generated
		 */
		EClass COMPOSITE_CONDITION = eINSTANCE.getCompositeCondition();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONDITION__CONDITIONS = eINSTANCE.getCompositeCondition_Conditions();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_CONDITION__OPERATOR = eINSTANCE.getCompositeCondition_Operator();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.PreConditionImpl <em>Pre Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.PreConditionImpl
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getPreCondition()
		 * @generated
		 */
		EClass PRE_CONDITION = eINSTANCE.getPreCondition();

		/**
		 * The meta object literal for the '<em><b>Condition Step List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONDITION__CONDITION_STEP_LIST = eINSTANCE.getPreCondition_ConditionStepList();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_CONDITION__TYPE = eINSTANCE.getPreCondition_Type();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.PostConditionImpl <em>Post Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.PostConditionImpl
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getPostCondition()
		 * @generated
		 */
		EClass POST_CONDITION = eINSTANCE.getPostCondition();

		/**
		 * The meta object literal for the '<em><b>Condition Step List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POST_CONDITION__CONDITION_STEP_LIST = eINSTANCE.getPostCondition_ConditionStepList();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.ConditionStepPairImpl <em>Condition Step Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.ConditionStepPairImpl
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getConditionStepPair()
		 * @generated
		 */
		EClass CONDITION_STEP_PAIR = eINSTANCE.getConditionStepPair();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_STEP_PAIR__CONDITION = eINSTANCE.getConditionStepPair_Condition();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_STEP_PAIR__STEP = eINSTANCE.getConditionStepPair_Step();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.WhileLooopImpl <em>While Looop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.WhileLooopImpl
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getWhileLooop()
		 * @generated
		 */
		EClass WHILE_LOOOP = eINSTANCE.getWhileLooop();

		/**
		 * The meta object literal for the '<em><b>At Least Once</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHILE_LOOOP__AT_LEAST_ONCE = eINSTANCE.getWhileLooop_AtLeastOnce();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHILE_LOOOP__CONDITION = eINSTANCE.getWhileLooop_Condition();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.ForLoopImpl <em>For Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.ForLoopImpl
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getForLoop()
		 * @generated
		 */
		EClass FOR_LOOP = eINSTANCE.getForLoop();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_LOOP__FROM = eINSTANCE.getForLoop_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_LOOP__TO = eINSTANCE.getForLoop_To();

		/**
		 * The meta object literal for the '<em><b>Step Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_LOOP__STEP_SIZE = eINSTANCE.getForLoop_StepSize();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOR_LOOP__OPERATOR = eINSTANCE.getForLoop_Operator();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.LoopImpl
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.ConditionSetImpl <em>Condition Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.ConditionSetImpl
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getConditionSet()
		 * @generated
		 */
		EClass CONDITION_SET = eINSTANCE.getConditionSet();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_SET__PRE = eINSTANCE.getConditionSet_Pre();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_SET__POST = eINSTANCE.getConditionSet_Post();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.ControlParemeterImpl <em>Control Paremeter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParemeterImpl
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getControlParemeter()
		 * @generated
		 */
		EClass CONTROL_PAREMETER = eINSTANCE.getControlParemeter();

		/**
		 * The meta object literal for the '<em><b>Loop</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_PAREMETER__LOOP = eINSTANCE.getControlParemeter_Loop();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_PAREMETER__CONDITION = eINSTANCE.getControlParemeter_Condition();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ControlParameters.impl.AbstractConditionImpl <em>Abstract Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.AbstractConditionImpl
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getAbstractCondition()
		 * @generated
		 */
		EClass ABSTRACT_CONDITION = eINSTANCE.getAbstractCondition();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ControlParameters.OperatorType <em>Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ControlParameters.OperatorType
		 * @see se.kth.datacloud.dsl.ControlParameters.impl.ControlParametersPackageImpl#getOperatorType()
		 * @generated
		 */
		EEnum OPERATOR_TYPE = eINSTANCE.getOperatorType();

	}

} //ControlParametersPackage
