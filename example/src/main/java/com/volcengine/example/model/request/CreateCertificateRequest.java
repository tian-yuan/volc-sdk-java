package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class CreateCertificateRequest {
    @JSONField(name = "Name")
    String name;
    @JSONField(name = "Cert")
    String cert;
    @JSONField(name = "PrivateKey")
    String privateKey;
    @JSONField(name = "Labels")
    List<Label> labels;


    @Data
    public static class Label {
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "Value")
        String value;
    }
}
