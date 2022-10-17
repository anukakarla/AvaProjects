package com.ava.kafka.service;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import com.ava.kafka.bean.Response;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class WebService {
	
	private final SimpMessagingTemplate messagingTemplate;
	
	public void notifyFrontend(String message) {
		Response response=new Response(message);
		messagingTemplate.convertAndSend("/topic/messages", response);
		
		
	}

}
