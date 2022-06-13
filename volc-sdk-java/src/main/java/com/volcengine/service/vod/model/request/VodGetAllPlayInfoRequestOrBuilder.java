// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodGetAllPlayInfoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodGetAllPlayInfoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 视频ID
   * </pre>
   *
   * <code>string Vids = 1;</code>
   * @return The vids.
   */
  java.lang.String getVids();
  /**
   * <pre>
   * 视频ID
   * </pre>
   *
   * <code>string Vids = 1;</code>
   * @return The bytes for vids.
   */
  com.google.protobuf.ByteString
      getVidsBytes();

  /**
   * <pre>
   *封装格式，支持 mp4、dash、hls、mp3、m4a、ogg。 多个 Format 组成的字符串，中间用","隔开。默认获取全部
   * </pre>
   *
   * <code>string Formats = 2;</code>
   * @return The formats.
   */
  java.lang.String getFormats();
  /**
   * <pre>
   *封装格式，支持 mp4、dash、hls、mp3、m4a、ogg。 多个 Format 组成的字符串，中间用","隔开。默认获取全部
   * </pre>
   *
   * <code>string Formats = 2;</code>
   * @return The bytes for formats.
   */
  com.google.protobuf.ByteString
      getFormatsBytes();

  /**
   * <pre>
   *编码格式，支持 mp3、aac、opus、H264、H265、H266 。 多个 Codec 组成的字符串，中间用","隔开。默认获取全部
   * </pre>
   *
   * <code>string Codecs = 3;</code>
   * @return The codecs.
   */
  java.lang.String getCodecs();
  /**
   * <pre>
   *编码格式，支持 mp3、aac、opus、H264、H265、H266 。 多个 Codec 组成的字符串，中间用","隔开。默认获取全部
   * </pre>
   *
   * <code>string Codecs = 3;</code>
   * @return The bytes for codecs.
   */
  com.google.protobuf.ByteString
      getCodecsBytes();

  /**
   * <pre>
   *视频流清晰度，默认返回全部，支持：240p，360p，480p，540p，720p，1080p。 多个 Codec 组成的字符串，中间用","隔开。默认获取全部
   * </pre>
   *
   * <code>string Definitions = 4;</code>
   * @return The definitions.
   */
  java.lang.String getDefinitions();
  /**
   * <pre>
   *视频流清晰度，默认返回全部，支持：240p，360p，480p，540p，720p，1080p。 多个 Codec 组成的字符串，中间用","隔开。默认获取全部
   * </pre>
   *
   * <code>string Definitions = 4;</code>
   * @return The bytes for definitions.
   */
  com.google.protobuf.ByteString
      getDefinitionsBytes();

  /**
   * <pre>
   *视频流清晰度，默认返回全部，支持："video": 加密视频流, "audio": 普通音频音频流。 多个 FileType 组成的字符串，中间用","隔开
   * </pre>
   *
   * <code>string FileTypes = 5;</code>
   * @return The fileTypes.
   */
  java.lang.String getFileTypes();
  /**
   * <pre>
   *视频流清晰度，默认返回全部，支持："video": 加密视频流, "audio": 普通音频音频流。 多个 FileType 组成的字符串，中间用","隔开
   * </pre>
   *
   * <code>string FileTypes = 5;</code>
   * @return The bytes for fileTypes.
   */
  com.google.protobuf.ByteString
      getFileTypesBytes();

  /**
   * <pre>
   * 水印贴片标签
   * </pre>
   *
   * <code>string LogoTypes = 6;</code>
   * @return The logoTypes.
   */
  java.lang.String getLogoTypes();
  /**
   * <pre>
   * 水印贴片标签
   * </pre>
   *
   * <code>string LogoTypes = 6;</code>
   * @return The bytes for logoTypes.
   */
  com.google.protobuf.ByteString
      getLogoTypesBytes();

  /**
   * <pre>
   * 是否加密, 支持: "encrypt" : 加密流, "normal" : 非加密流, 默认返回全部
   * </pre>
   *
   * <code>string NeedEncryptStream = 7;</code>
   * @return The needEncryptStream.
   */
  java.lang.String getNeedEncryptStream();
  /**
   * <pre>
   * 是否加密, 支持: "encrypt" : 加密流, "normal" : 非加密流, 默认返回全部
   * </pre>
   *
   * <code>string NeedEncryptStream = 7;</code>
   * @return The bytes for needEncryptStream.
   */
  com.google.protobuf.ByteString
      getNeedEncryptStreamBytes();

  /**
   * <pre>
   *返回https播放地址，默认否, 1-是；0-否
   * </pre>
   *
   * <code>string Ssl = 8;</code>
   * @return The ssl.
   */
  java.lang.String getSsl();
  /**
   * <pre>
   *返回https播放地址，默认否, 1-是；0-否
   * </pre>
   *
   * <code>string Ssl = 8;</code>
   * @return The bytes for ssl.
   */
  com.google.protobuf.ByteString
      getSslBytes();

  /**
   * <pre>
   * 是否需要雪碧图（缩略图），默认否，1-是；0-否
   * </pre>
   *
   * <code>string NeedThumbs = 9;</code>
   * @return The needThumbs.
   */
  java.lang.String getNeedThumbs();
  /**
   * <pre>
   * 是否需要雪碧图（缩略图），默认否，1-是；0-否
   * </pre>
   *
   * <code>string NeedThumbs = 9;</code>
   * @return The bytes for needThumbs.
   */
  com.google.protobuf.ByteString
      getNeedThumbsBytes();

  /**
   * <pre>
   * 是否需要蒙版弹幕，默认否，1-是；0-否
   * </pre>
   *
   * <code>string NeedBarrageMask = 10;</code>
   * @return The needBarrageMask.
   */
  java.lang.String getNeedBarrageMask();
  /**
   * <pre>
   * 是否需要蒙版弹幕，默认否，1-是；0-否
   * </pre>
   *
   * <code>string NeedBarrageMask = 10;</code>
   * @return The bytes for needBarrageMask.
   */
  com.google.protobuf.ByteString
      getNeedBarrageMaskBytes();

  /**
   * <pre>
   * 指定 CDN 类型, 支持 "1"-P2P；"2"-OwnVDP。 默认 normal
   * </pre>
   *
   * <code>string CdnType = 11;</code>
   * @return The cdnType.
   */
  java.lang.String getCdnType();
  /**
   * <pre>
   * 指定 CDN 类型, 支持 "1"-P2P；"2"-OwnVDP。 默认 normal
   * </pre>
   *
   * <code>string CdnType = 11;</code>
   * @return The bytes for cdnType.
   */
  com.google.protobuf.ByteString
      getCdnTypeBytes();

  /**
   * <pre>
   * 唯一性标识信息
   * </pre>
   *
   * <code>string UnionInfo = 12;</code>
   * @return The unionInfo.
   */
  java.lang.String getUnionInfo();
  /**
   * <pre>
   * 唯一性标识信息
   * </pre>
   *
   * <code>string UnionInfo = 12;</code>
   * @return The bytes for unionInfo.
   */
  com.google.protobuf.ByteString
      getUnionInfoBytes();

  /**
   * <pre>
   * 播放场景，指定获取对应场景的音视频流。当前支持：preview-试看
   * </pre>
   *
   * <code>string PlayScene = 13;</code>
   * @return The playScene.
   */
  java.lang.String getPlayScene();
  /**
   * <pre>
   * 播放场景，指定获取对应场景的音视频流。当前支持：preview-试看
   * </pre>
   *
   * <code>string PlayScene = 13;</code>
   * @return The bytes for playScene.
   */
  com.google.protobuf.ByteString
      getPlaySceneBytes();

  /**
   * <pre>
   * DRM过期时间戳
   * </pre>
   *
   * <code>string DrmExpireTimestamp = 14;</code>
   * @return The drmExpireTimestamp.
   */
  java.lang.String getDrmExpireTimestamp();
  /**
   * <pre>
   * DRM过期时间戳
   * </pre>
   *
   * <code>string DrmExpireTimestamp = 14;</code>
   * @return The bytes for drmExpireTimestamp.
   */
  com.google.protobuf.ByteString
      getDrmExpireTimestampBytes();

  /**
   * <pre>
   * 默认获取全部。支持: "SDR", "PQHDR", "SLGHDR", 默认返回全部
   * </pre>
   *
   * <code>string HDRType = 15;</code>
   * @return The hDRType.
   */
  java.lang.String getHDRType();
  /**
   * <pre>
   * 默认获取全部。支持: "SDR", "PQHDR", "SLGHDR", 默认返回全部
   * </pre>
   *
   * <code>string HDRType = 15;</code>
   * @return The bytes for hDRType.
   */
  com.google.protobuf.ByteString
      getHDRTypeBytes();

  /**
   * <pre>
   * 使用的帧对齐转码版本。支持: "1" - 返回版本一, 默认没指定版本，全部返回
   * </pre>
   *
   * <code>string KeyFrameAlignmentVersion = 16;</code>
   * @return The keyFrameAlignmentVersion.
   */
  java.lang.String getKeyFrameAlignmentVersion();
  /**
   * <pre>
   * 使用的帧对齐转码版本。支持: "1" - 返回版本一, 默认没指定版本，全部返回
   * </pre>
   *
   * <code>string KeyFrameAlignmentVersion = 16;</code>
   * @return The bytes for keyFrameAlignmentVersion.
   */
  com.google.protobuf.ByteString
      getKeyFrameAlignmentVersionBytes();

  /**
   * <pre>
   * 发布状态, 支持: "Available" : 发布, "NoAction" : 未发布, 默认返回全部
   * </pre>
   *
   * <code>string UserAction = 17;</code>
   * @return The userAction.
   */
  java.lang.String getUserAction();
  /**
   * <pre>
   * 发布状态, 支持: "Available" : 发布, "NoAction" : 未发布, 默认返回全部
   * </pre>
   *
   * <code>string UserAction = 17;</code>
   * @return The bytes for userAction.
   */
  com.google.protobuf.ByteString
      getUserActionBytes();

  /**
   * <pre>
   * 音频音质。当 FileType 为 audio 时起作用，表示音频音质参数。支持：medium、higher、highest. 默认返回所有音频流
   * </pre>
   *
   * <code>string Quality = 18;</code>
   * @return The quality.
   */
  java.lang.String getQuality();
  /**
   * <pre>
   * 音频音质。当 FileType 为 audio 时起作用，表示音频音质参数。支持：medium、higher、highest. 默认返回所有音频流
   * </pre>
   *
   * <code>string Quality = 18;</code>
   * @return The bytes for quality.
   */
  com.google.protobuf.ByteString
      getQualityBytes();
}
