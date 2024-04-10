package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class StudentController {

    @GetMapping("/students")
    public Student studentdata() {
        Student u = new Student();
        u.setName("Nitin");
        u.setAge(25);
        return u;
    }
}