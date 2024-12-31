package com.domain.model.repos;

import com.domain.model.entities.Product;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ProductSaya extends CrudRepository<Product, Long> {
    List<Product> findByNameContains(String name);
}
