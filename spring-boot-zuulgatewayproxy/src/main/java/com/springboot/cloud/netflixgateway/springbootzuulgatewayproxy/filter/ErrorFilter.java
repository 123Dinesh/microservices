package com.springboot.cloud.netflixgateway.springbootzuulgatewayproxy.filter;

import com.netflix.zuul.ZuulFilter;

public class ErrorFilter extends ZuulFilter{

	 @Override
	  public String filterType() {
	    return "error";
	  }
	 
	  @Override
	  public int filterOrder() {
	    return 1;
	  }
	 
	  public boolean shouldFilter() {
	    return true;
	  }
	 
	  public Object run() {
		  System.out.println("Inside Error Filter");
		return null;
	  }
}
