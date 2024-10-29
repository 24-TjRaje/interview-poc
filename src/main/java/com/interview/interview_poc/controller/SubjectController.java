package com.interview.interview_poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping
    public List<String> getAllSubjects() {
        return subjectService.getSubjects();
    }

    @PostMapping("/add/{subject}")
    public Boolean addSubject(@PathVariable String subject) {
        return subjectService.addSubject(subject);
    }

    @GetMapping("/count")
    public Integer getSubjectCount() {
        return subjectService.subjectCount();
    }

    @DeleteMapping("/remove/{subject}")
    public Boolean deleteSubject(@PathVariable String subject){
        return subjectService.removeSubject(subject);
    }
}
