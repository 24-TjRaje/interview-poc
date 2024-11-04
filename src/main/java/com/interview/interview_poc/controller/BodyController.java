package com.interview.interview_poc.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Objects;

@RestController()
@RequestMapping("/inputs")
public class BodyController {


    @GetMapping("/path-var/base/{var}")
    public String yourNameBase(@PathVariable String var) {
        return "The passed path variable is " + var;
    }

    @GetMapping("/path-var/needed/{var}")
    public String yourName(@PathVariable(name = "var") String var1) {
        return "The passed path variable is " + var1;
    }

    @GetMapping("/path-var/not-needed/{var}")
    public String yourNameNotNeeded(@PathVariable(name = "var1", required = false) String var1) {
        return "The passed path variable is " + (var1 == null ? "unknown" : var1);
    }

    @PostMapping("/req-body")
    public String checkBodyTrue(@RequestBody Object o) {
        return "Here body is necessary. Pass without body and see the error!!";
    }

    @PostMapping("/req-body/optional")
    public String checkBodyFalse(@RequestBody(required = false) Object o) {
        return "Here body is not necessary. Pass without body and see same response!!";
    }

    @GetMapping("/req-params")
    public String greetMessageBase(@RequestParam String name, @RequestParam Integer age) {
        return "Hello. I'm " + name + " and my age is " + age + " years old!. Try by not passing " +
                "and param and see the error";
    }

    @GetMapping("/req-params/requireds")
    public String greetMessageNotMandatory(@RequestParam(required = false, name = "name1") String name,
                                           @RequestParam(required = false, name = "age1") Integer age) {
        if(Objects.nonNull(name) && Objects.nonNull(age) ){
            return "Name : " + name + "Age : " + age;
        }
        else if(Objects.nonNull(name) && Objects.isNull(age)) {
            return "Name : " + name;
        }
        else if(Objects.nonNull(age) && Objects.isNull(name)) {
            return "Age : " + age;
        }
        else {
            return "No request params!";
        }
    }

    @GetMapping("/req-params/default/version")
    public String getVersion(@RequestParam(defaultValue = "v1") String version) {
        return "This is the api response from version : " +version;
    }

    @GetMapping("/req-params/map")
    public String getParamsMap(@RequestParam(required = false)Map<String, String>
                               paramsMap)
    {
        if(Objects.nonNull(paramsMap)) {
            return paramsMap.entrySet().toString();
        } else {
            return " we got no params!";
        }
    }




}
