package com.volcengine.example.apig;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.volcengine.example.helper.ApigConst;
import com.volcengine.example.model.request.*;
import com.volcengine.example.model.response.*;
import com.volcengine.example.service.apig.IApigService;
import com.volcengine.example.service.apig.impl.ApigServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class ApiManage {
    private IApigService apigService;
    private String testAk = "AKLTMTZkMzJiZjhiYTI3NDllODkzN2FiOTYzYTE2YzI5OTM";
    private String testSk = "WlRsaE5qZGlNakJtTTJVNE5EQTBaamt5TkRNeU1HWmlNemcxWVRVNE5qZw==";

    private String gatewayId = "gcjfgrvsn575hmngb887g";
    private String upstreamId = "ucjfh334n575hmngb88bg";
    private String upstreamSourceId = "uscjfgrvsn575hmngb8880";
    private String certId = "ccjfkk5moul8vujtra960";

    ApiManage() {

        IApigService apigService = ApigServiceImpl.getInstance();
        apigService.setAccessKey(testAk);
        apigService.setSecretKey(testSk);
        this.apigService = apigService;
    }

    public void printJsonPretty(Object o) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(o));
    }

    public void ListGateways() {
        try {
            ListGatewaysRequest listGatewaysRequest = new ListGatewaysRequest();
            listGatewaysRequest.setPageNumber(1);
            listGatewaysRequest.setPageSize(10);
            ListGatewaysResponse listGatewaysResponse = apigService.listGateways(listGatewaysRequest);
            printJsonPretty(listGatewaysResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void GetGateway() {
        try{
            GetGatewayRequest getGatewayRequest = new GetGatewayRequest();
            getGatewayRequest.setId("gcjfgrvsn575hmngb887g");
            GetGatewayResponse getGatewayResponse = apigService.getGateway(getGatewayRequest);
            printJsonPretty(getGatewayResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CheckGatewayExist() {
        try{
            CheckGatewayExistRequest checkGatewayExistRequest = new CheckGatewayExistRequest();
            checkGatewayExistRequest.setName("gateway-2lq8rkknzt");
            CheckGatewayExistResponse checkGatewayExistResponse = apigService.checkGatewayExist(checkGatewayExistRequest);
            printJsonPretty(checkGatewayExistResponse);
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
            printJsonPretty(createUpstreamResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ListUpstreams() {
        try {
            ListUpstreamsRequest listUpstreamsRequest = new ListUpstreamsRequest();
            listUpstreamsRequest.setGatewayId(gatewayId);
            ListUpstreamsResponse listUpstreamsResponse = apigService.listUpstreams(listUpstreamsRequest);
            printJsonPretty(listUpstreamsResponse);
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void GetUpstream() {
        try {
            GetUpstreamRequest getUpstreamRequest = new GetUpstreamRequest();
            getUpstreamRequest.setId(upstreamId);
            GetUpstreamResponse getUpstreamResponse = apigService.getUpstream(getUpstreamRequest);
            printJsonPretty(getUpstreamResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ListUpstreamSources() {
        try {
            ListUpstreamSourcesRequest listUpstreamSourcesRequest = new ListUpstreamSourcesRequest();
            listUpstreamSourcesRequest.setGatewayId(gatewayId);
            ListUpstreamSourcesResponse listUpstreamSourcesResponse = apigService.listUpstreamSources(listUpstreamSourcesRequest);
            printJsonPretty(listUpstreamSourcesResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void GetUpstreamSource() {
        try {
            GetUpstreamSourceRequest getUpstreamSourceRequest = new GetUpstreamSourceRequest();
            getUpstreamSourceRequest.setId(upstreamSourceId);
            GetUpstreamSourceResponse getUpstreamSourceResponse = apigService.getUpstreamSource(getUpstreamSourceRequest);
            printJsonPretty(getUpstreamSourceResponse);
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
            printJsonPretty(createRouteResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void GetJwtToken() {
        try {
            GetJwtTokenRequest getJwtTokenRequest = new GetJwtTokenRequest();
            getJwtTokenRequest.setServiceId("scir2u57r98jh2f2bgc9g");
            getJwtTokenRequest.setGatewayId("gciqia7vr98jh2f2bgbrg");
            GetJwtTokenResponse getJwtTokenResponse = apigService.getJwtToken(getJwtTokenRequest);
            printJsonPretty(getJwtTokenResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ListCertificates() {
        try {
            ListCertificatesRequest listCertificatesRequest = new ListCertificatesRequest();
            ListCertificatesResponse listCertificatesResponse = apigService.listCertificates(listCertificatesRequest);
            printJsonPretty(listCertificatesResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void GetCertificate() {
        try {
            GetCertificateRequest getCertificateRequest = new GetCertificateRequest();
            getCertificateRequest.setId(certId);
            GetCertificateResponse getCertificateResponse = apigService.getCertificate(getCertificateRequest);
            printJsonPretty(getCertificateResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
