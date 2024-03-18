package com.example.product.controllers;

import com.example.product.models.Product;
import com.example.product.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    @GetMapping("/product")
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
}
