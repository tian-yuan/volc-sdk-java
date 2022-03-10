// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

public interface VodVideoDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodVideoDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <code>string Vid = 2;</code>
   * @return The vid.
   */
  java.lang.String getVid();
  /**
   * <code>string Vid = 2;</code>
   * @return The bytes for vid.
   */
  com.google.protobuf.ByteString
      getVidBytes();

  /**
   * <code>.Volcengine.Vod.Models.Business.VodVideoDetailInfo VideoDetailInfo = 3;</code>
   * @return Whether the videoDetailInfo field is set.
   */
  boolean hasVideoDetailInfo();
  /**
   * <code>.Volcengine.Vod.Models.Business.VodVideoDetailInfo VideoDetailInfo = 3;</code>
   * @return The videoDetailInfo.
   */
  com.volcengine.service.vod.model.business.VodVideoDetailInfo getVideoDetailInfo();
  /**
   * <code>.Volcengine.Vod.Models.Business.VodVideoDetailInfo VideoDetailInfo = 3;</code>
   */
  com.volcengine.service.vod.model.business.VodVideoDetailInfoOrBuilder getVideoDetailInfoOrBuilder();

  /**
   * <code>.Volcengine.Vod.Models.Business.VodEncodedVideoInfo OriginalVideoInfo = 4;</code>
   * @return Whether the originalVideoInfo field is set.
   */
  boolean hasOriginalVideoInfo();
  /**
   * <code>.Volcengine.Vod.Models.Business.VodEncodedVideoInfo OriginalVideoInfo = 4;</code>
   * @return The originalVideoInfo.
   */
  com.volcengine.service.vod.model.business.VodEncodedVideoInfo getOriginalVideoInfo();
  /**
   * <code>.Volcengine.Vod.Models.Business.VodEncodedVideoInfo OriginalVideoInfo = 4;</code>
   */
  com.volcengine.service.vod.model.business.VodEncodedVideoInfoOrBuilder getOriginalVideoInfoOrBuilder();

  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodEncodedVideoInfo EncodedVideoInfos = 5;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodEncodedVideoInfo> 
      getEncodedVideoInfosList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodEncodedVideoInfo EncodedVideoInfos = 5;</code>
   */
  com.volcengine.service.vod.model.business.VodEncodedVideoInfo getEncodedVideoInfos(int index);
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodEncodedVideoInfo EncodedVideoInfos = 5;</code>
   */
  int getEncodedVideoInfosCount();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodEncodedVideoInfo EncodedVideoInfos = 5;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodEncodedVideoInfoOrBuilder> 
      getEncodedVideoInfosOrBuilderList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodEncodedVideoInfo EncodedVideoInfos = 5;</code>
   */
  com.volcengine.service.vod.model.business.VodEncodedVideoInfoOrBuilder getEncodedVideoInfosOrBuilder(
      int index);

  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodEncodedVideoInfo LogoEncodedVideoInfos = 6;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodEncodedVideoInfo> 
      getLogoEncodedVideoInfosList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodEncodedVideoInfo LogoEncodedVideoInfos = 6;</code>
   */
  com.volcengine.service.vod.model.business.VodEncodedVideoInfo getLogoEncodedVideoInfos(int index);
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodEncodedVideoInfo LogoEncodedVideoInfos = 6;</code>
   */
  int getLogoEncodedVideoInfosCount();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodEncodedVideoInfo LogoEncodedVideoInfos = 6;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodEncodedVideoInfoOrBuilder> 
      getLogoEncodedVideoInfosOrBuilderList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodEncodedVideoInfo LogoEncodedVideoInfos = 6;</code>
   */
  com.volcengine.service.vod.model.business.VodEncodedVideoInfoOrBuilder getLogoEncodedVideoInfosOrBuilder(
      int index);
}
