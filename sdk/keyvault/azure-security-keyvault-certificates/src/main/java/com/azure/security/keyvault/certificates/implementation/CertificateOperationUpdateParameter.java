// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.certificates.implementation;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The certificate operation update parameters.
 */
@Fluent
public final class CertificateOperationUpdateParameter {
    /**
     * Indicates if cancellation was requested on the certificate operation.
     */
    @JsonProperty(value = "cancellation_requested", required = true)
    private boolean cancellationRequested;

    /**
     * Get the cancellationRequested value.
     *
     * @return the cancellationRequested value
     */
    public boolean cancellationRequested() {
        return this.cancellationRequested;
    }

    /**
     * Set the cancellationRequested value.
     *
     * @param cancellationRequested the cancellationRequested value to set
     * @return the CertificateOperationUpdateParameter object itself.
     */
    public CertificateOperationUpdateParameter cancellationRequested(boolean cancellationRequested) {
        this.cancellationRequested = cancellationRequested;
        return this;
    }
}
