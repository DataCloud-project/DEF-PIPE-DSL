/**
 */
package se.kth.datacloud.dsl.Triggers.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.Triggers.PollWebServiceTrigger;
import se.kth.datacloud.dsl.Triggers.TriggersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Poll Web Service Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PollWebServiceTriggerTest extends PollingTriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PollWebServiceTriggerTest.class);
	}

	/**
	 * Constructs a new Poll Web Service Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollWebServiceTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Poll Web Service Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PollWebServiceTrigger getFixture() {
		return (PollWebServiceTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TriggersFactory.eINSTANCE.createPollWebServiceTrigger());
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

} //PollWebServiceTriggerTest
