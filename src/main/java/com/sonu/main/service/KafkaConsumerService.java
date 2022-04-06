package com.sonu.main.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = {"sonu"},groupId="mygroup")
    public void consumerMessage(String message) {
        System.out.println("Cosumer--Message--" + message);
    }

}
