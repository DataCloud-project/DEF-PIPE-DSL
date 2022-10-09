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
import se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement;

/**
 * This is the item provider adapter for a {@link se.kth.datacloud.dsl.ExecutionRequirements.VerticalScaleRequirement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VerticalScaleRequirementItemProvider extends ScaleRequirementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalScaleRequirementItemProvider(AdapterFactory adapterFactory) {
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

			addMinCpuPropertyDescriptor(object);
			addMaxCpuPropertyDescriptor(object);
			addMinRamMiBPropertyDescriptor(object);
			addMaxRamMiBPropertyDescriptor(object);
			addMinCoresPropertyDescriptor(object);
			addMaxCoresPropertyDescriptor(object);
			addMinStorageMBPropertyDescriptor(object);
			addMaxStorageMBPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Min Cpu feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinCpuPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VerticalScaleRequirement_minCpu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VerticalScaleRequirement_minCpu_feature", "_UI_VerticalScaleRequirement_type"),
				 ExecutionRequirementsPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MIN_CPU,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Cpu feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxCpuPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VerticalScaleRequirement_maxCpu_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VerticalScaleRequirement_maxCpu_feature", "_UI_VerticalScaleRequirement_type"),
				 ExecutionRequirementsPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MAX_CPU,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Ram Mi B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinRamMiBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VerticalScaleRequirement_minRamMiB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VerticalScaleRequirement_minRamMiB_feature", "_UI_VerticalScaleRequirement_type"),
				 ExecutionRequirementsPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MIN_RAM_MI_B,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Ram Mi B feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxRamMiBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VerticalScaleRequirement_maxRamMiB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VerticalScaleRequirement_maxRamMiB_feature", "_UI_VerticalScaleRequirement_type"),
				 ExecutionRequirementsPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MAX_RAM_MI_B,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Cores feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinCoresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VerticalScaleRequirement_minCores_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VerticalScaleRequirement_minCores_feature", "_UI_VerticalScaleRequirement_type"),
				 ExecutionRequirementsPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MIN_CORES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Cores feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxCoresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VerticalScaleRequirement_maxCores_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VerticalScaleRequirement_maxCores_feature", "_UI_VerticalScaleRequirement_type"),
				 ExecutionRequirementsPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MAX_CORES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Storage MB feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinStorageMBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VerticalScaleRequirement_minStorageMB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VerticalScaleRequirement_minStorageMB_feature", "_UI_VerticalScaleRequirement_type"),
				 ExecutionRequirementsPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MIN_STORAGE_MB,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Storage MB feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxStorageMBPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VerticalScaleRequirement_maxStorageMB_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VerticalScaleRequirement_maxStorageMB_feature", "_UI_VerticalScaleRequirement_type"),
				 ExecutionRequirementsPackage.Literals.VERTICAL_SCALE_REQUIREMENT__MAX_STORAGE_MB,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns VerticalScaleRequirement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VerticalScaleRequirement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		VerticalScaleRequirement verticalScaleRequirement = (VerticalScaleRequirement)object;
		return getString("_UI_VerticalScaleRequirement_type") + " " + verticalScaleRequirement.getMinCpu();
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

		switch (notification.getFeatureID(VerticalScaleRequirement.class)) {
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_CPU:
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_CPU:
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_RAM_MI_B:
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_RAM_MI_B:
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_CORES:
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_CORES:
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MIN_STORAGE_MB:
			case ExecutionRequirementsPackage.VERTICAL_SCALE_REQUIREMENT__MAX_STORAGE_MB:
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
