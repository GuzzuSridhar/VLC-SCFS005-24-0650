package com.ntuc.threads;

public class ThreadRunMethod extends Thread {

    // the unit of work for each thread is defined in the run method
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " - " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // making the thread wait for a said milliseconds
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        ThreadRunMethod t1 = new ThreadRunMethod();
        ThreadRunMethod t2 = new ThreadRunMethod();
        ThreadRunMethod t3 = new ThreadRunMethod();

        t1.setName("mythread");
        t2.setName("yourthread");
        t3.setName("ourthread");

        t1.start();
        t2.start();
        t3.start();
    }
}
