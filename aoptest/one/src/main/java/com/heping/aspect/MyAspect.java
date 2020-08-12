package com.heping.aspect;

import com.heping.definition.UserValidator;
import com.heping.pojo.User;
import com.heping.service.UserServiceImpl;
import com.heping.service.UserValidatorImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {
    //设置功能增加类，value为要增强的类的全路径
    //defaultImpl是具体的增强类
    @DeclareParents(value = "com.heping.service.UserServiceImpl+", defaultImpl = UserValidatorImpl.class)
    public UserValidator userValidator;

    @Pointcut("execution(* com.heping.service.UserServiceImpl.printUser(..))")
    public void pointCut() {

    }

    @Before("pointCut() && args(test)")
    public void before(JoinPoint point, User test) {
        //point中包含了方法的参数，下面的args包含一个User对象
        Object[] args = point.getArgs();
        System.out.println(String.format("getArgs:Name:%s", ((User) args[0]).getName()));
        System.out.println("before...");
        //printUser中定义的参数为User,这里第二个参数类型定义为User，即可接收方法的参数
        // 与类型有关，与参数名无关，这里将参数名定义为test，依然可以正常使用
        System.out.println(String.format("Name:%s", test.getName()));
    }

    @After("pointCut()")
    public void after() {
        System.out.println("after...");
    }

    @AfterReturning("pointCut()")
    public void afterReturn() {
        System.out.println("afterReturn...");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing...");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        //环绕通知也包含了参数列表，同样可以用getArgs获取参数
        Object[] args=jp.getArgs();
        System.out.println("around before...");
        jp.proceed();
        System.out.println("around after...");
    }

}
