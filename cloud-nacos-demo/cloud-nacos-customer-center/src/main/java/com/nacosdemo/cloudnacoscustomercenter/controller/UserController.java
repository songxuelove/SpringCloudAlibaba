package com.nacosdemo.cloudnacoscustomercenter.controller;

import com.nacosdemo.cloudnacoscustomercenter.config.ConfigProperties;
import com.nacosdemo.cloudnacoscustomercenter.service.ConsoleApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author songxue
 * @date 2022-03-21 9:13
 */
@RestController
public class UserController {


    @Resource
    ConfigProperties properties;
    @Resource
    ConsoleApiService consoleApiService;

    @GetMapping("/test")
    public String getUser() {

        return "test=" + properties.getTest()
                + "; test1=" + properties.getTest1()
                + "; test2=" + properties.getTest2()
                + "; test3=" + properties.getTest3()
                ;
    }


    @GetMapping("/test1")
    public String getUser1() {

        return consoleApiService.test();
    }

}
