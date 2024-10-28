package com.interview.interview_poc.teacher.service;


import com.interview.interview_poc.teacher.entities.Teacher;
import com.interview.interview_poc.teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher addTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public List<Teacher> getTeacher(){
        return teacherRepository.findAll();
    }
}
