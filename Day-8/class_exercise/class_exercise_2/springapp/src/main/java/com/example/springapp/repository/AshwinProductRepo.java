package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.AshwinProduct;
import java.util.List;


@Repository
public interface AshwinProductRepo extends JpaRepository<AshwinProduct,Integer>{

    List<AshwinProduct> findByProductNameStartingWith(String name);
    List<AshwinProduct> findByProductNameEndingWith(String name);
    
}
