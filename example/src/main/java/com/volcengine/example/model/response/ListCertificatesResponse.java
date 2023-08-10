package com.volcengine.example.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.example.model.request.CreateRouteRequest;
import com.volcengine.model.response.ResponseMetadata;
import java.util.List;
import lombok.Data;
import org.checkerframework.checker.index.qual.HasSubsequence;

@Data
public class ListCertificatesResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListCertificatesResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "Items")
        List<ListCertificatesResponse.CertItem> items;
        @JSONField(name = "Total")
        int total;
    }

    @Data
    public static class CertItem {
        @JSONField(name = "Id")
        String id;
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "AssociatedGatewayServices")
        List<AssociatedGatewayService> associatedGatewayServices;
        @JSONField(name = "Labels")
        List<Label> labels;
        @JSONField(name = "CreateTime")
        String createTime;
    }

    @Data
    public static class AssociatedGatewayService {
        @JSONField(name = "GatewayName")
        String gatewayName;
        @JSONField(name = "GatewayId")
        String gatewayId;
        @JSONField(name = "GatewayServiceName")
        String gatewayServiceName;
        @JSONField(name = "ServiceId")
        String serviceId;
    }

    @Data
    public static class Label {
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "Value")
        String value;
    }
}
