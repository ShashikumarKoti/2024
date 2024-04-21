//package com.skoti.learning.aspect;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
//@Component
//@Aspect
//@Slf4j
//public class LoggingAdvicebkp {
//
//    @Pointcut(value = "execution(* com.skoti.learning.service.ProductService.*(..))")
//    public void myPointcut() {
//
//    }
//
//    @Pointcut(value = "execution(* com.skoti.learning.controller.ProductController.*(..))")
//    private void
//    printLogs() {
//    }
//
//    @Around(value = "myPointcut()")
//    public Object applicationLogger(ProceedingJoinPoint pjp) throws Throwable {
//        ObjectMapper mapper = new ObjectMapper();
//        String className = pjp.getTarget().getClass().toString();
//        String methodName = pjp.getSignature().getName();
//        Object[] args = pjp.getArgs();
//
//        log.info("Method invoked " + className + " : " + methodName + "()" + " arguments: "
//                + mapper.writeValueAsString(args));
//
//        Object responseObject = pjp.proceed();
//        log.info(className + " : " + methodName + "()" + " Response: " + mapper.writeValueAsString(responseObject));
//        return responseObject;
//    }
//
//    @Around(value = "printLogs()")
//    public void logsAroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println(
//                "The method aroundAdvice() before invocation of the method "
//                        + pjp.getSignature().getName()
//                        + " method");
//        try {
//			pjp.proceed();
//		} finally {
//        }
//        System.out.println(
//                "The method aroundAdvice() after invocation of the method "
//                        + pjp.getSignature().getName()
//                        + " method");
//    }
//
//}
