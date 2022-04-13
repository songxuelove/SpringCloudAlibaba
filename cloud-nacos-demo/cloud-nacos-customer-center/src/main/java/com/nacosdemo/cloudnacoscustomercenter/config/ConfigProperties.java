package com.nacosdemo.cloudnacoscustomercenter.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @author songxue
 * @date 2022-03-21 11:07
 */

@RefreshScope
@Component
@Data
public class ConfigProperties {

    @Value("${test:0}")
    private String test;

    @Value("${test1:0}")
    private String test1;

    @Value("${test2:0}")
    private String test2;

    @Value("${resource.test3:0}")
    private String test3;

}
