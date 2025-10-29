package org.example;

import java.util.concurrent.CompletableFuture;

public class FutureExample {

    public void futureTest() {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return "123";
        });

        while (!future.isDone()) {
            System.out.println("Ждем завершения future");
        }

        String futureResult = "";
        try {
            futureResult = future.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(futureResult);
    }
}
