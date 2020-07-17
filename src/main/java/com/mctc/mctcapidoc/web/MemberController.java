package com.mctc.mctcapidoc.web;


import com.mctc.mctcapidoc.model.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "会员")
@RestController
@RequestMapping(value = "/memder")
public class MemberController {


    //砖石会员展示-精选
    //MemderDisplay
    //参考UI，没有更多；左右轮换4个
    @GetMapping("homepage")
    @ApiOperation(value = "首页-砖石会员展示", notes = "用于首页", produces = "application/json")
    public ResponseBean<List<MemberShow>> getHomepageMember() {
        return null;
    }


    //入会申请	输入框，多少个，顺序后台配置；静态时候按照UI做；后面让其他人 调整；
    @GetMapping("applyfor_member_field")
    @ApiOperation(value = "入会申请表单字段定制", notes = "用于渲染表单页面", produces = "application/json")
    public ResponseBean<ApplyForMemberField> getApplyForMemberField() {
        return null;
    }

    @PostMapping("apply_for")
    @ApiOperation(value = "入会申请", notes = "入会申请提交", produces = "application/json")
    public ResponseBean<String> applyForMember(@RequestBody ApplyForMemberFrom from) {
        return null;
    }
}
