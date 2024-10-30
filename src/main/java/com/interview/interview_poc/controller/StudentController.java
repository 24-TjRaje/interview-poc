package com.interview.interview_poc.controller;


import com.interview.interview_poc.entity.Student;
import com.interview.interview_poc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {
        return new ResponseEntity<List<Student>>(studentService.findStudents(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable Integer id) {
        return new ResponseEntity<Student>(studentService.findStudentById(id), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        return new ResponseEntity<Student>(studentService.addStudentData(student), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Integer id) {
        return new ResponseEntity<String>("Student deleted successfully with id : " +
                studentService.deleteStudent(id), HttpStatus.ACCEPTED);
    }

}
