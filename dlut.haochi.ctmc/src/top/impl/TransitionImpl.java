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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import top.Action;
import top.Formula;
import top.State;
import top.TopPackage;
import top.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link top.impl.TransitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link top.impl.TransitionImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link top.impl.TransitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link top.impl.TransitionImpl#getTo <em>To</em>}</li>
 *   <li>{@link top.impl.TransitionImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link top.impl.TransitionImpl#getFormulas <em>Formulas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
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
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final double PROBABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected double probability = PROBABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<State> from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected EList<State> to;

	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

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
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopPackage.Literals.TRANSITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TopPackage.TRANSITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopPackage.TRANSITION__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getFrom() {
		if (from == null) {
			from = new EObjectResolvingEList<State>(State.class, this, TopPackage.TRANSITION__FROM);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getTo() {
		if (to == null) {
			to = new EObjectResolvingEList<State>(State.class, this, TopPackage.TRANSITION__TO);
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EObjectContainmentEList<Action>(Action.class, this, TopPackage.TRANSITION__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Formula> getFormulas() {
		if (formulas == null) {
			formulas = new EObjectContainmentEList<Formula>(Formula.class, this, TopPackage.TRANSITION__FORMULAS);
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
			case TopPackage.TRANSITION__ACTIONS:
				return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
			case TopPackage.TRANSITION__FORMULAS:
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
			case TopPackage.TRANSITION__NAME:
				return getName();
			case TopPackage.TRANSITION__PROBABILITY:
				return getProbability();
			case TopPackage.TRANSITION__FROM:
				return getFrom();
			case TopPackage.TRANSITION__TO:
				return getTo();
			case TopPackage.TRANSITION__ACTIONS:
				return getActions();
			case TopPackage.TRANSITION__FORMULAS:
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
			case TopPackage.TRANSITION__NAME:
				setName((String)newValue);
				return;
			case TopPackage.TRANSITION__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case TopPackage.TRANSITION__FROM:
				getFrom().clear();
				getFrom().addAll((Collection<? extends State>)newValue);
				return;
			case TopPackage.TRANSITION__TO:
				getTo().clear();
				getTo().addAll((Collection<? extends State>)newValue);
				return;
			case TopPackage.TRANSITION__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends Action>)newValue);
				return;
			case TopPackage.TRANSITION__FORMULAS:
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
			case TopPackage.TRANSITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TopPackage.TRANSITION__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case TopPackage.TRANSITION__FROM:
				getFrom().clear();
				return;
			case TopPackage.TRANSITION__TO:
				getTo().clear();
				return;
			case TopPackage.TRANSITION__ACTIONS:
				getActions().clear();
				return;
			case TopPackage.TRANSITION__FORMULAS:
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
			case TopPackage.TRANSITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TopPackage.TRANSITION__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case TopPackage.TRANSITION__FROM:
				return from != null && !from.isEmpty();
			case TopPackage.TRANSITION__TO:
				return to != null && !to.isEmpty();
			case TopPackage.TRANSITION__ACTIONS:
				return actions != null && !actions.isEmpty();
			case TopPackage.TRANSITION__FORMULAS:
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
		result.append(", probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
