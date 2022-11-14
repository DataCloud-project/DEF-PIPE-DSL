/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import se.kth.datacloud.dsl.ExecutionRequirements.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage
 * @generated
 */
public class ExecutionRequirementsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExecutionRequirementsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionRequirementsSwitch() {
		if (modelPackage == null) {
			modelPackage = ExecutionRequirementsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT_SET: {
				ExecutionRequirementSet executionRequirementSet = (ExecutionRequirementSet)theEObject;
				T result = caseExecutionRequirementSet(executionRequirementSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.HARD_REQUIREMENT: {
				HardRequirement hardRequirement = (HardRequirement)theEObject;
				T result = caseHardRequirement(hardRequirement);
				if (result == null) result = caseExecutionRequirement(hardRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.SOFT_REQUIREMENT: {
				SoftRequirement softRequirement = (SoftRequirement)theEObject;
				T result = caseSoftRequirement(softRequirement);
				if (result == null) result = caseExecutionRequirement(softRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.METRIC: {
				Metric metric = (Metric)theEObject;
				T result = caseMetric(metric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.OPTIMIZATION_REQUIREMENT: {
				OptimizationRequirement optimizationRequirement = (OptimizationRequirement)theEObject;
				T result = caseOptimizationRequirement(optimizationRequirement);
				if (result == null) result = caseSoftRequirement(optimizationRequirement);
				if (result == null) result = caseExecutionRequirement(optimizationRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.HARDWARE_REQUIREMENT: {
				HardwareRequirement hardwareRequirement = (HardwareRequirement)theEObject;
				T result = caseHardwareRequirement(hardwareRequirement);
				if (result == null) result = caseHardRequirement(hardwareRequirement);
				if (result == null) result = caseExecutionRequirement(hardwareRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.SERVICE_LEVEL_CONDITION: {
				ServiceLevelCondition serviceLevelCondition = (ServiceLevelCondition)theEObject;
				T result = caseServiceLevelCondition(serviceLevelCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.HORIZONTAL_SCALE_REQUIREMENT: {
				HorizontalScaleRequirement horizontalScaleRequirement = (HorizontalScaleRequirement)theEObject;
				T result = caseHorizontalScaleRequirement(horizontalScaleRequirement);
				if (result == null) result = caseScaleRequirement(horizontalScaleRequirement);
				if (result == null) result = caseHardRequirement(horizontalScaleRequirement);
				if (result == null) result = caseExecutionRequirement(horizontalScaleRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.SECURITY_REQUIREMENT: {
				SecurityRequirement securityRequirement = (SecurityRequirement)theEObject;
				T result = caseSecurityRequirement(securityRequirement);
				if (result == null) result = caseHardRequirement(securityRequirement);
				if (result == null) result = caseExecutionRequirement(securityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.OS_REQUIREMENT: {
				OSRequirement osRequirement = (OSRequirement)theEObject;
				T result = caseOSRequirement(osRequirement);
				if (result == null) result = caseOSOrImageRequirement(osRequirement);
				if (result == null) result = caseHardRequirement(osRequirement);
				if (result == null) result = caseExecutionRequirement(osRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.SERVICE_LEVEL_OBJECTIVE: {
				ServiceLevelObjective serviceLevelObjective = (ServiceLevelObjective)theEObject;
				T result = caseServiceLevelObjective(serviceLevelObjective);
				if (result == null) result = caseHardRequirement(serviceLevelObjective);
				if (result == null) result = caseExecutionRequirement(serviceLevelObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.SECURITY_CONTROL: {
				SecurityControl securityControl = (SecurityControl)theEObject;
				T result = caseSecurityControl(securityControl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT: {
				QuantitativeHardwareRequirement quantitativeHardwareRequirement = (QuantitativeHardwareRequirement)theEObject;
				T result = caseQuantitativeHardwareRequirement(quantitativeHardwareRequirement);
				if (result == null) result = caseHardwareRequirement(quantitativeHardwareRequirement);
				if (result == null) result = caseHardRequirement(quantitativeHardwareRequirement);
				if (result == null) result = caseExecutionRequirement(quantitativeHardwareRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.SCALE_REQUIREMENT: {
				ScaleRequirement scaleRequirement = (ScaleRequirement)theEObject;
				T result = caseScaleRequirement(scaleRequirement);
				if (result == null) result = caseHardRequirement(scaleRequirement);
				if (result == null) result = caseExecutionRequirement(scaleRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.OS_OR_IMAGE_REQUIREMENT: {
				OSOrImageRequirement osOrImageRequirement = (OSOrImageRequirement)theEObject;
				T result = caseOSOrImageRequirement(osOrImageRequirement);
				if (result == null) result = caseHardRequirement(osOrImageRequirement);
				if (result == null) result = caseExecutionRequirement(osOrImageRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.IMAGE_REQUIREMENT: {
				ImageRequirement imageRequirement = (ImageRequirement)theEObject;
				T result = caseImageRequirement(imageRequirement);
				if (result == null) result = caseOSOrImageRequirement(imageRequirement);
				if (result == null) result = caseHardRequirement(imageRequirement);
				if (result == null) result = caseExecutionRequirement(imageRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT: {
				VerticalScaleRequirement verticalScaleRequirement = (VerticalScaleRequirement)theEObject;
				T result = caseVerticalScaleRequirement(verticalScaleRequirement);
				if (result == null) result = caseScaleRequirement(verticalScaleRequirement);
				if (result == null) result = caseHardRequirement(verticalScaleRequirement);
				if (result == null) result = caseExecutionRequirement(verticalScaleRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT: {
				QualitativeHardwareRequirement qualitativeHardwareRequirement = (QualitativeHardwareRequirement)theEObject;
				T result = caseQualitativeHardwareRequirement(qualitativeHardwareRequirement);
				if (result == null) result = caseHardwareRequirement(qualitativeHardwareRequirement);
				if (result == null) result = caseHardRequirement(qualitativeHardwareRequirement);
				if (result == null) result = caseExecutionRequirement(qualitativeHardwareRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT: {
				NetworkRequirement networkRequirement = (NetworkRequirement)theEObject;
				T result = caseNetworkRequirement(networkRequirement);
				if (result == null) result = caseHardwareRequirement(networkRequirement);
				if (result == null) result = caseHardRequirement(networkRequirement);
				if (result == null) result = caseExecutionRequirement(networkRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExecutionRequirementsPackage.EXECUTION_REQUIREMENT: {
				ExecutionRequirement executionRequirement = (ExecutionRequirement)theEObject;
				T result = caseExecutionRequirement(executionRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Requirement Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Requirement Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionRequirementSet(ExecutionRequirementSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hard Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hard Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardRequirement(HardRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Soft Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Soft Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSoftRequirement(SoftRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetric(Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optimization Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optimization Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptimizationRequirement(OptimizationRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hardware Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hardware Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHardwareRequirement(HardwareRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelCondition(ServiceLevelCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontal Scale Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontal Scale Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalScaleRequirement(HorizontalScaleRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityRequirement(SecurityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OS Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OS Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSRequirement(OSRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Level Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Level Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceLevelObjective(ServiceLevelObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityControl(SecurityControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantitative Hardware Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantitative Hardware Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantitativeHardwareRequirement(QuantitativeHardwareRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scale Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scale Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScaleRequirement(ScaleRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>OS Or Image Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>OS Or Image Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOSOrImageRequirement(OSOrImageRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageRequirement(ImageRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertical Scale Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertical Scale Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerticalScaleRequirement(VerticalScaleRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Qualitative Hardware Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Qualitative Hardware Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQualitativeHardwareRequirement(QualitativeHardwareRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkRequirement(NetworkRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Execution Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Execution Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExecutionRequirement(ExecutionRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExecutionRequirementsSwitch
