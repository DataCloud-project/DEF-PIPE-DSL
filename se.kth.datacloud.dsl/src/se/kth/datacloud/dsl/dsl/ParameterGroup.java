/**
 */
package se.kth.datacloud.dsl.dsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.dsl.ParameterGroup#getParameter <em>Parameter</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.dsl.ParameterGroup#getParameterOperator <em>Parameter Operator</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.dsl.DslPackage#getParameterGroup()
 * @model
 * @generated
 */
public interface ParameterGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link se.kth.datacloud.dsl.dsl.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getParameterGroup_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Parameter Operator</b></em>' attribute.
	 * The default value is <code>"AND"</code>.
	 * The literals are from the enumeration {@link se.kth.datacloud.dsl.dsl.LogicalOperatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Operator</em>' attribute.
	 * @see se.kth.datacloud.dsl.dsl.LogicalOperatorType
	 * @see #setParameterOperator(LogicalOperatorType)
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getParameterGroup_ParameterOperator()
	 * @model default="AND"
	 * @generated
	 */
	LogicalOperatorType getParameterOperator();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.dsl.ParameterGroup#getParameterOperator <em>Parameter Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Operator</em>' attribute.
	 * @see se.kth.datacloud.dsl.dsl.LogicalOperatorType
	 * @see #getParameterOperator()
	 * @generated
	 */
	void setParameterOperator(LogicalOperatorType value);

} // ParameterGroup
