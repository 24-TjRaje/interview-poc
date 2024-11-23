package com.interview.interview_poc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolExecutorDemo {

    public static void main(String[] args) {

        ThreadPoolExecutor tpe = new ThreadPoolExecutor(2, 4,10, TimeUnit.SECONDS,
                new LinkedBlockingQueue<>());

        List<Callable<String>> input = new ArrayList<>();
        for(int i=0; i<50; i++)
            input.add(() -> "Executed by : " + Thread.currentThread().getName());

        for(int i=0; i<5; i++)
            tpe.execute(() -> System.out.println("Executed by : " + Thread.currentThread().getName()));

        System.out.println(tpe.getCorePoolSize());
        System.out.println(tpe.getPoolSize());
        System.out.println(tpe.getMaximumPoolSize());
        System.out.println(tpe.getKeepAliveTime(TimeUnit.SECONDS));
        System.out.println(tpe.getTaskCount());

        tpe.shutdown();
    }
}
