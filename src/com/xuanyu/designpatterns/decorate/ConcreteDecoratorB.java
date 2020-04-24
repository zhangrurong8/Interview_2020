package com.xuanyu.designpatterns.decorate;

/**
 * 具体的装饰器：添加行为
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedBehavior();
    }

    /**
     * 需要添加的职责
     */
    public void addedBehavior() {
        System.out.println("添加的行为");
    }
}
