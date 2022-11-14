/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsFactory;
import se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Qualitative Hardware Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QualitativeHardwareRequirementTest extends HardwareRequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QualitativeHardwareRequirementTest.class);
	}

	/**
	 * Constructs a new Qualitative Hardware Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitativeHardwareRequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Qualitative Hardware Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QualitativeHardwareRequirement getFixture() {
		return (QualitativeHardwareRequirement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExecutionRequirementsFactory.eINSTANCE.createQualitativeHardwareRequirement());
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

} //QualitativeHardwareRequirementTest
