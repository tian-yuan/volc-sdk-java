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
    @JSONField(name = "AdvancedSetting")
    AdvancedSetting advancedSetting;
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

    @Data
    public static class AdvancedSetting {
        @JSONField(name = "TimeoutSetting")
        TimeoutSetting timeoutSetting;
        @JSONField(name = "CorsPolicySetting")
        CorsPolicySetting corsPolicySetting;
        @JSONField(name = "URLRewriteSetting")
        URLRewriteSetting urlRewriteSetting;
        @JSONField(name = "HeaderOperations")
        List<HeaderOperations> headerOperationsList;
    }

    @Data
    public static class TimeoutSetting {
        @JSONField(name = "Enable")
        boolean enable;
        @JSONField(name = "Timeout")
        Integer timeout;
    }

    @Data
    public static class CorsPolicySetting {
        @JSONField(name = "Enable")
        boolean enable;
    }

    @Data
    public static class URLRewriteSetting {
        @JSONField(name = "Enable")
        boolean enable;
        @JSONField(name = "URLRewrite")
        String urlRewrite;
    }

    @Data
    public static class HeaderOperations {
        @JSONField(name = "Operation")
        String operation;
        @JSONField(name = "Key")
        String key;
        @JSONField(name = "Value")
        String value;
    }
}
