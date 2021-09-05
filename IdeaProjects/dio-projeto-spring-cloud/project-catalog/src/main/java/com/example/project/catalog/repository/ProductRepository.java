package com.example.project.catalog.repository;

import com.example.project.catalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
