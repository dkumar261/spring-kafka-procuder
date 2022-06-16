package com.practice.springmvc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;

@SpringBootTest( webEnvironment = WebEnvironment.RANDOM_PORT)
class SpringmvcApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void contextLoads() throws Exception {
		
		restTemplate.exchange("http://localhost:" + port + "/hello", HttpMethod.GET, null, String.class);
		System.out.println("TEST");
	}

}
