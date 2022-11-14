/**
 */
package se.kth.datacloud.dsl.ControlParameters;

import org.eclipse.emf.common.util.EList;

import se.kth.datacloud.dsl.dsl.LogicalOperatorType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.CompositeCondition#getConditions <em>Conditions</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.CompositeCondition#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getCompositeCondition()
 * @model
 * @generated
 */
public interface CompositeCondition extends AbstractCondition {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link se.kth.datacloud.dsl.ControlParameters.AbstractCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getCompositeCondition_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractCondition> getConditions();

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link se.kth.datacloud.dsl.dsl.LogicalOperatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see se.kth.datacloud.dsl.dsl.LogicalOperatorType
	 * @see #setOperator(LogicalOperatorType)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getCompositeCondition_Operator()
	 * @model
	 * @generated
	 */
	LogicalOperatorType getOperator();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.CompositeCondition#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see se.kth.datacloud.dsl.dsl.LogicalOperatorType
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicalOperatorType value);

} // CompositeCondition
