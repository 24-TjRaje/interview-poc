package com.interview.interview_poc.repository;

import com.interview.interview_poc.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
