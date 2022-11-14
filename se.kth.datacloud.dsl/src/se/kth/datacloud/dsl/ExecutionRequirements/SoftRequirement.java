/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Soft Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.SoftRequirement#getPriority <em>Priority</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getSoftRequirement()
 * @model abstract="true"
 * @generated
 */
public interface SoftRequirement extends ExecutionRequirement {
	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(double)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getSoftRequirement_Priority()
	 * @model
	 * @generated
	 */
	double getPriority();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.SoftRequirement#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(double value);

} // SoftRequirement
