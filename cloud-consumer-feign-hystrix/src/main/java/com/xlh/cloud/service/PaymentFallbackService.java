package com.xlh.cloud.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author: xielinhao
 * @title: PaymentFallbackService
 * @projectName: springcloud-studying
 * @description:
 * @date: 13:08 2021/2/25
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "PaymentFallbackService  OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "PaymentFallbackService   timeout";
    }
}
