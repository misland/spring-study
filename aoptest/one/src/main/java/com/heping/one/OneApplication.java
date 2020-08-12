package com.heping.one;

import com.heping.aspect.MyAspect;
import com.heping.definition.HelloService;
import com.heping.definition.UserService;
import com.heping.definition.UserValidator;
import com.heping.interceptor.MyInterceptor;
import com.heping.pojo.User;
import com.heping.proxy.ProxyBean;
import com.heping.service.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.heping")
public class OneApplication implements CommandLineRunner {
    @Autowired
    private UserService userService = null;

    @Bean(name = "myAspect")
    public MyAspect initAspect() {
        return new MyAspect();
    }

    public static void main(String[] args) {
        SpringApplication.run(OneApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("come in");
        HelloService helloService = new HelloServiceImpl();
        HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());
        proxy.sayHello("Loki");

        System.out.println("----------------------------------------");
        User user = new User();
        user.setName("Loki");
        user.setNote("a man who love his daughter more than anything");
        userService.printUser(user);

        user=null;
        System.out.println("-------------------null user-----------------");
        userService.printUser(user);

//        System.out.println("-------------------null user validate-----------------");
//        UserValidator userValidator = (UserValidator) userService;
//        if (userValidator.validate(user)) {
//            System.out.println("user is null");
//        } else {
//            userService.printUser(user);
//        }
    }
}
