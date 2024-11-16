package com.ntuc.threads.utilconcurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ConcurrentExample {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Define tasks using Callable
        Callable<Integer> task1 = () -> {
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
                Thread.sleep(100); // Simulate a delay
            }
            return sum; // Sum of 1 to 10
        };

        Callable<Integer> task2 = () -> {
            int sum = 0;
            for (int i = 11; i <= 20; i++) {
                sum += i;
                Thread.sleep(100); // Simulate a delay
            }
            return sum; // Sum of 11 to 20
        };

        Callable<Integer> task3 = () -> {
            int sum = 0;
            for (int i = 21; i <= 30; i++) {
                sum += i;
                Thread.sleep(100); // Simulate a delay
            }
            return sum; // Sum of 21 to 30
        };

        Callable<Integer> task4 = () -> {
            int sum = 0;
            for (int i = 21; i <= 30; i++) {
                sum += i;
                Thread.sleep(100); // Simulate a delay
            }
            return sum; // Sum of 21 to 30
        };

        try {
            // Submit tasks to the executor
            Future<Integer> result1 = executor.submit(task1);
            Future<Integer> result2 = executor.submit(task2);
            Future<Integer> result3 = executor.submit(task3);
            Future<Integer> result4 = executor.submit(task4);

            // Retrieve and print results
            System.out.println("Result of Task 1: " + result1.get());
            System.out.println("Result of Task 2: " + result2.get());
            System.out.println("Result of Task 3: " + result3.get());
            System.out.println("Result of Task 4: " + result4.get());

            // Calculate the total sum
            int totalSum = result1.get() + result2.get() + result3.get();
            System.out.println("Total Sum: " + totalSum);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Shutdown the executor
            executor.shutdown();
        }
    }

}
