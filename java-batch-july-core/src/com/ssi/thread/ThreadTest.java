package com.ssi.thread;

import java.util.concurrent.Callable;

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " thread1 is running");
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " thread2 is running");
    }
}

class MyThread3 implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        return 1;
    }
}

public class ThreadTest {

    private volatile int data = 0;

    public static void main(String[] args) throws InterruptedException {
//        Thread t1 = new MyThread1();
//        Thread t2 = new Thread(new MyThread2());
        ThreadTest tt = new ThreadTest();

        Thread t1 = new Thread(() -> {
            while (tt.data < 10) {
                tt.data ++;
                System.out.println(tt.data);
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (tt.data < 10) {
                    tt.data ++;
                    System.out.println(tt.data);
                }
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (tt.data < 10) {
                    tt.data ++;
                    System.out.println(tt.data);
                }
            }
        });
        t1.start();
        t2.start();
        t3.start();

        t1.join();
        Thread.yield();

        Thread.sleep(1000);
        t1.wait();
        t1.notify();

        //single thread
//        t1.run();
//        t2.run();
        //multiple thread
//        t1.start();
//        t2.start();
//        System.out.println(Thread.currentThread().getName() + " is running");

    }
}
