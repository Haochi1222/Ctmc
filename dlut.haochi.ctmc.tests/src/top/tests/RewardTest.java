/**
 */
package top.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import top.Reward;
import top.TopFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reward</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RewardTest extends TestCase {

	/**
	 * The fixture for this Reward test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reward fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RewardTest.class);
	}

	/**
	 * Constructs a new Reward test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RewardTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reward test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Reward fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reward test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reward getFixture() {
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
		setFixture(TopFactory.eINSTANCE.createReward());
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

} //RewardTest
