package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListRoutesRequest {
    @JSONField(name = "PageNumber")
    Integer pageNumber;
    @JSONField(name = "PageSize")
    Integer pageSize;
    @JSONField(name = "Filter")
    ListGatewaysRequest.Filter filter;
    @JSONField(name = "GatewayId")
    String gatewayId;
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "UpstreamId")
    String upstreamId;
    @JSONField(name = "UpstreamVersion")
    String upstreamVersion;
    @JSONField(name = "ResourceType")
    String resourceType;

    @Data
    public static class Filter {
        @JSONField(name = "Name")
        String name;
    }
}
