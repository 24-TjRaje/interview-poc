package com.interview.interview_poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ClassB {

//    @Autowired
//    @Lazy
    private ClassA classA;

//    @Autowired
//    public ClassB(@Lazy ClassA classA) {
//        this.classA = classA;
//    }

    @Autowired
    public void setClassA(@Lazy ClassA classA) {
        this.classA = classA;
    }

    @Bean
    public void helloMessageB() {
        System.out.println("Hello from Class B");
    }
}