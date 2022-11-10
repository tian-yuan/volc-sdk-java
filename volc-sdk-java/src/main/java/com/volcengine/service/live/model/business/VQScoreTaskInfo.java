// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/business/VQScore.proto

package com.volcengine.service.live.model.business;

/**
 * Protobuf type {@code Volcengine.Live.Models.Business.VQScoreTaskInfo}
 */
public final class VQScoreTaskInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Live.Models.Business.VQScoreTaskInfo)
    VQScoreTaskInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VQScoreTaskInfo.newBuilder() to construct.
  private VQScoreTaskInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VQScoreTaskInfo() {
    iD_ = "";
    accountID_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new VQScoreTaskInfo();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VQScoreTaskInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
            String s = input.readStringRequireUtf8();

            iD_ = s;
            break;
          }
          case 16: {

            duration_ = input.readInt64();
            break;
          }
          case 24: {

            status_ = input.readInt64();
            break;
          }
          case 34: {
            String s = input.readStringRequireUtf8();

            accountID_ = s;
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
    return VQScore.internal_static_Volcengine_Live_Models_Business_VQScoreTaskInfo_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return VQScore.internal_static_Volcengine_Live_Models_Business_VQScoreTaskInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            VQScoreTaskInfo.class, Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile Object iD_;
  /**
   * <pre>
   *测评任务ID
   * </pre>
   *
   * <code>string ID = 1;</code>
   * @return The iD.
   */
  @Override
  public String getID() {
    Object ref = iD_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      iD_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *测评任务ID
   * </pre>
   *
   * <code>string ID = 1;</code>
   * @return The bytes for iD.
   */
  @Override
  public com.google.protobuf.ByteString
      getIDBytes() {
    Object ref = iD_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      iD_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DURATION_FIELD_NUMBER = 2;
  private long duration_;
  /**
   * <pre>
   *测评运行时间
   * </pre>
   *
   * <code>int64 Duration = 2;</code>
   * @return The duration.
   */
  @Override
  public long getDuration() {
    return duration_;
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private long status_;
  /**
   * <pre>
   *测评状态，1：测试中，2：成功，3：失败
   * </pre>
   *
   * <code>int64 Status = 3;</code>
   * @return The status.
   */
  @Override
  public long getStatus() {
    return status_;
  }

  public static final int ACCOUNTID_FIELD_NUMBER = 4;
  private volatile Object accountID_;
  /**
   * <pre>
   *账号
   * </pre>
   *
   * <code>string AccountID = 4;</code>
   * @return The accountID.
   */
  @Override
  public String getAccountID() {
    Object ref = accountID_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      accountID_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *账号
   * </pre>
   *
   * <code>string AccountID = 4;</code>
   * @return The bytes for accountID.
   */
  @Override
  public com.google.protobuf.ByteString
      getAccountIDBytes() {
    Object ref = accountID_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      accountID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iD_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, iD_);
    }
    if (duration_ != 0L) {
      output.writeInt64(2, duration_);
    }
    if (status_ != 0L) {
      output.writeInt64(3, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountID_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, accountID_);
    }
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(iD_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, iD_);
    }
    if (duration_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, duration_);
    }
    if (status_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(accountID_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, accountID_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof VQScoreTaskInfo)) {
      return super.equals(obj);
    }
    VQScoreTaskInfo other = (VQScoreTaskInfo) obj;

    if (!getID()
        .equals(other.getID())) return false;
    if (getDuration()
        != other.getDuration()) return false;
    if (getStatus()
        != other.getStatus()) return false;
    if (!getAccountID()
        .equals(other.getAccountID())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getID().hashCode();
    hash = (37 * hash) + DURATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDuration());
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStatus());
    hash = (37 * hash) + ACCOUNTID_FIELD_NUMBER;
    hash = (53 * hash) + getAccountID().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static VQScoreTaskInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VQScoreTaskInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VQScoreTaskInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VQScoreTaskInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VQScoreTaskInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static VQScoreTaskInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static VQScoreTaskInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static VQScoreTaskInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static VQScoreTaskInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static VQScoreTaskInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static VQScoreTaskInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static VQScoreTaskInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(VQScoreTaskInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Volcengine.Live.Models.Business.VQScoreTaskInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Live.Models.Business.VQScoreTaskInfo)
      VQScoreTaskInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return VQScore.internal_static_Volcengine_Live_Models_Business_VQScoreTaskInfo_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return VQScore.internal_static_Volcengine_Live_Models_Business_VQScoreTaskInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              VQScoreTaskInfo.class, Builder.class);
    }

    // Construct using com.volcengine.service.live.model.business.VQScoreTaskInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      iD_ = "";

      duration_ = 0L;

      status_ = 0L;

      accountID_ = "";

      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return VQScore.internal_static_Volcengine_Live_Models_Business_VQScoreTaskInfo_descriptor;
    }

    @Override
    public VQScoreTaskInfo getDefaultInstanceForType() {
      return VQScoreTaskInfo.getDefaultInstance();
    }

    @Override
    public VQScoreTaskInfo build() {
      VQScoreTaskInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public VQScoreTaskInfo buildPartial() {
      VQScoreTaskInfo result = new VQScoreTaskInfo(this);
      result.iD_ = iD_;
      result.duration_ = duration_;
      result.status_ = status_;
      result.accountID_ = accountID_;
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof VQScoreTaskInfo) {
        return mergeFrom((VQScoreTaskInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(VQScoreTaskInfo other) {
      if (other == VQScoreTaskInfo.getDefaultInstance()) return this;
      if (!other.getID().isEmpty()) {
        iD_ = other.iD_;
        onChanged();
      }
      if (other.getDuration() != 0L) {
        setDuration(other.getDuration());
      }
      if (other.getStatus() != 0L) {
        setStatus(other.getStatus());
      }
      if (!other.getAccountID().isEmpty()) {
        accountID_ = other.accountID_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      VQScoreTaskInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (VQScoreTaskInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private Object iD_ = "";
    /**
     * <pre>
     *测评任务ID
     * </pre>
     *
     * <code>string ID = 1;</code>
     * @return The iD.
     */
    public String getID() {
      Object ref = iD_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        iD_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     *测评任务ID
     * </pre>
     *
     * <code>string ID = 1;</code>
     * @return The bytes for iD.
     */
    public com.google.protobuf.ByteString
        getIDBytes() {
      Object ref = iD_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        iD_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *测评任务ID
     * </pre>
     *
     * <code>string ID = 1;</code>
     * @param value The iD to set.
     * @return This builder for chaining.
     */
    public Builder setID(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      iD_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *测评任务ID
     * </pre>
     *
     * <code>string ID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearID() {
      
      iD_ = getDefaultInstance().getID();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *测评任务ID
     * </pre>
     *
     * <code>string ID = 1;</code>
     * @param value The bytes for iD to set.
     * @return This builder for chaining.
     */
    public Builder setIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      iD_ = value;
      onChanged();
      return this;
    }

    private long duration_ ;
    /**
     * <pre>
     *测评运行时间
     * </pre>
     *
     * <code>int64 Duration = 2;</code>
     * @return The duration.
     */
    @Override
    public long getDuration() {
      return duration_;
    }
    /**
     * <pre>
     *测评运行时间
     * </pre>
     *
     * <code>int64 Duration = 2;</code>
     * @param value The duration to set.
     * @return This builder for chaining.
     */
    public Builder setDuration(long value) {
      
      duration_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *测评运行时间
     * </pre>
     *
     * <code>int64 Duration = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDuration() {
      
      duration_ = 0L;
      onChanged();
      return this;
    }

    private long status_ ;
    /**
     * <pre>
     *测评状态，1：测试中，2：成功，3：失败
     * </pre>
     *
     * <code>int64 Status = 3;</code>
     * @return The status.
     */
    @Override
    public long getStatus() {
      return status_;
    }
    /**
     * <pre>
     *测评状态，1：测试中，2：成功，3：失败
     * </pre>
     *
     * <code>int64 Status = 3;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(long value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *测评状态，1：测试中，2：成功，3：失败
     * </pre>
     *
     * <code>int64 Status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0L;
      onChanged();
      return this;
    }

    private Object accountID_ = "";
    /**
     * <pre>
     *账号
     * </pre>
     *
     * <code>string AccountID = 4;</code>
     * @return The accountID.
     */
    public String getAccountID() {
      Object ref = accountID_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        accountID_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <pre>
     *账号
     * </pre>
     *
     * <code>string AccountID = 4;</code>
     * @return The bytes for accountID.
     */
    public com.google.protobuf.ByteString
        getAccountIDBytes() {
      Object ref = accountID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        accountID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *账号
     * </pre>
     *
     * <code>string AccountID = 4;</code>
     * @param value The accountID to set.
     * @return This builder for chaining.
     */
    public Builder setAccountID(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      accountID_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *账号
     * </pre>
     *
     * <code>string AccountID = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountID() {
      
      accountID_ = getDefaultInstance().getAccountID();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *账号
     * </pre>
     *
     * <code>string AccountID = 4;</code>
     * @param value The bytes for accountID to set.
     * @return This builder for chaining.
     */
    public Builder setAccountIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      accountID_ = value;
      onChanged();
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Volcengine.Live.Models.Business.VQScoreTaskInfo)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Live.Models.Business.VQScoreTaskInfo)
  private static final VQScoreTaskInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new VQScoreTaskInfo();
  }

  public static VQScoreTaskInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VQScoreTaskInfo>
      PARSER = new com.google.protobuf.AbstractParser<VQScoreTaskInfo>() {
    @Override
    public VQScoreTaskInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VQScoreTaskInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VQScoreTaskInfo> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<VQScoreTaskInfo> getParserForType() {
    return PARSER;
  }

  @Override
  public VQScoreTaskInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

