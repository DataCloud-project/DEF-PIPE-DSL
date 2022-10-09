/**
 */
package se.kth.datacloud.dsl.ResourceProviders.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.ResourceProviders.FogProvider;
import se.kth.datacloud.dsl.ResourceProviders.ResourceProvidersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fog Provider</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FogProviderTest extends ResourceProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FogProviderTest.class);
	}

	/**
	 * Constructs a new Fog Provider test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FogProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Fog Provider test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FogProvider getFixture() {
		return (FogProvider)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResourceProvidersFactory.eINSTANCE.createFogProvider());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FogProviderTest
