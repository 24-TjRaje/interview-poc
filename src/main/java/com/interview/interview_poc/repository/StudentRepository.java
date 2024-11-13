package com.interview.interview_poc.repository;

import com.interview.interview_poc.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    public Page<Student> findByClassId(Integer classId, Pageable pageable);
}