package ys.springcloud.controller;


import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ys.springcloud.stream.SendMessageChannel;

import javax.annotation.Resource;
import java.util.UUID;

@RestController
public class SendMsgController {

    @Resource(name = SendMessageChannel.myOUTPUT)
    private MessageChannel sendMessageChannel;

    @RequestMapping("/sendMsg")
    public String senMsg() {
        String msg = UUID.randomUUID().toString();
        System.out.println(msg);
        Message build = MessageBuilder.withPayload(msg.getBytes()).build();
        sendMessageChannel.send(build);
        return "success";
    }

    @StreamListener(SendMessageChannel.myINPUT)
    public void receive(Message<String> message) {
        System.out.println(message.getPayload());
    }
}
