package com.example.day6cy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day6cy.model.AshwinEmployee;

public interface AshwinEmployeeRepo extends JpaRepository<AshwinEmployee,Integer>{
    
}
