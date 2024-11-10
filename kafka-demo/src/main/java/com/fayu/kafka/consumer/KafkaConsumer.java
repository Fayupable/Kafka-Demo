package com.fayu.kafka.consumer;

import com.fayu.kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

//    @KafkaListener(topics = "fayu", groupId = "myGroup")
    public void consumeMessage(String message) {
        log.info(String.format("Consuming the message from fayu Topic: %s", message));
    }

    @KafkaListener(topics = "fayu", groupId = "myGroup")
    public void consumeJsonMessage(Student student){
        log.info(String.format("Consuming the message from fayu Topic: %s", student.toString()));
    }



}
