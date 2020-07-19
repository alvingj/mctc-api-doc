package com.mctc.mctcapidoc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "DynaminForm", description = "动态表单")
public class DynaminForm {

    @ApiModelProperty(value = "formCode", name = "入会申请-apply", dataType = "String")
    private String formCode;

    @ApiModelProperty(value = "fields", name = "动态表单字段定义", dataType = "FormFields")
    private FormFields fields;

    public String getFormCode() {
        return formCode;
    }

    public void setFormCode(String formCode) {
        this.formCode = formCode;
    }

    public FormFields getFields() {
        return fields;
    }

    public void setFields(FormFields fields) {
        this.fields = fields;
    }
}
