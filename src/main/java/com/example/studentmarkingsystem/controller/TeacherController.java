package com.example.studentmarkingsystem.controller;

import com.example.studentmarkingsystem.dto.TeacherDTO;
import com.example.studentmarkingsystem.entity.Teacher;
import com.example.studentmarkingsystem.mapper.TeacherMapper;
import com.example.studentmarkingsystem.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/teachers")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private TeacherMapper teacherMapper;

    @GetMapping
    public List<TeacherDTO> getAllTeachers() {
        return teacherService.getAllTeachers().stream()
                .map(teacherMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeacherDTO> getTeacherById(@PathVariable Long id) {
        Teacher teacher = teacherService.getTeacherById(id);
        return ResponseEntity.ok(teacherMapper.toDto(teacher));
    }


}