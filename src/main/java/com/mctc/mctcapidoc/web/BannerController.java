package com.mctc.mctcapidoc.web;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "banner获取")
@RestController
@RequestMapping(value = "/banner")
public class BannerController {
    //顶部banner	"banner后台配置，数目不超过5个
    //内容：图片;标题简介属于图片内容；URL(可以空)"

    //banner2 图片，url；url可没有，此时不可点击；url都是链接静态html
    //banner3
    //banner4
}
