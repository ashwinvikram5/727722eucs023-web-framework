package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AshwinPerson;
import com.example.springapp.repository.AshwinPersonRepo;

@Service
public class AshwinPersonService {
    @Autowired
    private AshwinPersonRepo rep;

    public boolean post(AshwinPerson person)
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

    public List<AshwinPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<AshwinPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
