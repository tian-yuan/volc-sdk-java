package com.volcengine.example.model.request;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class ListCertificatesRequest {
    @JSONField(name = "PageNumber")
    Integer pageNumber;
    @JSONField(name = "PageSize")
    Integer pageSize;
    @JSONField(name = "Filter")
    Filter filter;

    @Data
    public static class Filter {
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "Labels")
        List<Label> labels;
    }

    @Data
    public static class Label {
        @JSONField(name = "Name")
        String name;
        @JSONField(name = "Value")
        String value;
    }
}
