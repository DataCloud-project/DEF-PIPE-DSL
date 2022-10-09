/**
 */
package se.kth.datacloud.dsl.Triggers.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.Triggers.ScheduleTrigger;
import se.kth.datacloud.dsl.Triggers.TriggersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Schedule Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScheduleTriggerTest extends TriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ScheduleTriggerTest.class);
	}

	/**
	 * Constructs a new Schedule Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Schedule Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ScheduleTrigger getFixture() {
		return (ScheduleTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TriggersFactory.eINSTANCE.createScheduleTrigger());
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

} //ScheduleTriggerTest
