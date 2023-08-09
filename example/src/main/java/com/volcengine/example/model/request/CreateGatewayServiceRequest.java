package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CreateGatewayServiceRequest {
    @JSONField(name = "ServiceName")
    String serviceName;
    @JSONField(name = "GatewayId")
    String gatewayId;
    @JSONField(name = "ForwardType")
    String forwardType;
    @JSONField(name = "ServiceDomainSpec")
    List<ServiceDomainSpec> serviceDomainSpec;
    @JSONField(name = "TransportSpec")
    List<TransportSpec> transportSpec;
    @JSONField(name = "AuthSpec")
    AuthSpec authSpec;

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
