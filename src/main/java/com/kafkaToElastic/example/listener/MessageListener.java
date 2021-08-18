package com.kafkaToElastic.example.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

	@KafkaListener(topics = "${kafka.topic}", groupId = "${kafka.server.hosts}")
	public void listenGroupFoo(String message) {
	    System.out.println("Received Message in group testGroup: " + message);
	}
}
