package com.mctc.mctcapidoc.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description: java类作用描述
 * @Author: gongjun
 * @CreateDate: 2020/7/17$ 15:48$
 * @UpdateUser:
 * @UpdateDate: 2020/7/17$ 15:48$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@ApiModel(value = "ApplyForMemberField", description = "入会申请表单定制")
public class ApplyForMemberField {

    @ApiModelProperty(value = "所属模块:个人信息:personalInfo;公司信息:companyInfo;自我介绍:self-introduction", name = "module", dataType = "String")
    private String module;
    @ApiModelProperty(value = "字段类型:input;textarea;select;checkbox", name = "fieldType", dataType = "String")
    private String fieldType;
    @ApiModelProperty(value = "字段名称", name = "fieldName", dataType = "String")
    private String fieldName;
    @ApiModelProperty(value = "字段默认显示文字", name = "fieldPlacehoder", dataType = "String")
    private String fieldPlacehoder;
    @ApiModelProperty(value = "字段是否必填", name = "canEmpty", dataType = "Boolean")
    private boolean canEmpty;
    @ApiModelProperty(value = "排序, 模块下", name = "canEmpty", dataType = "String")
    private boolean fieldOrder;

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

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

    public String getFieldPlacehoder() {
        return fieldPlacehoder;
    }

    public void setFieldPlacehoder(String fieldPlacehoder) {
        this.fieldPlacehoder = fieldPlacehoder;
    }

    public boolean isCanEmpty() {
        return canEmpty;
    }

    public void setCanEmpty(boolean canEmpty) {
        this.canEmpty = canEmpty;
    }

    public boolean isFieldOrder() {
        return fieldOrder;
    }

    public void setFieldOrder(boolean fieldOrder) {
        this.fieldOrder = fieldOrder;
    }
}
