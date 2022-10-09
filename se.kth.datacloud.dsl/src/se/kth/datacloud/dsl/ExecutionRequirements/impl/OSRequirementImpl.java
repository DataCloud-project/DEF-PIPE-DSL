/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage;
import se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OS Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.OSRequirementImpl#getOsType <em>Os Type</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.OSRequirementImpl#isIs64os <em>Is64os</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OSRequirementImpl extends OSOrImageRequirementImpl implements OSRequirement {
	/**
	 * The default value of the '{@link #getOsType() <em>Os Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsType()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsType() <em>Os Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsType()
	 * @generated
	 * @ordered
	 */
	protected String osType = OS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIs64os() <em>Is64os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs64os()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS64OS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIs64os() <em>Is64os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIs64os()
	 * @generated
	 * @ordered
	 */
	protected boolean is64os = IS64OS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OSRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionRequirementsPackage.Literals.OS_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsType() {
		return osType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsType(String newOsType) {
		String oldOsType = osType;
		osType = newOsType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.OS_REQUIREMENT__OS_TYPE, oldOsType, osType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIs64os() {
		return is64os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIs64os(boolean newIs64os) {
		boolean oldIs64os = is64os;
		is64os = newIs64os;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.OS_REQUIREMENT__IS64OS, oldIs64os, is64os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionRequirementsPackage.OS_REQUIREMENT__OS_TYPE:
				return getOsType();
			case ExecutionRequirementsPackage.OS_REQUIREMENT__IS64OS:
				return isIs64os();
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
			case ExecutionRequirementsPackage.OS_REQUIREMENT__OS_TYPE:
				setOsType((String)newValue);
				return;
			case ExecutionRequirementsPackage.OS_REQUIREMENT__IS64OS:
				setIs64os((Boolean)newValue);
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
			case ExecutionRequirementsPackage.OS_REQUIREMENT__OS_TYPE:
				setOsType(OS_TYPE_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.OS_REQUIREMENT__IS64OS:
				setIs64os(IS64OS_EDEFAULT);
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
			case ExecutionRequirementsPackage.OS_REQUIREMENT__OS_TYPE:
				return OS_TYPE_EDEFAULT == null ? osType != null : !OS_TYPE_EDEFAULT.equals(osType);
			case ExecutionRequirementsPackage.OS_REQUIREMENT__IS64OS:
				return is64os != IS64OS_EDEFAULT;
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
		result.append(" (osType: ");
		result.append(osType);
		result.append(", is64os: ");
		result.append(is64os);
		result.append(')');
		return result.toString();
	}

} //OSRequirementImpl
