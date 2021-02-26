package com.xlh.cloud.service;

import com.xlh.cloud.entity.Payment;

/**
 * @author: xielinhao
 * @title: PaymentService
 * @projectName: springcloud-studying
 * @description:
 * @date: 16:57 2021/2/22
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
