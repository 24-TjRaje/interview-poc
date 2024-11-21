package com.interview.interview_poc;

import java.util.concurrent.Callable;

public class RunCallDemo implements Runnable, Callable<String>{

    public static void main(String[] args) throws Exception {

        Runnable r = () -> System.out.println("Hello");
        Callable<Integer> i = () -> 10;
        Callable<String> s = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "hello";
            }
        };


        r.run();
        System.out.println(i.call());

        RunCallDemo rcd = new RunCallDemo();
        rcd.run();
        rcd.call();
    }

    @Override
    public void run() throws ArithmeticException{
            System.out.println("Runnable");
            int i = 10/0;
    }

    @Override
    public String call() throws Exception {
        return "10";
    }
}
