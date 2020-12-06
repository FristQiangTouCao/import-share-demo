package com.hongtian.controller2;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weed
 * @date 2020/12/1 0001 11:44
 * @description
 */
@RestController
@Api(tags = "测试控制器2")
public class Controller2 {
    @GetMapping("/test2")
    @ApiOperation("测试接口2")
    public Object test(){
        return "ok";
    }
}
