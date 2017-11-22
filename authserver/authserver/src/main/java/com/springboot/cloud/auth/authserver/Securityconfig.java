package com.springboot.cloud.auth.authserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class Securityconfig extends GlobalAuthenticationConfigurerAdapter  {

	
	public void init(AuthenticationManagerBuilder auth) throws Exception{
		
		auth.inMemoryAuthentication().withUser("root").password("password").roles("USER")
		.and().withUser("dhruv").password("sharma").roles("USER", "ADMIN");
	}
	
	
	
}
