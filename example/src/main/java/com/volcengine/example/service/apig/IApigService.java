package com.volcengine.example.service.apig;

import com.volcengine.example.helper.ApigConst;
import com.volcengine.example.model.request.*;
import com.volcengine.example.model.response.*;
import com.volcengine.service.IBaseService;

public interface IApigService extends IBaseService {
    /**
     * List Gateways.
     *
     * @param listGatewaysRequest the list gateways request
     * @return the list gateways response
     * @throws Exception the exception
     */
    ListGatewaysResponse listGateways(ListGatewaysRequest listGatewaysRequest) throws Exception;
    GetGatewayResponse getGateway(GetGatewayRequest getGatewayRequest) throws Exception;
    CreateGatewayResponse createGateway(CreateGatewayRequest createGatewayRequest) throws Exception;
    DeleteGatewayResponse deleteGateway(DeleteGatewayRequest deleteGatewayRequest) throws Exception;
    CheckGatewayExistResponse checkGatewayExist(CheckGatewayExistRequest checkGatewayExistRequest) throws Exception;

    CreateGatewayServiceResponse createGatewayService(CreateGatewayServiceRequest createGatewayServiceRequest) throws Exception;
    UpdateGatewayServiceResponse updateGatewayService(UpdateGatewayServiceRequest updateGatewayServiceRequest) throws Exception;
    DeleteGatewayServiceResponse deleteGatewayService(DeleteGatewayServiceRequest deleteGatewayServiceRequest) throws Exception;
    GetGatewayServiceResponse getGatewayService(GetGatewayServiceRequest getGatewayServiceRequest) throws Exception;
    ListGatewayServicesResponse listGatewayServices(ListGatewayServicesRequest listGatewayServicesRequest) throws Exception;
    CheckGatewayServiceExistResponse checkGatewayServiceExist(CheckGatewayServiceExistRequest checkGatewayServiceExistRequest) throws Exception;

    /**
     * get jwt token.
     *
     * @param getJwtTokenRequest the get jwt token request
     * @return the get jwt token response
     * @throws Exception the exception
     */
    GetJwtTokenResponse getJwtToken(GetJwtTokenRequest getJwtTokenRequest) throws Exception;

    /**
     * create route.
     *
     * @param createRouteRequest the create route request
     * @return the creation route response
     * @throws Exception the exception
     */
    CreateRouteResponse createRoute(CreateRouteRequest createRouteRequest) throws Exception;
    UpdateRouteResponse updateRoute(UpdateRouteRequest updateRouteRequest) throws Exception;
    DeleteRouteResponse deleteRoute(DeleteRouteRequest deleteRouteRequest) throws Exception;
    GetRouteResponse getRoute(GetRouteRequest getRouteRequest) throws Exception;
    ListRoutesResponse listRoutes(ListRoutesRequest listRoutesRequest) throws Exception;
    CheckRouteExistResponse checkRouteExist(CheckRouteExistRequest checkRouteExistRequest) throws Exception;
    CheckPortExistResponse checkPortExist(CheckPortExistRequest checkPortExistRequest) throws Exception;

    /**
     * create upstream.
     *
     * @param createUpstreamRequest the create upstream request
     * @return the creation upstream response
     * @throws Exception the exception
     */
    CreateUpstreamResponse createUpstream(CreateUpstreamRequest createUpstreamRequest) throws Exception;

    ListUpstreamsResponse listUpstreams(ListUpstreamsRequest listUpstreamsRequest) throws Exception;
    GetUpstreamResponse getUpstream(GetUpstreamRequest getUpstreamRequest) throws Exception;
    DeleteUpstreamResponse deleteUpstream(DeleteUpstreamRequest deleteUpstreamRequest) throws Exception;
    UpdateUpstreamResponse updateUpstream(UpdateUpstreamRequest updateUpstreamRequest) throws Exception;
    CheckUpstreamExistResponse checkUpstreamExist(CheckUpstreamExistRequest checkUpstreamExistRequest) throws Exception;
    UpdateUpstreamVersionResponse updateUpstreamVersion(UpdateUpstreamVersionRequest updateUpstreamVersionRequest) throws Exception;
    CreateUpstreamVersionResponse createUpstreamVersion(CreateUpstreamVersionRequest createUpstreamVersionRequest) throws Exception;
    DeleteUpstreamVersionResponse deleteUpstreamVersion(DeleteUpstreamVersionRequest deleteUpstreamVersionRequest) throws Exception;
    CheckUpstreamVersionExistResponse checkUpstreamVersionExist(CheckUpstreamVersionExistRequest checkUpstreamVersionExistRequest) throws Exception;

    // upstream source
    CreateUpstreamSourceResponse createUpstreamSource(CreateUpstreamSourceRequest createUpstreamSourceRequest) throws Exception;
    ListUpstreamSourcesResponse listUpstreamSources(ListUpstreamSourcesRequest listUpstreamSourcesRequest) throws Exception;
    GetUpstreamSourceResponse getUpstreamSource(GetUpstreamSourceRequest getUpstreamSourceRequest) throws Exception;
    DeleteUpstreamSourceResponse deleteUpstreamSource(DeleteUpstreamSourceRequest deleteUpstreamSourceRequest) throws Exception;
    UpdateUpstreamSourceResponse updateUpstreamSource(UpdateUpstreamSourceRequest updateUpstreamSourceRequest) throws Exception;

    // cert
    CreateCertificateResponse createCertificate(CreateCertificateRequest createCertificateRequest) throws Exception;
    DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest deleteCertificateRequest) throws Exception;
    ListCertificatesResponse listCertificates(ListCertificatesRequest listCertificatesRequest) throws Exception;
    GetCertificateResponse getCertificate(GetCertificateRequest getCertificateRequest) throws Exception;
    CheckCertificateExistResponse checkCertificateExist(CheckCertificateExistRequest checkCertificateExistRequest) throws Exception;
}
