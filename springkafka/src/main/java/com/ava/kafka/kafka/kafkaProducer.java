package com.ava.kafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class kafkaProducer {
	private static final Logger LOGGER=LoggerFactory.getLogger(kafkaProducer.class);
	
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void  sendMessage(String message) {
		LOGGER.info(String.format("Message sent %s", message));
		kafkaTemplate.send("kafkaGuide", message);
		
	}
	



	
}
