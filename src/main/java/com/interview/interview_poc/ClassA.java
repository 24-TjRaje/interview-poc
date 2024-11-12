package com.interview.interview_poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ClassA {

//    @Autowired
//    @Lazy
    private ClassB classB;

//    @Autowired
//    public ClassA(@Lazy ClassB classB) {
//        this.classB = classB;
//    }


    @Autowired
    public void setClassB(@Lazy ClassB classB) {
        this.classB = classB;
    }

    @Bean
    public void helloMessageA() {
        System.out.println("Hello from class A");
    }
}
