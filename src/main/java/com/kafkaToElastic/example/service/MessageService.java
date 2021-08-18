package com.kafkaToElastic.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kafkaToElastic.example.producer.MessageProducer;

@Service
public class MessageService {

	@Autowired
	MessageProducer producer;
	
	public void sendMessage(String message) {
		producer.sendMessage(message);
	}
}
