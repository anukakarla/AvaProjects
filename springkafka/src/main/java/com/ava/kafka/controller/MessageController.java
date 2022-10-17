package com.ava.kafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ava.kafka.kafka.kafkaProducer;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class MessageController {
	
	private kafkaProducer kafkaproducer;
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestParam("message") String message) {
		kafkaproducer.sendMessage(message);
		return ResponseEntity.ok("message sent to the topic");
		
		
	}
	
	
	
	
	

}
