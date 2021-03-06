/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.compute.v2019_03_01.implementation.ComputeManager;
import com.microsoft.azure.management.compute.v2019_03_01.implementation.VirtualMachineScaleSetInstanceViewInner;
import java.util.List;

/**
 * Type representing VirtualMachineScaleSetInstanceView.
 */
public interface VirtualMachineScaleSetInstanceView extends HasInner<VirtualMachineScaleSetInstanceViewInner>, HasManager<ComputeManager> {
    /**
     * @return the extensions value.
     */
    List<VirtualMachineScaleSetVMExtensionsSummary> extensions();

    /**
     * @return the statuses value.
     */
    List<InstanceViewStatus> statuses();

    /**
     * @return the virtualMachine value.
     */
    VirtualMachineScaleSetInstanceViewStatusesSummary virtualMachine();

}
