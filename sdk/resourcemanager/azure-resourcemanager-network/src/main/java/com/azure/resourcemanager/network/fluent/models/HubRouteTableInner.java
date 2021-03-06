// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.HubRoute;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** RouteTable resource in a virtual hub. */
@JsonFlatten
@Fluent
public class HubRouteTableInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HubRouteTableInner.class);

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * List of all routes.
     */
    @JsonProperty(value = "properties.routes")
    private List<HubRoute> routes;

    /*
     * List of labels associated with this route table.
     */
    @JsonProperty(value = "properties.labels")
    private List<String> labels;

    /*
     * List of all connections associated with this route table.
     */
    @JsonProperty(value = "properties.associatedConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> associatedConnections;

    /*
     * List of all connections that advertise to this route table.
     */
    @JsonProperty(value = "properties.propagatingConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> propagatingConnections;

    /*
     * The provisioning state of the RouteTable resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the HubRouteTableInner object itself.
     */
    public HubRouteTableInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the routes property: List of all routes.
     *
     * @return the routes value.
     */
    public List<HubRoute> routes() {
        return this.routes;
    }

    /**
     * Set the routes property: List of all routes.
     *
     * @param routes the routes value to set.
     * @return the HubRouteTableInner object itself.
     */
    public HubRouteTableInner withRoutes(List<HubRoute> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get the labels property: List of labels associated with this route table.
     *
     * @return the labels value.
     */
    public List<String> labels() {
        return this.labels;
    }

    /**
     * Set the labels property: List of labels associated with this route table.
     *
     * @param labels the labels value to set.
     * @return the HubRouteTableInner object itself.
     */
    public HubRouteTableInner withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the associatedConnections property: List of all connections associated with this route table.
     *
     * @return the associatedConnections value.
     */
    public List<String> associatedConnections() {
        return this.associatedConnections;
    }

    /**
     * Get the propagatingConnections property: List of all connections that advertise to this route table.
     *
     * @return the propagatingConnections value.
     */
    public List<String> propagatingConnections() {
        return this.propagatingConnections;
    }

    /**
     * Get the provisioningState property: The provisioning state of the RouteTable resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (routes() != null) {
            routes().forEach(e -> e.validate());
        }
    }
}
