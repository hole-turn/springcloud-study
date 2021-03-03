package com.xlh.cloud.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xielinhao
 * @title: ConfigClientController
 * @projectName: springcloud-studying
 * @description:
 * @date: 15:52 2021/2/26
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    private String getConfigInfo() {
        return configInfo;
    }
}
