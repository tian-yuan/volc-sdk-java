// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_workflow.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.WorkflowParams}
 */
public final class WorkflowParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.WorkflowParams)
    WorkflowParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WorkflowParams.newBuilder() to construct.
  private WorkflowParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WorkflowParams() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WorkflowParams();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WorkflowParams(
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
            com.volcengine.service.vod.model.business.OverrideParams.Builder subBuilder = null;
            if (overrideParams_ != null) {
              subBuilder = overrideParams_.toBuilder();
            }
            overrideParams_ = input.readMessage(com.volcengine.service.vod.model.business.OverrideParams.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(overrideParams_);
              overrideParams_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              condition_ = com.google.protobuf.MapField.newMapField(
                  ConditionDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.Boolean>
            condition__ = input.readMessage(
                ConditionDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            condition_.getMutableMap().put(
                condition__.getKey(), condition__.getValue());
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
    return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_WorkflowParams_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetCondition();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_WorkflowParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.WorkflowParams.class, com.volcengine.service.vod.model.business.WorkflowParams.Builder.class);
  }

  public static final int OVERRIDEPARAMS_FIELD_NUMBER = 1;
  private com.volcengine.service.vod.model.business.OverrideParams overrideParams_;
  /**
   * <pre>
   * 覆盖参数
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.OverrideParams OverrideParams = 1;</code>
   * @return Whether the overrideParams field is set.
   */
  @java.lang.Override
  public boolean hasOverrideParams() {
    return overrideParams_ != null;
  }
  /**
   * <pre>
   * 覆盖参数
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.OverrideParams OverrideParams = 1;</code>
   * @return The overrideParams.
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.OverrideParams getOverrideParams() {
    return overrideParams_ == null ? com.volcengine.service.vod.model.business.OverrideParams.getDefaultInstance() : overrideParams_;
  }
  /**
   * <pre>
   * 覆盖参数
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.OverrideParams OverrideParams = 1;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.OverrideParamsOrBuilder getOverrideParamsOrBuilder() {
    return getOverrideParams();
  }

  public static final int CONDITION_FIELD_NUMBER = 2;
  private static final class ConditionDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Boolean> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Boolean>newDefaultInstance(
                com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_WorkflowParams_ConditionEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.BOOL,
                false);
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Boolean> condition_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Boolean>
  internalGetCondition() {
    if (condition_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ConditionDefaultEntryHolder.defaultEntry);
    }
    return condition_;
  }

  public int getConditionCount() {
    return internalGetCondition().getMap().size();
  }
  /**
   * <pre>
   * 条件变量
   * </pre>
   *
   * <code>map&lt;string, bool&gt; Condition = 2;</code>
   */

  @java.lang.Override
  public boolean containsCondition(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetCondition().getMap().containsKey(key);
  }
  /**
   * Use {@link #getConditionMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Boolean> getCondition() {
    return getConditionMap();
  }
  /**
   * <pre>
   * 条件变量
   * </pre>
   *
   * <code>map&lt;string, bool&gt; Condition = 2;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.Boolean> getConditionMap() {
    return internalGetCondition().getMap();
  }
  /**
   * <pre>
   * 条件变量
   * </pre>
   *
   * <code>map&lt;string, bool&gt; Condition = 2;</code>
   */
  @java.lang.Override

  public boolean getConditionOrDefault(
      java.lang.String key,
      boolean defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Boolean> map =
        internalGetCondition().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * 条件变量
   * </pre>
   *
   * <code>map&lt;string, bool&gt; Condition = 2;</code>
   */
  @java.lang.Override

  public boolean getConditionOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.Boolean> map =
        internalGetCondition().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (overrideParams_ != null) {
      output.writeMessage(1, getOverrideParams());
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetCondition(),
        ConditionDefaultEntryHolder.defaultEntry,
        2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (overrideParams_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getOverrideParams());
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.Boolean> entry
         : internalGetCondition().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Boolean>
      condition__ = ConditionDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, condition__);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.WorkflowParams)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.WorkflowParams other = (com.volcengine.service.vod.model.business.WorkflowParams) obj;

    if (hasOverrideParams() != other.hasOverrideParams()) return false;
    if (hasOverrideParams()) {
      if (!getOverrideParams()
          .equals(other.getOverrideParams())) return false;
    }
    if (!internalGetCondition().equals(
        other.internalGetCondition())) return false;
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
    if (hasOverrideParams()) {
      hash = (37 * hash) + OVERRIDEPARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getOverrideParams().hashCode();
    }
    if (!internalGetCondition().getMap().isEmpty()) {
      hash = (37 * hash) + CONDITION_FIELD_NUMBER;
      hash = (53 * hash) + internalGetCondition().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.WorkflowParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.WorkflowParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.WorkflowParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.WorkflowParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.WorkflowParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.WorkflowParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.WorkflowParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.WorkflowParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.WorkflowParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.WorkflowParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.WorkflowParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.WorkflowParams parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.WorkflowParams prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.WorkflowParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.WorkflowParams)
      com.volcengine.service.vod.model.business.WorkflowParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_WorkflowParams_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetCondition();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableCondition();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_WorkflowParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.WorkflowParams.class, com.volcengine.service.vod.model.business.WorkflowParams.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.WorkflowParams.newBuilder()
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
      if (overrideParamsBuilder_ == null) {
        overrideParams_ = null;
      } else {
        overrideParams_ = null;
        overrideParamsBuilder_ = null;
      }
      internalGetMutableCondition().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_WorkflowParams_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.WorkflowParams getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.WorkflowParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.WorkflowParams build() {
      com.volcengine.service.vod.model.business.WorkflowParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.WorkflowParams buildPartial() {
      com.volcengine.service.vod.model.business.WorkflowParams result = new com.volcengine.service.vod.model.business.WorkflowParams(this);
      int from_bitField0_ = bitField0_;
      if (overrideParamsBuilder_ == null) {
        result.overrideParams_ = overrideParams_;
      } else {
        result.overrideParams_ = overrideParamsBuilder_.build();
      }
      result.condition_ = internalGetCondition();
      result.condition_.makeImmutable();
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
      if (other instanceof com.volcengine.service.vod.model.business.WorkflowParams) {
        return mergeFrom((com.volcengine.service.vod.model.business.WorkflowParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.WorkflowParams other) {
      if (other == com.volcengine.service.vod.model.business.WorkflowParams.getDefaultInstance()) return this;
      if (other.hasOverrideParams()) {
        mergeOverrideParams(other.getOverrideParams());
      }
      internalGetMutableCondition().mergeFrom(
          other.internalGetCondition());
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
      com.volcengine.service.vod.model.business.WorkflowParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.WorkflowParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.volcengine.service.vod.model.business.OverrideParams overrideParams_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.OverrideParams, com.volcengine.service.vod.model.business.OverrideParams.Builder, com.volcengine.service.vod.model.business.OverrideParamsOrBuilder> overrideParamsBuilder_;
    /**
     * <pre>
     * 覆盖参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.OverrideParams OverrideParams = 1;</code>
     * @return Whether the overrideParams field is set.
     */
    public boolean hasOverrideParams() {
      return overrideParamsBuilder_ != null || overrideParams_ != null;
    }
    /**
     * <pre>
     * 覆盖参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.OverrideParams OverrideParams = 1;</code>
     * @return The overrideParams.
     */
    public com.volcengine.service.vod.model.business.OverrideParams getOverrideParams() {
      if (overrideParamsBuilder_ == null) {
        return overrideParams_ == null ? com.volcengine.service.vod.model.business.OverrideParams.getDefaultInstance() : overrideParams_;
      } else {
        return overrideParamsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * 覆盖参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.OverrideParams OverrideParams = 1;</code>
     */
    public Builder setOverrideParams(com.volcengine.service.vod.model.business.OverrideParams value) {
      if (overrideParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        overrideParams_ = value;
        onChanged();
      } else {
        overrideParamsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * 覆盖参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.OverrideParams OverrideParams = 1;</code>
     */
    public Builder setOverrideParams(
        com.volcengine.service.vod.model.business.OverrideParams.Builder builderForValue) {
      if (overrideParamsBuilder_ == null) {
        overrideParams_ = builderForValue.build();
        onChanged();
      } else {
        overrideParamsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * 覆盖参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.OverrideParams OverrideParams = 1;</code>
     */
    public Builder mergeOverrideParams(com.volcengine.service.vod.model.business.OverrideParams value) {
      if (overrideParamsBuilder_ == null) {
        if (overrideParams_ != null) {
          overrideParams_ =
            com.volcengine.service.vod.model.business.OverrideParams.newBuilder(overrideParams_).mergeFrom(value).buildPartial();
        } else {
          overrideParams_ = value;
        }
        onChanged();
      } else {
        overrideParamsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * 覆盖参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.OverrideParams OverrideParams = 1;</code>
     */
    public Builder clearOverrideParams() {
      if (overrideParamsBuilder_ == null) {
        overrideParams_ = null;
        onChanged();
      } else {
        overrideParams_ = null;
        overrideParamsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * 覆盖参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.OverrideParams OverrideParams = 1;</code>
     */
    public com.volcengine.service.vod.model.business.OverrideParams.Builder getOverrideParamsBuilder() {
      
      onChanged();
      return getOverrideParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * 覆盖参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.OverrideParams OverrideParams = 1;</code>
     */
    public com.volcengine.service.vod.model.business.OverrideParamsOrBuilder getOverrideParamsOrBuilder() {
      if (overrideParamsBuilder_ != null) {
        return overrideParamsBuilder_.getMessageOrBuilder();
      } else {
        return overrideParams_ == null ?
            com.volcengine.service.vod.model.business.OverrideParams.getDefaultInstance() : overrideParams_;
      }
    }
    /**
     * <pre>
     * 覆盖参数
     * </pre>
     *
     * <code>.Volcengine.Vod.Models.Business.OverrideParams OverrideParams = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.OverrideParams, com.volcengine.service.vod.model.business.OverrideParams.Builder, com.volcengine.service.vod.model.business.OverrideParamsOrBuilder> 
        getOverrideParamsFieldBuilder() {
      if (overrideParamsBuilder_ == null) {
        overrideParamsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.vod.model.business.OverrideParams, com.volcengine.service.vod.model.business.OverrideParams.Builder, com.volcengine.service.vod.model.business.OverrideParamsOrBuilder>(
                getOverrideParams(),
                getParentForChildren(),
                isClean());
        overrideParams_ = null;
      }
      return overrideParamsBuilder_;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Boolean> condition_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Boolean>
    internalGetCondition() {
      if (condition_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ConditionDefaultEntryHolder.defaultEntry);
      }
      return condition_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Boolean>
    internalGetMutableCondition() {
      onChanged();;
      if (condition_ == null) {
        condition_ = com.google.protobuf.MapField.newMapField(
            ConditionDefaultEntryHolder.defaultEntry);
      }
      if (!condition_.isMutable()) {
        condition_ = condition_.copy();
      }
      return condition_;
    }

    public int getConditionCount() {
      return internalGetCondition().getMap().size();
    }
    /**
     * <pre>
     * 条件变量
     * </pre>
     *
     * <code>map&lt;string, bool&gt; Condition = 2;</code>
     */

    @java.lang.Override
    public boolean containsCondition(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetCondition().getMap().containsKey(key);
    }
    /**
     * Use {@link #getConditionMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Boolean> getCondition() {
      return getConditionMap();
    }
    /**
     * <pre>
     * 条件变量
     * </pre>
     *
     * <code>map&lt;string, bool&gt; Condition = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.Boolean> getConditionMap() {
      return internalGetCondition().getMap();
    }
    /**
     * <pre>
     * 条件变量
     * </pre>
     *
     * <code>map&lt;string, bool&gt; Condition = 2;</code>
     */
    @java.lang.Override

    public boolean getConditionOrDefault(
        java.lang.String key,
        boolean defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Boolean> map =
          internalGetCondition().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * 条件变量
     * </pre>
     *
     * <code>map&lt;string, bool&gt; Condition = 2;</code>
     */
    @java.lang.Override

    public boolean getConditionOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.Boolean> map =
          internalGetCondition().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearCondition() {
      internalGetMutableCondition().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * 条件变量
     * </pre>
     *
     * <code>map&lt;string, bool&gt; Condition = 2;</code>
     */

    public Builder removeCondition(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableCondition().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Boolean>
    getMutableCondition() {
      return internalGetMutableCondition().getMutableMap();
    }
    /**
     * <pre>
     * 条件变量
     * </pre>
     *
     * <code>map&lt;string, bool&gt; Condition = 2;</code>
     */
    public Builder putCondition(
        java.lang.String key,
        boolean value) {
      if (key == null) { throw new NullPointerException("map key"); }
      
      internalGetMutableCondition().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * 条件变量
     * </pre>
     *
     * <code>map&lt;string, bool&gt; Condition = 2;</code>
     */

    public Builder putAllCondition(
        java.util.Map<java.lang.String, java.lang.Boolean> values) {
      internalGetMutableCondition().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.WorkflowParams)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.WorkflowParams)
  private static final com.volcengine.service.vod.model.business.WorkflowParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.WorkflowParams();
  }

  public static com.volcengine.service.vod.model.business.WorkflowParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkflowParams>
      PARSER = new com.google.protobuf.AbstractParser<WorkflowParams>() {
    @java.lang.Override
    public WorkflowParams parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WorkflowParams(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WorkflowParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkflowParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.WorkflowParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

