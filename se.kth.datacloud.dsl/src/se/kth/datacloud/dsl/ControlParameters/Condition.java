/**
 */
package se.kth.datacloud.dsl.ControlParameters;

import se.kth.datacloud.dsl.dsl.ComparisonOperatorType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.Condition#getComparatorOperator <em>Comparator Operator</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.Condition#getSource <em>Source</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.Condition#getTarget <em>Target</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.Condition#getSourceProcessingScriptName <em>Source Processing Script Name</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getCondition()
 * @model
 * @generated
 */
public interface Condition extends AbstractCondition {
	/**
	 * Returns the value of the '<em><b>Comparator Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link se.kth.datacloud.dsl.dsl.ComparisonOperatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator Operator</em>' attribute.
	 * @see se.kth.datacloud.dsl.dsl.ComparisonOperatorType
	 * @see #setComparatorOperator(ComparisonOperatorType)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getCondition_ComparatorOperator()
	 * @model
	 * @generated
	 */
	ComparisonOperatorType getComparatorOperator();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.Condition#getComparatorOperator <em>Comparator Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator Operator</em>' attribute.
	 * @see se.kth.datacloud.dsl.dsl.ComparisonOperatorType
	 * @see #getComparatorOperator()
	 * @generated
	 */
	void setComparatorOperator(ComparisonOperatorType value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getCondition_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.Condition#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' attribute.
	 * @see #setTarget(String)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getCondition_Target()
	 * @model default=""
	 * @generated
	 */
	String getTarget();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.Condition#getTarget <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' attribute.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(String value);

	/**
	 * Returns the value of the '<em><b>Source Processing Script Name</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Processing Script Name</em>' attribute.
	 * @see #setSourceProcessingScriptName(String)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getCondition_SourceProcessingScriptName()
	 * @model default="None"
	 * @generated
	 */
	String getSourceProcessingScriptName();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.Condition#getSourceProcessingScriptName <em>Source Processing Script Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Processing Script Name</em>' attribute.
	 * @see #getSourceProcessingScriptName()
	 * @generated
	 */
	void setSourceProcessingScriptName(String value);

} // Condition
