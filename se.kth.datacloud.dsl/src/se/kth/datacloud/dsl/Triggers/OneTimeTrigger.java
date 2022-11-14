/**
 */
package se.kth.datacloud.dsl.Triggers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.OneTimeTrigger#getStartTime <em>Start Time</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getOneTimeTrigger()
 * @model
 * @generated
 */
public interface OneTimeTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(String)
	 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getOneTimeTrigger_StartTime()
	 * @model
	 * @generated
	 */
	String getStartTime();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.Triggers.OneTimeTrigger#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(String value);

} // OneTimeTrigger
