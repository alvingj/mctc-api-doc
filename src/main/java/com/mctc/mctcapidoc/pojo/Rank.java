package com.mctc.mctcapidoc.pojo;

import com.github.pagehelper.PageInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "Rank", description = "榜单")
public class Rank<T> {

    @ApiModelProperty(value = "id", name = "rankId", dataType = "int")
    private Integer rankId;

    @ApiModelProperty(value = "name", name = "rankName", dataType = "String")
    private String rankName;

    @ApiModelProperty(value = "code", name = "rankCode", dataType = "String")
    private String rankCode;

    @ApiModelProperty(value = "logo", name = "rankIcon", dataType = "String")
    private String rankIcon;

    @ApiModelProperty(value = "是否有更多按钮(0-没有 1-有)", name = "hasMore", dataType = "int")
    private Integer hasMore;

    @ApiModelProperty(value = "数据", name = "data", dataType = "Object")
    private List<T> data;

    @ApiModelProperty(value = "数据支持分页", name = "pageData", dataType = "Object")
    private PageInfo<T> pageData;

    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    public String getRankName() {
        return rankName;
    }

    public void setRankName(String rankName) {
        this.rankName = rankName;
    }

    public String getRankCode() {
        return rankCode;
    }

    public void setRankCode(String rankCode) {
        this.rankCode = rankCode;
    }

    public String getRankIcon() {
        return rankIcon;
    }

    public void setRankIcon(String rankIcon) {
        this.rankIcon = rankIcon;
    }

    public Integer getHasMore() {
        return hasMore;
    }

    public void setHasMore(Integer hasMore) {
        this.hasMore = hasMore;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public PageInfo<T> getPageData() {
        return pageData;
    }

    public void setPageData(PageInfo<T> pageData) {
        this.pageData = pageData;
    }
}
