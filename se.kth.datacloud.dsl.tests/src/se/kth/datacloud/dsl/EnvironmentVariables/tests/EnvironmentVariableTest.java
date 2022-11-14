/**
 */
package se.kth.datacloud.dsl.EnvironmentVariables.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariable;
import se.kth.datacloud.dsl.EnvironmentVariables.EnvironmentVariablesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Environment Variable</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnvironmentVariableTest extends TestCase {

	/**
	 * The fixture for this Environment Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentVariable fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnvironmentVariableTest.class);
	}

	/**
	 * Constructs a new Environment Variable test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentVariableTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Environment Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EnvironmentVariable fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Environment Variable test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentVariable getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EnvironmentVariablesFactory.eINSTANCE.createEnvironmentVariable());
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

} //EnvironmentVariableTest
