package com.example.bidirection.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.model.AshwinStudent;
import com.example.bidirection.model.AshwinStudentInfo;
import com.example.bidirection.repository.AshwinStudentInfoRepository;
import com.example.bidirection.repository.AshwinStudentRepository;

@Service
public class AshwinStudentService {
    public AshwinStudentRepository studentRepository;
    public AshwinStudentInfoRepository studentInfoRepository;
    public AshwinStudentService(AshwinStudentRepository studentRepository,AshwinStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public AshwinStudent saveStudent(AshwinStudent student)
    {
        return studentRepository.save(student);
    }
    public AshwinStudentInfo saveStudentInfo(AshwinStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<AshwinStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
