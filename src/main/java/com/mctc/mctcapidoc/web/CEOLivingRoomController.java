package com.mctc.mctcapidoc.web;

import com.github.pagehelper.PageInfo;
import com.mctc.mctcapidoc.model.Activity;
import com.mctc.mctcapidoc.model.CEOLivingRoom;
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

@Api(tags = "CEO会客厅")
@RestController
@RequestMapping(value = "/ceo")
public class CEOLivingRoomController {

    //CEO会客厅-精选
    //CEOLivingRoom
    //"三个图片；（首页大图，小图，列表图）有播放；
    //点击更多：到会员中心，下面CEO会客厅列表"

    @GetMapping("homepage")
    @ApiOperation(value = "首页-CEO会客厅", notes = "用于首页", produces = "application/json")
    public ResponseBean<List<CEOLivingRoom>> getHomepageCEOLivingRoom() {
        return null;
    }

    @GetMapping("list")
    @ApiOperation(value = "CEO会客厅列表", notes = "用于会员中心-CEO会客厅菜单", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "Int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数", required = true, dataType = "Int", paramType = "query")
    })
    public ResponseBean<PageInfo<CEOLivingRoom>> getCEOLivingRoom(
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "8") Integer pageSize) {
        return null;
    }

    @GetMapping("details")
    @ApiOperation(value = "CEO会客厅详情", notes = "根据id获取详情", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "String", paramType = "query"),
    })
    public ResponseBean<CEOLivingRoom> getCEOLivingRoomDetailsById(@RequestParam(value = "id", required = true) String id) {
        return null;
    }
}
