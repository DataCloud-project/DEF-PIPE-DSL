/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertical Scale Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMinCpu <em>Min Cpu</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMaxCpu <em>Max Cpu</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMinRamMiB <em>Min Ram Mi B</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMaxRamMiB <em>Max Ram Mi B</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMinCores <em>Min Cores</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMaxCores <em>Max Cores</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMinStorageMB <em>Min Storage MB</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMaxStorageMB <em>Max Storage MB</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getVerticalScaleRequirement()
 * @model
 * @generated
 */
public interface VerticalScaleRequirement extends ScaleRequirement {
	/**
	 * Returns the value of the '<em><b>Min Cpu</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Cpu</em>' attribute.
	 * @see #setMinCpu(double)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getVerticalScaleRequirement_MinCpu()
	 * @model default="0"
	 * @generated
	 */
	double getMinCpu();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMinCpu <em>Min Cpu</em>}' attribute.
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
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getVerticalScaleRequirement_MaxCpu()
	 * @model default="0"
	 * @generated
	 */
	double getMaxCpu();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMaxCpu <em>Max Cpu</em>}' attribute.
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
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getVerticalScaleRequirement_MinRamMiB()
	 * @model default="0"
	 * @generated
	 */
	int getMinRamMiB();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMinRamMiB <em>Min Ram Mi B</em>}' attribute.
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
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getVerticalScaleRequirement_MaxRamMiB()
	 * @model default="0"
	 * @generated
	 */
	int getMaxRamMiB();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMaxRamMiB <em>Max Ram Mi B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Ram Mi B</em>' attribute.
	 * @see #getMaxRamMiB()
	 * @generated
	 */
	void setMaxRamMiB(int value);

	/**
	 * Returns the value of the '<em><b>Min Cores</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Cores</em>' attribute.
	 * @see #setMinCores(int)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getVerticalScaleRequirement_MinCores()
	 * @model default="0"
	 * @generated
	 */
	int getMinCores();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMinCores <em>Min Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Cores</em>' attribute.
	 * @see #getMinCores()
	 * @generated
	 */
	void setMinCores(int value);

	/**
	 * Returns the value of the '<em><b>Max Cores</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Cores</em>' attribute.
	 * @see #setMaxCores(int)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getVerticalScaleRequirement_MaxCores()
	 * @model default="0"
	 * @generated
	 */
	int getMaxCores();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMaxCores <em>Max Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Cores</em>' attribute.
	 * @see #getMaxCores()
	 * @generated
	 */
	void setMaxCores(int value);

	/**
	 * Returns the value of the '<em><b>Min Storage MB</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Storage MB</em>' attribute.
	 * @see #setMinStorageMB(int)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getVerticalScaleRequirement_MinStorageMB()
	 * @model default="0"
	 * @generated
	 */
	int getMinStorageMB();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMinStorageMB <em>Min Storage MB</em>}' attribute.
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
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getVerticalScaleRequirement_MaxStorageMB()
	 * @model default="0"
	 * @generated
	 */
	int getMaxStorageMB();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement#getMaxStorageMB <em>Max Storage MB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Storage MB</em>' attribute.
	 * @see #getMaxStorageMB()
	 * @generated
	 */
	void setMaxStorageMB(int value);

} // VerticalScaleRequirement
