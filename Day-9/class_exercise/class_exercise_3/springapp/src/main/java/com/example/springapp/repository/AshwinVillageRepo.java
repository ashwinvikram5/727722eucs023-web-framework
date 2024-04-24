package com.example.springapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.springapp.model.AshwinVillage;
import java.util.List;

@Repository
public interface AshwinVillageRepo extends JpaRepository<AshwinVillage, Integer> {

    @Query("select v from Village as v where v.villageName=?1")
    AshwinVillage findByName(String villageName);

    @Query("select v from Village as v where v.villageId=?1")
    AshwinVillage findById(int id);

    @Query("select v from Village as v where v.villagePopulation=?1")
    List<AshwinVillage> findByPopulation(int population);

}
