/**
 */
package se.kth.datacloud.dsl.Triggers;

import se.kth.datacloud.dsl.dsl.TimeUnits;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interval Schedule Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.IntervalScheduleTrigger#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.IntervalScheduleTrigger#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getIntervalScheduleTrigger()
 * @model
 * @generated
 */
public interface IntervalScheduleTrigger extends ScheduleTrigger {
	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * The literals are from the enumeration {@link se.kth.datacloud.dsl.dsl.TimeUnits}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see se.kth.datacloud.dsl.dsl.TimeUnits
	 * @see #setFrequency(TimeUnits)
	 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getIntervalScheduleTrigger_Frequency()
	 * @model
	 * @generated
	 */
	TimeUnits getFrequency();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.Triggers.IntervalScheduleTrigger#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see se.kth.datacloud.dsl.dsl.TimeUnits
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(TimeUnits value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(int)
	 * @see se.kth.datacloud.dsl.Triggers.TriggersPackage#getIntervalScheduleTrigger_Interval()
	 * @model
	 * @generated
	 */
	int getInterval();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.Triggers.IntervalScheduleTrigger#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(int value);

} // IntervalScheduleTrigger
