package com.interview.interview_poc;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String[] args) {

        Executor executor = Executors.newFixedThreadPool(3);

        for(int i=0; i<10;i++)
            executor.execute(() -> System.out.println("Hello from : " + Thread.currentThread().getName()));

    }
}
