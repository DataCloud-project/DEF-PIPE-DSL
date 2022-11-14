/**
 */
package se.kth.datacloud.dsl.dsl.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.dsl.CompositeStep;
import se.kth.datacloud.dsl.dsl.DslFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composite Step</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeStepTest extends AbstractStepTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositeStepTest.class);
	}

	/**
	 * Constructs a new Composite Step test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeStepTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Composite Step test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompositeStep getFixture() {
		return (CompositeStep)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DslFactory.eINSTANCE.createCompositeStep());
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

} //CompositeStepTest
