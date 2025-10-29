package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    private ReentrantLock lock = new ReentrantLock();
    private ExecutorService executorService = Executors.newFixedThreadPool(10);

    public void testLock() {
        for (int i = 0; i < 10; i++) {
            executorService.submit(this::lockMethod);
        }
    }

    private void lockMethod() {
        while (!lock.tryLock()) {
            System.out.println(Thread.currentThread().getName() + " не получил блокировку");
        }

        System.out.println(Thread.currentThread().getName() + " получил блокировку");
        lock.unlock();
        System.out.println(Thread.currentThread().getName() + " отпустил блокировку");
    }
}
