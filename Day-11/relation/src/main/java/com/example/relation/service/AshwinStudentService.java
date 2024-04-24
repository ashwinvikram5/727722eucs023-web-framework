package com.example.relation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.model.AshwinStudent;
import com.example.relation.repository.AshwinStudentRepository;

@Service
public class AshwinStudentService {
    public AshwinStudentRepository AshwinStudentRepository;
    public AshwinStudentService(AshwinStudentRepository AshwinStudentRepository)
    {
        this.AshwinStudentRepository = AshwinStudentRepository;
    }
    public AshwinStudent saveAshwinStudent(AshwinStudent AshwinStudent)
    {
        return AshwinStudentRepository.save(AshwinStudent);
    }
    public List<AshwinStudent> getAshwinStudents()
    {
        return AshwinStudentRepository.findAll();
    }
}
