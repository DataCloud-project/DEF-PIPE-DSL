/**
 */
package se.kth.datacloud.dsl.ResourceProviders.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.ResourceProviders.CloudProvider;
import se.kth.datacloud.dsl.ResourceProviders.ResourceProvidersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cloud Provider</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudProviderTest extends ResourceProviderTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CloudProviderTest.class);
	}

	/**
	 * Constructs a new Cloud Provider test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudProviderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cloud Provider test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CloudProvider getFixture() {
		return (CloudProvider)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ResourceProvidersFactory.eINSTANCE.createCloudProvider());
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

} //CloudProviderTest
