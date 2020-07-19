package com.mctc.mctcapidoc;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "会员")
@RestController
@RequestMapping(value = "/memder")
public class MemberController {


    @PostMapping("apply_for")
    @ApiOperation(value = "入会申请", notes = "入会申请提交", produces = "application/json")
    public ResponseBean<String> applyForMember(@RequestBody ApplyFrom from) {
        return null;
    }
}
