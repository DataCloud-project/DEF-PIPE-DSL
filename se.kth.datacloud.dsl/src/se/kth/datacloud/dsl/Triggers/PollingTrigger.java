/**
 */
package se.kth.datacloud.dsl.Triggers;

import se.kth.datacloud.dsl.ControlParameters.AbstractCondition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polling Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.PollingTrigger#getNumberOfRetries <em>Number Of Retries</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.PollingTrigger#getInterval <em>Interval</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.PollingTrigger#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getPollingTrigger()
 * @model abstract="true"
 * @generated
 */
public interface PollingTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Number Of Retries</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Retries</em>' attribute.
	 * @see #setNumberOfRetries(int)
	 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getPollingTrigger_NumberOfRetries()
	 * @model
	 * @generated
	 */
	int getNumberOfRetries();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.Triggers.PollingTrigger#getNumberOfRetries <em>Number Of Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Retries</em>' attribute.
	 * @see #getNumberOfRetries()
	 * @generated
	 */
	void setNumberOfRetries(int value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(int)
	 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getPollingTrigger_Interval()
	 * @model
	 * @generated
	 */
	int getInterval();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.Triggers.PollingTrigger#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(int value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(AbstractCondition)
	 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getPollingTrigger_Condition()
	 * @model containment="true"
	 * @generated
	 */
	AbstractCondition getCondition();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.Triggers.PollingTrigger#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(AbstractCondition value);

} // PollingTrigger
