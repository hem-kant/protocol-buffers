// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: option_example.proto

package com.example.options;

public final class OptionExample {
  private OptionExample() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_example_option_OptionMessageTest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_example_option_OptionMessageTest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_example_option_OptionMessgeMultiple_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_example_option_OptionMessgeMultiple_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024option_example.proto\022\016example.option\"U" +
      "\n\021OptionMessageTest\022\n\n\002id\030\001 \001(\005\022\021\n\tis_si" +
      "mple\030\002 \001(\010\022\014\n\004name\030\003 \001(\t\022\023\n\013sample_list\030" +
      "\004 \003(\005\"%\n\024OptionMessgeMultiple\022\r\n\005hello\030\001" +
      " \001(\tB\027\n\023com.example.optionsP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_example_option_OptionMessageTest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_example_option_OptionMessageTest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_example_option_OptionMessageTest_descriptor,
        new java.lang.String[] { "Id", "IsSimple", "Name", "SampleList", });
    internal_static_example_option_OptionMessgeMultiple_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_example_option_OptionMessgeMultiple_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_example_option_OptionMessgeMultiple_descriptor,
        new java.lang.String[] { "Hello", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
