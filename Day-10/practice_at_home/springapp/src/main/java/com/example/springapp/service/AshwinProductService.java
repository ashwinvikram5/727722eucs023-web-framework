package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.AshwinProduct;
import com.example.springapp.repository.AshwinProductRepo;

@Service
public class AshwinProductService {
    @Autowired
    private AshwinProductRepo productRepo;

    public boolean saveProduct(AshwinProduct product)
    {
        try
        {
            productRepo.save(product);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
    
    public List<AshwinProduct> findByCategoryList(String category)
    {
        return productRepo.findByCategoryList(category);
    }

    public AshwinProduct updateProduct(int productId, int quantityInStock)
    {
        productRepo.updateQuantity(productId, quantityInStock);
        return productRepo.findById(productId).orElse(null);
    }

    public AshwinProduct deleteProduct(int productId)
    {
        productRepo.deleteProduct(productId);
        return productRepo.findById(productId).orElse(null);
    }
}