package com.example.studentmarkingsystem.controller;

import com.example.studentmarkingsystem.dto.AdminDTO;
import com.example.studentmarkingsystem.entity.Admin;
import com.example.studentmarkingsystem.mapper.AdminMapper;
import com.example.studentmarkingsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/admins")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private AdminMapper adminMapper;

    @GetMapping
    public List<AdminDTO> getAllAdmins() {
        return adminService.getAllAdmins().stream()
                .map(adminMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdminDTO> getAdminById(@PathVariable Long id) {
        Admin admin = adminService.getAdminById(id);
        return ResponseEntity.ok(adminMapper.toDto(admin));
    }


}