package com.example.notification.demo.messaging;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {


    @KafkaListener (topics = "signupnotificationtopic")
    public void consume(String message) {

        System.out.print("Signup Success Nofitied: " + message);
    }


}
