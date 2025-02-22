package com.senai.ecommerce.service;

import com.senai.ecommerce.dtos.ProductDTO;
import com.senai.ecommerce.entities.Product;
import com.senai.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    public List<ProductDTO> findAll(){
        return productRepository.findAll().stream().map(product -> new ProductDTO(product.getId(),product.getName(),product.getPrice(),product.getDescription(),product.getImaUrl())).toList();
    }

    @Transactional
    public ProductDTO create(ProductDTO productDTO){
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setDescription(productDTO.getDescription());
        product.setImaUrl(productDTO.getImaUrl());
        product = productRepository.save(product);
        return new ProductDTO(product.getId(),product.getName(),product.getPrice(),product.getDescription(),product.getImaUrl());
    }
    @Transactional
    public ProductDTO findById(Long id){
        Product product = new Product();
        product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        return new ProductDTO(product.getId(),product.getName(),product.getPrice(),product.getDescription(),product.getImaUrl());
    }

    @Transactional
    public ProductDTO update(Long id, ProductDTO productDTO){
        Product product = new Product();
        product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setDescription(productDTO.getDescription());
        product.setImaUrl(productDTO.getImaUrl());
        productRepository.save(product);
        return new ProductDTO(product.getId(),product.getName(),product.getPrice(),product.getDescription(),product.getImaUrl());
    }

    @Transactional
    public ProductDTO delete(Long id){
        Product product = new Product();
        product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
        productRepository.delete(product);
        return new ProductDTO(product.getId(),product.getName(),product.getPrice(),product.getDescription(),product.getImaUrl());
    }
}
