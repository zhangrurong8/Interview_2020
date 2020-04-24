package com.xuanyu.designpatterns.decorate;

/**
 * 装饰模式的本质就是动态组合
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);
        concreteDecoratorA.setAddedState("添加状态");
        concreteDecoratorA.operation();
    }
}
