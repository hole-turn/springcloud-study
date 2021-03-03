package com.xlh.cloud.controller;

import com.xlh.cloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: xielinhao
 * @title: SendMessageController
 * @projectName: springcloud-studying
 * @description:
 * @date: 17:20 2021/3/1
 */
@RestController
public class SendMessageController {
    @Resource
    private IMessageProvider messageProvider;

    @GetMapping(value = "/send")
    public String sendMessage(){
        return messageProvider.send();
    }
}
