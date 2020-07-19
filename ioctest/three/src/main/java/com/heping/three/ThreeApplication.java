package com.heping.three;

import com.heping.config.AppConfig;
import com.heping.service.LazyPerson;
import com.heping.service.WorkPerson;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ThreeApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        WorkPerson workPerson=ctx.getBean(WorkPerson.class);
        workPerson.workWithAnimal();

        //如果将lazyInit设置为true，只有在这行代码执行完，才会打印inject Animal
        LazyPerson lazyPerson=ctx.getBean(LazyPerson.class);
        lazyPerson.workWithAnimal();
    }

}
