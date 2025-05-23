package com.example.studentmarkingsystem.repository;

import com.example.studentmarkingsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Student> findByStudentUsername(String studentUsername);

}
