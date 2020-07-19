package com.heping.pojo;

import com.heping.definition.Animal;

public class Squirrel implements Animal {
    @Override
    public void doSomething() {
        System.out.println("Squirrel loves to eat nuts");
    }
}
