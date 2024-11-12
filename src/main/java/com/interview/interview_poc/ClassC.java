package com.interview.interview_poc;

import org.springframework.stereotype.Component;

@Component
public class ClassC {

    public void greet() {
        System.out.println("I'm from class C and I'm autowired via constructor injection");
    }
}
