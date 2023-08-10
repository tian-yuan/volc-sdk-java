package com.volcengine.example.model.response;

import com.alibaba.fastjson.annotation.JSONField;
import com.volcengine.model.response.ResponseMetadata;
import lombok.Data;

@Data
public class CheckUpstreamVersionExistResponse {
    @JSONField(name = "ResponseMetadata")
    ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    CheckUpstreamVersionExistResponse.ResultBean result;

    @Data
    public static class ResultBean {
        @JSONField(name = "Exist")
        boolean exist;
    }
}
