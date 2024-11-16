package com.ntuc.threads;

public class ThreadClassDemo extends Thread {
    public static void main(String[] args) {
        ThreadClassDemo td = new ThreadClassDemo();
        td.start();
        // td.start(); // cannot invoke the thread after it is done execution

    }

    // default Constructor
    public ThreadClassDemo() {
        System.out.println("Hello World");
        System.out.println("Thread - " + Thread.currentThread().getName());
    }
}
