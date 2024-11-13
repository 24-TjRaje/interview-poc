package com.interview.interview_poc.service;

import com.interview.interview_poc.entity.Student;
import com.interview.interview_poc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Create or Update a student
    public List<Student> saveStudent(List<Student> student) {
        return studentRepository.saveAll(student);
    }

    // Get all students
    public Page<Student> getAllStudents(Integer pageNumber, Integer size) {
        Pageable page = PageRequest.of(pageNumber, size);
        return studentRepository.findAll(page);
    }

    // Get student by ID
    public Optional<Student> getStudentById(Long studentId) {
        return studentRepository.findById(studentId);
    }

    // Delete student by ID
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    public Page<Student> findByClassId(Integer classId, Integer pageSize, Integer pageNumber, String sortKey) {
        Sort sortbj = Sort.by(Sort.Order.by(sortKey));
        Pageable pageable = PageRequest.of(pageNumber, pageSize, sortbj);
        return studentRepository.findByClassId(classId, pageable);
    }
}