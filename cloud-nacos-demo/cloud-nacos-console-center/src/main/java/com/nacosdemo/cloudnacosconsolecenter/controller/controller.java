package com.nacosdemo.cloudnacosconsolecenter.controller;


import com.nacosdemo.cloudnacoscommonutils.utils.TestUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author songxue
 * @date 2022-03-17 16:58
 */
@RestController
public class controller {

    @GetMapping("/test")
    public String test() {
        TestUtil.test();
        System.out.println("11111");
        return "dudududududu";
    }

}
