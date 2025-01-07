package com.skoti.learning.config;

//import com.skoti.learning.interceptors.BasicAuthInterceptor;
//import com.skoti.learning.interceptors.UserInterceptor;
import com.skoti.learning.interceptors.TInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class UserInterceptorConfig extends WebMvcConfigurationSupport {
//    @Autowired
//    private UserInterceptor userInterceptor;

    @Autowired
    //private TestInterceptor testInterceptor;

//    @Autowired
//    private BasicAuthInterceptor basicAuthInterceptor;

    private TInterceptor tInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
    //    registry.addInterceptor(userInterceptor).order(2);//.excludePathPatterns("/v1/api/users");;
    //    registry.addInterceptor(testInterceptor).order(1).addPathPatterns("/**");//.excludePathPatterns("/v1/orders");
     //   registry.addInterceptor(basicAuthInterceptor).addPathPatterns("/products/new");
        registry.addInterceptor(tInterceptor).order(1).addPathPatterns("/**");//.excludePathPatterns("/v1/orders");
    }
}
