// Code generated by protoc-gen-volcengine-sdk
// source: DescribeForbiddenStreamInfoByPage
// DO NOT EDIT!

package com.volcengine.service.live.stream_manage;

import com.volcengine.service.live.ILiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

public class LiveDescribeForbiddenStreamInfoByPageDemo {

    public static void main(String[] args) throws Exception {
        ILiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your ak");
        liveService.setSecretKey("your sk");

        try {
            com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest.Builder reqBuilder = com.volcengine.service.live.model.request.DescribeForbiddenStreamInfoByPageRequest.newBuilder();
			reqBuilder.setPageNum(0);
			reqBuilder.setPageSize(0);
			reqBuilder.setVhost("your Vhost");
			reqBuilder.setApp("your App");
			reqBuilder.setStream("your Stream");
			reqBuilder.setSort("your Sort");
			
            com.volcengine.service.live.model.response.DescribeForbiddenStreamInfoByPageResponse resp = liveService.DescribeForbiddenStreamInfoByPage(reqBuilder.build());
            if (resp.getResponseMetadata().hasError()) {
                System.out.println(resp.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}