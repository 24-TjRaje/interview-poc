package com.interview.interview_poc.Controller;

import com.interview.interview_poc.services.CustomCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/custom")
@Conditional(CustomCondition.class)
public class CustomController {

    @GetMapping
    public String customWorks() {
        return "This custom endpoint is working because property is enable else you will get 404";
    }
}
