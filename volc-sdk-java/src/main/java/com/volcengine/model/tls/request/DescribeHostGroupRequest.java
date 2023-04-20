package com.volcengine.model.tls.request;

public class DescribeHostGroupRequest {
    private final String hostGroupId;

    public DescribeHostGroupRequest(String hostGroupId) {
        this.hostGroupId = hostGroupId;
    }

    public String getHostGroupId() {
        return hostGroupId;
    }

    public boolean CheckValidation() {
        if (this.hostGroupId == null) {
            return false;
        }
        return true;
    }
}
