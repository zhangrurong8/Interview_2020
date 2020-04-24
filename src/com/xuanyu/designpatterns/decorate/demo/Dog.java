package com.xuanyu.designpatterns.decorate.demo;

/**
 * 具体的组件对象
 */
public class Dog implements Animal {
    @Override
    public void sleep() {
        System.out.println("dog is sleeping");
    }
}
