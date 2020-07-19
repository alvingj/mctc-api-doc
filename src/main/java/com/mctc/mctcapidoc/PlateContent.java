package com.mctc.mctcapidoc;

import com.mctc.mctcapidoc.pojo.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "PlateContent", description = "板块内容")
public class PlateContent<T> {

    @ApiModelProperty(value = "板块内容id", name = "contentId", dataType = "int")
    private Integer contentId;

    @ApiModelProperty(value = "板块内容", name = "contentId", dataType = "Object")
    private T content;

    @ApiModelProperty(value = "图片banner，接口不回返回该字段，统一在content返回", name = "banners", dataType = "List<Banner>")
    private List<Banner> banners;

    @ApiModelProperty(value = "文章榜单，接口不回返回该字段，统一在content返回", name = "articles", dataType = "Rank<Article>")
    private Rank<Article> articles;

    @ApiModelProperty(value = "CEO会客厅榜单，接口不回返回该字段，统一在content返回", name = "ceoLivingRooms", dataType = "Rank<CEOLivingRoom>")
    private Rank<CEOLivingRoom> ceoLivingRooms;

    @ApiModelProperty(value = "动态表单，接口不回返回该字段，统一在content返回", name = "dynaminForm", dataType = "DynaminForm")
    private DynaminForm dynaminForm;

    @ApiModelProperty(value = "友情链接，接口不回返回该字段，统一在content返回", name = "links", dataType = "Rank<Links>")
    private Rank<Links> links;

    @ApiModelProperty(value = "合作伙伴，接口不回返回该字段，统一在content返回", name = "partners", dataType = "Rank<Partner>")
    private Rank<Partner> partners;

    @ApiModelProperty(value = "钻石会员展示，接口不回返回该字段，统一在content返回", name = "memberShows", dataType = "Rank<MemberShow>")
    private Rank<MemberShow> memberShows;

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public List<Banner> getBanners() {
        return banners;
    }

    public void setBanners(List<Banner> banners) {
        this.banners = banners;
    }

    public Rank<Article> getArticles() {
        return articles;
    }

    public void setArticles(Rank<Article> articles) {
        this.articles = articles;
    }

    public Rank<CEOLivingRoom> getCeoLivingRooms() {
        return ceoLivingRooms;
    }

    public void setCeoLivingRooms(Rank<CEOLivingRoom> ceoLivingRooms) {
        this.ceoLivingRooms = ceoLivingRooms;
    }

    public DynaminForm getDynaminForm() {
        return dynaminForm;
    }

    public void setDynaminForm(DynaminForm dynaminForm) {
        this.dynaminForm = dynaminForm;
    }

    public Rank<Links> getLinks() {
        return links;
    }

    public void setLinks(Rank<Links> links) {
        this.links = links;
    }

    public Rank<Partner> getPartners() {
        return partners;
    }

    public void setPartners(Rank<Partner> partners) {
        this.partners = partners;
    }

    public Rank<MemberShow> getMemberShows() {
        return memberShows;
    }

    public void setMemberShows(Rank<MemberShow> memberShows) {
        this.memberShows = memberShows;
    }
}
