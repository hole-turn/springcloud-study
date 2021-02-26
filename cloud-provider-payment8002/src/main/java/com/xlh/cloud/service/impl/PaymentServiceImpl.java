package com.xlh.cloud.service.impl;

import com.xlh.cloud.dao.ProviderPaymentDao;
import com.xlh.cloud.entity.Payment;
import com.xlh.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: xielinhao
 * @title: PaymentServiceImpl
 * @projectName: springcloud-studying
 * @description:
 * @date: 16:57 2021/2/22
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private ProviderPaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
