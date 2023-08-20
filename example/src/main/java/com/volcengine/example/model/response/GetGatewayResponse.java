package com.volcengine.example.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class GetGatewayResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetGatewayResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "Gateway")
        Gateway gateway;
    }

    @Data
    public static class Gateway{
        @JSONField(name = "Id")
        String id;
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "ClusterSpec")
        ClusterSpec clusterSpec;
        @JSONField(name = "Status")
        String status;
        @JSONField(name = "Message")
        String message;
        @JSONField(name = "CreateTime")
        String createTime;
        @JSONField(name = "GatewayExternalAddress")
        GatewayExternalAddress gatewayExternalAddress;
        @JSONField(name = "ResourceSpec")
        ResourceSpec resourceSpec;
        @JSONField(name = "Labels")
        List<Label> labels;
    }

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
    public static class Label {
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "Value")
        String value;
    }

    @Data
    public static class GatewayExternalAddress {
        @JSONField(name = "IPs")
        List<String> ips;
        @JSONField(name = "Items")
        List<PortSpec> items;
    }

    @Data
    public static class PortSpec {
        @JSONField(name = "Port")
        Integer port;
        @JSONField(name = "Protocol")
        String protocol;
    }
}
