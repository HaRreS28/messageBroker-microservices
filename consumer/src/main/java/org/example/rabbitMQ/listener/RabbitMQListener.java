package org.example.rabbitMQ.listener;

import org.example.message.MessageRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class RabbitMQListener {

    @RabbitListener(queues = "myQueue")
    public void listener(MessageRequest messageRequest) {
        log.info("Received through rabbitMQ: {}",messageRequest);
    }
}
