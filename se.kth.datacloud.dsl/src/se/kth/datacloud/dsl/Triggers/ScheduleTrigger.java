/**
 */
package se.kth.datacloud.dsl.Triggers;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.ScheduleTrigger#getStartTime <em>Start Time</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getScheduleTrigger()
 * @model
 * @generated
 */
public interface ScheduleTrigger extends Trigger {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(String)
	 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getScheduleTrigger_StartTime()
	 * @model
	 * @generated
	 */
	String getStartTime();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.Triggers.ScheduleTrigger#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(String value);

} // ScheduleTrigger
