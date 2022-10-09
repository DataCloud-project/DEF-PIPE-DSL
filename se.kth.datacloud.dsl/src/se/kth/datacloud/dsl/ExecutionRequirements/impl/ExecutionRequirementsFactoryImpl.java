/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.kth.datacloud.dsl.ExecutionRequirements.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExecutionRequirementsFactoryImpl extends EFactoryImpl implements ExecutionRequirementsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExecutionRequirementsFactory init() {
		try {
			ExecutionRequirementsFactory theExecutionRequirementsFactory = (ExecutionRequirementsFactory)EPackage.Registry.INSTANCE.getEFactory(ExecutionRequirementsPackage.eNS_URI);
			if (theExecutionRequirementsFactory != null) {
				return theExecutionRequirementsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExecutionRequirementsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionRequirementsFactoryImpl() {
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
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET: return createExecutionRequirementSet();
			case ExecutionRequirementsPackage.METRIC: return createMetric();
			case ExecutionRequirementsPackage.OPTIMIZATION_REQUIREMENT: return createOptimizationRequirement();
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION: return createServiceLevelCondition();
			case ExecutionRequirementsPackage.HORIZONTAL_SCALE_REQUIREMENT: return createHorizontalScaleRequirement();
			case ExecutionRequirementsPackage.SECURITY_REQUIREMENT: return createSecurityRequirement();
			case ExecutionRequirementsPackage.OS_REQUIREMENT: return createOSRequirement();
			case ExecutionRequirementsPackage.SERVICE_LEVEL_OBJECTIVE: return createServiceLevelObjective();
			case ExecutionRequirementsPackage.SECURITY_CONTROL: return createSecurityControl();
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT: return createQuantitativeHardwareRequirement();
			case ExecutionRequirementsPackage.IMAGE_REQUIREMENT: return createImageRequirement();
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT: return createVerticalScaleRequirement();
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT: return createQualitativeHardwareRequirement();
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT: return createNetworkRequirement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionRequirementSet createExecutionRequirementSet() {
		ExecutionRequirementSetImpl executionRequirementSet = new ExecutionRequirementSetImpl();
		return executionRequirementSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metric createMetric() {
		MetricImpl metric = new MetricImpl();
		return metric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizationRequirement createOptimizationRequirement() {
		OptimizationRequirementImpl optimizationRequirement = new OptimizationRequirementImpl();
		return optimizationRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelCondition createServiceLevelCondition() {
		ServiceLevelConditionImpl serviceLevelCondition = new ServiceLevelConditionImpl();
		return serviceLevelCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalScaleRequirement createHorizontalScaleRequirement() {
		HorizontalScaleRequirementImpl horizontalScaleRequirement = new HorizontalScaleRequirementImpl();
		return horizontalScaleRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRequirement createSecurityRequirement() {
		SecurityRequirementImpl securityRequirement = new SecurityRequirementImpl();
		return securityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSRequirement createOSRequirement() {
		OSRequirementImpl osRequirement = new OSRequirementImpl();
		return osRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelObjective createServiceLevelObjective() {
		ServiceLevelObjectiveImpl serviceLevelObjective = new ServiceLevelObjectiveImpl();
		return serviceLevelObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityControl createSecurityControl() {
		SecurityControlImpl securityControl = new SecurityControlImpl();
		return securityControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantitativeHardwareRequirement createQuantitativeHardwareRequirement() {
		QuantitativeHardwareRequirementImpl quantitativeHardwareRequirement = new QuantitativeHardwareRequirementImpl();
		return quantitativeHardwareRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageRequirement createImageRequirement() {
		ImageRequirementImpl imageRequirement = new ImageRequirementImpl();
		return imageRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalScaleRequirement createVerticalScaleRequirement() {
		VerticalScaleRequirementImpl verticalScaleRequirement = new VerticalScaleRequirementImpl();
		return verticalScaleRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitativeHardwareRequirement createQualitativeHardwareRequirement() {
		QualitativeHardwareRequirementImpl qualitativeHardwareRequirement = new QualitativeHardwareRequirementImpl();
		return qualitativeHardwareRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkRequirement createNetworkRequirement() {
		NetworkRequirementImpl networkRequirement = new NetworkRequirementImpl();
		return networkRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionRequirementsPackage getExecutionRequirementsPackage() {
		return (ExecutionRequirementsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExecutionRequirementsPackage getPackage() {
		return ExecutionRequirementsPackage.eINSTANCE;
	}

} //ExecutionRequirementsFactoryImpl
