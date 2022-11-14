/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.SecurityRequirement#getSecurityParameters <em>Security Parameters</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getSecurityRequirement()
 * @model
 * @generated
 */
public interface SecurityRequirement extends HardRequirement {
	/**
	 * Returns the value of the '<em><b>Security Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link se.kth.datacloud.dsl.ExecutionRequirements.SecurityControl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Parameters</em>' containment reference list.
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getSecurityRequirement_SecurityParameters()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<SecurityControl> getSecurityParameters();

} // SecurityRequirement
