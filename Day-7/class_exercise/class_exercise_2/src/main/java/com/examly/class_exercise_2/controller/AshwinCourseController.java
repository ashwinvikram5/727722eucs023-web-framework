package com.examly.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.model.AshwinCourseJava;
import com.examly.class_exercise_2.service.AshwinService;

@RestController
public class AshwinCourseController {

     @Autowired
     public AshwinService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<AshwinCourseJava> postMethodName(@RequestBody AshwinCourseJava entity) {

          AshwinCourseJava inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<AshwinCourseJava>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<AshwinCourseJava>> getMethodName() {

          List<AshwinCourseJava> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<AshwinCourseJava>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<AshwinCourseJava>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<AshwinCourseJava> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}