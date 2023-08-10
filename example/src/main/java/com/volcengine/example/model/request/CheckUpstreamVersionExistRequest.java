package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CheckUpstreamVersionExistRequest {
    @JSONField(name = "UpstreamId")
    String upstreamId;
    @JSONField(name = "UpstreamVersionName")
    String upstreamVersionName;
}
