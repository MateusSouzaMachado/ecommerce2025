package com.senai.ecommerce.controller;

import com.senai.ecommerce.dtos.ProductDTO;
import com.senai.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        List<ProductDTO> list = productService.findAll();
        return ResponseEntity.ok(list);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<List<Product>> getProductById(@PathVariable Long id) {
//        Optional<Product> product = productRepository.findById(id);
//        return product.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
//    }
//
//    @PostMapping
//    public Product createProduct(@RequestBody Product product) {
//        return productRepository.save(product);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
//        return productRepository.findById(id).map(product -> {
//            product.setName(productDetails.getName());
//            product.setPrice(productDetails.getPrice());
//            product.setDescription(productDetails.getDescription());
//            product.setImaUrl(productDetails.getImaUrl());
//            product.setCategories(productDetails.getCategories());
//            Product updatedProduct = productRepository.save(product);
//            return ResponseEntity.ok(updatedProduct);
//        }).orElseGet(() -> ResponseEntity.notFound().build());
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Object> deleteProduct(@PathVariable Long id) {
//        return productRepository.findById(id).map(product -> {
//            productRepository.delete(product);
//            return ResponseEntity.noContent().build();
//        }).orElseGet(() -> ResponseEntity.notFound().build());
//    }
}