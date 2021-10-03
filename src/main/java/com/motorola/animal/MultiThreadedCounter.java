package com.motorola.animal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultiThreadedCounter {

    private volatile long counter;

    public void countTo1000() {

        Runnable countTo500 = () -> {
            System.out.println("Thread start " + Thread.currentThread().getId());
            for (int i = 0; i < 500; i++) {
                counter++;

            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(1);
        executor.submit(countTo500);
        executor.submit(countTo500);
        try {
            executor.awaitTermination(1000, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();
     }

    public long getCounter() {
        return counter;
    }

}
