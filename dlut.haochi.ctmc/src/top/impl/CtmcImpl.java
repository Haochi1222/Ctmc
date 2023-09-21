/**
 */
package top.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import top.Ctmc;
import top.Formula;
import top.Reward;
import top.State;
import top.TopPackage;
import top.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ctmc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.impl.CtmcImpl#getName <em>Name</em>}</li>
 *   <li>{@link top.impl.CtmcImpl#getStates <em>States</em>}</li>
 *   <li>{@link top.impl.CtmcImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link top.impl.CtmcImpl#getRewards <em>Rewards</em>}</li>
 *   <li>{@link top.impl.CtmcImpl#getFormulas <em>Formulas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CtmcImpl extends MinimalEObjectImpl.Container implements Ctmc {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getRewards() <em>Rewards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRewards()
	 * @generated
	 * @ordered
	 */
	protected EList<Reward> rewards;

	/**
	 * The cached value of the '{@link #getFormulas() <em>Formulas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormulas()
	 * @generated
	 * @ordered
	 */
	protected EList<Formula> formulas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CtmcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopPackage.Literals.CTMC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopPackage.CTMC__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, TopPackage.CTMC__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, TopPackage.CTMC__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reward> getRewards() {
		if (rewards == null) {
			rewards = new EObjectContainmentEList<Reward>(Reward.class, this, TopPackage.CTMC__REWARDS);
		}
		return rewards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Formula> getFormulas() {
		if (formulas == null) {
			formulas = new EObjectContainmentEList<Formula>(Formula.class, this, TopPackage.CTMC__FORMULAS);
		}
		return formulas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopPackage.CTMC__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case TopPackage.CTMC__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case TopPackage.CTMC__REWARDS:
				return ((InternalEList<?>)getRewards()).basicRemove(otherEnd, msgs);
			case TopPackage.CTMC__FORMULAS:
				return ((InternalEList<?>)getFormulas()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TopPackage.CTMC__NAME:
				return getName();
			case TopPackage.CTMC__STATES:
				return getStates();
			case TopPackage.CTMC__TRANSITIONS:
				return getTransitions();
			case TopPackage.CTMC__REWARDS:
				return getRewards();
			case TopPackage.CTMC__FORMULAS:
				return getFormulas();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TopPackage.CTMC__NAME:
				setName((String)newValue);
				return;
			case TopPackage.CTMC__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case TopPackage.CTMC__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case TopPackage.CTMC__REWARDS:
				getRewards().clear();
				getRewards().addAll((Collection<? extends Reward>)newValue);
				return;
			case TopPackage.CTMC__FORMULAS:
				getFormulas().clear();
				getFormulas().addAll((Collection<? extends Formula>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TopPackage.CTMC__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TopPackage.CTMC__STATES:
				getStates().clear();
				return;
			case TopPackage.CTMC__TRANSITIONS:
				getTransitions().clear();
				return;
			case TopPackage.CTMC__REWARDS:
				getRewards().clear();
				return;
			case TopPackage.CTMC__FORMULAS:
				getFormulas().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TopPackage.CTMC__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TopPackage.CTMC__STATES:
				return states != null && !states.isEmpty();
			case TopPackage.CTMC__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case TopPackage.CTMC__REWARDS:
				return rewards != null && !rewards.isEmpty();
			case TopPackage.CTMC__FORMULAS:
				return formulas != null && !formulas.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CtmcImpl
