/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.Metric#getDescription <em>Description</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.Metric#getValueDirection <em>Value Direction</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.Metric#isIsVariable <em>Is Variable</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getMetric()
 * @model
 * @generated
 */
public interface Metric extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getMetric_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.Metric#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Value Direction</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Direction</em>' attribute.
	 * @see #setValueDirection(short)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getMetric_ValueDirection()
	 * @model default="0"
	 * @generated
	 */
	short getValueDirection();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.Metric#getValueDirection <em>Value Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Direction</em>' attribute.
	 * @see #getValueDirection()
	 * @generated
	 */
	void setValueDirection(short value);

	/**
	 * Returns the value of the '<em><b>Is Variable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Variable</em>' attribute.
	 * @see #setIsVariable(boolean)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getMetric_IsVariable()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsVariable();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.Metric#isIsVariable <em>Is Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Variable</em>' attribute.
	 * @see #isIsVariable()
	 * @generated
	 */
	void setIsVariable(boolean value);

} // Metric
