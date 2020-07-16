package com.mctc.mctcapidoc.web;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "CEO会客厅")
@RestController
@RequestMapping(value = "/ceo")
public class CEOLivingRoomController {

    //CEO会客厅	"三个图片；（首页大图，小图，列表图）有播放；
    //点击更多：到会员中心，下面CEO会客厅列表"
}
