package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CreateUpstreamRequest {
    @JSONField(name = "Name")
    String name;
    @JSONField(name = "GatewayId")
    String gatewayId;
    @JSONField(name = "Comments")
    String comments;
    @JSONField(name = "SourceType")
    String sourceType;
    @JSONField(name = "UpstreamSpec")
    UpstreamSpec upstreamSpec;

    @Data
    public static class UpstreamSpec {
        @JSONField(name = "FixedIPList")
        List<FixedIP> fixedIPList;
    }

    @Data
    public static class FixedIP {
        @JSONField(name = "IP")
        String ip;
        @JSONField(name = "Port")
        Integer port;
    }
}
