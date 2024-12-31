package com.domain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.domain.services.ProductService;
import com.domain.model.entities.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }

    @GetMapping
    public Iterable<Product> findAll() {
        return productService.findAll();
    }
}
