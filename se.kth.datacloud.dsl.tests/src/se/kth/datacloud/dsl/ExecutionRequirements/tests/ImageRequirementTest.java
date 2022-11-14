/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsFactory;
import se.kth.datacloud.dsl.ExecutionRequirements.ImageRequirement;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Image Requirement</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ImageRequirementTest extends OSOrImageRequirementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ImageRequirementTest.class);
	}

	/**
	 * Constructs a new Image Requirement test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageRequirementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Image Requirement test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ImageRequirement getFixture() {
		return (ImageRequirement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExecutionRequirementsFactory.eINSTANCE.createImageRequirement());
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

} //ImageRequirementTest
