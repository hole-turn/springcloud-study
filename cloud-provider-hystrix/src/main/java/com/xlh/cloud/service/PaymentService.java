package com.xlh.cloud.service;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @author: xielinhao
 * @title: PaymentService
 * @projectName: springcloud-studying
 * @description:
 * @date: 17:15 2021/2/24
 */
@Service
public class PaymentService {
    /**
     * 正常访问 肯定ok
     *
     * @param id
     * @return
     */
    public String paymentInfo(Integer id) {
        return "线程池:  " + Thread.currentThread().getName() + "  paymentInfo_OK,id:   " + id;
    }

    @HystrixCommand(fallbackMethod = "paymentInfo_TimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    public String paymentInfo_TimeOut(Integer id) {
        int timeNumber=3;
//        int age=10/0;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "线程池:  " + Thread.currentThread().getName() + "  paymentInfo_TimeOut,id:   " + id+"\t"+" 耗时3秒";
    }

    public String paymentInfo_TimeOutHandler(Integer id) {
    return "线程池:  " + Thread.currentThread().getName() + "  paymentInfo_TimeOutHandler,id:   " + id+"\t"+"Handler";
    }

    //服务熔断
    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",commandProperties = {
        @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),//是否开启断路器
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value = "10"),//请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),//时间窗口期
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")//失败率达到多少后跳闸
            }
    )
    public String paymentCircuitBreaker(@PathVariable("id") Long id){
        if (id<0){
            throw new RuntimeException("id不能为负数");
        }
        String serialNumber = IdUtil.simpleUUID();
        return Thread.currentThread().getName()+"\t"+"调用成功"+serialNumber;
    }
    public String paymentCircuitBreaker_fallback(@PathVariable("id") Long id){
        return "id不能负数 请稍后再试";
    }
}
