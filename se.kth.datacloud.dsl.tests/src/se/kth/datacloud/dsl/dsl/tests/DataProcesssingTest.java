/**
 */
package se.kth.datacloud.dsl.dsl.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.dsl.DataProcesssing;
import se.kth.datacloud.dsl.dsl.DslFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Processsing</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataProcesssingTest extends StepTemplateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataProcesssingTest.class);
	}

	/**
	 * Constructs a new Data Processsing test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProcesssingTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Processsing test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataProcesssing getFixture() {
		return (DataProcesssing)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DslFactory.eINSTANCE.createDataProcesssing());
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

} //DataProcesssingTest
