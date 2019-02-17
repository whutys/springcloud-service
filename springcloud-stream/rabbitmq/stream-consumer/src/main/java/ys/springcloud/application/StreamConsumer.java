package ys.springcloud.application;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
public class StreamConsumer {

    @StreamListener("my_stream_channel")
    public void readMsg(String msg){
        System.out.println(msg);
    }
}
