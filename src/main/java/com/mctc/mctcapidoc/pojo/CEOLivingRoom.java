package com.mctc.mctcapidoc.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description: java类作用描述
 * @Author: gongjun
 * @CreateDate: 2020/7/17$ 15:19$
 * @UpdateUser:
 * @UpdateDate: 2020/7/17$ 15:19$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@ApiModel(value = "CEOLivingRoom", description = "CEO会客厅,三个图片；（首页大图，小图，列表图）视频访谈")
public class CEOLivingRoom {

    @ApiModelProperty(value = "id", name = "id", dataType = "Long")
    private Long id;

    @ApiModelProperty(value = "列表图片地址", name = "rankImgUrl", dataType = "String")
    private String rankImgUrl;

    @ApiModelProperty(value = "首页小图片地址", name = "smallImgUrl", dataType = "String")
    private String smallImgUrl;

    @ApiModelProperty(value = "首页大图片地址", name = "bigImgUrl", dataType = "String")
    private String bigImgUrl;

    @ApiModelProperty(value = "视频地址,列表页有视频优先展示视频", name = "videoUrl", dataType = "String")
    private String videoUrl;

    @ApiModelProperty(value = "阅读量", name = "viewCount", dataType = "Long")
    private Long viewCount;

    @ApiModelProperty(value = "发布时间", name = "publishTime", dataType = "String")
    private String publishTime;

    @ApiModelProperty(value = "标题", name = "title", dataType = "String")
    private String title;

    @ApiModelProperty(value = "描述,用于列表展示", name = "desc", dataType = "String")
    private String desc;

    @ApiModelProperty(value = "内容,html格式 富文本发布", name = "title", dataType = "String")
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRankImgUrl() {
        return rankImgUrl;
    }

    public void setRankImgUrl(String rankImgUrl) {
        this.rankImgUrl = rankImgUrl;
    }

    public String getSmallImgUrl() {
        return smallImgUrl;
    }

    public void setSmallImgUrl(String smallImgUrl) {
        this.smallImgUrl = smallImgUrl;
    }

    public String getBigImgUrl() {
        return bigImgUrl;
    }

    public void setBigImgUrl(String bigImgUrl) {
        this.bigImgUrl = bigImgUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
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
