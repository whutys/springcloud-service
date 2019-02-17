package ys.springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ys.springcloud.stream.SendMessageInterface;

import java.util.UUID;

@RestController
public class SendMsgController {

    @Autowired
    private SendMessageInterface sendMessageInterface;

    @RequestMapping("/sendMsg")
    public String senMsg(){
        String msg= UUID.randomUUID().toString();
        System.out.println(msg);
        Message build = MessageBuilder.withPayload(msg.getBytes()).build();
        sendMessageInterface.sendMsg().send(build);
        return "success";
    }
}
