// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_common.proto

package com.volcengine.model.vod.business;

public interface VodPlayInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Models.Vod.Business.VodPlayInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *文件ID
   * </pre>
   *
   * <code>string FileId = 1;</code>
   * @return The fileId.
   */
  java.lang.String getFileId();
  /**
   * <pre>
   *文件ID
   * </pre>
   *
   * <code>string FileId = 1;</code>
   * @return The bytes for fileId.
   */
  com.google.protobuf.ByteString
      getFileIdBytes();

  /**
   * <pre>
   * hash值
   * </pre>
   *
   * <code>string Md5 = 2;</code>
   * @return The md5.
   */
  java.lang.String getMd5();
  /**
   * <pre>
   * hash值
   * </pre>
   *
   * <code>string Md5 = 2;</code>
   * @return The bytes for md5.
   */
  com.google.protobuf.ByteString
      getMd5Bytes();

  /**
   * <pre>
   * 文件类型 video/audio
   * </pre>
   *
   * <code>string FileType = 3;</code>
   * @return The fileType.
   */
  java.lang.String getFileType();
  /**
   * <pre>
   * 文件类型 video/audio
   * </pre>
   *
   * <code>string FileType = 3;</code>
   * @return The bytes for fileType.
   */
  com.google.protobuf.ByteString
      getFileTypeBytes();

  /**
   * <pre>
   *视频格式
   * </pre>
   *
   * <code>string Format = 4;</code>
   * @return The format.
   */
  java.lang.String getFormat();
  /**
   * <pre>
   *视频格式
   * </pre>
   *
   * <code>string Format = 4;</code>
   * @return The bytes for format.
   */
  com.google.protobuf.ByteString
      getFormatBytes();

  /**
   * <pre>
   *编码类型
   * </pre>
   *
   * <code>string Codec = 5;</code>
   * @return The codec.
   */
  java.lang.String getCodec();
  /**
   * <pre>
   *编码类型
   * </pre>
   *
   * <code>string Codec = 5;</code>
   * @return The bytes for codec.
   */
  com.google.protobuf.ByteString
      getCodecBytes();

  /**
   * <pre>
   *视频分辨率
   * </pre>
   *
   * <code>string Definition = 6;</code>
   * @return The definition.
   */
  java.lang.String getDefinition();
  /**
   * <pre>
   *视频分辨率
   * </pre>
   *
   * <code>string Definition = 6;</code>
   * @return The bytes for definition.
   */
  com.google.protobuf.ByteString
      getDefinitionBytes();

  /**
   * <pre>
   *主播放地址
   * </pre>
   *
   * <code>string MainPlayUrl = 7;</code>
   * @return The mainPlayUrl.
   */
  java.lang.String getMainPlayUrl();
  /**
   * <pre>
   *主播放地址
   * </pre>
   *
   * <code>string MainPlayUrl = 7;</code>
   * @return The bytes for mainPlayUrl.
   */
  com.google.protobuf.ByteString
      getMainPlayUrlBytes();

  /**
   * <pre>
   *备用播放地址
   * </pre>
   *
   * <code>string BackupPlayUrl = 8;</code>
   * @return The backupPlayUrl.
   */
  java.lang.String getBackupPlayUrl();
  /**
   * <pre>
   *备用播放地址
   * </pre>
   *
   * <code>string BackupPlayUrl = 8;</code>
   * @return The bytes for backupPlayUrl.
   */
  com.google.protobuf.ByteString
      getBackupPlayUrlBytes();

  /**
   * <pre>
   *码率(Kbps)
   * </pre>
   *
   * <code>int32 Bitrate = 9;</code>
   * @return The bitrate.
   */
  int getBitrate();

  /**
   * <pre>
   *视频高度
   * </pre>
   *
   * <code>int32 Width = 10;</code>
   * @return The width.
   */
  int getWidth();

  /**
   * <pre>
   *视频宽度
   * </pre>
   *
   * <code>int32 Height = 11;</code>
   * @return The height.
   */
  int getHeight();

  /**
   * <pre>
   *文件大小
   * </pre>
   *
   * <code>double Size = 12;</code>
   * @return The size.
   */
  double getSize();

  /**
   * <pre>
   *劫持校验信息
   * </pre>
   *
   * <code>string CheckInfo = 13;</code>
   * @return The checkInfo.
   */
  java.lang.String getCheckInfo();
  /**
   * <pre>
   *劫持校验信息
   * </pre>
   *
   * <code>string CheckInfo = 13;</code>
   * @return The bytes for checkInfo.
   */
  com.google.protobuf.ByteString
      getCheckInfoBytes();

  /**
   * <pre>
   * dash segment_base 分片信息
   * </pre>
   *
   * <code>string IndexRange = 14;</code>
   * @return The indexRange.
   */
  java.lang.String getIndexRange();
  /**
   * <pre>
   * dash segment_base 分片信息
   * </pre>
   *
   * <code>string IndexRange = 14;</code>
   * @return The bytes for indexRange.
   */
  com.google.protobuf.ByteString
      getIndexRangeBytes();

  /**
   * <pre>
   * dash segment_base 分片信息
   * </pre>
   *
   * <code>string InitRange = 15;</code>
   * @return The initRange.
   */
  java.lang.String getInitRange();
  /**
   * <pre>
   * dash segment_base 分片信息
   * </pre>
   *
   * <code>string InitRange = 15;</code>
   * @return The bytes for initRange.
   */
  com.google.protobuf.ByteString
      getInitRangeBytes();

  /**
   * <pre>
   *加密过的秘钥
   * </pre>
   *
   * <code>string PlayAuth = 16;</code>
   * @return The playAuth.
   */
  java.lang.String getPlayAuth();
  /**
   * <pre>
   *加密过的秘钥
   * </pre>
   *
   * <code>string PlayAuth = 16;</code>
   * @return The bytes for playAuth.
   */
  com.google.protobuf.ByteString
      getPlayAuthBytes();

  /**
   * <pre>
   *密钥keyID
   * </pre>
   *
   * <code>string PlayAuthId = 17;</code>
   * @return The playAuthId.
   */
  java.lang.String getPlayAuthId();
  /**
   * <pre>
   *密钥keyID
   * </pre>
   *
   * <code>string PlayAuthId = 17;</code>
   * @return The bytes for playAuthId.
   */
  com.google.protobuf.ByteString
      getPlayAuthIdBytes();

  /**
   * <pre>
   *水印类型
   * </pre>
   *
   * <code>string LogoType = 18;</code>
   * @return The logoType.
   */
  java.lang.String getLogoType();
  /**
   * <pre>
   *水印类型
   * </pre>
   *
   * <code>string LogoType = 18;</code>
   * @return The bytes for logoType.
   */
  com.google.protobuf.ByteString
      getLogoTypeBytes();

  /**
   * <pre>
   *音频质量
   * </pre>
   *
   * <code>string Quality = 19;</code>
   * @return The quality.
   */
  java.lang.String getQuality();
  /**
   * <pre>
   *音频质量
   * </pre>
   *
   * <code>string Quality = 19;</code>
   * @return The bytes for quality.
   */
  com.google.protobuf.ByteString
      getQualityBytes();

  /**
   * <pre>
   * 弹幕蒙版偏移量
   * </pre>
   *
   * <code>string BarrageMaskOffset = 20;</code>
   * @return The barrageMaskOffset.
   */
  java.lang.String getBarrageMaskOffset();
  /**
   * <pre>
   * 弹幕蒙版偏移量
   * </pre>
   *
   * <code>string BarrageMaskOffset = 20;</code>
   * @return The bytes for barrageMaskOffset.
   */
  com.google.protobuf.ByteString
      getBarrageMaskOffsetBytes();
}
