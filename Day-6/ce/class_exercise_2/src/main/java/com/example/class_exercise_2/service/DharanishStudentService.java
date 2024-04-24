package com.example.class_exercise_2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.class_exercise_2.model.DharanishStudent;
import com.example.class_exercise_2.repository.DharanishStudentrepo;

@Service
public class DharanishStudentService {

     @Autowired
     public DharanishStudentrepo studentRepo;

     public List<DharanishStudent> getAll() {
          return studentRepo.findAll();
     }

     public DharanishStudent post(DharanishStudent student) {
          return studentRepo.save(student);
     }

     public List<DharanishStudent> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}
