// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.implementation;

import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupStatusResponseInner;
import com.azure.resourcemanager.recoveryservicesbackup.models.AcquireStorageAccountLock;
import com.azure.resourcemanager.recoveryservicesbackup.models.BackupStatusResponse;
import com.azure.resourcemanager.recoveryservicesbackup.models.FabricName;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionStatus;

public final class BackupStatusResponseImpl implements BackupStatusResponse {
    private BackupStatusResponseInner innerObject;

    private final com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager;

    BackupStatusResponseImpl(
        BackupStatusResponseInner innerObject,
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public ProtectionStatus protectionStatus() {
        return this.innerModel().protectionStatus();
    }

    public String vaultId() {
        return this.innerModel().vaultId();
    }

    public FabricName fabricName() {
        return this.innerModel().fabricName();
    }

    public String containerName() {
        return this.innerModel().containerName();
    }

    public String protectedItemName() {
        return this.innerModel().protectedItemName();
    }

    public String errorCode() {
        return this.innerModel().errorCode();
    }

    public String errorMessage() {
        return this.innerModel().errorMessage();
    }

    public String policyName() {
        return this.innerModel().policyName();
    }

    public String registrationStatus() {
        return this.innerModel().registrationStatus();
    }

    public Integer protectedItemsCount() {
        return this.innerModel().protectedItemsCount();
    }

    public AcquireStorageAccountLock acquireStorageAccountLock() {
        return this.innerModel().acquireStorageAccountLock();
    }

    public BackupStatusResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager() {
        return this.serviceManager;
    }
}
