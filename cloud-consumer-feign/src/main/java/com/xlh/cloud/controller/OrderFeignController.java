package com.xlh.cloud.controller;

import com.xlh.cloud.entity.CommonResult;
import com.xlh.cloud.entity.Payment;
import com.xlh.cloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: xielinhao
 * @title: OrderFeignController
 * @projectName: springcloud-studying
 * @description:
 * @date: 16:16 2021/2/24
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
      return  paymentFeignService.getPaymentById(id);
    }

}
