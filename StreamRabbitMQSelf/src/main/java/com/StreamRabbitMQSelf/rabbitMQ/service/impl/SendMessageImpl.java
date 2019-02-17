/**
 *
 */
package com.StreamRabbitMQSelf.rabbitMQ.service.impl;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

import com.StreamRabbitMQSelf.rabbitMQ.channels.SendOutputChannel;
import com.StreamRabbitMQSelf.rabbitMQ.service.SendMessage;


/**
 * @author mazhen
 * 消息生产实现类
 */
@EnableBinding(SendOutputChannel.class)
public class SendMessageImpl implements SendMessage {

    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(SendMessageImpl.class);

    @Autowired
    private SendOutputChannel sendOutputChannel;

    @Override
    public void sendMsgStr(String str) {
        if (!sendOutputChannel.msgSender().send(MessageBuilder.withPayload(str).build())) {
            logger.error("生产者消息发送失败：" + str);
        }
        logger.info("[sendMsgStr]生产者消息发送:"+str);
    }

}

