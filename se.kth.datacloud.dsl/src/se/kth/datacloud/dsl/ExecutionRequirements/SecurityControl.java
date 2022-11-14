/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.SecurityControl#getName <em>Name</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.SecurityControl#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getSecurityControl()
 * @model
 * @generated
 */
public interface SecurityControl extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getSecurityControl_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.SecurityControl#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' attribute.
	 * @see #setSpecification(String)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getSecurityControl_Specification()
	 * @model
	 * @generated
	 */
	String getSpecification();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.SecurityControl#getSpecification <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' attribute.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(String value);

} // SecurityControl
