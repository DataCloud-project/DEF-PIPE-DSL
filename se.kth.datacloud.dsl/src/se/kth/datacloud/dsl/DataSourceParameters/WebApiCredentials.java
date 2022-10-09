/**
 */
package se.kth.datacloud.dsl.DataSourceParameters;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Web Api Credentials</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.DataSourceParameters.WebApiCredentials#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersPackage#getWebApiCredentials()
 * @model abstract="true"
 * @generated
 */
public interface WebApiCredentials extends DataSourceCredentials {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersPackage#getWebApiCredentials_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.DataSourceParameters.WebApiCredentials#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // WebApiCredentials
