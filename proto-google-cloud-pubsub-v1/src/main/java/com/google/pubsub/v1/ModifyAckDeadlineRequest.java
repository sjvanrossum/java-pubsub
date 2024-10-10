/*
 * Copyright 2024 Google LLC
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

// Protobuf Java Version: 3.25.5
package com.google.pubsub.v1;

/**
 *
 *
 * <pre>
 * Request for the ModifyAckDeadline method.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.ModifyAckDeadlineRequest}
 */
public final class ModifyAckDeadlineRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.ModifyAckDeadlineRequest)
    ModifyAckDeadlineRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ModifyAckDeadlineRequest.newBuilder() to construct.
  private ModifyAckDeadlineRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ModifyAckDeadlineRequest() {
    subscription_ = "";
    ackIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ModifyAckDeadlineRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_ModifyAckDeadlineRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_ModifyAckDeadlineRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.ModifyAckDeadlineRequest.class,
            com.google.pubsub.v1.ModifyAckDeadlineRequest.Builder.class);
  }

  public static final int SUBSCRIPTION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object subscription_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the subscription.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>
   * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The subscription.
   */
  @java.lang.Override
  public java.lang.String getSubscription() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subscription_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the subscription.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>
   * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for subscription.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSubscriptionBytes() {
    java.lang.Object ref = subscription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      subscription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACK_IDS_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList ackIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Required. List of acknowledgment IDs.
   * </pre>
   *
   * <code>repeated string ack_ids = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the ackIds.
   */
  public com.google.protobuf.ProtocolStringList getAckIdsList() {
    return ackIds_;
  }
  /**
   *
   *
   * <pre>
   * Required. List of acknowledgment IDs.
   * </pre>
   *
   * <code>repeated string ack_ids = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of ackIds.
   */
  public int getAckIdsCount() {
    return ackIds_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. List of acknowledgment IDs.
   * </pre>
   *
   * <code>repeated string ack_ids = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The ackIds at the given index.
   */
  public java.lang.String getAckIds(int index) {
    return ackIds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. List of acknowledgment IDs.
   * </pre>
   *
   * <code>repeated string ack_ids = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the ackIds at the given index.
   */
  public com.google.protobuf.ByteString getAckIdsBytes(int index) {
    return ackIds_.getByteString(index);
  }

  public static final int ACK_DEADLINE_SECONDS_FIELD_NUMBER = 3;
  private int ackDeadlineSeconds_ = 0;
  /**
   *
   *
   * <pre>
   * Required. The new ack deadline with respect to the time this request was
   * sent to the Pub/Sub system. For example, if the value is 10, the new ack
   * deadline will expire 10 seconds after the `ModifyAckDeadline` call was
   * made. Specifying zero might immediately make the message available for
   * delivery to another subscriber client. This typically results in an
   * increase in the rate of message redeliveries (that is, duplicates).
   * The minimum deadline you can specify is 0 seconds.
   * The maximum deadline you can specify in a single request is 600 seconds
   * (10 minutes).
   * </pre>
   *
   * <code>int32 ack_deadline_seconds = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The ackDeadlineSeconds.
   */
  @java.lang.Override
  public int getAckDeadlineSeconds() {
    return ackDeadlineSeconds_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscription_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, subscription_);
    }
    if (ackDeadlineSeconds_ != 0) {
      output.writeInt32(3, ackDeadlineSeconds_);
    }
    for (int i = 0; i < ackIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, ackIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subscription_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, subscription_);
    }
    if (ackDeadlineSeconds_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, ackDeadlineSeconds_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < ackIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(ackIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAckIdsList().size();
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
    if (!(obj instanceof com.google.pubsub.v1.ModifyAckDeadlineRequest)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.ModifyAckDeadlineRequest other =
        (com.google.pubsub.v1.ModifyAckDeadlineRequest) obj;

    if (!getSubscription().equals(other.getSubscription())) return false;
    if (!getAckIdsList().equals(other.getAckIdsList())) return false;
    if (getAckDeadlineSeconds() != other.getAckDeadlineSeconds()) return false;
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
    hash = (37 * hash) + SUBSCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getSubscription().hashCode();
    if (getAckIdsCount() > 0) {
      hash = (37 * hash) + ACK_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getAckIdsList().hashCode();
    }
    hash = (37 * hash) + ACK_DEADLINE_SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + getAckDeadlineSeconds();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest parseFrom(
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

  public static Builder newBuilder(com.google.pubsub.v1.ModifyAckDeadlineRequest prototype) {
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
   * Request for the ModifyAckDeadline method.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.ModifyAckDeadlineRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.ModifyAckDeadlineRequest)
      com.google.pubsub.v1.ModifyAckDeadlineRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ModifyAckDeadlineRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ModifyAckDeadlineRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.ModifyAckDeadlineRequest.class,
              com.google.pubsub.v1.ModifyAckDeadlineRequest.Builder.class);
    }

    // Construct using com.google.pubsub.v1.ModifyAckDeadlineRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      subscription_ = "";
      ackIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      ackDeadlineSeconds_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_ModifyAckDeadlineRequest_descriptor;
    }

    @java.lang.Override
    public com.google.pubsub.v1.ModifyAckDeadlineRequest getDefaultInstanceForType() {
      return com.google.pubsub.v1.ModifyAckDeadlineRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.pubsub.v1.ModifyAckDeadlineRequest build() {
      com.google.pubsub.v1.ModifyAckDeadlineRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.pubsub.v1.ModifyAckDeadlineRequest buildPartial() {
      com.google.pubsub.v1.ModifyAckDeadlineRequest result =
          new com.google.pubsub.v1.ModifyAckDeadlineRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.pubsub.v1.ModifyAckDeadlineRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.subscription_ = subscription_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        ackIds_.makeImmutable();
        result.ackIds_ = ackIds_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.ackDeadlineSeconds_ = ackDeadlineSeconds_;
      }
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
      if (other instanceof com.google.pubsub.v1.ModifyAckDeadlineRequest) {
        return mergeFrom((com.google.pubsub.v1.ModifyAckDeadlineRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.ModifyAckDeadlineRequest other) {
      if (other == com.google.pubsub.v1.ModifyAckDeadlineRequest.getDefaultInstance()) return this;
      if (!other.getSubscription().isEmpty()) {
        subscription_ = other.subscription_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.ackIds_.isEmpty()) {
        if (ackIds_.isEmpty()) {
          ackIds_ = other.ackIds_;
          bitField0_ |= 0x00000002;
        } else {
          ensureAckIdsIsMutable();
          ackIds_.addAll(other.ackIds_);
        }
        onChanged();
      }
      if (other.getAckDeadlineSeconds() != 0) {
        setAckDeadlineSeconds(other.getAckDeadlineSeconds());
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
                subscription_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 24:
              {
                ackDeadlineSeconds_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 34:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureAckIdsIsMutable();
                ackIds_.add(s);
                break;
              } // case 34
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

    private int bitField0_;

    private java.lang.Object subscription_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the subscription.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>
     * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The subscription.
     */
    public java.lang.String getSubscription() {
      java.lang.Object ref = subscription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subscription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the subscription.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>
     * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for subscription.
     */
    public com.google.protobuf.ByteString getSubscriptionBytes() {
      java.lang.Object ref = subscription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subscription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the subscription.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>
     * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The subscription to set.
     * @return This builder for chaining.
     */
    public Builder setSubscription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      subscription_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the subscription.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>
     * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSubscription() {
      subscription_ = getDefaultInstance().getSubscription();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the subscription.
     * Format is `projects/{project}/subscriptions/{sub}`.
     * </pre>
     *
     * <code>
     * string subscription = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for subscription to set.
     * @return This builder for chaining.
     */
    public Builder setSubscriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      subscription_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList ackIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureAckIdsIsMutable() {
      if (!ackIds_.isModifiable()) {
        ackIds_ = new com.google.protobuf.LazyStringArrayList(ackIds_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * Required. List of acknowledgment IDs.
     * </pre>
     *
     * <code>repeated string ack_ids = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return A list containing the ackIds.
     */
    public com.google.protobuf.ProtocolStringList getAckIdsList() {
      ackIds_.makeImmutable();
      return ackIds_;
    }
    /**
     *
     *
     * <pre>
     * Required. List of acknowledgment IDs.
     * </pre>
     *
     * <code>repeated string ack_ids = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The count of ackIds.
     */
    public int getAckIdsCount() {
      return ackIds_.size();
    }
    /**
     *
     *
     * <pre>
     * Required. List of acknowledgment IDs.
     * </pre>
     *
     * <code>repeated string ack_ids = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index of the element to return.
     * @return The ackIds at the given index.
     */
    public java.lang.String getAckIds(int index) {
      return ackIds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Required. List of acknowledgment IDs.
     * </pre>
     *
     * <code>repeated string ack_ids = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the ackIds at the given index.
     */
    public com.google.protobuf.ByteString getAckIdsBytes(int index) {
      return ackIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Required. List of acknowledgment IDs.
     * </pre>
     *
     * <code>repeated string ack_ids = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index to set the value at.
     * @param value The ackIds to set.
     * @return This builder for chaining.
     */
    public Builder setAckIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAckIdsIsMutable();
      ackIds_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of acknowledgment IDs.
     * </pre>
     *
     * <code>repeated string ack_ids = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The ackIds to add.
     * @return This builder for chaining.
     */
    public Builder addAckIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAckIdsIsMutable();
      ackIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of acknowledgment IDs.
     * </pre>
     *
     * <code>repeated string ack_ids = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param values The ackIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllAckIds(java.lang.Iterable<java.lang.String> values) {
      ensureAckIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, ackIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of acknowledgment IDs.
     * </pre>
     *
     * <code>repeated string ack_ids = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAckIds() {
      ackIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. List of acknowledgment IDs.
     * </pre>
     *
     * <code>repeated string ack_ids = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes of the ackIds to add.
     * @return This builder for chaining.
     */
    public Builder addAckIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureAckIdsIsMutable();
      ackIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int ackDeadlineSeconds_;
    /**
     *
     *
     * <pre>
     * Required. The new ack deadline with respect to the time this request was
     * sent to the Pub/Sub system. For example, if the value is 10, the new ack
     * deadline will expire 10 seconds after the `ModifyAckDeadline` call was
     * made. Specifying zero might immediately make the message available for
     * delivery to another subscriber client. This typically results in an
     * increase in the rate of message redeliveries (that is, duplicates).
     * The minimum deadline you can specify is 0 seconds.
     * The maximum deadline you can specify in a single request is 600 seconds
     * (10 minutes).
     * </pre>
     *
     * <code>int32 ack_deadline_seconds = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The ackDeadlineSeconds.
     */
    @java.lang.Override
    public int getAckDeadlineSeconds() {
      return ackDeadlineSeconds_;
    }
    /**
     *
     *
     * <pre>
     * Required. The new ack deadline with respect to the time this request was
     * sent to the Pub/Sub system. For example, if the value is 10, the new ack
     * deadline will expire 10 seconds after the `ModifyAckDeadline` call was
     * made. Specifying zero might immediately make the message available for
     * delivery to another subscriber client. This typically results in an
     * increase in the rate of message redeliveries (that is, duplicates).
     * The minimum deadline you can specify is 0 seconds.
     * The maximum deadline you can specify in a single request is 600 seconds
     * (10 minutes).
     * </pre>
     *
     * <code>int32 ack_deadline_seconds = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The ackDeadlineSeconds to set.
     * @return This builder for chaining.
     */
    public Builder setAckDeadlineSeconds(int value) {

      ackDeadlineSeconds_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new ack deadline with respect to the time this request was
     * sent to the Pub/Sub system. For example, if the value is 10, the new ack
     * deadline will expire 10 seconds after the `ModifyAckDeadline` call was
     * made. Specifying zero might immediately make the message available for
     * delivery to another subscriber client. This typically results in an
     * increase in the rate of message redeliveries (that is, duplicates).
     * The minimum deadline you can specify is 0 seconds.
     * The maximum deadline you can specify in a single request is 600 seconds
     * (10 minutes).
     * </pre>
     *
     * <code>int32 ack_deadline_seconds = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAckDeadlineSeconds() {
      bitField0_ = (bitField0_ & ~0x00000004);
      ackDeadlineSeconds_ = 0;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.ModifyAckDeadlineRequest)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.ModifyAckDeadlineRequest)
  private static final com.google.pubsub.v1.ModifyAckDeadlineRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.ModifyAckDeadlineRequest();
  }

  public static com.google.pubsub.v1.ModifyAckDeadlineRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModifyAckDeadlineRequest> PARSER =
      new com.google.protobuf.AbstractParser<ModifyAckDeadlineRequest>() {
        @java.lang.Override
        public ModifyAckDeadlineRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ModifyAckDeadlineRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModifyAckDeadlineRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.pubsub.v1.ModifyAckDeadlineRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
