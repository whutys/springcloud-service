/**
 *
 */
package com.StreamRabbitMQSelf.rabbitMQ.service;

import org.springframework.messaging.Message;

/**
 * @author mazhen
 * 消息消费类--接口
 */
public interface ReceviveMessage {
    public void receiveStr(Message<String> message);
}

