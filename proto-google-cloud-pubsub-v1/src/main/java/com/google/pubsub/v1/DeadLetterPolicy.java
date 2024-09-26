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
 * Dead lettering is done on a best effort basis. The same message might be
 * dead lettered multiple times.
 *
 * If validation on any of the fields fails at subscription creation/updation,
 * the create/update subscription request will fail.
 * </pre>
 *
 * Protobuf type {@code google.pubsub.v1.DeadLetterPolicy}
 */
public final class DeadLetterPolicy extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.pubsub.v1.DeadLetterPolicy)
    DeadLetterPolicyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DeadLetterPolicy.newBuilder() to construct.
  private DeadLetterPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeadLetterPolicy() {
    deadLetterTopic_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeadLetterPolicy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_DeadLetterPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.pubsub.v1.PubsubProto
        .internal_static_google_pubsub_v1_DeadLetterPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.pubsub.v1.DeadLetterPolicy.class,
            com.google.pubsub.v1.DeadLetterPolicy.Builder.class);
  }

  public static final int DEAD_LETTER_TOPIC_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object deadLetterTopic_ = "";
  /**
   *
   *
   * <pre>
   * Optional. The name of the topic to which dead letter messages should be
   * published. Format is `projects/{project}/topics/{topic}`.The Pub/Sub
   * service account associated with the enclosing subscription's parent project
   * (i.e., service-{project_number}&#64;gcp-sa-pubsub.iam.gserviceaccount.com) must
   * have permission to Publish() to this topic.
   *
   * The operation will fail if the topic does not exist.
   * Users should ensure that there is a subscription attached to this topic
   * since messages published to a topic with no subscriptions are lost.
   * </pre>
   *
   * <code>string dead_letter_topic = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The deadLetterTopic.
   */
  @java.lang.Override
  public java.lang.String getDeadLetterTopic() {
    java.lang.Object ref = deadLetterTopic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deadLetterTopic_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The name of the topic to which dead letter messages should be
   * published. Format is `projects/{project}/topics/{topic}`.The Pub/Sub
   * service account associated with the enclosing subscription's parent project
   * (i.e., service-{project_number}&#64;gcp-sa-pubsub.iam.gserviceaccount.com) must
   * have permission to Publish() to this topic.
   *
   * The operation will fail if the topic does not exist.
   * Users should ensure that there is a subscription attached to this topic
   * since messages published to a topic with no subscriptions are lost.
   * </pre>
   *
   * <code>string dead_letter_topic = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for deadLetterTopic.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDeadLetterTopicBytes() {
    java.lang.Object ref = deadLetterTopic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      deadLetterTopic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAX_DELIVERY_ATTEMPTS_FIELD_NUMBER = 2;
  private int maxDeliveryAttempts_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. The maximum number of delivery attempts for any message. The
   * value must be between 5 and 100.
   *
   * The number of delivery attempts is defined as 1 + (the sum of number of
   * NACKs and number of times the acknowledgement deadline has been exceeded
   * for the message).
   *
   * A NACK is any call to ModifyAckDeadline with a 0 deadline. Note that
   * client libraries may automatically extend ack_deadlines.
   *
   * This field will be honored on a best effort basis.
   *
   * If this parameter is 0, a default value of 5 is used.
   * </pre>
   *
   * <code>int32 max_delivery_attempts = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxDeliveryAttempts.
   */
  @java.lang.Override
  public int getMaxDeliveryAttempts() {
    return maxDeliveryAttempts_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deadLetterTopic_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, deadLetterTopic_);
    }
    if (maxDeliveryAttempts_ != 0) {
      output.writeInt32(2, maxDeliveryAttempts_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deadLetterTopic_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, deadLetterTopic_);
    }
    if (maxDeliveryAttempts_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, maxDeliveryAttempts_);
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
    if (!(obj instanceof com.google.pubsub.v1.DeadLetterPolicy)) {
      return super.equals(obj);
    }
    com.google.pubsub.v1.DeadLetterPolicy other = (com.google.pubsub.v1.DeadLetterPolicy) obj;

    if (!getDeadLetterTopic().equals(other.getDeadLetterTopic())) return false;
    if (getMaxDeliveryAttempts() != other.getMaxDeliveryAttempts()) return false;
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
    hash = (37 * hash) + DEAD_LETTER_TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getDeadLetterTopic().hashCode();
    hash = (37 * hash) + MAX_DELIVERY_ATTEMPTS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxDeliveryAttempts();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.pubsub.v1.DeadLetterPolicy parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.DeadLetterPolicy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.DeadLetterPolicy parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.DeadLetterPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.DeadLetterPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.pubsub.v1.DeadLetterPolicy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.pubsub.v1.DeadLetterPolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.DeadLetterPolicy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.DeadLetterPolicy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.DeadLetterPolicy parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.pubsub.v1.DeadLetterPolicy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.pubsub.v1.DeadLetterPolicy parseFrom(
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

  public static Builder newBuilder(com.google.pubsub.v1.DeadLetterPolicy prototype) {
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
   * Dead lettering is done on a best effort basis. The same message might be
   * dead lettered multiple times.
   *
   * If validation on any of the fields fails at subscription creation/updation,
   * the create/update subscription request will fail.
   * </pre>
   *
   * Protobuf type {@code google.pubsub.v1.DeadLetterPolicy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.pubsub.v1.DeadLetterPolicy)
      com.google.pubsub.v1.DeadLetterPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_DeadLetterPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_DeadLetterPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.pubsub.v1.DeadLetterPolicy.class,
              com.google.pubsub.v1.DeadLetterPolicy.Builder.class);
    }

    // Construct using com.google.pubsub.v1.DeadLetterPolicy.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      deadLetterTopic_ = "";
      maxDeliveryAttempts_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.pubsub.v1.PubsubProto
          .internal_static_google_pubsub_v1_DeadLetterPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.pubsub.v1.DeadLetterPolicy getDefaultInstanceForType() {
      return com.google.pubsub.v1.DeadLetterPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.pubsub.v1.DeadLetterPolicy build() {
      com.google.pubsub.v1.DeadLetterPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.pubsub.v1.DeadLetterPolicy buildPartial() {
      com.google.pubsub.v1.DeadLetterPolicy result =
          new com.google.pubsub.v1.DeadLetterPolicy(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.pubsub.v1.DeadLetterPolicy result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deadLetterTopic_ = deadLetterTopic_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxDeliveryAttempts_ = maxDeliveryAttempts_;
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
      if (other instanceof com.google.pubsub.v1.DeadLetterPolicy) {
        return mergeFrom((com.google.pubsub.v1.DeadLetterPolicy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.pubsub.v1.DeadLetterPolicy other) {
      if (other == com.google.pubsub.v1.DeadLetterPolicy.getDefaultInstance()) return this;
      if (!other.getDeadLetterTopic().isEmpty()) {
        deadLetterTopic_ = other.deadLetterTopic_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getMaxDeliveryAttempts() != 0) {
        setMaxDeliveryAttempts(other.getMaxDeliveryAttempts());
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
                deadLetterTopic_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                maxDeliveryAttempts_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private java.lang.Object deadLetterTopic_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The name of the topic to which dead letter messages should be
     * published. Format is `projects/{project}/topics/{topic}`.The Pub/Sub
     * service account associated with the enclosing subscription's parent project
     * (i.e., service-{project_number}&#64;gcp-sa-pubsub.iam.gserviceaccount.com) must
     * have permission to Publish() to this topic.
     *
     * The operation will fail if the topic does not exist.
     * Users should ensure that there is a subscription attached to this topic
     * since messages published to a topic with no subscriptions are lost.
     * </pre>
     *
     * <code>string dead_letter_topic = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The deadLetterTopic.
     */
    public java.lang.String getDeadLetterTopic() {
      java.lang.Object ref = deadLetterTopic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deadLetterTopic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The name of the topic to which dead letter messages should be
     * published. Format is `projects/{project}/topics/{topic}`.The Pub/Sub
     * service account associated with the enclosing subscription's parent project
     * (i.e., service-{project_number}&#64;gcp-sa-pubsub.iam.gserviceaccount.com) must
     * have permission to Publish() to this topic.
     *
     * The operation will fail if the topic does not exist.
     * Users should ensure that there is a subscription attached to this topic
     * since messages published to a topic with no subscriptions are lost.
     * </pre>
     *
     * <code>string dead_letter_topic = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for deadLetterTopic.
     */
    public com.google.protobuf.ByteString getDeadLetterTopicBytes() {
      java.lang.Object ref = deadLetterTopic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        deadLetterTopic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The name of the topic to which dead letter messages should be
     * published. Format is `projects/{project}/topics/{topic}`.The Pub/Sub
     * service account associated with the enclosing subscription's parent project
     * (i.e., service-{project_number}&#64;gcp-sa-pubsub.iam.gserviceaccount.com) must
     * have permission to Publish() to this topic.
     *
     * The operation will fail if the topic does not exist.
     * Users should ensure that there is a subscription attached to this topic
     * since messages published to a topic with no subscriptions are lost.
     * </pre>
     *
     * <code>string dead_letter_topic = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The deadLetterTopic to set.
     * @return This builder for chaining.
     */
    public Builder setDeadLetterTopic(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      deadLetterTopic_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The name of the topic to which dead letter messages should be
     * published. Format is `projects/{project}/topics/{topic}`.The Pub/Sub
     * service account associated with the enclosing subscription's parent project
     * (i.e., service-{project_number}&#64;gcp-sa-pubsub.iam.gserviceaccount.com) must
     * have permission to Publish() to this topic.
     *
     * The operation will fail if the topic does not exist.
     * Users should ensure that there is a subscription attached to this topic
     * since messages published to a topic with no subscriptions are lost.
     * </pre>
     *
     * <code>string dead_letter_topic = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDeadLetterTopic() {
      deadLetterTopic_ = getDefaultInstance().getDeadLetterTopic();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The name of the topic to which dead letter messages should be
     * published. Format is `projects/{project}/topics/{topic}`.The Pub/Sub
     * service account associated with the enclosing subscription's parent project
     * (i.e., service-{project_number}&#64;gcp-sa-pubsub.iam.gserviceaccount.com) must
     * have permission to Publish() to this topic.
     *
     * The operation will fail if the topic does not exist.
     * Users should ensure that there is a subscription attached to this topic
     * since messages published to a topic with no subscriptions are lost.
     * </pre>
     *
     * <code>string dead_letter_topic = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for deadLetterTopic to set.
     * @return This builder for chaining.
     */
    public Builder setDeadLetterTopicBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      deadLetterTopic_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int maxDeliveryAttempts_;
    /**
     *
     *
     * <pre>
     * Optional. The maximum number of delivery attempts for any message. The
     * value must be between 5 and 100.
     *
     * The number of delivery attempts is defined as 1 + (the sum of number of
     * NACKs and number of times the acknowledgement deadline has been exceeded
     * for the message).
     *
     * A NACK is any call to ModifyAckDeadline with a 0 deadline. Note that
     * client libraries may automatically extend ack_deadlines.
     *
     * This field will be honored on a best effort basis.
     *
     * If this parameter is 0, a default value of 5 is used.
     * </pre>
     *
     * <code>int32 max_delivery_attempts = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The maxDeliveryAttempts.
     */
    @java.lang.Override
    public int getMaxDeliveryAttempts() {
      return maxDeliveryAttempts_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The maximum number of delivery attempts for any message. The
     * value must be between 5 and 100.
     *
     * The number of delivery attempts is defined as 1 + (the sum of number of
     * NACKs and number of times the acknowledgement deadline has been exceeded
     * for the message).
     *
     * A NACK is any call to ModifyAckDeadline with a 0 deadline. Note that
     * client libraries may automatically extend ack_deadlines.
     *
     * This field will be honored on a best effort basis.
     *
     * If this parameter is 0, a default value of 5 is used.
     * </pre>
     *
     * <code>int32 max_delivery_attempts = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The maxDeliveryAttempts to set.
     * @return This builder for chaining.
     */
    public Builder setMaxDeliveryAttempts(int value) {

      maxDeliveryAttempts_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The maximum number of delivery attempts for any message. The
     * value must be between 5 and 100.
     *
     * The number of delivery attempts is defined as 1 + (the sum of number of
     * NACKs and number of times the acknowledgement deadline has been exceeded
     * for the message).
     *
     * A NACK is any call to ModifyAckDeadline with a 0 deadline. Note that
     * client libraries may automatically extend ack_deadlines.
     *
     * This field will be honored on a best effort basis.
     *
     * If this parameter is 0, a default value of 5 is used.
     * </pre>
     *
     * <code>int32 max_delivery_attempts = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxDeliveryAttempts() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxDeliveryAttempts_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.pubsub.v1.DeadLetterPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.pubsub.v1.DeadLetterPolicy)
  private static final com.google.pubsub.v1.DeadLetterPolicy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.pubsub.v1.DeadLetterPolicy();
  }

  public static com.google.pubsub.v1.DeadLetterPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeadLetterPolicy> PARSER =
      new com.google.protobuf.AbstractParser<DeadLetterPolicy>() {
        @java.lang.Override
        public DeadLetterPolicy parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeadLetterPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeadLetterPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.pubsub.v1.DeadLetterPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
