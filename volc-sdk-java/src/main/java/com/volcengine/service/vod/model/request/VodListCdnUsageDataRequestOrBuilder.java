// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodListCdnUsageDataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodListCdnUsageDataRequest)
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
   * 聚合度 
   * </pre>
   *
   * <code>string Interval = 2;</code>
   * @return The interval.
   */
  java.lang.String getInterval();
  /**
   * <pre>
   * 聚合度 
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
   * 统计数据类别 
   * </pre>
   *
   * <code>string DataType = 5;</code>
   * @return The dataType.
   */
  java.lang.String getDataType();
  /**
   * <pre>
   * 统计数据类别 
   * </pre>
   *
   * <code>string DataType = 5;</code>
   * @return The bytes for dataType.
   */
  com.google.protobuf.ByteString
      getDataTypeBytes();

  /**
   * <pre>
   * 指标类别 
   * </pre>
   *
   * <code>string Metric = 6;</code>
   * @return The metric.
   */
  java.lang.String getMetric();
  /**
   * <pre>
   * 指标类别 
   * </pre>
   *
   * <code>string Metric = 6;</code>
   * @return The bytes for metric.
   */
  com.google.protobuf.ByteString
      getMetricBytes();

  /**
   * <code>bool NeedDetail = 7;</code>
   * @return The needDetail.
   */
  boolean getNeedDetail();
}
