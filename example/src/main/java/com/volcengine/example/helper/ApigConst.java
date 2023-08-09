package com.volcengine.example.helper;

public class ApigConst {
    public static final String VersionV1 = "2021-03-03";
    public static final String VersionV2 = "2022-11-12";
    public static final String ListGateways = "ListGateways";
    public static final String GetJwtToken = "GetJwtToken";

    // gateway service
    public static final String CreateGatewayService = "CreateGatewayService";
    public static final String UpdateGatewayService = "UpdateGatewayService";
    public static final String GetGatewayService = "GetGatewayService";
    public static final String ListGatewayServices = "ListGatewayServices";
    public static final String DeleteGatewayService = "DeleteGatewayService";
    public static final String CheckGatewayServiceExist = "CheckGatewayServiceExist";

    // route
    public static final String CreateRoute = "CreateRoute";
    public static final String MatchTypeExact = "Exact";
    public static final String MatchTypePrefix = "Prefix";
    public static final String MatchTypeRegex = "Regex";

    // upstream
    public static final String CreateUpstream = "CreateUpstream";
    public static final String UpstreamSourceTypeFixedIP = "FixedIP";
}
