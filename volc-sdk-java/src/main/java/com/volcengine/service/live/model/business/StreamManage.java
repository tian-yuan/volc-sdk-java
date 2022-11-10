// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/business/stream_manage.proto

package com.volcengine.service.live.model.business;

public final class StreamManage {
  private StreamManage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Live_Models_Business_StreamInfoList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Live_Models_Business_StreamInfoList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Live_Models_Business_ClosedStream_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Live_Models_Business_ClosedStream_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Live_Models_Business_ForbiddenStreamInfoList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Live_Models_Business_ForbiddenStreamInfoList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Live_Models_Business_LiveStreamInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Live_Models_Business_LiveStreamInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Live_Models_Business_ClosedStreamInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Live_Models_Business_ClosedStreamInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Live_Models_Business_StreamStateInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Live_Models_Business_StreamStateInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Live_Models_Business_ForbiddenStreamInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Live_Models_Business_ForbiddenStreamInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n!live/business/stream_manage.proto\022\037Vol" +
      "cengine.Live.Models.Business\"\321\001\n\016StreamI" +
      "nfoList\022\n\n\002ID\030\001 \001(\003\022\r\n\005Vhost\030\002 \001(\t\022\016\n\006Do" +
      "main\030\003 \001(\t\022\013\n\003App\030\004 \001(\t\022\016\n\006Stream\030\005 \001(\t\022" +
      "\030\n\020SessionStartTime\030\006 \001(\t\022\022\n\nOnlineUser\030" +
      "\007 \001(\003\022\021\n\tBandWidth\030\010 \001(\003\022\017\n\007Bitrate\030\t \001(" +
      "\003\022\021\n\tFramerate\030\n \001(\003\022\022\n\nPreviewURL\030\013 \001(\t" +
      "\"\202\001\n\014ClosedStream\022\r\n\005Vhost\030\001 \001(\t\022\016\n\006Doma" +
      "in\030\002 \001(\t\022\013\n\003App\030\003 \001(\t\022\016\n\006Stream\030\004 \001(\t\022\021\n" +
      "\tStartTime\030\005 \001(\t\022\017\n\007EndTime\030\006 \001(\t\022\022\n\nSou" +
      "rceType\030\007 \001(\t\"\210\001\n\027ForbiddenStreamInfoLis" +
      "t\022\r\n\005Vhost\030\001 \001(\t\022\016\n\006Domain\030\002 \001(\t\022\013\n\003App\030" +
      "\003 \001(\t\022\016\n\006Stream\030\004 \001(\t\022\022\n\nCreateTime\030\005 \001(" +
      "\t\022\017\n\007EndTime\030\006 \001(\t\022\014\n\004type\030\007 \001(\t\"m\n\016Live" +
      "StreamInfo\022G\n\016StreamInfoList\030\001 \003(\0132/.Vol" +
      "cengine.Live.Models.Business.StreamInfoL" +
      "ist\022\022\n\nRoughCount\030\002 \001(\003\"m\n\020ClosedStreamI" +
      "nfo\022E\n\016StreamInfoList\030\001 \003(\0132-.Volcengine" +
      ".Live.Models.Business.ClosedStream\022\022\n\nRo" +
      "ughCount\030\002 \001(\003\"5\n\017StreamStateInfo\022\024\n\014str" +
      "eam_state\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\"{\n\023Forbidd" +
      "enStreamInfo\022P\n\016StreamInfoList\030\001 \003(\01328.V" +
      "olcengine.Live.Models.Business.Forbidden" +
      "StreamInfoList\022\022\n\nRoughCount\030\002 \001(\003B\324\001\n*c" +
      "om.volcengine.service.live.model.busines" +
      "sB\014StreamManageP\001ZBgithub.com/volcengine" +
      "/volc-sdk-golang/service/live/models/bus" +
      "iness\240\001\001\330\001\001\302\002\000\312\002!Volc\\Service\\Live\\Model" +
      "s\\Business\342\002$Volc\\Service\\Live\\Models\\GP" +
      "BMetadatab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Volcengine_Live_Models_Business_StreamInfoList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Volcengine_Live_Models_Business_StreamInfoList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Live_Models_Business_StreamInfoList_descriptor,
        new String[] { "ID", "Vhost", "Domain", "App", "Stream", "SessionStartTime", "OnlineUser", "BandWidth", "Bitrate", "Framerate", "PreviewURL", });
    internal_static_Volcengine_Live_Models_Business_ClosedStream_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Volcengine_Live_Models_Business_ClosedStream_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Live_Models_Business_ClosedStream_descriptor,
        new String[] { "Vhost", "Domain", "App", "Stream", "StartTime", "EndTime", "SourceType", });
    internal_static_Volcengine_Live_Models_Business_ForbiddenStreamInfoList_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Volcengine_Live_Models_Business_ForbiddenStreamInfoList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Live_Models_Business_ForbiddenStreamInfoList_descriptor,
        new String[] { "Vhost", "Domain", "App", "Stream", "CreateTime", "EndTime", "Type", });
    internal_static_Volcengine_Live_Models_Business_LiveStreamInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Volcengine_Live_Models_Business_LiveStreamInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Live_Models_Business_LiveStreamInfo_descriptor,
        new String[] { "StreamInfoList", "RoughCount", });
    internal_static_Volcengine_Live_Models_Business_ClosedStreamInfo_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Volcengine_Live_Models_Business_ClosedStreamInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Live_Models_Business_ClosedStreamInfo_descriptor,
        new String[] { "StreamInfoList", "RoughCount", });
    internal_static_Volcengine_Live_Models_Business_StreamStateInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Volcengine_Live_Models_Business_StreamStateInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Live_Models_Business_StreamStateInfo_descriptor,
        new String[] { "StreamState", "Type", });
    internal_static_Volcengine_Live_Models_Business_ForbiddenStreamInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_Volcengine_Live_Models_Business_ForbiddenStreamInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Live_Models_Business_ForbiddenStreamInfo_descriptor,
        new String[] { "StreamInfoList", "RoughCount", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}