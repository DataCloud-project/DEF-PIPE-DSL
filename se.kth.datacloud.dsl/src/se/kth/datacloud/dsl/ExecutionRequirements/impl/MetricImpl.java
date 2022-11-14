/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage;
import se.kth.datacloud.dsl.ExecutionRequirements.Metric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.MetricImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.MetricImpl#getValueDirection <em>Value Direction</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.MetricImpl#isIsVariable <em>Is Variable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetricImpl extends MinimalEObjectImpl.Container implements Metric {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueDirection() <em>Value Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDirection()
	 * @generated
	 * @ordered
	 */
	protected static final short VALUE_DIRECTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValueDirection() <em>Value Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDirection()
	 * @generated
	 * @ordered
	 */
	protected short valueDirection = VALUE_DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsVariable() <em>Is Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVariable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_VARIABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsVariable() <em>Is Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsVariable()
	 * @generated
	 * @ordered
	 */
	protected boolean isVariable = IS_VARIABLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetricImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionRequirementsPackage.Literals.METRIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.METRIC__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public short getValueDirection() {
		return valueDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueDirection(short newValueDirection) {
		short oldValueDirection = valueDirection;
		valueDirection = newValueDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.METRIC__VALUE_DIRECTION, oldValueDirection, valueDirection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsVariable() {
		return isVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsVariable(boolean newIsVariable) {
		boolean oldIsVariable = isVariable;
		isVariable = newIsVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.METRIC__IS_VARIABLE, oldIsVariable, isVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionRequirementsPackage.METRIC__DESCRIPTION:
				return getDescription();
			case ExecutionRequirementsPackage.METRIC__VALUE_DIRECTION:
				return getValueDirection();
			case ExecutionRequirementsPackage.METRIC__IS_VARIABLE:
				return isIsVariable();
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
			case ExecutionRequirementsPackage.METRIC__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ExecutionRequirementsPackage.METRIC__VALUE_DIRECTION:
				setValueDirection((Short)newValue);
				return;
			case ExecutionRequirementsPackage.METRIC__IS_VARIABLE:
				setIsVariable((Boolean)newValue);
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
			case ExecutionRequirementsPackage.METRIC__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.METRIC__VALUE_DIRECTION:
				setValueDirection(VALUE_DIRECTION_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.METRIC__IS_VARIABLE:
				setIsVariable(IS_VARIABLE_EDEFAULT);
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
			case ExecutionRequirementsPackage.METRIC__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ExecutionRequirementsPackage.METRIC__VALUE_DIRECTION:
				return valueDirection != VALUE_DIRECTION_EDEFAULT;
			case ExecutionRequirementsPackage.METRIC__IS_VARIABLE:
				return isVariable != IS_VARIABLE_EDEFAULT;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", valueDirection: ");
		result.append(valueDirection);
		result.append(", isVariable: ");
		result.append(isVariable);
		result.append(')');
		return result.toString();
	}

} //MetricImpl
