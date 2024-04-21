package com.skoti.learning.aspect;

import com.skoti.learning.entity.Product;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

@Component
@Aspect
@Slf4j
public class LoggingAdvice {

    @Pointcut(value = "execution(* com.skoti.learning.service.ProductService.*(..))")
    public void myPointcut() {

    }

    @Before(value = "myPointcut()")
    public void beforeLogger(JoinPoint joinPoint) throws Throwable {
        log.info("@Before is called");
    }

    @After(value = "myPointcut()")
    public void afterLogger(JoinPoint joinPoint) throws Throwable {
        log.info("@After is called");
    }

    @AfterReturning(value = "myPointcut()",returning = "productList")
    public void afterReturning(JoinPoint joinPoint, List<Product> productList) throws Throwable {
        log.info("@AfterReturning is called :{} {} {}", joinPoint.getClass().getName(), joinPoint.getSignature().getName(),productList);
    }

    @AfterThrowing(value = "myPointcut()",throwing = "rte")
    public void afterReturning(JoinPoint joinPoint, RuntimeException rte) throws Throwable {
        log.info("@AfterThrowing is called :{} {} {}", joinPoint.getClass().getName(), joinPoint.getSignature().getName(),rte.getMessage());
    }

    @Around(value = "myPointcut()")
    public Object logsAroundAdvice(ProceedingJoinPoint proJoinPoint)
            throws Throwable {
        ObjectMapper mapper = new ObjectMapper();
        log.info("The method aroundAdvice() before invocation of the method {} method", proJoinPoint.getSignature().getName());
        try {
            Object responseObject = proJoinPoint.proceed();
            String productList = mapper.writeValueAsString(responseObject);
            log.info("productList: {}", productList);
            return responseObject;
        } finally {
        }
    }
}
