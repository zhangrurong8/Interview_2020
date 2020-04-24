package com.xuanyu.designpatterns.decorate.demo;

/**
 * 具体装饰角色
 */
public class DogDecorator extends DecoratorAnimal {

    public DogDecorator(Animal animal) {
        super(animal);
    }

    public void eatBone() {
        System.out.println("dog eat bone");
    }

    @Override
    public void sleep() {
        super.sleep();
        eatBone();
    }
}
