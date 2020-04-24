package com.xuanyu.designpatterns.decorate;

/**
 * 装饰器
 */
public abstract class Decorator extends Component {

    /**
     * 持有的组件对象
     */
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }
}
