/**
 */
package top.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import top.Ctmc;
import top.TopFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ctmc</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CtmcTest extends TestCase {

	/**
	 * The fixture for this Ctmc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ctmc fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CtmcTest.class);
	}

	/**
	 * Constructs a new Ctmc test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CtmcTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ctmc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Ctmc fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ctmc test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Ctmc getFixture() {
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
		setFixture(TopFactory.eINSTANCE.createCtmc());
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

} //CtmcTest
