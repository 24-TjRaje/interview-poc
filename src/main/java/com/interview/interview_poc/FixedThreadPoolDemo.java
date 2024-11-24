package com.interview.interview_poc;

import java.util.concurrent.*;

public class FixedThreadPoolDemo {

    public static void main(String[] args) {

        ThreadPoolExecutor tpe = new ThreadPoolExecutor(3,3,3, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>());

        System.out.println("Max pool size is " + tpe.getMaximumPoolSize());
        System.out.println("Current pool size is " + tpe.getPoolSize());
        System.out.println("Min pool size is " + tpe.getCorePoolSize());

        ExecutorService tse = Executors.newFixedThreadPool(2);

        for(int i=0; i<15; i++)
            tpe.submit(() -> System.out.println("Hello Executor Service from " + Thread.currentThread().getName()));

        for(int i=0; i<13; i++)
            tse.submit(() -> System.out.println("Hello Thread Pool Executor from " + Thread.currentThread().getName()));

        tpe.shutdown();
        tse.shutdown();
    }

}
