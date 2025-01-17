package com.volcengine.example.vms;

import com.alibaba.fastjson.JSON;
import com.volcengine.service.vms.VmsService;
import com.volcengine.service.vms.impl.VmsServiceImpl;
import com.volcengine.service.vms.request.BindAXYBRequest;
import com.volcengine.service.vms.response.SecretBindResponse;

/**
 * @author huangxing
 * @Date 2023/1/10
 */
public class BindAXYBDemo {
    public static void main(String[] args) {

        VmsService vmsService = VmsServiceImpl.getInstance();
        vmsService.setAccessKey("your ak");
        vmsService.setSecretKey("your sk");

        try {
            BindAXYBRequest request = new BindAXYBRequest();
            request.setNumberPoolNo("NP163573566110906243");
            request.setNumberPoolNoY("NP163573566110906243");
            request.setPhoneNoA("18800000001");
            request.setCityCode("010");
            request.setExpireTime(1674261085L);
            request.setYbEnableDuration(360);
            SecretBindResponse response = vmsService.bindAXYB(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
