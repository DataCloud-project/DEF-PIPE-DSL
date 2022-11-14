/**
 */
package se.kth.datacloud.dsl.EnvironmentVariables;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariable#getValue <em>Value</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariablesPackage#getEnvironmentVariable()
 * @model
 * @generated
 */
public interface EnvironmentVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariablesPackage#getEnvironmentVariable_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariable#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariablesPackage#getEnvironmentVariable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EnvironmentVariable
