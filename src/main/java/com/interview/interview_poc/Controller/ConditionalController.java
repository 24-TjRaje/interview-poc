package com.interview.interview_poc.Controller;

import com.interview.interview_poc.services.ClassConditionalInterface;
import com.interview.interview_poc.services.ClassServiceConditionBean;
import com.interview.interview_poc.services.ConditionalInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conditions")
@ConditionalOnBean(value = {com.interview.interview_poc.services.ClassConditionalInterface.class
        ,com.interview.interview_poc.services.ConditionalInterface.class
        })
public class ConditionalController {

    @Autowired
    private ConditionalInterface conditionalInterface;

    @Autowired
    private ClassConditionalInterface classConditionalInterface;

    @GetMapping("/env")
    public String setEnvironment() {
        return conditionalInterface.environmentBean();
    }

    @GetMapping("/class")
    public String setClass() {
        return classConditionalInterface.classConditions();
    }
}
