package com.springboot.cloud.eurekaserver;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	
@RequestMapping("/rest/message/server")
public String getMessage(){
	
	return "Welcome Microservice...";
}
	
}
