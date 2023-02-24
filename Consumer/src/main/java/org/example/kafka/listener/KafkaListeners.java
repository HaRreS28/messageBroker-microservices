package org.example.kafka.listener;

import org.example.message.MessageRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaListeners {

    @KafkaListener(topics = "newTopic",groupId = "group1")
    public void listener(MessageRequest messageRequest){
        log.info("Received through kafka: {}",messageRequest);

    }
}
