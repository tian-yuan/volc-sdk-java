package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import lombok.Data;

@Data
public class UpdateUpstreamRequest {
    @JSONField(name = "Name")
    String name;
    @JSONField(name = "Id")
    String id;
    @JSONField(name = "Comments")
    String comments;
    @JSONField(name = "SourceType")
    String sourceType;
    @JSONField(name = "UpstreamSpec")
    UpstreamSpec upstreamSpec;
    @JSONField(name = "LoadBalancerSettings")
    LoadBalancerSettings loadBalancerSettings;
    @JSONField(name = "CircuitBreakingSettings")
    CircuitBreakingSettings circuitBreakingSettings;
    @JSONField(name = "ResourceType")
    String resourceType;

    @Data
    public static class UpstreamSpec {
        @JSONField(name = "FixedIPList")
        List<FixedIP> fixedIPList;
        @JSONField(name = "VeFaas")
        VeFaas veFaas;
        @JSONField(name = "K8SService")
        K8SService k8SService;
        @JSONField(name = "EcsList")
        List<Ecs> ecsList;
    }

    @Data
    public static class LoadBalancerSettings {
        @JSONField(name = "LbPolicy")
        String lbPolicy;
        @JSONField(name = "SimpleLB")
        String simpleLB;
        @JSONField(name = "ConsistentHashLB")
        ConsistentHashLB consistentHashLB;
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
        HTTPCookie httpCookie;
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
}
