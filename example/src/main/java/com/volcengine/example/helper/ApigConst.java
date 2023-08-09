package com.volcengine.example.helper;

public class ApigConst {
    public static final String VersionV1 = "2021-03-03";
    public static final String VersionV2 = "2022-11-12";

    // gateway
    public static final String CreateGateway = "CreateGateway";
    public static final String ListGateways = "ListGateways";
    public static final String GetGateway = "GetGateway";
    public static final String DeleteGateway = "DeleteGateway";
    public static final String CheckGatewayExist = "CheckGatewayExist";

    // auth
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
    public static final String UpdateRoute = "UpdateRoute";
    public static final String DeleteRoute = "DeleteRoute";
    public static final String GetRoute = "GetRoute";
    public static final String ListRoutes = "ListRoutes";
    public static final String CheckRouteExist = "CheckRouteExist";
    public static final String CheckPortExist = "CheckPortExist";

    public static final String MatchTypeExact = "Exact";
    public static final String MatchTypePrefix = "Prefix";
    public static final String MatchTypeRegex = "Regex";

    // upstream
    public static final String CreateUpstream = "CreateUpstream";
    public static final String CheckBackendUsed = "CheckBackendUsed";
    public static final String ListUpstreams = "ListUpstreams";
    public static final String GetUpstream = "GetUpstream";
    public static final String DeleteUpstream = "DeleteUpstream";
    public static final String UpdateUpstream = "UpdateUpstream";
    public static final String CheckUpstreamExist = "CheckUpstreamExist";
    public static final String UpdateUpstreamVersion = "UpdateUpstreamVersion";
    public static final String CreateUpstreamVersion = "CreateUpstreamVersion";
    public static final String DeleteUpstreamVersion = "DeleteUpstreamVersion";
    public static final String CheckUpstreamVersionExist = "CheckUpstreamVersionExist";
    public static final String CheckUpstreamSpecExist = "CheckUpstreamSpecExist";

    public static final String UpstreamSourceTypeFixedIP = "FixedIP";

    // upstream source
    public static final String CreateUpstreamSource = "CreateUpstreamSource";
    public static final String ListUpstreamSources = "ListUpstreamSources";
    public static final String GetUpstreamSource = "GetUpstreamSource";
    public static final String DeleteUpstreamSource = "DeleteUpstreamSource";
    public static final String UpdateUpstreamSource = "UpdateUpstreamSource";

    // cert
    public static final String CreateCertificate = "CreateCertificate";
    public static final String DeleteCertificate = "DeleteCertificate";
    public static final String ListCertificates = "ListCertificates";
    public static final String GetCertificate = "GetCertificate";
    public static final String CheckCertificateExist = "CheckCertificateExist";
}
