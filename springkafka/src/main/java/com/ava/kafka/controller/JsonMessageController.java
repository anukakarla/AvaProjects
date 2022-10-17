package com.ava.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ava.kafka.bean.User;
import com.ava.kafka.kafka.JsonProducer;
import com.ava.kafka.service.WebService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class JsonMessageController {
	@Autowired
	private WebService service;

	@Autowired
	private JsonProducer jsonProducer;

	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody User user) {
		jsonProducer.sendMessage(user);
		service.notifyFrontend(user.getLastName());
//		service.notifyFrontend(user);

		return ResponseEntity.ok("json message sent to kafka topic");

	}

}
