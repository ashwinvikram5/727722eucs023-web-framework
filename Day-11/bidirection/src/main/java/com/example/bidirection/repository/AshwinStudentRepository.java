package com.example.bidirection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.model.AshwinStudent;



@Repository
public interface AshwinStudentRepository extends JpaRepository<AshwinStudent,Integer>{
    
}
