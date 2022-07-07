// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Request.VodDescribeVodDomainBandwidthDataRequest}
 */
public final class VodDescribeVodDomainBandwidthDataRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Request.VodDescribeVodDomainBandwidthDataRequest)
    VodDescribeVodDomainBandwidthDataRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodDescribeVodDomainBandwidthDataRequest.newBuilder() to construct.
  private VodDescribeVodDomainBandwidthDataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodDescribeVodDomainBandwidthDataRequest() {
    domainList_ = "";
    startTime_ = "";
    endTime_ = "";
    bandwidthType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodDescribeVodDomainBandwidthDataRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodDescribeVodDomainBandwidthDataRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            domainList_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            startTime_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            endTime_ = s;
            break;
          }
          case 32: {

            aggregation_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            bandwidthType_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeVodDomainBandwidthDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeVodDomainBandwidthDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest.class, com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest.Builder.class);
  }

  public static final int DOMAINLIST_FIELD_NUMBER = 1;
  private volatile java.lang.Object domainList_;
  /**
   * <pre>
   * 域名列表,多个域名用逗号分割 
   * </pre>
   *
   * <code>string DomainList = 1;</code>
   * @return The domainList.
   */
  @java.lang.Override
  public java.lang.String getDomainList() {
    java.lang.Object ref = domainList_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      domainList_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 域名列表,多个域名用逗号分割 
   * </pre>
   *
   * <code>string DomainList = 1;</code>
   * @return The bytes for domainList.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDomainListBytes() {
    java.lang.Object ref = domainList_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      domainList_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STARTTIME_FIELD_NUMBER = 2;
  private volatile java.lang.Object startTime_;
  /**
   * <pre>
   * 查询的起始时间, rfc3339 
   * </pre>
   *
   * <code>string StartTime = 2;</code>
   * @return The startTime.
   */
  @java.lang.Override
  public java.lang.String getStartTime() {
    java.lang.Object ref = startTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startTime_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 查询的起始时间, rfc3339 
   * </pre>
   *
   * <code>string StartTime = 2;</code>
   * @return The bytes for startTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStartTimeBytes() {
    java.lang.Object ref = startTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENDTIME_FIELD_NUMBER = 3;
  private volatile java.lang.Object endTime_;
  /**
   * <pre>
   * 查询的结束时间, rfc3339；查询时间跨度不超过93天 
   * </pre>
   *
   * <code>string EndTime = 3;</code>
   * @return The endTime.
   */
  @java.lang.Override
  public java.lang.String getEndTime() {
    java.lang.Object ref = endTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      endTime_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 查询的结束时间, rfc3339；查询时间跨度不超过93天 
   * </pre>
   *
   * <code>string EndTime = 3;</code>
   * @return The bytes for endTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEndTimeBytes() {
    java.lang.Object ref = endTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      endTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AGGREGATION_FIELD_NUMBER = 4;
  private int aggregation_;
  /**
   * <pre>
   * 聚合的时间粒度，单位秒，默认300，支持300，1800，3600和86400 
   * </pre>
   *
   * <code>int32 Aggregation = 4;</code>
   * @return The aggregation.
   */
  @java.lang.Override
  public int getAggregation() {
    return aggregation_;
  }

  public static final int BANDWIDTHTYPE_FIELD_NUMBER = 5;
  private volatile java.lang.Object bandwidthType_;
  /**
   * <pre>
   * 默认是CDN，支持CDN、PCDN、ALL 
   * </pre>
   *
   * <code>string BandwidthType = 5;</code>
   * @return The bandwidthType.
   */
  @java.lang.Override
  public java.lang.String getBandwidthType() {
    java.lang.Object ref = bandwidthType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bandwidthType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 默认是CDN，支持CDN、PCDN、ALL 
   * </pre>
   *
   * <code>string BandwidthType = 5;</code>
   * @return The bytes for bandwidthType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBandwidthTypeBytes() {
    java.lang.Object ref = bandwidthType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      bandwidthType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domainList_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, domainList_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startTime_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, startTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endTime_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, endTime_);
    }
    if (aggregation_ != 0) {
      output.writeInt32(4, aggregation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bandwidthType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, bandwidthType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(domainList_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, domainList_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startTime_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, startTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(endTime_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, endTime_);
    }
    if (aggregation_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, aggregation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bandwidthType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, bandwidthType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest other = (com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest) obj;

    if (!getDomainList()
        .equals(other.getDomainList())) return false;
    if (!getStartTime()
        .equals(other.getStartTime())) return false;
    if (!getEndTime()
        .equals(other.getEndTime())) return false;
    if (getAggregation()
        != other.getAggregation()) return false;
    if (!getBandwidthType()
        .equals(other.getBandwidthType())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DOMAINLIST_FIELD_NUMBER;
    hash = (53 * hash) + getDomainList().hashCode();
    hash = (37 * hash) + STARTTIME_FIELD_NUMBER;
    hash = (53 * hash) + getStartTime().hashCode();
    hash = (37 * hash) + ENDTIME_FIELD_NUMBER;
    hash = (53 * hash) + getEndTime().hashCode();
    hash = (37 * hash) + AGGREGATION_FIELD_NUMBER;
    hash = (53 * hash) + getAggregation();
    hash = (37 * hash) + BANDWIDTHTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getBandwidthType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Volcengine.Vod.Models.Request.VodDescribeVodDomainBandwidthDataRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Request.VodDescribeVodDomainBandwidthDataRequest)
      com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeVodDomainBandwidthDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeVodDomainBandwidthDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest.class, com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      domainList_ = "";

      startTime_ = "";

      endTime_ = "";

      aggregation_ = 0;

      bandwidthType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodDescribeVodDomainBandwidthDataRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest build() {
      com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest buildPartial() {
      com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest result = new com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest(this);
      result.domainList_ = domainList_;
      result.startTime_ = startTime_;
      result.endTime_ = endTime_;
      result.aggregation_ = aggregation_;
      result.bandwidthType_ = bandwidthType_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest) {
        return mergeFrom((com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest other) {
      if (other == com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest.getDefaultInstance()) return this;
      if (!other.getDomainList().isEmpty()) {
        domainList_ = other.domainList_;
        onChanged();
      }
      if (!other.getStartTime().isEmpty()) {
        startTime_ = other.startTime_;
        onChanged();
      }
      if (!other.getEndTime().isEmpty()) {
        endTime_ = other.endTime_;
        onChanged();
      }
      if (other.getAggregation() != 0) {
        setAggregation(other.getAggregation());
      }
      if (!other.getBandwidthType().isEmpty()) {
        bandwidthType_ = other.bandwidthType_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object domainList_ = "";
    /**
     * <pre>
     * 域名列表,多个域名用逗号分割 
     * </pre>
     *
     * <code>string DomainList = 1;</code>
     * @return The domainList.
     */
    public java.lang.String getDomainList() {
      java.lang.Object ref = domainList_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        domainList_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 域名列表,多个域名用逗号分割 
     * </pre>
     *
     * <code>string DomainList = 1;</code>
     * @return The bytes for domainList.
     */
    public com.google.protobuf.ByteString
        getDomainListBytes() {
      java.lang.Object ref = domainList_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        domainList_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 域名列表,多个域名用逗号分割 
     * </pre>
     *
     * <code>string DomainList = 1;</code>
     * @param value The domainList to set.
     * @return This builder for chaining.
     */
    public Builder setDomainList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      domainList_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 域名列表,多个域名用逗号分割 
     * </pre>
     *
     * <code>string DomainList = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDomainList() {
      
      domainList_ = getDefaultInstance().getDomainList();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 域名列表,多个域名用逗号分割 
     * </pre>
     *
     * <code>string DomainList = 1;</code>
     * @param value The bytes for domainList to set.
     * @return This builder for chaining.
     */
    public Builder setDomainListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      domainList_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object startTime_ = "";
    /**
     * <pre>
     * 查询的起始时间, rfc3339 
     * </pre>
     *
     * <code>string StartTime = 2;</code>
     * @return The startTime.
     */
    public java.lang.String getStartTime() {
      java.lang.Object ref = startTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 查询的起始时间, rfc3339 
     * </pre>
     *
     * <code>string StartTime = 2;</code>
     * @return The bytes for startTime.
     */
    public com.google.protobuf.ByteString
        getStartTimeBytes() {
      java.lang.Object ref = startTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 查询的起始时间, rfc3339 
     * </pre>
     *
     * <code>string StartTime = 2;</code>
     * @param value The startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      startTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 查询的起始时间, rfc3339 
     * </pre>
     *
     * <code>string StartTime = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTime() {
      
      startTime_ = getDefaultInstance().getStartTime();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 查询的起始时间, rfc3339 
     * </pre>
     *
     * <code>string StartTime = 2;</code>
     * @param value The bytes for startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      startTime_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object endTime_ = "";
    /**
     * <pre>
     * 查询的结束时间, rfc3339；查询时间跨度不超过93天 
     * </pre>
     *
     * <code>string EndTime = 3;</code>
     * @return The endTime.
     */
    public java.lang.String getEndTime() {
      java.lang.Object ref = endTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        endTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 查询的结束时间, rfc3339；查询时间跨度不超过93天 
     * </pre>
     *
     * <code>string EndTime = 3;</code>
     * @return The bytes for endTime.
     */
    public com.google.protobuf.ByteString
        getEndTimeBytes() {
      java.lang.Object ref = endTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        endTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 查询的结束时间, rfc3339；查询时间跨度不超过93天 
     * </pre>
     *
     * <code>string EndTime = 3;</code>
     * @param value The endTime to set.
     * @return This builder for chaining.
     */
    public Builder setEndTime(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      endTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 查询的结束时间, rfc3339；查询时间跨度不超过93天 
     * </pre>
     *
     * <code>string EndTime = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndTime() {
      
      endTime_ = getDefaultInstance().getEndTime();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 查询的结束时间, rfc3339；查询时间跨度不超过93天 
     * </pre>
     *
     * <code>string EndTime = 3;</code>
     * @param value The bytes for endTime to set.
     * @return This builder for chaining.
     */
    public Builder setEndTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      endTime_ = value;
      onChanged();
      return this;
    }

    private int aggregation_ ;
    /**
     * <pre>
     * 聚合的时间粒度，单位秒，默认300，支持300，1800，3600和86400 
     * </pre>
     *
     * <code>int32 Aggregation = 4;</code>
     * @return The aggregation.
     */
    @java.lang.Override
    public int getAggregation() {
      return aggregation_;
    }
    /**
     * <pre>
     * 聚合的时间粒度，单位秒，默认300，支持300，1800，3600和86400 
     * </pre>
     *
     * <code>int32 Aggregation = 4;</code>
     * @param value The aggregation to set.
     * @return This builder for chaining.
     */
    public Builder setAggregation(int value) {
      
      aggregation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 聚合的时间粒度，单位秒，默认300，支持300，1800，3600和86400 
     * </pre>
     *
     * <code>int32 Aggregation = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAggregation() {
      
      aggregation_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object bandwidthType_ = "";
    /**
     * <pre>
     * 默认是CDN，支持CDN、PCDN、ALL 
     * </pre>
     *
     * <code>string BandwidthType = 5;</code>
     * @return The bandwidthType.
     */
    public java.lang.String getBandwidthType() {
      java.lang.Object ref = bandwidthType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bandwidthType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 默认是CDN，支持CDN、PCDN、ALL 
     * </pre>
     *
     * <code>string BandwidthType = 5;</code>
     * @return The bytes for bandwidthType.
     */
    public com.google.protobuf.ByteString
        getBandwidthTypeBytes() {
      java.lang.Object ref = bandwidthType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        bandwidthType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 默认是CDN，支持CDN、PCDN、ALL 
     * </pre>
     *
     * <code>string BandwidthType = 5;</code>
     * @param value The bandwidthType to set.
     * @return This builder for chaining.
     */
    public Builder setBandwidthType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bandwidthType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 默认是CDN，支持CDN、PCDN、ALL 
     * </pre>
     *
     * <code>string BandwidthType = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBandwidthType() {
      
      bandwidthType_ = getDefaultInstance().getBandwidthType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 默认是CDN，支持CDN、PCDN、ALL 
     * </pre>
     *
     * <code>string BandwidthType = 5;</code>
     * @param value The bytes for bandwidthType to set.
     * @return This builder for chaining.
     */
    public Builder setBandwidthTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      bandwidthType_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Request.VodDescribeVodDomainBandwidthDataRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Request.VodDescribeVodDomainBandwidthDataRequest)
  private static final com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest();
  }

  public static com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodDescribeVodDomainBandwidthDataRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodDescribeVodDomainBandwidthDataRequest>() {
    @java.lang.Override
    public VodDescribeVodDomainBandwidthDataRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodDescribeVodDomainBandwidthDataRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodDescribeVodDomainBandwidthDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodDescribeVodDomainBandwidthDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.request.VodDescribeVodDomainBandwidthDataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
