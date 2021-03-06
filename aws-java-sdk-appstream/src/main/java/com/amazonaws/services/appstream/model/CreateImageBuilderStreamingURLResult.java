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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateImageBuilderStreamingURL"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateImageBuilderStreamingURLResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    private String streamingURL;

    private java.util.Date expires;

    /**
     * @param streamingURL
     */

    public void setStreamingURL(String streamingURL) {
        this.streamingURL = streamingURL;
    }

    /**
     * @return
     */

    public String getStreamingURL() {
        return this.streamingURL;
    }

    /**
     * @param streamingURL
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderStreamingURLResult withStreamingURL(String streamingURL) {
        setStreamingURL(streamingURL);
        return this;
    }

    /**
     * @param expires
     */

    public void setExpires(java.util.Date expires) {
        this.expires = expires;
    }

    /**
     * @return
     */

    public java.util.Date getExpires() {
        return this.expires;
    }

    /**
     * @param expires
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateImageBuilderStreamingURLResult withExpires(java.util.Date expires) {
        setExpires(expires);
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
        if (getStreamingURL() != null)
            sb.append("StreamingURL: ").append(getStreamingURL()).append(",");
        if (getExpires() != null)
            sb.append("Expires: ").append(getExpires());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateImageBuilderStreamingURLResult == false)
            return false;
        CreateImageBuilderStreamingURLResult other = (CreateImageBuilderStreamingURLResult) obj;
        if (other.getStreamingURL() == null ^ this.getStreamingURL() == null)
            return false;
        if (other.getStreamingURL() != null && other.getStreamingURL().equals(this.getStreamingURL()) == false)
            return false;
        if (other.getExpires() == null ^ this.getExpires() == null)
            return false;
        if (other.getExpires() != null && other.getExpires().equals(this.getExpires()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamingURL() == null) ? 0 : getStreamingURL().hashCode());
        hashCode = prime * hashCode + ((getExpires() == null) ? 0 : getExpires().hashCode());
        return hashCode;
    }

    @Override
    public CreateImageBuilderStreamingURLResult clone() {
        try {
            return (CreateImageBuilderStreamingURLResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
