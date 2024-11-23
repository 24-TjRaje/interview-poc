package com.interview.interview_poc;

import java.time.LocalDateTime;
import java.util.concurrent.*;

public class ScheduledExecutorServiceDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ScheduledExecutorService ses = Executors.newScheduledThreadPool(3);

        ses.schedule(() -> System.out.println("I'll execute after 1 min by " + Thread.currentThread().getName()), 60, TimeUnit.SECONDS);
        ses.schedule(() -> System.out.println("I'll execute after 2 sec by " + Thread.currentThread().getName()), 2, TimeUnit.SECONDS);
        ses.schedule(() -> System.out.println("I'll execute after 5 sec by " + Thread.currentThread().getName()), 5, TimeUnit.SECONDS);
        ses.schedule(() -> System.out.println("I'll execute after 6 sec by " + Thread.currentThread().getName()), 6, TimeUnit.SECONDS);
        ses.schedule(() -> System.out.println("I'll execute after 6 sec by " + Thread.currentThread().getName()), 6, TimeUnit.SECONDS);

        ScheduledFuture<LocalDateTime> i1 = ses.schedule(() -> LocalDateTime.now(), 1, TimeUnit.SECONDS);
        ScheduledFuture<LocalDateTime> i2 = ses.schedule(() -> LocalDateTime.now(), 5, TimeUnit.SECONDS);
        ScheduledFuture<LocalDateTime> i3 = ses.schedule(() -> LocalDateTime.now(), 10, TimeUnit.SECONDS);
        ScheduledFuture<LocalDateTime> i4 = ses.schedule(() -> LocalDateTime.now(), 20, TimeUnit.SECONDS);

        System.out.println(i1.get());
        System.out.println(i2.get());
        System.out.println(i3.get());
        System.out.println(i4.get());

        ses.scheduleAtFixedRate(() -> System.out.println("Current Time is : " + LocalDateTime.now()),
                60, 5, TimeUnit.SECONDS);

        ses.scheduleWithFixedDelay(() -> System.out.println("Current Time is : " + LocalDateTime.now()),
                60, 5, TimeUnit.SECONDS);


    }
}
