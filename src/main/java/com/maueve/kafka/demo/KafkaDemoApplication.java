package com.maueve.kafka.demo;

import com.maueve.kafka.demo.consumers.KafkaConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class KafkaDemoApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(KafkaDemoApplication.class, args);

        /*
        ConfigurableApplicationContext context = SpringApplication.run(KafkaDemoApplication.class, args);
        KafkaConsumer consumer = context.getBean(KafkaConsumer.class);

        consumer.latch.await(5, TimeUnit.SECONDS);

         */



    }


    @Bean
    public KafkaConsumer messageListener() {
        return new KafkaConsumer();
    }





}
