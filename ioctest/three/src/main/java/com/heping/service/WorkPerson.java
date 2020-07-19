package com.heping.service;

import com.heping.definition.Animal;
import com.heping.definition.BusinessPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class WorkPerson implements BusinessPerson {
    //也可以将属性自动注入
    //    @Autowired
    private Animal animal;

    //也可以在构造函数中使用自动注入
    //因为有两个类都实现了Animal接口，在注入时就要进行手动设定，用Bean的名字来进行设定
    public WorkPerson(@Autowired @Qualifier("cat") Animal animal) {
        this.animal = animal;
    }

    @Override
    public void workWithAnimal() {
        this.animal.work();
    }
}
