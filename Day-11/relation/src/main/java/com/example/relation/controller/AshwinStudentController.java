package com.example.relation.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.model.AshwinStudent;
import com.example.relation.service.AshwinStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AshwinStudentController {
    public AshwinStudentService AshwinStudentService;
    public AshwinStudentController(AshwinStudentService AshwinStudentService)
    {
        this.AshwinStudentService = AshwinStudentService;
    }
    @PostMapping("/api/AshwinStudent")
    public AshwinStudent postMethodName(@RequestBody AshwinStudent AshwinStudent) {
        return AshwinStudentService.saveAshwinStudent(AshwinStudent);
    }
    @GetMapping("/api/AshwinStudent")
    public List<AshwinStudent> getMethodName() {
        return AshwinStudentService.getAshwinStudents();
    }
    
}
