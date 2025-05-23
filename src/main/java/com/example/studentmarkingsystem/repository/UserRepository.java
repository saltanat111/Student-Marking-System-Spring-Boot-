package com.example.studentmarkingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepository extends JpaRepository<Users, Long> {
    Users findByUsername(String username);

}
