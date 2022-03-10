// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodMediaPlayInfo}
 */
public final class VodMediaPlayInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodMediaPlayInfo)
    VodMediaPlayInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodMediaPlayInfo.newBuilder() to construct.
  private VodMediaPlayInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodMediaPlayInfo() {
    mainPlayUrl_ = "";
    backupPlayUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodMediaPlayInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodMediaPlayInfo(
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

            mainPlayUrl_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            backupPlayUrl_ = s;
            break;
          }
          case 24: {

            status_ = input.readInt32();
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
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodMediaPlayInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodMediaPlayInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodMediaPlayInfo.class, com.volcengine.service.vod.model.business.VodMediaPlayInfo.Builder.class);
  }

  public static final int MAINPLAYURL_FIELD_NUMBER = 1;
  private volatile java.lang.Object mainPlayUrl_;
  /**
   * <code>string MainPlayUrl = 1;</code>
   * @return The mainPlayUrl.
   */
  @java.lang.Override
  public java.lang.String getMainPlayUrl() {
    java.lang.Object ref = mainPlayUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mainPlayUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string MainPlayUrl = 1;</code>
   * @return The bytes for mainPlayUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMainPlayUrlBytes() {
    java.lang.Object ref = mainPlayUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      mainPlayUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BACKUPPLAYURL_FIELD_NUMBER = 2;
  private volatile java.lang.Object backupPlayUrl_;
  /**
   * <code>string BackupPlayUrl = 2;</code>
   * @return The backupPlayUrl.
   */
  @java.lang.Override
  public java.lang.String getBackupPlayUrl() {
    java.lang.Object ref = backupPlayUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      backupPlayUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string BackupPlayUrl = 2;</code>
   * @return The bytes for backupPlayUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBackupPlayUrlBytes() {
    java.lang.Object ref = backupPlayUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      backupPlayUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>int32 Status = 3;</code>
   * @return The status.
   */
  @java.lang.Override
  public int getStatus() {
    return status_;
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
    if (!getMainPlayUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, mainPlayUrl_);
    }
    if (!getBackupPlayUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, backupPlayUrl_);
    }
    if (status_ != 0) {
      output.writeInt32(3, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getMainPlayUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, mainPlayUrl_);
    }
    if (!getBackupPlayUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, backupPlayUrl_);
    }
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, status_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodMediaPlayInfo)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodMediaPlayInfo other = (com.volcengine.service.vod.model.business.VodMediaPlayInfo) obj;

    if (!getMainPlayUrl()
        .equals(other.getMainPlayUrl())) return false;
    if (!getBackupPlayUrl()
        .equals(other.getBackupPlayUrl())) return false;
    if (getStatus()
        != other.getStatus()) return false;
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
    hash = (37 * hash) + MAINPLAYURL_FIELD_NUMBER;
    hash = (53 * hash) + getMainPlayUrl().hashCode();
    hash = (37 * hash) + BACKUPPLAYURL_FIELD_NUMBER;
    hash = (53 * hash) + getBackupPlayUrl().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodMediaPlayInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodMediaPlayInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodMediaPlayInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodMediaPlayInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodMediaPlayInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodMediaPlayInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodMediaPlayInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodMediaPlayInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodMediaPlayInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodMediaPlayInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodMediaPlayInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodMediaPlayInfo parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodMediaPlayInfo prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodMediaPlayInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodMediaPlayInfo)
      com.volcengine.service.vod.model.business.VodMediaPlayInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodMediaPlayInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodMediaPlayInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodMediaPlayInfo.class, com.volcengine.service.vod.model.business.VodMediaPlayInfo.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodMediaPlayInfo.newBuilder()
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
      mainPlayUrl_ = "";

      backupPlayUrl_ = "";

      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodMediaPlayInfo_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodMediaPlayInfo getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodMediaPlayInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodMediaPlayInfo build() {
      com.volcengine.service.vod.model.business.VodMediaPlayInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodMediaPlayInfo buildPartial() {
      com.volcengine.service.vod.model.business.VodMediaPlayInfo result = new com.volcengine.service.vod.model.business.VodMediaPlayInfo(this);
      result.mainPlayUrl_ = mainPlayUrl_;
      result.backupPlayUrl_ = backupPlayUrl_;
      result.status_ = status_;
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
      if (other instanceof com.volcengine.service.vod.model.business.VodMediaPlayInfo) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodMediaPlayInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodMediaPlayInfo other) {
      if (other == com.volcengine.service.vod.model.business.VodMediaPlayInfo.getDefaultInstance()) return this;
      if (!other.getMainPlayUrl().isEmpty()) {
        mainPlayUrl_ = other.mainPlayUrl_;
        onChanged();
      }
      if (!other.getBackupPlayUrl().isEmpty()) {
        backupPlayUrl_ = other.backupPlayUrl_;
        onChanged();
      }
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
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
      com.volcengine.service.vod.model.business.VodMediaPlayInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodMediaPlayInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object mainPlayUrl_ = "";
    /**
     * <code>string MainPlayUrl = 1;</code>
     * @return The mainPlayUrl.
     */
    public java.lang.String getMainPlayUrl() {
      java.lang.Object ref = mainPlayUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mainPlayUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string MainPlayUrl = 1;</code>
     * @return The bytes for mainPlayUrl.
     */
    public com.google.protobuf.ByteString
        getMainPlayUrlBytes() {
      java.lang.Object ref = mainPlayUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        mainPlayUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string MainPlayUrl = 1;</code>
     * @param value The mainPlayUrl to set.
     * @return This builder for chaining.
     */
    public Builder setMainPlayUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      mainPlayUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string MainPlayUrl = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMainPlayUrl() {
      
      mainPlayUrl_ = getDefaultInstance().getMainPlayUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string MainPlayUrl = 1;</code>
     * @param value The bytes for mainPlayUrl to set.
     * @return This builder for chaining.
     */
    public Builder setMainPlayUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      mainPlayUrl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object backupPlayUrl_ = "";
    /**
     * <code>string BackupPlayUrl = 2;</code>
     * @return The backupPlayUrl.
     */
    public java.lang.String getBackupPlayUrl() {
      java.lang.Object ref = backupPlayUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        backupPlayUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string BackupPlayUrl = 2;</code>
     * @return The bytes for backupPlayUrl.
     */
    public com.google.protobuf.ByteString
        getBackupPlayUrlBytes() {
      java.lang.Object ref = backupPlayUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        backupPlayUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string BackupPlayUrl = 2;</code>
     * @param value The backupPlayUrl to set.
     * @return This builder for chaining.
     */
    public Builder setBackupPlayUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      backupPlayUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string BackupPlayUrl = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBackupPlayUrl() {
      
      backupPlayUrl_ = getDefaultInstance().getBackupPlayUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string BackupPlayUrl = 2;</code>
     * @param value The bytes for backupPlayUrl to set.
     * @return This builder for chaining.
     */
    public Builder setBackupPlayUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      backupPlayUrl_ = value;
      onChanged();
      return this;
    }

    private int status_ ;
    /**
     * <code>int32 Status = 3;</code>
     * @return The status.
     */
    @java.lang.Override
    public int getStatus() {
      return status_;
    }
    /**
     * <code>int32 Status = 3;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 Status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodMediaPlayInfo)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodMediaPlayInfo)
  private static final com.volcengine.service.vod.model.business.VodMediaPlayInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodMediaPlayInfo();
  }

  public static com.volcengine.service.vod.model.business.VodMediaPlayInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodMediaPlayInfo>
      PARSER = new com.google.protobuf.AbstractParser<VodMediaPlayInfo>() {
    @java.lang.Override
    public VodMediaPlayInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodMediaPlayInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodMediaPlayInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodMediaPlayInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodMediaPlayInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

