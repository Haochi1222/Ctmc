/**
 */
package top;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link top.Transition#getName <em>Name</em>}</li>
 *   <li>{@link top.Transition#getProbability <em>Probability</em>}</li>
 *   <li>{@link top.Transition#getFrom <em>From</em>}</li>
 *   <li>{@link top.Transition#getTo <em>To</em>}</li>
 *   <li>{@link top.Transition#getActions <em>Actions</em>}</li>
 *   <li>{@link top.Transition#getFormulas <em>Formulas</em>}</li>
 * </ul>
 *
 * @see top.TopPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see top.TopPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link top.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see top.TopPackage#getTransition_Probability()
	 * @model
	 * @generated
	 */
	double getProbability();

	/**
	 * Sets the value of the '{@link top.Transition#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(double value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link top.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see top.TopPackage#getTransition_From()
	 * @model
	 * @generated
	 */
	EList<State> getFrom();

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference list.
	 * The list contents are of type {@link top.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference list.
	 * @see top.TopPackage#getTransition_To()
	 * @model
	 * @generated
	 */
	EList<State> getTo();

	/**
	 * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
	 * The list contents are of type {@link top.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' containment reference list.
	 * @see top.TopPackage#getTransition_Actions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Formulas</b></em>' containment reference list.
	 * The list contents are of type {@link top.Formula}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formulas</em>' containment reference list.
	 * @see top.TopPackage#getTransition_Formulas()
	 * @model containment="true"
	 * @generated
	 */
	EList<Formula> getFormulas();

} // Transition
