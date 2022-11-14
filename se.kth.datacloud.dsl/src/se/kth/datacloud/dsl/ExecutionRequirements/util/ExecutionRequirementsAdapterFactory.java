/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import se.kth.datacloud.dsl.ExecutionRequirements.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage
 * @generated
 */
public class ExecutionRequirementsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExecutionRequirementsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionRequirementsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExecutionRequirementsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutionRequirementsSwitch<Adapter> modelSwitch =
		new ExecutionRequirementsSwitch<Adapter>() {
			@Override
			public Adapter caseExecutionRequirementSet(ExecutionRequirementSet object) {
				return createExecutionRequirementSetAdapter();
			}
			@Override
			public Adapter caseHardRequirement(HardRequirement object) {
				return createHardRequirementAdapter();
			}
			@Override
			public Adapter caseSoftRequirement(SoftRequirement object) {
				return createSoftRequirementAdapter();
			}
			@Override
			public Adapter caseMetric(Metric object) {
				return createMetricAdapter();
			}
			@Override
			public Adapter caseOptimizationRequirement(OptimizationRequirement object) {
				return createOptimizationRequirementAdapter();
			}
			@Override
			public Adapter caseHardwareRequirement(HardwareRequirement object) {
				return createHardwareRequirementAdapter();
			}
			@Override
			public Adapter caseServiceLevelCondition(ServiceLevelCondition object) {
				return createServiceLevelConditionAdapter();
			}
			@Override
			public Adapter caseHorizontalScaleRequirement(HorizontalScaleRequirement object) {
				return createHorizontalScaleRequirementAdapter();
			}
			@Override
			public Adapter caseSecurityRequirement(SecurityRequirement object) {
				return createSecurityRequirementAdapter();
			}
			@Override
			public Adapter caseOSRequirement(OSRequirement object) {
				return createOSRequirementAdapter();
			}
			@Override
			public Adapter caseServiceLevelObjective(ServiceLevelObjective object) {
				return createServiceLevelObjectiveAdapter();
			}
			@Override
			public Adapter caseSecurityControl(SecurityControl object) {
				return createSecurityControlAdapter();
			}
			@Override
			public Adapter caseQuantitativeHardwareRequirement(QuantitativeHardwareRequirement object) {
				return createQuantitativeHardwareRequirementAdapter();
			}
			@Override
			public Adapter caseScaleRequirement(ScaleRequirement object) {
				return createScaleRequirementAdapter();
			}
			@Override
			public Adapter caseOSOrImageRequirement(OSOrImageRequirement object) {
				return createOSOrImageRequirementAdapter();
			}
			@Override
			public Adapter caseImageRequirement(ImageRequirement object) {
				return createImageRequirementAdapter();
			}
			@Override
			public Adapter caseVerticalScaleRequirement(VerticalScaleRequirement object) {
				return createVerticalScaleRequirementAdapter();
			}
			@Override
			public Adapter caseQualitativeHardwareRequirement(QualitativeHardwareRequirement object) {
				return createQualitativeHardwareRequirementAdapter();
			}
			@Override
			public Adapter caseNetworkRequirement(NetworkRequirement object) {
				return createNetworkRequirementAdapter();
			}
			@Override
			public Adapter caseExecutionRequirement(ExecutionRequirement object) {
				return createExecutionRequirementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet <em>Execution Requirement Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet
	 * @generated
	 */
	public Adapter createExecutionRequirementSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.HardRequirement <em>Hard Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.HardRequirement
	 * @generated
	 */
	public Adapter createHardRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.SoftRequirement <em>Soft Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.SoftRequirement
	 * @generated
	 */
	public Adapter createSoftRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.OptimizationRequirement <em>Optimization Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.OptimizationRequirement
	 * @generated
	 */
	public Adapter createOptimizationRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.HardwareRequirement <em>Hardware Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.HardwareRequirement
	 * @generated
	 */
	public Adapter createHardwareRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition <em>Service Level Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition
	 * @generated
	 */
	public Adapter createServiceLevelConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement <em>Horizontal Scale Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement
	 * @generated
	 */
	public Adapter createHorizontalScaleRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.SecurityRequirement <em>Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.SecurityRequirement
	 * @generated
	 */
	public Adapter createSecurityRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement <em>OS Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement
	 * @generated
	 */
	public Adapter createOSRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelObjective <em>Service Level Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelObjective
	 * @generated
	 */
	public Adapter createServiceLevelObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.SecurityControl <em>Security Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.SecurityControl
	 * @generated
	 */
	public Adapter createSecurityControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement <em>Quantitative Hardware Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement
	 * @generated
	 */
	public Adapter createQuantitativeHardwareRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.ScaleRequirement <em>Scale Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ScaleRequirement
	 * @generated
	 */
	public Adapter createScaleRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.OSOrImageRequirement <em>OS Or Image Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.OSOrImageRequirement
	 * @generated
	 */
	public Adapter createOSOrImageRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.ImageRequirement <em>Image Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ImageRequirement
	 * @generated
	 */
	public Adapter createImageRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement <em>Vertical Scale Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement
	 * @generated
	 */
	public Adapter createVerticalScaleRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement <em>Qualitative Hardware Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement
	 * @generated
	 */
	public Adapter createQualitativeHardwareRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement <em>Network Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement
	 * @generated
	 */
	public Adapter createNetworkRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirement <em>Execution Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirement
	 * @generated
	 */
	public Adapter createExecutionRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ExecutionRequirementsAdapterFactory
