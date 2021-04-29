// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_media.proto

package com.volcengine.model.vod.business;

/**
 * Protobuf type {@code Volcengine.Models.Vod.Business.VodUpdateSubtitleStatusData}
 */
public final class VodUpdateSubtitleStatusData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Models.Vod.Business.VodUpdateSubtitleStatusData)
    VodUpdateSubtitleStatusDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodUpdateSubtitleStatusData.newBuilder() to construct.
  private VodUpdateSubtitleStatusData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodUpdateSubtitleStatusData() {
    notExistFileIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodUpdateSubtitleStatusData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodUpdateSubtitleStatusData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              notExistFileIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            notExistFileIds_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        notExistFileIds_ = notExistFileIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.model.vod.business.VodMedia.internal_static_Volcengine_Models_Vod_Business_VodUpdateSubtitleStatusData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.model.vod.business.VodMedia.internal_static_Volcengine_Models_Vod_Business_VodUpdateSubtitleStatusData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.model.vod.business.VodUpdateSubtitleStatusData.class, com.volcengine.model.vod.business.VodUpdateSubtitleStatusData.Builder.class);
  }

  public static final int NOTEXISTFILEIDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList notExistFileIds_;
  /**
   * <pre>
   *不存在的转码FileID列表
   * </pre>
   *
   * <code>repeated string NotExistFileIds = 1;</code>
   * @return A list containing the notExistFileIds.
   */
  public com.google.protobuf.ProtocolStringList
      getNotExistFileIdsList() {
    return notExistFileIds_;
  }
  /**
   * <pre>
   *不存在的转码FileID列表
   * </pre>
   *
   * <code>repeated string NotExistFileIds = 1;</code>
   * @return The count of notExistFileIds.
   */
  public int getNotExistFileIdsCount() {
    return notExistFileIds_.size();
  }
  /**
   * <pre>
   *不存在的转码FileID列表
   * </pre>
   *
   * <code>repeated string NotExistFileIds = 1;</code>
   * @param index The index of the element to return.
   * @return The notExistFileIds at the given index.
   */
  public java.lang.String getNotExistFileIds(int index) {
    return notExistFileIds_.get(index);
  }
  /**
   * <pre>
   *不存在的转码FileID列表
   * </pre>
   *
   * <code>repeated string NotExistFileIds = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the notExistFileIds at the given index.
   */
  public com.google.protobuf.ByteString
      getNotExistFileIdsBytes(int index) {
    return notExistFileIds_.getByteString(index);
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
    for (int i = 0; i < notExistFileIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, notExistFileIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < notExistFileIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(notExistFileIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNotExistFileIdsList().size();
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
    if (!(obj instanceof com.volcengine.model.vod.business.VodUpdateSubtitleStatusData)) {
      return super.equals(obj);
    }
    com.volcengine.model.vod.business.VodUpdateSubtitleStatusData other = (com.volcengine.model.vod.business.VodUpdateSubtitleStatusData) obj;

    if (!getNotExistFileIdsList()
        .equals(other.getNotExistFileIdsList())) return false;
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
    if (getNotExistFileIdsCount() > 0) {
      hash = (37 * hash) + NOTEXISTFILEIDS_FIELD_NUMBER;
      hash = (53 * hash) + getNotExistFileIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.model.vod.business.VodUpdateSubtitleStatusData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.business.VodUpdateSubtitleStatusData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.business.VodUpdateSubtitleStatusData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.business.VodUpdateSubtitleStatusData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.business.VodUpdateSubtitleStatusData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.model.vod.business.VodUpdateSubtitleStatusData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.model.vod.business.VodUpdateSubtitleStatusData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.business.VodUpdateSubtitleStatusData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.model.vod.business.VodUpdateSubtitleStatusData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.business.VodUpdateSubtitleStatusData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.model.vod.business.VodUpdateSubtitleStatusData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.model.vod.business.VodUpdateSubtitleStatusData parseFrom(
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
  public static Builder newBuilder(com.volcengine.model.vod.business.VodUpdateSubtitleStatusData prototype) {
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
   * Protobuf type {@code Volcengine.Models.Vod.Business.VodUpdateSubtitleStatusData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Models.Vod.Business.VodUpdateSubtitleStatusData)
      com.volcengine.model.vod.business.VodUpdateSubtitleStatusDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.model.vod.business.VodMedia.internal_static_Volcengine_Models_Vod_Business_VodUpdateSubtitleStatusData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.model.vod.business.VodMedia.internal_static_Volcengine_Models_Vod_Business_VodUpdateSubtitleStatusData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.model.vod.business.VodUpdateSubtitleStatusData.class, com.volcengine.model.vod.business.VodUpdateSubtitleStatusData.Builder.class);
    }

    // Construct using com.volcengine.model.vod.business.VodUpdateSubtitleStatusData.newBuilder()
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
      notExistFileIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.model.vod.business.VodMedia.internal_static_Volcengine_Models_Vod_Business_VodUpdateSubtitleStatusData_descriptor;
    }

    @java.lang.Override
    public com.volcengine.model.vod.business.VodUpdateSubtitleStatusData getDefaultInstanceForType() {
      return com.volcengine.model.vod.business.VodUpdateSubtitleStatusData.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.model.vod.business.VodUpdateSubtitleStatusData build() {
      com.volcengine.model.vod.business.VodUpdateSubtitleStatusData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.model.vod.business.VodUpdateSubtitleStatusData buildPartial() {
      com.volcengine.model.vod.business.VodUpdateSubtitleStatusData result = new com.volcengine.model.vod.business.VodUpdateSubtitleStatusData(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        notExistFileIds_ = notExistFileIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.notExistFileIds_ = notExistFileIds_;
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
      if (other instanceof com.volcengine.model.vod.business.VodUpdateSubtitleStatusData) {
        return mergeFrom((com.volcengine.model.vod.business.VodUpdateSubtitleStatusData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.model.vod.business.VodUpdateSubtitleStatusData other) {
      if (other == com.volcengine.model.vod.business.VodUpdateSubtitleStatusData.getDefaultInstance()) return this;
      if (!other.notExistFileIds_.isEmpty()) {
        if (notExistFileIds_.isEmpty()) {
          notExistFileIds_ = other.notExistFileIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNotExistFileIdsIsMutable();
          notExistFileIds_.addAll(other.notExistFileIds_);
        }
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
      com.volcengine.model.vod.business.VodUpdateSubtitleStatusData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.model.vod.business.VodUpdateSubtitleStatusData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList notExistFileIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureNotExistFileIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        notExistFileIds_ = new com.google.protobuf.LazyStringArrayList(notExistFileIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @return A list containing the notExistFileIds.
     */
    public com.google.protobuf.ProtocolStringList
        getNotExistFileIdsList() {
      return notExistFileIds_.getUnmodifiableView();
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @return The count of notExistFileIds.
     */
    public int getNotExistFileIdsCount() {
      return notExistFileIds_.size();
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @param index The index of the element to return.
     * @return The notExistFileIds at the given index.
     */
    public java.lang.String getNotExistFileIds(int index) {
      return notExistFileIds_.get(index);
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the notExistFileIds at the given index.
     */
    public com.google.protobuf.ByteString
        getNotExistFileIdsBytes(int index) {
      return notExistFileIds_.getByteString(index);
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @param index The index to set the value at.
     * @param value The notExistFileIds to set.
     * @return This builder for chaining.
     */
    public Builder setNotExistFileIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNotExistFileIdsIsMutable();
      notExistFileIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @param value The notExistFileIds to add.
     * @return This builder for chaining.
     */
    public Builder addNotExistFileIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNotExistFileIdsIsMutable();
      notExistFileIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @param values The notExistFileIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllNotExistFileIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureNotExistFileIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, notExistFileIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNotExistFileIds() {
      notExistFileIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @param value The bytes of the notExistFileIds to add.
     * @return This builder for chaining.
     */
    public Builder addNotExistFileIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureNotExistFileIdsIsMutable();
      notExistFileIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Models.Vod.Business.VodUpdateSubtitleStatusData)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Models.Vod.Business.VodUpdateSubtitleStatusData)
  private static final com.volcengine.model.vod.business.VodUpdateSubtitleStatusData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.model.vod.business.VodUpdateSubtitleStatusData();
  }

  public static com.volcengine.model.vod.business.VodUpdateSubtitleStatusData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodUpdateSubtitleStatusData>
      PARSER = new com.google.protobuf.AbstractParser<VodUpdateSubtitleStatusData>() {
    @java.lang.Override
    public VodUpdateSubtitleStatusData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodUpdateSubtitleStatusData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodUpdateSubtitleStatusData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodUpdateSubtitleStatusData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.model.vod.business.VodUpdateSubtitleStatusData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

