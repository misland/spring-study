package com.heping.aspect.main;

import com.heping.aspect.config.AspectConfig;
import com.heping.aspect.service.HelloService;
import com.heping.aspect.service.UserService;
import com.heping.pojo.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AspectMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AspectConfig.class);
        System.out.println("-------------------user service-----------------------------");
        UserService userService = ctx.getBean(UserService.class);
        //userService由jdk动态生成，因继承接口
        System.out.println(userService.getClass());//class com.sun.proxy.$Proxy25
        User user = new User();
        user.setUsername("loki");
        user.setNote("a man");
        userService.printUser(user);
//		System.out.println("-------------------null user-----------------------------");
//		userService.printUser(null);

        System.out.println("-------------------hello service-----------------------------");
        HelloService helloService = ctx.getBean(HelloService.class);
        //helloService由CGLIB生成，因未继承接口
        System.out.println(helloService.getClass());//class com.heping.aspect.service.HelloService$$EnhancerBySpringCGLIB$$91c2316e
        helloService.sayHello("loki");
    }
}
