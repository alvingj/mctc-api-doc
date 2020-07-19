package com.mctc.mctcapidoc;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ApplyFrom", description = "申请入会表单")
public class ApplyFrom {

    @ApiModelProperty(value = "申请信息, 根据填写的动态表单生成json存储,使用时读取解析成全量数据对象展示", name = "applyInfo", dataType = "String")
    private String applyInfo;
}
