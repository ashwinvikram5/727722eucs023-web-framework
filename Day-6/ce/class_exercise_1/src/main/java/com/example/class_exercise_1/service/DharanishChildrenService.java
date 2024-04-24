package com.example.class_exercise_1.service;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.model.DharanishChildren;
import com.example.class_exercise_1.repository.DharanishChildrenRepo;

@Service
public class DharanishChildrenService {

     @Autowired
     public DharanishChildrenRepo childrenRepo;

     public List<DharanishChildren> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public DharanishChildren save(DharanishChildren children) {
          return childrenRepo.save(children);

     }

     public List<DharanishChildren> sortedPage(int offset, int pagesize, String field) {
          Page<DharanishChildren> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<DharanishChildren> pagination(int offset, int pagesize) {
          Page<DharanishChildren> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}
