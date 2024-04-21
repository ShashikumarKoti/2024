package com.skoti.learning.config;

import com.skoti.learning.interceptors.BasicAuthInterceptor;
import com.skoti.learning.interceptors.TestInterceptor;
import com.skoti.learning.interceptors.UserInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class UserInterceptorConfig extends WebMvcConfigurerAdapter {
    @Autowired
    private UserInterceptor userInterceptor;

    @Autowired
    private TestInterceptor testInterceptor;

    @Autowired
    private BasicAuthInterceptor basicAuthInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userInterceptor).order(2);//.excludePathPatterns("/v1/api/users");;
        registry.addInterceptor(testInterceptor).order(1).addPathPatterns("/**");//.excludePathPatterns("/v1/orders");
        registry.addInterceptor(basicAuthInterceptor).addPathPatterns("/products/new");
    }
}
