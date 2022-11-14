/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage;
import se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quantitative Hardware Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.QuantitativeHardwareRequirementImpl#getMinCpu <em>Min Cpu</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.QuantitativeHardwareRequirementImpl#getMaxCpu <em>Max Cpu</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.QuantitativeHardwareRequirementImpl#getMinRamMiB <em>Min Ram Mi B</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.QuantitativeHardwareRequirementImpl#getMaxRamMiB <em>Max Ram Mi B</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.QuantitativeHardwareRequirementImpl#getMinStorageMB <em>Min Storage MB</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.QuantitativeHardwareRequirementImpl#getMaxStorageMB <em>Max Storage MB</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.QuantitativeHardwareRequirementImpl#getCpuFrequency <em>Cpu Frequency</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.QuantitativeHardwareRequirementImpl#getCpuNumberOfCores <em>Cpu Number Of Cores</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.QuantitativeHardwareRequirementImpl#isGpuAvailability <em>Gpu Availability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuantitativeHardwareRequirementImpl extends HardwareRequirementImpl implements QuantitativeHardwareRequirement {
	/**
	 * The default value of the '{@link #getMinCpu() <em>Min Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCpu()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_CPU_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinCpu() <em>Min Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCpu()
	 * @generated
	 * @ordered
	 */
	protected double minCpu = MIN_CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCpu() <em>Max Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCpu()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_CPU_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaxCpu() <em>Max Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCpu()
	 * @generated
	 * @ordered
	 */
	protected double maxCpu = MAX_CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinRamMiB() <em>Min Ram Mi B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRamMiB()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_RAM_MI_B_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinRamMiB() <em>Min Ram Mi B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinRamMiB()
	 * @generated
	 * @ordered
	 */
	protected int minRamMiB = MIN_RAM_MI_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxRamMiB() <em>Max Ram Mi B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRamMiB()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_RAM_MI_B_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxRamMiB() <em>Max Ram Mi B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxRamMiB()
	 * @generated
	 * @ordered
	 */
	protected int maxRamMiB = MAX_RAM_MI_B_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinStorageMB() <em>Min Storage MB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinStorageMB()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_STORAGE_MB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinStorageMB() <em>Min Storage MB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinStorageMB()
	 * @generated
	 * @ordered
	 */
	protected int minStorageMB = MIN_STORAGE_MB_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxStorageMB() <em>Max Storage MB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStorageMB()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_STORAGE_MB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxStorageMB() <em>Max Storage MB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxStorageMB()
	 * @generated
	 * @ordered
	 */
	protected int maxStorageMB = MAX_STORAGE_MB_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuFrequency() <em>Cpu Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final double CPU_FREQUENCY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCpuFrequency() <em>Cpu Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuFrequency()
	 * @generated
	 * @ordered
	 */
	protected double cpuFrequency = CPU_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCpuNumberOfCores() <em>Cpu Number Of Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuNumberOfCores()
	 * @generated
	 * @ordered
	 */
	protected static final int CPU_NUMBER_OF_CORES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCpuNumberOfCores() <em>Cpu Number Of Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCpuNumberOfCores()
	 * @generated
	 * @ordered
	 */
	protected int cpuNumberOfCores = CPU_NUMBER_OF_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #isGpuAvailability() <em>Gpu Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGpuAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GPU_AVAILABILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGpuAvailability() <em>Gpu Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGpuAvailability()
	 * @generated
	 * @ordered
	 */
	protected boolean gpuAvailability = GPU_AVAILABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuantitativeHardwareRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionRequirementsPackage.Literals.QUANTITATIVE_HARDWARE_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinCpu() {
		return minCpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCpu(double newMinCpu) {
		double oldMinCpu = minCpu;
		minCpu = newMinCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CPU, oldMinCpu, minCpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxCpu() {
		return maxCpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCpu(double newMaxCpu) {
		double oldMaxCpu = maxCpu;
		maxCpu = newMaxCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CPU, oldMaxCpu, maxCpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinRamMiB() {
		return minRamMiB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinRamMiB(int newMinRamMiB) {
		int oldMinRamMiB = minRamMiB;
		minRamMiB = newMinRamMiB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_RAM_MI_B, oldMinRamMiB, minRamMiB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxRamMiB() {
		return maxRamMiB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxRamMiB(int newMaxRamMiB) {
		int oldMaxRamMiB = maxRamMiB;
		maxRamMiB = newMaxRamMiB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_RAM_MI_B, oldMaxRamMiB, maxRamMiB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinStorageMB() {
		return minStorageMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinStorageMB(int newMinStorageMB) {
		int oldMinStorageMB = minStorageMB;
		minStorageMB = newMinStorageMB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_STORAGE_MB, oldMinStorageMB, minStorageMB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxStorageMB() {
		return maxStorageMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxStorageMB(int newMaxStorageMB) {
		int oldMaxStorageMB = maxStorageMB;
		maxStorageMB = newMaxStorageMB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_STORAGE_MB, oldMaxStorageMB, maxStorageMB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCpuFrequency() {
		return cpuFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuFrequency(double newCpuFrequency) {
		double oldCpuFrequency = cpuFrequency;
		cpuFrequency = newCpuFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__CPU_FREQUENCY, oldCpuFrequency, cpuFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCpuNumberOfCores() {
		return cpuNumberOfCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCpuNumberOfCores(int newCpuNumberOfCores) {
		int oldCpuNumberOfCores = cpuNumberOfCores;
		cpuNumberOfCores = newCpuNumberOfCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__CPU_NUMBER_OF_CORES, oldCpuNumberOfCores, cpuNumberOfCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGpuAvailability() {
		return gpuAvailability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGpuAvailability(boolean newGpuAvailability) {
		boolean oldGpuAvailability = gpuAvailability;
		gpuAvailability = newGpuAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__GPU_AVAILABILITY, oldGpuAvailability, gpuAvailability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CPU:
				return getMinCpu();
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CPU:
				return getMaxCpu();
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_RAM_MI_B:
				return getMinRamMiB();
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_RAM_MI_B:
				return getMaxRamMiB();
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_STORAGE_MB:
				return getMinStorageMB();
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_STORAGE_MB:
				return getMaxStorageMB();
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__CPU_FREQUENCY:
				return getCpuFrequency();
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__CPU_NUMBER_OF_CORES:
				return getCpuNumberOfCores();
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__GPU_AVAILABILITY:
				return isGpuAvailability();
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
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CPU:
				setMinCpu((Double)newValue);
				return;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CPU:
				setMaxCpu((Double)newValue);
				return;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_RAM_MI_B:
				setMinRamMiB((Integer)newValue);
				return;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_RAM_MI_B:
				setMaxRamMiB((Integer)newValue);
				return;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_STORAGE_MB:
				setMinStorageMB((Integer)newValue);
				return;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_STORAGE_MB:
				setMaxStorageMB((Integer)newValue);
				return;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__CPU_FREQUENCY:
				setCpuFrequency((Double)newValue);
				return;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__CPU_NUMBER_OF_CORES:
				setCpuNumberOfCores((Integer)newValue);
				return;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__GPU_AVAILABILITY:
				setGpuAvailability((Boolean)newValue);
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
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CPU:
				setMinCpu(MIN_CPU_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CPU:
				setMaxCpu(MAX_CPU_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_RAM_MI_B:
				setMinRamMiB(MIN_RAM_MI_B_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_RAM_MI_B:
				setMaxRamMiB(MAX_RAM_MI_B_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_STORAGE_MB:
				setMinStorageMB(MIN_STORAGE_MB_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_STORAGE_MB:
				setMaxStorageMB(MAX_STORAGE_MB_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__CPU_FREQUENCY:
				setCpuFrequency(CPU_FREQUENCY_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__CPU_NUMBER_OF_CORES:
				setCpuNumberOfCores(CPU_NUMBER_OF_CORES_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__GPU_AVAILABILITY:
				setGpuAvailability(GPU_AVAILABILITY_EDEFAULT);
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
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_CPU:
				return minCpu != MIN_CPU_EDEFAULT;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_CPU:
				return maxCpu != MAX_CPU_EDEFAULT;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_RAM_MI_B:
				return minRamMiB != MIN_RAM_MI_B_EDEFAULT;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_RAM_MI_B:
				return maxRamMiB != MAX_RAM_MI_B_EDEFAULT;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MIN_STORAGE_MB:
				return minStorageMB != MIN_STORAGE_MB_EDEFAULT;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__MAX_STORAGE_MB:
				return maxStorageMB != MAX_STORAGE_MB_EDEFAULT;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__CPU_FREQUENCY:
				return cpuFrequency != CPU_FREQUENCY_EDEFAULT;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__CPU_NUMBER_OF_CORES:
				return cpuNumberOfCores != CPU_NUMBER_OF_CORES_EDEFAULT;
			case ExecutionRequirementsPackage.QUANTITATIVE_HARDWARE_REQUIREMENT__GPU_AVAILABILITY:
				return gpuAvailability != GPU_AVAILABILITY_EDEFAULT;
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
		result.append(" (minCpu: ");
		result.append(minCpu);
		result.append(", maxCpu: ");
		result.append(maxCpu);
		result.append(", minRamMiB: ");
		result.append(minRamMiB);
		result.append(", maxRamMiB: ");
		result.append(maxRamMiB);
		result.append(", minStorageMB: ");
		result.append(minStorageMB);
		result.append(", maxStorageMB: ");
		result.append(maxStorageMB);
		result.append(", cpuFrequency: ");
		result.append(cpuFrequency);
		result.append(", cpuNumberOfCores: ");
		result.append(cpuNumberOfCores);
		result.append(", gpuAvailability: ");
		result.append(gpuAvailability);
		result.append(')');
		return result.toString();
	}

} //QuantitativeHardwareRequirementImpl
