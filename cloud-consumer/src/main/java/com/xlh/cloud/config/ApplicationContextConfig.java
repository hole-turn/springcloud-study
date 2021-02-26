package com.xlh.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: xielinhao
 * @title: ApplicationContextConfig
 * @projectName: springcloud-studying
 * @description:
 * @date: 11:07 2021/2/23
 */
@Configuration
public class ApplicationContextConfig {


    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
