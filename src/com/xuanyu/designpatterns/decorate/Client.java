package com.xuanyu.designpatterns.decorate;

/**
 * 装饰模式的本质就是动态组合
 * 特点:装饰类持有原有类或接口的对象，并调用它的方法
 * 通过一个装饰类对现有类对象动态添加一些功能，同时不改变其结构
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA(component);
        concreteDecoratorA.setAddedState("添加状态");
        concreteDecoratorA.operation();
    }
}
