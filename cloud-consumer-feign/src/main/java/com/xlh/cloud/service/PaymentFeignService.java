package com.xlh.cloud.service;

import com.xlh.cloud.entity.CommonResult;
import com.xlh.cloud.entity.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: xielinhao
 * @title: PaymentFeignService
 * @projectName: springcloud-studying
 * @description:
 * @date: 16:11 2021/2/24
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    CommonResult getPaymentById(@PathVariable("id") Long id);
}
