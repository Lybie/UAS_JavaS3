package com.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.model.entities.Product;
import com.domain.model.repos.ProductSaya;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductSaya productSaya;

    public Product create(Product product) {
        return productSaya.save(product);
    }

    public Product findOne(Long id) {
        return productSaya.findById(id).orElse(null);
    }

    public Iterable<Product> findAll() {
        return productSaya.findAll();
    }

    public void removeOne(Long id) {
        productSaya.deleteById(id);
    }

    public List<Product> findByName(String name) {
        return productSaya.findByNameContains(name);
    }
}
