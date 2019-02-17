package ys.springcloud.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface SendMessageChannel {

    String myOUTPUT ="msgSender";
    String myINPUT ="msgReceiver";
    @Output(myOUTPUT)
    MessageChannel sendMsg();

    @Input(myINPUT)
    SubscribableChannel receiveMsg();
}
