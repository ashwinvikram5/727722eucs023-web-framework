package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.examly.springapp.model.AshwinProduct;
import com.examly.springapp.service.AshwinProductService;

@RestController
public class AshwinProductController {
    @Autowired
    AshwinProductService service;

    @PostMapping("/api/Product")
    public ResponseEntity<AshwinProduct> postMethod(@RequestBody AshwinProduct s) {
        if (service.post(s)) {
            return new ResponseEntity<AshwinProduct>(s, HttpStatus.CREATED);
        } else {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/product")
    public ResponseEntity<List<AshwinProduct>> dndcjk() {
        List<AshwinProduct> page = service.getAll();
        if (!page.isEmpty()) {
            return new ResponseEntity<List<AshwinProduct>>(page, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/product/category/{productCategory}")
    public ResponseEntity<List<AshwinProduct>> getbyid(@PathVariable String productCategory) {
        List<AshwinProduct> p = service.getProduct(productCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<AshwinProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

    @GetMapping("/api/product/category/priceCategory/{priceCategory}")
    public ResponseEntity<List<AshwinProduct>> getbdyid(@PathVariable String priceCategory) {
        List<AshwinProduct> p = service.getProductbyprice(priceCategory);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<AshwinProduct>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

}
