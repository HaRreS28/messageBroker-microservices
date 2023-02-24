package org.example.kafka.web;

import org.example.message.MessageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {
    private final KafkaTemplate<String, MessageRequest> kafkaTemplate;

    @PostMapping
    public void publish(@RequestBody MessageRequest message) {
        kafkaTemplate.send("newTopic", message);
    }
}
