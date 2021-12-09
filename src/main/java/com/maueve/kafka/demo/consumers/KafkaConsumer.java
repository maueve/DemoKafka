package com.maueve.kafka.demo.consumers;

import org.springframework.kafka.annotation.KafkaListener;

import java.util.concurrent.CountDownLatch;


public class KafkaConsumer {

    public CountDownLatch latch = new CountDownLatch(3);

    @KafkaListener(topics = "${message.topic.name}", groupId = "fenix", containerFactory = "fooKafkaListenerContainerFactory")
    public void listenGroupFoo(String message) {
        System.out.println("Mensaje recibido del grupo 'fenix': " + message);
        //latch.countDown();
    }

}
