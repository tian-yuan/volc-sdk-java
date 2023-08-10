package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.example.model.response.ListUpstreamsResponse;
import java.util.List;
import lombok.Data;

@Data
public class CreateUpstreamVersionRequest {
    @JSONField(name = "UpstreamId")
    String upstreamId;

    @Data
    public static class UpstreamVersion {
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "UpdateTime")
        String updateTime;
        @JSONField(name = "Labels")
        List<CreateUpstreamVersionRequest.Label> labels;
    }

    @Data
    public static class Label {
        @JSONField(name = "Key")
        String key;
        @JSONField(name = "Value")
        String value;
    }
}
