package com.example.testmultiple.controller;

import com.example.testmultiple.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {


    @GetMapping("/product")
    public ResponseEntity<String> getAllProducts() {
        return new ResponseEntity<>("getAllProducts", HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public Long getProductById(@PathVariable Long id) {
        return id;
    }

    @PostMapping("/product")
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }

    @PutMapping("/product")
    public Product updateProduct(@RequestBody Product product) {
        return product;
    }

    @DeleteMapping("/product-delete/{id}")
    public Long deleteProduct(@PathVariable Long id) {
        return id;
    }
}
