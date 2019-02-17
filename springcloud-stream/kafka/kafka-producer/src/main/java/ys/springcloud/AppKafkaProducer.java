package ys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import ys.springcloud.stream.SendMessageInterface;

@SpringBootApplication
@EnableBinding(SendMessageInterface.class)
public class AppKafkaProducer {
    public static void main(String[] args) {
        SpringApplication.run(AppKafkaProducer.class,args);
    }
}
