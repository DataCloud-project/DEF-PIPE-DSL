/**
 */
package se.kth.datacloud.dsl.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.dsl.ContainerImplementation#getImageName <em>Image Name</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.dsl.DslPackage#getContainerImplementation()
 * @model
 * @generated
 */
public interface ContainerImplementation extends StepImplementation {
	/**
	 * Returns the value of the '<em><b>Image Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Name</em>' attribute.
	 * @see #setImageName(String)
	 * @see se.kth.datacloud.dsl.dsl.DslPackage#getContainerImplementation_ImageName()
	 * @model
	 * @generated
	 */
	String getImageName();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.dsl.ContainerImplementation#getImageName <em>Image Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Name</em>' attribute.
	 * @see #getImageName()
	 * @generated
	 */
	void setImageName(String value);

} // ContainerImplementation
