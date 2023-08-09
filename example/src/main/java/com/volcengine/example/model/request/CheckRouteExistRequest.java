package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class CheckRouteExistRequest {
    @JSONField(name = "Name")
    String name;
    @JSONField(name = "ServiceId")
    String serviceId;
}
