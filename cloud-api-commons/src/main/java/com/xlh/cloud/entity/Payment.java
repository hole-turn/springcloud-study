package com.xlh.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author: xielinhao
 * @title: Payment
 * @projectName: springcloud-studying
 * @description:
 * @date: 16:38 2021/2/22
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
