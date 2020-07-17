package com.mctc.mctcapidoc.web;

import com.github.pagehelper.PageInfo;
import com.mctc.mctcapidoc.model.News;
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

@Api(tags = "新闻咨询")
@RestController
@RequestMapping(value = "/news")
public class NewsController {


    //国内外人才政策-首页精选
    //来源于新闻资讯的子栏目国内外人才政策内容发布过来；
    //更多，进入新闻资讯模块的，国内人人才政策（UI）
    @GetMapping("policys")
    @ApiOperation(value = "首页-国内外人才政策", notes = "用于首页", produces = "application/json")
    public ResponseBean<List<News>> getPolicys() {
        return null;
    }


    //新闻咨询 政策 · 观点--首页精选
    //新闻资讯，政策观点；文字写死参见UI；内容后台发布
    @GetMapping("homepage")
    @ApiOperation(value = "首页-新闻咨询", notes = "用于首页", produces = "application/json")
    public ResponseBean<List<News>> getHomepageNews() {
        return null;
    }

    //财经新闻
    //职场故事
    //国内外人才政策
    @GetMapping("list")
    @ApiOperation(value = "新闻列表", notes = "用于新闻菜单的三个列表", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "code", value = "policy:人才政策;story:职场故事;news:财经新闻", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "Int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数", required = true, dataType = "Int", paramType = "query")
    })
    public ResponseBean<PageInfo<News>> getNewsByCode(@RequestParam(value = "code", required = true) String code,
                                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                      @RequestParam(value = "pageSize", defaultValue = "8") Integer pageSize) {
        return null;
    }


    //新闻详情
    @GetMapping("details")
    @ApiOperation(value = "新闻详情", notes = "根据id获取新闻详情", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "新闻id", required = true, dataType = "String", paramType = "query"),
    })
    public ResponseBean<News> getNewsDetailsById(@RequestParam(value = "id", required = true) String id) {
        return null;
    }
}
