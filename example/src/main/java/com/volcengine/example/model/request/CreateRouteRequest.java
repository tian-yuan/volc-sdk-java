package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CreateRouteRequest {
    @JSONField(name = "Name")
    String name;
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "MatchRule")
    MatchRule matchRule;
    @JSONField(name = "UpstreamList")
    List<Upstream> upstreamList;
    @JSONField(name = "ResourceType")
    String resourceType;

    @Data
    public static class MatchRule {
        @JSONField(name = "Path")
        Path path;
        @JSONField(name = "Method")
        List<String> method;
        @JSONField(name = "QueryString")
        List<String> queryString;
    }

    @Data
    public static class Path {
        @JSONField(name = "MatchType")
        String matchType;
        @JSONField(name = "MatchContent")
        String matchContent;
    }

    @Data
    public static class Upstream {
        @JSONField(name = "Type")
        String type;
        @JSONField(name = "UpstreamId")
        String upstreamId;
        @JSONField(name = "Weight")
        Integer weight;
        @JSONField(name = "Version")
        String version;
    }
}
