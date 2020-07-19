package com.mctc.mctcapidoc.pojo;

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
@ApiModel(value = "Article", description = "人才政策, 职场故事，新闻, 公告, 活动回顾")
public class Article {

    @ApiModelProperty(value = "id", name = "id", dataType = "Long")
    private Long id;

    @ApiModelProperty(value = "policy-人才政策, story-职场故事，news-新闻, notice-公告, activity-活动回顾", name = "articleType", dataType = "String")
    private String articleType;

    @ApiModelProperty(value = "图片地址,首页与列表共用", name = "imgUrl", dataType = "String")
    public String imgUrl;

    @ApiModelProperty(value = "阅读量", name = "viewCount", dataType = "Long")
    private Long viewCount;

    @ApiModelProperty(value = "发布时间", name = "publishTime", dataType = "String")
    private String publishTime;

    @ApiModelProperty(value = "标题", name = "title", dataType = "String")
    private String title;

    @ApiModelProperty(value = "描述,用于列表展示", name = "desc", dataType = "String")
    private String desc;

    @ApiModelProperty(value = "内容,富文本发布", name = "title", dataType = "String")
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Long getViewCount() {
        return viewCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
