package com.interview.interview_poc;

import org.springframework.stereotype.Component;

@Component
public class ClassD {

    public void greet() {
        System.out.println("I'm from class D and autowired via setter injection");
    }
}
