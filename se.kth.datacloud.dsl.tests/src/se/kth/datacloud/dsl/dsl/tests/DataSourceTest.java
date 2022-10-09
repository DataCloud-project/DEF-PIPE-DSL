/**
 */
package se.kth.datacloud.dsl.dsl.tests;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.dsl.DataSource;
import se.kth.datacloud.dsl.dsl.DslFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Source</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataSourceTest extends StepTemplateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataSourceTest.class);
	}

	/**
	 * Constructs a new Data Source test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Source test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataSource getFixture() {
		return (DataSource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DslFactory.eINSTANCE.createDataSource());
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

} //DataSourceTest
