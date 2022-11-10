// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/request/request_live.proto

package com.volcengine.service.live.model.request;

public interface ListPullToPushTaskRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Live.Models.Request.ListPullToPushTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *页码，不填默认1
   * </pre>
   *
   * <code>int32 Page = 1;</code>
   * @return The page.
   */
  int getPage();

  /**
   * <pre>
   *每页数量，不填默认20
   * </pre>
   *
   * <code>int32 Size = 2;</code>
   * @return The size.
   */
  int getSize();

  /**
   * <pre>
   *任务标题
   * </pre>
   *
   * <code>string Title = 3;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   *任务标题
   * </pre>
   *
   * <code>string Title = 3;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();
}