package com.in28minutes.learnspringaop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
    private Logger logger = LoggerFactory.getLogger(getClass());
    //Pointcut - When?
    @Before("execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))")
    public void logMethodCallBeforeExecution(JoinPoint joinPoint){
        // Logic - What
        logger.info("Before Aspect Method is called - {}", joinPoint);
        //calculateMax 호출되기전에 인터셉트 가능
    }

    @After("execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))")
    public void logMethodCallAfterExecution(JoinPoint joinPoint){
        // Logic - What
        logger.info("After Aspect - {} has excuted", joinPoint);
        //calculateMax 호출되기전에 인터셉트 가능
    }
}
