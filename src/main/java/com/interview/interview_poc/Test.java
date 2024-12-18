package com.interview.interview_poc;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        doSomething(5);
    }

    public static void doSomething(int i) throws IOException {
        doNothing();
    }

    public static void doNothing() throws RuntimeException, IOException {
        throw new IOException("I am exceptional");
    }
}
