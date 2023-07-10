package com.volcengine.example.apig;

import com.alibaba.fastjson.JSON;
import com.volcengine.example.helper.ApigConst;
import com.volcengine.example.model.request.CreateRouteRequest;
import com.volcengine.example.model.request.CreateUpstreamRequest;
import com.volcengine.example.model.request.ListGatewaysRequest;
import com.volcengine.example.model.response.CreateRouteResponse;
import com.volcengine.example.model.response.CreateUpstreamResponse;
import com.volcengine.example.model.response.ListGatewaysResponse;
import com.volcengine.example.service.apig.IApigService;
import com.volcengine.example.service.apig.impl.ApigServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ApiManage {
    private IApigService apigService;
    ApiManage() {
        String testAk = "AKLTMTZkMzJiZjhiYTI3NDllODkzN2FiOTYzYTE2YzI5OTM";
        String testSk = "WlRsaE5qZGlNakJtTTJVNE5EQTBaamt5TkRNeU1HWmlNemcxWVRVNE5qZw==";

        IApigService apigService = ApigServiceImpl.getInstance();
        apigService.setAccessKey(testAk);
        apigService.setSecretKey(testSk);
        this.apigService = apigService;
    }

    public void ListGateways() {
        try {
            ListGatewaysRequest listGatewaysRequest = new ListGatewaysRequest();
            listGatewaysRequest.setPageNumber(1);
            listGatewaysRequest.setPageSize(10);
            ListGatewaysResponse listGatewaysResponse = apigService.listGateways(listGatewaysRequest);
            System.out.println(JSON.toJSONString(listGatewaysResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CreateUpstream() {
        try {
            CreateUpstreamRequest createUpstreamRequest = new CreateUpstreamRequest();
            createUpstreamRequest.setGatewayId("gcie2laabov2ut9h7mcc0");
            createUpstreamRequest.setName("details");
            createUpstreamRequest.setSourceType(ApigConst.UpstreamSourceTypeFixedIP);
            CreateUpstreamRequest.UpstreamSpec upstreamSpec = new CreateUpstreamRequest.UpstreamSpec();
            List<CreateUpstreamRequest.FixedIP> fixedIPList = new ArrayList<>();
            CreateUpstreamRequest.FixedIP fixedIP = new CreateUpstreamRequest.FixedIP();
            fixedIP.setIp("localhost");
            fixedIP.setPort(15022);
            fixedIPList.add(fixedIP);
            upstreamSpec.setFixedIPList(fixedIPList);
            createUpstreamRequest.setUpstreamSpec(upstreamSpec);
            CreateUpstreamResponse createUpstreamResponse = apigService.createUpstream(createUpstreamRequest);
            System.out.println(JSON.toJSONString(createUpstreamResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CreateRoute() {
        try {
            CreateRouteRequest createRouteRequest = new CreateRouteRequest();
            createRouteRequest.setName("details");
            createRouteRequest.setServiceId("scilrccphcikltm8mqeu0");
            CreateRouteRequest.MatchRule matchRule = new CreateRouteRequest.MatchRule();
            CreateRouteRequest.Path path = new CreateRouteRequest.Path();
            path.setMatchType(ApigConst.MatchTypeRegex);
            path.setMatchContent("/details");
            matchRule.setPath(path);
            List<String> method = new ArrayList<>();
            method.add("POST");
            method.add("GET");
            matchRule.setMethod(method);
            createRouteRequest.setMatchRule(matchRule);
            CreateRouteRequest.Upstream upstream = new CreateRouteRequest.Upstream();
            upstream.setType(ApigConst.UpstreamSourceTypeFixedIP);
            upstream.setUpstreamId("ucilv0c1hcikltm8mqev0");
            upstream.setWeight(100);
            List<CreateRouteRequest.Upstream> upstreamList = new ArrayList<>();
            upstreamList.add(upstream);
            createRouteRequest.setUpstreamList(upstreamList);
            CreateRouteResponse createRouteResponse = apigService.createRoute(createRouteRequest);
            System.out.println(JSON.toJSONString(createRouteResponse));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
