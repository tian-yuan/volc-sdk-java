package com.volcengine.example.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.example.model.request.CreateGatewayServiceRequest;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

import java.util.List;

@Data
public class ListGatewayServicesResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    ListGatewayServicesResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "Items")
        List<ListGatewayServicesResponse.GatewayServiceItem> items;
        @JSONField(name = "Total")
        int total;
    }

    @Data
    public static class GatewayServiceItem {
        @JSONField(name = "Id")
        String id;
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "GatewayId")
        String gatewayId;
        @JSONField(name = "GatewayName")
        String gatewayName;
        @JSONField(name = "ForwardType")
        String forwardType;
        @JSONField(name = "ServiceDomainSpec")
        List<CreateGatewayServiceRequest.ServiceDomainSpec> serviceDomainSpec;
        @JSONField(name = "TransportSpec")
        List<CreateGatewayServiceRequest.TransportSpec> transportSpec;
        @JSONField(name = "AuthSpec")
        CreateGatewayServiceRequest.AuthSpec authSpec;
        @JSONField(name = "CreateTime")
        String createTime;
    }

    @Data
    public static class ServiceDomainSpec{
        @JSONField(name = "Domain")
        String domain;
        @JSONField(name = "Protocol")
        List<String> protocol;
        @JSONField(name = "CertificateId")
        String certificateId;
        @JSONField(name = "CertificateName")
        String certificateName;
    }

    @Data
    public static class TransportSpec{
        @JSONField(name = "Protocol")
        String protocol;
        @JSONField(name = "Port")
        Integer port;
        @JSONField(name = "IP")
        List<String> ip;
    }

    @Data
    public static class AuthSpec {
        @JSONField(name = "Enable")
        boolean enable;
    }
}
