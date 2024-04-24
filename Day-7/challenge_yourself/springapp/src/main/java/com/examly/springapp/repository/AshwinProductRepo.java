package com.examly.springapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.model.AshwinProduct;

@Repository
public interface AshwinProductRepo extends JpaRepository<AshwinProduct, Integer> {

    public List<AshwinProduct> findByProductCategory(String productCategory);
    public List<AshwinProduct> findByPriceCategory(String priceCategory);

}
