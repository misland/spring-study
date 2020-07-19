package com.heping.service;

import com.heping.definition.Animal;
import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal {
    @Override
    public void work() {
        System.out.println("I can watch house for master");
    }
}
