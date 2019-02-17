/**
 *
 */
package com.StreamRabbitMQSelf.rabbitMQ.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;

import com.StreamRabbitMQSelf.model.CdkeyParameter;
import com.StreamRabbitMQSelf.rabbitMQ.channels.ReceiveInputChannel;
import com.StreamRabbitMQSelf.rabbitMQ.service.ReceviveMessage;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * @author mazhen
 * 消息消费实现类
 */
@EnableBinding(ReceiveInputChannel.class)
public class ReceviveMessageImpl implements ReceviveMessage {

    /**
     * 引入日志，注意都是"org.slf4j"包下
     */
    private final static Logger logger = LoggerFactory.getLogger(ReceviveMessageImpl.class);

    @Override
    @StreamListener(ReceiveInputChannel.MSG_RECEIVER)
    public void receiveStr(Message<String> message) {

        String s = message.getPayload();
        logger.info("[receiveStr]消息接收："+s);
        logger.info("[receiveStr]消息接收处理："+JSONObject.parseObject(s).getString("data"));

        CdkeyParameter cdkeyParameter = JSON.parseObject(JSONObject.parseObject(s).getString("data"), CdkeyParameter.class);
        logger.info("CdkeyParameter的参数："+cdkeyParameter.getVersion());
    }

}

