package com.mctc.mctcapidoc.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description: java类作用描述
 * @Author: gongjun
 * @CreateDate: 2020/7/17$ 14:49$
 * @UpdateUser:
 * @UpdateDate: 2020/7/17$ 14:49$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@ApiModel(value = "Activity", description = "活动")
public class Activity {

    @ApiModelProperty(value = "id", name = "id", dataType = "Long")
    private Long id;

    @ApiModelProperty(value = "列表图片地址", name = "listImgUrl", dataType = "String")
    public String listImgUrl;

    @ApiModelProperty(value = "首页图片地址", name = "hpImgUrl", dataType = "String")
    public String hpImgUrl;

    @ApiModelProperty(value = "视频地址,列表页有视频优先展示视频", name = "videoUrl", dataType = "String")
    public String videoUrl;

    @ApiModelProperty(value = "阅读量", name = "viewCount", dataType = "Long")
    private Long viewCount;

    @ApiModelProperty(value = "发布时间", name = "createTime", dataType = "String")
    private String createTime;

    @ApiModelProperty(value = "标题", name = "title", dataType = "String")
    private String title;

    @ApiModelProperty(value = "描述,用于列表展示", name = "description", dataType = "String")
    private String description;

    @ApiModelProperty(value = "内容,html格式 富文本发布", name = "title", dataType = "String")
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }
}
