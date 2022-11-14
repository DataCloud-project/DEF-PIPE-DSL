/**
 */
package se.kth.datacloud.dsl.ControlParameters;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Looop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.WhileLooop#isAtLeastOnce <em>At Least Once</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.WhileLooop#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getWhileLooop()
 * @model
 * @generated
 */
public interface WhileLooop extends Loop {
	/**
	 * Returns the value of the '<em><b>At Least Once</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>At Least Once</em>' attribute.
	 * @see #setAtLeastOnce(boolean)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getWhileLooop_AtLeastOnce()
	 * @model default="false"
	 * @generated
	 */
	boolean isAtLeastOnce();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.WhileLooop#isAtLeastOnce <em>At Least Once</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>At Least Once</em>' attribute.
	 * @see #isAtLeastOnce()
	 * @generated
	 */
	void setAtLeastOnce(boolean value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(AbstractCondition)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getWhileLooop_Condition()
	 * @model containment="true"
	 * @generated
	 */
	AbstractCondition getCondition();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.WhileLooop#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(AbstractCondition value);

} // WhileLooop
