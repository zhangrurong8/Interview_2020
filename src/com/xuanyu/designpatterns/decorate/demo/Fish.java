package com.xuanyu.designpatterns.decorate.demo;

public class Fish implements Animal {
    @Override
    public void sleep() {
        System.out.println("fish is sleeping");
    }
}
