package com.heping;

import com.heping.aspect.MyAspect2;
import com.heping.aspect.service.HelloService;
import com.heping.aspect.service.UserService;
import com.heping.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = {"com.heping"})
public class TwoApplication implements CommandLineRunner {
    @Autowired
    private HelloService helloService = null;

    @Autowired
    private UserService userService = null;

//    @Bean(name = "myAspect2")
//    public MyAspect2 initMyAspect2() {
//        return new MyAspect2();
//    }

    public static void main(String[] args) {
        SpringApplication.run(TwoApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("-------------------------hello service---------------------");
        System.out.println(helloService.getClass());//class com.heping.aspect.service.HelloService$$EnhancerBySpringCGLIB$$2bdef6dd
        helloService.sayHello("loki");
        User tem = new User();
        tem.setNote("a man");
        tem.setUsername("loki");
        System.out.println("-------------------------user service---------------------");
        System.out.println(userService.getClass());//默认输出class com.heping.aspect.service.impl.UserServiceImpl$$EnhancerBySpringCGLIB$$845d3691
        userService.printUser(tem);
        //springboot默认用CGLIB实现AOP
        //spring.aop.proxy-target-class=false设置该选项后，对于实现了接口的类，会默认用jdk生成 ，没有实现接口的依然用CGLIB生成
        //userService用用jdk生成，输出class com.sun.proxy.$Proxy45
    }
}
