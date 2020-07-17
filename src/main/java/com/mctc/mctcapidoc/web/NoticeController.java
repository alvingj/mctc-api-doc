package com.mctc.mctcapidoc.web;

import com.github.pagehelper.PageInfo;
import com.mctc.mctcapidoc.model.CEOLivingRoom;
import com.mctc.mctcapidoc.model.Notice;
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

/**
 * @Description: java类作用描述
 * @Author: gongjun
 * @CreateDate: 2020/7/17$ 15:25$
 * @UpdateUser:
 * @UpdateDate: 2020/7/17$ 15:25$
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
@Api(tags = "俱乐部公告")
@RestController
@RequestMapping(value = "/notice")
public class NoticeController {

    //俱乐部公告获取
    //notice
    //"后台配置公告模块；页面按照样式ok；
    //点击更多：进入公告列表页面（UI有）"

    @GetMapping("homepage")
    @ApiOperation(value = "首页-俱乐部公告", notes = "用于首页", produces = "application/json")
    public ResponseBean<List<Notice>> getHomepageNotices() {
        return null;
    }

    @GetMapping("list")
    @ApiOperation(value = "俱乐部公告列表", notes = "用于更多-俱乐部公告列表", produces = "application/json")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", required = true, dataType = "Int", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页条数", required = true, dataType = "Int", paramType = "query")
    })
    public ResponseBean<PageInfo<Notice>> getNotices(
            @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(value = "pageSize", defaultValue = "8") Integer pageSize) {
        return null;
    }
}
