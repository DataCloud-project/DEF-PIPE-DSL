/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsFactory;
import se.kth.datacloud.dsl.ExecutionRequirements.HorizontalScaleRequirement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Horizontal Scale Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HorizontalScaleRequirementTest extends ScaleRequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HorizontalScaleRequirementTest.class);
	}

	/**
	 * Constructs a new Horizontal Scale Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalScaleRequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Horizontal Scale Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HorizontalScaleRequirement getFixture() {
		return (HorizontalScaleRequirement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExecutionRequirementsFactory.eINSTANCE.createHorizontalScaleRequirement());
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

} //HorizontalScaleRequirementTest
