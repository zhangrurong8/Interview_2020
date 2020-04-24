package com.xuanyu.designpatterns.decorate.demo;

/**
 * Decorator装饰角色(一般为抽象类)
 */
public abstract class DecoratorAnimal implements Animal {
    private Animal mAnimal;

    public DecoratorAnimal(Animal animal) {
        this.mAnimal = animal;
    }

    @Override
    public void sleep() {
        mAnimal.sleep();
    }
}
