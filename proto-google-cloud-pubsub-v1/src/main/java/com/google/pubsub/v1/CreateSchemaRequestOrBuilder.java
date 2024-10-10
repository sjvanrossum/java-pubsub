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
// source: google/pubsub/v1/schema.proto

// Protobuf Java Version: 3.25.5
package com.google.pubsub.v1;

public interface CreateSchemaRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.CreateSchemaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the project in which to create the schema.
   * Format is `projects/{project-id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of the project in which to create the schema.
   * Format is `projects/{project-id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The schema object to create.
   *
   * This schema's `name` parameter is ignored. The schema object returned
   * by CreateSchema will have a `name` made using the given `parent` and
   * `schema_id`.
   * </pre>
   *
   * <code>.google.pubsub.v1.Schema schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the schema field is set.
   */
  boolean hasSchema();
  /**
   *
   *
   * <pre>
   * Required. The schema object to create.
   *
   * This schema's `name` parameter is ignored. The schema object returned
   * by CreateSchema will have a `name` made using the given `parent` and
   * `schema_id`.
   * </pre>
   *
   * <code>.google.pubsub.v1.Schema schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The schema.
   */
  com.google.pubsub.v1.Schema getSchema();
  /**
   *
   *
   * <pre>
   * Required. The schema object to create.
   *
   * This schema's `name` parameter is ignored. The schema object returned
   * by CreateSchema will have a `name` made using the given `parent` and
   * `schema_id`.
   * </pre>
   *
   * <code>.google.pubsub.v1.Schema schema = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.pubsub.v1.SchemaOrBuilder getSchemaOrBuilder();

  /**
   *
   *
   * <pre>
   * The ID to use for the schema, which will become the final component of
   * the schema's resource name.
   *
   * See https://cloud.google.com/pubsub/docs/pubsub-basics#resource_names for
   * resource name constraints.
   * </pre>
   *
   * <code>string schema_id = 3;</code>
   *
   * @return The schemaId.
   */
  java.lang.String getSchemaId();
  /**
   *
   *
   * <pre>
   * The ID to use for the schema, which will become the final component of
   * the schema's resource name.
   *
   * See https://cloud.google.com/pubsub/docs/pubsub-basics#resource_names for
   * resource name constraints.
   * </pre>
   *
   * <code>string schema_id = 3;</code>
   *
   * @return The bytes for schemaId.
   */
  com.google.protobuf.ByteString getSchemaIdBytes();
}
