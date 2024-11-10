package com.interview.interview_poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    @Qualifier("englishQualifierOpsImpl")
    private QualifierOps qs;

    @GetMapping
    public String getHelloMessage() {
        return qs.message();
    }
}
