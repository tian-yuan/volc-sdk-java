package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CheckUpstreamExistRequest {
    @JSONField(name = "Name")
    String name;
    @JSONField(name = "GatewayId")
    String gatewayId;
}
