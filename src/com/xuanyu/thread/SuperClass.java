package com.xuanyu.thread;

/**
 * 证明synchronized是可重入锁
 */
public class SuperClass {

    public synchronized void doSomething() {
        System.out.println("father is doing something,the thread name is:>>" + Thread.currentThread().getName());
    }
}
