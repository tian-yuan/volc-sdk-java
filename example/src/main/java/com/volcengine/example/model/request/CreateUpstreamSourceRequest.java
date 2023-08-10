package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CreateUpstreamSourceRequest {
    @JSONField(name = "GatewayId")
    String gatewayId;
    @JSONField(name = "SourceType")
    String sourceType;
    @JSONField(name = "Comments")
    String comments;
    @JSONField(name = "SourceSpec")
    CreateUpstreamSourceRequest.SourceSpec sourceSpec;

    @Data
    public static class SourceSpec {
        @JSONField(name = "K8SSource")
        K8SSource k8sSource;
    }

    @Data
    public static class K8SSource {
        @JSONField(name = "ClusterId")
        String clusterId;
    }
}
