package com.interview.interview_poc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")
public class AllControllers {

    @GetMapping("/html")
    public String greetPage() {
        return "goodMorning";
    }

    @GetMapping("/data")
    @ResponseBody
    public String greetData() {
        return "Good Morning from All Controller data endpoint";
    }
}
