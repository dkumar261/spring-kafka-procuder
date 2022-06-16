package com.spring.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.kafka.producer.model.User;
import com.spring.kafka.producer.service.KafKaProducerService;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaProducerController {

	@Autowired
	private  KafKaProducerService producerService;


	@PostMapping(value = "/publish")
	public String sendJsonToKafkaTopic(@RequestBody User user) {
		producerService.sendCustomMessage(user);
		return "Message Sent !!";
	}
}