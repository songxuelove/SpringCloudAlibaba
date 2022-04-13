package com.nacosdemo.cloudnacoscustomercenter.service.impl;

import com.nacosdemo.cloudnacoscustomercenter.service.ConsoleApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author songxue
 * @date 2022-03-21 9:10
 */

@Slf4j
@Component
public class ConsoleApiServiceFallback implements ConsoleApiService {

    @Override
    public String test() {
        log.error("test fail :remote call console-center test method fail");
        return null;
    }

}
