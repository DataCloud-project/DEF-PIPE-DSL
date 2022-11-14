/**
 */
package se.kth.datacloud.dsl.ResourceProviders.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import se.kth.datacloud.dsl.ResourceProviders.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceProvidersFactoryImpl extends EFactoryImpl implements ResourceProvidersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ResourceProvidersFactory init() {
		try {
			ResourceProvidersFactory theResourceProvidersFactory = (ResourceProvidersFactory)EPackage.Registry.INSTANCE.getEFactory(ResourceProvidersPackage.eNS_URI);
			if (theResourceProvidersFactory != null) {
				return theResourceProvidersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ResourceProvidersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceProvidersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ResourceProvidersPackage.CLOUD_PROVIDER: return createCloudProvider();
			case ResourceProvidersPackage.FOG_PROVIDER: return createFogProvider();
			case ResourceProvidersPackage.EDGE_PROVIDER: return createEdgeProvider();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProvider createCloudProvider() {
		CloudProviderImpl cloudProvider = new CloudProviderImpl();
		return cloudProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogProvider createFogProvider() {
		FogProviderImpl fogProvider = new FogProviderImpl();
		return fogProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeProvider createEdgeProvider() {
		EdgeProviderImpl edgeProvider = new EdgeProviderImpl();
		return edgeProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceProvidersPackage getResourceProvidersPackage() {
		return (ResourceProvidersPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ResourceProvidersPackage getPackage() {
		return ResourceProvidersPackage.eINSTANCE;
	}

} //ResourceProvidersFactoryImpl
