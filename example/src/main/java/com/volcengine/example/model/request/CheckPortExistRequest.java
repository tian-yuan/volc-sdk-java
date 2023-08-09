package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CheckPortExistRequest {
    @JSONField(name = "Port")
    Integer port;
    @JSONField(name = "GatewayId")
    String gatewayId;
}
