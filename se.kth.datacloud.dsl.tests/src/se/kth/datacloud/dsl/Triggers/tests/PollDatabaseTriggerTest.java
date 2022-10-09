/**
 */
package se.kth.datacloud.dsl.Triggers.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.Triggers.PollDatabaseTrigger;
import se.kth.datacloud.dsl.Triggers.TriggersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Poll Database Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PollDatabaseTriggerTest extends PollingTriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PollDatabaseTriggerTest.class);
	}

	/**
	 * Constructs a new Poll Database Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollDatabaseTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Poll Database Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PollDatabaseTrigger getFixture() {
		return (PollDatabaseTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TriggersFactory.eINSTANCE.createPollDatabaseTrigger());
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

} //PollDatabaseTriggerTest
