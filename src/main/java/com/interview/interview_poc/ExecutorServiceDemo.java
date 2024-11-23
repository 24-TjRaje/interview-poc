package com.interview.interview_poc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.*;

public class ExecutorServiceDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // submit with runnable
        Future<?> runFuture = executorService.submit(() -> System.out.println("Hello from runnable " + Thread.currentThread().getName()));
        System.out.println(runFuture.get());

        //submit with callable
        Future<String> runCall = executorService.submit(() -> {
            System.out.println("Hello ");
            return "Task  executed by " + Thread.currentThread().getName();
        });

        System.out.println(runCall.get());
        List<Callable<String>> tasks = new ArrayList<>();

        tasks.add(() -> {
            System.out.println("Good Morning" + Thread.currentThread().getName()) ;
            return "Good Morning";
        });

        tasks.add(() -> {
            System.out.println("Good Night by " + Thread.currentThread().getName() );
            return "Good Night";
        });

        List<Future<String>> result = executorService.invokeAll(tasks);
        System.out.println(tasks.size() + " tasks are submitted" );
        for(Future<String> f: result) {
            System.out.println(result.indexOf(f) + f.get());
            System.out.println(result.indexOf(f) + f.state().toString());
        }

        for(int i=0; i<24; i++)
            tasks.add(() -> {
                System.out.println("Good Night by " + Thread.currentThread().getName() );
                return "Good Ebening";
            });

        System.out.println("Tring invoke all with timer");
        System.out.println(tasks.size() + " tasks are submitted" );
        List<Future<String>> resultTimer = executorService.invokeAll(tasks, 1, TimeUnit.SECONDS);
        for(Future<String> f: resultTimer) {
            System.out.println(result.indexOf(f) + f.get());
            System.out.println(result.indexOf(f) + f.state().toString());
        }

        List<Callable<String>> inputInvoke = new ArrayList<>();
        for(int i = 0; i<3; i++)
            inputInvoke.add(tasks.get(i));

        System.out.println("Trying invokeAny");
        System.out.println(executorService.invokeAny(inputInvoke));



    }
}
