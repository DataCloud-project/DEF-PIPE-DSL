/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage;
import se.kth.datacloud.dsl.ExecutionRequirements.SecurityControl;
import se.kth.datacloud.dsl.ExecutionRequirements.SecurityRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.SecurityRequirementImpl#getSecurityParameters <em>Security Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityRequirementImpl extends HardRequirementImpl implements SecurityRequirement {
	/**
	 * The cached value of the '{@link #getSecurityParameters() <em>Security Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityControl> securityParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionRequirementsPackage.Literals.SECURITY_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityControl> getSecurityParameters() {
		if (securityParameters == null) {
			securityParameters = new EObjectContainmentEList<SecurityControl>(SecurityControl.class, this, ExecutionRequirementsPackage.SECURITY_REQUIREMENT__SECURITY_PARAMETERS);
		}
		return securityParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExecutionRequirementsPackage.SECURITY_REQUIREMENT__SECURITY_PARAMETERS:
				return ((InternalEList<?>)getSecurityParameters()).basicRemove(otherEnd, msgs);
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
			case ExecutionRequirementsPackage.SECURITY_REQUIREMENT__SECURITY_PARAMETERS:
				return getSecurityParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExecutionRequirementsPackage.SECURITY_REQUIREMENT__SECURITY_PARAMETERS:
				getSecurityParameters().clear();
				getSecurityParameters().addAll((Collection<? extends SecurityControl>)newValue);
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
			case ExecutionRequirementsPackage.SECURITY_REQUIREMENT__SECURITY_PARAMETERS:
				getSecurityParameters().clear();
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
			case ExecutionRequirementsPackage.SECURITY_REQUIREMENT__SECURITY_PARAMETERS:
				return securityParameters != null && !securityParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecurityRequirementImpl
