package com.interview.interview_poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profiles")
public class ProfileController {

    @Autowired
    private ProfileService ps;

    @GetMapping
    public String envMessage() {
        return ps.envMessage();
    }
}
