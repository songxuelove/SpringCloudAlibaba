package com.nacosdemo.cloudnacoscustomercenter.service;

import com.nacosdemo.cloudnacoscustomercenter.service.impl.ConsoleApiServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author songxue
 * @date 2022-03-21 9:09
 */

@FeignClient(value = "console-center", fallback = ConsoleApiServiceFallback.class)
public interface ConsoleApiService {

    @GetMapping("/test")
    String test();

}
