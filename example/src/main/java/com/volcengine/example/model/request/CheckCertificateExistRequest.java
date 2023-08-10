package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CheckCertificateExistRequest {
    @JSONField(name = "Name")
    String name;
}
