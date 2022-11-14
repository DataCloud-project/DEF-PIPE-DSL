/**
 */
package se.kth.datacloud.dsl.ResourceProviders;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see se.kth.datacloud.dsl.ResourceProviders.ResourceProvidersFactory
 * @model kind="package"
 * @generated
 */
public interface ResourceProvidersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ResourceProviders";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://datacloud.kth.se/dcdsl/ResourceProvider";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ResourceProviders";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourceProvidersPackage eINSTANCE = se.kth.datacloud.dsl.ResourceProviders.impl.ResourceProvidersPackageImpl.init();

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ResourceProviders.impl.ResourceProviderImpl <em>Resource Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ResourceProviders.impl.ResourceProviderImpl
	 * @see se.kth.datacloud.dsl.ResourceProviders.impl.ResourceProvidersPackageImpl#getResourceProvider()
	 * @generated
	 */
	int RESOURCE_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER__PROVIDER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Resource Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ResourceProviders.impl.CloudProviderImpl <em>Cloud Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ResourceProviders.impl.CloudProviderImpl
	 * @see se.kth.datacloud.dsl.ResourceProviders.impl.ResourceProvidersPackageImpl#getCloudProvider()
	 * @generated
	 */
	int CLOUD_PROVIDER = 1;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__PROVIDER_NAME = RESOURCE_PROVIDER__PROVIDER_NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER__LOCATION = RESOURCE_PROVIDER__LOCATION;

	/**
	 * The number of structural features of the '<em>Cloud Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER_FEATURE_COUNT = RESOURCE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cloud Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_PROVIDER_OPERATION_COUNT = RESOURCE_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ResourceProviders.impl.FogProviderImpl <em>Fog Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ResourceProviders.impl.FogProviderImpl
	 * @see se.kth.datacloud.dsl.ResourceProviders.impl.ResourceProvidersPackageImpl#getFogProvider()
	 * @generated
	 */
	int FOG_PROVIDER = 2;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_PROVIDER__PROVIDER_NAME = RESOURCE_PROVIDER__PROVIDER_NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_PROVIDER__LOCATION = RESOURCE_PROVIDER__LOCATION;

	/**
	 * The number of structural features of the '<em>Fog Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_PROVIDER_FEATURE_COUNT = RESOURCE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fog Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOG_PROVIDER_OPERATION_COUNT = RESOURCE_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link se.kth.datacloud.dsl.ResourceProviders.impl.EdgeProviderImpl <em>Edge Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see se.kth.datacloud.dsl.ResourceProviders.impl.EdgeProviderImpl
	 * @see se.kth.datacloud.dsl.ResourceProviders.impl.ResourceProvidersPackageImpl#getEdgeProvider()
	 * @generated
	 */
	int EDGE_PROVIDER = 3;

	/**
	 * The feature id for the '<em><b>Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_PROVIDER__PROVIDER_NAME = RESOURCE_PROVIDER__PROVIDER_NAME;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_PROVIDER__LOCATION = RESOURCE_PROVIDER__LOCATION;

	/**
	 * The number of structural features of the '<em>Edge Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_PROVIDER_FEATURE_COUNT = RESOURCE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Edge Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_PROVIDER_OPERATION_COUNT = RESOURCE_PROVIDER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ResourceProviders.ResourceProvider <em>Resource Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Provider</em>'.
	 * @see se.kth.datacloud.dsl.ResourceProviders.ResourceProvider
	 * @generated
	 */
	EClass getResourceProvider();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ResourceProviders.ResourceProvider#getProviderName <em>Provider Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Name</em>'.
	 * @see se.kth.datacloud.dsl.ResourceProviders.ResourceProvider#getProviderName()
	 * @see #getResourceProvider()
	 * @generated
	 */
	EAttribute getResourceProvider_ProviderName();

	/**
	 * Returns the meta object for the attribute '{@link se.kth.datacloud.dsl.ResourceProviders.ResourceProvider#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see se.kth.datacloud.dsl.ResourceProviders.ResourceProvider#getLocation()
	 * @see #getResourceProvider()
	 * @generated
	 */
	EAttribute getResourceProvider_Location();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ResourceProviders.CloudProvider <em>Cloud Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Provider</em>'.
	 * @see se.kth.datacloud.dsl.ResourceProviders.CloudProvider
	 * @generated
	 */
	EClass getCloudProvider();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ResourceProviders.FogProvider <em>Fog Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fog Provider</em>'.
	 * @see se.kth.datacloud.dsl.ResourceProviders.FogProvider
	 * @generated
	 */
	EClass getFogProvider();

	/**
	 * Returns the meta object for class '{@link se.kth.datacloud.dsl.ResourceProviders.EdgeProvider <em>Edge Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge Provider</em>'.
	 * @see se.kth.datacloud.dsl.ResourceProviders.EdgeProvider
	 * @generated
	 */
	EClass getEdgeProvider();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourceProvidersFactory getResourceProvidersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ResourceProviders.impl.ResourceProviderImpl <em>Resource Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ResourceProviders.impl.ResourceProviderImpl
		 * @see se.kth.datacloud.dsl.ResourceProviders.impl.ResourceProvidersPackageImpl#getResourceProvider()
		 * @generated
		 */
		EClass RESOURCE_PROVIDER = eINSTANCE.getResourceProvider();

		/**
		 * The meta object literal for the '<em><b>Provider Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROVIDER__PROVIDER_NAME = eINSTANCE.getResourceProvider_ProviderName();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROVIDER__LOCATION = eINSTANCE.getResourceProvider_Location();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ResourceProviders.impl.CloudProviderImpl <em>Cloud Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ResourceProviders.impl.CloudProviderImpl
		 * @see se.kth.datacloud.dsl.ResourceProviders.impl.ResourceProvidersPackageImpl#getCloudProvider()
		 * @generated
		 */
		EClass CLOUD_PROVIDER = eINSTANCE.getCloudProvider();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ResourceProviders.impl.FogProviderImpl <em>Fog Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ResourceProviders.impl.FogProviderImpl
		 * @see se.kth.datacloud.dsl.ResourceProviders.impl.ResourceProvidersPackageImpl#getFogProvider()
		 * @generated
		 */
		EClass FOG_PROVIDER = eINSTANCE.getFogProvider();

		/**
		 * The meta object literal for the '{@link se.kth.datacloud.dsl.ResourceProviders.impl.EdgeProviderImpl <em>Edge Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see se.kth.datacloud.dsl.ResourceProviders.impl.EdgeProviderImpl
		 * @see se.kth.datacloud.dsl.ResourceProviders.impl.ResourceProvidersPackageImpl#getEdgeProvider()
		 * @generated
		 */
		EClass EDGE_PROVIDER = eINSTANCE.getEdgeProvider();

	}

} //ResourceProvidersPackage
