package com.xuanyu.designpatterns.decorate.demo;

public class Client {

    public static void main(String[] args) {
        Animal dog = new DogDecorator(new DogDecorator2(new Dog()));
        dog.sleep();
        Animal fish = new FishDecorator(new Fish());
        fish.sleep();
    }
}
