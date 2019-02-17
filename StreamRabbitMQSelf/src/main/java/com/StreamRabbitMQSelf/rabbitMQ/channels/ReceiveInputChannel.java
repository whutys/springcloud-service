/**
 *
 */
package com.StreamRabbitMQSelf.rabbitMQ.channels;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author mazhen
 *
 */
public interface ReceiveInputChannel {
    // 这里可以定义不同的通道
    String MSG_RECEIVER = "msgReceiver"; // 通道名

    @Input(ReceiveInputChannel.MSG_RECEIVER)
    SubscribableChannel msgReceiver();

}

