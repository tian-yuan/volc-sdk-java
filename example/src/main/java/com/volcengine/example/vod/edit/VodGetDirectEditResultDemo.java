package com.volcengine.example.vod.edit;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
import com.volcengine.service.vod.model.request.VodGetDirectEditResultRequest;
import com.volcengine.service.vod.model.response.VodGetDirectEditResultResponse;

public class VodGetDirectEditResultDemo {

    public static void main(String[] args) {
        IVodService vodService = VodServiceImpl.getInstance();

        // call below method if you dont set ak and sk in ～/.vcloud/config
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");


        VodGetDirectEditResultRequest vodGetDirectEditResultRequest = VodGetDirectEditResultRequest.newBuilder()
                .addReqIds("your reqId")
                .build();

        try {
            VodGetDirectEditResultResponse vodGetDirectEditResultResponse = vodService.getDirectEditResult(vodGetDirectEditResultRequest);
            if (vodGetDirectEditResultResponse.getResponseMetadata().hasError()) {
                System.out.println(vodGetDirectEditResultResponse.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(vodGetDirectEditResultResponse.toString()); // 如有汉字，请采用UTF8编码方式
            System.out.println(vodGetDirectEditResultResponse.getResponseMetadata().getRequestId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
