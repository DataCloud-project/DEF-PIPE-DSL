/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements;

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
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsFactory
 * @model kind="package"
 * @generated
 */
public interface ExecutionRequirementsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ExecutionRequirements";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://datacloud.kth.se/dcdsl/ExecutionRequirements";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ExecutionRequirements";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExecutionRequirementsPackage eINSTANCE = se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementSetImpl <em>Execution Requirement Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementSetImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getExecutionRequirementSet()
	 * @generated
	 */
	int EXECUTION_REQUIREMENT_SET = 0;

	/**
	 * The feature id for the '<em><b>Service Level Objective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REQUIREMENT_SET__SERVICE_LEVEL_OBJECTIVE = 0;

	/**
	 * The feature id for the '<em><b>Security Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REQUIREMENT_SET__SECURITY_REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Horizontal Scale Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REQUIREMENT_SET__HORIZONTAL_SCALE_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Vertical Scale Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REQUIREMENT_SET__VERTICAL_SCALE_REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>Os Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REQUIREMENT_SET__OS_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Image Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REQUIREMENT_SET__IMAGE_REQUIREMENT = 5;

	/**
	 * The feature id for the '<em><b>Qualitative Hardware Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REQUIREMENT_SET__QUALITATIVE_HARDWARE_REQUIREMENT = 6;

	/**
	 * The feature id for the '<em><b>Quantitative Hardware Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REQUIREMENT_SET__QUANTITATIVE_HARDWARE_REQUIREMENT = 7;

	/**
	 * The feature id for the '<em><b>Network Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REQUIREMENT_SET__NETWORK_REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>Optimization Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REQUIREMENT_SET__OPTIMIZATION_REQUIREMENT = 9;

	/**
	 * The number of structural features of the '<em>Execution Requirement Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REQUIREMENT_SET_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Execution Requirement Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REQUIREMENT_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementImpl <em>Execution Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getExecutionRequirement()
	 * @generated
	 */
	int EXECUTION_REQUIREMENT = 19;

	/**
	 * The number of structural features of the '<em>Execution Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REQUIREMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Execution Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXECUTION_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.HardRequirementImpl <em>Hard Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.HardRequirementImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getHardRequirement()
	 * @generated
	 */
	int HARD_REQUIREMENT = 1;

	/**
	 * The number of structural features of the '<em>Hard Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_REQUIREMENT_FEATURE_COUNT = EXECUTION_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hard Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARD_REQUIREMENT_OPERATION_COUNT = EXECUTION_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.SoftRequirementImpl <em>Soft Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.SoftRequirementImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getSoftRequirement()
	 * @generated
	 */
	int SOFT_REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_REQUIREMENT__PRIORITY = EXECUTION_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Soft Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_REQUIREMENT_FEATURE_COUNT = EXECUTION_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Soft Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOFT_REQUIREMENT_OPERATION_COUNT = EXECUTION_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.MetricImpl <em>Metric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.MetricImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getMetric()
	 * @generated
	 */
	int METRIC = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Value Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__VALUE_DIRECTION = 1;

	/**
	 * The feature id for the '<em><b>Is Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC__IS_VARIABLE = 2;

	/**
	 * The number of structural features of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Metric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METRIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.OptimizationRequirementImpl <em>Optimization Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.OptimizationRequirementImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getOptimizationRequirement()
	 * @generated
	 */
	int OPTIMIZATION_REQUIREMENT = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_REQUIREMENT__PRIORITY = SOFT_REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Optimisation Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_REQUIREMENT__OPTIMISATION_FUNCTION = SOFT_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_REQUIREMENT__METRIC = SOFT_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Optimization Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_REQUIREMENT_FEATURE_COUNT = SOFT_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Optimization Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_REQUIREMENT_OPERATION_COUNT = SOFT_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.HardwareRequirementImpl <em>Hardware Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.HardwareRequirementImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getHardwareRequirement()
	 * @generated
	 */
	int HARDWARE_REQUIREMENT = 5;

	/**
	 * The number of structural features of the '<em>Hardware Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_REQUIREMENT_FEATURE_COUNT = HARD_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hardware Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARDWARE_REQUIREMENT_OPERATION_COUNT = HARD_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ServiceLevelConditionImpl <em>Service Level Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ServiceLevelConditionImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getServiceLevelCondition()
	 * @generated
	 */
	int SERVICE_LEVEL_CONDITION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_CONDITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Comparison Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_CONDITION__COMPARISON_OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_CONDITION__THRESHOLD = 2;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_CONDITION__VALIDITY = 3;

	/**
	 * The number of structural features of the '<em>Service Level Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_CONDITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service Level Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ScaleRequirementImpl <em>Scale Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ScaleRequirementImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getScaleRequirement()
	 * @generated
	 */
	int SCALE_REQUIREMENT = 13;

	/**
	 * The number of structural features of the '<em>Scale Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_REQUIREMENT_FEATURE_COUNT = HARD_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Scale Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_REQUIREMENT_OPERATION_COUNT = HARD_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.HorizontalScaleRequirementImpl <em>Horizontal Scale Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.HorizontalScaleRequirementImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getHorizontalScaleRequirement()
	 * @generated
	 */
	int HORIZONTAL_SCALE_REQUIREMENT = 7;

	/**
	 * The feature id for the '<em><b>Min Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_SCALE_REQUIREMENT__MIN_INSTANCE = SCALE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_SCALE_REQUIREMENT__MAX_INSTANCE = SCALE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Horizontal Scale Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_SCALE_REQUIREMENT_FEATURE_COUNT = SCALE_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Horizontal Scale Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HORIZONTAL_SCALE_REQUIREMENT_OPERATION_COUNT = SCALE_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.SecurityRequirementImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getSecurityRequirement()
	 * @generated
	 */
	int SECURITY_REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>Security Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__SECURITY_PARAMETERS = HARD_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT_FEATURE_COUNT = HARD_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT_OPERATION_COUNT = HARD_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.OSOrImageRequirementImpl <em>OS Or Image Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.OSOrImageRequirementImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getOSOrImageRequirement()
	 * @generated
	 */
	int OS_OR_IMAGE_REQUIREMENT = 14;

	/**
	 * The number of structural features of the '<em>OS Or Image Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_OR_IMAGE_REQUIREMENT_FEATURE_COUNT = HARD_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>OS Or Image Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_OR_IMAGE_REQUIREMENT_OPERATION_COUNT = HARD_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.OSRequirementImpl <em>OS Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.OSRequirementImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getOSRequirement()
	 * @generated
	 */
	int OS_REQUIREMENT = 9;

	/**
	 * The feature id for the '<em><b>Os Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_REQUIREMENT__OS_TYPE = OS_OR_IMAGE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is64os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_REQUIREMENT__IS64OS = OS_OR_IMAGE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>OS Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_REQUIREMENT_FEATURE_COUNT = OS_OR_IMAGE_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>OS Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OS_REQUIREMENT_OPERATION_COUNT = OS_OR_IMAGE_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ServiceLevelObjectiveImpl <em>Service Level Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ServiceLevelObjectiveImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getServiceLevelObjective()
	 * @generated
	 */
	int SERVICE_LEVEL_OBJECTIVE = 10;

	/**
	 * The feature id for the '<em><b>Custom Service Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL = HARD_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Level Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVE_FEATURE_COUNT = HARD_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Service Level Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_LEVEL_OBJECTIVE_OPERATION_COUNT = HARD_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.SecurityControlImpl <em>Security Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.SecurityControlImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getSecurityControl()
	 * @generated
	 */
	int SECURITY_CONTROL = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL__SPECIFICATION = 1;

	/**
	 * The number of structural features of the '<em>Security Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Security Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_CONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.QuantitativeHardwareRequirementImpl <em>Quantitative Hardware Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.QuantitativeHardwareRequirementImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getQuantitativeHardwareRequirement()
	 * @generated
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT = 12;

	/**
	 * The feature id for the '<em><b>Min Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CPU = HARDWARE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CPU = HARDWARE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Ram Mi B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_RAM_MI_B = HARDWARE_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Ram Mi B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_RAM_MI_B = HARDWARE_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min Storage MB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_STORAGE_MB = HARDWARE_REQUIREMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Storage MB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_STORAGE_MB = HARDWARE_REQUIREMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cpu Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__CPU_FREQUENCY = HARDWARE_REQUIREMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cpu Number Of Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__CPU_NUMBER_OF_CORES = HARDWARE_REQUIREMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gpu Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT__GPU_AVAILABILITY = HARDWARE_REQUIREMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Quantitative Hardware Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT_FEATURE_COUNT = HARDWARE_REQUIREMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Quantitative Hardware Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITATIVE_HARDWARE_REQUIREMENT_OPERATION_COUNT = HARDWARE_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ImageRequirementImpl <em>Image Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ImageRequirementImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getImageRequirement()
	 * @generated
	 */
	int IMAGE_REQUIREMENT = 15;

	/**
	 * The feature id for the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REQUIREMENT__IMAGE_ID = OS_OR_IMAGE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REQUIREMENT_FEATURE_COUNT = OS_OR_IMAGE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_REQUIREMENT_OPERATION_COUNT = OS_OR_IMAGE_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.VerticalScaleRequirementImpl <em>Vertical Scale Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.VerticalScaleRequirementImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getVerticalScaleRequirement()
	 * @generated
	 */
	int VERTICAL_SCALE_REQUIREMENT = 16;

	/**
	 * The feature id for the '<em><b>Min Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__MIN_CPU = SCALE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Cpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__MAX_CPU = SCALE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Ram Mi B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__MIN_RAM_MI_B = SCALE_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Ram Mi B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__MAX_RAM_MI_B = SCALE_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Min Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__MIN_CORES = SCALE_REQUIREMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Max Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__MAX_CORES = SCALE_REQUIREMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Storage MB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__MIN_STORAGE_MB = SCALE_REQUIREMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Max Storage MB</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT__MAX_STORAGE_MB = SCALE_REQUIREMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Vertical Scale Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT_FEATURE_COUNT = SCALE_REQUIREMENT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Vertical Scale Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTICAL_SCALE_REQUIREMENT_OPERATION_COUNT = SCALE_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.QualitativeHardwareRequirementImpl <em>Qualitative Hardware Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.QualitativeHardwareRequirementImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getQualitativeHardwareRequirement()
	 * @generated
	 */
	int QUALITATIVE_HARDWARE_REQUIREMENT = 17;

	/**
	 * The feature id for the '<em><b>Min Benchmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_HARDWARE_REQUIREMENT__MIN_BENCHMARK = HARDWARE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Benchmark</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_HARDWARE_REQUIREMENT__MAX_BENCHMARK = HARDWARE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cpu Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_HARDWARE_REQUIREMENT__CPU_ARCHITECTURE = HARDWARE_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Gpu Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_HARDWARE_REQUIREMENT__GPU_ARCHITECTURE = HARDWARE_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Qualitative Hardware Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_HARDWARE_REQUIREMENT_FEATURE_COUNT = HARDWARE_REQUIREMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Qualitative Hardware Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITATIVE_HARDWARE_REQUIREMENT_OPERATION_COUNT = HARDWARE_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.NetworkRequirementImpl <em>Network Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.NetworkRequirementImpl
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getNetworkRequirement()
	 * @generated
	 */
	int NETWORK_REQUIREMENT = 18;

	/**
	 * The feature id for the '<em><b>Min Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_REQUIREMENT__MIN_BANDWIDTH = HARDWARE_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Bandwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_REQUIREMENT__MAX_BANDWIDTH = HARDWARE_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Min Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_REQUIREMENT__MIN_LATENCY = HARDWARE_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Max Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_REQUIREMENT__MAX_LATENCY = HARDWARE_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Network Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_REQUIREMENT_FEATURE_COUNT = HARDWARE_REQUIREMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Network Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETWORK_REQUIREMENT_OPERATION_COUNT = HARDWARE_REQUIREMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet <em>Execution Requirement Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Requirement Set</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet
	 * @generated
	 */
	EClass getExecutionRequirementSet();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getServiceLevelObjective <em>Service Level Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Level Objective</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getServiceLevelObjective()
	 * @see #getExecutionRequirementSet()
	 * @generated
	 */
	EReference getExecutionRequirementSet_ServiceLevelObjective();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getSecurityRequirement <em>Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Security Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getSecurityRequirement()
	 * @see #getExecutionRequirementSet()
	 * @generated
	 */
	EReference getExecutionRequirementSet_SecurityRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getHorizontalScaleRequirement <em>Horizontal Scale Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Horizontal Scale Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getHorizontalScaleRequirement()
	 * @see #getExecutionRequirementSet()
	 * @generated
	 */
	EReference getExecutionRequirementSet_HorizontalScaleRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getVerticalScaleRequirement <em>Vertical Scale Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vertical Scale Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getVerticalScaleRequirement()
	 * @see #getExecutionRequirementSet()
	 * @generated
	 */
	EReference getExecutionRequirementSet_VerticalScaleRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getOsRequirement <em>Os Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Os Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getOsRequirement()
	 * @see #getExecutionRequirementSet()
	 * @generated
	 */
	EReference getExecutionRequirementSet_OsRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getImageRequirement <em>Image Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Image Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getImageRequirement()
	 * @see #getExecutionRequirementSet()
	 * @generated
	 */
	EReference getExecutionRequirementSet_ImageRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getQualitativeHardwareRequirement <em>Qualitative Hardware Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Qualitative Hardware Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getQualitativeHardwareRequirement()
	 * @see #getExecutionRequirementSet()
	 * @generated
	 */
	EReference getExecutionRequirementSet_QualitativeHardwareRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getQuantitativeHardwareRequirement <em>Quantitative Hardware Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quantitative Hardware Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getQuantitativeHardwareRequirement()
	 * @see #getExecutionRequirementSet()
	 * @generated
	 */
	EReference getExecutionRequirementSet_QuantitativeHardwareRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getNetworkRequirement <em>Network Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Network Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getNetworkRequirement()
	 * @see #getExecutionRequirementSet()
	 * @generated
	 */
	EReference getExecutionRequirementSet_NetworkRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getOptimizationRequirement <em>Optimization Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optimization Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getOptimizationRequirement()
	 * @see #getExecutionRequirementSet()
	 * @generated
	 */
	EReference getExecutionRequirementSet_OptimizationRequirement();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.HardRequirement <em>Hard Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hard Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.HardRequirement
	 * @generated
	 */
	EClass getHardRequirement();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.SoftRequirement <em>Soft Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Soft Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.SoftRequirement
	 * @generated
	 */
	EClass getSoftRequirement();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.SoftRequirement#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.SoftRequirement#getPriority()
	 * @see #getSoftRequirement()
	 * @generated
	 */
	EAttribute getSoftRequirement_Priority();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metric</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.Metric
	 * @generated
	 */
	EClass getMetric();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.Metric#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.Metric#getDescription()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_Description();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.Metric#getValueDirection <em>Value Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Direction</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.Metric#getValueDirection()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_ValueDirection();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.Metric#isIsVariable <em>Is Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Variable</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.Metric#isIsVariable()
	 * @see #getMetric()
	 * @generated
	 */
	EAttribute getMetric_IsVariable();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.OptimizationRequirement <em>Optimization Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optimization Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.OptimizationRequirement
	 * @generated
	 */
	EClass getOptimizationRequirement();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.OptimizationRequirement#getOptimisationFunction <em>Optimisation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimisation Function</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.OptimizationRequirement#getOptimisationFunction()
	 * @see #getOptimizationRequirement()
	 * @generated
	 */
	EAttribute getOptimizationRequirement_OptimisationFunction();

	/**
	 * Returns the meta object for the reference '{@link se.kth.datacloud.dsl.ExecutionRequirements.OptimizationRequirement#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Metric</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.OptimizationRequirement#getMetric()
	 * @see #getOptimizationRequirement()
	 * @generated
	 */
	EReference getOptimizationRequirement_Metric();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.HardwareRequirement <em>Hardware Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hardware Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.HardwareRequirement
	 * @generated
	 */
	EClass getHardwareRequirement();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition <em>Service Level Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Condition</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition
	 * @generated
	 */
	EClass getServiceLevelCondition();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition#getName()
	 * @see #getServiceLevelCondition()
	 * @generated
	 */
	EAttribute getServiceLevelCondition_Name();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition#getComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Operator</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition#getComparisonOperator()
	 * @see #getServiceLevelCondition()
	 * @generated
	 */
	EAttribute getServiceLevelCondition_ComparisonOperator();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition#getThreshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition#getThreshold()
	 * @see #getServiceLevelCondition()
	 * @generated
	 */
	EAttribute getServiceLevelCondition_Threshold();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition#getValidity <em>Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validity</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition#getValidity()
	 * @see #getServiceLevelCondition()
	 * @generated
	 */
	EAttribute getServiceLevelCondition_Validity();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement <em>Horizontal Scale Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Horizontal Scale Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement
	 * @generated
	 */
	EClass getHorizontalScaleRequirement();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement#getMinInstance <em>Min Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Instance</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement#getMinInstance()
	 * @see #getHorizontalScaleRequirement()
	 * @generated
	 */
	EAttribute getHorizontalScaleRequirement_MinInstance();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement#getMaxInstance <em>Max Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Instance</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement#getMaxInstance()
	 * @see #getHorizontalScaleRequirement()
	 * @generated
	 */
	EAttribute getHorizontalScaleRequirement_MaxInstance();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.SecurityRequirement <em>Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.SecurityRequirement
	 * @generated
	 */
	EClass getSecurityRequirement();

	/**
	 * Returns the meta object for the containment reference list '{@link se.kth.datacloud.dsl.ExecutionRequirements.SecurityRequirement#getSecurityParameters <em>Security Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Parameters</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.SecurityRequirement#getSecurityParameters()
	 * @see #getSecurityRequirement()
	 * @generated
	 */
	EReference getSecurityRequirement_SecurityParameters();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement <em>OS Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement
	 * @generated
	 */
	EClass getOSRequirement();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement#getOsType <em>Os Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Type</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement#getOsType()
	 * @see #getOSRequirement()
	 * @generated
	 */
	EAttribute getOSRequirement_OsType();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement#isIs64os <em>Is64os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is64os</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement#isIs64os()
	 * @see #getOSRequirement()
	 * @generated
	 */
	EAttribute getOSRequirement_Is64os();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelObjective <em>Service Level Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Level Objective</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelObjective
	 * @generated
	 */
	EClass getServiceLevelObjective();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelObjective#getCustomServiceLevel <em>Custom Service Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Custom Service Level</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelObjective#getCustomServiceLevel()
	 * @see #getServiceLevelObjective()
	 * @generated
	 */
	EReference getServiceLevelObjective_CustomServiceLevel();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.SecurityControl <em>Security Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Control</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.SecurityControl
	 * @generated
	 */
	EClass getSecurityControl();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.SecurityControl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.SecurityControl#getName()
	 * @see #getSecurityControl()
	 * @generated
	 */
	EAttribute getSecurityControl_Name();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.SecurityControl#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.SecurityControl#getSpecification()
	 * @see #getSecurityControl()
	 * @generated
	 */
	EAttribute getSecurityControl_Specification();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement <em>Quantitative Hardware Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantitative Hardware Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement
	 * @generated
	 */
	EClass getQuantitativeHardwareRequirement();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMinCpu <em>Min Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Cpu</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMinCpu()
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQuantitativeHardwareRequirement_MinCpu();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMaxCpu <em>Max Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Cpu</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMaxCpu()
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQuantitativeHardwareRequirement_MaxCpu();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMinRamMiB <em>Min Ram Mi B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Ram Mi B</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMinRamMiB()
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQuantitativeHardwareRequirement_MinRamMiB();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMaxRamMiB <em>Max Ram Mi B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Ram Mi B</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMaxRamMiB()
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQuantitativeHardwareRequirement_MaxRamMiB();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMinStorageMB <em>Min Storage MB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Storage MB</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMinStorageMB()
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQuantitativeHardwareRequirement_MinStorageMB();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMaxStorageMB <em>Max Storage MB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Storage MB</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMaxStorageMB()
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQuantitativeHardwareRequirement_MaxStorageMB();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getCpuFrequency <em>Cpu Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Frequency</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getCpuFrequency()
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQuantitativeHardwareRequirement_CpuFrequency();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getCpuNumberOfCores <em>Cpu Number Of Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Number Of Cores</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getCpuNumberOfCores()
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQuantitativeHardwareRequirement_CpuNumberOfCores();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#isGpuAvailability <em>Gpu Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpu Availability</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#isGpuAvailability()
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQuantitativeHardwareRequirement_GpuAvailability();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.ScaleRequirement <em>Scale Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ScaleRequirement
	 * @generated
	 */
	EClass getScaleRequirement();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.OSOrImageRequirement <em>OS Or Image Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OS Or Image Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.OSOrImageRequirement
	 * @generated
	 */
	EClass getOSOrImageRequirement();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.ImageRequirement <em>Image Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ImageRequirement
	 * @generated
	 */
	EClass getImageRequirement();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.ImageRequirement#getImageId <em>Image Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Id</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ImageRequirement#getImageId()
	 * @see #getImageRequirement()
	 * @generated
	 */
	EAttribute getImageRequirement_ImageId();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement <em>Vertical Scale Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertical Scale Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement
	 * @generated
	 */
	EClass getVerticalScaleRequirement();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMinCpu <em>Min Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Cpu</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMinCpu()
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	EAttribute getVerticalScaleRequirement_MinCpu();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMaxCpu <em>Max Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Cpu</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMaxCpu()
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	EAttribute getVerticalScaleRequirement_MaxCpu();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMinRamMiB <em>Min Ram Mi B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Ram Mi B</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMinRamMiB()
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	EAttribute getVerticalScaleRequirement_MinRamMiB();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMaxRamMiB <em>Max Ram Mi B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Ram Mi B</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMaxRamMiB()
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	EAttribute getVerticalScaleRequirement_MaxRamMiB();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMinCores <em>Min Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Cores</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMinCores()
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	EAttribute getVerticalScaleRequirement_MinCores();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMaxCores <em>Max Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Cores</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMaxCores()
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	EAttribute getVerticalScaleRequirement_MaxCores();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMinStorageMB <em>Min Storage MB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Storage MB</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMinStorageMB()
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	EAttribute getVerticalScaleRequirement_MinStorageMB();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMaxStorageMB <em>Max Storage MB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Storage MB</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMaxStorageMB()
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	EAttribute getVerticalScaleRequirement_MaxStorageMB();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement <em>Qualitative Hardware Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Qualitative Hardware Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement
	 * @generated
	 */
	EClass getQualitativeHardwareRequirement();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement#getMinBenchmark <em>Min Benchmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Benchmark</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement#getMinBenchmark()
	 * @see #getQualitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQualitativeHardwareRequirement_MinBenchmark();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement#getMaxBenchmark <em>Max Benchmark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Benchmark</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement#getMaxBenchmark()
	 * @see #getQualitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQualitativeHardwareRequirement_MaxBenchmark();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement#getCpuArchitecture <em>Cpu Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cpu Architecture</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement#getCpuArchitecture()
	 * @see #getQualitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQualitativeHardwareRequirement_CpuArchitecture();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement#getGpuArchitecture <em>Gpu Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gpu Architecture</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement#getGpuArchitecture()
	 * @see #getQualitativeHardwareRequirement()
	 * @generated
	 */
	EAttribute getQualitativeHardwareRequirement_GpuArchitecture();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement <em>Network Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Network Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement
	 * @generated
	 */
	EClass getNetworkRequirement();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement#getMinBandwidth <em>Min Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Bandwidth</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement#getMinBandwidth()
	 * @see #getNetworkRequirement()
	 * @generated
	 */
	EAttribute getNetworkRequirement_MinBandwidth();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement#getMaxBandwidth <em>Max Bandwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Bandwidth</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement#getMaxBandwidth()
	 * @see #getNetworkRequirement()
	 * @generated
	 */
	EAttribute getNetworkRequirement_MaxBandwidth();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement#getMinLatency <em>Min Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Latency</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement#getMinLatency()
	 * @see #getNetworkRequirement()
	 * @generated
	 */
	EAttribute getNetworkRequirement_MinLatency();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement#getMaxLatency <em>Max Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Latency</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement#getMaxLatency()
	 * @see #getNetworkRequirement()
	 * @generated
	 */
	EAttribute getNetworkRequirement_MaxLatency();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirement <em>Execution Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Execution Requirement</em>'.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirement
	 * @generated
	 */
	EClass getExecutionRequirement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExecutionRequirementsFactory getExecutionRequirementsFactory();

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
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementSetImpl <em>Execution Requirement Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementSetImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getExecutionRequirementSet()
		 * @generated
		 */
		EClass EXECUTION_REQUIREMENT_SET = eINSTANCE.getExecutionRequirementSet();

		/**
		 * The meta object literal for the '<em><b>Service Level Objective</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_REQUIREMENT_SET__SERVICE_LEVEL_OBJECTIVE = eINSTANCE.getExecutionRequirementSet_ServiceLevelObjective();

		/**
		 * The meta object literal for the '<em><b>Security Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_REQUIREMENT_SET__SECURITY_REQUIREMENT = eINSTANCE.getExecutionRequirementSet_SecurityRequirement();

		/**
		 * The meta object literal for the '<em><b>Horizontal Scale Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_REQUIREMENT_SET__HORIZONTAL_SCALE_REQUIREMENT = eINSTANCE.getExecutionRequirementSet_HorizontalScaleRequirement();

		/**
		 * The meta object literal for the '<em><b>Vertical Scale Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_REQUIREMENT_SET__VERTICAL_SCALE_REQUIREMENT = eINSTANCE.getExecutionRequirementSet_VerticalScaleRequirement();

		/**
		 * The meta object literal for the '<em><b>Os Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_REQUIREMENT_SET__OS_REQUIREMENT = eINSTANCE.getExecutionRequirementSet_OsRequirement();

		/**
		 * The meta object literal for the '<em><b>Image Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_REQUIREMENT_SET__IMAGE_REQUIREMENT = eINSTANCE.getExecutionRequirementSet_ImageRequirement();

		/**
		 * The meta object literal for the '<em><b>Qualitative Hardware Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_REQUIREMENT_SET__QUALITATIVE_HARDWARE_REQUIREMENT = eINSTANCE.getExecutionRequirementSet_QualitativeHardwareRequirement();

		/**
		 * The meta object literal for the '<em><b>Quantitative Hardware Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_REQUIREMENT_SET__QUANTITATIVE_HARDWARE_REQUIREMENT = eINSTANCE.getExecutionRequirementSet_QuantitativeHardwareRequirement();

		/**
		 * The meta object literal for the '<em><b>Network Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_REQUIREMENT_SET__NETWORK_REQUIREMENT = eINSTANCE.getExecutionRequirementSet_NetworkRequirement();

		/**
		 * The meta object literal for the '<em><b>Optimization Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXECUTION_REQUIREMENT_SET__OPTIMIZATION_REQUIREMENT = eINSTANCE.getExecutionRequirementSet_OptimizationRequirement();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.HardRequirementImpl <em>Hard Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.HardRequirementImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getHardRequirement()
		 * @generated
		 */
		EClass HARD_REQUIREMENT = eINSTANCE.getHardRequirement();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.SoftRequirementImpl <em>Soft Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.SoftRequirementImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getSoftRequirement()
		 * @generated
		 */
		EClass SOFT_REQUIREMENT = eINSTANCE.getSoftRequirement();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOFT_REQUIREMENT__PRIORITY = eINSTANCE.getSoftRequirement_Priority();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.MetricImpl <em>Metric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.MetricImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getMetric()
		 * @generated
		 */
		EClass METRIC = eINSTANCE.getMetric();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__DESCRIPTION = eINSTANCE.getMetric_Description();

		/**
		 * The meta object literal for the '<em><b>Value Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__VALUE_DIRECTION = eINSTANCE.getMetric_ValueDirection();

		/**
		 * The meta object literal for the '<em><b>Is Variable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METRIC__IS_VARIABLE = eINSTANCE.getMetric_IsVariable();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.OptimizationRequirementImpl <em>Optimization Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.OptimizationRequirementImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getOptimizationRequirement()
		 * @generated
		 */
		EClass OPTIMIZATION_REQUIREMENT = eINSTANCE.getOptimizationRequirement();

		/**
		 * The meta object literal for the '<em><b>Optimisation Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMIZATION_REQUIREMENT__OPTIMISATION_FUNCTION = eINSTANCE.getOptimizationRequirement_OptimisationFunction();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMIZATION_REQUIREMENT__METRIC = eINSTANCE.getOptimizationRequirement_Metric();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.HardwareRequirementImpl <em>Hardware Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.HardwareRequirementImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getHardwareRequirement()
		 * @generated
		 */
		EClass HARDWARE_REQUIREMENT = eINSTANCE.getHardwareRequirement();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ServiceLevelConditionImpl <em>Service Level Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ServiceLevelConditionImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getServiceLevelCondition()
		 * @generated
		 */
		EClass SERVICE_LEVEL_CONDITION = eINSTANCE.getServiceLevelCondition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_CONDITION__NAME = eINSTANCE.getServiceLevelCondition_Name();

		/**
		 * The meta object literal for the '<em><b>Comparison Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_CONDITION__COMPARISON_OPERATOR = eINSTANCE.getServiceLevelCondition_ComparisonOperator();

		/**
		 * The meta object literal for the '<em><b>Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_CONDITION__THRESHOLD = eINSTANCE.getServiceLevelCondition_Threshold();

		/**
		 * The meta object literal for the '<em><b>Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_LEVEL_CONDITION__VALIDITY = eINSTANCE.getServiceLevelCondition_Validity();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.HorizontalScaleRequirementImpl <em>Horizontal Scale Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.HorizontalScaleRequirementImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getHorizontalScaleRequirement()
		 * @generated
		 */
		EClass HORIZONTAL_SCALE_REQUIREMENT = eINSTANCE.getHorizontalScaleRequirement();

		/**
		 * The meta object literal for the '<em><b>Min Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTAL_SCALE_REQUIREMENT__MIN_INSTANCE = eINSTANCE.getHorizontalScaleRequirement_MinInstance();

		/**
		 * The meta object literal for the '<em><b>Max Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HORIZONTAL_SCALE_REQUIREMENT__MAX_INSTANCE = eINSTANCE.getHorizontalScaleRequirement_MaxInstance();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.SecurityRequirementImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getSecurityRequirement()
		 * @generated
		 */
		EClass SECURITY_REQUIREMENT = eINSTANCE.getSecurityRequirement();

		/**
		 * The meta object literal for the '<em><b>Security Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_REQUIREMENT__SECURITY_PARAMETERS = eINSTANCE.getSecurityRequirement_SecurityParameters();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.OSRequirementImpl <em>OS Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.OSRequirementImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getOSRequirement()
		 * @generated
		 */
		EClass OS_REQUIREMENT = eINSTANCE.getOSRequirement();

		/**
		 * The meta object literal for the '<em><b>Os Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_REQUIREMENT__OS_TYPE = eINSTANCE.getOSRequirement_OsType();

		/**
		 * The meta object literal for the '<em><b>Is64os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OS_REQUIREMENT__IS64OS = eINSTANCE.getOSRequirement_Is64os();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ServiceLevelObjectiveImpl <em>Service Level Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ServiceLevelObjectiveImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getServiceLevelObjective()
		 * @generated
		 */
		EClass SERVICE_LEVEL_OBJECTIVE = eINSTANCE.getServiceLevelObjective();

		/**
		 * The meta object literal for the '<em><b>Custom Service Level</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL = eINSTANCE.getServiceLevelObjective_CustomServiceLevel();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.SecurityControlImpl <em>Security Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.SecurityControlImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getSecurityControl()
		 * @generated
		 */
		EClass SECURITY_CONTROL = eINSTANCE.getSecurityControl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONTROL__NAME = eINSTANCE.getSecurityControl_Name();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_CONTROL__SPECIFICATION = eINSTANCE.getSecurityControl_Specification();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.QuantitativeHardwareRequirementImpl <em>Quantitative Hardware Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.QuantitativeHardwareRequirementImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getQuantitativeHardwareRequirement()
		 * @generated
		 */
		EClass QUANTITATIVE_HARDWARE_REQUIREMENT = eINSTANCE.getQuantitativeHardwareRequirement();

		/**
		 * The meta object literal for the '<em><b>Min Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CPU = eINSTANCE.getQuantitativeHardwareRequirement_MinCpu();

		/**
		 * The meta object literal for the '<em><b>Max Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CPU = eINSTANCE.getQuantitativeHardwareRequirement_MaxCpu();

		/**
		 * The meta object literal for the '<em><b>Min Ram Mi B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_RAM_MI_B = eINSTANCE.getQuantitativeHardwareRequirement_MinRamMiB();

		/**
		 * The meta object literal for the '<em><b>Max Ram Mi B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_RAM_MI_B = eINSTANCE.getQuantitativeHardwareRequirement_MaxRamMiB();

		/**
		 * The meta object literal for the '<em><b>Min Storage MB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_STORAGE_MB = eINSTANCE.getQuantitativeHardwareRequirement_MinStorageMB();

		/**
		 * The meta object literal for the '<em><b>Max Storage MB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_STORAGE_MB = eINSTANCE.getQuantitativeHardwareRequirement_MaxStorageMB();

		/**
		 * The meta object literal for the '<em><b>Cpu Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_HARDWARE_REQUIREMENT__CPU_FREQUENCY = eINSTANCE.getQuantitativeHardwareRequirement_CpuFrequency();

		/**
		 * The meta object literal for the '<em><b>Cpu Number Of Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_HARDWARE_REQUIREMENT__CPU_NUMBER_OF_CORES = eINSTANCE.getQuantitativeHardwareRequirement_CpuNumberOfCores();

		/**
		 * The meta object literal for the '<em><b>Gpu Availability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITATIVE_HARDWARE_REQUIREMENT__GPU_AVAILABILITY = eINSTANCE.getQuantitativeHardwareRequirement_GpuAvailability();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ScaleRequirementImpl <em>Scale Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ScaleRequirementImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getScaleRequirement()
		 * @generated
		 */
		EClass SCALE_REQUIREMENT = eINSTANCE.getScaleRequirement();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.OSOrImageRequirementImpl <em>OS Or Image Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.OSOrImageRequirementImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getOSOrImageRequirement()
		 * @generated
		 */
		EClass OS_OR_IMAGE_REQUIREMENT = eINSTANCE.getOSOrImageRequirement();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ImageRequirementImpl <em>Image Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ImageRequirementImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getImageRequirement()
		 * @generated
		 */
		EClass IMAGE_REQUIREMENT = eINSTANCE.getImageRequirement();

		/**
		 * The meta object literal for the '<em><b>Image Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_REQUIREMENT__IMAGE_ID = eINSTANCE.getImageRequirement_ImageId();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.VerticalScaleRequirementImpl <em>Vertical Scale Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.VerticalScaleRequirementImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getVerticalScaleRequirement()
		 * @generated
		 */
		EClass VERTICAL_SCALE_REQUIREMENT = eINSTANCE.getVerticalScaleRequirement();

		/**
		 * The meta object literal for the '<em><b>Min Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALE_REQUIREMENT__MIN_CPU = eINSTANCE.getVerticalScaleRequirement_MinCpu();

		/**
		 * The meta object literal for the '<em><b>Max Cpu</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALE_REQUIREMENT__MAX_CPU = eINSTANCE.getVerticalScaleRequirement_MaxCpu();

		/**
		 * The meta object literal for the '<em><b>Min Ram Mi B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALE_REQUIREMENT__MIN_RAM_MI_B = eINSTANCE.getVerticalScaleRequirement_MinRamMiB();

		/**
		 * The meta object literal for the '<em><b>Max Ram Mi B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALE_REQUIREMENT__MAX_RAM_MI_B = eINSTANCE.getVerticalScaleRequirement_MaxRamMiB();

		/**
		 * The meta object literal for the '<em><b>Min Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALE_REQUIREMENT__MIN_CORES = eINSTANCE.getVerticalScaleRequirement_MinCores();

		/**
		 * The meta object literal for the '<em><b>Max Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALE_REQUIREMENT__MAX_CORES = eINSTANCE.getVerticalScaleRequirement_MaxCores();

		/**
		 * The meta object literal for the '<em><b>Min Storage MB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALE_REQUIREMENT__MIN_STORAGE_MB = eINSTANCE.getVerticalScaleRequirement_MinStorageMB();

		/**
		 * The meta object literal for the '<em><b>Max Storage MB</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTICAL_SCALE_REQUIREMENT__MAX_STORAGE_MB = eINSTANCE.getVerticalScaleRequirement_MaxStorageMB();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.QualitativeHardwareRequirementImpl <em>Qualitative Hardware Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.QualitativeHardwareRequirementImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getQualitativeHardwareRequirement()
		 * @generated
		 */
		EClass QUALITATIVE_HARDWARE_REQUIREMENT = eINSTANCE.getQualitativeHardwareRequirement();

		/**
		 * The meta object literal for the '<em><b>Min Benchmark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITATIVE_HARDWARE_REQUIREMENT__MIN_BENCHMARK = eINSTANCE.getQualitativeHardwareRequirement_MinBenchmark();

		/**
		 * The meta object literal for the '<em><b>Max Benchmark</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITATIVE_HARDWARE_REQUIREMENT__MAX_BENCHMARK = eINSTANCE.getQualitativeHardwareRequirement_MaxBenchmark();

		/**
		 * The meta object literal for the '<em><b>Cpu Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITATIVE_HARDWARE_REQUIREMENT__CPU_ARCHITECTURE = eINSTANCE.getQualitativeHardwareRequirement_CpuArchitecture();

		/**
		 * The meta object literal for the '<em><b>Gpu Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITATIVE_HARDWARE_REQUIREMENT__GPU_ARCHITECTURE = eINSTANCE.getQualitativeHardwareRequirement_GpuArchitecture();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.NetworkRequirementImpl <em>Network Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.NetworkRequirementImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getNetworkRequirement()
		 * @generated
		 */
		EClass NETWORK_REQUIREMENT = eINSTANCE.getNetworkRequirement();

		/**
		 * The meta object literal for the '<em><b>Min Bandwidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_REQUIREMENT__MIN_BANDWIDTH = eINSTANCE.getNetworkRequirement_MinBandwidth();

		/**
		 * The meta object literal for the '<em><b>Max Bandwidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_REQUIREMENT__MAX_BANDWIDTH = eINSTANCE.getNetworkRequirement_MaxBandwidth();

		/**
		 * The meta object literal for the '<em><b>Min Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_REQUIREMENT__MIN_LATENCY = eINSTANCE.getNetworkRequirement_MinLatency();

		/**
		 * The meta object literal for the '<em><b>Max Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NETWORK_REQUIREMENT__MAX_LATENCY = eINSTANCE.getNetworkRequirement_MaxLatency();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementImpl <em>Execution Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementImpl
		 * @see se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsPackageImpl#getExecutionRequirement()
		 * @generated
		 */
		EClass EXECUTION_REQUIREMENT = eINSTANCE.getExecutionRequirement();

	}

} //ExecutionRequirementsPackage
