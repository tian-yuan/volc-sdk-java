package com.volcengine.example.service.apig.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.example.helper.ApigConst;
import com.volcengine.example.model.request.*;
import com.volcengine.example.model.response.*;
import com.volcengine.example.service.apig.ApigConfig;
import com.volcengine.example.service.apig.IApigService;
import com.volcengine.helper.Utils;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;

import java.util.ArrayList;

public class ApigServiceImpl extends BaseServiceImpl implements IApigService {
    private ApigServiceImpl() {
        super(ApigConfig.serviceInfo, ApigConfig.apiInfoList);
    }

    public static IApigService getInstance() {
        return new ApigServiceImpl();
    }

    @Override
    public ListGatewaysResponse listGateways(ListGatewaysRequest listGatewaysRequest) throws Exception {
        RawResponse response = json(ApigConst.ListGateways, new ArrayList<>(), JSON.toJSONString(listGatewaysRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListGatewaysResponse.class);
    }

    @Override
    public GetGatewayResponse getGateway(GetGatewayRequest getGatewayRequest) throws Exception {
        RawResponse response = json(ApigConst.GetGateway, new ArrayList<>(), JSON.toJSONString(getGatewayRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GetGatewayResponse.class);
    }

    @Override
    public CreateGatewayResponse createGateway(CreateGatewayRequest createGatewayRequest) throws Exception {
        RawResponse response = json(ApigConst.CreateGateway, new ArrayList<>(), JSON.toJSONString(createGatewayRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CreateGatewayResponse.class);
    }

    @Override
    public DeleteGatewayResponse deleteGateway(DeleteGatewayRequest deleteGatewayRequest) throws Exception {
        RawResponse response = json(ApigConst.DeleteGateway, new ArrayList<>(), JSON.toJSONString(deleteGatewayRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), DeleteGatewayResponse.class);
    }

    @Override
    public CheckGatewayExistResponse checkGatewayExist(CheckGatewayExistRequest checkGatewayExistRequest) throws Exception {
        RawResponse response = json(ApigConst.CheckGatewayExist, new ArrayList<>(), JSON.toJSONString(checkGatewayExistRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CheckGatewayExistResponse.class);
    }

    @Override
    public CreateGatewayServiceResponse createGatewayService(CreateGatewayServiceRequest createGatewayServiceRequest) throws Exception {
        RawResponse response = json(ApigConst.CreateGatewayService, new ArrayList<>(), JSON.toJSONString(createGatewayServiceRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CreateGatewayServiceResponse.class);
    }

    @Override
    public UpdateGatewayServiceResponse updateGatewayService(UpdateGatewayServiceRequest updateGatewayServiceRequest) throws Exception {
        RawResponse response = json(ApigConst.UpdateGatewayService, new ArrayList<>(), JSON.toJSONString(updateGatewayServiceRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), UpdateGatewayServiceResponse.class);
    }

    @Override
    public DeleteGatewayServiceResponse deleteGatewayService(DeleteGatewayServiceRequest deleteGatewayServiceRequest) throws Exception {
        RawResponse response = json(ApigConst.DeleteGatewayService, new ArrayList<>(), JSON.toJSONString(deleteGatewayServiceRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), DeleteGatewayServiceResponse.class);
    }

    @Override
    public GetGatewayServiceResponse getGatewayService(GetGatewayServiceRequest getGatewayServiceRequest) throws Exception {
        RawResponse response = json(ApigConst.GetGatewayService, new ArrayList<>(), JSON.toJSONString(getGatewayServiceRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GetGatewayServiceResponse.class);
    }

    @Override
    public ListGatewayServicesResponse listGatewayServices(ListGatewayServicesRequest listGatewayServicesRequest) throws Exception {
        RawResponse response = json(ApigConst.ListGatewayServices, new ArrayList<>(), JSON.toJSONString(listGatewayServicesRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListGatewayServicesResponse.class);
    }

    @Override
    public CheckGatewayServiceExistResponse checkGatewayServiceExist(CheckGatewayServiceExistRequest checkGatewayServiceExistRequest) throws Exception {
        RawResponse response = json(ApigConst.CheckGatewayServiceExist, new ArrayList<>(), JSON.toJSONString(checkGatewayServiceExistRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CheckGatewayServiceExistResponse.class);
    }

    @Override
    public CreateUpstreamResponse createUpstream(CreateUpstreamRequest createUpstreamRequest) throws Exception {
        RawResponse response = json(ApigConst.CreateUpstream, new ArrayList<>(), JSON.toJSONString(createUpstreamRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CreateUpstreamResponse.class);
    }

    @Override
    public ListUpstreamsResponse listUpstreams(ListUpstreamsRequest listUpstreamsRequest) throws Exception {
        RawResponse response = json(ApigConst.ListUpstreams, new ArrayList<>(), JSON.toJSONString(listUpstreamsRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListUpstreamsResponse.class);
    }

    @Override
    public GetUpstreamResponse getUpstream(GetUpstreamRequest getUpstreamRequest) throws Exception {
        RawResponse response = json(ApigConst.GetUpstream, new ArrayList<>(), JSON.toJSONString(getUpstreamRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GetUpstreamResponse.class);
    }

    @Override
    public DeleteUpstreamResponse deleteUpstream(DeleteUpstreamRequest deleteUpstreamRequest) throws Exception {
        RawResponse response = json(ApigConst.DeleteUpstream, new ArrayList<>(), JSON.toJSONString(deleteUpstreamRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), DeleteUpstreamResponse.class);
    }

    @Override
    public UpdateUpstreamResponse updateUpstream(UpdateUpstreamRequest updateUpstreamRequest) throws Exception {
        RawResponse response = json(ApigConst.UpdateUpstream, new ArrayList<>(), JSON.toJSONString(updateUpstreamRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), UpdateUpstreamResponse.class);
    }

    @Override
    public CheckUpstreamExistResponse checkUpstreamExist(CheckUpstreamExistRequest checkUpstreamExistRequest) throws Exception {
        RawResponse response = json(ApigConst.CheckUpstreamExist, new ArrayList<>(), JSON.toJSONString(checkUpstreamExistRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CheckUpstreamExistResponse.class);
    }

    @Override
    public UpdateUpstreamVersionResponse updateUpstreamVersion(UpdateUpstreamVersionRequest updateUpstreamVersionRequest) throws Exception {
        RawResponse response = json(ApigConst.UpdateUpstreamVersion, new ArrayList<>(), JSON.toJSONString(updateUpstreamVersionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), UpdateUpstreamVersionResponse.class);
    }

    @Override
    public CreateUpstreamVersionResponse createUpstreamVersion(CreateUpstreamVersionRequest createUpstreamVersionRequest) throws Exception {
        RawResponse response = json(ApigConst.CreateUpstreamVersion, new ArrayList<>(), JSON.toJSONString(createUpstreamVersionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CreateUpstreamVersionResponse.class);
    }

    @Override
    public DeleteUpstreamVersionResponse deleteUpstreamVersion(DeleteUpstreamVersionRequest deleteUpstreamVersionRequest) throws Exception {
        RawResponse response = json(ApigConst.DeleteUpstreamVersion, new ArrayList<>(), JSON.toJSONString(deleteUpstreamVersionRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), DeleteUpstreamVersionResponse.class);
    }

    @Override
    public CheckUpstreamVersionExistResponse checkUpstreamVersionExist(CheckUpstreamVersionExistRequest checkUpstreamVersionExistRequest) throws Exception {
        RawResponse response = json(ApigConst.CheckUpstreamVersionExist, new ArrayList<>(), JSON.toJSONString(checkUpstreamVersionExistRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CheckUpstreamVersionExistResponse.class);
    }

    @Override
    public CreateUpstreamSourceResponse createUpstreamSource(CreateUpstreamSourceRequest createUpstreamSourceRequest) throws Exception {
        RawResponse response = json(ApigConst.CreateUpstreamSource, new ArrayList<>(), JSON.toJSONString(createUpstreamSourceRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CreateUpstreamSourceResponse.class);
    }

    @Override
    public ListUpstreamSourcesResponse listUpstreamSources(ListUpstreamSourcesRequest listUpstreamSourcesRequest) throws Exception {
        RawResponse response = json(ApigConst.ListUpstreamSources, new ArrayList<>(), JSON.toJSONString(listUpstreamSourcesRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListUpstreamSourcesResponse.class);
    }

    @Override
    public GetUpstreamSourceResponse getUpstreamSource(GetUpstreamSourceRequest getUpstreamSourceRequest) throws Exception {
        RawResponse response = json(ApigConst.GetUpstreamSource, new ArrayList<>(), JSON.toJSONString(getUpstreamSourceRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GetUpstreamSourceResponse.class);
    }

    @Override
    public DeleteUpstreamSourceResponse deleteUpstreamSource(DeleteUpstreamSourceRequest deleteUpstreamSourceRequest) throws Exception {
        RawResponse response = json(ApigConst.DeleteUpstreamSource, new ArrayList<>(), JSON.toJSONString(deleteUpstreamSourceRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), DeleteUpstreamSourceResponse.class);
    }

    @Override
    public UpdateUpstreamSourceResponse updateUpstreamSource(UpdateUpstreamSourceRequest updateUpstreamSourceRequest) throws Exception {
        RawResponse response = json(ApigConst.UpdateUpstreamSource, new ArrayList<>(), JSON.toJSONString(updateUpstreamSourceRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), UpdateUpstreamSourceResponse.class);
    }

    @Override
    public CreateCertificateResponse createCertificate(CreateCertificateRequest createCertificateRequest) throws Exception {
        RawResponse response = json(ApigConst.CreateCertificate, new ArrayList<>(), JSON.toJSONString(createCertificateRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CreateCertificateResponse.class);
    }

    @Override
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest deleteCertificateRequest) throws Exception {
        RawResponse response = json(ApigConst.DeleteCertificate, new ArrayList<>(), JSON.toJSONString(deleteCertificateRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), DeleteCertificateResponse.class);
    }

    @Override
    public ListCertificatesResponse listCertificates(ListCertificatesRequest listCertificatesRequest) throws Exception {
        RawResponse response = json(ApigConst.ListCertificates, new ArrayList<>(), JSON.toJSONString(listCertificatesRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListCertificatesResponse.class);
    }

    @Override
    public GetCertificateResponse getCertificate(GetCertificateRequest getCertificateRequest) throws Exception {
        RawResponse response = json(ApigConst.GetCertificate, new ArrayList<>(), JSON.toJSONString(getCertificateRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GetCertificateResponse.class);
    }

    @Override
    public CheckCertificateExistResponse checkCertificateExist(CheckCertificateExistRequest checkCertificateExistRequest) throws Exception {
        RawResponse response = json(ApigConst.CheckCertificateExist, new ArrayList<>(), JSON.toJSONString(checkCertificateExistRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CheckCertificateExistResponse.class);
    }

    @Override
    public CreateRouteResponse createRoute(CreateRouteRequest createRouteRequest) throws Exception {
        RawResponse response = json(ApigConst.CreateRoute, new ArrayList<>(), JSON.toJSONString(createRouteRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CreateRouteResponse.class);
    }

    @Override
    public UpdateRouteResponse updateRoute(UpdateRouteRequest updateRouteRequest) throws Exception {
        RawResponse response = json(ApigConst.UpdateRoute, new ArrayList<>(), JSON.toJSONString(updateRouteRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), UpdateRouteResponse.class);
    }

    @Override
    public DeleteRouteResponse deleteRoute(DeleteRouteRequest deleteRouteRequest) throws Exception {
        RawResponse response = json(ApigConst.DeleteRoute, new ArrayList<>(), JSON.toJSONString(deleteRouteRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), DeleteRouteResponse.class);
    }

    @Override
    public GetRouteResponse getRoute(GetRouteRequest getRouteRequest) throws Exception {
        RawResponse response = json(ApigConst.GetRoute, new ArrayList<>(), JSON.toJSONString(getRouteRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GetRouteResponse.class);
    }

    @Override
    public ListRoutesResponse listRoutes(ListRoutesRequest listRoutesRequest) throws Exception {
        RawResponse response = json(ApigConst.ListRoutes, new ArrayList<>(), JSON.toJSONString(listRoutesRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListRoutesResponse.class);
    }

    @Override
    public CheckRouteExistResponse checkRouteExist(CheckRouteExistRequest checkRouteExistRequest) throws Exception {
        RawResponse response = json(ApigConst.CheckRouteExist, new ArrayList<>(), JSON.toJSONString(checkRouteExistRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CheckRouteExistResponse.class);
    }

    @Override
    public CheckPortExistResponse checkPortExist(CheckPortExistRequest checkPortExistRequest) throws Exception {
        RawResponse response = json(ApigConst.CheckPortExist, new ArrayList<>(), JSON.toJSONString(checkPortExistRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CheckPortExistResponse.class);
    }

    @Override
    public GetJwtTokenResponse getJwtToken(GetJwtTokenRequest getJwtTokenRequest) throws Exception {
        RawResponse response = json(ApigConst.GetJwtToken, new ArrayList<>(), JSON.toJSONString(getJwtTokenRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), GetJwtTokenResponse.class);
    }
}
