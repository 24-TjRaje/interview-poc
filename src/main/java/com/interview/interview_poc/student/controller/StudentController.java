package com.interview.interview_poc.student.controller;

import com.interview.interview_poc.student.service.StudentService;
import com.interview.interview_poc.student.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public Student addStudent(@RequestBody  Student student) {
        return studentService.addStudent(student);
    }
}
