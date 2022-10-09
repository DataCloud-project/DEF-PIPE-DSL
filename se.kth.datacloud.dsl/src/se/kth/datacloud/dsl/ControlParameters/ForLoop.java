/**
 */
package se.kth.datacloud.dsl.ControlParameters;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.ForLoop#getFrom <em>From</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.ForLoop#getTo <em>To</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.ForLoop#getStepSize <em>Step Size</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.ForLoop#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getForLoop()
 * @model
 * @generated
 */
public interface ForLoop extends Loop {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(double)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getForLoop_From()
	 * @model default="0"
	 * @generated
	 */
	double getFrom();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.ForLoop#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(double value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(double)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getForLoop_To()
	 * @model default="0"
	 * @generated
	 */
	double getTo();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.ForLoop#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(double value);

	/**
	 * Returns the value of the '<em><b>Step Size</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step Size</em>' attribute.
	 * @see #setStepSize(int)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getForLoop_StepSize()
	 * @model default="1"
	 * @generated
	 */
	int getStepSize();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.ForLoop#getStepSize <em>Step Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Step Size</em>' attribute.
	 * @see #getStepSize()
	 * @generated
	 */
	void setStepSize(int value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The default value is <code>"INCREMENT"</code>.
	 * The literals are from the enumeration {@link se.kth.datacloud.dsl.ControlParameters.OperatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see se.kth.datacloud.dsl.ControlParameters.OperatorType
	 * @see #setOperator(OperatorType)
	 * @see se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage#getForLoop_Operator()
	 * @model default="INCREMENT"
	 * @generated
	 */
	OperatorType getOperator();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ControlParameters.ForLoop#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see se.kth.datacloud.dsl.ControlParameters.OperatorType
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(OperatorType value);

} // ForLoop
