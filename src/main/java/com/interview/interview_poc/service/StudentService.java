package com.interview.interview_poc.service;

import com.interview.interview_poc.entity.Student;
import com.interview.interview_poc.exception.StudentServiceException;
import com.interview.interview_poc.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudentData(Student student) {
        return studentRepository.save(student);
    }

    public Student findStudentById(Integer id) {
        Optional<Student> student = studentRepository.findById(id);

        if(student.isEmpty())
            throw new StudentServiceException("Cannot fetch student. No student present with id : " + id);

        return student.get();
    }

    public List<Student> findStudents() {
        List<Student> studentList = studentRepository.findAll();

        if(studentList.isEmpty())
            throw  new StudentServiceException("Cannot get student data. No students present in the database!");

        return studentList;
    }

    public Integer deleteStudent(Integer id) {
        Boolean isPresent = studentRepository.existsById(id);

        if(!isPresent)
            throw  new StudentServiceException("Cannot delete student. No student present in the database " +
                    "with id : " + id);

        studentRepository.deleteById(id);
        return id;
    }
}
