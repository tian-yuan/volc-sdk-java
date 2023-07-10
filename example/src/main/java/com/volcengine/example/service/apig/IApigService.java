package com.volcengine.example.service.apig;

import com.volcengine.example.model.request.ListGatewaysRequest;
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
}
