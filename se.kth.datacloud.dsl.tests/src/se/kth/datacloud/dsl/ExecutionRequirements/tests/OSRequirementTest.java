/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsFactory;
import se.kth.datacloud.dsl.ExecutionRequirements.OSRequirement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>OS Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OSRequirementTest extends OSOrImageRequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OSRequirementTest.class);
	}

	/**
	 * Constructs a new OS Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSRequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this OS Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OSRequirement getFixture() {
		return (OSRequirement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExecutionRequirementsFactory.eINSTANCE.createOSRequirement());
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

} //OSRequirementTest
