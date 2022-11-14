/**
 */
package se.kth.datacloud.dsl.dsl;

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
 * @see se.kth.datacloud.dsl.dsl.DslFactory
 * @model kind="package"
 * @generated
 */
public interface DslPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "dsl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://datacloud.kth.se/dcdsl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "dsl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DslPackage eINSTANCE = se.kth.datacloud.dsl.dsl.impl.DslPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.dsl.impl.PipelineImpl <em>Pipeline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.dsl.impl.PipelineImpl
	 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getPipeline()
	 * @generated
	 */
	int PIPELINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__STEPS = 1;

	/**
	 * The feature id for the '<em><b>Communication Medium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__COMMUNICATION_MEDIUM = 2;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE__ENVIRONMENT_VARIABLES = 3;

	/**
	 * The number of structural features of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pipeline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIPELINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.dsl.impl.AbstractStepImpl <em>Abstract Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.dsl.impl.AbstractStepImpl
	 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getAbstractStep()
	 * @generated
	 */
	int ABSTRACT_STEP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STEP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STEP__TRIGGERS = 1;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STEP__PREVIOUS = 2;

	/**
	 * The feature id for the '<em><b>Control Paremeter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STEP__CONTROL_PAREMETER = 3;

	/**
	 * The feature id for the '<em><b>Execution Requirement Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STEP__EXECUTION_REQUIREMENT_SET = 4;

	/**
	 * The feature id for the '<em><b>Resource Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STEP__RESOURCE_PROVIDER = 5;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STEP__ENVIRONMENT_VARIABLES = 6;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STEP__IMPLEMENTATION = 7;

	/**
	 * The number of structural features of the '<em>Abstract Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STEP_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Abstract Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.dsl.impl.CommunicationMediumImpl <em>Communication Medium</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.dsl.impl.CommunicationMediumImpl
	 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getCommunicationMedium()
	 * @generated
	 */
	int COMMUNICATION_MEDIUM = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIUM__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Communication Medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIUM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Communication Medium</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_MEDIUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.dsl.impl.StepImplementationImpl <em>Step Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.dsl.impl.StepImplementationImpl
	 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getStepImplementation()
	 * @generated
	 */
	int STEP_IMPLEMENTATION = 3;

	/**
	 * The number of structural features of the '<em>Step Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_IMPLEMENTATION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Step Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_IMPLEMENTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.dsl.impl.ContainerImplementationImpl <em>Container Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.dsl.impl.ContainerImplementationImpl
	 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getContainerImplementation()
	 * @generated
	 */
	int CONTAINER_IMPLEMENTATION = 4;

	/**
	 * The feature id for the '<em><b>Image Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMPLEMENTATION__IMAGE_NAME = STEP_IMPLEMENTATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Container Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMPLEMENTATION_FEATURE_COUNT = STEP_IMPLEMENTATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Container Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_IMPLEMENTATION_OPERATION_COUNT = STEP_IMPLEMENTATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.dsl.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.dsl.impl.ParameterImpl
	 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.dsl.impl.CompositeStepImpl <em>Composite Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.dsl.impl.CompositeStepImpl
	 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getCompositeStep()
	 * @generated
	 */
	int COMPOSITE_STEP = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STEP__NAME = ABSTRACT_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STEP__TRIGGERS = ABSTRACT_STEP__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STEP__PREVIOUS = ABSTRACT_STEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Control Paremeter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STEP__CONTROL_PAREMETER = ABSTRACT_STEP__CONTROL_PAREMETER;

	/**
	 * The feature id for the '<em><b>Execution Requirement Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STEP__EXECUTION_REQUIREMENT_SET = ABSTRACT_STEP__EXECUTION_REQUIREMENT_SET;

	/**
	 * The feature id for the '<em><b>Resource Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STEP__RESOURCE_PROVIDER = ABSTRACT_STEP__RESOURCE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STEP__ENVIRONMENT_VARIABLES = ABSTRACT_STEP__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STEP__IMPLEMENTATION = ABSTRACT_STEP__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STEP__STEPS = ABSTRACT_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STEP_FEATURE_COUNT = ABSTRACT_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STEP_OPERATION_COUNT = ABSTRACT_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.dsl.impl.StepTemplateImpl <em>Step Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.dsl.impl.StepTemplateImpl
	 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getStepTemplate()
	 * @generated
	 */
	int STEP_TEMPLATE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TEMPLATE__NAME = ABSTRACT_STEP__NAME;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TEMPLATE__TRIGGERS = ABSTRACT_STEP__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TEMPLATE__PREVIOUS = ABSTRACT_STEP__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Control Paremeter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TEMPLATE__CONTROL_PAREMETER = ABSTRACT_STEP__CONTROL_PAREMETER;

	/**
	 * The feature id for the '<em><b>Execution Requirement Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TEMPLATE__EXECUTION_REQUIREMENT_SET = ABSTRACT_STEP__EXECUTION_REQUIREMENT_SET;

	/**
	 * The feature id for the '<em><b>Resource Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TEMPLATE__RESOURCE_PROVIDER = ABSTRACT_STEP__RESOURCE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TEMPLATE__ENVIRONMENT_VARIABLES = ABSTRACT_STEP__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TEMPLATE__IMPLEMENTATION = ABSTRACT_STEP__IMPLEMENTATION;

	/**
	 * The number of structural features of the '<em>Step Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TEMPLATE_FEATURE_COUNT = ABSTRACT_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Step Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_TEMPLATE_OPERATION_COUNT = ABSTRACT_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.dsl.impl.ParameterGroupImpl <em>Parameter Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.dsl.impl.ParameterGroupImpl
	 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getParameterGroup()
	 * @generated
	 */
	int PARAMETER_GROUP = 8;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Parameter Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP__PARAMETER_OPERATOR = 1;

	/**
	 * The number of structural features of the '<em>Parameter Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Parameter Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.dsl.impl.DataProcesssingImpl <em>Data Processsing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.dsl.impl.DataProcesssingImpl
	 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getDataProcesssing()
	 * @generated
	 */
	int DATA_PROCESSSING = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSSING__NAME = STEP_TEMPLATE__NAME;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSSING__TRIGGERS = STEP_TEMPLATE__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSSING__PREVIOUS = STEP_TEMPLATE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Control Paremeter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSSING__CONTROL_PAREMETER = STEP_TEMPLATE__CONTROL_PAREMETER;

	/**
	 * The feature id for the '<em><b>Execution Requirement Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSSING__EXECUTION_REQUIREMENT_SET = STEP_TEMPLATE__EXECUTION_REQUIREMENT_SET;

	/**
	 * The feature id for the '<em><b>Resource Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSSING__RESOURCE_PROVIDER = STEP_TEMPLATE__RESOURCE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSSING__ENVIRONMENT_VARIABLES = STEP_TEMPLATE__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSSING__IMPLEMENTATION = STEP_TEMPLATE__IMPLEMENTATION;

	/**
	 * The number of structural features of the '<em>Data Processsing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSSING_FEATURE_COUNT = STEP_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Processsing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROCESSSING_OPERATION_COUNT = STEP_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.dsl.impl.DataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.dsl.impl.DataSourceImpl
	 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getDataSource()
	 * @generated
	 */
	int DATA_SOURCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__NAME = STEP_TEMPLATE__NAME;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__TRIGGERS = STEP_TEMPLATE__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__PREVIOUS = STEP_TEMPLATE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Control Paremeter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__CONTROL_PAREMETER = STEP_TEMPLATE__CONTROL_PAREMETER;

	/**
	 * The feature id for the '<em><b>Execution Requirement Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__EXECUTION_REQUIREMENT_SET = STEP_TEMPLATE__EXECUTION_REQUIREMENT_SET;

	/**
	 * The feature id for the '<em><b>Resource Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__RESOURCE_PROVIDER = STEP_TEMPLATE__RESOURCE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__ENVIRONMENT_VARIABLES = STEP_TEMPLATE__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__IMPLEMENTATION = STEP_TEMPLATE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Data Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE__DATA_SOURCE = STEP_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_FEATURE_COUNT = STEP_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SOURCE_OPERATION_COUNT = STEP_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.dsl.impl.DataSinkImpl <em>Data Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.dsl.impl.DataSinkImpl
	 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getDataSink()
	 * @generated
	 */
	int DATA_SINK = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK__NAME = STEP_TEMPLATE__NAME;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK__TRIGGERS = STEP_TEMPLATE__TRIGGERS;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK__PREVIOUS = STEP_TEMPLATE__PREVIOUS;

	/**
	 * The feature id for the '<em><b>Control Paremeter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK__CONTROL_PAREMETER = STEP_TEMPLATE__CONTROL_PAREMETER;

	/**
	 * The feature id for the '<em><b>Execution Requirement Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK__EXECUTION_REQUIREMENT_SET = STEP_TEMPLATE__EXECUTION_REQUIREMENT_SET;

	/**
	 * The feature id for the '<em><b>Resource Provider</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK__RESOURCE_PROVIDER = STEP_TEMPLATE__RESOURCE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Environment Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK__ENVIRONMENT_VARIABLES = STEP_TEMPLATE__ENVIRONMENT_VARIABLES;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK__IMPLEMENTATION = STEP_TEMPLATE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Data Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK__DATA_TARGET = STEP_TEMPLATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK_FEATURE_COUNT = STEP_TEMPLATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SINK_OPERATION_COUNT = STEP_TEMPLATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.dsl.CommunicationMediumTypes <em>Communication Medium Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.dsl.CommunicationMediumTypes
	 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getCommunicationMediumTypes()
	 * @generated
	 */
	int COMMUNICATION_MEDIUM_TYPES = 12;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.dsl.TimeUnits <em>Time Units</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.dsl.TimeUnits
	 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getTimeUnits()
	 * @generated
	 */
	int TIME_UNITS = 13;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.dsl.DeploymentLayers <em>Deployment Layers</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.dsl.DeploymentLayers
	 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getDeploymentLayers()
	 * @generated
	 */
	int DEPLOYMENT_LAYERS = 14;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.dsl.LogicalOperatorType <em>Logical Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.dsl.LogicalOperatorType
	 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getLogicalOperatorType()
	 * @generated
	 */
	int LOGICAL_OPERATOR_TYPE = 15;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.dsl.ComparisonOperatorType <em>Comparison Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.dsl.ComparisonOperatorType
	 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getComparisonOperatorType()
	 * @generated
	 */
	int COMPARISON_OPERATOR_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.dsl.Pipeline <em>Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pipeline</em>'.
	 * @see se.kth.datacloud.dsl.dsl.Pipeline
	 * @generated
	 */
	EClass getPipeline();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.dsl.Pipeline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.kth.datacloud.dsl.dsl.Pipeline#getName()
	 * @see #getPipeline()
	 * @generated
	 */
	EAttribute getPipeline_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link se.kth.datacloud.dsl.dsl.Pipeline#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see se.kth.datacloud.dsl.dsl.Pipeline#getSteps()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_Steps();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.dsl.Pipeline#getCommunicationMedium <em>Communication Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Communication Medium</em>'.
	 * @see se.kth.datacloud.dsl.dsl.Pipeline#getCommunicationMedium()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_CommunicationMedium();

	/**
	 * Returns the meta object for the containment reference list '{@link se.kth.datacloud.dsl.dsl.Pipeline#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment Variables</em>'.
	 * @see se.kth.datacloud.dsl.dsl.Pipeline#getEnvironmentVariables()
	 * @see #getPipeline()
	 * @generated
	 */
	EReference getPipeline_EnvironmentVariables();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.dsl.AbstractStep <em>Abstract Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Step</em>'.
	 * @see se.kth.datacloud.dsl.dsl.AbstractStep
	 * @generated
	 */
	EClass getAbstractStep();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.dsl.AbstractStep#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.kth.datacloud.dsl.dsl.AbstractStep#getName()
	 * @see #getAbstractStep()
	 * @generated
	 */
	EAttribute getAbstractStep_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link se.kth.datacloud.dsl.dsl.AbstractStep#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggers</em>'.
	 * @see se.kth.datacloud.dsl.dsl.AbstractStep#getTriggers()
	 * @see #getAbstractStep()
	 * @generated
	 */
	EReference getAbstractStep_Triggers();

	/**
	 * Returns the meta object for the reference list '{@link se.kth.datacloud.dsl.dsl.AbstractStep#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous</em>'.
	 * @see se.kth.datacloud.dsl.dsl.AbstractStep#getPrevious()
	 * @see #getAbstractStep()
	 * @generated
	 */
	EReference getAbstractStep_Previous();

	/**
	 * Returns the meta object for the reference '{@link se.kth.datacloud.dsl.dsl.AbstractStep#getControlParemeter <em>Control Paremeter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Paremeter</em>'.
	 * @see se.kth.datacloud.dsl.dsl.AbstractStep#getControlParemeter()
	 * @see #getAbstractStep()
	 * @generated
	 */
	EReference getAbstractStep_ControlParemeter();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.dsl.AbstractStep#getExecutionRequirementSet <em>Execution Requirement Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Execution Requirement Set</em>'.
	 * @see se.kth.datacloud.dsl.dsl.AbstractStep#getExecutionRequirementSet()
	 * @see #getAbstractStep()
	 * @generated
	 */
	EReference getAbstractStep_ExecutionRequirementSet();

	/**
	 * Returns the meta object for the containment reference list '{@link se.kth.datacloud.dsl.dsl.AbstractStep#getResourceProvider <em>Resource Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Resource Provider</em>'.
	 * @see se.kth.datacloud.dsl.dsl.AbstractStep#getResourceProvider()
	 * @see #getAbstractStep()
	 * @generated
	 */
	EReference getAbstractStep_ResourceProvider();

	/**
	 * Returns the meta object for the containment reference list '{@link se.kth.datacloud.dsl.dsl.AbstractStep#getEnvironmentVariables <em>Environment Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Environment Variables</em>'.
	 * @see se.kth.datacloud.dsl.dsl.AbstractStep#getEnvironmentVariables()
	 * @see #getAbstractStep()
	 * @generated
	 */
	EReference getAbstractStep_EnvironmentVariables();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.dsl.AbstractStep#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation</em>'.
	 * @see se.kth.datacloud.dsl.dsl.AbstractStep#getImplementation()
	 * @see #getAbstractStep()
	 * @generated
	 */
	EReference getAbstractStep_Implementation();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.dsl.CommunicationMedium <em>Communication Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Medium</em>'.
	 * @see se.kth.datacloud.dsl.dsl.CommunicationMedium
	 * @generated
	 */
	EClass getCommunicationMedium();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.dsl.CommunicationMedium#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see se.kth.datacloud.dsl.dsl.CommunicationMedium#getType()
	 * @see #getCommunicationMedium()
	 * @generated
	 */
	EAttribute getCommunicationMedium_Type();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.dsl.StepImplementation <em>Step Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Implementation</em>'.
	 * @see se.kth.datacloud.dsl.dsl.StepImplementation
	 * @generated
	 */
	EClass getStepImplementation();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.dsl.ContainerImplementation <em>Container Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container Implementation</em>'.
	 * @see se.kth.datacloud.dsl.dsl.ContainerImplementation
	 * @generated
	 */
	EClass getContainerImplementation();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.dsl.ContainerImplementation#getImageName <em>Image Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Name</em>'.
	 * @see se.kth.datacloud.dsl.dsl.ContainerImplementation#getImageName()
	 * @see #getContainerImplementation()
	 * @generated
	 */
	EAttribute getContainerImplementation_ImageName();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.dsl.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see se.kth.datacloud.dsl.dsl.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.dsl.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see se.kth.datacloud.dsl.dsl.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.dsl.CompositeStep <em>Composite Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Step</em>'.
	 * @see se.kth.datacloud.dsl.dsl.CompositeStep
	 * @generated
	 */
	EClass getCompositeStep();

	/**
	 * Returns the meta object for the containment reference list '{@link se.kth.datacloud.dsl.dsl.CompositeStep#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see se.kth.datacloud.dsl.dsl.CompositeStep#getSteps()
	 * @see #getCompositeStep()
	 * @generated
	 */
	EReference getCompositeStep_Steps();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.dsl.StepTemplate <em>Step Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step Template</em>'.
	 * @see se.kth.datacloud.dsl.dsl.StepTemplate
	 * @generated
	 */
	EClass getStepTemplate();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.dsl.ParameterGroup <em>Parameter Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Group</em>'.
	 * @see se.kth.datacloud.dsl.dsl.ParameterGroup
	 * @generated
	 */
	EClass getParameterGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link se.kth.datacloud.dsl.dsl.ParameterGroup#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see se.kth.datacloud.dsl.dsl.ParameterGroup#getParameter()
	 * @see #getParameterGroup()
	 * @generated
	 */
	EReference getParameterGroup_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.dsl.ParameterGroup#getParameterOperator <em>Parameter Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Operator</em>'.
	 * @see se.kth.datacloud.dsl.dsl.ParameterGroup#getParameterOperator()
	 * @see #getParameterGroup()
	 * @generated
	 */
	EAttribute getParameterGroup_ParameterOperator();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.dsl.DataProcesssing <em>Data Processsing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Processsing</em>'.
	 * @see se.kth.datacloud.dsl.dsl.DataProcesssing
	 * @generated
	 */
	EClass getDataProcesssing();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.dsl.DataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see se.kth.datacloud.dsl.dsl.DataSource
	 * @generated
	 */
	EClass getDataSource();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.dsl.DataSource#getDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Source</em>'.
	 * @see se.kth.datacloud.dsl.dsl.DataSource#getDataSource()
	 * @see #getDataSource()
	 * @generated
	 */
	EReference getDataSource_DataSource();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.dsl.DataSink <em>Data Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Sink</em>'.
	 * @see se.kth.datacloud.dsl.dsl.DataSink
	 * @generated
	 */
	EClass getDataSink();

	/**
	 * Returns the meta object for the containment reference '{@link se.kth.datacloud.dsl.dsl.DataSink#getDataTarget <em>Data Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Data Target</em>'.
	 * @see se.kth.datacloud.dsl.dsl.DataSink#getDataTarget()
	 * @see #getDataSink()
	 * @generated
	 */
	EReference getDataSink_DataTarget();

	/**
	 * Returns the meta object for enum '{@link se.kth.datacloud.dsl.dsl.CommunicationMediumTypes <em>Communication Medium Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Communication Medium Types</em>'.
	 * @see se.kth.datacloud.dsl.dsl.CommunicationMediumTypes
	 * @generated
	 */
	EEnum getCommunicationMediumTypes();

	/**
	 * Returns the meta object for enum '{@link se.kth.datacloud.dsl.dsl.TimeUnits <em>Time Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Time Units</em>'.
	 * @see se.kth.datacloud.dsl.dsl.TimeUnits
	 * @generated
	 */
	EEnum getTimeUnits();

	/**
	 * Returns the meta object for enum '{@link se.kth.datacloud.dsl.dsl.DeploymentLayers <em>Deployment Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Deployment Layers</em>'.
	 * @see se.kth.datacloud.dsl.dsl.DeploymentLayers
	 * @generated
	 */
	EEnum getDeploymentLayers();

	/**
	 * Returns the meta object for enum '{@link se.kth.datacloud.dsl.dsl.LogicalOperatorType <em>Logical Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator Type</em>'.
	 * @see se.kth.datacloud.dsl.dsl.LogicalOperatorType
	 * @generated
	 */
	EEnum getLogicalOperatorType();

	/**
	 * Returns the meta object for enum '{@link se.kth.datacloud.dsl.dsl.ComparisonOperatorType <em>Comparison Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator Type</em>'.
	 * @see se.kth.datacloud.dsl.dsl.ComparisonOperatorType
	 * @generated
	 */
	EEnum getComparisonOperatorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DslFactory getDslFactory();

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
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.dsl.impl.PipelineImpl <em>Pipeline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.dsl.impl.PipelineImpl
		 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getPipeline()
		 * @generated
		 */
		EClass PIPELINE = eINSTANCE.getPipeline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIPELINE__NAME = eINSTANCE.getPipeline_Name();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__STEPS = eINSTANCE.getPipeline_Steps();

		/**
		 * The meta object literal for the '<em><b>Communication Medium</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__COMMUNICATION_MEDIUM = eINSTANCE.getPipeline_CommunicationMedium();

		/**
		 * The meta object literal for the '<em><b>Environment Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIPELINE__ENVIRONMENT_VARIABLES = eINSTANCE.getPipeline_EnvironmentVariables();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.dsl.impl.AbstractStepImpl <em>Abstract Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.dsl.impl.AbstractStepImpl
		 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getAbstractStep()
		 * @generated
		 */
		EClass ABSTRACT_STEP = eINSTANCE.getAbstractStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_STEP__NAME = eINSTANCE.getAbstractStep_Name();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STEP__TRIGGERS = eINSTANCE.getAbstractStep_Triggers();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STEP__PREVIOUS = eINSTANCE.getAbstractStep_Previous();

		/**
		 * The meta object literal for the '<em><b>Control Paremeter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STEP__CONTROL_PAREMETER = eINSTANCE.getAbstractStep_ControlParemeter();

		/**
		 * The meta object literal for the '<em><b>Execution Requirement Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STEP__EXECUTION_REQUIREMENT_SET = eINSTANCE.getAbstractStep_ExecutionRequirementSet();

		/**
		 * The meta object literal for the '<em><b>Resource Provider</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STEP__RESOURCE_PROVIDER = eINSTANCE.getAbstractStep_ResourceProvider();

		/**
		 * The meta object literal for the '<em><b>Environment Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STEP__ENVIRONMENT_VARIABLES = eINSTANCE.getAbstractStep_EnvironmentVariables();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_STEP__IMPLEMENTATION = eINSTANCE.getAbstractStep_Implementation();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.dsl.impl.CommunicationMediumImpl <em>Communication Medium</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.dsl.impl.CommunicationMediumImpl
		 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getCommunicationMedium()
		 * @generated
		 */
		EClass COMMUNICATION_MEDIUM = eINSTANCE.getCommunicationMedium();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_MEDIUM__TYPE = eINSTANCE.getCommunicationMedium_Type();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.dsl.impl.StepImplementationImpl <em>Step Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.dsl.impl.StepImplementationImpl
		 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getStepImplementation()
		 * @generated
		 */
		EClass STEP_IMPLEMENTATION = eINSTANCE.getStepImplementation();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.dsl.impl.ContainerImplementationImpl <em>Container Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.dsl.impl.ContainerImplementationImpl
		 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getContainerImplementation()
		 * @generated
		 */
		EClass CONTAINER_IMPLEMENTATION = eINSTANCE.getContainerImplementation();

		/**
		 * The meta object literal for the '<em><b>Image Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER_IMPLEMENTATION__IMAGE_NAME = eINSTANCE.getContainerImplementation_ImageName();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.dsl.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.dsl.impl.ParameterImpl
		 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.dsl.impl.CompositeStepImpl <em>Composite Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.dsl.impl.CompositeStepImpl
		 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getCompositeStep()
		 * @generated
		 */
		EClass COMPOSITE_STEP = eINSTANCE.getCompositeStep();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_STEP__STEPS = eINSTANCE.getCompositeStep_Steps();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.dsl.impl.StepTemplateImpl <em>Step Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.dsl.impl.StepTemplateImpl
		 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getStepTemplate()
		 * @generated
		 */
		EClass STEP_TEMPLATE = eINSTANCE.getStepTemplate();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.dsl.impl.ParameterGroupImpl <em>Parameter Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.dsl.impl.ParameterGroupImpl
		 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getParameterGroup()
		 * @generated
		 */
		EClass PARAMETER_GROUP = eINSTANCE.getParameterGroup();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_GROUP__PARAMETER = eINSTANCE.getParameterGroup_Parameter();

		/**
		 * The meta object literal for the '<em><b>Parameter Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_GROUP__PARAMETER_OPERATOR = eINSTANCE.getParameterGroup_ParameterOperator();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.dsl.impl.DataProcesssingImpl <em>Data Processsing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.dsl.impl.DataProcesssingImpl
		 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getDataProcesssing()
		 * @generated
		 */
		EClass DATA_PROCESSSING = eINSTANCE.getDataProcesssing();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.dsl.impl.DataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.dsl.impl.DataSourceImpl
		 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getDataSource()
		 * @generated
		 */
		EClass DATA_SOURCE = eINSTANCE.getDataSource();

		/**
		 * The meta object literal for the '<em><b>Data Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SOURCE__DATA_SOURCE = eINSTANCE.getDataSource_DataSource();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.dsl.impl.DataSinkImpl <em>Data Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.dsl.impl.DataSinkImpl
		 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getDataSink()
		 * @generated
		 */
		EClass DATA_SINK = eINSTANCE.getDataSink();

		/**
		 * The meta object literal for the '<em><b>Data Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SINK__DATA_TARGET = eINSTANCE.getDataSink_DataTarget();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.dsl.CommunicationMediumTypes <em>Communication Medium Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.dsl.CommunicationMediumTypes
		 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getCommunicationMediumTypes()
		 * @generated
		 */
		EEnum COMMUNICATION_MEDIUM_TYPES = eINSTANCE.getCommunicationMediumTypes();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.dsl.TimeUnits <em>Time Units</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.dsl.TimeUnits
		 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getTimeUnits()
		 * @generated
		 */
		EEnum TIME_UNITS = eINSTANCE.getTimeUnits();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.dsl.DeploymentLayers <em>Deployment Layers</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.dsl.DeploymentLayers
		 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getDeploymentLayers()
		 * @generated
		 */
		EEnum DEPLOYMENT_LAYERS = eINSTANCE.getDeploymentLayers();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.dsl.LogicalOperatorType <em>Logical Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.dsl.LogicalOperatorType
		 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getLogicalOperatorType()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR_TYPE = eINSTANCE.getLogicalOperatorType();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.dsl.ComparisonOperatorType <em>Comparison Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.dsl.ComparisonOperatorType
		 * @see se.kth.datacloud.dsl.dsl.impl.DslPackageImpl#getComparisonOperatorType()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR_TYPE = eINSTANCE.getComparisonOperatorType();

	}

} //DslPackage
