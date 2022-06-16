package com.spring.kafka.producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.spring.kafka.producer.constant.AppConstants;
import com.spring.kafka.producer.model.User;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class KafKaProducerService {

	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;
	
	public void sendCustomMessage(User user) {
		log.info(String.format("Message sent -> %s", user));
		kafkaTemplate.send(AppConstants.TOPIC_NAME,user);
	}
}