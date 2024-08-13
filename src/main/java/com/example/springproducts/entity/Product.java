package com.example.springproducts.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collation = "products")
public class Product {

    @Id

    private int id;
    private String name;
    private double price;
    private Integer quantity;




}
