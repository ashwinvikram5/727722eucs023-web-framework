package com.example.relation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.model.AshwinStudentInfo;

@Repository
public interface AshwinStudentInfoRepository extends JpaRepository<AshwinStudentInfo,Integer>{
    
}