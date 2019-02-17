package ys.springcloud.stream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface SendMessageInterface {

    String OUTPUT="msgSender";
    @Output(OUTPUT)
    MessageChannel sendMsg();
}
