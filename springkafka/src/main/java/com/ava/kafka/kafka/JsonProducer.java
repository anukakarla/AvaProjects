package com.ava.kafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.ava.kafka.bean.User;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class JsonProducer {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(JsonProducer.class);
	
	private KafkaTemplate<String, User> kafkaTemplate;
	
	public void sendMessage(User data) {
		LOGGER.info(String.format("message sent --> %s", data.toString()));
		Message<User> message=MessageBuilder.withPayload(data)
				.setHeader(KafkaHeaders.TOPIC,"kafkaGuide_Json").build();
		kafkaTemplate.send(message);
		
	}

}
