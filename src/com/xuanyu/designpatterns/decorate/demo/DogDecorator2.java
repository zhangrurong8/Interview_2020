package com.xuanyu.designpatterns.decorate.demo;

public class DogDecorator2 extends DecoratorAnimal {

    public DogDecorator2(Animal animal) {
        super(animal);
    }

    public void run() {
        System.out.println("dog is running");
    }

    @Override
    public void sleep() {
        super.sleep();
        run();
    }
}
