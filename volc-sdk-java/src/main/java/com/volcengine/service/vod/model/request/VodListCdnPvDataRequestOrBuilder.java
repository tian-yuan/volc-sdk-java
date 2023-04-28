// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodListCdnPvDataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodListCdnPvDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 域名，多个用逗号隔开 
   * </pre>
   *
   * <code>string Domains = 1;</code>
   * @return The domains.
   */
  java.lang.String getDomains();
  /**
   * <pre>
   * 域名，多个用逗号隔开 
   * </pre>
   *
   * <code>string Domains = 1;</code>
   * @return The bytes for domains.
   */
  com.google.protobuf.ByteString
      getDomainsBytes();

  /**
   * <pre>
   * 聚合度,可选：auto,5min,hour,day 
   * </pre>
   *
   * <code>string Interval = 2;</code>
   * @return The interval.
   */
  java.lang.String getInterval();
  /**
   * <pre>
   * 聚合度,可选：auto,5min,hour,day 
   * </pre>
   *
   * <code>string Interval = 2;</code>
   * @return The bytes for interval.
   */
  com.google.protobuf.ByteString
      getIntervalBytes();

  /**
   * <pre>
   * 查询范围起始时间 
   * </pre>
   *
   * <code>int64 StartTimestamp = 3;</code>
   * @return The startTimestamp.
   */
  long getStartTimestamp();

  /**
   * <pre>
   * 查询范围截止时间 
   * </pre>
   *
   * <code>int64 EndTimestamp = 4;</code>
   * @return The endTimestamp.
   */
  long getEndTimestamp();

  /**
   * <pre>
   * 统计数据类别, 可选edge-边缘数据,origin-回源数据 
   * </pre>
   *
   * <code>string DataType = 5;</code>
   * @return The dataType.
   */
  java.lang.String getDataType();
  /**
   * <pre>
   * 统计数据类别, 可选edge-边缘数据,origin-回源数据 
   * </pre>
   *
   * <code>string DataType = 5;</code>
   * @return The bytes for dataType.
   */
  com.google.protobuf.ByteString
      getDataTypeBytes();

  /**
   * <code>bool NeedDetail = 6;</code>
   * @return The needDetail.
   */
  boolean getNeedDetail();
}
