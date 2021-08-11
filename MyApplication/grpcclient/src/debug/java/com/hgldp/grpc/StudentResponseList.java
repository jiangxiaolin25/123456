// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc.proto

package com.hgldp.grpc;

/**
 * Protobuf type {@code StudentResponseList}
 */
public  final class StudentResponseList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:StudentResponseList)
    StudentResponseListOrBuilder {
  // Use StudentResponseList.newBuilder() to construct.
  private StudentResponseList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StudentResponseList() {
    studentResponse_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private StudentResponseList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              studentResponse_ = new java.util.ArrayList<com.hgldp.grpc.StudentResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            studentResponse_.add(
                input.readMessage(com.hgldp.grpc.StudentResponse.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        studentResponse_ = java.util.Collections.unmodifiableList(studentResponse_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hgldp.grpc.SimPleProto.internal_static_StudentResponseList_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hgldp.grpc.SimPleProto.internal_static_StudentResponseList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hgldp.grpc.StudentResponseList.class, com.hgldp.grpc.StudentResponseList.Builder.class);
  }

  public static final int STUDENTRESPONSE_FIELD_NUMBER = 1;
  private java.util.List<com.hgldp.grpc.StudentResponse> studentResponse_;
  /**
   * <code>repeated .StudentResponse studentResponse = 1;</code>
   */
  public java.util.List<com.hgldp.grpc.StudentResponse> getStudentResponseList() {
    return studentResponse_;
  }
  /**
   * <code>repeated .StudentResponse studentResponse = 1;</code>
   */
  public java.util.List<? extends com.hgldp.grpc.StudentResponseOrBuilder> 
      getStudentResponseOrBuilderList() {
    return studentResponse_;
  }
  /**
   * <code>repeated .StudentResponse studentResponse = 1;</code>
   */
  public int getStudentResponseCount() {
    return studentResponse_.size();
  }
  /**
   * <code>repeated .StudentResponse studentResponse = 1;</code>
   */
  public com.hgldp.grpc.StudentResponse getStudentResponse(int index) {
    return studentResponse_.get(index);
  }
  /**
   * <code>repeated .StudentResponse studentResponse = 1;</code>
   */
  public com.hgldp.grpc.StudentResponseOrBuilder getStudentResponseOrBuilder(
      int index) {
    return studentResponse_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < studentResponse_.size(); i++) {
      output.writeMessage(1, studentResponse_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < studentResponse_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, studentResponse_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.hgldp.grpc.StudentResponseList)) {
      return super.equals(obj);
    }
    com.hgldp.grpc.StudentResponseList other = (com.hgldp.grpc.StudentResponseList) obj;

    boolean result = true;
    result = result && getStudentResponseList()
        .equals(other.getStudentResponseList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getStudentResponseCount() > 0) {
      hash = (37 * hash) + STUDENTRESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getStudentResponseList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hgldp.grpc.StudentResponseList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hgldp.grpc.StudentResponseList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hgldp.grpc.StudentResponseList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hgldp.grpc.StudentResponseList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hgldp.grpc.StudentResponseList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hgldp.grpc.StudentResponseList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hgldp.grpc.StudentResponseList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hgldp.grpc.StudentResponseList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hgldp.grpc.StudentResponseList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hgldp.grpc.StudentResponseList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.hgldp.grpc.StudentResponseList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code StudentResponseList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:StudentResponseList)
      com.hgldp.grpc.StudentResponseListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hgldp.grpc.SimPleProto.internal_static_StudentResponseList_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hgldp.grpc.SimPleProto.internal_static_StudentResponseList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hgldp.grpc.StudentResponseList.class, com.hgldp.grpc.StudentResponseList.Builder.class);
    }

    // Construct using com.hgldp.grpc.StudentResponseList.newBuilder()
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
        getStudentResponseFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (studentResponseBuilder_ == null) {
        studentResponse_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        studentResponseBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hgldp.grpc.SimPleProto.internal_static_StudentResponseList_descriptor;
    }

    public com.hgldp.grpc.StudentResponseList getDefaultInstanceForType() {
      return com.hgldp.grpc.StudentResponseList.getDefaultInstance();
    }

    public com.hgldp.grpc.StudentResponseList build() {
      com.hgldp.grpc.StudentResponseList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.hgldp.grpc.StudentResponseList buildPartial() {
      com.hgldp.grpc.StudentResponseList result = new com.hgldp.grpc.StudentResponseList(this);
      int from_bitField0_ = bitField0_;
      if (studentResponseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          studentResponse_ = java.util.Collections.unmodifiableList(studentResponse_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.studentResponse_ = studentResponse_;
      } else {
        result.studentResponse_ = studentResponseBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hgldp.grpc.StudentResponseList) {
        return mergeFrom((com.hgldp.grpc.StudentResponseList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hgldp.grpc.StudentResponseList other) {
      if (other == com.hgldp.grpc.StudentResponseList.getDefaultInstance()) return this;
      if (studentResponseBuilder_ == null) {
        if (!other.studentResponse_.isEmpty()) {
          if (studentResponse_.isEmpty()) {
            studentResponse_ = other.studentResponse_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStudentResponseIsMutable();
            studentResponse_.addAll(other.studentResponse_);
          }
          onChanged();
        }
      } else {
        if (!other.studentResponse_.isEmpty()) {
          if (studentResponseBuilder_.isEmpty()) {
            studentResponseBuilder_.dispose();
            studentResponseBuilder_ = null;
            studentResponse_ = other.studentResponse_;
            bitField0_ = (bitField0_ & ~0x00000001);
            studentResponseBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStudentResponseFieldBuilder() : null;
          } else {
            studentResponseBuilder_.addAllMessages(other.studentResponse_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.hgldp.grpc.StudentResponseList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hgldp.grpc.StudentResponseList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.hgldp.grpc.StudentResponse> studentResponse_ =
      java.util.Collections.emptyList();
    private void ensureStudentResponseIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        studentResponse_ = new java.util.ArrayList<com.hgldp.grpc.StudentResponse>(studentResponse_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.hgldp.grpc.StudentResponse, com.hgldp.grpc.StudentResponse.Builder, com.hgldp.grpc.StudentResponseOrBuilder> studentResponseBuilder_;

    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public java.util.List<com.hgldp.grpc.StudentResponse> getStudentResponseList() {
      if (studentResponseBuilder_ == null) {
        return java.util.Collections.unmodifiableList(studentResponse_);
      } else {
        return studentResponseBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public int getStudentResponseCount() {
      if (studentResponseBuilder_ == null) {
        return studentResponse_.size();
      } else {
        return studentResponseBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public com.hgldp.grpc.StudentResponse getStudentResponse(int index) {
      if (studentResponseBuilder_ == null) {
        return studentResponse_.get(index);
      } else {
        return studentResponseBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public Builder setStudentResponse(
        int index, com.hgldp.grpc.StudentResponse value) {
      if (studentResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentResponseIsMutable();
        studentResponse_.set(index, value);
        onChanged();
      } else {
        studentResponseBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public Builder setStudentResponse(
        int index, com.hgldp.grpc.StudentResponse.Builder builderForValue) {
      if (studentResponseBuilder_ == null) {
        ensureStudentResponseIsMutable();
        studentResponse_.set(index, builderForValue.build());
        onChanged();
      } else {
        studentResponseBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public Builder addStudentResponse(com.hgldp.grpc.StudentResponse value) {
      if (studentResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentResponseIsMutable();
        studentResponse_.add(value);
        onChanged();
      } else {
        studentResponseBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public Builder addStudentResponse(
        int index, com.hgldp.grpc.StudentResponse value) {
      if (studentResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentResponseIsMutable();
        studentResponse_.add(index, value);
        onChanged();
      } else {
        studentResponseBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public Builder addStudentResponse(
        com.hgldp.grpc.StudentResponse.Builder builderForValue) {
      if (studentResponseBuilder_ == null) {
        ensureStudentResponseIsMutable();
        studentResponse_.add(builderForValue.build());
        onChanged();
      } else {
        studentResponseBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public Builder addStudentResponse(
        int index, com.hgldp.grpc.StudentResponse.Builder builderForValue) {
      if (studentResponseBuilder_ == null) {
        ensureStudentResponseIsMutable();
        studentResponse_.add(index, builderForValue.build());
        onChanged();
      } else {
        studentResponseBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public Builder addAllStudentResponse(
        java.lang.Iterable<? extends com.hgldp.grpc.StudentResponse> values) {
      if (studentResponseBuilder_ == null) {
        ensureStudentResponseIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, studentResponse_);
        onChanged();
      } else {
        studentResponseBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public Builder clearStudentResponse() {
      if (studentResponseBuilder_ == null) {
        studentResponse_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        studentResponseBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public Builder removeStudentResponse(int index) {
      if (studentResponseBuilder_ == null) {
        ensureStudentResponseIsMutable();
        studentResponse_.remove(index);
        onChanged();
      } else {
        studentResponseBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public com.hgldp.grpc.StudentResponse.Builder getStudentResponseBuilder(
        int index) {
      return getStudentResponseFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public com.hgldp.grpc.StudentResponseOrBuilder getStudentResponseOrBuilder(
        int index) {
      if (studentResponseBuilder_ == null) {
        return studentResponse_.get(index);  } else {
        return studentResponseBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public java.util.List<? extends com.hgldp.grpc.StudentResponseOrBuilder> 
         getStudentResponseOrBuilderList() {
      if (studentResponseBuilder_ != null) {
        return studentResponseBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(studentResponse_);
      }
    }
    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public com.hgldp.grpc.StudentResponse.Builder addStudentResponseBuilder() {
      return getStudentResponseFieldBuilder().addBuilder(
          com.hgldp.grpc.StudentResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public com.hgldp.grpc.StudentResponse.Builder addStudentResponseBuilder(
        int index) {
      return getStudentResponseFieldBuilder().addBuilder(
          index, com.hgldp.grpc.StudentResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .StudentResponse studentResponse = 1;</code>
     */
    public java.util.List<com.hgldp.grpc.StudentResponse.Builder> 
         getStudentResponseBuilderList() {
      return getStudentResponseFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.hgldp.grpc.StudentResponse, com.hgldp.grpc.StudentResponse.Builder, com.hgldp.grpc.StudentResponseOrBuilder> 
        getStudentResponseFieldBuilder() {
      if (studentResponseBuilder_ == null) {
        studentResponseBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.hgldp.grpc.StudentResponse, com.hgldp.grpc.StudentResponse.Builder, com.hgldp.grpc.StudentResponseOrBuilder>(
                studentResponse_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        studentResponse_ = null;
      }
      return studentResponseBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:StudentResponseList)
  }

  // @@protoc_insertion_point(class_scope:StudentResponseList)
  private static final com.hgldp.grpc.StudentResponseList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hgldp.grpc.StudentResponseList();
  }

  public static com.hgldp.grpc.StudentResponseList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StudentResponseList>
      PARSER = new com.google.protobuf.AbstractParser<StudentResponseList>() {
    public StudentResponseList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new StudentResponseList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StudentResponseList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StudentResponseList> getParserForType() {
    return PARSER;
  }

  public com.hgldp.grpc.StudentResponseList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

