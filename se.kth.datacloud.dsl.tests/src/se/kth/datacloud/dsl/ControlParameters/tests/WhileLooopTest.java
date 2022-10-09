/**
 */
package se.kth.datacloud.dsl.ControlParameters.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.ControlParameters.ControlParametersFactory;
import se.kth.datacloud.dsl.ControlParameters.WhileLooop;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>While Looop</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WhileLooopTest extends LoopTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WhileLooopTest.class);
	}

	/**
	 * Constructs a new While Looop test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhileLooopTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this While Looop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WhileLooop getFixture() {
		return (WhileLooop)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ControlParametersFactory.eINSTANCE.createWhileLooop());
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

} //WhileLooopTest
