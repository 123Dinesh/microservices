package com.springboot.cloud.netflixgateway.springbootzuulgatewayproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.springboot.cloud.netflixgateway.springbootzuulgatewayproxy.filter.ErrorFilter;
import com.springboot.cloud.netflixgateway.springbootzuulgatewayproxy.filter.PostFilter;
import com.springboot.cloud.netflixgateway.springbootzuulgatewayproxy.filter.PreFilter;
import com.springboot.cloud.netflixgateway.springbootzuulgatewayproxy.filter.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableEurekaClient
public class SpringBootZuulgatewayproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZuulgatewayproxyApplication.class, args);
	}
	
	@Bean
	public PreFilter preFilter() {
	    return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
	    return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
	    return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
	    return new RouteFilter();
	}
	
}
