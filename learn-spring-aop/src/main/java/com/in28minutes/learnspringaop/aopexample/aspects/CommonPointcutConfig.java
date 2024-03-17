package com.in28minutes.learnspringaop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {
    @Pointcut("execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..) )")
    public void businessPackageConfig(){}

    @Pointcut("bean(*Service*)")
    public void allPackageConfigUsingBean (){}
}
