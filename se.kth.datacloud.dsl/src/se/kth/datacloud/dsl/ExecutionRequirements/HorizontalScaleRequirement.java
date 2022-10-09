/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Horizontal Scale Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement#getMinInstance <em>Min Instance</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement#getMaxInstance <em>Max Instance</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getHorizontalScaleRequirement()
 * @model
 * @generated
 */
public interface HorizontalScaleRequirement extends ScaleRequirement {
	/**
	 * Returns the value of the '<em><b>Min Instance</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Instance</em>' attribute.
	 * @see #setMinInstance(int)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getHorizontalScaleRequirement_MinInstance()
	 * @model default="0"
	 * @generated
	 */
	int getMinInstance();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement#getMinInstance <em>Min Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Instance</em>' attribute.
	 * @see #getMinInstance()
	 * @generated
	 */
	void setMinInstance(int value);

	/**
	 * Returns the value of the '<em><b>Max Instance</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Instance</em>' attribute.
	 * @see #setMaxInstance(int)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getHorizontalScaleRequirement_MaxInstance()
	 * @model default="0"
	 * @generated
	 */
	int getMaxInstance();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement#getMaxInstance <em>Max Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Instance</em>' attribute.
	 * @see #getMaxInstance()
	 * @generated
	 */
	void setMaxInstance(int value);

} // HorizontalScaleRequirement
