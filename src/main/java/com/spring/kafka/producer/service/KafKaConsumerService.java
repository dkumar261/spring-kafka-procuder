package com.spring.kafka.producer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.spring.kafka.producer.constant.AppConstants;
import com.spring.kafka.producer.model.User;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafKaConsumerService {

	@KafkaListener(topics = AppConstants.TOPIC_NAME, groupId = AppConstants.GROUP_ID)
	public void consume(User message) {
		log.info(String.format("Message recieved -> %s", message));
	}
}