/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Level Objective</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelObjective#getCustomServiceLevel <em>Custom Service Level</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getServiceLevelObjective()
 * @model
 * @generated
 */
public interface ServiceLevelObjective extends HardRequirement {
	/**
	 * Returns the value of the '<em><b>Custom Service Level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Service Level</em>' containment reference.
	 * @see #setCustomServiceLevel(ServiceLevelCondition)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getServiceLevelObjective_CustomServiceLevel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServiceLevelCondition getCustomServiceLevel();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelObjective#getCustomServiceLevel <em>Custom Service Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Service Level</em>' containment reference.
	 * @see #getCustomServiceLevel()
	 * @generated
	 */
	void setCustomServiceLevel(ServiceLevelCondition value);

} // ServiceLevelObjective
