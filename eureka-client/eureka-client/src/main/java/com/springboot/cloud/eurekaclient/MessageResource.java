package com.springboot.cloud.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MessageResource {

	@Autowired
	RestTemplate restTemplate;
	
	String url="http://MESSAGE-MICROSERVICE/rest/message/server";
	
	@RequestMapping("/rest/message")
	public String getMessage()
	{
		System.out.println("enter in message service");
		return  restTemplate.getForObject(url, String.class);
	}
}
