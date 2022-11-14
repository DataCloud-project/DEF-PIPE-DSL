/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsFactory;
import se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Network Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkRequirementTest extends HardwareRequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NetworkRequirementTest.class);
	}

	/**
	 * Constructs a new Network Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkRequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Network Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NetworkRequirement getFixture() {
		return (NetworkRequirement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExecutionRequirementsFactory.eINSTANCE.createNetworkRequirement());
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

} //NetworkRequirementTest
