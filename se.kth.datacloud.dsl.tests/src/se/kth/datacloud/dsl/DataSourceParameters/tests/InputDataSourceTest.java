/**
 */
package se.kth.datacloud.dsl.DataSourceParameters.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import se.kth.datacloud.dsl.DataSourceParameters.DataSourceParametersFactory;
import se.kth.datacloud.dsl.DataSourceParameters.InputDataSource;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Input Data Source</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputDataSourceTest extends TestCase {

	/**
	 * The fixture for this Input Data Source test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputDataSource fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InputDataSourceTest.class);
	}

	/**
	 * Constructs a new Input Data Source test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDataSourceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Input Data Source test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InputDataSource fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Input Data Source test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputDataSource getFixture() {
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
		setFixture(DataSourceParametersFactory.eINSTANCE.createInputDataSource());
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

} //InputDataSourceTest
