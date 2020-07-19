package com.heping.service;

import com.heping.definition.Animal;
import com.heping.definition.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//测试Bean的生命周期
@Service
public class BusinessPerson implements Person, BeanNameAware, BeanFactoryAware, ApplicationContextAware,
        InitializingBean, DisposableBean {

    private Animal animal = null;

    @Override
    public void work() {
        this.animal.work();
    }

    @Autowired
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    //在IOC完成对象实例化，注入后，接下来会调用BeanNameAware的setBeanName方法
    @Override
    public void setBeanName(String s) {
        System.out.println("[" + this.getClass().getSimpleName() + "]调用BeanNameAware的setBeanName");
    }

    //接下来是调用BeanFactoryAware的setBeanFactory方法
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("[" + this.getClass().getSimpleName() + "]调用BeanFactoryAware的setBeanFactory");
    }

    //接下来，调用ApplicatonContextAware的setApplicationContext方法
    //但是只有IOC容器类实现了ApplicationContext接口才会调用该方法
    //因为本项目用的IOC容器是AnnotationConfigApplicationContext，该容器实现了ApplicationContext接口，所以会调用该方法
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("[" + this.getClass().getSimpleName() + "]调用ApplicationContextAware的setApplicationContext");
    }

    //接下来会调用BeanPostProcessor的postProcessBeforeInitialization方法，这个方法是对所有的Bean都生效的，具体实现在BeanPostProcessorDemo中

    //接下来，调用使用@PostConstruct注解标注的方法，该方法视为类的初始化方法
    @PostConstruct
    public void init() {
        System.out.println("[" + this.getClass().getSimpleName() + "]注解@PostConstruct定义的自定义初始化方法");
    }

    //接下来，调用InitializingBean的afterPropertiesSet方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("[" + this.getClass().getSimpleName() + "]调用InitializingBean的afterPropertiesSet方法");
    }

    //接下来会调用BeanPostProcessor的postProcessAfterInitialization方法，这个方法是对所有的Bean都生效的，具体实现在BeanPostProcessorDemo中

    //至此，Bean的创建注入流程完成，接下来会进入销毁流程

    //在IOC容器关闭后，Bean也会随着销毁，可以自定义销毁方法
    //首先会调用@PreDestroy注解标注的销毁方法
    @PreDestroy
    public void preDestroy() {
        System.out.println("[" + this.getClass().getSimpleName() + "]注解@PreDestroy定义的自定义销毁方法");
    }

    //接下来调用DisposableBean的销毁方法
    @Override
    public void destroy() throws Exception {
        System.out.println("[" + this.getClass().getSimpleName() + "] DisposableBean方法");
    }
    //至此，Bean生命周期完成
}
