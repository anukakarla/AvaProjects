package com.ava.kafka.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.ava.kafka.bean.User;

@Service
public class JsonConsumer {
	
	private static final Logger LOGGER=LoggerFactory.getLogger(JsonConsumer.class);
	@KafkaListener(topics="kafkaGuide_Json"  , groupId="myGroup1")
	public void consume(User user) {
		LOGGER.info(String.format("message received", user.toString()));
		
		
	}


}
