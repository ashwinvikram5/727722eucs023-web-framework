package com.example.day5cw1.service;

import org.springframework.stereotype.Service;

import com.example.day5cw1.repository.AshwinProductRepo;

@Service
public class AshwinProductService {
    public AshwinProductRepo productRepo;
    public AshwinProductService(AshwinProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(AshwinProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,AshwinProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public AshwinProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
