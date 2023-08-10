package com.volcengine.example.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CreateCertificateResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CreateCertificateResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "Id")
        String id;
    }
}
