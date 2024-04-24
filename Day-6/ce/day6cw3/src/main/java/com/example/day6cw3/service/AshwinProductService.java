package com.example.day6cw3.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.day6cw3.model.AshwinProduct;
import com.example.day6cw3.repository.AshwinProductRepo;

@Service
public class AshwinProductService {
    public AshwinProductRepo productRepo;
    public AshwinProductService(AshwinProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean postProduct(AshwinProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AshwinProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<AshwinProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public AshwinProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
