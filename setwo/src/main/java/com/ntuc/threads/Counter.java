package com.ntuc.threads;

public class Counter {
    private int count = 0;

    // // race condition
    // private void increment() {
    // count++;
    // }

    // synchronized condition
    private synchronized void increment() {
        count++;
        // System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // lambda concurrency
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final value of the count is: " + counter.count);

    }
}
