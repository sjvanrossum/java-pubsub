/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

/**
 *
 *
 * <pre>
 * Request for the UpdateTopic method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.UpdateTopicRequest}
 */
public final class UpdateTopicRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.UpdateTopicRequest)
    UpdateTopicRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateTopicRequest.newBuilder() to construct.
  private UpdateTopicRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateTopicRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateTopicRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_UpdateTopicRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_UpdateTopicRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.UpdateTopicRequest.class,
            com.google.pubsub.v1.UpdateTopicRequest.Builder.class);
  }

  public static final int TOPIC_FIELD_NUMBER = 1;
  private com.google.pubsub.v1.Topic topic_;
  /**
   *
   *
   * <pre>
   * Required. The updated topic object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Topic topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the topic field is set.
   */
  @java.lang.Override
  public boolean hasTopic() {
    return topic_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The updated topic object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Topic topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The topic.
   */
  @java.lang.Override
  public com.google.pubsub.v1.Topic getTopic() {
    return topic_ == null ? com.google.pubsub.v1.Topic.getDefaultInstance() : topic_;
  }
  /**
   *
   *
   * <pre>
   * Required. The updated topic object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Topic topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.pubsub.v1.TopicOrBuilder getTopicOrBuilder() {
    return getTopic();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Indicates which fields in the provided topic to update. Must be
   * specified and non-empty. Note that if `update_mask` contains
   * "message_storage_policy" but the `message_storage_policy` is not set in
   * the `topic` provided above, then the updated value is determined by the
   * policy configured at the project or organization level.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Indicates which fields in the provided topic to update. Must be
   * specified and non-empty. Note that if `update_mask` contains
   * "message_storage_policy" but the `message_storage_policy` is not set in
   * the `topic` provided above, then the updated value is determined by the
   * policy configured at the project or organization level.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. Indicates which fields in the provided topic to update. Must be
   * specified and non-empty. Note that if `update_mask` contains
   * "message_storage_policy" but the `message_storage_policy` is not set in
   * the `topic` provided above, then the updated value is determined by the
   * policy configured at the project or organization level.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (topic_ != null) {
      output.writeMessage(1, getTopic());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (topic_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getTopic());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.pubsub.v1.UpdateTopicRequest)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.UpdateTopicRequest other = (com.google.pubsub.v1.UpdateTopicRequest) obj;

    if (hasTopic() != other.hasTopic()) return false;
    if (hasTopic()) {
      if (!getTopic().equals(other.getTopic())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasTopic()) {
      hash = (37 * hash) + TOPIC_FIELD_NUMBER;
      hash = (53 * hash) + getTopic().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.UpdateTopicRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.UpdateTopicRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.UpdateTopicRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.pubsub.v1.UpdateTopicRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request for the UpdateTopic method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.UpdateTopicRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.UpdateTopicRequest)
      com.google.pubsub.v1.UpdateTopicRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_UpdateTopicRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_UpdateTopicRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.UpdateTopicRequest.class,
              com.google.pubsub.v1.UpdateTopicRequest.Builder.class);
    }

    // Construct using com.google.pubsub.v1.UpdateTopicRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (topicBuilder_ == null) {
        topic_ = null;
      } else {
        topic_ = null;
        topicBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_UpdateTopicRequest_descriptor;
    }

    @java.lang.Override
    public com.google.pubsub.v1.UpdateTopicRequest getDefaultInstanceForType() {
      return com.google.pubsub.v1.UpdateTopicRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.pubsub.v1.UpdateTopicRequest build() {
      com.google.pubsub.v1.UpdateTopicRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.pubsub.v1.UpdateTopicRequest buildPartial() {
      com.google.pubsub.v1.UpdateTopicRequest result =
          new com.google.pubsub.v1.UpdateTopicRequest(this);
      if (topicBuilder_ == null) {
        result.topic_ = topic_;
      } else {
        result.topic_ = topicBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.pubsub.v1.UpdateTopicRequest) {
        return mergeFrom((com.google.pubsub.v1.UpdateTopicRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.UpdateTopicRequest other) {
      if (other == com.google.pubsub.v1.UpdateTopicRequest.getDefaultInstance()) return this;
      if (other.hasTopic()) {
        mergeTopic(other.getTopic());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getTopicFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.google.pubsub.v1.Topic topic_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.pubsub.v1.Topic,
            com.google.pubsub.v1.Topic.Builder,
            com.google.pubsub.v1.TopicOrBuilder>
        topicBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The updated topic object.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the topic field is set.
     */
    public boolean hasTopic() {
      return topicBuilder_ != null || topic_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated topic object.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The topic.
     */
    public com.google.pubsub.v1.Topic getTopic() {
      if (topicBuilder_ == null) {
        return topic_ == null ? com.google.pubsub.v1.Topic.getDefaultInstance() : topic_;
      } else {
        return topicBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The updated topic object.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTopic(com.google.pubsub.v1.Topic value) {
      if (topicBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        topic_ = value;
        onChanged();
      } else {
        topicBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated topic object.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTopic(com.google.pubsub.v1.Topic.Builder builderForValue) {
      if (topicBuilder_ == null) {
        topic_ = builderForValue.build();
        onChanged();
      } else {
        topicBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated topic object.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeTopic(com.google.pubsub.v1.Topic value) {
      if (topicBuilder_ == null) {
        if (topic_ != null) {
          topic_ = com.google.pubsub.v1.Topic.newBuilder(topic_).mergeFrom(value).buildPartial();
        } else {
          topic_ = value;
        }
        onChanged();
      } else {
        topicBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated topic object.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearTopic() {
      if (topicBuilder_ == null) {
        topic_ = null;
        onChanged();
      } else {
        topic_ = null;
        topicBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The updated topic object.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.pubsub.v1.Topic.Builder getTopicBuilder() {

      onChanged();
      return getTopicFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The updated topic object.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.pubsub.v1.TopicOrBuilder getTopicOrBuilder() {
      if (topicBuilder_ != null) {
        return topicBuilder_.getMessageOrBuilder();
      } else {
        return topic_ == null ? com.google.pubsub.v1.Topic.getDefaultInstance() : topic_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The updated topic object.
     * </pre>
     *
     * <code>.google.pubsub.v1.Topic topic = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.pubsub.v1.Topic,
            com.google.pubsub.v1.Topic.Builder,
            com.google.pubsub.v1.TopicOrBuilder>
        getTopicFieldBuilder() {
      if (topicBuilder_ == null) {
        topicBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.pubsub.v1.Topic,
                com.google.pubsub.v1.Topic.Builder,
                com.google.pubsub.v1.TopicOrBuilder>(getTopic(), getParentForChildren(), isClean());
        topic_ = null;
      }
      return topicBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Indicates which fields in the provided topic to update. Must be
     * specified and non-empty. Note that if `update_mask` contains
     * "message_storage_policy" but the `message_storage_policy` is not set in
     * the `topic` provided above, then the updated value is determined by the
     * policy configured at the project or organization level.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Indicates which fields in the provided topic to update. Must be
     * specified and non-empty. Note that if `update_mask` contains
     * "message_storage_policy" but the `message_storage_policy` is not set in
     * the `topic` provided above, then the updated value is determined by the
     * policy configured at the project or organization level.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Indicates which fields in the provided topic to update. Must be
     * specified and non-empty. Note that if `update_mask` contains
     * "message_storage_policy" but the `message_storage_policy` is not set in
     * the `topic` provided above, then the updated value is determined by the
     * policy configured at the project or organization level.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Indicates which fields in the provided topic to update. Must be
     * specified and non-empty. Note that if `update_mask` contains
     * "message_storage_policy" but the `message_storage_policy` is not set in
     * the `topic` provided above, then the updated value is determined by the
     * policy configured at the project or organization level.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Indicates which fields in the provided topic to update. Must be
     * specified and non-empty. Note that if `update_mask` contains
     * "message_storage_policy" but the `message_storage_policy` is not set in
     * the `topic` provided above, then the updated value is determined by the
     * policy configured at the project or organization level.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Indicates which fields in the provided topic to update. Must be
     * specified and non-empty. Note that if `update_mask` contains
     * "message_storage_policy" but the `message_storage_policy` is not set in
     * the `topic` provided above, then the updated value is determined by the
     * policy configured at the project or organization level.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Indicates which fields in the provided topic to update. Must be
     * specified and non-empty. Note that if `update_mask` contains
     * "message_storage_policy" but the `message_storage_policy` is not set in
     * the `topic` provided above, then the updated value is determined by the
     * policy configured at the project or organization level.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Indicates which fields in the provided topic to update. Must be
     * specified and non-empty. Note that if `update_mask` contains
     * "message_storage_policy" but the `message_storage_policy` is not set in
     * the `topic` provided above, then the updated value is determined by the
     * policy configured at the project or organization level.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Indicates which fields in the provided topic to update. Must be
     * specified and non-empty. Note that if `update_mask` contains
     * "message_storage_policy" but the `message_storage_policy` is not set in
     * the `topic` provided above, then the updated value is determined by the
     * policy configured at the project or organization level.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.UpdateTopicRequest)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.UpdateTopicRequest)
  private static final com.google.pubsub.v1.UpdateTopicRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.UpdateTopicRequest();
  }

  public static com.google.pubsub.v1.UpdateTopicRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateTopicRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateTopicRequest>() {
        @java.lang.Override
        public UpdateTopicRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<UpdateTopicRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateTopicRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.pubsub.v1.UpdateTopicRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
