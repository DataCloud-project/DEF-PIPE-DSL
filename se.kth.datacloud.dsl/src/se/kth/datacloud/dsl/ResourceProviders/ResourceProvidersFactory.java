/**
 */
package se.kth.datacloud.dsl.ResourceProviders;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.ResourceProviders.ResourceProvidersPackage
 * @generated
 */
public interface ResourceProvidersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourceProvidersFactory eINSTANCE = se.kth.datacloud.dsl.ResourceProviders.impl.ResourceProvidersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cloud Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Provider</em>'.
	 * @generated
	 */
	CloudProvider createCloudProvider();

	/**
	 * Returns a new object of class '<em>Fog Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fog Provider</em>'.
	 * @generated
	 */
	FogProvider createFogProvider();

	/**
	 * Returns a new object of class '<em>Edge Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Edge Provider</em>'.
	 * @generated
	 */
	EdgeProvider createEdgeProvider();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ResourceProvidersPackage getResourceProvidersPackage();

} //ResourceProvidersFactory
