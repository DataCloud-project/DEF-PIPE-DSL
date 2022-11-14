/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsFactory;
import se.kth.datacloud.dsl.ExecutionRequirements.ServiceLevelCondition;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Service Level Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceLevelConditionTest extends TestCase {

	/**
	 * The fixture for this Service Level Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelCondition fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServiceLevelConditionTest.class);
	}

	/**
	 * Constructs a new Service Level Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceLevelConditionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Service Level Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ServiceLevelCondition fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Service Level Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceLevelCondition getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExecutionRequirementsFactory.eINSTANCE.createServiceLevelCondition());
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

} //ServiceLevelConditionTest
