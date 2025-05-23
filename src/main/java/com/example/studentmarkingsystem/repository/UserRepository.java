package com.example.studentmarkingsystem.repository;

import com.example.studentmarkingsystem.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);
}
