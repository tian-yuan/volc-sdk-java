package com.volcengine.example.apig;

import com.alibaba.fastjson.JSON;
import com.volcengine.example.model.request.ListGatewaysRequest;
import com.volcengine.example.model.response.ListGatewaysResponse;
import com.volcengine.example.service.apig.IApigService;
import com.volcengine.example.service.apig.impl.ApigServiceImpl;

public class ApigDemo {
    public static void main(String []args) {
        String testAk = "AKLTMTZkMzJiZjhiYTI3NDllODkzN2FiOTYzYTE2YzI5OTM";
        String testSk = "WlRsaE5qZGlNakJtTTJVNE5EQTBaamt5TkRNeU1HWmlNemcxWVRVNE5qZw==";

        IApigService apigService = ApigServiceImpl.getInstance();
        apigService.setAccessKey(testAk);
        apigService.setSecretKey(testSk);
        try {
            ListGatewaysRequest listGatewaysRequest = new ListGatewaysRequest();
            listGatewaysRequest.setPageNumber(1);
            listGatewaysRequest.setPageNumber(10);
            ListGatewaysResponse listGatewaysResponse = apigService.listGateways(listGatewaysRequest);
            System.out.println(JSON.toJSONString(listGatewaysResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
