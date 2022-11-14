/**
 */
package se.kth.datacloud.dsl.Triggers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.kth.datacloud.dsl.Triggers.IntervalScheduleTrigger;
import se.kth.datacloud.dsl.Triggers.TriggersPackage;

import se.kth.datacloud.dsl.dsl.TimeUnits;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interval Schedule Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.impl.IntervalScheduleTriggerImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.impl.IntervalScheduleTriggerImpl#getInterval <em>Interval</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntervalScheduleTriggerImpl extends ScheduleTriggerImpl implements IntervalScheduleTrigger {
	/**
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final TimeUnits FREQUENCY_EDEFAULT = TimeUnits.SECOND;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected TimeUnits frequency = FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERVAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterval()
	 * @generated
	 * @ordered
	 */
	protected int interval = INTERVAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntervalScheduleTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TriggersPackage.Literals.INTERVAL_SCHEDULE_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeUnits getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(TimeUnits newFrequency) {
		TimeUnits oldFrequency = frequency;
		frequency = newFrequency == null ? FREQUENCY_EDEFAULT : newFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TriggersPackage.INTERVAL_SCHEDULE_TRIGGER__FREQUENCY, oldFrequency, frequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInterval() {
		return interval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterval(int newInterval) {
		int oldInterval = interval;
		interval = newInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TriggersPackage.INTERVAL_SCHEDULE_TRIGGER__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TriggersPackage.INTERVAL_SCHEDULE_TRIGGER__FREQUENCY:
				return getFrequency();
			case TriggersPackage.INTERVAL_SCHEDULE_TRIGGER__INTERVAL:
				return getInterval();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TriggersPackage.INTERVAL_SCHEDULE_TRIGGER__FREQUENCY:
				setFrequency((TimeUnits)newValue);
				return;
			case TriggersPackage.INTERVAL_SCHEDULE_TRIGGER__INTERVAL:
				setInterval((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TriggersPackage.INTERVAL_SCHEDULE_TRIGGER__FREQUENCY:
				setFrequency(FREQUENCY_EDEFAULT);
				return;
			case TriggersPackage.INTERVAL_SCHEDULE_TRIGGER__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TriggersPackage.INTERVAL_SCHEDULE_TRIGGER__FREQUENCY:
				return frequency != FREQUENCY_EDEFAULT;
			case TriggersPackage.INTERVAL_SCHEDULE_TRIGGER__INTERVAL:
				return interval != INTERVAL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (frequency: ");
		result.append(frequency);
		result.append(", interval: ");
		result.append(interval);
		result.append(')');
		return result.toString();
	}

} //IntervalScheduleTriggerImpl
