package com.heping.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect2 {
    @Pointcut("execution(* com.heping.aspect.service.HelloService.sayHello(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void before() {
        System.out.println("helloService before......");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("helloService after......");
    }
}
