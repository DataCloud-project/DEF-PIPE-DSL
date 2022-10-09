/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsFactory;
import se.kth.datacloud.dsl.ExecutionRequirements.QuantitativeHardwareRequirement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quantitative Hardware Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuantitativeHardwareRequirementTest extends HardwareRequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuantitativeHardwareRequirementTest.class);
	}

	/**
	 * Constructs a new Quantitative Hardware Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantitativeHardwareRequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Quantitative Hardware Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QuantitativeHardwareRequirement getFixture() {
		return (QuantitativeHardwareRequirement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExecutionRequirementsFactory.eINSTANCE.createQuantitativeHardwareRequirement());
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

} //QuantitativeHardwareRequirementTest
