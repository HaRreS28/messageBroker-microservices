package org.example.rabbitMQ.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQQueue {

    @Bean
    public Queue myQueue(){
        return new Queue("myQueue",false);
    }

}
