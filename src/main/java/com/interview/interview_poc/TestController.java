package com.interview.interview_poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scopes")
public class TestController {

    @Autowired
    private SingletonClass sc;

    @Autowired
    private SingletonClass sc1;

    @GetMapping("/singleton")
    public BeanExample getSingleton() {
        return sc.goodMorning();
    }

    @GetMapping("/prototype")
    public BeanExample getPrototype() {
        return sc.goodMorningPrototype();
    }

    @GetMapping("/request")
    public BeanExample getRequest() {
        return sc.goodMorningRequest();
    }

    @GetMapping("/session")
    public BeanExample getSession() {
        return sc.goodMorningSession();
    }
}
