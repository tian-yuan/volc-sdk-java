package com.volcengine.example.live;

import com.alibaba.fastjson.JSON;
import com.volcengine.model.live.request.*;
import com.volcengine.model.live.response.*;
import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

/**
 * 与Cert相关的demo
 */
public class LiveCertDemo {
    public static void main(String[] args) {
        LiveService liveService = LiveServiceImpl.getInstance();

        liveService.setAccessKey("your accessKey");
        liveService.setSecretKey("your secretKey");
        //查询某个AccountID下的证书查询
        listCertDemo(liveService);
        //上传第三方证书
        createCertDemo(liveService);
        //查询证书详情
        describeCertDetailSecretDemo(liveService);
        //更新某个证书
        updateCertDemo(liveService);
        //为某个domain绑定证书
        bindCertDemo(liveService);
        //为这个domain解绑证书
        unbindCertDemo(liveService);
        //删除一个证书
        deleteCertDemo(liveService);
    }

    /**
     * 查询某个AccountID下的证书查询
     *
     * @param liveService
     */
    private static void listCertDemo(LiveService liveService) {
        ListCertRequest request = new ListCertRequest();
        try {
            ListCertResponse response = liveService.listCert(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 上传第三方证书
     *
     * @param liveService
     */
    private static void createCertDemo(LiveService liveService) {
        CreateCertRequest request = new CreateCertRequest();
        try {
            CreateCertResponse response = liveService.createCert(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询证书详情
     *
     * @param liveService
     */
    private static void describeCertDetailSecretDemo(LiveService liveService) {
        DescribeCertDetailSecretRequest request = new DescribeCertDetailSecretRequest();
        try {
            DescribeCertDetailSecretResponse response = liveService.describeCertDetailSecret(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 更新某个证书
     *
     * @param liveService
     */
    private static void updateCertDemo(LiveService liveService) {
        UpdateCertRequest request = new UpdateCertRequest();
        try {
            UpdateCertResponse response = liveService.updateCert(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 为某个domain绑定证书
     *
     * @param liveService
     */
    private static void bindCertDemo(LiveService liveService) {
        BindCertRequest request = new BindCertRequest();
        try {
            BindCertResponse response = liveService.bindCert(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 为这个domain解绑证书
     *
     * @param liveService
     */
    private static void unbindCertDemo(LiveService liveService) {
        UnbindCertRequest request = new UnbindCertRequest();
        try {
            UnbindCertResponse response = liveService.unbindCert(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除一个证书
     *
     * @param liveService
     */
    private static void deleteCertDemo(LiveService liveService) {
        DeleteCertRequest request = new DeleteCertRequest();
        try {
            DeleteCertResponse response = liveService.deleteCert(request);
            System.out.println(JSON.toJSONString(response));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
