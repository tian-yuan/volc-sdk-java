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
import org.checkerframework.checker.units.qual.C;

import java.util.ArrayList;
import java.util.List;

public class ApiManage {
    private final IApigService apigService;

    private final String gatewayId = "gcjfgrvsn575hmngb887g";

    ApiManage() {
        IApigService apigService = ApigServiceImpl.getInstance();
        String testAk = "AKLTMTZkMzJiZjhiYTI3NDllODkzN2FiOTYzYTE2YzI5OTM";
        apigService.setAccessKey(testAk);
        String testSk = "WlRsaE5qZGlNakJtTTJVNE5EQTBaamt5TkRNeU1HWmlNemcxWVRVNE5qZw==";
        apigService.setSecretKey(testSk);
        this.apigService = apigService;
    }

    public void printJsonPretty(Object o) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(o));
    }


    public void CreateGateway() {
        try {
            CreateGatewayRequest createGatewayRequest = new CreateGatewayRequest();
            createGatewayRequest.setName("demo");
            CreateGatewayRequest.ClusterSpec clusterSpec = new CreateGatewayRequest.ClusterSpec();
            clusterSpec.setClusterId("cciqutvqaensl3bj8ujr0");
            clusterSpec.setNamespace("default");
            createGatewayRequest.setClusterSpec(clusterSpec);
            CreateGatewayRequest.ResourceSpec resourceSpec = new CreateGatewayRequest.ResourceSpec();
            resourceSpec.setReplicas(1);
            resourceSpec.setCpuLimit("0.1");
            resourceSpec.setCpuRequest("0.1");
            resourceSpec.setMemoryRequest("100M");
            resourceSpec.setMemoryLimit("100M");
            createGatewayRequest.setResourceSpec(resourceSpec);
            CreateGatewayResponse createGatewayResponse = apigService.createGateway(createGatewayRequest);
            printJsonPretty(createGatewayResponse);
        } catch (Exception e) {

        }
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

    public void DeleteGateway() {
        try{
            DeleteGatewayRequest deleteGatewayRequest = new DeleteGatewayRequest();
            deleteGatewayRequest.setId("gcjhg95moul8vujtraacg");
            DeleteGatewayResponse deleteGatewayResponse = apigService.deleteGateway(deleteGatewayRequest);
            printJsonPretty(deleteGatewayResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CreateUpstream() {
        try {
            CreateUpstreamRequest createUpstreamRequest = new CreateUpstreamRequest();
            createUpstreamRequest.setGatewayId("gcjhg95moul8vujtraacg");
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

    public void UpdateUpstream() {
        try {
            UpdateUpstreamRequest updateUpstreamRequest = new UpdateUpstreamRequest();
            updateUpstreamRequest.setId("ucjhgalmoul8vujtraadg");
            updateUpstreamRequest.setName("details-change");
            updateUpstreamRequest.setSourceType(ApigConst.UpstreamSourceTypeFixedIP);
            UpdateUpstreamRequest.UpstreamSpec upstreamSpec = new UpdateUpstreamRequest.UpstreamSpec();
            List<UpdateUpstreamRequest.FixedIP> fixedIPList = new ArrayList<>();
            UpdateUpstreamRequest.FixedIP fixedIP = new UpdateUpstreamRequest.FixedIP();
            fixedIP.setIp("localhost");
            fixedIP.setPort(15022);
            fixedIPList.add(fixedIP);
            upstreamSpec.setFixedIPList(fixedIPList);
            updateUpstreamRequest.setUpstreamSpec(upstreamSpec);
            UpdateUpstreamResponse updateUpstreamResponse = apigService.updateUpstream(updateUpstreamRequest);
            printJsonPretty(updateUpstreamResponse);
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
            String upstreamId = "ucjfh334n575hmngb88bg";
            getUpstreamRequest.setId(upstreamId);
            GetUpstreamResponse getUpstreamResponse = apigService.getUpstream(getUpstreamRequest);
            printJsonPretty(getUpstreamResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DeleteUpstream() {
        try{
            DeleteUpstreamRequest deleteUpstreamRequest = new DeleteUpstreamRequest();
            deleteUpstreamRequest.setId("ucjhgalmoul8vujtraadg");
            DeleteUpstreamResponse deleteUpstreamResponse = apigService.deleteUpstream(deleteUpstreamRequest);
            printJsonPretty(deleteUpstreamResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CreateUpstreamVersion() {
        try{
            CreateUpstreamVersionRequest createUpstreamVersionRequest = new CreateUpstreamVersionRequest();
            createUpstreamVersionRequest.setUpstreamId("ucjhgalmoul8vujtraadg");
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
            String upstreamSourceId = "uscjfgrvsn575hmngb8880";
            getUpstreamSourceRequest.setId(upstreamSourceId);
            GetUpstreamSourceResponse getUpstreamSourceResponse = apigService.getUpstreamSource(getUpstreamSourceRequest);
            printJsonPretty(getUpstreamSourceResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CreateGatewayService() {
        try{
            CreateGatewayServiceRequest createGatewayServiceRequest = new CreateGatewayServiceRequest();
            createGatewayServiceRequest.setGatewayId("gcjhg95moul8vujtraacg");
            createGatewayServiceRequest.setServiceName("demo");
            CreateGatewayServiceRequest.ServiceDomainSpec serviceDomainSpec = new CreateGatewayServiceRequest.ServiceDomainSpec();
            serviceDomainSpec.setDomain("example.com");
            List<String> protocols = new ArrayList<>();
            protocols.add("HTTP");
            serviceDomainSpec.setProtocol(protocols);
            List<CreateGatewayServiceRequest.ServiceDomainSpec> serviceDomainSpecs = new ArrayList<>();
            serviceDomainSpecs.add(serviceDomainSpec);
            createGatewayServiceRequest.setServiceDomainSpec(serviceDomainSpecs);
            CreateGatewayServiceRequest.AuthSpec authSpec = new CreateGatewayServiceRequest.AuthSpec();
            authSpec.setEnable(false);
            createGatewayServiceRequest.setAuthSpec(authSpec);
            CreateGatewayServiceResponse createGatewayServiceResponse = apigService.createGatewayService(createGatewayServiceRequest);
            printJsonPretty(createGatewayServiceResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void UpdateGatewayService() {
        try{
            UpdateGatewayServiceRequest updateGatewayServiceRequest = new UpdateGatewayServiceRequest();
            updateGatewayServiceRequest.setId("scjhgo2uoul8vujtraae0");
            UpdateGatewayServiceRequest.ServiceDomainSpec serviceDomainSpec = new UpdateGatewayServiceRequest.ServiceDomainSpec();
            serviceDomainSpec.setDomain("test.com");
            List<String> protocols = new ArrayList<>();
            protocols.add("HTTP");
            serviceDomainSpec.setProtocol(protocols);
            List<UpdateGatewayServiceRequest.ServiceDomainSpec> serviceDomainSpecs = new ArrayList<>();
            serviceDomainSpecs.add(serviceDomainSpec);
            updateGatewayServiceRequest.setServiceDomainSpec(serviceDomainSpecs);
            UpdateGatewayServiceRequest.AuthSpec authSpec = new UpdateGatewayServiceRequest.AuthSpec();
            authSpec.setEnable(false);
            updateGatewayServiceRequest.setAuthSpec(authSpec);
            UpdateGatewayServiceResponse updateGatewayServiceResponse = apigService.updateGatewayService(updateGatewayServiceRequest);
            printJsonPretty(updateGatewayServiceResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void GetGatewayService() {
        try{
            GetGatewayServiceRequest getGatewayServiceRequest = new GetGatewayServiceRequest();
            getGatewayServiceRequest.setId("scjhgo2uoul8vujtraae0");
            GetGatewayServiceResponse getGatewayServiceResponse = apigService.getGatewayService(getGatewayServiceRequest);
            printJsonPretty(getGatewayServiceResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ListGatewayService() {
        try{
            ListGatewayServicesRequest listGatewayServicesRequest = new ListGatewayServicesRequest();
            listGatewayServicesRequest.setGatewayId("gcjhg95moul8vujtraacg");
            ListGatewayServicesResponse listGatewayServicesResponse = apigService.listGatewayServices(listGatewayServicesRequest);
            printJsonPretty(listGatewayServicesResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DeleteGatewayService() {
        try{
            DeleteGatewayServiceRequest deleteGatewayServiceRequest = new DeleteGatewayServiceRequest();
            deleteGatewayServiceRequest.setId("scjhgo2uoul8vujtraae0");
            DeleteGatewayServiceResponse deleteGatewayServiceResponse = apigService.deleteGatewayService(deleteGatewayServiceRequest);
            printJsonPretty(deleteGatewayServiceResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CreateRoute() {
        try {
            CreateRouteRequest createRouteRequest = new CreateRouteRequest();
            createRouteRequest.setName("details");
            createRouteRequest.setServiceId("scjhgo2uoul8vujtraae0");
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
            upstream.setUpstreamId("ucjhgalmoul8vujtraadg");
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

    public void GetRoute() {
        try{
            GetRouteRequest getRouteRequest = new GetRouteRequest();
            getRouteRequest.setId("rcjhh386oul8vujtraamg");
            GetRouteResponse getRouteResponse = apigService.getRoute(getRouteRequest);
            printJsonPretty(getRouteResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ListUpstreamSource() {
        try{
            ListUpstreamSourcesRequest listUpstreamSourcesRequest = new ListUpstreamSourcesRequest();
            listUpstreamSourcesRequest.setGatewayId("gcjhg95moul8vujtraacg");
            ListUpstreamSourcesResponse listUpstreamSourcesResponse = apigService.listUpstreamSources(listUpstreamSourcesRequest);
            printJsonPretty(listUpstreamSourcesResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void CreateUpstreamSource() {
        try{
            CreateUpstreamSourceRequest createUpstreamSourceRequest = new CreateUpstreamSourceRequest();
            createUpstreamSourceRequest.setSourceType("K8S");
            CreateUpstreamSourceRequest.SourceSpec sourceSpec = new CreateUpstreamSourceRequest.SourceSpec();
            CreateUpstreamSourceRequest.K8SSource k8SSource = new CreateUpstreamSourceRequest.K8SSource();
            k8SSource.setClusterId("ccjffoejchgjnp35to6b0");
            sourceSpec.setK8sSource(k8SSource);
            createUpstreamSourceRequest.setSourceSpec(sourceSpec);
            createUpstreamSourceRequest.setGatewayId("gcjhg95moul8vujtraacg");
            CreateUpstreamSourceResponse createUpstreamSourceResponse = apigService.createUpstreamSource(createUpstreamSourceRequest);
            printJsonPretty(createUpstreamSourceResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void UpdateUpstreamSource() {
        try{
            UpdateUpstreamSourceRequest updateUpstreamSourceRequest = new UpdateUpstreamSourceRequest();
            updateUpstreamSourceRequest.setId("uscjhhkn6oul8vujtrac50");
            updateUpstreamSourceRequest.setComments("comment");
            UpdateUpstreamSourceResponse updateUpstreamSourceResponse = apigService.updateUpstreamSource(updateUpstreamSourceRequest);
            printJsonPretty(updateUpstreamSourceResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DeleteUpstreamSource() {
        try{
            DeleteUpstreamSourceRequest deleteUpstreamSourceRequest = new DeleteUpstreamSourceRequest();
            deleteUpstreamSourceRequest.setId("uscjhhkn6oul8vujtrac50");
            DeleteUpstreamSourceResponse deleteUpstreamSourceResponse = apigService.deleteUpstreamSource(deleteUpstreamSourceRequest);
            printJsonPretty(deleteUpstreamSourceResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ListRoutes() {
        try{
            ListRoutesRequest listRoutesRequest = new ListRoutesRequest();
            listRoutesRequest.setGatewayId("gcjhg95moul8vujtraacg");
            ListRoutesResponse listRoutesResponse = apigService.listRoutes(listRoutesRequest);
            printJsonPretty(listRoutesResponse);
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

    public void CreateCertificate() {
        try{
            CreateCertificateRequest createCertificateRequest = new CreateCertificateRequest();
            createCertificateRequest.setName("demo");
            createCertificateRequest.setCert(
                "-----BEGIN CERTIFICATE-----\n"
                    + "......\n"
                    + "LSvtuBHilzM9qHODqcuKKVGfj75vRRjU68lR6w==\n"
                    + "-----END CERTIFICATE-----");
            createCertificateRequest.setPrivateKey(
                "-----BEGIN RSA PRIVATE KEY-----\n"
                    + "..........\n"
                    + "T6ObNsi4sKWxoYCEUX3Fkj6Rj19iElmxB9OXc1DxIAPXNWTvOrfpIPrF9Q==\n"
                    + "-----END RSA PRIVATE KEY-----");
            CreateCertificateResponse createCertificateResponse = apigService.createCertificate(createCertificateRequest);
            printJsonPretty(createCertificateResponse);
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
            String certId = "ccjfkk5moul8vujtra960";
            getCertificateRequest.setId(certId);
            GetCertificateResponse getCertificateResponse = apigService.getCertificate(getCertificateRequest);
            printJsonPretty(getCertificateResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void DeleteCertificate() {
        try{
            DeleteCertificateRequest deleteCertificateRequest = new DeleteCertificateRequest();
            deleteCertificateRequest.setId("111");
            DeleteCertificateResponse deleteCertificateResponse = apigService.deleteCertificate(deleteCertificateRequest);
            printJsonPretty(deleteCertificateResponse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
