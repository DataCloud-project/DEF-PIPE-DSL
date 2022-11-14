/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage;
import se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition;
import se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelObjective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Level Objective</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.ServiceLevelObjectiveImpl#getCustomServiceLevel <em>Custom Service Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceLevelObjectiveImpl extends HardRequirementImpl implements ServiceLevelObjective {
	/**
	 * The cached value of the '{@link #getCustomServiceLevel() <em>Custom Service Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomServiceLevel()
	 * @generated
	 * @ordered
	 */
	protected ServiceLevelCondition customServiceLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelObjectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionRequirementsPackage.Literals.SERVICE_LEVEL_OBJECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelCondition getCustomServiceLevel() {
		return customServiceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomServiceLevel(ServiceLevelCondition newCustomServiceLevel, NotificationChain msgs) {
		ServiceLevelCondition oldCustomServiceLevel = customServiceLevel;
		customServiceLevel = newCustomServiceLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL, oldCustomServiceLevel, newCustomServiceLevel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomServiceLevel(ServiceLevelCondition newCustomServiceLevel) {
		if (newCustomServiceLevel != customServiceLevel) {
			NotificationChain msgs = null;
			if (customServiceLevel != null)
				msgs = ((InternalEObject)customServiceLevel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL, null, msgs);
			if (newCustomServiceLevel != null)
				msgs = ((InternalEObject)newCustomServiceLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExecutionRequirementsPackage.SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL, null, msgs);
			msgs = basicSetCustomServiceLevel(newCustomServiceLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL, newCustomServiceLevel, newCustomServiceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionRequirementsPackage.SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL:
				return basicSetCustomServiceLevel(null, msgs);
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
			case ExecutionRequirementsPackage.SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL:
				return getCustomServiceLevel();
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
			case ExecutionRequirementsPackage.SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL:
				setCustomServiceLevel((ServiceLevelCondition)newValue);
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
			case ExecutionRequirementsPackage.SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL:
				setCustomServiceLevel((ServiceLevelCondition)null);
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
			case ExecutionRequirementsPackage.SERVICE_LEVEL_OBJECTIVE__CUSTOM_SERVICE_LEVEL:
				return customServiceLevel != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceLevelObjectiveImpl
