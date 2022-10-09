/**
 */
package se.kth.datacloud.dsl.ControlParameters.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.kth.datacloud.dsl.ControlParameters.AbstractCondition;
import se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage;
import se.kth.datacloud.dsl.ControlParameters.WhileLooop;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>While Looop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.impl.WhileLooopImpl#isAtLeastOnce <em>At Least Once</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.impl.WhileLooopImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhileLooopImpl extends LoopImpl implements WhileLooop {
	/**
	 * The default value of the '{@link #isAtLeastOnce() <em>At Least Once</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtLeastOnce()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AT_LEAST_ONCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAtLeastOnce() <em>At Least Once</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAtLeastOnce()
	 * @generated
	 * @ordered
	 */
	protected boolean atLeastOnce = AT_LEAST_ONCE_EDEFAULT;

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
	protected WhileLooopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlParametersPackage.Literals.WHILE_LOOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAtLeastOnce() {
		return atLeastOnce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtLeastOnce(boolean newAtLeastOnce) {
		boolean oldAtLeastOnce = atLeastOnce;
		atLeastOnce = newAtLeastOnce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlParametersPackage.WHILE_LOOOP__AT_LEAST_ONCE, oldAtLeastOnce, atLeastOnce));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlParametersPackage.WHILE_LOOOP__CONDITION, oldCondition, newCondition);
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
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ControlParametersPackage.WHILE_LOOOP__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ControlParametersPackage.WHILE_LOOOP__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlParametersPackage.WHILE_LOOOP__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControlParametersPackage.WHILE_LOOOP__CONDITION:
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
			case ControlParametersPackage.WHILE_LOOOP__AT_LEAST_ONCE:
				return isAtLeastOnce();
			case ControlParametersPackage.WHILE_LOOOP__CONDITION:
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
			case ControlParametersPackage.WHILE_LOOOP__AT_LEAST_ONCE:
				setAtLeastOnce((Boolean)newValue);
				return;
			case ControlParametersPackage.WHILE_LOOOP__CONDITION:
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
			case ControlParametersPackage.WHILE_LOOOP__AT_LEAST_ONCE:
				setAtLeastOnce(AT_LEAST_ONCE_EDEFAULT);
				return;
			case ControlParametersPackage.WHILE_LOOOP__CONDITION:
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
			case ControlParametersPackage.WHILE_LOOOP__AT_LEAST_ONCE:
				return atLeastOnce != AT_LEAST_ONCE_EDEFAULT;
			case ControlParametersPackage.WHILE_LOOOP__CONDITION:
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
		result.append(" (atLeastOnce: ");
		result.append(atLeastOnce);
		result.append(')');
		return result.toString();
	}

} //WhileLooopImpl
