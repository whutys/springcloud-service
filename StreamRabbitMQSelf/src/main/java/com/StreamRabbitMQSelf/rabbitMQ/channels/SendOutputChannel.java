/**
 *
 */
package com.StreamRabbitMQSelf.rabbitMQ.channels;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author mazhen
 *
 */
public interface SendOutputChannel {
    // 这里可以定义不同的通道
    String MSG_SENDER = "msgSender"; // 通道名

    @Output(SendOutputChannel.MSG_SENDER)
    MessageChannel msgSender();

}

