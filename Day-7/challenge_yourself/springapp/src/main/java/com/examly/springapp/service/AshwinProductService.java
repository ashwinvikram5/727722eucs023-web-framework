package com.examly.springapp.service;

import com.examly.springapp.model.AshwinProduct;
import com.examly.springapp.repository.AshwinProductRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class AshwinProductService {
    @Autowired
    AshwinProductRepo repo;

    @SuppressWarnings("null")
    public boolean post(AshwinProduct c) {
        try {

            repo.save(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<AshwinProduct> getAll() {
        return repo.findAll();

    }

    public List<AshwinProduct> getProduct(String age) {
        return repo.findByProductCategory(age);

    }
    public List<AshwinProduct> getProductbyprice(String age) {
        return repo.findByPriceCategory(age);

    }

}
