package com.xlh.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author: xielinhao
 * @title: GatewayApplicaiton
 * @projectName: springcloud-studying
 * @description:
 * @date: 16:22 2021/2/25
 */
@EnableEurekaClient
@SpringBootApplication
public class GatewayMain9527 {
    public static void main(String[] args) {
        SpringApplication.run(GatewayMain9527.class,args);
    }
}
