/**
 */
package org.eclipse.incquery.examples.cps.model.impl;

import org.eclipse.incquery.examples.cps.model.CyberPhysicalSystem;
import org.eclipse.incquery.examples.cps.model.HostInstance;
import org.eclipse.incquery.examples.cps.model.HostType;
import org.eclipse.incquery.examples.cps.model.ModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Host Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.incquery.examples.cps.model.impl.HostTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.incquery.examples.cps.model.impl.HostTypeImpl#getDefaultCpu <em>Default Cpu</em>}</li>
 *   <li>{@link org.eclipse.incquery.examples.cps.model.impl.HostTypeImpl#getDefaultRam <em>Default Ram</em>}</li>
 *   <li>{@link org.eclipse.incquery.examples.cps.model.impl.HostTypeImpl#getDefaultHdd <em>Default Hdd</em>}</li>
 *   <li>{@link org.eclipse.incquery.examples.cps.model.impl.HostTypeImpl#getCps <em>Cps</em>}</li>
 *   <li>{@link org.eclipse.incquery.examples.cps.model.impl.HostTypeImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HostTypeImpl extends MinimalEObjectImpl.Container implements HostType {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultCpu() <em>Default Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCpu()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_CPU_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultCpu() <em>Default Cpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCpu()
	 * @generated
	 * @ordered
	 */
	protected int defaultCpu = DEFAULT_CPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultRam() <em>Default Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRam()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_RAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultRam() <em>Default Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultRam()
	 * @generated
	 * @ordered
	 */
	protected int defaultRam = DEFAULT_RAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultHdd() <em>Default Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHdd()
	 * @generated
	 * @ordered
	 */
	protected static final int DEFAULT_HDD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDefaultHdd() <em>Default Hdd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHdd()
	 * @generated
	 * @ordered
	 */
	protected int defaultHdd = DEFAULT_HDD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<HostInstance> instances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HostTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.HOST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HOST_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultCpu() {
		return defaultCpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultCpu(int newDefaultCpu) {
		int oldDefaultCpu = defaultCpu;
		defaultCpu = newDefaultCpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HOST_TYPE__DEFAULT_CPU, oldDefaultCpu, defaultCpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultRam() {
		return defaultRam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultRam(int newDefaultRam) {
		int oldDefaultRam = defaultRam;
		defaultRam = newDefaultRam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HOST_TYPE__DEFAULT_RAM, oldDefaultRam, defaultRam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDefaultHdd() {
		return defaultHdd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultHdd(int newDefaultHdd) {
		int oldDefaultHdd = defaultHdd;
		defaultHdd = newDefaultHdd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HOST_TYPE__DEFAULT_HDD, oldDefaultHdd, defaultHdd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CyberPhysicalSystem getCps() {
		if (eContainerFeatureID() != ModelPackage.HOST_TYPE__CPS) return null;
		return (CyberPhysicalSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCps(CyberPhysicalSystem newCps, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCps, ModelPackage.HOST_TYPE__CPS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCps(CyberPhysicalSystem newCps) {
		if (newCps != eInternalContainer() || (eContainerFeatureID() != ModelPackage.HOST_TYPE__CPS && newCps != null)) {
			if (EcoreUtil.isAncestor(this, newCps))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCps != null)
				msgs = ((InternalEObject)newCps).eInverseAdd(this, ModelPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES, CyberPhysicalSystem.class, msgs);
			msgs = basicSetCps(newCps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.HOST_TYPE__CPS, newCps, newCps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HostInstance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<HostInstance>(HostInstance.class, this, ModelPackage.HOST_TYPE__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.HOST_TYPE__CPS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCps((CyberPhysicalSystem)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.HOST_TYPE__CPS:
				return basicSetCps(null, msgs);
			case ModelPackage.HOST_TYPE__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ModelPackage.HOST_TYPE__CPS:
				return eInternalContainer().eInverseRemove(this, ModelPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES, CyberPhysicalSystem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.HOST_TYPE__ID:
				return getId();
			case ModelPackage.HOST_TYPE__DEFAULT_CPU:
				return getDefaultCpu();
			case ModelPackage.HOST_TYPE__DEFAULT_RAM:
				return getDefaultRam();
			case ModelPackage.HOST_TYPE__DEFAULT_HDD:
				return getDefaultHdd();
			case ModelPackage.HOST_TYPE__CPS:
				return getCps();
			case ModelPackage.HOST_TYPE__INSTANCES:
				return getInstances();
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
			case ModelPackage.HOST_TYPE__ID:
				setId((String)newValue);
				return;
			case ModelPackage.HOST_TYPE__DEFAULT_CPU:
				setDefaultCpu((Integer)newValue);
				return;
			case ModelPackage.HOST_TYPE__DEFAULT_RAM:
				setDefaultRam((Integer)newValue);
				return;
			case ModelPackage.HOST_TYPE__DEFAULT_HDD:
				setDefaultHdd((Integer)newValue);
				return;
			case ModelPackage.HOST_TYPE__CPS:
				setCps((CyberPhysicalSystem)newValue);
				return;
			case ModelPackage.HOST_TYPE__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends HostInstance>)newValue);
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
			case ModelPackage.HOST_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case ModelPackage.HOST_TYPE__DEFAULT_CPU:
				setDefaultCpu(DEFAULT_CPU_EDEFAULT);
				return;
			case ModelPackage.HOST_TYPE__DEFAULT_RAM:
				setDefaultRam(DEFAULT_RAM_EDEFAULT);
				return;
			case ModelPackage.HOST_TYPE__DEFAULT_HDD:
				setDefaultHdd(DEFAULT_HDD_EDEFAULT);
				return;
			case ModelPackage.HOST_TYPE__CPS:
				setCps((CyberPhysicalSystem)null);
				return;
			case ModelPackage.HOST_TYPE__INSTANCES:
				getInstances().clear();
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
			case ModelPackage.HOST_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ModelPackage.HOST_TYPE__DEFAULT_CPU:
				return defaultCpu != DEFAULT_CPU_EDEFAULT;
			case ModelPackage.HOST_TYPE__DEFAULT_RAM:
				return defaultRam != DEFAULT_RAM_EDEFAULT;
			case ModelPackage.HOST_TYPE__DEFAULT_HDD:
				return defaultHdd != DEFAULT_HDD_EDEFAULT;
			case ModelPackage.HOST_TYPE__CPS:
				return getCps() != null;
			case ModelPackage.HOST_TYPE__INSTANCES:
				return instances != null && !instances.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", defaultCpu: ");
		result.append(defaultCpu);
		result.append(", defaultRam: ");
		result.append(defaultRam);
		result.append(", defaultHdd: ");
		result.append(defaultHdd);
		result.append(')');
		return result.toString();
	}

} //HostTypeImpl