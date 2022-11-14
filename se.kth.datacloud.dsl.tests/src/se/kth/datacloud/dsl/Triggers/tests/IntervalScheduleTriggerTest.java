/**
 */
package se.kth.datacloud.dsl.Triggers.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.Triggers.IntervalScheduleTrigger;
import se.kth.datacloud.dsl.Triggers.TriggersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Interval Schedule Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntervalScheduleTriggerTest extends ScheduleTriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IntervalScheduleTriggerTest.class);
	}

	/**
	 * Constructs a new Interval Schedule Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalScheduleTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Interval Schedule Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IntervalScheduleTrigger getFixture() {
		return (IntervalScheduleTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TriggersFactory.eINSTANCE.createIntervalScheduleTrigger());
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

} //IntervalScheduleTriggerTest
