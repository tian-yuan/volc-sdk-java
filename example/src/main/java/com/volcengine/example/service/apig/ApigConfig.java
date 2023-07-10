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

public class ApigConfig {
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
    public static Map<String, ApiInfo> apiInfoList = new HashMap<String, ApiInfo>() {
        {
            put(ApigConst.ListGateways, new ApiInfo(
                new HashMap<String, Object>() {
                    {
                        put(Const.Method, "POST");
                        put(Const.Path, "/");
                        put(Const.Query, new ArrayList<NameValuePair>() {
                            {
                                add(new org.apache.http.message.BasicNameValuePair("Action", ApigConst.ListGateways));
                                add(new BasicNameValuePair("Version", "2021-03-03"));
                            }
                        });
                    }
                }
            ));
            put(ApigConst.CreateRoute, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new org.apache.http.message.BasicNameValuePair("Action", ApigConst.CreateRoute));
                                    add(new BasicNameValuePair("Version", "2022-11-12"));
                                }
                            });
                        }
                    }
            ));
            put(ApigConst.CreateUpstream, new ApiInfo(
                    new HashMap<String, Object>() {
                        {
                            put(Const.Method, "POST");
                            put(Const.Path, "/");
                            put(Const.Query, new ArrayList<NameValuePair>() {
                                {
                                    add(new org.apache.http.message.BasicNameValuePair("Action", ApigConst.CreateUpstream));
                                    add(new BasicNameValuePair("Version", "2021-03-03"));
                                }
                            });
                        }
                    }
            ));
        }
    };
}
