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
import se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement;

/**
 * This is the item provider adapter for a {@link se.kth.datacloud.dsl.ExecutionRequirements.QualitativeHardwareRequirement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QualitativeHardwareRequirementItemProvider extends HardwareRequirementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualitativeHardwareRequirementItemProvider(AdapterFactory adapterFactory) {
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

			addMinBenchmarkPropertyDescriptor(object);
			addMaxBenchmarkPropertyDescriptor(object);
			addCpuArchitecturePropertyDescriptor(object);
			addGpuArchitecturePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Min Benchmark feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinBenchmarkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QualitativeHardwareRequirement_minBenchmark_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QualitativeHardwareRequirement_minBenchmark_feature", "_UI_QualitativeHardwareRequirement_type"),
				 ExecutionRequirementsPackage.Literals.QUALITATIVE_HARDWARE_REQUIREMENT__MIN_BENCHMARK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Benchmark feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxBenchmarkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QualitativeHardwareRequirement_maxBenchmark_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QualitativeHardwareRequirement_maxBenchmark_feature", "_UI_QualitativeHardwareRequirement_type"),
				 ExecutionRequirementsPackage.Literals.QUALITATIVE_HARDWARE_REQUIREMENT__MAX_BENCHMARK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cpu Architecture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCpuArchitecturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QualitativeHardwareRequirement_cpuArchitecture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QualitativeHardwareRequirement_cpuArchitecture_feature", "_UI_QualitativeHardwareRequirement_type"),
				 ExecutionRequirementsPackage.Literals.QUALITATIVE_HARDWARE_REQUIREMENT__CPU_ARCHITECTURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gpu Architecture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGpuArchitecturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QualitativeHardwareRequirement_gpuArchitecture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QualitativeHardwareRequirement_gpuArchitecture_feature", "_UI_QualitativeHardwareRequirement_type"),
				 ExecutionRequirementsPackage.Literals.QUALITATIVE_HARDWARE_REQUIREMENT__GPU_ARCHITECTURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns QualitativeHardwareRequirement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/QualitativeHardwareRequirement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		QualitativeHardwareRequirement qualitativeHardwareRequirement = (QualitativeHardwareRequirement)object;
		return getString("_UI_QualitativeHardwareRequirement_type") + " " + qualitativeHardwareRequirement.getMinBenchmark();
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

		switch (notification.getFeatureID(QualitativeHardwareRequirement.class)) {
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__MIN_BENCHMARK:
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__MAX_BENCHMARK:
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__CPU_ARCHITECTURE:
			case ExecutionRequirementsPackage.QUALITATIVE_HARDWARE_REQUIREMENT__GPU_ARCHITECTURE:
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
