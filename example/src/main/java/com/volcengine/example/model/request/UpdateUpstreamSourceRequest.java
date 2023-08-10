package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class UpdateUpstreamSourceRequest {
    @JSONField(name = "Id")
    String id;
    @JSONField(name = "Comments")
    String comments;
}
