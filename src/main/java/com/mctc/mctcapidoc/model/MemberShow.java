package com.mctc.mctcapidoc.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description: java类作用描述
 * @Author: gongjun
 * @CreateDate: 2020/7/17$ 15:39$
 * @UpdateUser:
 * @UpdateDate: 2020/7/17$ 15:39$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@ApiModel(value = "MemberShow", description = "砖石会员展示")
public class MemberShow {

    @ApiModelProperty(value = "图片地址", name = "imgUrl", dataType = "String")
    public String imgUrl;

    @ApiModelProperty(value = "名字", name = "name", dataType = "String")
    public String name;

    @ApiModelProperty(value = "职位", name = "jobTitle", dataType = "String")
    public String jobTitle;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
