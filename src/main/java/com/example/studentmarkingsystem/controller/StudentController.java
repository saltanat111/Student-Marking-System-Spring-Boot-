package com.example.studentmarkingsystem.controller;

import com.example.studentmarkingsystem.dto.StudentDTO;
import com.example.studentmarkingsystem.entity.Student;
import com.example.studentmarkingsystem.mapper.StudentMapper;
import com.example.studentmarkingsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentMapper studentMapper;

    @GetMapping
    public List<StudentDTO> getAllStudents() {
        return studentService.getAllStudents().stream()
                .map(studentMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getStudentById(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);
        return ResponseEntity.ok(studentMapper.toDto(student));
    }


}