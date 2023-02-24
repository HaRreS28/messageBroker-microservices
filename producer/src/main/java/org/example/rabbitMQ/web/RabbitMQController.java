package org.example.rabbitMQ.web;

import org.example.message.MessageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/message/rabbit")
@RequiredArgsConstructor
public class RabbitMQController {
    private final RabbitTemplate rabbitTemplate;

    @PostMapping
    public void sendMessage(@RequestBody MessageRequest messageRequest) {
        rabbitTemplate.convertAndSend("myQueue",messageRequest);
    }
}
