package com.xuanyu.designpatterns.decorate;

/**
 * 具体的装饰器:添加状态的装饰器
 */
public class ConcreteDecoratorA extends Decorator {

    private String addedState;

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("当前的操作状态:" + getAddedState());
    }

    public String getAddedState() {
        return addedState;
    }

    public void setAddedState(String addedState) {
        this.addedState = addedState;
    }
}
