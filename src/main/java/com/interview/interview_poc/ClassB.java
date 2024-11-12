package com.interview.interview_poc;

import org.springframework.stereotype.Component;

@Component
public class ClassB {

    public void greet() {
        System.out.println("I'm from Class B and autowired via field injection");
    }
}
