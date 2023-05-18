// Code generated by protoc-gen-volcengine-sdk
// source: startWorkflow
// DO NOT EDIT!

package com.volcengine.example.vod.workflow;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodStartWorkflowDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodStartWorkflowRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodStartWorkflowRequest.newBuilder();
			reqBuilder.setVid("your Vid");
			reqBuilder.setTemplateId("your TemplateId");
			com.volcengine.service.vod.model.business.WorkflowParams.Builder inputBuilder = com.volcengine.service.vod.model.business.WorkflowParams.newBuilder();
			reqBuilder.setInput(inputBuilder);
			reqBuilder.setPriority(0);
			reqBuilder.setCallbackArgs("your CallbackArgs");
			reqBuilder.setEnableLowPriority(false);
			com.volcengine.service.vod.model.business.DirectUrl.Builder directUrlBuilder = com.volcengine.service.vod.model.business.DirectUrl.newBuilder();
			reqBuilder.setDirectUrl(directUrlBuilder);
			reqBuilder.setTaskListId("your TaskListId");
			
            com.volcengine.service.vod.model.response.VodStartWorkflowResponse resp = vodService.startWorkflow(reqBuilder.build());
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