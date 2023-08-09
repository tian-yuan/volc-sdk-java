package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CreateGatewayRequest {
    @JSONField(name = "Name")
    String name;
    @JSONField(name = "ResourceSpec")
    ResourceSpec resourceSpec;
    @JSONField(name = "ClusterSpec")
    ClusterSpec clusterSpec;
    @JSONField(name = "Labels")
    List<Labels> labelsList;

    @Data
    public static class ResourceSpec {
        @JSONField(name = "Replicas")
        Integer replicas;
        @JSONField(name = "CpuRequest")
        String cpuRequest;
        @JSONField(name = "CpuLimit")
        String cpuLimit;
        @JSONField(name = "MemoryRequest")
        String memoryRequest;
        @JSONField(name = "MemoryLimit")
        String memoryLimit;
    }

    @Data
    public static class ClusterSpec {
        @JSONField(name = "Namespace")
        String namespace;
        @JSONField(name = "ClusterId")
        String clusterId;
        @JSONField(name = "ClusterType")
        String clusterType;
        @JSONField(name = "ClusterName")
        String clusterName;
    }

    @Data
    public static class Labels {
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "Value")
        String value;
    }
}
