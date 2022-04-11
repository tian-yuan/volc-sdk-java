// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_cdn.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodCdnAccessLogElement}
 */
public final class VodCdnAccessLogElement extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodCdnAccessLogElement)
    VodCdnAccessLogElementOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodCdnAccessLogElement.newBuilder() to construct.
  private VodCdnAccessLogElement(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodCdnAccessLogElement() {
    downloadUrl_ = "";
    fileName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodCdnAccessLogElement();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodCdnAccessLogElement(
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

            downloadUrl_ = s;
            break;
          }
          case 16: {

            fileSize_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            fileName_ = s;
            break;
          }
          case 32: {

            startTimestamp_ = input.readInt32();
            break;
          }
          case 40: {

            endTimestamp_ = input.readInt32();
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
    return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnAccessLogElement_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnAccessLogElement_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodCdnAccessLogElement.class, com.volcengine.service.vod.model.business.VodCdnAccessLogElement.Builder.class);
  }

  public static final int DOWNLOADURL_FIELD_NUMBER = 1;
  private volatile java.lang.Object downloadUrl_;
  /**
   * <pre>
   * 下载地址
   * </pre>
   *
   * <code>string DownloadUrl = 1;</code>
   * @return The downloadUrl.
   */
  @java.lang.Override
  public java.lang.String getDownloadUrl() {
    java.lang.Object ref = downloadUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      downloadUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 下载地址
   * </pre>
   *
   * <code>string DownloadUrl = 1;</code>
   * @return The bytes for downloadUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDownloadUrlBytes() {
    java.lang.Object ref = downloadUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      downloadUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILESIZE_FIELD_NUMBER = 2;
  private long fileSize_;
  /**
   * <pre>
   * 文件大小，单位：bytes
   * </pre>
   *
   * <code>int64 FileSize = 2;</code>
   * @return The fileSize.
   */
  @java.lang.Override
  public long getFileSize() {
    return fileSize_;
  }

  public static final int FILENAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object fileName_;
  /**
   * <pre>
   * 日志文件名
   * </pre>
   *
   * <code>string FileName = 3;</code>
   * @return The fileName.
   */
  @java.lang.Override
  public java.lang.String getFileName() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 日志文件名
   * </pre>
   *
   * <code>string FileName = 3;</code>
   * @return The bytes for fileName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileNameBytes() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STARTTIMESTAMP_FIELD_NUMBER = 4;
  private int startTimestamp_;
  /**
   * <pre>
   * 日志包起始时间，单位：Unix秒级时间戳
   * </pre>
   *
   * <code>int32 StartTimestamp = 4;</code>
   * @return The startTimestamp.
   */
  @java.lang.Override
  public int getStartTimestamp() {
    return startTimestamp_;
  }

  public static final int ENDTIMESTAMP_FIELD_NUMBER = 5;
  private int endTimestamp_;
  /**
   * <pre>
   * 日志包结束时间，单位：Unix秒级时间戳
   * </pre>
   *
   * <code>int32 EndTimestamp = 5;</code>
   * @return The endTimestamp.
   */
  @java.lang.Override
  public int getEndTimestamp() {
    return endTimestamp_;
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
    if (!getDownloadUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, downloadUrl_);
    }
    if (fileSize_ != 0L) {
      output.writeInt64(2, fileSize_);
    }
    if (!getFileNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, fileName_);
    }
    if (startTimestamp_ != 0) {
      output.writeInt32(4, startTimestamp_);
    }
    if (endTimestamp_ != 0) {
      output.writeInt32(5, endTimestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDownloadUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, downloadUrl_);
    }
    if (fileSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, fileSize_);
    }
    if (!getFileNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, fileName_);
    }
    if (startTimestamp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, startTimestamp_);
    }
    if (endTimestamp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, endTimestamp_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodCdnAccessLogElement)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodCdnAccessLogElement other = (com.volcengine.service.vod.model.business.VodCdnAccessLogElement) obj;

    if (!getDownloadUrl()
        .equals(other.getDownloadUrl())) return false;
    if (getFileSize()
        != other.getFileSize()) return false;
    if (!getFileName()
        .equals(other.getFileName())) return false;
    if (getStartTimestamp()
        != other.getStartTimestamp()) return false;
    if (getEndTimestamp()
        != other.getEndTimestamp()) return false;
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
    hash = (37 * hash) + DOWNLOADURL_FIELD_NUMBER;
    hash = (53 * hash) + getDownloadUrl().hashCode();
    hash = (37 * hash) + FILESIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFileSize());
    hash = (37 * hash) + FILENAME_FIELD_NUMBER;
    hash = (53 * hash) + getFileName().hashCode();
    hash = (37 * hash) + STARTTIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getStartTimestamp();
    hash = (37 * hash) + ENDTIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getEndTimestamp();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodCdnAccessLogElement parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodCdnAccessLogElement parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnAccessLogElement parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodCdnAccessLogElement parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnAccessLogElement parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodCdnAccessLogElement parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnAccessLogElement parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodCdnAccessLogElement parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnAccessLogElement parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodCdnAccessLogElement parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodCdnAccessLogElement parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodCdnAccessLogElement parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodCdnAccessLogElement prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodCdnAccessLogElement}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodCdnAccessLogElement)
      com.volcengine.service.vod.model.business.VodCdnAccessLogElementOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnAccessLogElement_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnAccessLogElement_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodCdnAccessLogElement.class, com.volcengine.service.vod.model.business.VodCdnAccessLogElement.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodCdnAccessLogElement.newBuilder()
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
      downloadUrl_ = "";

      fileSize_ = 0L;

      fileName_ = "";

      startTimestamp_ = 0;

      endTimestamp_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodCdn.internal_static_Volcengine_Vod_Models_Business_VodCdnAccessLogElement_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodCdnAccessLogElement getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodCdnAccessLogElement.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodCdnAccessLogElement build() {
      com.volcengine.service.vod.model.business.VodCdnAccessLogElement result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodCdnAccessLogElement buildPartial() {
      com.volcengine.service.vod.model.business.VodCdnAccessLogElement result = new com.volcengine.service.vod.model.business.VodCdnAccessLogElement(this);
      result.downloadUrl_ = downloadUrl_;
      result.fileSize_ = fileSize_;
      result.fileName_ = fileName_;
      result.startTimestamp_ = startTimestamp_;
      result.endTimestamp_ = endTimestamp_;
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
      if (other instanceof com.volcengine.service.vod.model.business.VodCdnAccessLogElement) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodCdnAccessLogElement)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodCdnAccessLogElement other) {
      if (other == com.volcengine.service.vod.model.business.VodCdnAccessLogElement.getDefaultInstance()) return this;
      if (!other.getDownloadUrl().isEmpty()) {
        downloadUrl_ = other.downloadUrl_;
        onChanged();
      }
      if (other.getFileSize() != 0L) {
        setFileSize(other.getFileSize());
      }
      if (!other.getFileName().isEmpty()) {
        fileName_ = other.fileName_;
        onChanged();
      }
      if (other.getStartTimestamp() != 0) {
        setStartTimestamp(other.getStartTimestamp());
      }
      if (other.getEndTimestamp() != 0) {
        setEndTimestamp(other.getEndTimestamp());
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
      com.volcengine.service.vod.model.business.VodCdnAccessLogElement parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodCdnAccessLogElement) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object downloadUrl_ = "";
    /**
     * <pre>
     * 下载地址
     * </pre>
     *
     * <code>string DownloadUrl = 1;</code>
     * @return The downloadUrl.
     */
    public java.lang.String getDownloadUrl() {
      java.lang.Object ref = downloadUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        downloadUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 下载地址
     * </pre>
     *
     * <code>string DownloadUrl = 1;</code>
     * @return The bytes for downloadUrl.
     */
    public com.google.protobuf.ByteString
        getDownloadUrlBytes() {
      java.lang.Object ref = downloadUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        downloadUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 下载地址
     * </pre>
     *
     * <code>string DownloadUrl = 1;</code>
     * @param value The downloadUrl to set.
     * @return This builder for chaining.
     */
    public Builder setDownloadUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      downloadUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 下载地址
     * </pre>
     *
     * <code>string DownloadUrl = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDownloadUrl() {
      
      downloadUrl_ = getDefaultInstance().getDownloadUrl();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 下载地址
     * </pre>
     *
     * <code>string DownloadUrl = 1;</code>
     * @param value The bytes for downloadUrl to set.
     * @return This builder for chaining.
     */
    public Builder setDownloadUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      downloadUrl_ = value;
      onChanged();
      return this;
    }

    private long fileSize_ ;
    /**
     * <pre>
     * 文件大小，单位：bytes
     * </pre>
     *
     * <code>int64 FileSize = 2;</code>
     * @return The fileSize.
     */
    @java.lang.Override
    public long getFileSize() {
      return fileSize_;
    }
    /**
     * <pre>
     * 文件大小，单位：bytes
     * </pre>
     *
     * <code>int64 FileSize = 2;</code>
     * @param value The fileSize to set.
     * @return This builder for chaining.
     */
    public Builder setFileSize(long value) {
      
      fileSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 文件大小，单位：bytes
     * </pre>
     *
     * <code>int64 FileSize = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileSize() {
      
      fileSize_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object fileName_ = "";
    /**
     * <pre>
     * 日志文件名
     * </pre>
     *
     * <code>string FileName = 3;</code>
     * @return The fileName.
     */
    public java.lang.String getFileName() {
      java.lang.Object ref = fileName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 日志文件名
     * </pre>
     *
     * <code>string FileName = 3;</code>
     * @return The bytes for fileName.
     */
    public com.google.protobuf.ByteString
        getFileNameBytes() {
      java.lang.Object ref = fileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 日志文件名
     * </pre>
     *
     * <code>string FileName = 3;</code>
     * @param value The fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fileName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 日志文件名
     * </pre>
     *
     * <code>string FileName = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileName() {
      
      fileName_ = getDefaultInstance().getFileName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 日志文件名
     * </pre>
     *
     * <code>string FileName = 3;</code>
     * @param value The bytes for fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fileName_ = value;
      onChanged();
      return this;
    }

    private int startTimestamp_ ;
    /**
     * <pre>
     * 日志包起始时间，单位：Unix秒级时间戳
     * </pre>
     *
     * <code>int32 StartTimestamp = 4;</code>
     * @return The startTimestamp.
     */
    @java.lang.Override
    public int getStartTimestamp() {
      return startTimestamp_;
    }
    /**
     * <pre>
     * 日志包起始时间，单位：Unix秒级时间戳
     * </pre>
     *
     * <code>int32 StartTimestamp = 4;</code>
     * @param value The startTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setStartTimestamp(int value) {
      
      startTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 日志包起始时间，单位：Unix秒级时间戳
     * </pre>
     *
     * <code>int32 StartTimestamp = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTimestamp() {
      
      startTimestamp_ = 0;
      onChanged();
      return this;
    }

    private int endTimestamp_ ;
    /**
     * <pre>
     * 日志包结束时间，单位：Unix秒级时间戳
     * </pre>
     *
     * <code>int32 EndTimestamp = 5;</code>
     * @return The endTimestamp.
     */
    @java.lang.Override
    public int getEndTimestamp() {
      return endTimestamp_;
    }
    /**
     * <pre>
     * 日志包结束时间，单位：Unix秒级时间戳
     * </pre>
     *
     * <code>int32 EndTimestamp = 5;</code>
     * @param value The endTimestamp to set.
     * @return This builder for chaining.
     */
    public Builder setEndTimestamp(int value) {
      
      endTimestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 日志包结束时间，单位：Unix秒级时间戳
     * </pre>
     *
     * <code>int32 EndTimestamp = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEndTimestamp() {
      
      endTimestamp_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodCdnAccessLogElement)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodCdnAccessLogElement)
  private static final com.volcengine.service.vod.model.business.VodCdnAccessLogElement DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodCdnAccessLogElement();
  }

  public static com.volcengine.service.vod.model.business.VodCdnAccessLogElement getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodCdnAccessLogElement>
      PARSER = new com.google.protobuf.AbstractParser<VodCdnAccessLogElement>() {
    @java.lang.Override
    public VodCdnAccessLogElement parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodCdnAccessLogElement(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodCdnAccessLogElement> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodCdnAccessLogElement> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodCdnAccessLogElement getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

