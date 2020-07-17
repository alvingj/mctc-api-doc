package com.mctc.mctcapidoc.web;


import com.github.pagehelper.PageInfo;
import com.mctc.mctcapidoc.model.Activity;
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

@Api(tags = "兴趣活动")
@RestController
@RequestMapping(value = "/activity")
public class ActivityController {


    @GetMapping("homepage")
    @ApiOperation(value = "首页-活动精彩回顾", notes = "用于首页", produces = "application/json")
    public ResponseBean<List<Activity>> getHomepageActivitys() {
        return null;
    }

    //会员中心-兴趣活动
    //标题，副标题写死；内容后台获取；更多到会员中心，第二个tab列表：活动回顾
    @GetMapping("list")
    @ApiOperation(value = "活动列表", notes = "用于会员中心-兴趣活动菜单", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "Int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数", required = true, dataType = "Int", paramType = "query")
    })
    public ResponseBean<PageInfo<Activity>> getActivitys(
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "8") Integer pageSize) {
        return null;
    }

    @GetMapping("details")
    @ApiOperation(value = "活动详情", notes = "根据id获取活动详情", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "活动id", required = true, dataType = "String", paramType = "query"),
    })
    public ResponseBean<Activity> getNewsDetailsById(@RequestParam(value = "id", required = true) String id) {
        return null;
    }
}
