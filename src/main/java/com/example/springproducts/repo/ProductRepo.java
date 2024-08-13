package com.example.springproducts.repo;

import com.example.springproducts.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product, Integer> {





}
