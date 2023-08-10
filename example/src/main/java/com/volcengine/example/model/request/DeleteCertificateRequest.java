package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class DeleteCertificateRequest {
    @JSONField(name = "Id")
    String id;
}
