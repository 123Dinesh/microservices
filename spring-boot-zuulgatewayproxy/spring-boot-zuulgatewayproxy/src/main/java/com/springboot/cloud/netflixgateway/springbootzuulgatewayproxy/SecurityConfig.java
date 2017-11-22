package com.springboot.cloud.netflixgateway.springbootzuulgatewayproxy;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class SecurityConfig  extends GlobalAuthenticationConfigurerAdapter{
	
	
	@Override
	public void init(AuthenticationManagerBuilder auth)
			throws Exception {
	
		auth.inMemoryAuthentication().withUser("dhruv").password("sharma").roles("USER");
		
	}

	
}
