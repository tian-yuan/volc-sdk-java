// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodGetMediaInfosData}
 */
public final class VodGetMediaInfosData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodGetMediaInfosData)
    VodGetMediaInfosDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodGetMediaInfosData.newBuilder() to construct.
  private VodGetMediaInfosData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodGetMediaInfosData() {
    mediaInfoList_ = java.util.Collections.emptyList();
    notExistVids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodGetMediaInfosData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodGetMediaInfosData(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              mediaInfoList_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.VodMediaInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            mediaInfoList_.add(
                input.readMessage(com.volcengine.service.vod.model.business.VodMediaInfo.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              notExistVids_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            notExistVids_.add(s);
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
        mediaInfoList_ = java.util.Collections.unmodifiableList(mediaInfoList_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        notExistVids_ = notExistVids_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodGetMediaInfosData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodGetMediaInfosData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodGetMediaInfosData.class, com.volcengine.service.vod.model.business.VodGetMediaInfosData.Builder.class);
  }

  public static final int MEDIAINFOLIST_FIELD_NUMBER = 1;
  private java.util.List<com.volcengine.service.vod.model.business.VodMediaInfo> mediaInfoList_;
  /**
   * <pre>
   *视频信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.volcengine.service.vod.model.business.VodMediaInfo> getMediaInfoListList() {
    return mediaInfoList_;
  }
  /**
   * <pre>
   *视频信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.volcengine.service.vod.model.business.VodMediaInfoOrBuilder> 
      getMediaInfoListOrBuilderList() {
    return mediaInfoList_;
  }
  /**
   * <pre>
   *视频信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
   */
  @java.lang.Override
  public int getMediaInfoListCount() {
    return mediaInfoList_.size();
  }
  /**
   * <pre>
   *视频信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodMediaInfo getMediaInfoList(int index) {
    return mediaInfoList_.get(index);
  }
  /**
   * <pre>
   *视频信息列表
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodMediaInfoOrBuilder getMediaInfoListOrBuilder(
      int index) {
    return mediaInfoList_.get(index);
  }

  public static final int NOTEXISTVIDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList notExistVids_;
  /**
   * <pre>
   *不存在的视频VID列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 2;</code>
   * @return A list containing the notExistVids.
   */
  public com.google.protobuf.ProtocolStringList
      getNotExistVidsList() {
    return notExistVids_;
  }
  /**
   * <pre>
   *不存在的视频VID列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 2;</code>
   * @return The count of notExistVids.
   */
  public int getNotExistVidsCount() {
    return notExistVids_.size();
  }
  /**
   * <pre>
   *不存在的视频VID列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 2;</code>
   * @param index The index of the element to return.
   * @return The notExistVids at the given index.
   */
  public java.lang.String getNotExistVids(int index) {
    return notExistVids_.get(index);
  }
  /**
   * <pre>
   *不存在的视频VID列表
   * </pre>
   *
   * <code>repeated string NotExistVids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the notExistVids at the given index.
   */
  public com.google.protobuf.ByteString
      getNotExistVidsBytes(int index) {
    return notExistVids_.getByteString(index);
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
    for (int i = 0; i < mediaInfoList_.size(); i++) {
      output.writeMessage(1, mediaInfoList_.get(i));
    }
    for (int i = 0; i < notExistVids_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, notExistVids_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mediaInfoList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, mediaInfoList_.get(i));
    }
    {
      int dataSize = 0;
      for (int i = 0; i < notExistVids_.size(); i++) {
        dataSize += computeStringSizeNoTag(notExistVids_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNotExistVidsList().size();
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodGetMediaInfosData)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodGetMediaInfosData other = (com.volcengine.service.vod.model.business.VodGetMediaInfosData) obj;

    if (!getMediaInfoListList()
        .equals(other.getMediaInfoListList())) return false;
    if (!getNotExistVidsList()
        .equals(other.getNotExistVidsList())) return false;
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
    if (getMediaInfoListCount() > 0) {
      hash = (37 * hash) + MEDIAINFOLIST_FIELD_NUMBER;
      hash = (53 * hash) + getMediaInfoListList().hashCode();
    }
    if (getNotExistVidsCount() > 0) {
      hash = (37 * hash) + NOTEXISTVIDS_FIELD_NUMBER;
      hash = (53 * hash) + getNotExistVidsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodGetMediaInfosData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodGetMediaInfosData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetMediaInfosData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodGetMediaInfosData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetMediaInfosData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodGetMediaInfosData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetMediaInfosData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodGetMediaInfosData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetMediaInfosData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodGetMediaInfosData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodGetMediaInfosData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodGetMediaInfosData parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodGetMediaInfosData prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodGetMediaInfosData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodGetMediaInfosData)
      com.volcengine.service.vod.model.business.VodGetMediaInfosDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodGetMediaInfosData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodGetMediaInfosData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodGetMediaInfosData.class, com.volcengine.service.vod.model.business.VodGetMediaInfosData.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodGetMediaInfosData.newBuilder()
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
        getMediaInfoListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (mediaInfoListBuilder_ == null) {
        mediaInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        mediaInfoListBuilder_.clear();
      }
      notExistVids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodGetMediaInfosData_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodGetMediaInfosData getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodGetMediaInfosData.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodGetMediaInfosData build() {
      com.volcengine.service.vod.model.business.VodGetMediaInfosData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodGetMediaInfosData buildPartial() {
      com.volcengine.service.vod.model.business.VodGetMediaInfosData result = new com.volcengine.service.vod.model.business.VodGetMediaInfosData(this);
      int from_bitField0_ = bitField0_;
      if (mediaInfoListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mediaInfoList_ = java.util.Collections.unmodifiableList(mediaInfoList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mediaInfoList_ = mediaInfoList_;
      } else {
        result.mediaInfoList_ = mediaInfoListBuilder_.build();
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        notExistVids_ = notExistVids_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.notExistVids_ = notExistVids_;
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
      if (other instanceof com.volcengine.service.vod.model.business.VodGetMediaInfosData) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodGetMediaInfosData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodGetMediaInfosData other) {
      if (other == com.volcengine.service.vod.model.business.VodGetMediaInfosData.getDefaultInstance()) return this;
      if (mediaInfoListBuilder_ == null) {
        if (!other.mediaInfoList_.isEmpty()) {
          if (mediaInfoList_.isEmpty()) {
            mediaInfoList_ = other.mediaInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMediaInfoListIsMutable();
            mediaInfoList_.addAll(other.mediaInfoList_);
          }
          onChanged();
        }
      } else {
        if (!other.mediaInfoList_.isEmpty()) {
          if (mediaInfoListBuilder_.isEmpty()) {
            mediaInfoListBuilder_.dispose();
            mediaInfoListBuilder_ = null;
            mediaInfoList_ = other.mediaInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mediaInfoListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMediaInfoListFieldBuilder() : null;
          } else {
            mediaInfoListBuilder_.addAllMessages(other.mediaInfoList_);
          }
        }
      }
      if (!other.notExistVids_.isEmpty()) {
        if (notExistVids_.isEmpty()) {
          notExistVids_ = other.notExistVids_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureNotExistVidsIsMutable();
          notExistVids_.addAll(other.notExistVids_);
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
      com.volcengine.service.vod.model.business.VodGetMediaInfosData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodGetMediaInfosData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.volcengine.service.vod.model.business.VodMediaInfo> mediaInfoList_ =
      java.util.Collections.emptyList();
    private void ensureMediaInfoListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mediaInfoList_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.VodMediaInfo>(mediaInfoList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodMediaInfo, com.volcengine.service.vod.model.business.VodMediaInfo.Builder, com.volcengine.service.vod.model.business.VodMediaInfoOrBuilder> mediaInfoListBuilder_;

    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.VodMediaInfo> getMediaInfoListList() {
      if (mediaInfoListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mediaInfoList_);
      } else {
        return mediaInfoListBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public int getMediaInfoListCount() {
      if (mediaInfoListBuilder_ == null) {
        return mediaInfoList_.size();
      } else {
        return mediaInfoListBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodMediaInfo getMediaInfoList(int index) {
      if (mediaInfoListBuilder_ == null) {
        return mediaInfoList_.get(index);
      } else {
        return mediaInfoListBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public Builder setMediaInfoList(
        int index, com.volcengine.service.vod.model.business.VodMediaInfo value) {
      if (mediaInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMediaInfoListIsMutable();
        mediaInfoList_.set(index, value);
        onChanged();
      } else {
        mediaInfoListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public Builder setMediaInfoList(
        int index, com.volcengine.service.vod.model.business.VodMediaInfo.Builder builderForValue) {
      if (mediaInfoListBuilder_ == null) {
        ensureMediaInfoListIsMutable();
        mediaInfoList_.set(index, builderForValue.build());
        onChanged();
      } else {
        mediaInfoListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public Builder addMediaInfoList(com.volcengine.service.vod.model.business.VodMediaInfo value) {
      if (mediaInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMediaInfoListIsMutable();
        mediaInfoList_.add(value);
        onChanged();
      } else {
        mediaInfoListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public Builder addMediaInfoList(
        int index, com.volcengine.service.vod.model.business.VodMediaInfo value) {
      if (mediaInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMediaInfoListIsMutable();
        mediaInfoList_.add(index, value);
        onChanged();
      } else {
        mediaInfoListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public Builder addMediaInfoList(
        com.volcengine.service.vod.model.business.VodMediaInfo.Builder builderForValue) {
      if (mediaInfoListBuilder_ == null) {
        ensureMediaInfoListIsMutable();
        mediaInfoList_.add(builderForValue.build());
        onChanged();
      } else {
        mediaInfoListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public Builder addMediaInfoList(
        int index, com.volcengine.service.vod.model.business.VodMediaInfo.Builder builderForValue) {
      if (mediaInfoListBuilder_ == null) {
        ensureMediaInfoListIsMutable();
        mediaInfoList_.add(index, builderForValue.build());
        onChanged();
      } else {
        mediaInfoListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public Builder addAllMediaInfoList(
        java.lang.Iterable<? extends com.volcengine.service.vod.model.business.VodMediaInfo> values) {
      if (mediaInfoListBuilder_ == null) {
        ensureMediaInfoListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mediaInfoList_);
        onChanged();
      } else {
        mediaInfoListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public Builder clearMediaInfoList() {
      if (mediaInfoListBuilder_ == null) {
        mediaInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mediaInfoListBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public Builder removeMediaInfoList(int index) {
      if (mediaInfoListBuilder_ == null) {
        ensureMediaInfoListIsMutable();
        mediaInfoList_.remove(index);
        onChanged();
      } else {
        mediaInfoListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodMediaInfo.Builder getMediaInfoListBuilder(
        int index) {
      return getMediaInfoListFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodMediaInfoOrBuilder getMediaInfoListOrBuilder(
        int index) {
      if (mediaInfoListBuilder_ == null) {
        return mediaInfoList_.get(index);  } else {
        return mediaInfoListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public java.util.List<? extends com.volcengine.service.vod.model.business.VodMediaInfoOrBuilder> 
         getMediaInfoListOrBuilderList() {
      if (mediaInfoListBuilder_ != null) {
        return mediaInfoListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mediaInfoList_);
      }
    }
    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodMediaInfo.Builder addMediaInfoListBuilder() {
      return getMediaInfoListFieldBuilder().addBuilder(
          com.volcengine.service.vod.model.business.VodMediaInfo.getDefaultInstance());
    }
    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public com.volcengine.service.vod.model.business.VodMediaInfo.Builder addMediaInfoListBuilder(
        int index) {
      return getMediaInfoListFieldBuilder().addBuilder(
          index, com.volcengine.service.vod.model.business.VodMediaInfo.getDefaultInstance());
    }
    /**
     * <pre>
     *视频信息列表
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodMediaInfo MediaInfoList = 1;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.VodMediaInfo.Builder> 
         getMediaInfoListBuilderList() {
      return getMediaInfoListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodMediaInfo, com.volcengine.service.vod.model.business.VodMediaInfo.Builder, com.volcengine.service.vod.model.business.VodMediaInfoOrBuilder> 
        getMediaInfoListFieldBuilder() {
      if (mediaInfoListBuilder_ == null) {
        mediaInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.volcengine.service.vod.model.business.VodMediaInfo, com.volcengine.service.vod.model.business.VodMediaInfo.Builder, com.volcengine.service.vod.model.business.VodMediaInfoOrBuilder>(
                mediaInfoList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        mediaInfoList_ = null;
      }
      return mediaInfoListBuilder_;
    }

    private com.google.protobuf.LazyStringList notExistVids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureNotExistVidsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        notExistVids_ = new com.google.protobuf.LazyStringArrayList(notExistVids_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 2;</code>
     * @return A list containing the notExistVids.
     */
    public com.google.protobuf.ProtocolStringList
        getNotExistVidsList() {
      return notExistVids_.getUnmodifiableView();
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 2;</code>
     * @return The count of notExistVids.
     */
    public int getNotExistVidsCount() {
      return notExistVids_.size();
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 2;</code>
     * @param index The index of the element to return.
     * @return The notExistVids at the given index.
     */
    public java.lang.String getNotExistVids(int index) {
      return notExistVids_.get(index);
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the notExistVids at the given index.
     */
    public com.google.protobuf.ByteString
        getNotExistVidsBytes(int index) {
      return notExistVids_.getByteString(index);
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 2;</code>
     * @param index The index to set the value at.
     * @param value The notExistVids to set.
     * @return This builder for chaining.
     */
    public Builder setNotExistVids(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNotExistVidsIsMutable();
      notExistVids_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 2;</code>
     * @param value The notExistVids to add.
     * @return This builder for chaining.
     */
    public Builder addNotExistVids(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNotExistVidsIsMutable();
      notExistVids_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 2;</code>
     * @param values The notExistVids to add.
     * @return This builder for chaining.
     */
    public Builder addAllNotExistVids(
        java.lang.Iterable<java.lang.String> values) {
      ensureNotExistVidsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, notExistVids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNotExistVids() {
      notExistVids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *不存在的视频VID列表
     * </pre>
     *
     * <code>repeated string NotExistVids = 2;</code>
     * @param value The bytes of the notExistVids to add.
     * @return This builder for chaining.
     */
    public Builder addNotExistVidsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureNotExistVidsIsMutable();
      notExistVids_.add(value);
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodGetMediaInfosData)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodGetMediaInfosData)
  private static final com.volcengine.service.vod.model.business.VodGetMediaInfosData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodGetMediaInfosData();
  }

  public static com.volcengine.service.vod.model.business.VodGetMediaInfosData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodGetMediaInfosData>
      PARSER = new com.google.protobuf.AbstractParser<VodGetMediaInfosData>() {
    @java.lang.Override
    public VodGetMediaInfosData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodGetMediaInfosData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodGetMediaInfosData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodGetMediaInfosData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodGetMediaInfosData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

