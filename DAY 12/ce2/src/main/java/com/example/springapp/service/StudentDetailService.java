package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AshwinStudentDetail;
import com.example.springapp.repository.StudentDetailRepository;
import com.example.springapp.repository.StudentRepository;

@Service
public class StudentDetailService {
    @Autowired
    StudentDetailRepository studentDetailRepository;
    @Autowired
    StudentRepository studentRepository;
    public AshwinStudentDetail addStudentDetail(int id,AshwinStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}
