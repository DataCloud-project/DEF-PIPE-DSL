/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage;
import se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.NetworkRequirementImpl#getMinBandwidth <em>Min Bandwidth</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.NetworkRequirementImpl#getMaxBandwidth <em>Max Bandwidth</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.NetworkRequirementImpl#getMinLatency <em>Min Latency</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.NetworkRequirementImpl#getMaxLatency <em>Max Latency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NetworkRequirementImpl extends HardwareRequirementImpl implements NetworkRequirement {
	/**
	 * The default value of the '{@link #getMinBandwidth() <em>Min Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinBandwidth()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_BANDWIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinBandwidth() <em>Min Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinBandwidth()
	 * @generated
	 * @ordered
	 */
	protected double minBandwidth = MIN_BANDWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxBandwidth() <em>Max Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBandwidth()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_BANDWIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxBandwidth() <em>Max Bandwidth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBandwidth()
	 * @generated
	 * @ordered
	 */
	protected double maxBandwidth = MAX_BANDWIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinLatency() <em>Min Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLatency()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_LATENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinLatency() <em>Min Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLatency()
	 * @generated
	 * @ordered
	 */
	protected int minLatency = MIN_LATENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLatency() <em>Max Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLatency()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LATENCY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxLatency() <em>Max Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLatency()
	 * @generated
	 * @ordered
	 */
	protected int maxLatency = MAX_LATENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionRequirementsPackage.Literals.NETWORK_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinBandwidth() {
		return minBandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinBandwidth(double newMinBandwidth) {
		double oldMinBandwidth = minBandwidth;
		minBandwidth = newMinBandwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MIN_BANDWIDTH, oldMinBandwidth, minBandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxBandwidth() {
		return maxBandwidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBandwidth(double newMaxBandwidth) {
		double oldMaxBandwidth = maxBandwidth;
		maxBandwidth = newMaxBandwidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MAX_BANDWIDTH, oldMaxBandwidth, maxBandwidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinLatency() {
		return minLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLatency(int newMinLatency) {
		int oldMinLatency = minLatency;
		minLatency = newMinLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MIN_LATENCY, oldMinLatency, minLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxLatency() {
		return maxLatency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLatency(int newMaxLatency) {
		int oldMaxLatency = maxLatency;
		maxLatency = newMaxLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MAX_LATENCY, oldMaxLatency, maxLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MIN_BANDWIDTH:
				return getMinBandwidth();
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MAX_BANDWIDTH:
				return getMaxBandwidth();
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MIN_LATENCY:
				return getMinLatency();
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MAX_LATENCY:
				return getMaxLatency();
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
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MIN_BANDWIDTH:
				setMinBandwidth((Double)newValue);
				return;
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MAX_BANDWIDTH:
				setMaxBandwidth((Double)newValue);
				return;
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MIN_LATENCY:
				setMinLatency((Integer)newValue);
				return;
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MAX_LATENCY:
				setMaxLatency((Integer)newValue);
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
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MIN_BANDWIDTH:
				setMinBandwidth(MIN_BANDWIDTH_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MAX_BANDWIDTH:
				setMaxBandwidth(MAX_BANDWIDTH_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MIN_LATENCY:
				setMinLatency(MIN_LATENCY_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MAX_LATENCY:
				setMaxLatency(MAX_LATENCY_EDEFAULT);
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
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MIN_BANDWIDTH:
				return minBandwidth != MIN_BANDWIDTH_EDEFAULT;
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MAX_BANDWIDTH:
				return maxBandwidth != MAX_BANDWIDTH_EDEFAULT;
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MIN_LATENCY:
				return minLatency != MIN_LATENCY_EDEFAULT;
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MAX_LATENCY:
				return maxLatency != MAX_LATENCY_EDEFAULT;
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
		result.append(" (minBandwidth: ");
		result.append(minBandwidth);
		result.append(", maxBandwidth: ");
		result.append(maxBandwidth);
		result.append(", minLatency: ");
		result.append(minLatency);
		result.append(", maxLatency: ");
		result.append(maxLatency);
		result.append(')');
		return result.toString();
	}

} //NetworkRequirementImpl
