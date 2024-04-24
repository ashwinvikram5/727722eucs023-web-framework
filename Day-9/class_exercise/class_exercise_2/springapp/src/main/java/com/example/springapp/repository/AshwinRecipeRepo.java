package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.AshwinRecipe;
import java.util.List;


@Repository
public interface AshwinRecipeRepo extends JpaRepository<AshwinRecipe,Integer>{

    @Query("select r from Recipe r where recipeName=?1")
    List<AshwinRecipe> findByProduct(String name);
    
}
