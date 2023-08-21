package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class ListGatewayServicesRequest {
    @JSONField(name = "GatewayId")
    String gatewayId;
    @JSONField(name = "PageNumber")
    Integer pageNumber;
    @JSONField(name = "PageSize")
    Integer pageSize;
    @JSONField(name = "Filter")
    Filter filter;

    @Data
    public static class Filter {
        @JSONField(name = "Name")
        String name;
    }
}
