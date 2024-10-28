package com.interview.interview_poc.teacher.controller;

import com.interview.interview_poc.teacher.service.TeacherService;
import com.interview.interview_poc.teacher.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping
    public List<Teacher> getTeachers() {
        return teacherService.getTeacher();
    }

    @PostMapping
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return teacherService.addTeacher(teacher);
    }
}
