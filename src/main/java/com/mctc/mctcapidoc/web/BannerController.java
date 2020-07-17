package com.mctc.mctcapidoc.web;


import com.mctc.mctcapidoc.model.Banner;
import com.mctc.mctcapidoc.model.ResponseBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "banner获取")
@RestController
@RequestMapping(value = "/banner")
public class BannerController {
    //顶部banner	"banner后台配置，数目不超过5个
    //内容：图片;标题简介属于图片内容；URL(可以空)"
    @GetMapping("get_topbanners")
    @ApiOperation(value = "首页顶部banner", notes = "获取首页顶部banner集合", produces = "application/json")
    public ResponseBean<List<Banner>> getTopBanners() {
        return null;
    }

    //banner2 图片，url；url可没有，此时不可点击；url都是链接静态html
    //banner3
    //banner4
    @GetMapping("get_banner")
    @ApiOperation(value = "首页其他位置的banner", notes = "根据位置code获取首页其他的banner", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "location", value = "banner在首页的位置", required = true, dataType = "String", paramType = "query"),
    })
    public ResponseBean<Banner> getBanner(@RequestParam(value = "location", required = true) String location) {
        return null;
    }

}
