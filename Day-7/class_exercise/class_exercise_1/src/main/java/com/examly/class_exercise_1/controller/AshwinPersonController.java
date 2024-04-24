package com.examly.class_exercise_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.model.AshwinPerson;
import com.examly.class_exercise_1.service.AshwinPersonService;

@RestController
public class AshwinPersonController {

     @Autowired
     public AshwinPersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<AshwinPerson> postMethodName(@RequestBody AshwinPerson entity) {

          AshwinPerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<AshwinPerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<AshwinPerson>> getMethodName() {

          List<AshwinPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<AshwinPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<AshwinPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<AshwinPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}