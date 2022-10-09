/**
 */
package se.kth.datacloud.dsl.Triggers.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.Triggers.CronScheduleTrigger;
import se.kth.datacloud.dsl.Triggers.TriggersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cron Schedule Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CronScheduleTriggerTest extends ScheduleTriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CronScheduleTriggerTest.class);
	}

	/**
	 * Constructs a new Cron Schedule Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CronScheduleTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Cron Schedule Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CronScheduleTrigger getFixture() {
		return (CronScheduleTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TriggersFactory.eINSTANCE.createCronScheduleTrigger());
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

} //CronScheduleTriggerTest
