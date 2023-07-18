package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class GetJwtTokenRequest {
    @JSONField(name = "ServiceId")
    String serviceId;
    @JSONField(name = "GatewayId")
    String gatewayId;
}
