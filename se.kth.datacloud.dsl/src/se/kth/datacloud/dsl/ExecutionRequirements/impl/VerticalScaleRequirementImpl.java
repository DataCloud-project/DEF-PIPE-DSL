/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage;
import se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertical Scale Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.VerticalScaleRequirementImpl#getMinCpu <em>Min Cpu</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.VerticalScaleRequirementImpl#getMaxCpu <em>Max Cpu</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.VerticalScaleRequirementImpl#getMinRamMiB <em>Min Ram Mi B</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.VerticalScaleRequirementImpl#getMaxRamMiB <em>Max Ram Mi B</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.VerticalScaleRequirementImpl#getMinCores <em>Min Cores</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.VerticalScaleRequirementImpl#getMaxCores <em>Max Cores</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.VerticalScaleRequirementImpl#getMinStorageMB <em>Min Storage MB</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.impl.VerticalScaleRequirementImpl#getMaxStorageMB <em>Max Storage MB</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VerticalScaleRequirementImpl extends ScaleRequirementImpl implements VerticalScaleRequirement {
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
	 * The default value of the '{@link #getMinCores() <em>Min Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCores()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_CORES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinCores() <em>Min Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCores()
	 * @generated
	 * @ordered
	 */
	protected int minCores = MIN_CORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCores() <em>Max Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCores()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_CORES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxCores() <em>Max Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCores()
	 * @generated
	 * @ordered
	 */
	protected int maxCores = MAX_CORES_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VerticalScaleRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionRequirementsPackage.Literals.VERTICAL_SCALE_REQUIREMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_CPU, oldMinCpu, minCpu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_CPU, oldMaxCpu, maxCpu));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_RAM_MI_B, oldMinRamMiB, minRamMiB));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_RAM_MI_B, oldMaxRamMiB, maxRamMiB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinCores() {
		return minCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCores(int newMinCores) {
		int oldMinCores = minCores;
		minCores = newMinCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_CORES, oldMinCores, minCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxCores() {
		return maxCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCores(int newMaxCores) {
		int oldMaxCores = maxCores;
		maxCores = newMaxCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_CORES, oldMaxCores, maxCores));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_STORAGE_MB, oldMinStorageMB, minStorageMB));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_STORAGE_MB, oldMaxStorageMB, maxStorageMB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_CPU:
				return getMinCpu();
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_CPU:
				return getMaxCpu();
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_RAM_MI_B:
				return getMinRamMiB();
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_RAM_MI_B:
				return getMaxRamMiB();
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_CORES:
				return getMinCores();
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_CORES:
				return getMaxCores();
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_STORAGE_MB:
				return getMinStorageMB();
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_STORAGE_MB:
				return getMaxStorageMB();
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
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_CPU:
				setMinCpu((Double)newValue);
				return;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_CPU:
				setMaxCpu((Double)newValue);
				return;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_RAM_MI_B:
				setMinRamMiB((Integer)newValue);
				return;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_RAM_MI_B:
				setMaxRamMiB((Integer)newValue);
				return;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_CORES:
				setMinCores((Integer)newValue);
				return;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_CORES:
				setMaxCores((Integer)newValue);
				return;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_STORAGE_MB:
				setMinStorageMB((Integer)newValue);
				return;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_STORAGE_MB:
				setMaxStorageMB((Integer)newValue);
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
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_CPU:
				setMinCpu(MIN_CPU_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_CPU:
				setMaxCpu(MAX_CPU_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_RAM_MI_B:
				setMinRamMiB(MIN_RAM_MI_B_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_RAM_MI_B:
				setMaxRamMiB(MAX_RAM_MI_B_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_CORES:
				setMinCores(MIN_CORES_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_CORES:
				setMaxCores(MAX_CORES_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_STORAGE_MB:
				setMinStorageMB(MIN_STORAGE_MB_EDEFAULT);
				return;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_STORAGE_MB:
				setMaxStorageMB(MAX_STORAGE_MB_EDEFAULT);
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
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_CPU:
				return minCpu != MIN_CPU_EDEFAULT;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_CPU:
				return maxCpu != MAX_CPU_EDEFAULT;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_RAM_MI_B:
				return minRamMiB != MIN_RAM_MI_B_EDEFAULT;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_RAM_MI_B:
				return maxRamMiB != MAX_RAM_MI_B_EDEFAULT;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_CORES:
				return minCores != MIN_CORES_EDEFAULT;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_CORES:
				return maxCores != MAX_CORES_EDEFAULT;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_STORAGE_MB:
				return minStorageMB != MIN_STORAGE_MB_EDEFAULT;
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_STORAGE_MB:
				return maxStorageMB != MAX_STORAGE_MB_EDEFAULT;
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
		result.append(", minCores: ");
		result.append(minCores);
		result.append(", maxCores: ");
		result.append(maxCores);
		result.append(", minStorageMB: ");
		result.append(minStorageMB);
		result.append(", maxStorageMB: ");
		result.append(maxStorageMB);
		result.append(')');
		return result.toString();
	}

} //VerticalScaleRequirementImpl
