// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

public interface VodASRInfoForAuditOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodASRInfoForAudit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 识别的语音文本
   * </pre>
   *
   * <code>string Text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * 识别的语音文本
   * </pre>
   *
   * <code>string Text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * 识别结果语音分句信息
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodASRUtteranceForAudit Utterances = 3;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodASRUtteranceForAudit> 
      getUtterancesList();
  /**
   * <pre>
   * 识别结果语音分句信息
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodASRUtteranceForAudit Utterances = 3;</code>
   */
  com.volcengine.service.vod.model.business.VodASRUtteranceForAudit getUtterances(int index);
  /**
   * <pre>
   * 识别结果语音分句信息
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodASRUtteranceForAudit Utterances = 3;</code>
   */
  int getUtterancesCount();
  /**
   * <pre>
   * 识别结果语音分句信息
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodASRUtteranceForAudit Utterances = 3;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodASRUtteranceForAuditOrBuilder> 
      getUtterancesOrBuilderList();
  /**
   * <pre>
   * 识别结果语音分句信息
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodASRUtteranceForAudit Utterances = 3;</code>
   */
  com.volcengine.service.vod.model.business.VodASRUtteranceForAuditOrBuilder getUtterancesOrBuilder(
      int index);

  /**
   * <pre>
   * 整个音频对应的语言
   * </pre>
   *
   * <code>string Language = 4;</code>
   * @return The language.
   */
  java.lang.String getLanguage();
  /**
   * <pre>
   * 整个音频对应的语言
   * </pre>
   *
   * <code>string Language = 4;</code>
   * @return The bytes for language.
   */
  com.google.protobuf.ByteString
      getLanguageBytes();

  /**
   * <pre>
   * 语言的详情，描述每个语言的概率
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodASRLanguageDetailForAudit LanguageDetails = 5;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit> 
      getLanguageDetailsList();
  /**
   * <pre>
   * 语言的详情，描述每个语言的概率
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodASRLanguageDetailForAudit LanguageDetails = 5;</code>
   */
  com.volcengine.service.vod.model.business.VodASRLanguageDetailForAudit getLanguageDetails(int index);
  /**
   * <pre>
   * 语言的详情，描述每个语言的概率
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodASRLanguageDetailForAudit LanguageDetails = 5;</code>
   */
  int getLanguageDetailsCount();
  /**
   * <pre>
   * 语言的详情，描述每个语言的概率
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodASRLanguageDetailForAudit LanguageDetails = 5;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodASRLanguageDetailForAuditOrBuilder> 
      getLanguageDetailsOrBuilderList();
  /**
   * <pre>
   * 语言的详情，描述每个语言的概率
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodASRLanguageDetailForAudit LanguageDetails = 5;</code>
   */
  com.volcengine.service.vod.model.business.VodASRLanguageDetailForAuditOrBuilder getLanguageDetailsOrBuilder(
      int index);

  /**
   * <pre>
   *语速，即一秒钟几个字
   * </pre>
   *
   * <code>double SpeechRate = 6;</code>
   * @return The speechRate.
   */
  double getSpeechRate();

  /**
   * <pre>
   *音量
   * </pre>
   *
   * <code>double Volume = 7;</code>
   * @return The volume.
   */
  double getVolume();
}
