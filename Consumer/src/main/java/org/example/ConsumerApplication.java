package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(KafkaTemplate<String,String> kafkaTemplate) {
//        return args -> {
//          kafkaTemplate.send("newTopic","Hello kafka");
//        };
//    }
}
