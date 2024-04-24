package com.example.bidirection.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.model.AshwinStudent;
import com.example.bidirection.model.AshwinStudentInfo;
import com.example.bidirection.service.AshwinStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class AshwinStudentController {
    public AshwinStudentService studentService;
    public AshwinStudentController(AshwinStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public AshwinStudent postMethodName(@RequestBody AshwinStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public AshwinStudentInfo postMethodName(@RequestBody AshwinStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<AshwinStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}