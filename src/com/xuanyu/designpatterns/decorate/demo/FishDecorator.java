package com.xuanyu.designpatterns.decorate.demo;

public class FishDecorator extends DecoratorAnimal {

    public FishDecorator(Animal animal) {
        super(animal);
    }

    public void swim() {
        System.out.println("fish is swimming");
    }

    @Override
    public void sleep() {
        super.sleep();
        swim();
    }
}
