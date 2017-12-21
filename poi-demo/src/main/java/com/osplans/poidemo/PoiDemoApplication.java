package com.osplans.poidemo;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.jms.Queue;

@SpringBootApplication
public class PoiDemoApplication {

    @Value("${queueName}")
    String queueName;

    @Bean
    public Queue queue() {
        System.out.println("activeMQ==="+queueName);
        return new ActiveMQQueue(queueName);
    }

	public static void main(String[] args) {
		SpringApplication.run(PoiDemoApplication.class, args);
	}
}
