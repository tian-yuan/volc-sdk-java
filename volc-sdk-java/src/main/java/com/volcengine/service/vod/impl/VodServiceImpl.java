
// Code generated by protoc-gen-volcengine-sdk
// source: vod/service/service_vod.proto
// DO NOT EDIT!

package com.volcengine.service.vod.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.protobuf.util.JsonFormat;
import com.google.common.base.Predicates;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import com.github.rholder.retry.*;

public class VodServiceImpl extends com.volcengine.service.BaseServiceImpl implements com.volcengine.service.vod.IVodService {
	
	protected VodServiceImpl() {
        super(com.volcengine.service.vod.VodConfig.ServiceInfoMap.get(com.volcengine.helper.Const.REGION_CN_NORTH_1), com.volcengine.service.vod.VodConfig.apiInfoList);
    }

    private VodServiceImpl(com.volcengine.model.ServiceInfo serviceInfo) {
        super(serviceInfo, com.volcengine.service.vod.VodConfig.apiInfoList);
    }

    public static com.volcengine.service.vod.IVodService getInstance() {
        return new VodServiceImpl();
    }

    public static com.volcengine.service.vod.IVodService getInstance(String region) throws Exception {
        com.volcengine.model.ServiceInfo serviceInfo = com.volcengine.service.vod.VodConfig.ServiceInfoMap.get(region);
        if (serviceInfo == null) {
            throw new Exception("Cant find the region, please check it carefully");
        }
        return new VodServiceImpl(serviceInfo);
    }

	@Override
    public String getPlayAuthToken(com.volcengine.model.vod.request.VodGetPlayInfoRequest input) throws Exception {
        String getPlayInfoToken = getSignUrl(com.volcengine.helper.Const.GetPlayInfo, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, false)));
        Map<String, String> ret = new HashMap<>();
        ret.put("GetPlayInfoToken", getPlayInfoToken);
        ret.put("TokenVersion", "V2");
        String retStr = JSON.toJSONString(ret);
        Base64.Encoder encoder = Base64.getEncoder();
        return encoder.encodeToString(retStr.getBytes());
    }

    @Override
    public com.volcengine.model.sts2.SecurityToken2 getUploadSts2() throws Exception {
        return getUploadSts2WithExpire(com.volcengine.util.Time.Hour);
    }

    @Override
    public com.volcengine.model.sts2.SecurityToken2 getUploadSts2WithExpire(long expire) throws Exception {
        com.volcengine.model.sts2.Policy inlinePolicy = new com.volcengine.model.sts2.Policy();
        List<String> actions = new ArrayList<>();
        actions.add("vod:ApplyUploadInfo");
        actions.add("vod:CommitUploadInfo");

        List<String> resources = new ArrayList<>();
        com.volcengine.model.sts2.Statement statement = com.volcengine.util.Sts2Utils.newAllowStatement(actions, resources);
        inlinePolicy.addStatement(statement);
        return signSts2(inlinePolicy, expire);
    }

    @Override
    public com.volcengine.model.vod.response.VodCommitUploadInfoResponse uploadMedia(com.volcengine.model.vod.request.VodUploadMediaRequest vodUploadMediaRequest) throws Exception {
        com.volcengine.model.beans.UploadCompleteInfo uploadCompleteInfo = uploadToB(vodUploadMediaRequest.getSpaceName(), vodUploadMediaRequest.getFilePath());

        com.volcengine.model.vod.request.VodCommitUploadInfoRequest vodCommitUploadInfoRequest = com.volcengine.model.vod.request.VodCommitUploadInfoRequest.newBuilder()
                .setSpaceName(vodUploadMediaRequest.getSpaceName())
                .setSessionKey(uploadCompleteInfo.getSessionKey())
                .setFunctions(vodUploadMediaRequest.getFunctions())
                .setCallbackArgs(vodUploadMediaRequest.getCallbackArgs())
                .build();

        return commitUploadInfo(vodCommitUploadInfoRequest);
    }

    private com.volcengine.model.beans.UploadCompleteInfo uploadToB(String spaceName, String filePath) throws Exception {
        java.io.File file = new java.io.File(filePath);
        if (!(file.isFile() && file.exists())) {
            throw new Exception(com.volcengine.error.SdkError.getErrorDesc(com.volcengine.error.SdkError.ENOFILE));
        }

        com.volcengine.model.vod.request.VodApplyUploadInfoRequest vodApplyUploadInfoRequest = com.volcengine.model.vod.request.VodApplyUploadInfoRequest.newBuilder()
                .setSpaceName(spaceName)
                .build();

        com.volcengine.model.vod.response.VodApplyUploadInfoResponse vodApplyUploadInfoResponse = applyUploadInfo(vodApplyUploadInfoRequest);
        if (vodApplyUploadInfoResponse.getResponseMetadata().hasError()) {
            throw new Exception(vodApplyUploadInfoResponse.getResponseMetadata().getError().getMessage());
        }
        com.volcengine.model.vod.business.VodUploadAddress vodUploadAddress = vodApplyUploadInfoResponse.getResult().getData().getUploadAddress();
        if (!vodApplyUploadInfoResponse.hasResult() || vodUploadAddress.getStoreInfosCount() == 0) {
            throw new Exception("apply upload result is null");
        }

        String oid = vodUploadAddress.getStoreInfos(0).getStoreUri();
        String sessionKey = vodUploadAddress.getSessionKey();
        String auth = vodUploadAddress.getStoreInfos(0).getAuth();
        String host = vodUploadAddress.getUploadHosts(0);

        Retryer retryer = RetryerBuilder.newBuilder()
                .retryIfException()
                .retryIfResult(Predicates.equalTo(false))
                .retryIfResult(Predicates.isNull())
                .withWaitStrategy(WaitStrategies.exponentialWait())
                .withStopStrategy(StopStrategies.stopAfterAttempt(3))
                .build();

        if (file.length() < com.volcengine.helper.Const.MinChunkSize) {
            directUpload(host, oid, auth, file, retryer);
        } else {
            boolean isLargeFile = false;
            if (file.length() > com.volcengine.helper.Const.LargeFileSize) {
                isLargeFile = true;
            }
            chunkUpload(host, oid, auth, file, isLargeFile, retryer);
        }

        com.volcengine.model.beans.UploadCompleteInfo uploadCompleteInfo = new com.volcengine.model.beans.UploadCompleteInfo(oid, sessionKey);
        return uploadCompleteInfo;
    }

    private void directUpload(String host, String oid, String auth, File file, Retryer retryer) throws Exception {
        String url = String.format("https://%s/%s", host, oid);
        byte[] bytes = Files.readAllBytes(Paths.get(file.getPath()));
        long crc32 = com.volcengine.helper.Utils.crc32(bytes);
        String checkSum = String.format("%08x", crc32);
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", auth);
        headers.put("Content-CRC32", checkSum);
        retryer.call(() -> putData(url, bytes, headers));
    }

    private void chunkUpload(String host, String oid, String auth, File file, boolean isLargeFile, Retryer retryer) throws Exception {
        String uploadID = initUploadPart(host, oid, auth, isLargeFile, retryer);
        byte[] data = new byte[com.volcengine.helper.Const.MinChunkSize];
        List<String> parts = new ArrayList<>();
        long num = file.length() / com.volcengine.helper.Const.MinChunkSize;
        long lastNum = num - 1;
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))) {
            for (long i = 0; i < lastNum; i++) {
                bis.read(data);
                parts.add(uploadPart(host, oid, auth, uploadID, i, data, isLargeFile, retryer));
            }
            long readCount = (long) com.volcengine.helper.Const.MinChunkSize * lastNum;
            int len = (int) (file.length() - readCount);
            byte[] lastPart = new byte[len];
            bis.read(lastPart);
            parts.add(uploadPart(host, oid, auth, uploadID, lastNum, lastPart, isLargeFile, retryer));
        } catch (Exception e) {
            throw e;
        }
        uploadMergePart(host, oid, auth, uploadID, parts.stream().toArray(String[]::new), isLargeFile, retryer);
    }

    private String initUploadPart(String host, String oid, String auth, boolean isLargeFile, Retryer retryer) throws ExecutionException, RetryException, IOException {
        String url = String.format("http://%s/%s?uploads", host, oid);
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", auth);
        if (isLargeFile) {
            headers.put("X-Storage-Mode", "gateway");
        }
        HttpResponse httpResponse = (HttpResponse) (retryer.call(() -> putDataWithResponse(url, new byte[]{}, headers)));
        if (httpResponse == null) {
            throw new RuntimeException("init part error,response is empty");
        }
        if (httpResponse.getStatusLine().getStatusCode() != 200) {
            throw new RuntimeException("http code is " + httpResponse.getStatusLine().getStatusCode());
        }
        String entity = EntityUtils.toString(httpResponse.getEntity());
        JSONObject result = JSONObject.parseObject(entity);
        return result.getJSONObject("payload").getInnerMap().get("uploadID").toString();
    }

    private String uploadPart(String host, String oid, String auth, String uploadID, long partNumber, byte[] data, boolean isLargeFile, Retryer retryer) throws Exception {
        String url = String.format("http://%s/%s?partNumber=%d&uploadID=%s", host, oid, partNumber, uploadID);
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", auth);
        long crc32 = com.volcengine.helper.Utils.crc32(data);
        String checkSum = String.format("%08x", crc32);
        headers.put("Content-CRC32", checkSum);
        if (isLargeFile) {
            headers.put("X-Storage-Mode", "gateway");
        }
        retryer.call(() -> putData(url, data, headers));
        return checkSum;
    }

    private void uploadMergePart(String host, String oid, String auth, String uploadID, String[] checkSum, boolean isLargeFile, Retryer retryer) throws ExecutionException, RetryException {
        String url = String.format("http://%s/%s?uploadID=%s", host, oid, uploadID);
        String body = IntStream.range(0, checkSum.length).mapToObj(i -> String.format("%d:%s", i, checkSum[i])).collect(Collectors.joining(",", "", ""));
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", auth);
        if (isLargeFile) {
            headers.put("X-Storage-Mode", "gateway");
        }
        retryer.call(() -> putData(url, body.getBytes(), headers));
    }


	/**
     * getPlayInfo.
     *
     * @param input com.volcengine.model.vod.request.VodGetPlayInfoRequest
     * @return com.volcengine.model.vod.response.VodGetPlayInfoResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.model.vod.response.VodGetPlayInfoResponse getPlayInfo(com.volcengine.model.vod.request.VodGetPlayInfoRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.helper.Const.GetPlayInfo, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.model.vod.response.VodGetPlayInfoResponse.Builder responseBuilder = com.volcengine.model.vod.response.VodGetPlayInfoResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
	/**
     * uploadMediaByUrl.
     *
     * @param input com.volcengine.model.vod.request.VodUrlUploadRequest
     * @return com.volcengine.model.vod.response.VodUrlUploadResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.model.vod.response.VodUrlUploadResponse uploadMediaByUrl(com.volcengine.model.vod.request.VodUrlUploadRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.helper.Const.UploadMediaByUrl, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.model.vod.response.VodUrlUploadResponse.Builder responseBuilder = com.volcengine.model.vod.response.VodUrlUploadResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
	/**
     * queryUploadTaskInfo.
     *
     * @param input com.volcengine.model.vod.request.VodQueryUploadTaskInfoRequest
     * @return com.volcengine.model.vod.response.VodQueryUploadTaskInfoResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.model.vod.response.VodQueryUploadTaskInfoResponse queryUploadTaskInfo(com.volcengine.model.vod.request.VodQueryUploadTaskInfoRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.helper.Const.QueryUploadTaskInfo, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.model.vod.response.VodQueryUploadTaskInfoResponse.Builder responseBuilder = com.volcengine.model.vod.response.VodQueryUploadTaskInfoResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
	/**
     * applyUploadInfo.
     *
     * @param input com.volcengine.model.vod.request.VodApplyUploadInfoRequest
     * @return com.volcengine.model.vod.response.VodApplyUploadInfoResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.model.vod.response.VodApplyUploadInfoResponse applyUploadInfo(com.volcengine.model.vod.request.VodApplyUploadInfoRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.helper.Const.ApplyUploadInfo, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.model.vod.response.VodApplyUploadInfoResponse.Builder responseBuilder = com.volcengine.model.vod.response.VodApplyUploadInfoResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
	/**
     * commitUploadInfo.
     *
     * @param input com.volcengine.model.vod.request.VodCommitUploadInfoRequest
     * @return com.volcengine.model.vod.response.VodCommitUploadInfoResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.model.vod.response.VodCommitUploadInfoResponse commitUploadInfo(com.volcengine.model.vod.request.VodCommitUploadInfoRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.helper.Const.CommitUploadInfo, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.model.vod.response.VodCommitUploadInfoResponse.Builder responseBuilder = com.volcengine.model.vod.response.VodCommitUploadInfoResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
	/**
     * updateMediaInfo.
     *
     * @param input com.volcengine.model.vod.request.VodUpdateMediaInfoRequest
     * @return com.volcengine.model.vod.response.VodUpdateMediaInfoResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.model.vod.response.VodUpdateMediaInfoResponse updateMediaInfo(com.volcengine.model.vod.request.VodUpdateMediaInfoRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.helper.Const.UpdateMediaInfo, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.model.vod.response.VodUpdateMediaInfoResponse.Builder responseBuilder = com.volcengine.model.vod.response.VodUpdateMediaInfoResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
	/**
     * updateMediaPublishStatus.
     *
     * @param input com.volcengine.model.vod.request.VodUpdateMediaPublishStatusRequest
     * @return com.volcengine.model.vod.response.VodUpdateMediaPublishStatusResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.model.vod.response.VodUpdateMediaPublishStatusResponse updateMediaPublishStatus(com.volcengine.model.vod.request.VodUpdateMediaPublishStatusRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.helper.Const.UpdateMediaPublishStatus, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.model.vod.response.VodUpdateMediaPublishStatusResponse.Builder responseBuilder = com.volcengine.model.vod.response.VodUpdateMediaPublishStatusResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
	/**
     * getMediaInfos.
     *
     * @param input com.volcengine.model.vod.request.VodGetMediaInfosRequest
     * @return com.volcengine.model.vod.response.VodGetMediaInfosResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.model.vod.response.VodGetMediaInfosResponse getMediaInfos(com.volcengine.model.vod.request.VodGetMediaInfosRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.helper.Const.GetMediaInfos, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.model.vod.response.VodGetMediaInfosResponse.Builder responseBuilder = com.volcengine.model.vod.response.VodGetMediaInfosResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
	/**
     * getRecommendedPoster.
     *
     * @param input com.volcengine.model.vod.request.VodGetRecommendedPosterRequest
     * @return com.volcengine.model.vod.response.VodGetRecommendedPosterResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.model.vod.response.VodGetRecommendedPosterResponse getRecommendedPoster(com.volcengine.model.vod.request.VodGetRecommendedPosterRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.helper.Const.GetRecommendedPoster, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.model.vod.response.VodGetRecommendedPosterResponse.Builder responseBuilder = com.volcengine.model.vod.response.VodGetRecommendedPosterResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
	/**
     * deleteMedia.
     *
     * @param input com.volcengine.model.vod.request.VodDeleteMediaRequest
     * @return com.volcengine.model.vod.response.VodDeleteMediaResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.model.vod.response.VodDeleteMediaResponse deleteMedia(com.volcengine.model.vod.request.VodDeleteMediaRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.helper.Const.DeleteMedia, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.model.vod.response.VodDeleteMediaResponse.Builder responseBuilder = com.volcengine.model.vod.response.VodDeleteMediaResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
	/**
     * deleteTranscodes.
     *
     * @param input com.volcengine.model.vod.request.VodDeleteTranscodesRequest
     * @return com.volcengine.model.vod.response.VodDeleteTranscodesResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.model.vod.response.VodDeleteTranscodesResponse deleteTranscodes(com.volcengine.model.vod.request.VodDeleteTranscodesRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.helper.Const.DeleteTranscodes, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.model.vod.response.VodDeleteTranscodesResponse.Builder responseBuilder = com.volcengine.model.vod.response.VodDeleteTranscodesResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
	/**
     * getMediaList.
     *
     * @param input com.volcengine.model.vod.request.VodGetMediaListRequest
     * @return com.volcengine.model.vod.response.VodGetMediaListResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.model.vod.response.VodGetMediaListResponse getMediaList(com.volcengine.model.vod.request.VodGetMediaListRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.helper.Const.GetMediaList, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.model.vod.response.VodGetMediaListResponse.Builder responseBuilder = com.volcengine.model.vod.response.VodGetMediaListResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
	/**
     * getSubtitleInfoList.
     *
     * @param input com.volcengine.model.vod.request.VodGetSubtitleInfoListRequest
     * @return com.volcengine.model.vod.response.VodGetSubtitleInfoListResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.model.vod.response.VodGetSubtitleInfoListResponse getSubtitleInfoList(com.volcengine.model.vod.request.VodGetSubtitleInfoListRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.helper.Const.GetSubtitleInfoList, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.model.vod.response.VodGetSubtitleInfoListResponse.Builder responseBuilder = com.volcengine.model.vod.response.VodGetSubtitleInfoListResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
	/**
     * updateSubtitleStatus.
     *
     * @param input com.volcengine.model.vod.request.VodUpdateSubtitleStatusRequest
     * @return com.volcengine.model.vod.response.VodUpdateSubtitleStatusResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.model.vod.response.VodUpdateSubtitleStatusResponse updateSubtitleStatus(com.volcengine.model.vod.request.VodUpdateSubtitleStatusRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.helper.Const.UpdateSubtitleStatus, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.model.vod.response.VodUpdateSubtitleStatusResponse.Builder responseBuilder = com.volcengine.model.vod.response.VodUpdateSubtitleStatusResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
	/**
     * updateSubtitleInfo.
     *
     * @param input com.volcengine.model.vod.request.VodUpdateSubtitleInfoRequest
     * @return com.volcengine.model.vod.response.VodUpdateSubtitleInfoResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.model.vod.response.VodUpdateSubtitleInfoResponse updateSubtitleInfo(com.volcengine.model.vod.request.VodUpdateSubtitleInfoRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.helper.Const.UpdateSubtitleInfo, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.model.vod.response.VodUpdateSubtitleInfoResponse.Builder responseBuilder = com.volcengine.model.vod.response.VodUpdateSubtitleInfoResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
	/**
     * StartWorkflow.
     *
     * @param input com.volcengine.model.vod.request.VodStartWorkflowRequest
     * @return com.volcengine.model.vod.response.VodStartWorkflowResponse
     * @throws Exception the exception
     */
	@Override
	public com.volcengine.model.vod.response.VodStartWorkflowResponse StartWorkflow(com.volcengine.model.vod.request.VodStartWorkflowRequest input) throws Exception {
		com.volcengine.model.response.RawResponse response = query(com.volcengine.helper.Const.StartWorkflow, com.volcengine.helper.Utils.mapToPairList(com.volcengine.helper.Utils.protoBufferToMap(input, true)));
        if (response.getCode() != com.volcengine.error.SdkError.SUCCESS.getNumber()) {
            throw response.getException();
        }
        com.volcengine.model.vod.response.VodStartWorkflowResponse.Builder responseBuilder = com.volcengine.model.vod.response.VodStartWorkflowResponse.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(new InputStreamReader(new ByteArrayInputStream(response.getData())), responseBuilder);
        return responseBuilder.build();
	}
	
	
}  // end of service interface
