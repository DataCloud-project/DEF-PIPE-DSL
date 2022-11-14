/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quantitative Hardware Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMinCpu <em>Min Cpu</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMaxCpu <em>Max Cpu</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMinRamMiB <em>Min Ram Mi B</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMaxRamMiB <em>Max Ram Mi B</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMinStorageMB <em>Min Storage MB</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMaxStorageMB <em>Max Storage MB</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getCpuFrequency <em>Cpu Frequency</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getCpuNumberOfCores <em>Cpu Number Of Cores</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#isGpuAvailability <em>Gpu Availability</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getQuantitativeHardwareRequirement()
 * @model
 * @generated
 */
public interface QuantitativeHardwareRequirement extends HardwareRequirement {
	/**
	 * Returns the value of the '<em><b>Min Cpu</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Cpu</em>' attribute.
	 * @see #setMinCpu(double)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getQuantitativeHardwareRequirement_MinCpu()
	 * @model default="0"
	 * @generated
	 */
	double getMinCpu();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMinCpu <em>Min Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Cpu</em>' attribute.
	 * @see #getMinCpu()
	 * @generated
	 */
	void setMinCpu(double value);

	/**
	 * Returns the value of the '<em><b>Max Cpu</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Cpu</em>' attribute.
	 * @see #setMaxCpu(double)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getQuantitativeHardwareRequirement_MaxCpu()
	 * @model default="0"
	 * @generated
	 */
	double getMaxCpu();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMaxCpu <em>Max Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Cpu</em>' attribute.
	 * @see #getMaxCpu()
	 * @generated
	 */
	void setMaxCpu(double value);

	/**
	 * Returns the value of the '<em><b>Min Ram Mi B</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Ram Mi B</em>' attribute.
	 * @see #setMinRamMiB(int)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getQuantitativeHardwareRequirement_MinRamMiB()
	 * @model default="0"
	 * @generated
	 */
	int getMinRamMiB();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMinRamMiB <em>Min Ram Mi B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Ram Mi B</em>' attribute.
	 * @see #getMinRamMiB()
	 * @generated
	 */
	void setMinRamMiB(int value);

	/**
	 * Returns the value of the '<em><b>Max Ram Mi B</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Ram Mi B</em>' attribute.
	 * @see #setMaxRamMiB(int)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getQuantitativeHardwareRequirement_MaxRamMiB()
	 * @model default="0"
	 * @generated
	 */
	int getMaxRamMiB();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMaxRamMiB <em>Max Ram Mi B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Ram Mi B</em>' attribute.
	 * @see #getMaxRamMiB()
	 * @generated
	 */
	void setMaxRamMiB(int value);

	/**
	 * Returns the value of the '<em><b>Min Storage MB</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Storage MB</em>' attribute.
	 * @see #setMinStorageMB(int)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getQuantitativeHardwareRequirement_MinStorageMB()
	 * @model default="0"
	 * @generated
	 */
	int getMinStorageMB();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMinStorageMB <em>Min Storage MB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Storage MB</em>' attribute.
	 * @see #getMinStorageMB()
	 * @generated
	 */
	void setMinStorageMB(int value);

	/**
	 * Returns the value of the '<em><b>Max Storage MB</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Storage MB</em>' attribute.
	 * @see #setMaxStorageMB(int)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getQuantitativeHardwareRequirement_MaxStorageMB()
	 * @model default="0"
	 * @generated
	 */
	int getMaxStorageMB();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getMaxStorageMB <em>Max Storage MB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Storage MB</em>' attribute.
	 * @see #getMaxStorageMB()
	 * @generated
	 */
	void setMaxStorageMB(int value);

	/**
	 * Returns the value of the '<em><b>Cpu Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Frequency</em>' attribute.
	 * @see #setCpuFrequency(double)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getQuantitativeHardwareRequirement_CpuFrequency()
	 * @model
	 * @generated
	 */
	double getCpuFrequency();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getCpuFrequency <em>Cpu Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Frequency</em>' attribute.
	 * @see #getCpuFrequency()
	 * @generated
	 */
	void setCpuFrequency(double value);

	/**
	 * Returns the value of the '<em><b>Cpu Number Of Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Number Of Cores</em>' attribute.
	 * @see #setCpuNumberOfCores(int)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getQuantitativeHardwareRequirement_CpuNumberOfCores()
	 * @model
	 * @generated
	 */
	int getCpuNumberOfCores();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#getCpuNumberOfCores <em>Cpu Number Of Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Number Of Cores</em>' attribute.
	 * @see #getCpuNumberOfCores()
	 * @generated
	 */
	void setCpuNumberOfCores(int value);

	/**
	 * Returns the value of the '<em><b>Gpu Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gpu Availability</em>' attribute.
	 * @see #setGpuAvailability(boolean)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getQuantitativeHardwareRequirement_GpuAvailability()
	 * @model
	 * @generated
	 */
	boolean isGpuAvailability();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement#isGpuAvailability <em>Gpu Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gpu Availability</em>' attribute.
	 * @see #isGpuAvailability()
	 * @generated
	 */
	void setGpuAvailability(boolean value);

} // QuantitativeHardwareRequirement
