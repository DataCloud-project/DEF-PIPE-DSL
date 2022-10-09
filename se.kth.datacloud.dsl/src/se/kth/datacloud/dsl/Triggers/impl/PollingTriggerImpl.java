/**
 */
package se.kth.datacloud.dsl.Triggers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.kth.datacloud.dsl.ControlParameters.AbstractCondition;

import se.kth.datacloud.dsl.Triggers.PollingTrigger;
import se.kth.datacloud.dsl.Triggers.TriggersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Polling Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.impl.PollingTriggerImpl#getNumberOfRetries <em>Number Of Retries</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.impl.PollingTriggerImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.impl.PollingTriggerImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PollingTriggerImpl extends TriggerImpl implements PollingTrigger {
	/**
	 * The default value of the '{@link #getNumberOfRetries() <em>Number Of Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRetries()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_RETRIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRetries() <em>Number Of Retries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRetries()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRetries = NUMBER_OF_RETRIES_EDEFAULT;

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
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected AbstractCondition condition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollingTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TriggersPackage.Literals.POLLING_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfRetries() {
		return numberOfRetries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRetries(int newNumberOfRetries) {
		int oldNumberOfRetries = numberOfRetries;
		numberOfRetries = newNumberOfRetries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TriggersPackage.POLLING_TRIGGER__NUMBER_OF_RETRIES, oldNumberOfRetries, numberOfRetries));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TriggersPackage.POLLING_TRIGGER__INTERVAL, oldInterval, interval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCondition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(AbstractCondition newCondition, NotificationChain msgs) {
		AbstractCondition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TriggersPackage.POLLING_TRIGGER__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(AbstractCondition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TriggersPackage.POLLING_TRIGGER__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TriggersPackage.POLLING_TRIGGER__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TriggersPackage.POLLING_TRIGGER__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TriggersPackage.POLLING_TRIGGER__CONDITION:
				return basicSetCondition(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TriggersPackage.POLLING_TRIGGER__NUMBER_OF_RETRIES:
				return getNumberOfRetries();
			case TriggersPackage.POLLING_TRIGGER__INTERVAL:
				return getInterval();
			case TriggersPackage.POLLING_TRIGGER__CONDITION:
				return getCondition();
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
			case TriggersPackage.POLLING_TRIGGER__NUMBER_OF_RETRIES:
				setNumberOfRetries((Integer)newValue);
				return;
			case TriggersPackage.POLLING_TRIGGER__INTERVAL:
				setInterval((Integer)newValue);
				return;
			case TriggersPackage.POLLING_TRIGGER__CONDITION:
				setCondition((AbstractCondition)newValue);
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
			case TriggersPackage.POLLING_TRIGGER__NUMBER_OF_RETRIES:
				setNumberOfRetries(NUMBER_OF_RETRIES_EDEFAULT);
				return;
			case TriggersPackage.POLLING_TRIGGER__INTERVAL:
				setInterval(INTERVAL_EDEFAULT);
				return;
			case TriggersPackage.POLLING_TRIGGER__CONDITION:
				setCondition((AbstractCondition)null);
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
			case TriggersPackage.POLLING_TRIGGER__NUMBER_OF_RETRIES:
				return numberOfRetries != NUMBER_OF_RETRIES_EDEFAULT;
			case TriggersPackage.POLLING_TRIGGER__INTERVAL:
				return interval != INTERVAL_EDEFAULT;
			case TriggersPackage.POLLING_TRIGGER__CONDITION:
				return condition != null;
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
		result.append(" (numberOfRetries: ");
		result.append(numberOfRetries);
		result.append(", interval: ");
		result.append(interval);
		result.append(')');
		return result.toString();
	}

} //PollingTriggerImpl
