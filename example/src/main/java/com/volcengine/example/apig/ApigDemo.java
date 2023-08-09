package com.volcengine.example.apig;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.request.iam.ListAccessKeysRequest;
import com.volcengine.model.request.iam.ListUsersRequest;
import com.volcengine.model.response.iam.ListAccessKeysResponse;
import com.volcengine.model.response.iam.ListUsersResponse;
import com.volcengine.service.iam.IIamService;
import com.volcengine.service.iam.impl.IamServiceImpl;

public class ApigDemo {
    public static void main(String []args) {
        IIamService iamService = IamServiceImpl.getInstance();
        iamService.setAccessKey("AKLTMTZkMzJiZjhiYTI3NDllODkzN2FiOTYzYTE2YzI5OTM");
        iamService.setSecretKey("WlRsaE5qZGlNakJtTTJVNE5EQTBaamt5TkRNeU1HWmlNemcxWVRVNE5qZw==");
        iamService.setHost("top.vestack.cloud");
        try {
            //ListUsersRequest listUsersRequest = new ListUsersRequest();
            //listUsersRequest.setLimit(3);

            //ListUsersResponse listUsersResponse = iamService.listUsers(listUsersRequest);
            //System.out.println(JSON.toJSONString(listUsersResponse));
            ListAccessKeysRequest request = new ListAccessKeysRequest();
            //request.setUserName("testzhangyu");
            ListAccessKeysResponse response = iamService.listAccessKeys(request);

            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
