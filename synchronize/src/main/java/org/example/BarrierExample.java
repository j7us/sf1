package org.example;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BarrierExample {
    CyclicBarrier cyclicBarrier = new CyclicBarrier(5);
    ExecutorService executorService = Executors.newFixedThreadPool(5);

    public void test() {
        for (int i = 0; i < 5; i++) {
            executorService.submit(this::barrierMethod);
        }

    }

    private void barrierMethod() {
        System.out.println(Thread.currentThread().getName() + " Дошел до барьера");

        try {
            cyclicBarrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " После барьера");
    }
}
