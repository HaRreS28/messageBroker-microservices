package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(KafkaTemplate<String,String> kafkaTemplate) {
//        return args -> {
//          kafkaTemplate.send("newTopic","Hello kafka");
//        };
//    }
}
