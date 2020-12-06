package com.hongtian.controller1;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weed
 * @date 2020/12/1 0001 11:25
 * @description
 */
@RestController
@Api(tags = "测试控制器1")
public class Controller1 {

    @GetMapping("/test1")
    @ApiOperation("测试接口1")
    public Object test(){
        return "ok";
    }
}
