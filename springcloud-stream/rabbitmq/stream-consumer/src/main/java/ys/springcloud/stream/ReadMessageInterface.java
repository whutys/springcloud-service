package ys.springcloud.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.SubscribableChannel;

public interface ReadMessageInterface {

    String channel="my_stream_channel";
    @Input(channel)
    SubscribableChannel readMsg();
}
