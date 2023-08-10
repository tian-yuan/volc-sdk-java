package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CheckUpstreamSpecExistRequest {
    @JSONField(name = "GatewayId")
    String gatewayId;
    @JSONField(name = "UpstreamSpec")
    UpstreamSpec upstreamSpec;
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
}
