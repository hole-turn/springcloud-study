package com.xlh.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: xielinhao
 * @title: ConfigClient3366
 * @projectName: springcloud-studying
 * @description:
 * @date: 17:12 2021/2/26
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient3366 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3366.class,args);
    }
}
