/**
 */
package se.kth.datacloud.dsl.ExecutionRequirements.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import se.kth.datacloud.dsl.ExecutionRequirements.ExecutionRequirementsPackage;
import se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement;

/**
 * This is the item provider adapter for a {@link se.kth.datacloud.dsl.ExecutionRequirements.NetworkRequirement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NetworkRequirementItemProvider extends HardwareRequirementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkRequirementItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addMinBandwidthPropertyDescriptor(object);
			addMaxBandwidthPropertyDescriptor(object);
			addMinLatencyPropertyDescriptor(object);
			addMaxLatencyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Min Bandwidth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinBandwidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkRequirement_minBandwidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkRequirement_minBandwidth_feature", "_UI_NetworkRequirement_type"),
				 ExecutionRequirementsPackage.Literals.NETWORK_REQUIREMENT__MIN_BANDWIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Bandwidth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxBandwidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkRequirement_maxBandwidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkRequirement_maxBandwidth_feature", "_UI_NetworkRequirement_type"),
				 ExecutionRequirementsPackage.Literals.NETWORK_REQUIREMENT__MAX_BANDWIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Latency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinLatencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkRequirement_minLatency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkRequirement_minLatency_feature", "_UI_NetworkRequirement_type"),
				 ExecutionRequirementsPackage.Literals.NETWORK_REQUIREMENT__MIN_LATENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Latency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxLatencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NetworkRequirement_maxLatency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NetworkRequirement_maxLatency_feature", "_UI_NetworkRequirement_type"),
				 ExecutionRequirementsPackage.Literals.NETWORK_REQUIREMENT__MAX_LATENCY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns NetworkRequirement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NetworkRequirement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		NetworkRequirement networkRequirement = (NetworkRequirement)object;
		return getString("_UI_NetworkRequirement_type") + " " + networkRequirement.getMinBandwidth();
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(NetworkRequirement.class)) {
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MIN_BANDWIDTH:
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MAX_BANDWIDTH:
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MIN_LATENCY:
			case ExecutionRequirementsPackage.NETWORK_REQUIREMENT__MAX_LATENCY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
