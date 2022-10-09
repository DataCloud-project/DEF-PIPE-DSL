/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage
 * @generated
 */
public interface ExecutionRequirementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExecutionRequirementsFactory eINSTANCE = se.kth.datacloud.dsl.ExecutionRequirements.impl.ExecutionRequirementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Execution Requirement Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution Requirement Set</em>'.
	 * @generated
	 */
	ExecutionRequirementSet createExecutionRequirementSet();

	/**
	 * Returns a new object of class '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metric</em>'.
	 * @generated
	 */
	Metric createMetric();

	/**
	 * Returns a new object of class '<em>Optimization Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Optimization Requirement</em>'.
	 * @generated
	 */
	OptimizationRequirement createOptimizationRequirement();

	/**
	 * Returns a new object of class '<em>Service Level Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Condition</em>'.
	 * @generated
	 */
	ServiceLevelCondition createServiceLevelCondition();

	/**
	 * Returns a new object of class '<em>Horizontal Scale Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Horizontal Scale Requirement</em>'.
	 * @generated
	 */
	HorizontalScaleRequirement createHorizontalScaleRequirement();

	/**
	 * Returns a new object of class '<em>Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Requirement</em>'.
	 * @generated
	 */
	SecurityRequirement createSecurityRequirement();

	/**
	 * Returns a new object of class '<em>OS Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OS Requirement</em>'.
	 * @generated
	 */
	OSRequirement createOSRequirement();

	/**
	 * Returns a new object of class '<em>Service Level Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Level Objective</em>'.
	 * @generated
	 */
	ServiceLevelObjective createServiceLevelObjective();

	/**
	 * Returns a new object of class '<em>Security Control</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Control</em>'.
	 * @generated
	 */
	SecurityControl createSecurityControl();

	/**
	 * Returns a new object of class '<em>Quantitative Hardware Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Quantitative Hardware Requirement</em>'.
	 * @generated
	 */
	QuantitativeHardwareRequirement createQuantitativeHardwareRequirement();

	/**
	 * Returns a new object of class '<em>Image Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Requirement</em>'.
	 * @generated
	 */
	ImageRequirement createImageRequirement();

	/**
	 * Returns a new object of class '<em>Vertical Scale Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vertical Scale Requirement</em>'.
	 * @generated
	 */
	VerticalScaleRequirement createVerticalScaleRequirement();

	/**
	 * Returns a new object of class '<em>Qualitative Hardware Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qualitative Hardware Requirement</em>'.
	 * @generated
	 */
	QualitativeHardwareRequirement createQualitativeHardwareRequirement();

	/**
	 * Returns a new object of class '<em>Network Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Network Requirement</em>'.
	 * @generated
	 */
	NetworkRequirement createNetworkRequirement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExecutionRequirementsPackage getExecutionRequirementsPackage();

} //ExecutionRequirementsFactory
