package com.mctc.mctcapidoc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description: java类作用描述
 * @Author: gongjun
 * @CreateDate: 2020/7/17$ 15:34$
 * @UpdateUser:
 * @UpdateDate: 2020/7/17$ 15:34$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@ApiModel(value = "Partner", description = "合作伙伴")
public class Partner {

    @ApiModelProperty(value = "图片地址", name = "imgUrl", dataType = "String")
    public String imgUrl;
    @ApiModelProperty(value = "跳转地址,没有返回值则不支持跳转", name = "targetUrl", dataType = "String")
    public String targetUrl;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }
}
