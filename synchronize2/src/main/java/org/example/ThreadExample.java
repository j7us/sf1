package org.example;

import java.util.concurrent.locks.ReentrantLock;

public class ThreadExample {
    private static int counter = 0;
    private static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                lock.lock();
                counter++;
                lock.unlock();
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter: " + counter);
    }
}
