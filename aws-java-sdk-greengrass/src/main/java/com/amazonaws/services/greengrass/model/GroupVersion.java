/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Information on group version
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/GroupVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GroupVersion implements Serializable, Cloneable, StructuredPojo {

    /** Core definition version arn for this group. */
    private String coreDefinitionVersionArn;
    /** Device definition version arn for this group. */
    private String deviceDefinitionVersionArn;
    /** Function definition version arn for this group. */
    private String functionDefinitionVersionArn;
    /** Logger definitionv ersion arn for this group. */
    private String loggerDefinitionVersionArn;
    /** Subscription definition version arn for this group. */
    private String subscriptionDefinitionVersionArn;

    /**
     * Core definition version arn for this group.
     * 
     * @param coreDefinitionVersionArn
     *        Core definition version arn for this group.
     */

    public void setCoreDefinitionVersionArn(String coreDefinitionVersionArn) {
        this.coreDefinitionVersionArn = coreDefinitionVersionArn;
    }

    /**
     * Core definition version arn for this group.
     * 
     * @return Core definition version arn for this group.
     */

    public String getCoreDefinitionVersionArn() {
        return this.coreDefinitionVersionArn;
    }

    /**
     * Core definition version arn for this group.
     * 
     * @param coreDefinitionVersionArn
     *        Core definition version arn for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupVersion withCoreDefinitionVersionArn(String coreDefinitionVersionArn) {
        setCoreDefinitionVersionArn(coreDefinitionVersionArn);
        return this;
    }

    /**
     * Device definition version arn for this group.
     * 
     * @param deviceDefinitionVersionArn
     *        Device definition version arn for this group.
     */

    public void setDeviceDefinitionVersionArn(String deviceDefinitionVersionArn) {
        this.deviceDefinitionVersionArn = deviceDefinitionVersionArn;
    }

    /**
     * Device definition version arn for this group.
     * 
     * @return Device definition version arn for this group.
     */

    public String getDeviceDefinitionVersionArn() {
        return this.deviceDefinitionVersionArn;
    }

    /**
     * Device definition version arn for this group.
     * 
     * @param deviceDefinitionVersionArn
     *        Device definition version arn for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupVersion withDeviceDefinitionVersionArn(String deviceDefinitionVersionArn) {
        setDeviceDefinitionVersionArn(deviceDefinitionVersionArn);
        return this;
    }

    /**
     * Function definition version arn for this group.
     * 
     * @param functionDefinitionVersionArn
     *        Function definition version arn for this group.
     */

    public void setFunctionDefinitionVersionArn(String functionDefinitionVersionArn) {
        this.functionDefinitionVersionArn = functionDefinitionVersionArn;
    }

    /**
     * Function definition version arn for this group.
     * 
     * @return Function definition version arn for this group.
     */

    public String getFunctionDefinitionVersionArn() {
        return this.functionDefinitionVersionArn;
    }

    /**
     * Function definition version arn for this group.
     * 
     * @param functionDefinitionVersionArn
     *        Function definition version arn for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupVersion withFunctionDefinitionVersionArn(String functionDefinitionVersionArn) {
        setFunctionDefinitionVersionArn(functionDefinitionVersionArn);
        return this;
    }

    /**
     * Logger definitionv ersion arn for this group.
     * 
     * @param loggerDefinitionVersionArn
     *        Logger definitionv ersion arn for this group.
     */

    public void setLoggerDefinitionVersionArn(String loggerDefinitionVersionArn) {
        this.loggerDefinitionVersionArn = loggerDefinitionVersionArn;
    }

    /**
     * Logger definitionv ersion arn for this group.
     * 
     * @return Logger definitionv ersion arn for this group.
     */

    public String getLoggerDefinitionVersionArn() {
        return this.loggerDefinitionVersionArn;
    }

    /**
     * Logger definitionv ersion arn for this group.
     * 
     * @param loggerDefinitionVersionArn
     *        Logger definitionv ersion arn for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupVersion withLoggerDefinitionVersionArn(String loggerDefinitionVersionArn) {
        setLoggerDefinitionVersionArn(loggerDefinitionVersionArn);
        return this;
    }

    /**
     * Subscription definition version arn for this group.
     * 
     * @param subscriptionDefinitionVersionArn
     *        Subscription definition version arn for this group.
     */

    public void setSubscriptionDefinitionVersionArn(String subscriptionDefinitionVersionArn) {
        this.subscriptionDefinitionVersionArn = subscriptionDefinitionVersionArn;
    }

    /**
     * Subscription definition version arn for this group.
     * 
     * @return Subscription definition version arn for this group.
     */

    public String getSubscriptionDefinitionVersionArn() {
        return this.subscriptionDefinitionVersionArn;
    }

    /**
     * Subscription definition version arn for this group.
     * 
     * @param subscriptionDefinitionVersionArn
     *        Subscription definition version arn for this group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GroupVersion withSubscriptionDefinitionVersionArn(String subscriptionDefinitionVersionArn) {
        setSubscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCoreDefinitionVersionArn() != null)
            sb.append("CoreDefinitionVersionArn: ").append(getCoreDefinitionVersionArn()).append(",");
        if (getDeviceDefinitionVersionArn() != null)
            sb.append("DeviceDefinitionVersionArn: ").append(getDeviceDefinitionVersionArn()).append(",");
        if (getFunctionDefinitionVersionArn() != null)
            sb.append("FunctionDefinitionVersionArn: ").append(getFunctionDefinitionVersionArn()).append(",");
        if (getLoggerDefinitionVersionArn() != null)
            sb.append("LoggerDefinitionVersionArn: ").append(getLoggerDefinitionVersionArn()).append(",");
        if (getSubscriptionDefinitionVersionArn() != null)
            sb.append("SubscriptionDefinitionVersionArn: ").append(getSubscriptionDefinitionVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GroupVersion == false)
            return false;
        GroupVersion other = (GroupVersion) obj;
        if (other.getCoreDefinitionVersionArn() == null ^ this.getCoreDefinitionVersionArn() == null)
            return false;
        if (other.getCoreDefinitionVersionArn() != null && other.getCoreDefinitionVersionArn().equals(this.getCoreDefinitionVersionArn()) == false)
            return false;
        if (other.getDeviceDefinitionVersionArn() == null ^ this.getDeviceDefinitionVersionArn() == null)
            return false;
        if (other.getDeviceDefinitionVersionArn() != null && other.getDeviceDefinitionVersionArn().equals(this.getDeviceDefinitionVersionArn()) == false)
            return false;
        if (other.getFunctionDefinitionVersionArn() == null ^ this.getFunctionDefinitionVersionArn() == null)
            return false;
        if (other.getFunctionDefinitionVersionArn() != null && other.getFunctionDefinitionVersionArn().equals(this.getFunctionDefinitionVersionArn()) == false)
            return false;
        if (other.getLoggerDefinitionVersionArn() == null ^ this.getLoggerDefinitionVersionArn() == null)
            return false;
        if (other.getLoggerDefinitionVersionArn() != null && other.getLoggerDefinitionVersionArn().equals(this.getLoggerDefinitionVersionArn()) == false)
            return false;
        if (other.getSubscriptionDefinitionVersionArn() == null ^ this.getSubscriptionDefinitionVersionArn() == null)
            return false;
        if (other.getSubscriptionDefinitionVersionArn() != null
                && other.getSubscriptionDefinitionVersionArn().equals(this.getSubscriptionDefinitionVersionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreDefinitionVersionArn() == null) ? 0 : getCoreDefinitionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getDeviceDefinitionVersionArn() == null) ? 0 : getDeviceDefinitionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getFunctionDefinitionVersionArn() == null) ? 0 : getFunctionDefinitionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getLoggerDefinitionVersionArn() == null) ? 0 : getLoggerDefinitionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionDefinitionVersionArn() == null) ? 0 : getSubscriptionDefinitionVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public GroupVersion clone() {
        try {
            return (GroupVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrass.model.transform.GroupVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
