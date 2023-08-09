package com.volcengine.example.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.example.model.request.CreateRouteRequest;
import com.volcengine.model.response.ResponseMetadata;
import java.util.List;
import lombok.Data;

@Data
public class GetRouteResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetRouteResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "Route")
        RouteItem route;
        @JSONField(name = "Total")
        int total;
    }

    @Data
    public static class RouteItem {
        @JSONField(name = "Id")
        String id;
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "ServiceId")
        String serviceId;
        @JSONField(name = "ServiceName")
        String serviceName;
        @JSONField(name = "MatchRule")
        CreateRouteRequest.MatchRule matchRule;
        @JSONField(name = "UpstreamList")
        List<CreateRouteRequest.Upstream> upstreamList;
        @JSONField(name = "AdvancedSetting")
        CreateRouteRequest.AdvancedSetting advancedSetting;
        @JSONField(name = "Domains")
        List<Domain> domains;
        @JSONField(name = "ResourceType")
        String resourceType;
        @JSONField(name = "CreateTime")
        String createTime;
        @JSONField(name = "UpdateTime")
        String updateTime;
        @JSONField(name = "Status")
        String status;
        @JSONField(name = "Reason")
        String Reason;
    }

    @Data
    public static class MatchRule {
        @JSONField(name = "Path")
        CreateRouteRequest.Path path;
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
        CreateRouteRequest.TimeoutSetting timeoutSetting;
        @JSONField(name = "CorsPolicySetting")
        CreateRouteRequest.CorsPolicySetting corsPolicySetting;
        @JSONField(name = "URLRewriteSetting")
        CreateRouteRequest.URLRewriteSetting urlRewriteSetting;
        @JSONField(name = "HeaderOperations")
        List<CreateRouteRequest.HeaderOperations> headerOperationsList;
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

    @Data
    public static class Domain {
        @JSONField(name = "Domain")
        String domain;
        @JSONField(name = "Type")
        String type;
    }
}
