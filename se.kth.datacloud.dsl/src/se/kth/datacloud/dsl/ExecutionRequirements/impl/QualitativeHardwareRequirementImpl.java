/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage;
import se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualitative Hardware Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.QualitativeHardwareRequirementImpl#getMinBenchmark <em>Min Benchmark</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.QualitativeHardwareRequirementImpl#getMaxBenchmark <em>Max Benchmark</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.QualitativeHardwareRequirementImpl#getCpuArchitecture <em>Cpu Architecture</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.QualitativeHardwareRequirementImpl#getGpuArchitecture <em>Gpu Architecture</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualitativeHardwareRequirementImpl extends HardwareRequirementImpl implements QualitativeHardwareRequirement {
	/**
	 * The default value of the '{@link #getMinBenchmark() <em>Min Benchmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinBenchmark()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_BENCHMARK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinBenchmark() <em>Min Benchmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinBenchmark()
	 * @generated
	 * @ordered
	 */
	protected double minBenchmark = MIN_BENCHMARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxBenchmark() <em>Max Benchmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBenchmark()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_BENCHMARK_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxBenchmark() <em>Max Benchmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBenchmark()
	 * @generated
	 * @ordered
	 */
	protected double maxBenchmark = MAX_BENCHMARK_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuArchitecture() <em>Cpu Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final String CPU_ARCHITECTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCpuArchitecture() <em>Cpu Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuArchitecture()
	 * @generated
	 * @ordered
	 */
	protected String cpuArchitecture = CPU_ARCHITECTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGpuArchitecture() <em>Gpu Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpuArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final String GPU_ARCHITECTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGpuArchitecture() <em>Gpu Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGpuArchitecture()
	 * @generated
	 * @ordered
	 */
	protected String gpuArchitecture = GPU_ARCHITECTURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualitativeHardwareRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionRequirementsPackage.Literals.QUALITATIVE_HARDWARE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinBenchmark() {
		return minBenchmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinBenchmark(double newMinBenchmark) {
		double oldMinBenchmark = minBenchmark;
		minBenchmark = newMinBenchmark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__MIN_BENCHMARK, oldMinBenchmark, minBenchmark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxBenchmark() {
		return maxBenchmark;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBenchmark(double newMaxBenchmark) {
		double oldMaxBenchmark = maxBenchmark;
		maxBenchmark = newMaxBenchmark;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__MAX_BENCHMARK, oldMaxBenchmark, maxBenchmark));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCpuArchitecture() {
		return cpuArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuArchitecture(String newCpuArchitecture) {
		String oldCpuArchitecture = cpuArchitecture;
		cpuArchitecture = newCpuArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__CPU_ARCHITECTURE, oldCpuArchitecture, cpuArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGpuArchitecture() {
		return gpuArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGpuArchitecture(String newGpuArchitecture) {
		String oldGpuArchitecture = gpuArchitecture;
		gpuArchitecture = newGpuArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__GPU_ARCHITECTURE, oldGpuArchitecture, gpuArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__MIN_BENCHMARK:
				return getMinBenchmark();
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__MAX_BENCHMARK:
				return getMaxBenchmark();
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__CPU_ARCHITECTURE:
				return getCpuArchitecture();
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__GPU_ARCHITECTURE:
				return getGpuArchitecture();
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
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__MIN_BENCHMARK:
				setMinBenchmark((Double)newValue);
				return;
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__MAX_BENCHMARK:
				setMaxBenchmark((Double)newValue);
				return;
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__CPU_ARCHITECTURE:
				setCpuArchitecture((String)newValue);
				return;
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__GPU_ARCHITECTURE:
				setGpuArchitecture((String)newValue);
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
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__MIN_BENCHMARK:
				setMinBenchmark(MIN_BENCHMARK_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__MAX_BENCHMARK:
				setMaxBenchmark(MAX_BENCHMARK_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__CPU_ARCHITECTURE:
				setCpuArchitecture(CPU_ARCHITECTURE_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__GPU_ARCHITECTURE:
				setGpuArchitecture(GPU_ARCHITECTURE_EDEFAULT);
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
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__MIN_BENCHMARK:
				return minBenchmark != MIN_BENCHMARK_EDEFAULT;
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__MAX_BENCHMARK:
				return maxBenchmark != MAX_BENCHMARK_EDEFAULT;
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__CPU_ARCHITECTURE:
				return CPU_ARCHITECTURE_EDEFAULT == null ? cpuArchitecture != null : !CPU_ARCHITECTURE_EDEFAULT.equals(cpuArchitecture);
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__GPU_ARCHITECTURE:
				return GPU_ARCHITECTURE_EDEFAULT == null ? gpuArchitecture != null : !GPU_ARCHITECTURE_EDEFAULT.equals(gpuArchitecture);
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
		result.append(" (minBenchmark: ");
		result.append(minBenchmark);
		result.append(", maxBenchmark: ");
		result.append(maxBenchmark);
		result.append(", cpuArchitecture: ");
		result.append(cpuArchitecture);
		result.append(", gpuArchitecture: ");
		result.append(gpuArchitecture);
		result.append(')');
		return result.toString();
	}

} //QualitativeHardwareRequirementImpl
