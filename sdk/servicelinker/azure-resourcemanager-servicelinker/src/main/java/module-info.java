// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.servicelinker {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.servicelinker;
    exports com.azure.resourcemanager.servicelinker.fluent;
    exports com.azure.resourcemanager.servicelinker.fluent.models;
    exports com.azure.resourcemanager.servicelinker.models;

    opens com.azure.resourcemanager.servicelinker.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.servicelinker.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}