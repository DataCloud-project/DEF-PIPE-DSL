/**
 */
package se.kth.datacloud.dsl.ControlParameters;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import se.kth.datacloud.dsl.dsl.LogicalOperatorType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pre Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.PreCondition#getConditionStepList <em>Condition Step List</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.PreCondition#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getPreCondition()
 * @model
 * @generated
 */
public interface PreCondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition Step List</b></em>' containment reference list.
	 * The list contents are of type {@link se.kth.datacloud.dsl.ControlParameters.ConditionStepPair}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Step List</em>' containment reference list.
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getPreCondition_ConditionStepList()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ConditionStepPair> getConditionStepList();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link se.kth.datacloud.dsl.dsl.LogicalOperatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see se.kth.datacloud.dsl.dsl.LogicalOperatorType
	 * @see #setType(LogicalOperatorType)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getPreCondition_Type()
	 * @model
	 * @generated
	 */
	LogicalOperatorType getType();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.PreCondition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see se.kth.datacloud.dsl.dsl.LogicalOperatorType
	 * @see #getType()
	 * @generated
	 */
	void setType(LogicalOperatorType value);

} // PreCondition
