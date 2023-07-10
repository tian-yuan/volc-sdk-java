package com.volcengine.example.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListGatewaysResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListGatewaysResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "Items")
        List<ListGatewaysResponse.GatewayItem> items;
        @JSONField(name = "Total")
        int total;
    }

    @Data
    public static class GatewayItem {
        @JSONField(name = "Id")
        String gatewayId;

        @JSONField(name = "Name")
        String name;

        @JSONField(name = "Status")
        String status;

        @JSONField(name = "Message")
        String message;

        @JSONField(name = "CreateTime")
        String createTime;
    }

    @Data
    public static class ResourceSpec {
        @JSONField(name = "Replicas")
        Integer replicas;
        @JSONField(name = "CpuRequest")
        String cpuRequest;
        @JSONField(name = "CpuLimit")
        String cpuLimit;
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
    public static class GatewayExternalAddress {
        @JSONField(name = "IPs")
        List<String> ips;
        @JSONField(name = "Items")
        List<GatewayExternalPortItems> items;
    }

    @Data
    public static class GatewayExternalPortItems {
        @JSONField(name = "Port")
        Integer port;
        @JSONField(name = "Protocol")
        String protocol;
    }
}
