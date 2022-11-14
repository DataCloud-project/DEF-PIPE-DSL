/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ExecutionRequirements.ImageRequirement#getImageId <em>Image Id</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getImageRequirement()
 * @model
 * @generated
 */
public interface ImageRequirement extends OSOrImageRequirement {
	/**
	 * Returns the value of the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Id</em>' attribute.
	 * @see #setImageId(String)
	 * @see se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage#getImageRequirement_ImageId()
	 * @model
	 * @generated
	 */
	String getImageId();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ExecutionRequirements.ImageRequirement#getImageId <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Id</em>' attribute.
	 * @see #getImageId()
	 * @generated
	 */
	void setImageId(String value);

} // ImageRequirement
