package com.interview.interview_poc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest-controller")
public class AllRestController {

    @GetMapping("data")
    public String greetRestData() {
        return "Hello from data endpoint of AllRestController";
    }
}
