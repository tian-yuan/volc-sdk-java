package com.volcengine.example.service.apig;

import com.volcengine.example.model.request.CreateRouteRequest;
import com.volcengine.example.model.request.CreateUpstreamRequest;
import com.volcengine.example.model.request.ListGatewaysRequest;
import com.volcengine.example.model.response.CreateRouteResponse;
import com.volcengine.example.model.response.CreateUpstreamResponse;
import com.volcengine.example.model.response.ListGatewaysResponse;
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

    /**
     * create upstream.
     *
     * @param createUpstreamRequest the create upstream request
     * @return the creation upstream response
     * @throws Exception the exception
     */
    CreateUpstreamResponse createUpstream(CreateUpstreamRequest createUpstreamRequest) throws Exception;

    /**
     * create route.
     *
     * @param createRouteRequest the create route request
     * @return the creation route response
     * @throws Exception the exception
     */
    CreateRouteResponse createRoute(CreateRouteRequest createRouteRequest) throws Exception;
}
