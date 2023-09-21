/**
 */
package top;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ctmc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.Ctmc#getName <em>Name</em>}</li>
 *   <li>{@link top.Ctmc#getStates <em>States</em>}</li>
 *   <li>{@link top.Ctmc#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link top.Ctmc#getRewards <em>Rewards</em>}</li>
 *   <li>{@link top.Ctmc#getFormulas <em>Formulas</em>}</li>
 * </ul>
 *
 * @see top.TopPackage#getCtmc()
 * @model
 * @generated
 */
public interface Ctmc extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see top.TopPackage#getCtmc_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link top.Ctmc#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link top.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see top.TopPackage#getCtmc_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link top.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see top.TopPackage#getCtmc_Transitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Rewards</b></em>' containment reference list.
	 * The list contents are of type {@link top.Reward}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rewards</em>' containment reference list.
	 * @see top.TopPackage#getCtmc_Rewards()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reward> getRewards();

	/**
	 * Returns the value of the '<em><b>Formulas</b></em>' containment reference list.
	 * The list contents are of type {@link top.Formula}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulas</em>' containment reference list.
	 * @see top.TopPackage#getCtmc_Formulas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Formula> getFormulas();

} // Ctmc
