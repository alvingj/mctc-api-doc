package com.mctc.mctcapidoc.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description: java类作用描述
 * @Author: gongjun
 * @CreateDate: 2020/7/17$ 15:35$
 * @UpdateUser:
 * @UpdateDate: 2020/7/17$ 15:35$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@ApiModel(value = "Blogroll", description = "友情链接")
public class Blogroll {

    @ApiModelProperty(value = "显示文字", name = "name", dataType = "String")
    public String name;
    @ApiModelProperty(value = "跳转地址,没有返回值则不支持跳转", name = "targetUrl", dataType = "String")
    public String targetUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }
}
