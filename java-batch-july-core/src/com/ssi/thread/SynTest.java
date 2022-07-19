package com.ssi.thread;

class Data {
    synchronized public void foo1() {
        System.out.println(Thread.currentThread().getName() + " is running foo1");
        try {
            Thread.sleep(2000);
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends foo1");
    }

    synchronized public void foo2() {
        System.out.println(Thread.currentThread().getName() + " is running foo2");
        try {
            Thread.sleep(2000);
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends foo2");
    }

    synchronized public static void foo3() {
        System.out.println(Thread.currentThread().getName() + " is running foo3");
        try {
            Thread.sleep(2000);
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends foo3");
    }

    synchronized public static void foo4() {
        System.out.println(Thread.currentThread().getName() + " is running foo4");
        try {
            Thread.sleep(2000);
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends foo4");
    }

    public void foo5() {
        System.out.println(Thread.currentThread().getName() + " is running foo5");
        try {
            Thread.sleep(2000);
        }catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends foo5");
    }

    public void foo6() {
        synchronized (Data.class) {
            System.out.println(Thread.currentThread().getName() + " is running foo6");
            try {
                Thread.sleep(2000);
            }catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + " ends foo6");
        }

    }
}

public class SynTest{
    public static void main(String[] args) {
        Data data = new Data();
        Data data1 = new Data();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                data.foo1();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                data1.foo2();
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                data.foo3();
            }
        });

        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                data.foo4();
            }
        });

        Thread t6 = new Thread(new Runnable() {
            @Override
            public void run() {
                data.foo6();
            }
        });

        t1.start();
        t2.start();
    }
}
