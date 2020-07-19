package com.mctc.mctcapidoc;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Plate", description = "页面板块")
public class Plate {

    @ApiModelProperty(value = "板块id", name = "id", dataType = "int")
    private Integer id;

    @ApiModelProperty(value = "菜单id", name = "menuId", dataType = "int")
    private Integer menuId;

    @ApiModelProperty(value = "菜单code", name = "menuCode", dataType = "String")
    private Integer menuCode;

    @ApiModelProperty(value = "板块名称", name = "platName", dataType = "String")
    private String platName;

    @ApiModelProperty(value = "排序", name = "order", dataType = "int")
    private Integer order;

    @ApiModelProperty(value = "板块内容id", name = "contentId", dataType = "int")
    private Integer contentId;

    @ApiModelProperty(value = "板块展示样式：\n - 0-多图banner\n" +
            "        - 1-单图banner\n" +
            "        - 2-首页两列文字榜单，如：国内外人才政策，公告\n" +
            "        - 3-首页CEO会客厅\n" +
            "        - 4-首页钻石会员展示\n" +
            "        - 5-首页新闻\n" +
            "        - 6-首页活动\n" +
            "        - 7-合作伙伴\n" +
            "        - 8-友情链接\n" +
            "        - 9-文章列表，如：新闻咨询下的人才政策，会员中心下的兴趣活动\n" +
            "        - 11-动态表单， 如：入会申请", name = "showType", dataType = "String")
    private String showType;

    @ApiModelProperty(value = "版本内容类型: \n - 0-banner\n" +
            "        - 1-自动榜单", name = "dateType", dataType = "String")
    private String dateType;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(Integer menuCode) {
        this.menuCode = menuCode;
    }

    public String getPlatName() {
        return platName;
    }

    public void setPlatName(String platName) {
        this.platName = platName;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }
}
