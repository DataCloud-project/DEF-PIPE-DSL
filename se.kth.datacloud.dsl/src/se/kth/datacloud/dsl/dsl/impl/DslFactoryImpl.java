/**
 */
package se.kth.datacloud.dsl.dsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.kth.datacloud.dsl.dsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DslFactoryImpl extends EFactoryImpl implements DslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DslFactory init() {
		try {
			DslFactory theDslFactory = (DslFactory)EPackage.Registry.INSTANCE.getEFactory(DslPackage.eNS_URI);
			if (theDslFactory != null) {
				return theDslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslFactoryImpl() {
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
			case DslPackage.PIPELINE: return createPipeline();
			case DslPackage.COMMUNICATION_MEDIUM: return createCommunicationMedium();
			case DslPackage.CONTAINER_IMPLEMENTATION: return createContainerImplementation();
			case DslPackage.COMPOSITE_STEP: return createCompositeStep();
			case DslPackage.PARAMETER_GROUP: return createParameterGroup();
			case DslPackage.DATA_PROCESSSING: return createDataProcesssing();
			case DslPackage.DATA_SOURCE: return createDataSource();
			case DslPackage.DATA_SINK: return createDataSink();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DslPackage.COMMUNICATION_MEDIUM_TYPES:
				return createCommunicationMediumTypesFromString(eDataType, initialValue);
			case DslPackage.TIME_UNITS:
				return createTimeUnitsFromString(eDataType, initialValue);
			case DslPackage.DEPLOYMENT_LAYERS:
				return createDeploymentLayersFromString(eDataType, initialValue);
			case DslPackage.LOGICAL_OPERATOR_TYPE:
				return createLogicalOperatorTypeFromString(eDataType, initialValue);
			case DslPackage.COMPARISON_OPERATOR_TYPE:
				return createComparisonOperatorTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DslPackage.COMMUNICATION_MEDIUM_TYPES:
				return convertCommunicationMediumTypesToString(eDataType, instanceValue);
			case DslPackage.TIME_UNITS:
				return convertTimeUnitsToString(eDataType, instanceValue);
			case DslPackage.DEPLOYMENT_LAYERS:
				return convertDeploymentLayersToString(eDataType, instanceValue);
			case DslPackage.LOGICAL_OPERATOR_TYPE:
				return convertLogicalOperatorTypeToString(eDataType, instanceValue);
			case DslPackage.COMPARISON_OPERATOR_TYPE:
				return convertComparisonOperatorTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pipeline createPipeline() {
		PipelineImpl pipeline = new PipelineImpl();
		return pipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMedium createCommunicationMedium() {
		CommunicationMediumImpl communicationMedium = new CommunicationMediumImpl();
		return communicationMedium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerImplementation createContainerImplementation() {
		ContainerImplementationImpl containerImplementation = new ContainerImplementationImpl();
		return containerImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeStep createCompositeStep() {
		CompositeStepImpl compositeStep = new CompositeStepImpl();
		return compositeStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterGroup createParameterGroup() {
		ParameterGroupImpl parameterGroup = new ParameterGroupImpl();
		return parameterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProcesssing createDataProcesssing() {
		DataProcesssingImpl dataProcesssing = new DataProcesssingImpl();
		return dataProcesssing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSource createDataSource() {
		DataSourceImpl dataSource = new DataSourceImpl();
		return dataSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSink createDataSink() {
		DataSinkImpl dataSink = new DataSinkImpl();
		return dataSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationMediumTypes createCommunicationMediumTypesFromString(EDataType eDataType, String initialValue) {
		CommunicationMediumTypes result = CommunicationMediumTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationMediumTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnits createTimeUnitsFromString(EDataType eDataType, String initialValue) {
		TimeUnits result = TimeUnits.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimeUnitsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeploymentLayers createDeploymentLayersFromString(EDataType eDataType, String initialValue) {
		DeploymentLayers result = DeploymentLayers.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeploymentLayersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperatorType createLogicalOperatorTypeFromString(EDataType eDataType, String initialValue) {
		LogicalOperatorType result = LogicalOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonOperatorType createComparisonOperatorTypeFromString(EDataType eDataType, String initialValue) {
		ComparisonOperatorType result = ComparisonOperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertComparisonOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DslPackage getDslPackage() {
		return (DslPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DslPackage getPackage() {
		return DslPackage.eINSTANCE;
	}

} //DslFactoryImpl
