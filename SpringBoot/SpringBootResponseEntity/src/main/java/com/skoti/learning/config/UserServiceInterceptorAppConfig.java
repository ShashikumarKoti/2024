package com.skoti.learning.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class UserServiceInterceptorAppConfig  extends WebMvcConfigurerAdapter{

	   @Autowired
	   private HeaderInterceptor headerInterceptor;

	   @Override
	   public void addInterceptors(InterceptorRegistry registry) {
	      registry.addInterceptor(headerInterceptor).addPathPatterns("/**");
	   }
}
