package com.mctc.mctcapidoc.web;

import com.github.pagehelper.PageInfo;
import com.mctc.mctcapidoc.model.Blogroll;
import com.mctc.mctcapidoc.model.Notice;
import com.mctc.mctcapidoc.model.Partner;
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

@Api(tags = "首页元素获取")
@RestController
@RequestMapping(value = "/hp")
public class HomePageController {

    //合作伙伴
    //参见UI；点击更多进入合作伙伴列表；（UI提供，暂缺）
    @GetMapping("partners")
    @ApiOperation(value = "合作伙伴", notes = "用于首页与更多", produces = "application/json")
    public ResponseBean<List<Partner>> getPartners() {
        return null;
    }

    //友情链接	后台获取；
    @GetMapping("blogroll")
    @ApiOperation(value = "友情链接", notes = "用于首页", produces = "application/json")
    public ResponseBean<List<Blogroll>> getBlogrolls() {
        return null;
    }
}
