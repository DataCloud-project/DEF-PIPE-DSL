/**
 */
package se.kth.datacloud.dsl.ControlParameters.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.ControlParameters.ControlParametersFactory;
import se.kth.datacloud.dsl.ControlParameters.ForLoop;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>For Loop</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ForLoopTest extends LoopTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ForLoopTest.class);
	}

	/**
	 * Constructs a new For Loop test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForLoopTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this For Loop test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ForLoop getFixture() {
		return (ForLoop)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ControlParametersFactory.eINSTANCE.createForLoop());
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

} //ForLoopTest
