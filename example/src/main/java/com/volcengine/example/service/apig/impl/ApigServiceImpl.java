package com.volcengine.example.service.apig.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.example.helper.ApigConst;
import com.volcengine.example.model.request.CreateRouteRequest;
import com.volcengine.example.model.request.CreateUpstreamRequest;
import com.volcengine.example.model.request.ListGatewaysRequest;
import com.volcengine.example.model.response.CreateRouteResponse;
import com.volcengine.example.model.response.CreateUpstreamResponse;
import com.volcengine.example.model.response.ListGatewaysResponse;
import com.volcengine.example.service.apig.ApigConfig;
import com.volcengine.example.service.apig.IApigService;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.response.RawResponse;
import com.volcengine.model.response.billing.ListBillResponse;
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
        RawResponse response = query(ApigConst.ListGateways, Utils.mapToPairList(Utils.paramsToMap(listGatewaysRequest)));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), ListGatewaysResponse.class);
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
    public CreateRouteResponse createRoute(CreateRouteRequest createRouteRequest) throws Exception {
        RawResponse response = json(ApigConst.CreateRoute, new ArrayList<>(), JSON.toJSONString(createRouteRequest));
        if (response.getCode() != SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }

        return JSON.parseObject(response.getData(), CreateRouteResponse.class);
    }
}
