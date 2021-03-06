package com.xlh.cloud.dao;

import com.xlh.cloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: xielinhao
 * @title: PaymentDao
 * @projectName: springcloud-studying
 * @description:
 * @date: 16:43 2021/2/22
 */
@Mapper
public interface ProviderPaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
