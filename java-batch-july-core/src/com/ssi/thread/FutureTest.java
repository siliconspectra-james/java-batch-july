package com.ssi.thread;

import java.util.concurrent.CompletableFuture;

public class FutureTest {

    public static void main(String[] args) throws Exception {

        CompletableFuture<String> cfQuery = CompletableFuture.supplyAsync(() -> queryCode("Silicon Sepctra"));

        cfQuery.thenAccept((result) -> {
            System.out.println("company name: " + result);
        });


        System.out.println("main running");

        Thread.sleep(2000);
    }

    static String queryCode(String name) {
        try {
            Thread.sleep(1000);
            System.out.println("async method: "+ Thread.currentThread().getName());
        } catch (InterruptedException e) {
        }
        return name;
    }
}
