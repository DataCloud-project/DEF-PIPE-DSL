/**
 */
package se.kth.datacloud.dsl.ControlParameters.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.ControlParameters.CompositeCondition;
import se.kth.datacloud.dsl.ControlParameters.ControlParametersFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeConditionTest extends AbstractConditionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositeConditionTest.class);
	}

	/**
	 * Constructs a new Composite Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Composite Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompositeCondition getFixture() {
		return (CompositeCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ControlParametersFactory.eINSTANCE.createCompositeCondition());
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

} //CompositeConditionTest
