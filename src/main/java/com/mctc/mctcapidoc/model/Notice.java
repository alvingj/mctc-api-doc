package com.mctc.mctcapidoc.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description: java类作用描述
 * @Author: gongjun
 * @CreateDate: 2020/7/17$ 15:28$
 * @UpdateUser:
 * @UpdateDate: 2020/7/17$ 15:28$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@ApiModel(value = "Notice", description = "俱乐部公告")
public class Notice {

    @ApiModelProperty(value = "id", name = "id", dataType = "Long")
    private Long id;


    @ApiModelProperty(value = "发布时间", name = "createTime", dataType = "String")
    private String createTime;

    @ApiModelProperty(value = "标题", name = "title", dataType = "String")
    private String title;

    @ApiModelProperty(value = "描述,用于列表展示", name = "description", dataType = "String")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
