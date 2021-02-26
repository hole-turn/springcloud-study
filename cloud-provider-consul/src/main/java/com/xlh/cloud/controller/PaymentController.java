package com.xlh.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author: xielinhao
 * @title: PaymentController
 * @projectName: springcloud-studying
 * @description:
 * @date: 11:05 2021/2/24
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/payment/consul")
    public String paymentConsul() {
        return "springcloud with consul: " + serverPort + "\t" + UUID.randomUUID().toString();
    }
}
