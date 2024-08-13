package com.example.springproducts.service;

import com.example.springproducts.entity.Product;
import java.util.List;

public interface ProductService {

    public List<Product> getProducts();

    public Product addProduct(Product product);

    public Product removeProduct(int id);

    public Product updateProduct( int id , Product product );

}
