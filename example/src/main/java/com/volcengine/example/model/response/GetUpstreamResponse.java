package com.volcengine.example.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.example.model.request.CreateUpstreamRequest;
import com.volcengine.model.response.ResponseMetadata;
import java.util.List;
import lombok.Data;

@Data
public class GetUpstreamResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetUpstreamResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "Upstream")
        Upstream upstream;
    }

    @Data
    public static class Upstream {
        @JSONField(name = "Id")
        String id;
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "GatewayId")
        String gatewayId;
        @JSONField(name = "Comments")
        String comments;
        @JSONField(name = "SourceType")
        String sourceType;
        @JSONField(name = "UpstreamSpec")
        GetUpstreamResponse.UpstreamSpec upstreamSpec;
        @JSONField(name = "LoadBalancerSettings")
        GetUpstreamResponse.LoadBalancerSettings loadBalancerSettings;
        @JSONField(name = "CircuitBreakingSettings")
        GetUpstreamResponse.CircuitBreakingSettings circuitBreakingSettings;
        @JSONField(name = "VersionDetails")
        List<VersionDetail> versionDetails;
        @JSONField(name = "BackendTargetList")
        List<BackendTarget> backendTargets;
        @JSONField(name = "ResourceType")
        String resourceType;
        @JSONField(name = "CreateTime")
        String createTime;
        @JSONField(name = "UpdateTime")
        String updateTime;
    }

    @Data
    public static class UpstreamSpec {
        @JSONField(name = "FixedIPList")
        List<CreateUpstreamRequest.FixedIP> fixedIPList;
        @JSONField(name = "VeFaas")
        CreateUpstreamRequest.VeFaas veFaas;
        @JSONField(name = "K8SService")
        CreateUpstreamRequest.K8SService k8SService;
        @JSONField(name = "EcsList")
        List<CreateUpstreamRequest.Ecs> ecsList;
    }

    @Data
    public static class LoadBalancerSettings {
        @JSONField(name = "LbPolicy")
        String lbPolicy;
        @JSONField(name = "SimpleLB")
        String simpleLB;
        @JSONField(name = "ConsistentHashLB")
        CreateUpstreamRequest.ConsistentHashLB consistentHashLB;
    }

    @Data
    public static class CircuitBreakingSettings {
        @JSONField(name = "Enable")
        boolean enable;
        @JSONField(name = "ConsecutiveErrors")
        Integer consecutiveErrors;
        @JSONField(name = "Interval")
        Integer interval;
        @JSONField(name = "BaseEjectionTime")
        Integer baseEjectionTime;
        @JSONField(name = "MaxEjectionPercent")
        Integer maxEjectionPercent;
        @JSONField(name = "MinHealthPercent")
        Integer minHealthPercent;
    }

    @Data
    public static class VeFaas {
        @JSONField(name = "FunctionId")
        String functionId;
    }

    @Data
    public static class K8SService {
        @JSONField(name = "Namespace")
        String namespace;
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "Port")
        Integer port;
    }

    @Data
    public static class Ecs {
        @JSONField(name = "EcsId")
        String ecsId;
        @JSONField(name = "IP")
        String ip;
        @JSONField(name = "Port")
        Integer port;
    }

    @Data
    public static class FixedIP {
        @JSONField(name = "IP")
        String ip;
        @JSONField(name = "Port")
        Integer port;
    }

    @Data
    public static class ConsistentHashLB {
        @JSONField(name = "HashKey")
        String hashKey;
        @JSONField(name = "UseSourceIp")
        String useSourceIp;
        @JSONField(name = "HttpQueryParameterName")
        String httpQueryParameterName;
        @JSONField(name = "HttpHeaderName")
        String httpHeaderName;
        @JSONField(name = "HTTPCookie")
        CreateUpstreamRequest.HTTPCookie httpCookie;
    }

    @Data
    public static class HTTPCookie {
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "Path")
        String path;
        @JSONField(name = "Ttl")
        Integer ttl;
    }

    @Data
    public static class VersionDetail {
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "UpdateTime")
        String updateTime;
        @JSONField(name = "Labels")
        List<Label> labels;
    }

    @Data
    public static class Label {
        @JSONField(name = "Key")
        String key;
        @JSONField(name = "Value")
        String value;
    }

    @Data
    public static class BackendTarget {
        @JSONField(name = "HealthStatus")
        String healthStatus;
        @JSONField(name = "IP")
        String ip;
        @JSONField(name = "Port")
        Integer port;
    }
}
