package com.ntuc.threads;

public class RunnableInterfaceDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Run method invoked - " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableInterfaceDemo());
        t1.start();
        Thread t2 = new Thread(new RunnableInterfaceDemo());
        t2.start();
        Thread t3 = new Thread(new RunnableInterfaceDemo());
        t3.start();
    }
}
