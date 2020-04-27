package com.xuanyu.thread;

/**
 * 同一线程对同一个对象锁是可重入的。
 */
public class SubClass extends SuperClass {

    public synchronized void doSomething() {
        System.out.println("child is doing something,the thread name:>>" + Thread.currentThread().getName());
        doAnotherThing();
    }

    private synchronized void doAnotherThing() {
        super.doSomething();
        System.out.println("child is doing anotherthing,the thread name:>>" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        SubClass child = new SubClass();
        child.doSomething();
    }
}
