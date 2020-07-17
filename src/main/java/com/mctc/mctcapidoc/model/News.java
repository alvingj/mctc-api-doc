package com.mctc.mctcapidoc.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description: java类作用描述
 * @Author: gongjun
 * @CreateDate: 2020/7/17$ 14:30$
 * @UpdateUser:
 * @UpdateDate: 2020/7/17$ 14:30$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@ApiModel(value = "News", description = "新闻")
public class News {

    @ApiModelProperty(value = "新闻id", name = "id", dataType = "Long")
    private Long id;

    @ApiModelProperty(value = "列表图片地址", name = "listImgUrl", dataType = "String")
    public String listImgUrl;

    @ApiModelProperty(value = "首页图片地址", name = "hpImgUrl", dataType = "String")
    public String hpImgUrl;

    @ApiModelProperty(value = "阅读量", name = "viewCount", dataType = "Long")
    private Long viewCount;

    @ApiModelProperty(value = "新闻发布时间", name = "createTime", dataType = "String")
    private String createTime;

    @ApiModelProperty(value = "新闻标题", name = "title", dataType = "String")
    private String title;

    @ApiModelProperty(value = "描述,用于列表展示", name = "description", dataType = "String")
    private String description;

    @ApiModelProperty(value = "新闻内容,html格式 富文本发布", name = "title", dataType = "String")
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getViewCount() {
        return viewCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getListImgUrl() {
        return listImgUrl;
    }

    public void setListImgUrl(String listImgUrl) {
        this.listImgUrl = listImgUrl;
    }

    public String getHpImgUrl() {
        return hpImgUrl;
    }

    public void setHpImgUrl(String hpImgUrl) {
        this.hpImgUrl = hpImgUrl;
    }
}
