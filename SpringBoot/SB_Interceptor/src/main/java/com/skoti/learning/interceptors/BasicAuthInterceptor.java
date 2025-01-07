//package com.skoti.learning.interceptors;
//
//import com.skoti.learning.exception.APIErrors;
//import com.skoti.learning.exception.APIException;
//
//import java.nio.charset.StandardCharsets;
//import java.util.Base64;
//import java.util.HashSet;
//import java.util.Objects;
//import java.util.Set;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpStatus;
//import org.springframework.lang.Nullable;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//@Component
//@Slf4j
//public class BasicAuthInterceptor implements HandlerInterceptor {
//    private static final String USERNAME = "admin";
//    private static final String PASSWORD = "admin";
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        log.info("BasicAuthInterceptor::preHandle()");
//
//        String authHeader = request.getHeader("Authorization");
//        System.out.println("authHeader: " +  authHeader);
//        if (authHeader != null && authHeader.startsWith("Basic ")) {
//
//            String base64Credentials = authHeader.substring("Basic ".length());
//            System.out.println("base64Credentials: " +  base64Credentials);
//            byte[] decodedCredentials = Base64.getDecoder().decode(base64Credentials);
//            System.out.println("decodedCredentials: " +  decodedCredentials);
//            String credentials = new String(decodedCredentials, StandardCharsets.UTF_8);
//            System.out.println("credentials: " +  credentials);
//
//            String[] parts = credentials.split(":");
//            String username = parts[0];
//            System.out.println("username: "+ username);
//            String password = parts[1];
//            System.out.println("password: "+ password);
//
//            if (USERNAME.equals(username) && PASSWORD.equals(password)) {
//                return true;
//            }
//        }
//
//        response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");
//        return false;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        log.info("BasicAuthInterceptor::postHandle()");
//    }
//
//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        log.info("BasicAuthInterceptor::afterCompletion()");
//    }
//}