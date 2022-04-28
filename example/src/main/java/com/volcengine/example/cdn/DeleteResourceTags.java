package com.volcengine.example.cdn;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.beans.CDN;
import com.volcengine.service.cdn.CDNService;
import com.volcengine.service.cdn.impl.CDNServiceImpl;

import java.util.Arrays;

public class DeleteResourceTags {
    public static void main(String[] args) {
        CDNService service = CDNServiceImpl.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");
        try {
            CDN.DeleteResourceTagsRequest req = new CDN.DeleteResourceTagsRequest()
                    .setResources(Arrays.asList("www.example.com", "www.example2.com"))
                    .setResourceTags(Arrays.asList(new CDN.ResourceTagEntry().setKey("userKey").setValue("userValue")));

            CDN.EmptyResponse resp = service.deleteResourceTags(req);
            System.out.println(JSON.toJSONString(resp));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}