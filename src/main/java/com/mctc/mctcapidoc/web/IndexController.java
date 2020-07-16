package com.mctc.mctcapidoc.web;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "首页元素获取")
@RestController
@RequestMapping(value = "/idx")
public class IndexController {


    //俱乐部公告获取
    //notice
    //"后台配置公告模块；页面按照样式ok；
    //点击更多：进入公告列表页面（UI有）"


    //CEO会客厅精选
    //CEOLivingRoom
    //"三个图片；（首页大图，小图，列表图）有播放；
    //点击更多：到会员中心，下面CEO会客厅列表"

    //砖石会员展示
    //MemderDisplay
    //参考UI，没有更多；左右轮换4个

    //新闻资讯精选

    //兴趣活动精选，精彩回顾
    //标题，副标题写死；内容后台获取；更多到会员中心，第二个tab列表：活动回顾

    //合作伙伴
    //参见UI；点击更多进入合作伙伴列表；（UI提供，暂缺）

    //友情链接	后台获取；
}
