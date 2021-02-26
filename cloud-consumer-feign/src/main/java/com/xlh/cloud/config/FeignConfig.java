package com.xlh.cloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: xielinhao
 * @title: FeignConfig
 * @projectName: springcloud-studying
 * @description:
 * @date: 16:35 2021/2/24
 */
@Configuration
public class FeignConfig {
    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }
}
