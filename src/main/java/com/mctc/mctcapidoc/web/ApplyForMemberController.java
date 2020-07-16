package com.mctc.mctcapidoc.web;


import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "加入我们")
@RestController
@RequestMapping(value = "/memder")
public class ApplyForMemberController {
    //入会申请	输入框，多少个，顺序后台配置；静态时候按照UI做；后面让其他人 调整；
}
