package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AshwinProduct;
import com.example.springapp.repository.AshwinProductRepo;

@Service
public class AshwinProductService {
    @Autowired
    private AshwinProductRepo rep;

    @SuppressWarnings("null")
    public boolean post(AshwinProduct person)
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

    public List<AshwinProduct> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<AshwinProduct> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<AshwinProduct> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}
