/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OS Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement#getOsType <em>Os Type</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement#isIs64os <em>Is64os</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getOSRequirement()
 * @model
 * @generated
 */
public interface OSRequirement extends OSOrImageRequirement {
	/**
	 * Returns the value of the '<em><b>Os Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Type</em>' attribute.
	 * @see #setOsType(String)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getOSRequirement_OsType()
	 * @model
	 * @generated
	 */
	String getOsType();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement#getOsType <em>Os Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Type</em>' attribute.
	 * @see #getOsType()
	 * @generated
	 */
	void setOsType(String value);

	/**
	 * Returns the value of the '<em><b>Is64os</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is64os</em>' attribute.
	 * @see #setIs64os(boolean)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getOSRequirement_Is64os()
	 * @model default="true"
	 * @generated
	 */
	boolean isIs64os();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement#isIs64os <em>Is64os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is64os</em>' attribute.
	 * @see #isIs64os()
	 * @generated
	 */
	void setIs64os(boolean value);

} // OSRequirement
