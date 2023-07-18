package com.volcengine.example.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class GetJwtTokenResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    GetJwtTokenResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "JwtToken")
        String jwtToken;
    }
}
