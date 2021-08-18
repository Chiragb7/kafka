package com.kafkaToElastic.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafkaToElastic.example.service.MessageService;

@RestController
@RequestMapping("/message")
@Validated
public class MessageController {
	
	@Autowired
	MessageService service;
	
	@PostMapping()
	public void postMessage(@RequestBody String message) {
		service.sendMessage(message);
	}
}
