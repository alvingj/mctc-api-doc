package com.mctc.mctcapidoc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "FormFields", description = "动态表单字段定义")
public class FormFields {

    @ApiModelProperty(value = "fieldType", name = "'字段类型(input,textarea,select,checkbox)", dataType = "String")
    private String fieldType;

    @ApiModelProperty(value = "fieldName", name = "字段名称", dataType = "String")
    private String fieldName;

    @ApiModelProperty(value = "fieldPlaceholder", name = "'默认显示文字'", dataType = "String")
    private String fieldPlaceholder;

    @ApiModelProperty(value = "canEmpty", name = "是否可以为空 0是 1否", dataType = "String")
    private String canEmpty;

    @ApiModelProperty(value = "formGroupTitle", name = "表单字段分组标题(个人信息,公司信息,自我介绍)", dataType = "String")
    private String formGroupTitle;

    @ApiModelProperty(value = "order", name = "排序", dataType = "int")
    private Integer order;

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldPlaceholder() {
        return fieldPlaceholder;
    }

    public void setFieldPlaceholder(String fieldPlaceholder) {
        this.fieldPlaceholder = fieldPlaceholder;
    }

    public String getCanEmpty() {
        return canEmpty;
    }

    public void setCanEmpty(String canEmpty) {
        this.canEmpty = canEmpty;
    }

    public String getFormGroupTitle() {
        return formGroupTitle;
    }

    public void setFormGroupTitle(String formGroupTitle) {
        this.formGroupTitle = formGroupTitle;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}