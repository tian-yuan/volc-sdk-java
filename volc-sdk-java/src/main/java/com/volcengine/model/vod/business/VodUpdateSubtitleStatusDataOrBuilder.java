// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_media.proto

package com.volcengine.model.vod.business;

public interface VodUpdateSubtitleStatusDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Models.Vod.Business.VodUpdateSubtitleStatusData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *不存在的转码FileID列表
   * </pre>
   *
   * <code>repeated string NotExistFileIds = 1;</code>
   * @return A list containing the notExistFileIds.
   */
  java.util.List<java.lang.String>
      getNotExistFileIdsList();
  /**
   * <pre>
   *不存在的转码FileID列表
   * </pre>
   *
   * <code>repeated string NotExistFileIds = 1;</code>
   * @return The count of notExistFileIds.
   */
  int getNotExistFileIdsCount();
  /**
   * <pre>
   *不存在的转码FileID列表
   * </pre>
   *
   * <code>repeated string NotExistFileIds = 1;</code>
   * @param index The index of the element to return.
   * @return The notExistFileIds at the given index.
   */
  java.lang.String getNotExistFileIds(int index);
  /**
   * <pre>
   *不存在的转码FileID列表
   * </pre>
   *
   * <code>repeated string NotExistFileIds = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the notExistFileIds at the given index.
   */
  com.google.protobuf.ByteString
      getNotExistFileIdsBytes(int index);
}
