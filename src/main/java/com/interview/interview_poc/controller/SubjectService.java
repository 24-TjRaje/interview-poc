package com.interview.interview_poc.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

   private List<String> subjects = new ArrayList<>();

    public List<String> getSubjects() {
        return subjects;
    }

    public Boolean addSubject(String subject) {
        return subjects.add(subject);
    }

    public Integer subjectCount() {
        return subjects.size();
    }

    public Boolean removeSubject(String subject) {
        return subjects.remove(subject);
    }
}
