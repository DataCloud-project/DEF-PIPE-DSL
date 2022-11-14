/**
 */
package se.kth.datacloud.dsl.ResourceProviders;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ResourceProviders.ResourceProvider#getProviderName <em>Provider Name</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ResourceProviders.ResourceProvider#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see se.kth.datacloud.dsl.ResourceProviders.ResourceProvidersPackage#getResourceProvider()
 * @model abstract="true"
 * @generated
 */
public interface ResourceProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Name</em>' attribute.
	 * @see #setProviderName(String)
	 * @see se.kth.datacloud.dsl.ResourceProviders.ResourceProvidersPackage#getResourceProvider_ProviderName()
	 * @model
	 * @generated
	 */
	String getProviderName();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ResourceProviders.ResourceProvider#getProviderName <em>Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provider Name</em>' attribute.
	 * @see #getProviderName()
	 * @generated
	 */
	void setProviderName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see se.kth.datacloud.dsl.ResourceProviders.ResourceProvidersPackage#getResourceProvider_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link se.kth.datacloud.dsl.ResourceProviders.ResourceProvider#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // ResourceProvider
