package com.example.studentmarkingsystem.controller;

import com.example.studentmarkingsystem.dto.MarkDTO;
import com.example.studentmarkingsystem.entity.Mark;
import com.example.studentmarkingsystem.mapper.MarkMapper;
import com.example.studentmarkingsystem.service.MarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/marks")
public class MarkController {
    @Autowired
    private MarkService markService;
    @Autowired
    private MarkMapper markMapper;

    @GetMapping
    public List<MarkDTO> getAllMarks() {
        return markService.getAllMarks().stream()
                .map(markMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MarkDTO> getMarkById(@PathVariable Long id) {
        Mark mark = markService.getMarkById(id);
        return ResponseEntity.ok(markMapper.toDto(mark));
    }


}