package com.volcengine.example.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import java.util.List;
import lombok.Data;

@Data
public class GetCertificateResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetCertificateResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "Certificate")
        GetCertificateResponse.Cert cert;
    }

    @Data
    public static class Cert {
        @JSONField(name = "Id")
        String id;
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "PrivateKey")
        String privateKey;
        @JSONField(name = "Cert")
        String cert;
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
