/**
 */
package se.kth.datacloud.dsl.ControlParameters.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import se.kth.datacloud.dsl.ControlParameters.ConditionSet;
import se.kth.datacloud.dsl.ControlParameters.ControlParametersPackage;
import se.kth.datacloud.dsl.ControlParameters.PostCondition;
import se.kth.datacloud.dsl.ControlParameters.PreCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.impl.ConditionSetImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link se.kth.datacloud.dsl.ControlParameters.impl.ConditionSetImpl#getPost <em>Post</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionSetImpl extends MinimalEObjectImpl.Container implements ConditionSet {
	/**
	 * The cached value of the '{@link #getPre() <em>Pre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre()
	 * @generated
	 * @ordered
	 */
	protected PreCondition pre;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected PostCondition post;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlParametersPackage.Literals.CONDITION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreCondition getPre() {
		if (pre != null && pre.eIsProxy()) {
			InternalEObject oldPre = (InternalEObject)pre;
			pre = (PreCondition)eResolveProxy(oldPre);
			if (pre != oldPre) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlParametersPackage.CONDITION_SET__PRE, oldPre, pre));
			}
		}
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreCondition basicGetPre() {
		return pre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPre(PreCondition newPre) {
		PreCondition oldPre = pre;
		pre = newPre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlParametersPackage.CONDITION_SET__PRE, oldPre, pre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostCondition getPost() {
		if (post != null && post.eIsProxy()) {
			InternalEObject oldPost = (InternalEObject)post;
			post = (PostCondition)eResolveProxy(oldPost);
			if (post != oldPost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlParametersPackage.CONDITION_SET__POST, oldPost, post));
			}
		}
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostCondition basicGetPost() {
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPost(PostCondition newPost) {
		PostCondition oldPost = post;
		post = newPost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlParametersPackage.CONDITION_SET__POST, oldPost, post));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlParametersPackage.CONDITION_SET__PRE:
				if (resolve) return getPre();
				return basicGetPre();
			case ControlParametersPackage.CONDITION_SET__POST:
				if (resolve) return getPost();
				return basicGetPost();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ControlParametersPackage.CONDITION_SET__PRE:
				setPre((PreCondition)newValue);
				return;
			case ControlParametersPackage.CONDITION_SET__POST:
				setPost((PostCondition)newValue);
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
			case ControlParametersPackage.CONDITION_SET__PRE:
				setPre((PreCondition)null);
				return;
			case ControlParametersPackage.CONDITION_SET__POST:
				setPost((PostCondition)null);
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
			case ControlParametersPackage.CONDITION_SET__PRE:
				return pre != null;
			case ControlParametersPackage.CONDITION_SET__POST:
				return post != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionSetImpl
