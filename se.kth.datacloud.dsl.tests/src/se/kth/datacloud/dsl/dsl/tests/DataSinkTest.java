/**
 */
package se.kth.datacloud.dsl.dsl.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.dsl.DataSink;
import se.kth.datacloud.dsl.dsl.DslFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Sink</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSinkTest extends StepTemplateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataSinkTest.class);
	}

	/**
	 * Constructs a new Data Sink test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Sink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataSink getFixture() {
		return (DataSink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DslFactory.eINSTANCE.createDataSink());
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

} //DataSinkTest
