package com.examly.class_exercise_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.model.AshwinPerson;
import com.examly.class_exercise_1.repository.AshwinPersonRepo;

@Service
public class AshwinPersonService {

     @Autowired
     public AshwinPersonRepo personRepo;

     public AshwinPerson SaveEntity(AshwinPerson entity) {
          return personRepo.save(entity);

     }

     public List<AshwinPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<AshwinPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}
