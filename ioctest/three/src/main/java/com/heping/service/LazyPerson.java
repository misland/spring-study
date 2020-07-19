package com.heping.service;

import com.heping.definition.Animal;
import com.heping.definition.BusinessPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LazyPerson implements BusinessPerson {
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    @Autowired
    @Qualifier("dog")
    public void setAnimal(Animal animal) {
        System.out.println("inject Animal");
        this.animal = animal;
    }

    @Override
    public void workWithAnimal() {
        Animal animal = this.getAnimal();
        animal.work();
    }
}
