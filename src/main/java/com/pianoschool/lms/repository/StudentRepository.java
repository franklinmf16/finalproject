package com.pianoschool.lms.repository;

import com.pianoschool.lms.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    boolean existsByEmail(String email);

}


