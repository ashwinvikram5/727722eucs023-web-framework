package com.example.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.model.AshwinStudent;
import com.example.class_exercise_2.service.AshwinStudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class AshwinStudentController {

     @Autowired
     public AshwinStudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<AshwinStudent>> getDetails() {
          List<AshwinStudent> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<AshwinStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<AshwinStudent>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<AshwinStudent> postMethodName(@RequestBody AshwinStudent student) {

          AshwinStudent postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<AshwinStudent>> sortedDetails(@PathVariable String field) {
          List<AshwinStudent> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<AshwinStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<AshwinStudent>>(list, HttpStatus.OK);

     }
}
