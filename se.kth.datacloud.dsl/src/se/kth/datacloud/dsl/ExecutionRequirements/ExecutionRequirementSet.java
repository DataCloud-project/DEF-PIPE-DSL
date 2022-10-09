/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Execution Requirement Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getServiceLevelObjective <em>Service Level Objective</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getSecurityRequirement <em>Security Requirement</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getHorizontalScaleRequirement <em>Horizontal Scale Requirement</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getVerticalScaleRequirement <em>Vertical Scale Requirement</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getOsRequirement <em>Os Requirement</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getImageRequirement <em>Image Requirement</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getQualitativeHardwareRequirement <em>Qualitative Hardware Requirement</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getQuantitativeHardwareRequirement <em>Quantitative Hardware Requirement</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getNetworkRequirement <em>Network Requirement</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getOptimizationRequirement <em>Optimization Requirement</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getExecutionRequirementSet()
 * @model
 * @generated
 */
public interface ExecutionRequirementSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Level Objective</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Level Objective</em>' containment reference.
	 * @see #setServiceLevelObjective(ServiceLevelObjective)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getExecutionRequirementSet_ServiceLevelObjective()
	 * @model containment="true"
	 * @generated
	 */
	ServiceLevelObjective getServiceLevelObjective();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getServiceLevelObjective <em>Service Level Objective</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Level Objective</em>' containment reference.
	 * @see #getServiceLevelObjective()
	 * @generated
	 */
	void setServiceLevelObjective(ServiceLevelObjective value);

	/**
	 * Returns the value of the '<em><b>Security Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Requirement</em>' containment reference.
	 * @see #setSecurityRequirement(SecurityRequirement)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getExecutionRequirementSet_SecurityRequirement()
	 * @model containment="true"
	 * @generated
	 */
	SecurityRequirement getSecurityRequirement();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getSecurityRequirement <em>Security Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Requirement</em>' containment reference.
	 * @see #getSecurityRequirement()
	 * @generated
	 */
	void setSecurityRequirement(SecurityRequirement value);

	/**
	 * Returns the value of the '<em><b>Horizontal Scale Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Scale Requirement</em>' containment reference.
	 * @see #setHorizontalScaleRequirement(HorizontalScaleRequirement)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getExecutionRequirementSet_HorizontalScaleRequirement()
	 * @model containment="true"
	 * @generated
	 */
	HorizontalScaleRequirement getHorizontalScaleRequirement();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getHorizontalScaleRequirement <em>Horizontal Scale Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Scale Requirement</em>' containment reference.
	 * @see #getHorizontalScaleRequirement()
	 * @generated
	 */
	void setHorizontalScaleRequirement(HorizontalScaleRequirement value);

	/**
	 * Returns the value of the '<em><b>Vertical Scale Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Scale Requirement</em>' containment reference.
	 * @see #setVerticalScaleRequirement(VerticalScaleRequirement)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getExecutionRequirementSet_VerticalScaleRequirement()
	 * @model containment="true"
	 * @generated
	 */
	VerticalScaleRequirement getVerticalScaleRequirement();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getVerticalScaleRequirement <em>Vertical Scale Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Scale Requirement</em>' containment reference.
	 * @see #getVerticalScaleRequirement()
	 * @generated
	 */
	void setVerticalScaleRequirement(VerticalScaleRequirement value);

	/**
	 * Returns the value of the '<em><b>Os Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Requirement</em>' containment reference.
	 * @see #setOsRequirement(OSRequirement)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getExecutionRequirementSet_OsRequirement()
	 * @model containment="true"
	 * @generated
	 */
	OSRequirement getOsRequirement();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getOsRequirement <em>Os Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Requirement</em>' containment reference.
	 * @see #getOsRequirement()
	 * @generated
	 */
	void setOsRequirement(OSRequirement value);

	/**
	 * Returns the value of the '<em><b>Image Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Requirement</em>' containment reference.
	 * @see #setImageRequirement(ImageRequirement)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getExecutionRequirementSet_ImageRequirement()
	 * @model containment="true"
	 * @generated
	 */
	ImageRequirement getImageRequirement();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getImageRequirement <em>Image Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Requirement</em>' containment reference.
	 * @see #getImageRequirement()
	 * @generated
	 */
	void setImageRequirement(ImageRequirement value);

	/**
	 * Returns the value of the '<em><b>Qualitative Hardware Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualitative Hardware Requirement</em>' containment reference.
	 * @see #setQualitativeHardwareRequirement(QualitativeHardwareRequirement)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getExecutionRequirementSet_QualitativeHardwareRequirement()
	 * @model containment="true"
	 * @generated
	 */
	QualitativeHardwareRequirement getQualitativeHardwareRequirement();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getQualitativeHardwareRequirement <em>Qualitative Hardware Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualitative Hardware Requirement</em>' containment reference.
	 * @see #getQualitativeHardwareRequirement()
	 * @generated
	 */
	void setQualitativeHardwareRequirement(QualitativeHardwareRequirement value);

	/**
	 * Returns the value of the '<em><b>Quantitative Hardware Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantitative Hardware Requirement</em>' containment reference.
	 * @see #setQuantitativeHardwareRequirement(QuantitativeHardwareRequirement)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getExecutionRequirementSet_QuantitativeHardwareRequirement()
	 * @model containment="true"
	 * @generated
	 */
	QuantitativeHardwareRequirement getQuantitativeHardwareRequirement();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getQuantitativeHardwareRequirement <em>Quantitative Hardware Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantitative Hardware Requirement</em>' containment reference.
	 * @see #getQuantitativeHardwareRequirement()
	 * @generated
	 */
	void setQuantitativeHardwareRequirement(QuantitativeHardwareRequirement value);

	/**
	 * Returns the value of the '<em><b>Network Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Requirement</em>' containment reference.
	 * @see #setNetworkRequirement(NetworkRequirement)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getExecutionRequirementSet_NetworkRequirement()
	 * @model containment="true"
	 * @generated
	 */
	NetworkRequirement getNetworkRequirement();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getNetworkRequirement <em>Network Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Network Requirement</em>' containment reference.
	 * @see #getNetworkRequirement()
	 * @generated
	 */
	void setNetworkRequirement(NetworkRequirement value);

	/**
	 * Returns the value of the '<em><b>Optimization Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimization Requirement</em>' containment reference.
	 * @see #setOptimizationRequirement(OptimizationRequirement)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getExecutionRequirementSet_OptimizationRequirement()
	 * @model containment="true"
	 * @generated
	 */
	OptimizationRequirement getOptimizationRequirement();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementSet#getOptimizationRequirement <em>Optimization Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimization Requirement</em>' containment reference.
	 * @see #getOptimizationRequirement()
	 * @generated
	 */
	void setOptimizationRequirement(OptimizationRequirement value);

} // ExecutionRequirementSet
