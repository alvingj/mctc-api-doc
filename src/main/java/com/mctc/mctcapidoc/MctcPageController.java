package com.mctc.mctcapidoc;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "mctc官网内容服务")
@RestController
@RequestMapping(value = "/content")
public class MctcPageController {

    @GetMapping("plates")
    @ApiOperation(value = "页面板块", notes = "根据菜单code获取此菜单页面下的板块列表", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "menuCode", value = "菜单code,前后端事先约定", required = true, dataType = "String", paramType = "query")
    })
    public ResponseBean<List<Plate>> getPlatesByMenu(@RequestParam(value = "menuCode", required = true) String menuCode) {
        return null;
    }

    @GetMapping("plate_content")
    @ApiOperation(value = "板块内容", notes = "根据板块id获取内容", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "contentId", value = "板块内容id", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "pageNum", value = "页码,需要分页的内容才传此参数", required = false, dataType = "Int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数,需要分页的内容才传此参数", required = false, dataType = "Int", paramType = "query")
    })
    public ResponseBean<PlateContent> getPlateContentById(@RequestParam(value = "contentId", required = true) String contentId,
                                                          @RequestParam(value = "pageNum") Integer pageNum,
                                                          @RequestParam(value = "pageSize") Integer pageSize) {
        return null;
    }
}
