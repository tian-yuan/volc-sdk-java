// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodListDomainRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodListDomainRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <pre>
   * 空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <pre>
   *域名类型
   *播放域名:play
   *封面域名:image
   * </pre>
   *
   * <code>string DomainType = 2;</code>
   * @return The domainType.
   */
  java.lang.String getDomainType();
  /**
   * <pre>
   *域名类型
   *播放域名:play
   *封面域名:image
   * </pre>
   *
   * <code>string DomainType = 2;</code>
   * @return The bytes for domainType.
   */
  com.google.protobuf.ByteString
      getDomainTypeBytes();

  /**
   * <pre>
   *源站类型
   *回点播源站:1
   *第三方源站:2
   * </pre>
   *
   * <code>int32 SourceStationType = 3;</code>
   * @return The sourceStationType.
   */
  int getSourceStationType();

  /**
   * <pre>
   *跨过多少条域名
   * </pre>
   *
   * <code>int64 Offset = 4;</code>
   * @return The offset.
   */
  long getOffset();
}
