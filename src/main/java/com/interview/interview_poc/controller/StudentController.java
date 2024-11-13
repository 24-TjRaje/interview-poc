package com.interview.interview_poc.controller;

import com.interview.interview_poc.entity.Student;
import com.interview.interview_poc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Get all students
    @GetMapping
    public Page<Student> getAllStudents(@RequestParam(value = "pageNumber", required = false, defaultValue = "0") Integer pageNumber,
                                        @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize) {
        return studentService.getAllStudents(pageNumber, pageSize);
    }

    @GetMapping("/classId/{classId}")
    public Page<Student> getAllStudentsByClassId(@RequestParam(value = "pageNumber", required = false, defaultValue = "0") Integer pageNumber,
                                        @RequestParam(value = "pageSize", required = false, defaultValue = "10") Integer pageSize,
                                                 @RequestParam(value = "sortKey", required = false, defaultValue = "studentId") String sortKey,
                                                 @PathVariable Integer classId) {
        return studentService.findByClassId(classId, pageSize, pageNumber, sortKey);
    }



    // Get student by ID
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long studentId) {
        Optional<Student> student = studentService.getStudentById(studentId);
        return student.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create or Update student
    @PostMapping
    public ResponseEntity<List<Student>> createStudent(@RequestBody List<Student> student) {
        List<Student> savedStudent = studentService.saveStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    // Update student by ID
//    @PutMapping("/{id}")
//    public ResponseEntity<Student> updateStudent(@PathVariable("id") Long studentId, @RequestBody Student student) {
//        if (studentService.getStudentById(studentId).isPresent()) {
//            student.setStudentId(studentId);
//            Student updatedStudent = studentService.saveStudent(List.of(student));
//            return ResponseEntity.ok(updatedStudent);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

    // Delete student by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable("id") Long studentId) {
        if (studentService.getStudentById(studentId).isPresent()) {
            studentService.deleteStudent(studentId);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
