package com.volcengine.example.service.apig;

import com.volcengine.example.helper.ApigConst;
import com.volcengine.helper.Const;
import com.volcengine.model.ApiInfo;
import com.volcengine.model.Credentials;
import com.volcengine.model.ServiceInfo;
import org.apache.http.Header;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ApigConfig {
    public static String[][] apiActionVersionInfoList = new String[][]{
            // gateway
            {ApigConst.CreateGateway, ApigConst.VersionV1},
            {ApigConst.GetGateway, ApigConst.VersionV1},
            {ApigConst.ListGateways, ApigConst.VersionV1},
            {ApigConst.DeleteGateway, ApigConst.VersionV1},
            {ApigConst.CheckGatewayExist, ApigConst.VersionV1},

            // gateway service
            {ApigConst.CreateGatewayService, ApigConst.VersionV1},
            {ApigConst.UpdateGatewayService, ApigConst.VersionV1},
            {ApigConst.DeleteGatewayService, ApigConst.VersionV1},
            {ApigConst.GetGatewayService, ApigConst.VersionV1},
            {ApigConst.ListGatewayServices, ApigConst.VersionV1},
            {ApigConst.CheckGatewayServiceExist, ApigConst.VersionV1},

            // auth
            {ApigConst.GetJwtToken, ApigConst.VersionV1},

            // route
            {ApigConst.CreateRoute, ApigConst.VersionV2},
            {ApigConst.UpdateRoute, ApigConst.VersionV2},
            {ApigConst.DeleteRoute, ApigConst.VersionV2},
            {ApigConst.GetRoute, ApigConst.VersionV2},
            {ApigConst.ListRoutes, ApigConst.VersionV2},
            {ApigConst.CheckRouteExist, ApigConst.VersionV2},
            {ApigConst.CheckPortExist, ApigConst.VersionV1},

            // upstream
            {ApigConst.CreateUpstream, ApigConst.VersionV1},
            {ApigConst.CheckBackendUsed, ApigConst.VersionV1},
            {ApigConst.ListUpstreams, ApigConst.VersionV1},
            {ApigConst.GetUpstream, ApigConst.VersionV1},
            {ApigConst.DeleteUpstream, ApigConst.VersionV1},
            {ApigConst.UpdateUpstream, ApigConst.VersionV1},
            {ApigConst.CheckUpstreamExist, ApigConst.VersionV1},
            {ApigConst.UpdateUpstreamVersion, ApigConst.VersionV1},
            {ApigConst.CreateUpstreamVersion, ApigConst.VersionV1},
            {ApigConst.DeleteUpstreamVersion, ApigConst.VersionV1},
            {ApigConst.CheckUpstreamVersionExist, ApigConst.VersionV1},
            {ApigConst.CheckUpstreamSpecExist, ApigConst.VersionV1},

            // upstream source
            {ApigConst.CreateUpstreamSource, ApigConst.VersionV1},
            {ApigConst.ListUpstreamSources, ApigConst.VersionV1},
            {ApigConst.GetUpstreamSource, ApigConst.VersionV1},
            {ApigConst.DeleteUpstreamSource, ApigConst.VersionV1},
            {ApigConst.UpdateUpstreamSource, ApigConst.VersionV1},

            // cert
            {ApigConst.CreateCertificate, ApigConst.VersionV1},
            {ApigConst.DeleteCertificate, ApigConst.VersionV1},
            {ApigConst.ListCertificates, ApigConst.VersionV1},
            {ApigConst.GetCertificate, ApigConst.VersionV1},
            {ApigConst.CheckCertificateExist, ApigConst.VersionV1},
    };
    public static ServiceInfo serviceInfo = new ServiceInfo(
        new HashMap<String, Object>() {
            {
                put(Const.CONNECTION_TIMEOUT, 5000);
                put(Const.SOCKET_TIMEOUT, 5000);
                put(Const.Host, "volc-top.cadp-system:30040");
                put(Const.Header, new ArrayList<Header>() {
                    {
                        add(new BasicHeader("Accept", "application/json"));
                    }
                });
                put(Const.Credentials, new Credentials(Const.REGION_CN_NORTH_1, "apig"));
            }
        }
    );
    public static Map<String, ApiInfo> apiInfoList = Stream.of(apiActionVersionInfoList).collect(
        Collectors.toMap(data -> data[0], data -> {
            return new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new org.apache.http.message.BasicNameValuePair("Action", data[0]));
                                    add(new BasicNameValuePair("Version", data[1]));
                                }
                            });
                        }
                    }
            );
        })
    );
}
