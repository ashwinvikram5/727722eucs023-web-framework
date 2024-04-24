package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AshwinVillage;
import com.example.springapp.repository.AshwinVillageRepo;

@Service
public class AshwinVillageService {
    @Autowired
    private AshwinVillageRepo rep;

    public boolean post(AshwinVillage person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public AshwinVillage start(String lastname)
    {
        return rep.findByName(lastname);
    }
    public AshwinVillage get3(int id)
    {
        return rep.findById(id);
    }

    public List<AshwinVillage> end(int population)
    {
        return rep.findByPopulation(population);
    }
    
}
