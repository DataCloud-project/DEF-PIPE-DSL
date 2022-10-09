/**
 */
package se.kth.datacloud.dsl.ResourceProviders.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.ResourceProviders.EdgeProvider;
import se.kth.datacloud.dsl.ResourceProviders.ResourceProvidersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Edge Provider</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EdgeProviderTest extends ResourceProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EdgeProviderTest.class);
	}

	/**
	 * Constructs a new Edge Provider test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Edge Provider test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EdgeProvider getFixture() {
		return (EdgeProvider)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResourceProvidersFactory.eINSTANCE.createEdgeProvider());
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

} //EdgeProviderTest
