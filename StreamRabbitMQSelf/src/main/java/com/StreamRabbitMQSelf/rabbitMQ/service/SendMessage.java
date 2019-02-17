/**
 *
 */
package com.StreamRabbitMQSelf.rabbitMQ.service;

import org.springframework.messaging.Message;

/**
 * @author mazhen
 * 消息生产类--接口
 */
public interface SendMessage {

    public void sendMsgStr(String str);
}

