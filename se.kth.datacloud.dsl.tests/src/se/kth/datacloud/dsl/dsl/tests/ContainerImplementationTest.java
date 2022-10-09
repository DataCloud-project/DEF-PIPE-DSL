/**
 */
package se.kth.datacloud.dsl.dsl.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.dsl.ContainerImplementation;
import se.kth.datacloud.dsl.dsl.DslFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Container Implementation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContainerImplementationTest extends StepImplementationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContainerImplementationTest.class);
	}

	/**
	 * Constructs a new Container Implementation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerImplementationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Container Implementation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ContainerImplementation getFixture() {
		return (ContainerImplementation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DslFactory.eINSTANCE.createContainerImplementation());
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

} //ContainerImplementationTest
