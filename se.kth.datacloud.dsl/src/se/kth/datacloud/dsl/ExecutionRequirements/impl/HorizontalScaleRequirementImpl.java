/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage;
import se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Horizontal Scale Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.HorizontalScaleRequirementImpl#getMinInstance <em>Min Instance</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.HorizontalScaleRequirementImpl#getMaxInstance <em>Max Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HorizontalScaleRequirementImpl extends ScaleRequirementImpl implements HorizontalScaleRequirement {
	/**
	 * The default value of the '{@link #getMinInstance() <em>Min Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInstance()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_INSTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinInstance() <em>Min Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinInstance()
	 * @generated
	 * @ordered
	 */
	protected int minInstance = MIN_INSTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxInstance() <em>Max Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstance()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_INSTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxInstance() <em>Max Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxInstance()
	 * @generated
	 * @ordered
	 */
	protected int maxInstance = MAX_INSTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HorizontalScaleRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionRequirementsPackage.Literals.HORIZONTAL_SCALE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinInstance() {
		return minInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinInstance(int newMinInstance) {
		int oldMinInstance = minInstance;
		minInstance = newMinInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.HORIZONTAL_SCALE_REQUIREMENT__MIN_INSTANCE, oldMinInstance, minInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxInstance() {
		return maxInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxInstance(int newMaxInstance) {
		int oldMaxInstance = maxInstance;
		maxInstance = newMaxInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.HORIZONTAL_SCALE_REQUIREMENT__MAX_INSTANCE, oldMaxInstance, maxInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionRequirementsPackage.HORIZONTAL_SCALE_REQUIREMENT__MIN_INSTANCE:
				return getMinInstance();
			case ExecutionRequirementsPackage.HORIZONTAL_SCALE_REQUIREMENT__MAX_INSTANCE:
				return getMaxInstance();
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
			case ExecutionRequirementsPackage.HORIZONTAL_SCALE_REQUIREMENT__MIN_INSTANCE:
				setMinInstance((Integer)newValue);
				return;
			case ExecutionRequirementsPackage.HORIZONTAL_SCALE_REQUIREMENT__MAX_INSTANCE:
				setMaxInstance((Integer)newValue);
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
			case ExecutionRequirementsPackage.HORIZONTAL_SCALE_REQUIREMENT__MIN_INSTANCE:
				setMinInstance(MIN_INSTANCE_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.HORIZONTAL_SCALE_REQUIREMENT__MAX_INSTANCE:
				setMaxInstance(MAX_INSTANCE_EDEFAULT);
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
			case ExecutionRequirementsPackage.HORIZONTAL_SCALE_REQUIREMENT__MIN_INSTANCE:
				return minInstance != MIN_INSTANCE_EDEFAULT;
			case ExecutionRequirementsPackage.HORIZONTAL_SCALE_REQUIREMENT__MAX_INSTANCE:
				return maxInstance != MAX_INSTANCE_EDEFAULT;
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
		result.append(" (minInstance: ");
		result.append(minInstance);
		result.append(", maxInstance: ");
		result.append(maxInstance);
		result.append(')');
		return result.toString();
	}

} //HorizontalScaleRequirementImpl
