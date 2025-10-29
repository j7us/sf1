package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private ExecutorService executorService = Executors.newFixedThreadPool(10);

    public void testAtomic() {
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> {
                int last = atomicInteger.incrementAndGet();
                System.out.println("Значение " + last);
            });
        }
    }
}
