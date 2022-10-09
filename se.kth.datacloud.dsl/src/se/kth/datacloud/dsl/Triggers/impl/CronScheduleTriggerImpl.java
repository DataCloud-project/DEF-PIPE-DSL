/**
 */
package se.kth.datacloud.dsl.Triggers.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.kth.datacloud.dsl.Triggers.CronScheduleTrigger;
import se.kth.datacloud.dsl.Triggers.TriggersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cron Schedule Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.Triggers.impl.CronScheduleTriggerImpl#getCronExpression <em>Cron Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CronScheduleTriggerImpl extends ScheduleTriggerImpl implements CronScheduleTrigger {
	/**
	 * The default value of the '{@link #getCronExpression() <em>Cron Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCronExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String CRON_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCronExpression() <em>Cron Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCronExpression()
	 * @generated
	 * @ordered
	 */
	protected String cronExpression = CRON_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CronScheduleTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TriggersPackage.Literals.CRON_SCHEDULE_TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCronExpression() {
		return cronExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCronExpression(String newCronExpression) {
		String oldCronExpression = cronExpression;
		cronExpression = newCronExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TriggersPackage.CRON_SCHEDULE_TRIGGER__CRON_EXPRESSION, oldCronExpression, cronExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TriggersPackage.CRON_SCHEDULE_TRIGGER__CRON_EXPRESSION:
				return getCronExpression();
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
			case TriggersPackage.CRON_SCHEDULE_TRIGGER__CRON_EXPRESSION:
				setCronExpression((String)newValue);
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
			case TriggersPackage.CRON_SCHEDULE_TRIGGER__CRON_EXPRESSION:
				setCronExpression(CRON_EXPRESSION_EDEFAULT);
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
			case TriggersPackage.CRON_SCHEDULE_TRIGGER__CRON_EXPRESSION:
				return CRON_EXPRESSION_EDEFAULT == null ? cronExpression != null : !CRON_EXPRESSION_EDEFAULT.equals(cronExpression);
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
		result.append(" (cronExpression: ");
		result.append(cronExpression);
		result.append(')');
		return result.toString();
	}

} //CronScheduleTriggerImpl
