// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/business/deny_config.proto

package com.volcengine.service.live.model.business;

public final class DenyConfig {
  private DenyConfig() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Live_Models_Business_DenyConfigDetail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Live_Models_Business_DenyConfigDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Live_Models_Business_DescribeDenyConfigResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Live_Models_Business_DescribeDenyConfigResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Live_Models_Business_VhostWithDenyConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Live_Models_Business_VhostWithDenyConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\037live/business/deny_config.proto\022\037Volce" +
      "ngine.Live.Models.Business\"\250\001\n\020DenyConfi" +
      "gDetail\022\017\n\007ProType\030\001 \003(\t\022\017\n\007FmtType\030\002 \003(" +
      "\t\022\021\n\tContinent\030\003 \001(\t\022\017\n\007Country\030\004 \001(\t\022\016\n" +
      "\006Region\030\005 \001(\t\022\014\n\004City\030\006 \001(\t\022\013\n\003ISP\030\007 \001(\t" +
      "\022\020\n\010DenyList\030\010 \003(\t\022\021\n\tAllowList\030\t \003(\t\"b\n" +
      "\030DescribeDenyConfigResult\022F\n\010DenyList\030\001 " +
      "\003(\01324.Volcengine.Live.Models.Business.Vh" +
      "ostWithDenyConfig\"\210\001\n\023VhostWithDenyConfi" +
      "g\022\r\n\005Vhost\030\001 \001(\t\022\016\n\006Domain\030\002 \001(\t\022\013\n\003App\030" +
      "\003 \001(\t\022E\n\nDenyConfig\030\004 \003(\01321.Volcengine.L" +
      "ive.Models.Business.DenyConfigDetailB\322\001\n" +
      "*com.volcengine.service.live.model.busin" +
      "essB\nDenyConfigP\001ZBgithub.com/volcengine" +
      "/volc-sdk-golang/service/live/models/bus" +
      "iness\240\001\001\330\001\001\302\002\000\312\002!Volc\\Service\\Live\\Model" +
      "s\\Business\342\002$Volc\\Service\\Live\\Models\\GP" +
      "BMetadatab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Volcengine_Live_Models_Business_DenyConfigDetail_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Volcengine_Live_Models_Business_DenyConfigDetail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Live_Models_Business_DenyConfigDetail_descriptor,
        new String[] { "ProType", "FmtType", "Continent", "Country", "Region", "City", "ISP", "DenyList", "AllowList", });
    internal_static_Volcengine_Live_Models_Business_DescribeDenyConfigResult_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Volcengine_Live_Models_Business_DescribeDenyConfigResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Live_Models_Business_DescribeDenyConfigResult_descriptor,
        new String[] { "DenyList", });
    internal_static_Volcengine_Live_Models_Business_VhostWithDenyConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Volcengine_Live_Models_Business_VhostWithDenyConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Live_Models_Business_VhostWithDenyConfig_descriptor,
        new String[] { "Vhost", "Domain", "App", "DenyConfig", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
