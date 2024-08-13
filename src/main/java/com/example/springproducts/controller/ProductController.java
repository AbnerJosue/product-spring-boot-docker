package com.example.springproducts.controller;


import com.example.springproducts.entity.Product;
import com.example.springproducts.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
       return productService.addProduct(product);
    }

    @PutMapping("/update-product/{id}")
    public Product updateProduct(@PathVariable int id ,@RequestBody Product product ) {
       return productService.updateProduct( id , product );
    }

    @DeleteMapping("/remove/{id}")
    public Product removeProduct(@PathVariable int id) {
        return productService.removeProduct( id );
    }


}
