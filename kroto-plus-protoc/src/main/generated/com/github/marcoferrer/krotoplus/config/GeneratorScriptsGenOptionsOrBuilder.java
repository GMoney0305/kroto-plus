// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: krotoplus/compiler/config.proto

package com.github.marcoferrer.krotoplus.config;

public interface GeneratorScriptsGenOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:krotoplus.compiler.GeneratorScriptsGenOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  boolean hasFilter();
  /**
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  com.github.marcoferrer.krotoplus.config.FileFilter getFilter();
  /**
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  com.github.marcoferrer.krotoplus.config.FileFilterOrBuilder getFilterOrBuilder();

  /**
   * <code>repeated string template_script_path = 2;</code>
   */
  java.util.List<java.lang.String>
      getTemplateScriptPathList();
  /**
   * <code>repeated string template_script_path = 2;</code>
   */
  int getTemplateScriptPathCount();
  /**
   * <code>repeated string template_script_path = 2;</code>
   */
  java.lang.String getTemplateScriptPath(int index);
  /**
   * <code>repeated string template_script_path = 2;</code>
   */
  com.google.protobuf.ByteString
      getTemplateScriptPathBytes(int index);

  /**
   * <code>string template_script_bundle = 3;</code>
   */
  java.lang.String getTemplateScriptBundle();
  /**
   * <code>string template_script_bundle = 3;</code>
   */
  com.google.protobuf.ByteString
      getTemplateScriptBundleBytes();
}