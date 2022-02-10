package com.volcengine.model.stream;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.HashMap;
import java.util.List;

@Data
public class GetArticleResponse {
    @JSONField(name = "ResponseMetadata")
    CommonPo.ResponseMetadata responseMetadata;
    @JSONField(name = "Result")
    Result result;

    @Data
    public static class Result {
        @JSONField(name = "GroupId")
        String groupId;
        @JSONField(name = "VideoId")
        String videoId;
        @JSONField(name = "Tag")
        String tag;
        @JSONField(name = "Title")
        String title;
        @JSONField(name = "ArticleUrl")
        String articleUrl;
        @JSONField(name = "ArticleClass")
        String articleClass;
        @JSONField(name = "PublishTime")
        long publishTime;
        @JSONField(name = "Abstract")
        String abstracts;
        @JSONField(name = "ShareUrl")
        String shareUrl;
        @JSONField(name = "ShareCount")
        long shareCount;
        @JSONField(name = "UserInfo")
        CommonPo.UserInfo userInfo;
        @JSONField(name = "HasVideo")
        boolean hasVideo;
        @JSONField(name = "WatchCount")
        long watchCount;
        @JSONField(name = "Duration")
        long duration;
        @JSONField(name = "Label")
        String label;
        @JSONField(name = "BuryCount")
        long buryCount;
        @JSONField(name = "CommentCount")
        long commentCount;
        @JSONField(name = "CommentUrl")
        String commentUrl;
        @JSONField(name = "CoverMode")
        long coverMode;
        @JSONField(name = "CoverImageList")
        List<CommonPo.Image> coverImageList;
        @JSONField(name = "BanComment")
        long banComment;
        @JSONField(name = "DetailSource")
        String detailSource;
        @JSONField(name = "DiggCount")
        long diggCount;
        @JSONField(name = "DiggStatus")
        boolean diggStatus;
        @JSONField(name = "ImageList")
        List<CommonPo.Image> imageList;
        @JSONField(name = "ItemIdStr")
        String itemIdStr;
        @JSONField(name = "MiddleImage")
        List<CommonPo.Image> middleImage;
        @JSONField(name = "NewVersionVideoPage")
        boolean newVersionVideoPage;
        @JSONField(name = "Author")
        String author;
        @JSONField(name = "HomePage")
        String homePage;
        @JSONField(name = "ArticleReadCount")
        String articleReadCount;
        @JSONField(name = "VideoDetail")
        VideoDetail videoDetail;
    }

    @Data
    public static class VideoDetail {
        @JSONField(name = "Status")
        int status;
        @JSONField(name = "VideoDuration")
        int videoDuration;
        @JSONField(name = "PosterUrl")
        String posterUrl;
        @JSONField(name = "VideoId")
        String videoId;
        @JSONField(name = "VideoList")
        List<GetVideoUrlResponse.VideoList> videoList;
        @JSONField(name = "ArticleClass")
        String articleClass;
    }
}
