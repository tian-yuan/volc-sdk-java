package com.volcengine.service.sercretnumber.impl;

import com.alibaba.fastjson.JSON;
import com.volcengine.error.SdkError;
import com.volcengine.helper.Const;
import com.volcengine.helper.Utils;
import com.volcengine.model.response.RawResponse;
import com.volcengine.service.BaseServiceImpl;
import com.volcengine.service.sercretnumber.ISecretNumberService;
import com.volcengine.service.sercretnumber.SecretNumberConfig;
import com.volcengine.service.sercretnumber.model.request.BindAXBRequest;
import com.volcengine.service.sercretnumber.model.request.BindAXNRequest;
import com.volcengine.service.sercretnumber.model.request.QuerySubscriptionForListRequest;
import com.volcengine.service.sercretnumber.model.request.SelectNumberAndBindAXBRequest;
import com.volcengine.service.sercretnumber.model.request.SpecificSubIdRequest;
import com.volcengine.service.sercretnumber.model.request.UpdateAXBRequest;
import com.volcengine.service.sercretnumber.model.request.UpdateAXNRequest;
import com.volcengine.service.sercretnumber.model.request.UpgradeAXToAXBRequest;
import com.volcengine.service.sercretnumber.model.response.OperationResponse;
import com.volcengine.service.sercretnumber.model.response.QuerySubscriptionForListResponse;
import com.volcengine.service.sercretnumber.model.response.QuerySubscriptionResponse;
import com.volcengine.service.sercretnumber.model.response.SecretBindResponse;

public class SecretNumberServiceImpl extends BaseServiceImpl implements ISecretNumberService {

  protected SecretNumberServiceImpl() {
    super(SecretNumberConfig.serviceInfoMap.get(Const.REGION_CN_NORTH_1),
        SecretNumberConfig.apiInfoList);
  }

  public static SecretNumberServiceImpl getInstance() {
    return new SecretNumberServiceImpl();
  }

  @Override
  public SecretBindResponse bindAXB(BindAXBRequest request) throws Exception {
    RawResponse response = query("BindAXB", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), SecretBindResponse.class);
  }

  @Override
  public SecretBindResponse selectNumberAndBindAXB(SelectNumberAndBindAXBRequest request)
      throws Exception {
    RawResponse response = query("SelectNumberAndBindAXB",
        Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), SecretBindResponse.class);
  }

  @Override
  public OperationResponse unbindAXB(SpecificSubIdRequest request) throws Exception {
    RawResponse response = query("UnbindAXB", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), OperationResponse.class);
  }

  @Override
  public QuerySubscriptionResponse querySubscription(SpecificSubIdRequest request)
      throws Exception {
    RawResponse response = query("QuerySubscription",
        Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), QuerySubscriptionResponse.class);
  }

  @Override
  public QuerySubscriptionForListResponse querySubscriptionForList(
      QuerySubscriptionForListRequest request) throws Exception {
    RawResponse response = query("QuerySubscriptionForList",
        Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), QuerySubscriptionForListResponse.class);
  }

  @Override
  public SecretBindResponse upgradeAXToAXB(UpgradeAXToAXBRequest request) throws Exception {
    RawResponse response = query("UpgradeAXToAXB", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), SecretBindResponse.class);
  }

  @Override
  public OperationResponse updateAXB(UpdateAXBRequest request) throws Exception {
    RawResponse response = query("UpdateAXB", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), OperationResponse.class);
  }

  @Override
  public SecretBindResponse bindAXN(BindAXNRequest request) throws Exception {
    RawResponse response = query("BindAXN", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), SecretBindResponse.class);
  }

  @Override
  public OperationResponse updateAXN(UpdateAXNRequest request) throws Exception {
    RawResponse response = query("UpdateAXN", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), OperationResponse.class);
  }

  @Override
  public OperationResponse unbindAXN(SpecificSubIdRequest request) throws Exception {
    RawResponse response = query("UnbindAXN", Utils.mapToPairList(Utils.paramsToMap(request)));
    if (response.getCode() != SdkError.SUCCESS.getNumber()) {
      throw response.getException();
    }
    return JSON.parseObject(response.getData(), OperationResponse.class);
  }
}