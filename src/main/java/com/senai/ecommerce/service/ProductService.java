package com.senai.ecommerce.service;

import com.senai.ecommerce.dtos.ProductDTO;
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
}
