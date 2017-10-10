package com.springboot.cloud.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/rest/message/client")
public class MessageResource {

	@Autowired
	RestTemplate restTemplate;
	
	String url="http://message-microservice/rest/message/server";
	
	@GetMapping
	public String getMessage()
	{
		return  restTemplate.getForObject(url, String.class);
	}
}
