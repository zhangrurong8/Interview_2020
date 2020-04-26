package com.xuanyu.thread;

/**
 * 「synchronized」 关键字就是「悲观锁」的具体实现，在多线程并发竞争同一资源时，实现同一时刻只有一个线程能操作资源。
 */
public class NoSynchronizedTest {

    public static void main(String[] args) {
        NoSynchronizedTest noSynchronizedTest = new NoSynchronizedTest();
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                noSynchronizedTest.testNoSynchronizedMethod();
            });
            thread.start();
        }
    }


    public synchronized void testNoSynchronizedMethod() {
        System.out.println("testNoSynchronizedMethod-start-" + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("testNoSynchronizedMethod-end-" + Thread.currentThread().getName());
    }


}
