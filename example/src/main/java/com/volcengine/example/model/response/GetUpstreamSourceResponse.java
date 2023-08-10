package com.volcengine.example.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.example.model.request.CreateUpstreamSourceRequest;
import com.volcengine.model.response.ResponseMetadata;
import java.util.List;
import lombok.Data;

@Data
public class GetUpstreamSourceResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetUpstreamSourceResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "UpstreamSource")
        GetUpstreamSourceResponse.UpstreamSource upstreamSource;
    }

    @Data
    public static class UpstreamSource {
        @JSONField(name = "Id")
        String id;
        @JSONField(name = "GatewayId")
        String gatewayId;
        @JSONField(name = "SourceType")
        String sourceType;
        @JSONField(name = "Comments")
        String comments;
        @JSONField(name = "SourceSpec")
        SourceSpec sourceSpec;
        @JSONField(name = "CreateTime")
        String createTime;
        @JSONField(name = "UpdateTime")
        String updateTime;
    }

    @Data
    public static class SourceSpec {
        @JSONField(name = "K8SSource")
        GetUpstreamSourceResponse.K8SSource k8sSource;
    }

    @Data
    public static class K8SSource {
        @JSONField(name = "ClusterId")
        String clusterId;
    }
}
