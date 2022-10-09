/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Qualitative Hardware Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement#getMinBenchmark <em>Min Benchmark</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement#getMaxBenchmark <em>Max Benchmark</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement#getCpuArchitecture <em>Cpu Architecture</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement#getGpuArchitecture <em>Gpu Architecture</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getQualitativeHardwareRequirement()
 * @model
 * @generated
 */
public interface QualitativeHardwareRequirement extends HardwareRequirement {
	/**
	 * Returns the value of the '<em><b>Min Benchmark</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Benchmark</em>' attribute.
	 * @see #setMinBenchmark(double)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getQualitativeHardwareRequirement_MinBenchmark()
	 * @model default="0"
	 * @generated
	 */
	double getMinBenchmark();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement#getMinBenchmark <em>Min Benchmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Benchmark</em>' attribute.
	 * @see #getMinBenchmark()
	 * @generated
	 */
	void setMinBenchmark(double value);

	/**
	 * Returns the value of the '<em><b>Max Benchmark</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Benchmark</em>' attribute.
	 * @see #setMaxBenchmark(double)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getQualitativeHardwareRequirement_MaxBenchmark()
	 * @model default="0"
	 * @generated
	 */
	double getMaxBenchmark();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement#getMaxBenchmark <em>Max Benchmark</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Benchmark</em>' attribute.
	 * @see #getMaxBenchmark()
	 * @generated
	 */
	void setMaxBenchmark(double value);

	/**
	 * Returns the value of the '<em><b>Cpu Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cpu Architecture</em>' attribute.
	 * @see #setCpuArchitecture(String)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getQualitativeHardwareRequirement_CpuArchitecture()
	 * @model
	 * @generated
	 */
	String getCpuArchitecture();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement#getCpuArchitecture <em>Cpu Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cpu Architecture</em>' attribute.
	 * @see #getCpuArchitecture()
	 * @generated
	 */
	void setCpuArchitecture(String value);

	/**
	 * Returns the value of the '<em><b>Gpu Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gpu Architecture</em>' attribute.
	 * @see #setGpuArchitecture(String)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getQualitativeHardwareRequirement_GpuArchitecture()
	 * @model
	 * @generated
	 */
	String getGpuArchitecture();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement#getGpuArchitecture <em>Gpu Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gpu Architecture</em>' attribute.
	 * @see #getGpuArchitecture()
	 * @generated
	 */
	void setGpuArchitecture(String value);

} // QualitativeHardwareRequirement
